class Stats<T extends Number>{
    T[] nums;
    Stats(T[] o){
        nums =o;
    }
    double average(){
        double sum =0.0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i].doubleValue();
            
        }
        return sum/nums.length;
    }
}
class Bounded {
    public static void main(String[] args) {
        Integer inums[] ={12,23,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double I = iob.average();
        System.out.println("SUM: "+ I);

        Double Dnums[] ={1.2,2.3,4.0,5.3};
        Stats<Double> Dob = new Stats<Double>(Dnums);
        double S = Dob.average();
        System.out.println("SUM: "+ S);
    }
}
