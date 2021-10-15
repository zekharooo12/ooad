
import java.io.*;
import java.util.Scanner;
public class Assg1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        FileInputStream ins = null;

        try{
            File file = new File("E:\\OOAD PRACTS\\src\\F1.txt", "w");
            System.out.println("Enter the data in file:\n(Enter \"stop\" if you want to stop entering data)");
            String data="",data1="";
            while(!data.equals("stop")) {
                data = s.nextLine();
                if(data.equals("stop"))
                    break;
                data1=data1+"\n"+data;
            }
            FileWriter fw=new FileWriter("E:\\OOAD PRACTS\\src\\F1.txt");
            fw.write(data1);
            fw.close();
            System.out.println("Data has been entered to file.");
        }
        catch (Exception e)
        {
            System.out.println("Data cannot be entered succesfully.");
        }


        try
        {
            File file = new File("E:\\OOAD PRACTS\\src\\F1.txt");
            String str,mainstr="",fname="students_";
            int count=-1,fno=0;
            Scanner fs=new Scanner(file);
            while (fs.hasNextLine())
            {
                str=fs.nextLine();
                count++;
                mainstr=mainstr+"\n"+str;
                if(count%5==0 && count!=0)
                {
                    fno++;
                    fname=fname+fno+".txt";
                    File newf=new File(fname);
                    newf.createNewFile();
                    FileWriter fw=new FileWriter(fname);
                    fw.write(mainstr);
                    fw.close();
                    mainstr="";
                    fname="students_";
                }
            }
            fno++;
            fname=fname+fno+".txt";
            File newf=new File(fname);
            newf.createNewFile();
            FileWriter fw=new FileWriter(fname);
            fw.write(mainstr);
            fw.close();
            System.out.println("File has been splitted succesfully.");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}