package k14dcpm02.oo.buoi8;

import k14dcpm02.oo.buoi8.testprotected.Person;

public class Employee extends Person {
    double salary = 10_000_000;

    @Override
    public String toString() {

        String str = "Name: "+ this.name + " Birthday: "+this.birthday +" Salary: "+this.salary;

        return str;
    }
}