import java.util.Scanner;
class Employee
{
int n=2;
int m;
String goodies={"ipods","fitbit","miband","cultpass","macbook pro","digital camera","alexa","sandwitch toaster","scale","microwave oven"};
int price={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
}
class main
{
public static void main(String args[])
{

};
Scanner sc=new Scanner(System.in);
System.out.println("enter number of employees");
int k = sc.nextInt();
Emloyee emp[]=new Employee[k];
for( int i =0;i<k;i++)
{

    emp[i]=new Employee();
    System.out.println("prices and goodies");
    emp[i].price=sc.nextInt();
    emp[i].goodies=sc.nextString();

}
System.out.println("number of employees having high value price")
for(int i=0; i<k;i++
{
    System.out.println("the difference between goodie with highest price and lowest prie");
    if(price<5000)
        System.out.println("lowest price goodies are:",goodie,price);
        else
        if(price >5000&&price<3,00,000)
        System.out.println("hoghest price goodies are",goodie,price);
}
}
}
