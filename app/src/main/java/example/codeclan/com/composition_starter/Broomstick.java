package example.codeclan.com.composition_starter;
import behaviours.Flyable;

public class Broomstick extends CleaningImplement implements Flyable {

  int speed;

  public Broomstick(String brand, int speed){
    super(brand);
    this.speed = speed;
  }

  public int getSpeed(){
    return this.speed;
  }

  public String fly(){
    return "mounting broom, running, skipping, flying!";
  }
}