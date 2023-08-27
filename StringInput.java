import java.util.*;
class StringInput
{
    public static void main(String[] args)
    {
        Scanner con = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name= con.nextLine();
        System.out.println("your name is: "+name);
    }
}