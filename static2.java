class static2
{
 static int count =0;
  static2()
 {
   return count;
   System.out.println(count); 
 }
public static void main(String args[])
{
  static2 x = new static2();
  static2 y = new static2();
  static2 z = new static2();
}
}