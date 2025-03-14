package Test;

public class Test {
	public static void main(String[] args) 
	{
		A t1 = new B();
		A t2 = new C();
		
		t1.show();
		t2.show();
	}
}

class A 
{
	void show()
	{
		System.out.println("Class A");
	}
}
 class B extends A
 {
	@Override
	 void show()
	 {
		 System.out.println("Class B");
	 }
 }
 class C extends B
 {
	 @Override
	 void show()
	 {
		 System.out.println("Class C");
	 }
 }