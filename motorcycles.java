// base class
class MotorCycle{
  // the motocycle has tree fields Color gear and int speed* the MotorCycle
  public int gear;
  public int speed;
  // the MotorCycle has one constructor
  public MotorCycle(int gear, int speed, String color )
  {
    this.gear = gear;
    this.speed = speed;
    this.color = color;
  }
  // the MotorCycle class has two methods
  public void applyBrake(int decrement)
  {
    speed -= decrement;
  }
  public void speedUp(int increment)
  {
    speed += increment;
  }
  //printing information on the Motorcycle using the method toString
  public String toString(){
    return ("No of gears are " + gear + "\n" + "speed of MountainMotorcycle is " + speed);
  }
}
// derived class create a MotorCycle derived/subclass class *MountainMotorcycle.
class MountainMotorcycle extends MotorCycle{
  // the MountainMotorcycle subclass adds one more field,

  public int seatHeight;
  // the MountainMotorcycle subclass has one constructor
  public MountainMotorcycle(int gear, int speed,int startHeight){
    // invoking base-class(Bicycle) constructor
    super(gear, speed);
    seatHeight = startHeight;
  }
  // the MountainMotorcycle subclass adds one more method to set the value of field seatHeight
  public void setHeight(int newValue){
    seatHeight = newValue;
  }
  // overriding toString() method of MountainMotorcycle to print more info
  public String toString(){
    return (super.toString() + "\nseat height is " + seatHeight);
  }
}
// creating the test class
public class Test{
  public static void main(String args[]){
    MountainMotorcycle mm = new MountainMotorcycle(0, 20, 30);
    System.out.println(mm.toString());
  }
}
