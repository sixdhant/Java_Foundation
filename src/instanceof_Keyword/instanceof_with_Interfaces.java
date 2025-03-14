package instanceof_Keyword;

interface Pet 
{

}

class Cat implements Pet 
{
	
}

public class instanceof_with_Interfaces 
{
    public static void main(String[] args) 
    {
        Pet pet = new Cat();

        System.out.println(pet instanceof Pet); // true
        System.out.println(pet instanceof Cat); // true
    }
}
