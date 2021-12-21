package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

final class Class_Name_Underscores_Not_Replaced_Test {
  @Test
  void test_number_one() throws Exception {
    System.out.println("test method number 1 start, thread name: " + Thread.currentThread().getName());
    Thread.sleep(1000);
    System.out.println("test method number 1 end, thread name: " + Thread.currentThread().getName());
    assertTrue(true);
  }

  @Test
  void test_number_two() throws Exception {
    System.out.println("test method number 2 start, thread name: " + Thread.currentThread().getName());
    Thread.sleep(1000);
    System.out.println("test method number 2 end, thread name: " + Thread.currentThread().getName());
    assertTrue(true);
  }
}
