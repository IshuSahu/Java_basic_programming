class A{
    int a;
    private int b;
    void get(int i,int j){
        a=i;
        b=j;
    }
    void show(){
        System.out.println("value of a: "+a + "and b is: "+ b);
    }
    int get_data(){
        return b;
    }
}
class B extends A{
    int c=4;
    void Showk(){
        System.out.println("value of c is:" +c);
    }
    void sum(){
        System.out.println("sum is:" +(a+get_data()+c));
    }
}
class SimpleInheritance  {
    public static void main(String[] args) {
        A SuperObj = new A();
        B SubObj = new B();
        SuperObj.get(2, 3);
        SuperObj.show();
        SubObj.get(4, 5);
        SubObj.show();
        SubObj.Showk();
        SubObj.sum();
    }
}
