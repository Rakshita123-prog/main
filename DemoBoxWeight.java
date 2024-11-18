// Define a superclass called Box
class Box {
  double width;
  double height;
  double depth;

  // Constructor for a box with dimensions
  Box(double w, double h, double d) {
      width = w;
      height = h;
      depth = d;
  }

  // Calculate and return the volume of the box
  double volume() {
      return width * height * depth;
  }
}

// Extend the Box class to create a subclass called BoxWeight
class BoxWeight extends Box {
  double weight; // weight of the box

  // Constructor for a box with dimensions and weight
  BoxWeight(double w, double h, double d, double m) {
      super(w, h, d); // Call the superclass constructor
      weight = m;
  }
}

public class DemoBoxWeight {
  public static void main(String[] args) {
      // Create instances of BoxWeight
      BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
      BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

      // Calculate and display the volume and weight for myBox1
      double vol1 = myBox1.volume();
      System.out.println("Volume of myBox1 is " + vol1);
      System.out.println("Weight of myBox1 is " + myBox1.weight);

      System.out.println();

      // Calculate and display the volume and weight for myBox2
      double vol2 = myBox2.volume();
      System.out.println("Volume of myBox2 is " + vol2);
      System.out.println("Weight of myBox2 is " + myBox2.weight);
  }
}
