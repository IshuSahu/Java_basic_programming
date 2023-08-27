// abstract class A{
//     abstract void callme();
//     void CallmeToo(){
//         System.out.println("This is a Concreate method");
//     }
// }

// class B extends A{
//     void callme(){
//         System.out.println("This is a Abstract method");

//     }
//     // if we didn't called abstact method then it will show B is not abstract and does not override abstract method callme() in A
// }
// class AbstractClass {
//     public static void main(String[] args) {
//         B b=new B();
//         b.callme();
//         b.CallmeToo();
//     }
// }

// It is use when we have to inherited some class from base class where such things we have to put as mendatory or Compulsate in derived class 
// eg  
abstract class Car {
    int wheel = 4;

    abstract void speed();

    abstract void avg();
}

class Honda extends Car {
    // @Override
    void speed() {
        // TODO Auto-generated method stub
        System.out.println("Max speed is 180");

    }

    // @Override
    void avg() {
        // TODO Auto-generated method stub
        System.out.println("Max speed is 23");
    }
}

class TATA extends Car {
    // @Override
    void speed() {
        // TODO Auto-generated method stub
        System.out.println("Max speed is 200");

    }

    // @Override
    void avg() {
        // TODO Auto-generated method stub
        System.out.println("Max speed is 26");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Honda h = new Honda();
        TATA t = new TATA();
        System.out.println("\t HONDA ");
        System.out.println("wheel: " + h.wheel);
        h.speed();
        h.avg();
        System.out.println("\t TATA ");
        System.out.println("wheel: " + h.wheel);

        t.speed();
        t.avg();
    }
}