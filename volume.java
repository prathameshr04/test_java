class constructor_overloding
{
 double width,height,depth,vol; 
 constructor_overloding()
{
  width=height=depth=0;
}
constructor_overloding(double a)
{
  width=height=depth=a;
}
constructor_overloding(double w,double h,double d)
{
 width=w;
 height=h;
 depth=d;
}
void volume()
{
 vol=height*depth*width;
 System.out.println("volume of cubiod is :" +vol);
}
public static void main(String args[])
{
 constructor_overloding r1 = new constructor_overloding();
 constructor_overloding r2 = new constructor_overloding(3);
 constructor_overloding r3 = new constructor_overloding(5,6,7);
 r1.volume();
 r2.volume();
 r3.volume();
}
}