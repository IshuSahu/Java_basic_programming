interface Bank{
    float RateOfInterest();
}
class SBI implements Bank{
   public float RateOfInterest(){
        return 12.9f; //f is Imp to use in float
    }
}
class BOI implements Bank{
   public float RateOfInterest(){
        return 9.9f;
    }
}
class Interface {
    public static void main(String[] args) {
        SBI s =new SBI();
        BOI b=new BOI();
        System.out.println("rate of interest of SBI is "+s.RateOfInterest());
        System.out.println("rate of interest of BOI is "+b.RateOfInterest());
    }
}

// //variable name Interface
// interface A{
//     int a=10;
// }
// interface B{
//     int a=100;
// }
// class Interface implements A,B{
//     public static void main(String[] args) {
//         System.out.println(A.a);
//         System.out.println(B.a);
//     }
// }

// // Multile inheritence in java interface

// interface Printable{
//     void print();
// }
// interface Showable{
//     void show();
// }
// class Ishu implements Printable,Showable{
//     public void print(){
//         System.out.println("Hello Ishu");
//     }
//     public void show(){
//         System.out.println("Hello ISHU SAHU");
//     }
// }
// class Interface {
//     public static void main(String[] args) {
//         Ishu i=new Ishu();
//     i.print();
//     i.show();
//     }
// }



// interface Printable{
//     void print();
// }
// interface Showable extends Printable{
//     void show();
// }
// class Ishu implements Showable{
//     public void print(){
//         System.out.println("Hello Ishu");
//     }
//     public void show(){
//         System.out.println("Hello ISHU SAHU");
//     }
// }
// class Interface {
//     public static void main(String[] args) {
//         Ishu i=new Ishu();
//     i.print();
//     i.show();
//     }
// }