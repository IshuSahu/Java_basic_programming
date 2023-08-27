// package section2;
class gen<T>
{
    T val;
    gen(T a){
        val = a;
    }
    T get(){
        return val;
    }
}

public class GenricDemo1 {
    public static void main(String[] args) {
        gen<Integer> obj = new gen<Integer>(45);
        int a = obj.get();
        System.out.println(a);
        gen<String> obj1 = new gen<String>("Ishu");
        String name = obj1.get();
        System.out.println(name);
    }
}
