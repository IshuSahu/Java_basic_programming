class gen<T,V>
{
    T t1;
    V t2;
    gen(T a, V b){
        t1=a;
        t2=b;
    }
    void showType(){
        System.out.println("Type of T is: "+t1.getClass().getTypeName());
        System.out.println("Type of V is: "+t2.getClass().getTypeName());
    }
    T get1(){
        return t1;
    }
    V get2(){
        return t2;
    }
}

public class GenricDemo2 {
    public static void main(String[] args) {
        gen<Integer,String> obj1 = new gen<Integer,String>(12, "Ishu");
        obj1.showType();
        int a = obj1.get1();
        String b = obj1.get2();
        System.out.println(a);
        System.out.println(b);

    }
}
