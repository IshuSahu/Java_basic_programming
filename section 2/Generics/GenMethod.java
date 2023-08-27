
class GenMethod {
    static<T,V extends T> boolean isln( T x , V[] y) {
        for (int i = 0; i < y.length; i++) 
            if(x.equals(y[i]))
                return true;

            return false;
        
    }
    public static void main(String[] args) {
        Integer num[]={1,2,3,4,5};
        if(isln(2, num))
        System.out.println("2 is in nums");
        if(!isln(7, num))
        System.out.println("7 is not in nums");

        String str[]={"One", "Two","Three", "four", "five"};
        if(isln("Two", str))
        System.out.println("'Two' is in nums");
        if(!isln("Seven", str))
        System.out.println("'Seven' is not in nums");
        
        if(isln("Two", num))
        System.out.println("'Two' is in nums");

    }
}
