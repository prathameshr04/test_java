class A
{
 private double price;
 private String name;
  A(double p, String n)
{
  System.out.println("before invoking copy constructor");
  price=p;
  name=n;
 }
A(A ref)
{
 System.out.println("after invoking copy constructor");
 price= ref.price;
 name=ref.name;
}
void display()
{
System.out.println("Name="+name+"Price="+price);
}

public static void main(String args[])
{
 A r=new A(1000,"Mangoes");
 r.display();
 A r1= new A(r);
 r1.display();
}
}