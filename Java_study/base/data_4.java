public class data_4{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int counts = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%3==0){
                counts+=1;
            }
        }
        System.out.println(counts);
    }
}