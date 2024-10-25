package aopspring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImple implements DaoInter {
	public DaoImple() {
		System.out.println("DaoImple ������ ȣ��!");
	}
	// Around Advice
	@Override
	public void first() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	// ��ȯ ���� �޾Ƽ� ó���� After-returning Advice
	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("--------------------").append("\n");
		sb.append("�׽���").append("\n");
		sb.append("--------------------").append("\n");
		return sb.toString();
	}
	// After-throwing Advice : ���� �߿����� ����
	// �̷��� After-throwing Advice Ȱ������ �ʰ� ��MVC������ �ٸ� ������� ����ϱ� ������
	// ���� ������..
	@Override
	public void third() {
		String[] ar = { "�޼���1", "�޼���2", "�޼���3", "�޼���4", "�޼���5" };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println("������Ͻ� ������ " + ar[i]);// ���� �߻�!
		}
	}
	// Around Advice : Statement, PrepareStatement �ӵ� üũ
	@Override
	public String firstStatementTest(int num) {
		
		// Adive���� �ϰڴ�~~
				//��ó�� 
				//long start = System.currentTimeMillis();
		
		if (num == 1) { // Statement
			try (Connection con = MyConn.getDs();
					Statement stmt = con.createStatement()
					) {
				//10000�� ��ȸ�ϸ鼭 �����͸� ����Ŭ�� ������.
				for (int i = 1; i < 10000; i++) {
					StringBuilder sql = new StringBuilder();
					sql.append("insert into speedtest values(");
					sql.append(i).append(",'").append("xman" + i).append("',");
					sql.append("sysdate)");
					System.out.println("Log1 = > " + sql);
					stmt.executeUpdate(sql.toString());
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}else if (num == 2) { // PrepareStatement
			//SQL�� �ۼ��ϱ� 
			StringBuilder sql = new StringBuilder();
			sql.append("insert into speedtest values(?,?,sysdate)");
			try (Connection con = MyConn.getDs();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())
					) {
				//�ۼ��� SQL���� ?�� ���ε��ϱ� - �Ȱ��� �������� �ݺ� �� 
				for (int i = 1; i < 10000; i++) {
					pstmt.setInt(1, i);
					pstmt.setString(2, "xman" + i);
					pstmt.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// ���� �������
				//long end = System.currentTimeMillis();
		return "Check �Ϸ�!";
	}
	public static void main(String[] args) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into speedtest values(");
		sql.append(10).append(",'").append("xman" + 10).append("',");
		sql.append("sysdate)");
		System.out.println("Log1 = > " + sql);
		//Log1 = > insert into speedtest values(10,'xman10',sysdate)
	}
}





