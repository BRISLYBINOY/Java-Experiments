import java.util.*;

abstract class MultipleInheritancePolymorphism1 {
protected int legs;
MultipleInheritancePolymorphism1(int legs){
	this.legs=legs;
}
void printleg() {
	System.out.println("Animal have "+legs+" legs");
}
abstract void eat();
void walks() {
	System.out.println("Animal is walking");
}
}

class Spider extends MultipleInheritancePolymorphism1{

	Spider(int legs) {
		super(legs);
		
	}
	void eat() {
		System.out.println("Spider is eating");
	}
	
	
}
interface pet{
 
 void getname1();
 void setname();

 void play();
}

class cat extends MultipleInheritancePolymorphism1 implements pet{
String name;
Scanner sc=new Scanner(System.in);
	cat(int legs) {
		super(legs);
	
	}
	public void getname1() {
		System.out.println("Enter the name of the cat");
		name=sc.next();
	}
	
	public void setname() {
		System.out.println("Name of the cat is "+name);
	}


	

	
	public void play() {
		System.out.println("cat is playing");
		
	}

	
	void eat() {
	System.out.println("cat is eating");
		
	}
	
}
class fish extends MultipleInheritancePolymorphism1 {

	fish(int legs) {
		super(legs);
		
	}

	

	
	void eat() {
		System.out.println("fish is eating");
		
	}
	void printleg(){
		System.out.println("fish dont have legs");
	}
	void walks() {
		System.out.println("fish can walk and dont have legs");
	}
	
		
}

 public class MultipleInheritancePolymorphism{
	public static void main(String[] args) {

        fish f = new fish(0);
        cat c = new cat(4);
        MultipleInheritancePolymorphism1 a = new fish(0);
        Spider e = new Spider(8);
        c.printleg();
        c.getname1();
        c.setname();
        c.play();
        c.eat();
        e.printleg();
        e.walks();
        f.printleg();
        f.eat();
        f.walks();
        
        
        
}
}

