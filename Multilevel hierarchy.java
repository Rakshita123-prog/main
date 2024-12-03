class Box
{
  double height;
  double width;
  double depth;
  box()
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
class Boxweight extends Box{
  double weight;
  Boxweight(double h, double w, double d, double we)
  {
    super(h,w,d);
    weight=we;
  }
  void display()
  {
    System.out.println("the weight is is:"+we);
  }
  Boxweight(Boxweight.ob)
  {
    ob.height=height;
    ob.width=width;
    ob.depth=depth;
    ob.weight=weight;
  }
}
class Shipment extends Boxweight{
  double cost;
  Shipment(double h, double w, double d, double we,double c)
  {
    super(h,w,d,we);
    cost=c;
  }
  void displayc()
  {
    System.out.println("the Shipment is:"+c);
  }
}
class ShipmentDemo
{
  public static void main(String[] args)
  {
    Shipment s1 = new Shipment(10,20,30,40,67);
    s1.volume();
    s1.display();
    s1.displayc();
  }
}