class Animal
{
 void eat()
{
System.out.println("dog is eating.....");
}
}

 class dog extends Animal
{
void bark()
{
 System.out.println("dog is baerking.....");
}
}

class Subclass
{
public static void main(String args [])
{
dog d = new dog();
d.bark();
d.eat();
}
}