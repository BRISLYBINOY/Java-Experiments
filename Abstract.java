abstract class Shape
 {
	abstract void
	numberofsides();
 }
  class Rectangle1 extends Shape
  {
	  void numberofsides()
	  {
		  System.out.println("Number of sides of rectangle is 4");
	  }
  }
  class Triangle extends Shape
  {
	  void numberofsides()
	  {	
		  System.out.println("Number of sides of triangle is 3");
	  }
  }
  class Hexagon extends Shape
  {
	  void numberofsides()
	  {
		  System.out.println("Number of sides of hexagon is 6");
	  }
  }
  class Sides
  	{
	  public static void main(String [] args)
	  {	
		  Shape s;
		  s=new Rectangle1();
		  s.numberofsides();
		  s=new Triangle();
		  s.numberofsides();
		  s=new Hexagon();
		  s.numberofsides();
	  }
  	}

