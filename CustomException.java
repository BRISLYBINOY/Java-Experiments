
import java.util.*;


class Bank
{
String acc_name;
String acc_num;
long balance=0;
Scanner sc=new Scanner(System.in);

public void openaccount()
{
System.out.println("Enter the Name of the customer");
acc_name=sc.nextLine();
System.out.println("Enter the Account Number");
acc_num =sc.next();


}
public void displayaccount()
{
System.out.println("Name="+acc_name);
System.out.println("Account Number="+acc_num);
System.out.println("Balance="+balance);
}

public void deposit()
{
long amount;
System.out.println("Enter the amount");
amount=sc.nextLong();
try
{
if(amount<=0)
{
throw new InvalidAmountException("Amount less than or equal to zero");
}
else
{
balance=balance+amount;
}
}
catch(InvalidAmountException  e)
{
System.out.println(e.getMessage());
}
//balance=balance+amount;
}

public void withdrawal()
{
int amount2;
System.out.println("Enter the amount you want to withdraw");
amount2=(int) sc.nextLong();
try
{

if(amount2>balance)
{
throw new InsufficientFundsException("Insufficient Balance");
}
else
{
balance = balance - amount2;
}
}
catch(InsufficientFundsException i)
{
System.out.println(i.getMessage());
}



}
public boolean search(String ac_num )
{
if(acc_num.equals(ac_num))
{
displayaccount();
return(true);
}
return(false);

}





