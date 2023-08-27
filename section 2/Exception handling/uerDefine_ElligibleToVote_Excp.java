class NotElligibleToVote extends Exception{
    private int age;
    NotElligibleToVote (int a){
        age=a;
    }
    public String toString(){
        return "NotElligibleToVote[" + age+"] ";
    }
}

class uerDefine_ElligibleToVote_Excp {
    static void check(int a) throws NotElligibleToVote{
        System.out.println("your age is: "+ a);
        if(a<18)
        throw new NotElligibleToVote(a);
        System.out.println("Normal exit no ecxeption");
    }
    public static void main(String[] args) {
        try{
            //this 2 will print both bcoz exception is on second
            check(20);
            check(15);
            
            //this only first will print  bcoz exception is on first
            // check(15);
            // check(20);
        }catch(NotElligibleToVote e)   {
            System.out.println("catch: "+e);
        }
    }
}
