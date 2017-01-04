import java.util.Scanner;
class SqrtWithoutFun
{
public static void main(String args[])
{
float n=0.1f;
float num;
double m;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
num=sc.nextFloat();
m=Math.pow(num,0.5);
System.out.println(m);
}
}
