package ex1;

import java.io.FileInputStream;

public class Ex1_FileInputStream {
public static void main(String[] args) {
    String path = "D:\\ICTstudy\\javastudy\\mysample\\mywork\\demo2.txt";
    try(FileInputStream fis = new FileInputStream(path)) {
      //  int res = 0;
        byte[] b = new byte[2024];
        fis.read(b);
        String s= new String(b,"UTF-8");
       // char[] c = {'A'};
       // Byte[] bb = {65,66,67};
       // char ch = (char) bb[0];
        
       
        System.out.println(s);
        
    } catch (Exception e) {

    } 
}
}