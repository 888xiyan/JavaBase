package Java_study.obj.data.data_10;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        // 生成6位验证码作为示例
        String captcha = generateCaptcha(6);
        System.out.println("生成的验证码: " + captcha);
    }
    
    /**
     * 随机产生验证码，验证码每位可以是数字，大小写字母
     * @param length 验证码长度
     * @return 生成的验证码字符串
     */
    public static String generateCaptcha(int length) {
        // 定义验证码字符集：数字 + 大写字母 + 小写字母
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            // 随机选择一个字符
            int index = random.nextInt(chars.length());
            captcha.append(chars.charAt(index));
        }
        
        return captcha.toString();
    }
}

    
    

