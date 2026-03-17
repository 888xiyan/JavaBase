package class_work;

import java.util.Scanner;

public class syudy_3_11 {
    public static void main(String[] args) {
        // 输入三角形的三条边，计算面积
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一条边：");
        int a = sc.nextInt();
        System.out.println("请输入第二条边：");
        int b = sc.nextInt();
        System.out.println("请输入第三条边：");
        int c = sc.nextInt();
        double p = (a+b+c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("三角形的面积是："+area);
        sc.close();
    }
    
}
