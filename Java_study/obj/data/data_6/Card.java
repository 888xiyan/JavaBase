public class Card {
    private int card_number;
    private String name;
    private int phone_number;
    private double money;
    public void setcard_number(int card_number){
        this.card_number = card_number;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setphone_number(int phone_number){this.phone_number = phone_number;}
    public void setmoney(double money){this.money = money;}
    public int getcard_number(){return card_number;}
    public String getname(){return name;}
    public int getphone_number(){return phone_number;}
    public double getmoney(){return money;}
    public Card(int card_number,String name,int phone_number,double money){
        this.card_number = card_number;
        this.name = name;
        this.phone_number = phone_number;
        this.money = money;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "车牌号："+this.card_number+'\t';
    }
    public void deposit(double money){
        this.money +=money;
    }
    public void consume(double money){
        this.money -= money; 
    }

}
