package example.codeclan.com.composition_starter;
import behaviours.Flyable;
import behaviours.Protector;

public class Wizard {
  String name;
  Broomstick broomstick;
  private Flyable ride;
  private Protector protector;

  public Wizard(String name, Flyable ride, Protector protector){
    this.name = name;
    this.broomstick = broomstick;
    this.ride = ride;
    this.protector = protector;
  }

  public Wizard(String barry, Dragon dragon) {
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride){
    this.ride = ride;
  }

  public void setProtector(Protector protector){
    this.protector = protector;
  }

  public String protect(){
    return this.protector.protect();
  }
}