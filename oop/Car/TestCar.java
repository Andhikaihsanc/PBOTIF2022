package oop.Car;


public class TestCar {

    public static void main(String[] args) {
        // car 1
        Car car1 = new Car("Merah", 1000, 150);
//       car1.color = "Merah";
//       car1.power = 1000;
//       car1.speed = 150;
       car1.drive();
//       System.out.println("Warna " + car1.setcolor);
//       System.out.println("Power " + car1.power);
//       System.out.println("Speed " + car1.speed);
       
        Car car2 = new Car("Kuning", 1500, 100);
        car2.setColor("merah");
        car2.setPower(1200); 
        car2.setSpeed(120);
        car2.drive();
        
        System.out.println("Warna" + car2.getColor());
        System.out.println("Power" + car2.getPower());
        System.out.println("Speed" + car2.getSpeed());
        
//        Car car3 = new Car("Tosca", 1200, 120);
////        car3.color = "Tosca";
////        car3.power = 1200;
////        car3.speed = 120;
//        car3.drive();
//        System.out.println("Warna" + car3.color);
//        System.out.println("Power" + car3.power);
//        System.out.println("Speed" + car3.speed);
    }
}
