package Data.data11TreadSafeSave1;

public class TreadAccount extends Thread {
    private Account account;
    public TreadAccount(String name,Account account)
    {
        super(name);
        this.account = account;
    }
    @Override
    public void run()
    {
        account.drawMoney(100000);
        System.out.println(Thread.currentThread().getName()+"结束");
    }
    
}
