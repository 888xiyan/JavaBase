package Data.data11TreadSafeSave1;

public class Account {
    private String cardID;
    private double money;
    public Account(String cardID,double money)
    {
        this.cardID=cardID;
        this.money=money;
    }
    public String getID(){return cardID;}
    public void drawMoney(double money)
    {
        synchronized(this)//锁对象this
        {//访问共享资源的核心代码
        if(this.money>=money)
        {
            System.out.println(Thread.currentThread().getName()+"取钱成功");
            this.money-=money;//共享资源money
            System.out.println("余额为："+this.money);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"取钱失败，余额不足！");
        } 
        }

    }
    
}
