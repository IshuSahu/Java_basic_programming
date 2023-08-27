public class Throws_excp {
    static void throwOne() throws IllegalAccessException{
        //throws indicate below line
        //throw give waring to having ecxeption or it send the thorw to to it parent catch block
        System.out.println("Inside ThrowOne");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {                
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("caught:"+e);
        }
    }
}
