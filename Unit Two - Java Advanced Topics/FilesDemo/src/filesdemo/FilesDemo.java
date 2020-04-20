package filesdemo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FilesDemo {
    public static void main(String[] args) {
        try{
            String helloStr = "Hello to my repo";
            File file = new File("E:\\Faculty Of Engineering\\Online courses\\EDRAAK - Android Development\\Unit Two - Java Advanced Topics\\myFile.txt");
            if(!file.exists()){
                file.createNewFile();
            }//end if
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(helloStr);
            bw.close();
            System.out.println("Success");
            //method #1 To check if the file already existed in the path
//            if (file.createNewFile()){
//                System.out.println("Success");
//            }//end if
//            else{
//                System.out.println("Error, file already exist");
//            }//end else
            //method #2 To check if the file already existed in the path
//            System.out.println("Is the file there? "+file.exists());
        }//end try
        catch(Exception e){
            e.printStackTrace();
        }//end catch
    }//end main    
}//end class
