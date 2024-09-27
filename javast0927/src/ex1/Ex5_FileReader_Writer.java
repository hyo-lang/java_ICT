package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex5_FileReader_Writer {
	private String path;
	public Ex5_FileReader_Writer() {
		path ="D:\\ICTstudy\\javastudy\\mysample\\mywork\\demo3.txt";
	}
	
	public void magWriter(String msg) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			bw.write(msg);
			bw.newLine();
			bw.flush();
		//	bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//path에서 읽어들이는 메서드
	public String msgReader( ) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))
			){
				String readV = null;
				String res = "";
				while ((readV = br.readLine())!= null) {
					res += readV+"\n";
				}
				return res;
			
		} catch (Exception e) {
			return "";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex5_FileReader_Writer ref = new Ex5_FileReader_Writer();
		
		ext:while (true) {
			System.out.println("1: 작성, 2: 출력, 3: 종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1: {
				System.out.println("Message: ");
				String msg = sc.nextLine();
				ref.magWriter(msg);
				break;
			}
			case 2: {
				String reMsg = ref.msgReader();
				System.out.println(reMsg);
				break;
			}
			case 3: {
				System.out.println("프로그램 종료");
				break ext;
			}
			default:
				break;
			}
		}
	}
}
