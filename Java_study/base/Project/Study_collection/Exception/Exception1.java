package Java_study.Study_collection.Exception;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exception1 {
    public static void main(String[] args) {
        //认识异常体系
        //运行时异常
        // show();
        try{//捕获异常
            show2();
        }catch(Exception e){
            e.printStackTrace();
        }
        // show2();
        
    }
    public static void show(){
        //运行时异常
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[5]);

    }
    public static void show2() throws Exception {//抛出异常
        // 编译时异常
        String str = "2024-07-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
