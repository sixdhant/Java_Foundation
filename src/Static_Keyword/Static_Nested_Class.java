package Static_Keyword;

public class Static_Nested_Class 
{
    static class StaticNestedClass 
    {
        public void display() 
        {
            System.out.println("Inside static nested class");
        }
    }

    public static void main(String[] args) 
    {
        Static_Nested_Class.StaticNestedClass nestedObj = new Static_Nested_Class.StaticNestedClass();
        nestedObj.display();
    }
}
/**

Inside static nested class

*/