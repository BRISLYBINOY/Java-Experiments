
class Area
{
void area(int X)
{
System.out.println("the area of the square is :"+X*X+"sq units");
}
void area(int l,int b)
{
System.out.println("the area of the rectangle is : "+l*b+"sq units");
}
void area(double r)
{
double z=3.14*r*r;
System.out.println("the area of the circle is: "+z+"sq units");
}
}
public class MethodOverloading {
public static void main(String[] args) {
Area ar=new Area();
ar.area(7);
ar.area(10,70);
ar.area(7.5);
}
}
