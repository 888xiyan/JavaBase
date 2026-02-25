package Java_study.obj.data.data_5;

public class People {
    private String name;
    private String sex;
    public People(String name,String sex){
        this.name = name;
        this.sex = sex;
    }
    public void setname(String name){this.name = name;}
    public String getname(){return name;} 
    public void setsex(String sex){this.sex = sex;}
    public String getsex(){return sex;}
    public String println(String name){
        return this.name + "喜欢" + name;
    }
}
