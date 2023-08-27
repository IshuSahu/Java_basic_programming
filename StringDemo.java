import java.util.*;

class StringDemo
{
    public static void main(String[] args) {
        int a,b,c,temp;
        Scanner Console = new Scanner(System.in);
        System.out.print("Enter the Value of a :");
        a = Console.nextInt();
        System.out.print("Enter the Value of b :");
        b = Console.nextInt();
        System.out.print("Enter the Value of c :");
        c = Console.nextInt();
        
    
        temp = a>b?a:b;
        
        int Largest = temp>c?temp:c;
        System.out.print("The Largest No. is: "+ Largest);
    }
}