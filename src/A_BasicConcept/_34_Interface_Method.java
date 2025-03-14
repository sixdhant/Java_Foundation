/*      Interface_Method Example	     */

package A_BasicConcept;
public class _34_Interface_Method 
{
	public static void main(String[] args) 
	{
		BabuTech s = new BabuTech();
		s.WebDesign();
		s.WebDevelope();
	}
}
interface Client_Web
{
	void WebDesign();	// public + abstract
	void WebDevelope();	// public + abstract
}
abstract class SidTech implements Client_Web
{
	@Override
	public void WebDesign()
	{
		System.out.println("Green, Top Menu, Three Dop Menu");
	}
}

class BabuTech extends SidTech
{
	@Override
	public void WebDevelope()
	{
		System.out.println("HTML, java, CSS, Javasricpt");
	}
}

/* 

Green, Top Menu, Three Dop Menu
HTML, java, CSS, Javasricpt

*/