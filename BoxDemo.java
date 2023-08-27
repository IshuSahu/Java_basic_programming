class Box
{
    int width;
    private int height;
    int breadth;

    void Set_data(int a){
        height=a;
    }

    void Volume(){
        System.out.print(width*height*breadth); 
    }
}

class BoxDemo
{
    public static void main(String[] args)
    {
        Box newbox = new Box();
        newbox.width=10;
        newbox.breadth=20;
        newbox.Set_data(6);
        newbox.Volume();


    }
}