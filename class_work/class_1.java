package class_work;

import java.util.Scanner;

public class class_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();
        System.out.println("请输入数字：");
        int b = sc.nextInt();
        int max ;
        if(a>b){
        max = a;
        }
        else {max = b;}
        System.out.println("最大值是："+max);
        sc.close();
    }
    
    
}
