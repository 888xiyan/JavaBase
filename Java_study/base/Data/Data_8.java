package Data;
public class Data_8 {
    public static void main(String[] args) { 
        System.out.println(f(1));

    }
    // public static int f(int n){
    //     if (n==1){
    //         return 1;
    //     }else{
    //         return f(n-1)+n;
    //     }
    // }
    public static int f(int n){
        // 第n+1天:f(n+1) = 第n天:f(n) -1/2f(n) -1
        // f(n) = 2*f(n+1) +2
        if (n==10){
            return 1;
        }else{
            return 2*f(n+1)+2;
        }
    }

    
}
