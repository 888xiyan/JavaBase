public class Goal_card extends Card {
    public Goal_card(int card_number, String name, int phone_number, double money) {
        super(card_number, name, phone_number,money);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void consume(double money){
        if(money*0.8 >= getmoney()){
            System.out.println("你的消费已超过卡内金额，请尽快充值"+money);
        }else{
        setmoney(getmoney()- money*0.8);
        System.out.println("消费"+money*0.8+"元");
        if(money >= 200){
            System.out.println("消费"+money*0.8+"元，打印免费洗车劵");
        }
    }

    }
    


    
}
