import java.util.*;

class assign11{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter r");
double r=sc.nextDouble();
double pi=3.14159265358979323846;
double area=pi*r*r;

System.out.println("Area of circle is = "+ area);

double peri=2.0*pi*r;
System.out.println("Perimeter of circle is = "+ peri);
}

}