class bubbleSort{
    void sorting(int arr[], int size){

    for(int i = 0; i<size ; ++i){
        for(int j=0; j<i-1;++j){
            if(arr[j]>arr[j+1]){
                int t = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i]+" ");
    }
    }
}
class Bubble {
    public static void main(String[] args) {
        int arr[]={-1,34,54,-3,23,10};
        // int size = sizeof(arr)/sizeof(arr[0]);

    bubbleSort obj = new bubbleSort();
    obj.sorting(arr, 6);;
    }
}
