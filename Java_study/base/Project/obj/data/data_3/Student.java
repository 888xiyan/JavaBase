package Java_study.obj.data.data_3;
// 构造器编写，应用，this使用
// this 调用全局变量
public class Student {
        String name;
    public  Student(String name){
        // 有参构造器和this使用
        this.name = name;
    }
//     public Student(){
// // 无参构造器
    public void print(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
