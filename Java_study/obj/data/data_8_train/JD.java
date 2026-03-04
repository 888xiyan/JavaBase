package Java_study.obj.data.data_8_train;

public class JD implements interface_JD{
    private String name;
    private boolean state;
    public JD(String name,boolean state){
        this.name = name;
        this.state = state;
    }
    public void setname(String name){this.name = name;}
    public void setstate(boolean state){this.state = state;}
    public String getname(){return name;}
    public boolean getstate(){return state;}
    @Override
    public void press(){state =! state;}
    
}
