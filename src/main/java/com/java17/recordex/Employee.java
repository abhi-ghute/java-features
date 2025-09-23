package com.java17.recordex;

public record Employee(String name, int age, String email) {

    public Employee{
        if(age<18){
            throw new RuntimeException("Employee don't have valid age to work");
        }
    }

    public Employee(String name, int age){
        this(name,age,null);
    }

    // Instead of modifying, return a new record with updated email
    public Employee withEmail(String newEmail) {
        return new Employee(this.name, this.age, newEmail);
    }
}
