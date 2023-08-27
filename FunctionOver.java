

class Box {
    void Test(){
        System.out.println("Null ");
    }

    void Test(int l){
        System.out.println("2nd function called ");
        System.out.println(l);
   
    }
    void Test(int l, int b){
        System.out.println("3rd function called ");
        System.out.println("value of a and b is: "+l+" & "+b);
   
    }

    void  Test( double a){
        System.out.println("4th function called ");
        System.out.println(a*a);

    }

}
class FunctionOver{
    public static void main(String[] args) {
        Box obj = new Box();
        obj.Test();
        obj.Test(5);
        obj.Test(3,4);
        obj.Test(3);
    }
}

