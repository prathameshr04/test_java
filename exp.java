public class exp
{
public static void main(String args[])
{
try
{
int data =100/0;
}
catch(java.lang.ArithmeticException e)
{
System.out.println(e);
}
}
}