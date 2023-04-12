package oop;

class Circle{
    // The radius of this circle
        double radius = 1;
     
    // Return the area of this circle 
        double getArea(){
            return radius * radius * Math.PI;
            
        }
    // Return the parameter of this circle
        double getPerimeter(){
            return 2* radius * Math.PI;
        }
    // Set new radius for this circle 
        void setRadius(double newRadius){
            radius = newRadius;
        }
    }
    
    public class TestSimpleCircle {
        // Main method
        public static void main(String[] args) {
            
            // Create 
            Circle circle1 = new Circle ();
            circle1.setRadius(1);
            System.out.println("the are of the circle");
        }
    }
