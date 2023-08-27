class Figure{
    int dim1,dim2;
    Figure(int a, int b){
        dim1=a;
        dim2=2;
    }
    double Area(){
        System.out.println("No Area there!");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(int a , int b){
        super(a, b);
    }
    double Area(){
        System.out.println("The Area Of Rectagle is: ");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(int a , int b){
        super(a, b);
    }
    double Area(){
        System.out.println("The Area Of Rectagle is: ");
        return (dim1*dim2/2);
    }
}
class FIndArea {
    public static void main(String[] args) {
        Figure f = new Figure(2, 3);
        Rectangle r =new Rectangle(4, 4);
        Triangle t =new Triangle(6, 6);

        Figure ref;
        double area;
        ref=r;
        area = ref.Area();
        System.out.println(area);
        ref=t;
        area= ref.Area();
        System.out.println(area);
        ref=f;
        area=ref.Area();
        System.out.println(area);
    }
}
