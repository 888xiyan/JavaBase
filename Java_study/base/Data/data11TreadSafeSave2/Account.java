package Data.data11TreadSafeSave2;

public class Account {
    private String cardID;
    private double money;
    public Account(String cardID,double money)
    {
        this.cardID=cardID;
        this.money=money;
    }
    public String getID(){return cardID;}
    public synchronized void drawMoney(double money)
    {
        if(this.money>=money)
        {
            
            System.out.println(Thread.currentThread().getName()+"取钱成功");
            this.money-=money;
            System.out.println("余额为："+this.money);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足！");
        }
    }
    
}
