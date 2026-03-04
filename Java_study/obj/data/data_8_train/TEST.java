package Java_study.obj.data.data_8_train;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        // 智能家居系统
        // 智能家电-JD，电视，电脑，洗衣机，空调（状态，开关）
        // 操控系统,开关
        JD[] jds = new JD[4];
        jds[0] = new TV("小米电视",false);
        jds[1] = new computer("联想电脑", false);
        jds[2] = new washclothes("美的洗衣机", false);
        jds[3] = new air("美的空调",false);
        operater_JD operater = operater_JD.get_operater();
        // operater.print_state(jds[2]);
        // operater.operater(jds[2]);
        for(int i=0;i<jds.length;i++){
            JD jd = jds[i];
            operater.print_state(jd);
        }
        System.out.println("//////////////////");
        while(true){
        System.out.println("请按下按钮");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                operater.operater(jds[0]);
                break;
            case 2:
                operater.operater(jds[1]);
                break;
            case 3:
                operater.operater(jds[2]);
                break;
            case 4:
                operater.operater(jds[3]);
                break;
            case 5:
                return;
            default:
                System.out.println("请重新输入");
                break;
        }
    }
        
    }
}
