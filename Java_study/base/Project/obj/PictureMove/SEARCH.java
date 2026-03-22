package Java_study.obj.PictureMove;

import java.io.File;

public class SEARCH {
    public static void main(String[] args) {
        //递归函数实现文件搜索
        //目标文件夹，目标文件名
        File dir = new File("D:\\");
        String Name = "Uninstall.exe";
        Search(dir,Name);
    }
    public static void Search(File dir,String Name){
        /**
         * 获取一级目录文件
         * 遍历对象判断是否为文件或者文件夹
         * 判断文件名是否相同
         * 如果是文件夹
         * 递归调用
         */
        //获取一级目录文件
        //判断传入参数是否为空，是否是文件夹
        if(dir == null || !dir.isDirectory() || !dir.exists()){//判断传入参数是否为空，是否是文件夹
            //返回
            return;
        }
        //获取文件夹下目录的所有一级文件或文件夹对象
        File[] files = dir.listFiles();
        if(files != null && files.length>0){//判断文件列表是否为空,对象长度是否为0
            for(File f:files){
            //判断是否为文件或者文件夹
            if(f.isFile()){
                //是文件判断文件名是否包含搜索关键字
                if(f.getName().contains(Name)){
                    System.out.println("找到文件："+f.getAbsolutePath());
                }

            } 
                else{
                    //获取文件夹
                    //递归调用
                    Search(f,Name);
                }
        }
        }

    }
    
}
