package Java_study.obj.data.data_7;

public class Student_data {
    private String name;
    private char sex;
    private double score;
    public void setname(String name){this.name = name;}
    public void setsex(char sex){this.sex = sex;}
    public void setscore(double score){this.score = score;}
    public String getname(){return name;}
    public char getsex(){return sex;}
    public double getscore(){return score;} 
    public Student_data(String name,char sex,double score){
        this.name = name;
        this.score = score;
        this.sex = sex;
    }
    
}
