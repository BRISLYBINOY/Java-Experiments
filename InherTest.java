class Box
{	int x,y,z;
	/*void getData(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}*/
	Box(int x,int y,int z)
	{	
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void display()
	{
		System.out.println("Parent");
	}
}
class Rectangle10 extends Box
{
	Rectangle10(int x,int y,int z)
	{
		super(x,y,z);
	}
	void area()
	{   super.display();
		System.out.println(x*y*z);
	}
}
public class InherTest {
	public static void main(String args[])
	{
		Rectangle10  rec =new Rectangle10(10,20,30);
		//rec.getData(10,20,30);
		rec.area();
	}
	
}
