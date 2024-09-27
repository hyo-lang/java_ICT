package ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex8_BridgeStreamUr {
	public static void main(String[] args) throws Exception{
		String path = "https://ictedu.co.kr/index_new.php?main_page=teacher&place=";
		URL url = new URL(path);
		
		InputStream is =  url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String readV = null;
		while ((readV = br.readLine()) != null) {
			System.out.println(readV);
		}
		
	}
}
