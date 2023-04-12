package oop.Car;

public class Car {
// attribute declarations  

   private String color;
   private int speed;
   private int power;
    
    // constructor
    public Car(String color, int speed, int power){
        this.color = color;
        this.speed = speed;
        this.power = power;

        
    }

// method declarations
    public void drive() {
        System.out.println("drive");
    }

    public void turnRight() {
        System.out.println("turnRight");
    }

    public void turnLeft() {
        System.out.println("turnLeft");
    }

    public void stop() {
        System.out.println("stop");
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }
}



    