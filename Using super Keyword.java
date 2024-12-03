class Box {
  double width;
  double height;
  double depth;
  Box()
  {
    height=width=depth=5;
  }
  Box(double height, double width,double depth)
  {
    this.height=height;
    this.width=width;
    this.depth=depth;
  }
  void volume()
  {
    double vol=height*width*depth;
    System.out.println("the volume is:"+vol);
  }

}

class BoxWeight extends Box {
  double weight; // weight of the box

  // Constructor when all parameters are specified
  BoxWeight(double w, double h, double d, double we) {
      super(w, h, d); // Call superclass constructor to initialize width, height, and depth
      weight = we;
  }
  void display()
  {
    System.out.println("the weight is is:"+we);
  }

}

public class DemoSuper {
  public static void main(String[] args) {
      BoxWeight b1 = new BoxWeight(10, 20, 15, 34.3);
      b1.volume();
      b1.show();

      // Other instances of BoxWeight

      // Display volume and weight for various boxes
  }
}
