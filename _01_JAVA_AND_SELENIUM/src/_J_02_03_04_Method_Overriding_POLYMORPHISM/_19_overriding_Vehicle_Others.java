package _J_02_03_04_Method_Overriding_POLYMORPHISM;

class Vehicle{
  void run(){System.out.println("Vehicle is running");}
  }
  class Bike extends Vehicle{
  
  public static void main(String args[]){
  Bike obj = new Bike();
  obj.run();
  }
}
