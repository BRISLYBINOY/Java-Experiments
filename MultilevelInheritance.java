class Employee{
	String name;
	int age;
	String address;
	long phonenumber;
	double salary;
	
	
Employee(String name, int age, long phonenumber, String address, double salary)
{
	this.name = name;
	this.age = age;
	this.phonenumber = phonenumber;
	this.address = address;
	this.salary = salary;
}
 void printsalary()
{
	 System.out.println("Name of the manager:" +name);
	 System.out.println("Age of the manager:" +age);
	 System.out.println("Phone Number of the manager:" +phonenumber);
	 System.out.println("Address of the manager:" +address);
	 System.out.println("Salary of the manager:" +salary);
}
}
	

class Officer extends Employee{
	
	
    
	Officer(String name, int age, long phonenumber, String address, double salary) {
		super( name, age, phonenumber, address,  salary);
		
	}
	
	
}


class Manager extends Employee{
   Manager( String name, int age,long phonenumber, String address, double salary)
	{
    	super( name, age, phonenumber, address,  salary);
		
		
	}
   void printsalary()
   {
   	 System.out.println("Name of the officer:" +name);
   	 System.out.println("Age of the officer:" +age);
   	 System.out.println("Phone Number of the officer:" +phonenumber);
   	 System.out.println("Address of the officer:" +address);
   	 System.out.println("Salary of the officer :" +salary);
   }
	
}
 
public class MultilevelInheritance{
	
	public static void main(String[] args) {
		Officer off = new Officer("Brisly",20,1222222,"Kottayam",200000);
		Manager man = new Manager("Jerald",20,7673737,"Ernakulam",700000);
        off.printsalary();
        man.printsalary();
	}
}


	

