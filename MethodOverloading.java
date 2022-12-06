class Area
    {
    	void area(int a)
    	{
    		System.out.println("The area of the square is " +a*a+ "sq units");
        }
    	
    	void area(int b, int c)
    	{
    		System.out.println("The area of the rectangle is " +b*c+ "sq units");
        }
    	

    	void area1(double r)
    	{
    		double d = 3.14*r*r;
    		System.out.println("The area of the circle is " +3.14*r*r+ "sq units");
        }
    	
}
    
    public class MethodOverloading{
    	public static void main(String[] args) {
    		Area obj = new Area();
    		obj.area(7);
    		obj.area(10,70);
    		obj.area1(7);
    	}
    }
