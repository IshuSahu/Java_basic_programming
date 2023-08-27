 class UseStatic {
    static int  a=2;
    static int  b;
    static void meth(int x){
        System.out.println("value of a is: "+a);
        System.out.println("value of b is: "+b);
        System.out.println("value of x is: "+x);
    }

    static{
        System.out.println(" Static Block get Called!");
        b= a*3;

    }
    public static void main(String[] args) {
        meth(23);
    }

    
}
