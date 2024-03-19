class Animal
{
 void eat()
  {
    System.out.println("i am eating");
  }
}
class dog extends Animal
{
   void bark()
{
     System.out.println("i am barking"); 
}
}
class walk extends dog
{
 void walk()
{
      System.out.println("i am walking");
}
}
class multilevel
{
  public static void main(String args[])
{
  walk w =new walk();
  w.walk();
  w.bark();
  w.eat();
}
}