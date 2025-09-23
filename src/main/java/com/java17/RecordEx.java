package com.java17;

import com.java17.recordex.Employee;

public class RecordEx {
    public static void main(String[] args) {
        Employee emp = new Employee("Abhi",26,"abghute7@gmail.com");
        Employee emp2 = new Employee("Abhi",26,"abghute7@gmail.com");

        System.out.println("Record Employee hashcode: "+emp.hashCode());
        System.out.println("Record Employee toString: "+emp);
        System.out.println("Record Employee1 and Employee2 equals: "+emp.equals(emp2));
        System.out.println(emp.age());

        try {
            Employee emp3 = new Employee("Ram",16,"ram@gmail.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //this will calling the canonical constructor so this will also fail
//        Employee newEmp = new Employee("Om",17);

        Employee newEmp = new Employee("Om",21);
        System.out.println(newEmp.email());

        newEmp = newEmp.withEmail("om@gmail.com");
        System.out.println(newEmp.email());

    }
}
