//A class is a blueprint for an object
//this public class is a name of the file
//public is an access modifier
//class is a keyword
//Basic01 is the name of the class
//{} is the body of the class
//public static void main(String[] args) is the main method
//public is an access modifier
//static is a keyword
//void is a keyword
//main is the name of the method
//String[] args is a parameter
//System.out.println("Hello World"); is a statement
//System is a class
//out is a static field
//Java is case sensitive



public class Basic01 {
    public static void main(String[] args) {
      String newS = addExclamationMark("hello");
      System.out.println(newS);
  }

 public static String addExclamationMark(String s){
    return s + "!";
 }
}