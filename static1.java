class static1
{
  static int cube(int x)
{
  return x*x*x;
}
public static void main(String args[])
{
  int c = static1.cube(5);
  System.out.println("voluem of cube= "+c);
}
}