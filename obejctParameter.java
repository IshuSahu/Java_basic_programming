class Box {
    int a, b;
    Box(int i ,int j){
        a=i;
        b=j;
       System.out.println(" Value of a and b is: "+a+" & "+ b);
    }

    boolean equals(Box o){
        if(o.a==a && o.b==b){
            return true;
        }
        else{
            return false;
            
        }
    }
}
class obejctParameter {
    public static void main(String[] args) {
        Box obj1 = new Box(4, 5);
        Box obj2 = new Box(4, 6);
        Box obj3 = new Box(4, 6);
        System.out.println("obj1==obj2\t"+obj1.equals(obj2));
        System.out.println("obj2==obj3\t"+obj2.equals(obj3));
        
    }
}
