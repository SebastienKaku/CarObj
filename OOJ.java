public class OOJ {
   public static void main(String[] args) {
      // Create a new Car object
      Car car = new Car();

      // Simulate driving actions
      car.accelerate();  // Press the pedal to accelerate
      car.accelerate();
      car.turnLeft();    // Turn left
      Car.tick();        // Print car's status
      Car.tick();
      Car.brake();       // Apply brakes
      Car.tick();
      car.reverse();     // Shift to reverse gear
      Car.tick();
      Car.tick();
   }
}

class Car {
   static double distance = 0;
   static double speed = 1;
   static double angle = 0;
   static double acceleration = 1.2;

   // Accelerate the car
   public static void accelerate() {
      if (speed < 1) {
         speed = 1;
         acceleration = 1.2;
      }
      acceleration += 0.3;
      speed *= acceleration;
   }

   // Shift to reverse gear and accelerate
   public static void reverse() {
      if (speed >= 1) {
         speed = -1;
         acceleration = 1.2;
      }
      acceleration += 0.3;
      speed *= acceleration;
   }

   // Apply brakes
   public static void brake() {
      acceleration = 1.2;
      speed = 1;
   }

   // Calculate and print the car's status
   public static void tick() {
      distance += speed;
      System.out.println("Speed: " + speed + " mph, Distance Traveled: " + distance + " miles, Turning Angle: " + angle + " degrees");
   }

   // Turn the car left
   public static void turnLeft() {
      angle -= 15;
      if (angle < -360) {
         angle += 360;
      }
   }

   // Turn the car right (not currently used in the main program)
   public static void turnRight() {
      angle += 15;
      if (angle > 360) {
         angle -= 360;
      }
   }
}
