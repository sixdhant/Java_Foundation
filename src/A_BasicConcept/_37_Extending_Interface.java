/*      Extending Interface Example	   */

package A_BasicConcept;
public class _37_Extending_Interface 
{
	public static void main(String[] args)
	{
		Raj sid = new madhav();
		sid.add();
		sid.sub();
	}
}
interface Gill
{
	void add();
}
interface Raj extends Gill
{
	void sub();
}
class madhav implements Raj
{
	@Override
	public void add()
	{
		int a=10, b =20, c= 0;
		c = a + b;
		System.out.println("Addition is :"+c);
		
	}
	@Override
	public void sub()
	{
		int a=30, b =20, c= 0;
		c = a - b;
		System.out.println("Subtraction is :"+c);
	}
}

/* 

Addition is :30
Subtraction is :10


*/