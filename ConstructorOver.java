 class Box {
    int length;
    int breadth;
    int height;
        Box(int a){
            length=breadth=height=a;
            System.out.println("Volume of rectangle is: "+length*breadth*height);
        }
        Box(int a, int b ,int c){
            length=a;
            breadth=b;
            height=c;
            System.out.println("Volume of rectangle is: "+length*breadth*height);
        }
        Box(){
            length=10;
            breadth=10;
            height=10;
            System.out.println("Volume of rectangle is: "+length*breadth*height);
        }
 }
 
 class ConstructorOver {
    public static void main(String[] args) {
        Box ob1 = new Box(10);
        Box ob2 = new Box(2, 4, 6);
        Box ob3 = new Box();
        
    }
    
}
