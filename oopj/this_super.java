package oopj;
/*
class Parent {
    String name = "Parent Class";
}

class Child extends Parent {
    String name = "Child Class";

    void display() {
        System.out.println("Parent Name: " + super.name); // Access parent variable
        System.out.println("Child Name: " + this.name);  // Access child variable
    }
}

public class this_super {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
*/

class Student {
    String name;

    Student(String name) {
        this.name = name; // Resolving naming conflict
    }

    void display() {
        System.out.println("Name: " + this.name);
    }
}

public class this_super {
    public static void main(String[] args) {
        Student student = new Student("Avishank");
        student.display(); // Output: Name: Avishank
    }
}
