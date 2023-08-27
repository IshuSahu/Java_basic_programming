class A{
    void callme(){
        System.out.println("Classed A get Called!");
    }
}
class B extends A{
    void callme(){
        System.out.println("Classed B get Called!");
    }
}
class C extends A{
    void callme(){
        System.out.println("Classed C get Called!");
    }
}
class MethodDisp {
   public static void main(String[] args) {
    A a= new A();
    B b=new B();
    C c= new C();
    A r;
    r=a; // r refer to object A
    r.callme();
    r=b; // r refer to object   B
    r.callme();
    r=c; // r refer to object C
    r.callme();
   }
}
