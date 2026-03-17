import java.util.Scanner;
public class data_5 {
    public static void main(String[] args){
        double[] numbers = new double[4];
        for(int i=0;i<numbers.length;i++){
            System.out.println("请输入第" +i+"位同学的成绩");
            Scanner sc = new Scanner(System.in);
            numbers[i] = sc.nextInt();
            sc.close();
        }

        double max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("第一名成绩："+max);
        
    }
    
}
