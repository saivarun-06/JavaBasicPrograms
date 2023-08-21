package Abstraction;
public class Abst1 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.discount();a.display();
		Home h=new A();
		h.discount();h.display();
	}
}
abstract class Home
{
	public abstract void discount();
	public void display()
	{
		System.out.println("HELLO");
	}
}
class A extends Home
{
	public void display()
	{
		System.out.println("IM IN DISPLAY");
	}
	public void discount() 
	{
		System.out.println("IM IN DISCOUNT");
	}
	
}