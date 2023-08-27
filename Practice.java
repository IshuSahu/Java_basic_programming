
class Gen <T,V>{
    T Name;
    V value;
    Gen(T a, V b){
        Name =a;
        value = b;
    }
    void show(){
        System.out.println("The name is:" + Name);
        System.out.println("value is: "+ value);
    }
}
class Practice {
    public static void main(String[] args) {
        Gen<String, Integer> g = new Gen<String, Integer>("Ishu",45);
        g.show();
        Gen<String,Double> g1 = new Gen<String,Double>("sahu",45.6);
        g1.show();
    }
    
}