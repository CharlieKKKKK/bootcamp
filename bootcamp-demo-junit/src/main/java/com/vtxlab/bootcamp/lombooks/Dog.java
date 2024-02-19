package com.vtxlab.bootcamp.lombooks;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class Dog {
  
  private final String firstName = "Join";

  @NonNull
  private String lastName;

//  @NonNull
//  private String colur;


  public static void main(String[] args) {
    Dog dog = new Dog("Chan");
    System.out.println(dog);//  Dog(firstName=Join, lastName=Chan)

    Dog dog2 = new Dog(null);
    System.out.println(dog2);// java.lang.NullPointerException
  }
}
