import java.io.*;
public class prac2a {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in
        ));
        try {
            String s = " ";
            System.out.println("Enter 'stop' to quit the program.\n");
            System.out.print("Enter a string\n");
            while (!s.equals("stop")) {
                System.out.println(s.toUpperCase()+"\n");
                s = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
