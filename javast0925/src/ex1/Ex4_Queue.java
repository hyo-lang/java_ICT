package ex1;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class Ex4_Queue {
	public static void main(String[] args) {
		Queue<Ex4_Message> messages = new LinkedList<Ex4_Message>();
		//Queue에 메세지 넣기 offer(v);
		messages.offer(new Ex4_Message("sandMail", "홍길동"));
		messages.offer(new Ex4_Message("sendSMS", "닌자"));
		messages.offer(new Ex4_Message("sendTalk", "오늘 복습 화이팅!"));
		System.out.println("Size : " + messages.size());
		System.out.println("IsEmpty : " + messages.isEmpty());
		System.out.println("================================");
		//Queue에서 맨 앞에 있는 값을 반환 peek() : 꺼내는 것이 아니라 값을 반환
		Ex4_Message re1 = messages.peek();
		Ex4_Message re2 = messages.peek();
		Ex4_Message re3 = messages.peek();
		System.out.println(re1.command + " : " + re1.to);
		System.out.println(re2.command + " : " + re2.to);
		System.out.println(re3.command + " : " + re3.to);
		System.out.println("================================");
		//Queue에서 메세지 꺼낼 때  poll();
		Ex4_Message ref1 = messages.poll();
		Ex4_Message ref2 = messages.poll();
		Ex4_Message ref3 = messages.poll();
		System.out.println(ref1.command + " : " + ref1.to);
		System.out.println(ref2.command + " : " + ref2.to);
		System.out.println(ref3.command + " : " + ref3.to);
		
		System.out.println("Size : " + messages.size()); //0
		System.out.println("IsEmpty : " + messages.isEmpty());
	}
}
