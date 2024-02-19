package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.vtxlab.bootcamp.unittest.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)

public class Calculator2Test {
  private int value;

  @BeforeAll
  void beforeAll() {
    this.value = 10000;
    System.out.println("PER_CLASS, BeforeAll this.value = " + this.value);
  }

  @Test
  @Order(2)
  void testSubstract() {
    System.out.println("PER_CLASS, BeforeAll   @Order(2)" + //
        " = " + this.value);

    this.value = Calculator.substract(this.value, 10);
    assertEquals(-5, this.value);
  }

  @Test
  @Order(1)
  void testAdd() {
    System.out.println("PER_CLASS, BeforeAll   @Order(1)" + //
        " = " + this.value);

    this.value = Calculator.add(2, 3);
    assertEquals(5, this.value);
  }

  public static void main(String[] args) {
    Calculator2Test calculator2 = new Calculator2Test();
    calculator2.testAdd();
    calculator2.testSubstract();

  }

}
