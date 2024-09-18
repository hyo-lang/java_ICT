package my;

import java.util.Scanner;

public class DuplicateCheckArray {
	// 추가 연습문제) 아래의 2 멤버필드를 private로 변경하고
	// main메서드를 분리해서 DuplicateCheckMain.java를 만들고 붙여 넣은 다음에
	// 코드가 원활하게 동작하도록 구현 해봅시다. 
	String[] names;
	int count;
	// 주석:
	public DuplicateCheckArray(int endPoint) {
		names = new String[endPoint];
	}
	// 주석:
	private boolean isDuplicate(String name) {
		for (int i = 0; i < count; i++) {
			if (names[i].equals(name)) {
				return true;
			}
		}
		return false;
	}
	//주석:
	public void addNames(String name) {
		if (!isDuplicate(name)) {
            names[count] = name;
            count++;
        } else {
            System.out.println("*** 이미 저장된 이름이 있습니다. ***");
        }
		displayNames();
	}
	// 주석
    private void displayNames() {
        System.out.println("Entered names:");
        for (String name : names) {
        	if(name == null) continue;
            System.out.println("이름 =>"+name);
        }
        System.out.println("----------------------");
    }
    //주석
	public static void main(String[] args) {
		DuplicateCheckArray ref = new DuplicateCheckArray(3);
		 Scanner sc = new Scanner(System.in);
		 while (ref.count < ref.names.length) {
			 System.out.print("Enter name " + (ref.count + 1) + ": ");
			 String name = sc.nextLine();
			 ref.addNames(name);
		 }
	}
}
