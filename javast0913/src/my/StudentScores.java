package my;

import java.util.Scanner;

public class StudentScores {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생들을 저장할 배열을 생성한다.
        String[] stNames = new String[5];
        int[] stScores = new int[5];

        // 학생 이름과 성적 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 학생 이름: ");
            stNames[i] = sc.nextLine();
            
            System.out.print((i + 1) + "번째 학생 성적: ");
            stScores[i] = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------");
        }

        // 학생들의 성적 출력 하기
        System.out.println("\n학생들의 성적:");
        for (int i = 0; i < 5; i++) {
            System.out.println(stNames[i] + ": " + stScores[i] + "점");
        }

        // 성적 평균 계산  후 출력하기 
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += stScores[i];
        }
        double average = (double) sum / stScores.length;

        // 성적 평균 출력
        System.out.println("\n성적 평균: " + average + "점");
    }
}
