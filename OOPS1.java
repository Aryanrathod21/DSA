class Student {

    String name;
    int age;

    public void printDetails(){
        System.out.println("Person name is : "+this.name);
        System.out.println("Person age is : "+this.age);
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }


}

public class OOPS1 {
    public static void main(String[] args) {
        Student s1 = new Student("Aryan",20);
        s1.printDetails();
    }
}


//fuction overloading = compile time polymorphism
//funtion overridding = run time polymorphism (inheritance)