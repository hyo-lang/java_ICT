package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex6_DetaOutputStream {
	private String path;
	
	public Ex6_DetaOutputStream() {
		path ="D:\\ICTstudy\\javastudy\\mysample\\mywork\\demoObj.txt";
	}
	public void dataWrite() {
		try(DataOutputStream dos = new DataOutputStream(
				new FileOutputStream(path));) {
			dos.writeInt(10);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeFloat(10.5f);
			dos.writeUTF("MyTest");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public void dataReader() {
			try (DataInputStream dis = new DataInputStream(new FileInputStream(path));){
				System.out.println("========출력========");
				System.out.println("int : " + dis.readInt());
				System.out.println("boolean : " + dis.readBoolean());
				System.out.println("char : " + dis.readChar());
				System.out.println("float : " + dis.readFloat());
				System.out.println("String : " + dis.readUTF());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		new Ex6_DetaOutputStream().dataReader();
	}
}
