	class Employee {
		String name;
		int age;
		String phoneNumber;
		String address;
		double salary;
		Employee(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		}
		void printSalary() {
		System.out.println("Salary is " +salary);
		}
		}
		class Officer extends Employee {
		String specialization;
		Officer(String name, int age, String phoneNumber,
		String address, double salary, String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		}
		}
		class Manager extends Employee{
		String department;
		public Manager(String name, int age, String phoneNumber,
		String address, double salary, String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
		}
		}
		public class Heriarchicalinheritance {
		public static void main(String[] args) {
		Officer officer = new Officer("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
		Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
		officer.printSalary();
		manager.printSalary();
		}

}
