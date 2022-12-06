import java.io.*;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args)throws IOException {
FileOutputStream fin;
int n,i;
Scanner sc=new Scanner(System.in);
try{
fin= new FileOutputStream("numbers.txt");
System.out.println("enter the number of inputs");
n=sc.nextInt();
int a[]=new int[n+1];
System.out.println("enter the numbers");
for (i=0;i<n;i++){
a[i]=sc.nextInt();
}
for (i=0;i<n;i++){
fin.write(a[i]);
}
fin.close();
}
catch(FileNotFoundException e){
System.out.println("File not found");
return;
};
try {
FileInputStream fi = new FileInputStream("numbers.txt");
FileOutputStream odd = new FileOutputStream("Odd.txt");
FileOutputStream eve = new FileOutputStream("Even.txt");
while((i=fi.read())!=-1){
if(i%2==0){
eve.write(i);
}
else {
odd.write(i);
}}
fi.close();
odd.close();
eve.close();
}

catch (Exception e){
System.out.println("File Not Found");
}
try {
System.out.println("Numbers in Odd text file...\n");
FileInputStream odd = new FileInputStream("Odd.txt");
while((i=odd.read())!=-1){
System.out.println(i);
}
odd.close();
}
catch (Exception e){
System.out.println("File Not Found");
}
try {
System.out.println("Numbers in Even text file...\n");
FileInputStream eve = new FileInputStream("Even.txt");
while((i=eve.read())!=-1){
System.out.println(i);
}
eve.close();
}
catch (Exception e){
System.out.println("File Not Found");
}}}
