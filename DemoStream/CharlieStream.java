package DemoStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharlieStream {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
        List<String> result = new ArrayList<>();
        // filter out string with length <= 5,
        for (String s : strings) {
            if (s.length() > 5) {
                result.add(s);
            }
        }
        System.out.println(result);

        // stream()
        // list object can invoke stream() method
        List<String> result2 = strings.stream() // similar to for loop
                .filter(s -> s.length() > 5)// Predicate:"s->s.length() >5"
                .collect(Collectors.toList());// 個s可以改任何名(X,Hi..),反正就係代表string(右手邊果個obj)
        System.out.println(result2);

        List<Cat> cats = new ArrayList<>(List.of(new Cat("ABC", 2), new Cat("DEF", 3), new Cat("IJK", 1)));

        // steam(),name startsWith "D" && age < 2
        // Filter Cat, and return List<Cat>
        List<Cat> result3 = cats.stream()
                .filter(a -> a.getName().startsWith("I") && a.getAge() < 2)
                .collect(Collectors.toList());

        System.out.println(result3);

        // Filter Cat, and return List<String>
        List<String> catName = cats.stream()
                .filter(a -> a.getName().startsWith("I") && a.getAge() < 2)
                .map(a -> a.getName())
                .collect(Collectors.toList());

        System.out.println(catName);

        List<Dog> dogs = cats.stream()
                .map(a -> {
                    return new Dog(a.getAge());
                }).collect(Collectors.toList());

        System.out.println(dogs);

        // forloop 例子
        List<Dog> dog2 = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getAge() < 3)
                dog2.add(new Dog(cat.getAge()));
        }
        System.out.println(dog2);

        List<Staff> staffs = new ArrayList<>(
                List.of(new Staff("John", 20000.0d), new Staff("John", 15000.0d)));

        double sum = 0.0d;
        for (Staff staff : staffs) {
            sum += staff.getSalary();
        }
        System.out.println(sum);

        double max = -1;
        for (Staff staff : staffs) {
            if (staff.getSalary() > max)
                max = staff.getSalary();
        }
        System.out.println("max salary=" + max);

        // stream
        List<Double> total = staffs.stream() //
                .map(e -> e.getSalary()) //
                .collect(Collectors.toList()); // terminate operation

        double sumOfSalary = staffs.stream() //
                .map(e -> e.getSalary()) //
                .mapToDouble(d -> d) // intermediate operation
                .sum(); // terminate opereation
        System.out.println(sumOfSalary);

        long countOfStaff = staffs.stream() //
                .map(e -> { // intermediate operation
                    System.out.println("hello");
                    return e;
                }).count(); // terminate opereation

        System.out.println("count=" + countOfStaff);

        // toSet()
        List<Cat> cats2 = new ArrayList<>(
                List.of(new Cat("DEF", 3), new Cat("DEF", 3), new Cat("IJK", 1)));
        Set<Cat> result4 = cats2.stream() //
                .collect(Collectors.toSet());

        System.out.println(result4); // [Cat(name=DEF, age=3), Cat(name=IJK, age=1)]

        // distinct -> remove duplicated elements
        List<Cat> result5 = cats2.stream() //
                .distinct() //
                .filter(e -> e.getAge() >= 3) //
                .collect(Collectors.toList());

        System.out.println(result5); // [Cat(name=DEF, age=3)]

        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.addAddress("Sample Address Line 1", "Sample Address Line 2");
        customer1.addAddress("ABCD EFG", "XYZ IJK");

        Customer customer2 = new Customer();
        customer2.addAddress("123456", "78910");

        customers.add(customer1);
        customers.add(customer2);

        List<Customer.Address> addresses = customers.stream()
                .flatMap(c -> c.getAddresses().stream())
                .collect(Collectors.toList());

        System.out.println(addresses);

        // List<list<Integer>>
        List<List<Integer>> integersList = new ArrayList<>(List.of(new ArrayList<>(List.of(1, 3, 5)),
                new ArrayList<>(List.of(2, 4, 6))));

        // List<Integer>
        List<Integer> integers = integersList.stream()
                .flatMap(e -> e.stream())
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());

        System.out.println(integers);

        // List<String>
        List<Cat> catList = new ArrayList<>(List.of(new Cat("Jenny", 10),
                new Cat("Karis", 8), new Cat("Andy", 14)));

        // Return a list of cat names, with age > 9, order by the age of cats
        List<String> catNames2 = catList.stream()
                .filter(e -> e.getAge() > 9)
                .map(e -> e.getName())
                .sorted((i3, i4) -> i4.compareTo(i3))
                .collect(Collectors.toList());

        System.out.println(catNames2);

        boolean hasKaris = catList.stream()
                .anyMatch(e -> "Karis".equals(e.getName()));

        Map<Boolean, List<Cat>> catMap = catList.stream()
                .collect(Collectors.partitioningBy(cat -> cat.getAge() >= 10));

        System.out.println(catMap);

    // for-each
    int x = 100;
    for (Cat cat : cats) {
      System.out.println(x);
      x = 10;
    }

    int m = 0;
    cats.stream() //
        .forEach(e -> {
          System.out.println(e.getAge());
          // System.out.println(x); // error, No read operation on the variable outside the stream.
          // x = 10; // error, NO write operation on the variable outside the stream.
        });

    // sum up all cats' age
    sum = cats.stream() //
        .mapToInt(e -> e.getAge()) //
        .sum();
    System.out.println(sum);

    Stream<Cat> sc = Stream.of(new Cat("ABC", 9), new Cat("IJK", 10));
    List<Cat> reuslt11 =
        sc.filter(e -> e.getAge() >= 10).collect(Collectors.toList());


    Cat cat = null;
    Stream<Cat> sc2 = Stream.ofNullable(cat); // new ArrayList<>().stream()
    sc2.forEach(e -> {
      System.out.println("hello");
    });

    // Stream<Cat> sc4 = Stream.of(null);
    // error, you cannot pass null value into Stream.of() directly

    Stream<Cat> sc3 = Stream.empty(); // similar to Stream.ofNullable(null);

    // generate, iternate
    }
}
