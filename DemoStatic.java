class Demo{
    static int a= 34;
    static int b =23;
    static void show(){
        System.out.println("value of a is: "+ a);
    }
}
class DemoStatic {
    public static void main(String[] args) {
        Demo.show();
        System.out.println("value of b is: "+  Demo.b);
    }
}
