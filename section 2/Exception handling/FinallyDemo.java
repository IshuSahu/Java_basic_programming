import javax.management.RuntimeErrorException;

public class FinallyDemo {
    static void ProcA(){
        try{
            System.out.println("Inside procA");
        throw new RuntimeException("demo");
        } // here u have an expetion stil after executing the catch(caller responsibility) ur not come here the finally get execute first after try
        finally{
            System.out.println("procA finally");
        }
    }
    static void ProcB(){
        try{
            System.out.println("Inside procB");
        return;
        }
        finally{
            System.out.println("procB finally");
        }
    }
    static void ProcC(){
        try{
            System.out.println("Inside procC");
        }
        finally{
            System.out.println("procC finally");
        }
    }
    public static void main(String[] args) {
        try{
            ProcA();
        }
        catch(Exception e){
            System.out.println("Exception catch");
        }
        ProcB();
        ProcC();
    }
}
