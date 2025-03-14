package Encapsulation;

class WriteOnly 
{
	private String password;

	// Only setter, no getter
	public void setPassword(String password) 
	{
		this.password = password;
	}
}

public class Write_Only_Class 
{
	public static void main(String[] args) 
	{
		WriteOnly obj = new WriteOnly();
		obj.setPassword("Secure123");
		// Cannot retrieve password as there's no getter
	}
}
