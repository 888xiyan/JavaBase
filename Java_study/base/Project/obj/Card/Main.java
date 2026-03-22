package Java_study.obj.Card;

import java.lang.reflect.Array;
import java.util.ArrayList;

// 80名学生，去A,B,C,D四个景点，每个学生只能选择一个景点，统计出景点最多的人数
public class Main {
    public static void main(String[] args) {
        // 循环80次，每循环一次，就随机将A,B,C,D其中一个加载到集合中
        // A [] ch = {'A','B','C','D'};
        ArrayList<Character> ch = new ArrayList<Character>();
        ch.add('A');
        ch.add('B');
        ch.add('C');
        ch.add('D');
        char [] student = new char[80];
        for (int i = 0; i < 80; i++) {
            //生成0,1,2,3的随机数
            int index = (int)(Math.random()*4);// 
            switch (index) {
                case 0:
                    student[i] = ch.get(0);
                    break;
                case 1:
                    student[i] = ch.get(1);
                    break;
                case 2:
                    student[i] = ch.get(2);
                    break;
                case 3:
                    student[i] = ch.get(3);
                    break;
            }}
            // System.out.print(student[i]);
            int countA = 0, countB = 0, countC = 0, countD = 0;
            for (char c : student)
                switch (c) {
                    case 'A':
                        countA++;
                        break;
                    case 'B':
                        countB++;
                        break;
                    case 'C':
                        countC++;
                        break;
                    case 'D':
                        countD++;
                        break;
                }
            int max = Math.max(Math.max(countA, countB), Math.max(countC, countD));
            // 输出人数最多的景点
        System.out.println("最多人数为：" + max);
        System.out.println("A:" + countA);
        System.out.println("B:" + countB);
        System.out.println("C:" + countC);
        System.out.println("D:" + countD);
    }
}
