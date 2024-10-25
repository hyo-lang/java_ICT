package aopspring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImple implements DaoInter {
	public DaoImple() {
		System.out.println("DaoImple 생성자 호출!");
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
	// 반환 값을 받아서 처리할 After-returning Advice
	@Override
	public String second() {
		StringBuffer sb = new StringBuffer();
		sb.append("--------------------").append("\n");
		sb.append("테스형").append("\n");
		sb.append("--------------------").append("\n");
		return sb.toString();
	}
	// After-throwing Advice : 별로 중요하지 않음
	// 이렇게 After-throwing Advice 활용하지 않고 웹MVC에서는 다른 방법으로 사용하기 때문에
	// 개념 정도만..
	@Override
	public void third() {
		String[] ar = { "메세지1", "메세지2", "메세지3", "메세지4", "메세지5" };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println("비니지니스 로직의 " + ar[i]);// 예외 발생!
		}
	}
	// Around Advice : Statement, PrepareStatement 속도 체크
	@Override
	public String firstStatementTest(int num) {
		
		// Adive에서 하겠다~~
				//전처리 
				//long start = System.currentTimeMillis();
		
		if (num == 1) { // Statement
			try (Connection con = MyConn.getDs();
					Statement stmt = con.createStatement()
					) {
				//10000번 순회하면서 데이터를 오라클로 전송함.
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
			//SQL문 작성하기 
			StringBuilder sql = new StringBuilder();
			sql.append("insert into speedtest values(?,?,sysdate)");
			try (Connection con = MyConn.getDs();
				PreparedStatement pstmt = con.prepareStatement(sql.toString())
					) {
				//작성한 SQL문에 ?값 바인딩하기 - 똑같은 조건으로 반복 함 
				for (int i = 1; i < 10000; i++) {
					pstmt.setInt(1, i);
					pstmt.setString(2, "xman" + i);
					pstmt.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 후행 공통로직
				//long end = System.currentTimeMillis();
		return "Check 완료!";
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





