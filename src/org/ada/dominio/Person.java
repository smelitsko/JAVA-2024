package org.ada.dominio;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double height;
    private char biological_sex;
    private String dob;

    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    public void decirNombreCompleto(){
        System.out.println("Mi nombre es " + name + " " + lastName);
    }
}
