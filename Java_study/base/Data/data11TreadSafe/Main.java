package Data.data11TreadSafe;
/**
 * 线程安全问题
 * 取钱问题
 * 账户对象，线程对象
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456",100000);
        TreadAccount t1 = new TreadAccount("小明",account);
        TreadAccount t2 = new TreadAccount("小红",account);
        t1.start();
        t2.start();
    }
    
}
