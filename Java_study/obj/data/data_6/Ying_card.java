public class Ying_card extends Card {
        public  Ying_card(int card_number, String name, int phone_number, double money) {
        super(card_number, name, phone_number,money);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void consume(double money){
        if(money*0.9 >= getmoney()){
            System.out.println("你的消费已超过卡内金额，请尽快充值"+money);
        }else{
        setmoney(getmoney() - money*0.9);
        System.out.println("消费"+money*0.9+"元");
    }
    
}
}