package com.cc.java;

public class Tomcat extends Supercat{

  public Tomcat(String name, String furColor, int age, boolean b) {
    super(name, furColor, age);
  }

 

  public String getAge() {
    return String.valueOf(age);
  }
}