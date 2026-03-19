package Java_study.obj.PictureMove;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//目标文件夹一级文件获取
//复制指定文件到指定文件夹
public class Main {
    public static void main(String[] args) {
        //文件获取
        String path = "C:\\Users\\Lenovo\\Desktop\\Screenshots\\";
        //C:\Users\Lenovo\Desktop\Screenshots\2025
        //文件分类,复制
        classifyFile(getFile(path), path);
    }
    /**
     * @files src 文件路径
     * @path 
     */

    public static File[] getFile(String path){
        //一级文件对象获取
        File file = new File(path);
        File[] files = file.listFiles();
        return files;
    }
    public static void classifyFile(File[] files,String path){
        for (File file : files) {
            //文件分类，如果文件名中含有2025，则复制到2025文件夹下，如果含有2026，则复制到2026文件夹下
            //获取文件格式
            if (file.getName().contains("2025")) {
                String srcPath = file.getAbsolutePath();
                String destPath = path+ "2025\\"+file.getName();
                //判断文件夹中是否有同名文件，如果有则不进行复制
                if (!isExist(path+"2025",file.getName())) {
                    copyFile(srcPath,destPath);
                    System.out.println("复制成功");
                }else{System.out.println("文件已存在");}
            } 
            else{ 
            if (file.getName().contains("2026")) {
                String srcPath = file.getAbsolutePath();
                String destPath = path+"2026\\"+file.getName();
                if (!isExist(path+"2026",file.getName())) {
                    System.out.println("复制成功");
                    copyFile(srcPath,destPath);
                }else{System.out.println("文件已存在");}
            }
            else{System.out.println(file.getName()+"没有2025或2026");}
            }
        }
    }
    public static void copyFile(String src,String dest){
        //文件复制
        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
        )
            {byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //判断文件夹中是否有同名文件
    //,目标文件名和文件夹内所有文件名做对比
    public static boolean isExist(String destPath,String fileName){
        File file = new File(destPath);
        File[] files = file.listFiles();
        for (File file2 : files) {
            if (file2.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }
}
