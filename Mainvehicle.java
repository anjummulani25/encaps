inal class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Mainvehicle extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Mainvehicle myFastCar = new Mainvehicle();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
