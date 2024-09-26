package ex1;

import java.util.Stack;

public class Ex3_Stack {
	public static void main(String[] args) throws InterruptedException {
		Stack<Ex3_Coin> ref = new Stack<Ex3_Coin>();
		System.out.println("스택 비워있는 유무1 : => : " + ref.isEmpty());
		ref.push(new Ex3_Coin(100));
		ref.push(new Ex3_Coin(50));
		ref.push(new Ex3_Coin(500));
		ref.push(new Ex3_Coin(10));
		ref.push(new Ex3_Coin(100));
		
		System.out.println("용량 : " + ref.capacity());
		System.out.println("갯수 : " + ref.size());
		System.out.println("스택 비워있는 유무 : => : " + ref.isEmpty()); //***false
		System.out.println("========================================");

		while (!ref.isEmpty()) {
			//pop()
			Thread.sleep(1000);
			System.out.println(ref.pop().getValue());
			System.out.println("갯수 : " + ref.size());
			System.out.println("========================================");
		}
	}

}
