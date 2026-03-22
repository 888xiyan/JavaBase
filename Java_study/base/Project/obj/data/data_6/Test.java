import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 支付模块，金卡和银卡，卡片信息
        Goal_card a = new Goal_card(456, "xiyy", 455, 789);
        pay(a);
        Ying_card b = new Ying_card(789,"iiii", 456, 789);
        pay(b);
    }
        public static void pay(Card c){
        System.out.println("请刷卡");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);

    }
}
