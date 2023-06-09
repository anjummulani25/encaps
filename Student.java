
abstract class Main12 {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
  public abstract void study(); 
}
​

class Student extends Main12 {
  public int graduationYear = 2018;
  public void study()
 {
    System.out.println("Studying all day long");
  }
}
​class Second1 {
  public static void main(String[] args) {
     
    Student myObj = new Student(); 
    
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); 
  }
}
