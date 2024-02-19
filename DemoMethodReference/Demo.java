package DemoMethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo implements Comparable<String>{
    @Override
  public int compareTo(String o) {

  }
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>(List.of("DEF", "IJK4", "ABCDE"));
    // 1.Instance Method
    // length()
    List<Integer> strLengths = strings.stream()//
        .map(e -> e.length())//
        .collect(Collectors.toList());
    // Method reference
    strLengths = strings.stream()//
        .map(String::length)//
        .collect(Collectors.toList());
    //

    //
    // 2. Static Method
    strings.stream()//
        .forEach(e -> System.out.println(e));
    // Method reference : alt
    // 同上面差唔多意思，有D似簡寫，但必定係 input 一個e 用番一個e ，冇辦法"ABC"，有限制
    strings.stream()//
        .forEach(System.out::println);
    //

    //
    // 3.Comparator
    List<String> sortStrings = strings.stream()//
        .sorted((s1, s2) -> s2.compareTo(s1))//S1= "DEF", "IJK4", "ABCDE"
        .collect(Collectors.toList());
    System.out.println(sortStrings);
    //
    // Method reference
    sortStrings = strings.stream()//
        .sorted(String::compareTo)//
        .collect(Collectors.toList());
    //
    System.out.println(sortStrings);
    //
  }


}
