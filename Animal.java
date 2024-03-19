class Animal
{
 void eat()
{
System.out.println("dog is eating.....");
}
}

 class Dog extends Animal
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
Dog d = new Dog();
d.bark();
d.eat();
}
}