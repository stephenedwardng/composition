package example.codeclan.com.composition_starter;

import org.junit.Before;
import org.junit.Test;

import behaviours.Protector;

import static org.junit.Assert.assertEquals;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick, dragon);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard("Barry", dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet(){
    MagicCarpet magicCarpet = new MagicCarpet("GoldenRod");
    wizard = new Wizard("Barry", magicCarpet);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Norbet");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canSetProtector(){
    Dragon dragon = new Dragon("Puff");
    wizard.setProtector((Protector) dragon);
    assertEquals("Beat it", wizard.protect());
  }
}