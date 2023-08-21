package Abstraction;
interface A
{
	public void m1();
	public void m2();
}
abstract class B implements A
{
	public void m1()
	{
		System.out.println("HI");
	}
	public abstract void m3();
	public void m4()
	{
		
	}
}
class C extends B
{
	public void m2()
	{
		System.out.println("IN M2");	
	}
	public void m3() 
	{
		System.out.println("IN M3");	
	}
}
public class Interfaces
{
	public static void main(String[] args) 
	{
		
	}

}