//Java Quickstart
// This is commet in java 
/*
This is Multi-line Comments 
*/
public class Main {
  public static void main(String[] args) {
   
    System.out.println("I love Coding"); //print messeges
    System.out.println(3);  // print nums 
    System.out.println(2 * 5); //print mathematical calculations

 //============================================================================================

 // Java Variables
    string   //  - stores text, such as "Hello". String values are surrounded by double quotes
    int     // - stores integers (whole numbers), without decimals, such as 123 or -123
    float    // - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char    // - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean  // - stores values with two states: true or false 
 //============================================================================================
  // Print Variables
   int x = 5;
   int y = 6;
      System.out.println(x + y); // Print the value of x + y
  //Java Casting
  int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
 //============================================================================================

 //Java Operators
 
 //   +   Addition		
 //   -   Subtraction		
 //   *   Multiplication		
 //   /	  Division		
 //   %	  Modulus		
 //  ++	  Increment		
 //  --	  Decrement
 //============================================================================================
 //Logical Operators 	 
 // &&    and  	
 // ||     or   		
 // !      not  	
 //============================================================================================
 
 // Java Statment and Flow control
 
 // (if ,else ,else if)
 
 if () { //in pracits set condition
  // block of code to be executed if the condition is true
} else if () { // set condition 2
// block of code to be executed if the condition1 is false and condition2 is true
}else {
  // block of code to be executed if the condition is false
}

// Short Hand If...Else
  variable = (condition) ? expressionTrue :  expressionFalse;

 //switch
 switch() { //set expression
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
  }

//============================================================================================

// java loops

//Java While Loop
while (condition) {
  // code block to be executed
}

// The Do-While Loop
do {
  // code block to be executed
}
while (condition);

//for loop 
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

// For-Each Loop
for (type variableName : arrayName) {
  // code block to be executed
}

//============================================================================================

//Java Array

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};



}   
}
