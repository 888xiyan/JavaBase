import java.util.Scanner; 
public class data_2{
    public static void main(String[] args){
        // String TV_name = "送初恋回家";
        // String starts = "刘晶\t张雨提\t高媛";
        // int age =2020;
        // double score = 9.7;
        // System.out.println(TV_name);
        // System.out.println(starts);
        // System.out.println(age);
        // System.out.println(score);
        // 键盘输入
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int one = number%10;
        int ten = number/10%10;
        int yibai = number/100%10;
        System.out.println("个位是："+one);
        System.out.println("十位是："+ten);
        System.out.println("百位是："+yibai);

    }
}