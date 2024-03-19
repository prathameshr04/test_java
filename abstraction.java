abstract class shape
{
 abstract void draw();
}
class rectangle extends shape
{
 void draw()
{
 System.out.println("drawing a rectangle");
}
}
class circle extends shape
{
void draw()
{
 System.out.println("drawing a circle");
}
}
class abstraction
{
public static void main(String args[])
{
 shape r = new circle();
 r.draw();
}
}