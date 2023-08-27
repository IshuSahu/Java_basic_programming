

public class try_catch {
    
    public static void main(String[] args) {
        int d,a;
        try{
            d= 0;
            a=42/d;
            System.out.println("This will not be printed"); // not printed becoz when exception is occur is simply goes to the catch blck and proceced fucrther it cannot return back
            
        }
        catch(ArithmeticException e){
            System.out.println("Dividon by zero");
        }
        System.out.println("After catch");
    }
}
