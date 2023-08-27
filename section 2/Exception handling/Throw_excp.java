public class Throw_excp {
    static void demoproc(){
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc: " + e);
            throw e;  //  by this we can rethrow the same exception
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }
}
