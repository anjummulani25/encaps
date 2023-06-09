
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
  public void study() {
    System.out.println("Studying all day long");
  }
}
​