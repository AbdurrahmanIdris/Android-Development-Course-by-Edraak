package filesdemo;
import java.io.File;
import java.io.FileInputStream;

public class FilesDemoRead {
    public static void main(String[] args) {
        String helloStr = "Hello to my repo";
        File file = new File("E:\\Faculty Of Engineering\\Online courses\\EDRAAK - Android Development\\Unit Two - Java Advanced Topics\\myFile.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            System.out.println("Total file size to read"+fis.available());
            int content;
            while((content = fis.read()) != -1){
                System.out.print((char)content);
            }//end while
            
        }//end try
        catch(Exception e){
            e.printStackTrace();
        }//end catch
    }//end main    
}//end class
