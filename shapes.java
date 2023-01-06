import java.util.*;
abstract class Shape
{
int a,b;
Scanner sc=new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends Shape
{
void printArea()
{
System.out.println("Area of Rectangle");
System.out.println("Enter length and breadth");
a=sc.nextInt();
b=sc.nextInt();
double area=a*b;
System.out.println("Area of Rectangle="+" "+area);
}
}
class Triangle extends Shape
{
void printArea()
{
System.out.println("Area of Triangle");
System.out.println("Enter Base and Height");
a=sc.nextInt();
b=sc.nextInt();
double area=(a*b)/2;
System.out.println("Area of Triangle="+" "+area);
}

}
class Circle extends Shape
{
void printArea()
{
System.out.println("Area of Circle");
System.out.println("Enter Radius");
a=sc.nextInt();
double area=3.14*a*a;
System.out.println("Area of Circle="+" "+area);
}
}
public class AbstractShapes
{
public static void main(String args[])
{
Rectangle rec=new Rectangle();
rec.printArea();
Triangle tri=new Triangle();
tri.printArea();
Circle cir=new Circle();
cir.printArea();
}
}