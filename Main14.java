public class Main14 {
  
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  
  public static void main(String[ ] args) {
    myStaticMethod(); 
    // myPublicMethod(); This would output an error

    Main14 myObj = new Main14(); 
    myObj.myPublicMethod(); 
  }
}