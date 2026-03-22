package Java_study.obj.data.data_4;

public class Test {
    public static void main(String[] args) {
        
    
    Student s1 = new Student();
    s1.getname("喜洋洋");
    s1.getage(17);
    s1.getsex("男");
    System.out.println("我叫"+s1.setname()+"年龄"+s1.setage()+"性别"+s1.setsex());
    Studentoperater_1 operaater = new Studentoperater_1();
    operaater.printbase(s1);
    Studentoperater_2 operrater = new Studentoperater_2(s1);
    operrater.printsome();

    }

}
