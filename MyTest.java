import java.util.Scanner;
class MyTest {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

double n=sc.nextDouble();
sc.close();

double sqrt=SqrtNumber(n);

System.out.printf("%.2f",sqrt);

}

static double SqrtNumber(double num)
{
double lower_bound=0;
double upper_bound=num;
double temp=0,min_range = 0.0000001;

while((upper_bound-lower_bound)>min_range)
{
temp=(lower_bound+upper_bound)/2;
if(temp*temp==num)
{
return temp;
}
else if(temp*temp > num)

{
upper_bound = temp;
}
else
{
lower_bound = temp;
}
}
return temp;
}

}
