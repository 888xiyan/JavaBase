package Java_study.obj.data.data_5;

public class teacher extends People{
    private String sklls;
    public teacher(String name,String sex,String sklls){
        super(name,sex);
        this.sklls = sklls;
    }
    public void setsklls(String sklls){this.sklls = sklls;}
    public String getsklls(){return sklls;} 
    @Override
    public String println(String name){
        return super.getname() + "不喜欢" + name;
    }   
}
