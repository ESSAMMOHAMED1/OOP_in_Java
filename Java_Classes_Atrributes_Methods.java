//To create a class, use the keyword class:

public class Num {
  int x = 5;
}


public class Method {
  static void Method() {
    System.out.println("Hello World!");
  }
//we created a static method, which means that it can be accessed without creating an object of the class,
//unlike public, which can only be accessed by objects

public class Main {
  public static void main(String[] args) {
     Num myObj = new Num(); //Creat a new Object
     System.out.println(NUM.x); // Access Data In Object
     // You can modify Data 
     Num.x = 40;
    System.out.println(Num.x);
  }
}