class overloading
{
 static int add(int a,int b)
{
  return a+b;
}
 static int add(int x,int y,int z)
{
  return x+y+z;
}
public static void main(String args[])
{
System.out.println(overloading.add(50,50));
System.out.println(overloading.add(50,50,100));
}
}