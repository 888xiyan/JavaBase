package Java_study.obj.data.data_4;
// 封装
public class Student {
    private String name;
    private int age;
    private String sex;
    public void getname(String name){
        this.name = name;
    }
    public String setname(){
        return name;
    }
        public void getage(int age){
        this.age = age;
    }
    public int setage(){
        return age;
    }
        public void getsex(String sex){
        this.sex = sex;
    }
    public String setsex(){
        return sex;
    }
}
