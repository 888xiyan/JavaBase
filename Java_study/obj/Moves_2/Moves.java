package Java_study.obj.Moves_2;

public class Moves {
    // ID，电影名称，主演
    private static int idCounter = 1;
    private int ID;
    private String Name;
    private String actor;
    public Moves(String Name,String actor){
        this.ID = idCounter++;
        this.Name = Name;
        this.actor = actor;
    }

    private Moves(){}
    public int getID(){return ID;}
    public String getName(){return Name;}
    public String getactor(){return actor;}

}
