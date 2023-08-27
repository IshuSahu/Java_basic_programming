class Main{
    int lenght;
    int breadth;
    int height;

    Main(int a, int b , int c)
    {
        lenght=a;
        breadth=b;
        height=c;
    }

}

class Example
{
    public static void main(String[] args) {
        Main my_area= new Main(2,3,2);
        int area;
        area=my_area.Area();
        System.out.println(area);

    }
}