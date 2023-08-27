

public class multiCatch {
    static void NewThrow() throws NullPointerException{
        System.out.println("Inside the Newthrow()");
        throw new NullPointerException("Demo");
    }
    public static void main(String[] args) {
       try{
            NewThrow();
       }catch(NullPointerException e){
        System.out.println("caught:"+e);
       }
       finally{
        System.out.println("Fially block");
       }
    }
}
