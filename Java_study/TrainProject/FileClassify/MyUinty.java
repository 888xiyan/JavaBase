package Java_study.TrainProject.FileClassify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @work:工具类
 * 搜索
 * 复制
 * 文件夹的创建
 * 计时器
 * 删除
 */
public class MyUinty {
    //
    //测试
    // public static void main(String[] args) {
    //     File dir = new File("C:\\Users\\Lenovo\\Desktop\\2025");
    //     for(File f:Search(dir)){
    //         System.out.println(f.getName());
    //     }
    // }
    
    
    public static File[] Search(File dir){
        
        /**
         * 返回File集合
         */
        //判断传入参数是否为空，是否是文件夹
        if(dir == null || !dir.isDirectory() || !dir.exists()){//判断传入参数是否为空，是否是文件夹
            //返回
            return null;
        }
        
        List<File> fileList = new ArrayList<>();
        searchFiles(dir, fileList);
        return fileList.toArray(new File[0]);
    }
    
    private static void searchFiles(File dir, List<File> fileList) {
        //获取文件夹下目录的所有一级文件或文件夹对象
        File[] files = dir.listFiles();
        if(files != null && files.length > 0){//判断文件列表是否为空,对象长度是否为0
            for(File f : files){
                //判断是否为文件
                if(f.isFile()){
                    //添加到列表
                    fileList.add(f);
                } else if(f.isDirectory()){
                    //如果是文件夹，递归搜索
                    searchFiles(f, fileList);
                }
            }
        }
    }

    public static void CopyFiles(File src,File dest,int DownloadBytes){
        String SrcName = src.getAbsolutePath();
        String DestName = dest.getAbsolutePath();
        try(
        //创建文件输入流管道与源文件连接
        InputStream in = new FileInputStream(SrcName);
        //创建文件输出流管道与目标文件连接
        FileOutputStream out = new FileOutputStream(DestName);)
        {
        byte[] buffer = new byte[DownloadBytes];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer,0,len);
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("复制完成"+dest.getAbsolutePath());
    }


    public static void Delete(File name){
        try{
        name.delete();
        System.out.println("删除完成:"+name.getAbsolutePath());}
        catch(Exception e){
            e.printStackTrace();
        }
}
public static File CreateDir(File Path,File mainFile){
    //判断文件夹是否存在
    if(Path.exists()){
        System.out.println("文件夹已存在:"+Path.getAbsolutePath());
        return null;
    }else{String srcPath = mainFile.getAbsolutePath()+"\\\\"+Path.getName();
            File src = new File(srcPath);
            src.mkdirs();
            System.out.println("文件夹创建成功:"+src.getAbsolutePath());
            return src;
        } 
    
}

public static ThreadPoolExecutor MyThreadPoolExecutor
    (int corePoolSize,int maximumPoolSize,
    int keepAliveTime,TimeUnit unit){
            ThreadPoolExecutor myThreadPoolExecutor = 
            new ThreadPoolExecutor(
            corePoolSize, 
            maximumPoolSize, 
            keepAliveTime, 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<Runnable>(10), 
            new ThreadPoolExecutor.AbortPolicy());
            System.out.println("线程池创建成功");
            return myThreadPoolExecutor;
}


}
