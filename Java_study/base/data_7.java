public class data_7 {
    public static void main(String[] args) {
        double s_1 = S(20,30);
        double s_2 = S(50,46);
        double max = s_1>s_2? s_1 :s_2;
        System.out.println("面积:"+max);
        
    }
    public static double S (double len,double width){
        double s = len * width;
        return s;
    }
    
}
