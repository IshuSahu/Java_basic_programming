class A{
    private int a;
    int b;
    void set(int x,int y){
        a=x;
        b=y;
    }
    int get(){
        return a;
    }
}
class B extends A{
    int c;
    Void sum(){
        System.out.println("Sum is: "+(get()+b+c));
    }
}
class InheriAccess {
    public static void main(String[] args) {
        A SuperObj =new A();
        B Subobj =new B();
        Subobj.set(2, 3);
        Subobj.c=5;
        Subobj.sum();
    }
}
