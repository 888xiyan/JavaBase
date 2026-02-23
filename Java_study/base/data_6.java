import java.util.Random;
public class data_6 {
    public static void main(String[] args){
        int[]numbers = new int[10];
        Random r = new Random();
        int sum = 0;
        int counts=0;
        double aves=0;
        for(int i=0;i<numbers.length;i++){
            numbers[i] = r.nextInt(100);
            sum +=numbers[i];
        }
        aves =(double) sum/numbers.length;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i] < aves){
                counts+=1;
            }
        }
        System.out.println("总和："+sum);
        System.out.println("平均数："+aves);
        System.out.println("个数："+counts);

    }
    
}
