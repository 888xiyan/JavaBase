package Java_study.obj.moves;

public class Moves_id {
    // 电影ID，电影上映时间，电影名称，电影主演，电影评分，电影时长，电影类型
    private String id;
    private String time;
    private String name;
    private String actor;
    private String score;
    private String time_long;
    private String type;
    
    public Moves_id( String time, String name, String actor, String score, String time_long, String type) {
        this.time = time;
        this.name = name;
        this.actor = actor;
        this.score = score;
        this.time_long = time_long;
        this.type = type;
        // 第一部电影ID为1,后面的依次加一
        if(id == null){
            id = "1";
        }else{
            int id = Integer.parseInt(this.id);
            id++;
            this.id = id+"";
        }
    }
    public String getId() {
        return id;
    }
    public String getactor(){
        return actor;
    }
    // 重写toString方法
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "电影ID："+this.id+'\t'+"电影名称："+this.name+'\t'+"主演："+this.actor+'\t'+"评分："+this.score+'\t'+"时长："+this.time_long+'\t'+"类型："+this.type+'\t'+"上映时间："+this.time;
    }
    public Object stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }
    
}
