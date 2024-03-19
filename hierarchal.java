class Dog
{
void talk()
{
  System.out.println("i am a dog");
}
}

class Cat extends Dog
{
void walk()
{
  System.out.println("i am a cat");
}
}

class Mouse extends Dog
{
void eat()
{
  System.out.println("i am a mouse");
}
}

class hierarchal
{
public static void main(String args[])
{
 Mouse m = new Mouse();
  m.talk();
  m.walk();
  m.eat();
}
}