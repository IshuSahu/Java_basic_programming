class A{
    A(){
        System.out.println("Constructor A Get Called!");

    }
}
class B extends A{
    B(){
        System.out.println("Constructor B Get Called!");

    }
}
class C extends B{
    C(){
        System.out.println("Constructor C Get Called!");

    }
}
class WhenConstrut{
    public static void main(String[] args) {
        C obj =new C();
    }
}