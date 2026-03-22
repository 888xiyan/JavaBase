package Data.data11TreadSafeSave1;
/**
 * 线程安全问题
 * 取钱问题
 * 账户对象，线程对象
 * 解决方案1，同步代码块
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456",100000);
        new TreadAccount("小明",account).start();
        new TreadAccount("小红",account).start();
    }
    
}
