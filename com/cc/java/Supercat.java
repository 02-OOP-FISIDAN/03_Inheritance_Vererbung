package com.cc.java;

public class Supercat {

    private String name;
    private String furColor;
    protected int age; //protected ist zwichen private und public und ermöglicht die Sichtbarkeit in anderen *Sub-Klassen*
   
   
    public Supercat(String name, String furColor, int age) { // Konstruktor
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }
    public String getStringAttributes(String op) {  //Methode
        switch (op) {
          case "#name":
            return name;
          case "#color":
            return furColor;
          default:
            return "ERROR!";
        }
      }
}

