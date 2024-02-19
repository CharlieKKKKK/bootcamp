package com.vtxlab.bootcamp.lombooks;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
public class Cat {


  @Getter
  @Setter
  @EqualsAndHashCode.Exclude
  private double weight;

  @Getter
  private String name;

  @Getter
  private int age;


  public static void main(String[] args) {
    Cat cat = new Cat(3.2, "ABC" , 6);
    System.out.println(cat.getWeight() + " " + cat.getName());
    cat.setWeight(3.9);

    
  }

}
