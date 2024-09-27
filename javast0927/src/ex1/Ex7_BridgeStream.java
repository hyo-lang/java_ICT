package ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex7_BridgeStream {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(is,"UTF-8"));){
			System.out.println("입력 : ");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
