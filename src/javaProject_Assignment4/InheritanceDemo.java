/*Write a program in java to show the difference between is-a relationship and has-a relationship and also show which
one is better.*/

package javaProject_Assignment4; //Package Declaration is mandatory

//Base class
class Car
{
	//Declare variables
	 private String color;
	 private int maxSpeed;
	 
	 //Methods - to show IS-A relationship
	 // Car's color is .. and speed is..
	    public void CarInfo()
	    {
	        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
	    }
	    public void setColor(String color)
	    {
	        this.color = color;
	    }
	    public void setMaxSpeed(int maxSpeed)
	    {
	        this.maxSpeed = maxSpeed;
	    }	
}

//Derived class --using Engine class's method and all methods of base class
 class Swift extends Car
{
	 //Method
    public void SwiftStart()
    {
    	//Creating obj of Engine class
        Engine Eng = new Engine();
        Eng.stop();
    }
}

 //Class- to show HAS-A relationship via composition.
 //Swift class HAS-A Engine.
 class Engine
{
    public void start()
    {
        System.out.println("Started:");
    }
    public void stop()
    {
        System.out.println("Stopped:");
    }
}
 
 //InheritanceDemo class is making object of Swift class and initialized it.
 /*Though Swift class does not have setColor(), setMaxSpeed() and carInfo()
 methods still we can use it due to IS-A relationship of Swift class with Car class.*/
 public class InheritanceDemo {
		
//Main method started
		public static void main(String[] args) {
			//object creation of derived classes
			Swift mySwift = new Swift();
			//Call all properties of Maruti car
			mySwift.setColor("Blue");
			mySwift.setMaxSpeed(160);
			mySwift.CarInfo();
			mySwift.SwiftStart();

		}

	}
