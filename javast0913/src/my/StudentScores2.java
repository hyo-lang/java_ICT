package my;

import java.util.Scanner;

public class StudentScores2 {
	
	String[] stNames;
	int[] stScores;
	public StudentScores2(int endPoint) {
		stNames = new String[endPoint];
		stScores = new int[endPoint];
	}
	// 학생 이름과 성적 입력 받기
	public void addScoreAndNames(String name, int score, int idx) {
		stNames[idx] = name;
		stScores[idx] = score;
	}
	public void printScores() {
		System.out.println("\n학생들의 성적:");
        for (int i = 0; i < stNames.length; i++) {
            System.out.println(stNames[i] + ": " + stScores[i] + "점");
        }
	}
	public double averageScore() {
        int sum = 0;
        for (int i = 0; i < stNames.length; i++) {
            sum += stScores[i];
        }
        double average = (double) sum / stScores.length;
        return average;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생인원:");
        int stNum = Integer.parseInt(sc.nextLine());
        StudentScores2 ref = new StudentScores2(stNum);

        // 학생 이름과 성적 입력 받기
        String names="";
        int score = 0;
        for (int i = 0; i < ref.stNames.length; i++) {
            System.out.print((i + 1) + "번째 학생 이름: ");
            names = sc.nextLine();
            System.out.print((i + 1) + "번째 학생 성적: ");
            score = Integer.parseInt(sc.nextLine());
            ref.addScoreAndNames(names,score,i);
            System.out.println("-------------------------");
        }

        // 학생들의 성적 출력 하기
        ref.printScores();

        // 성적 평균 출력
        System.out.println("\n성적 평균: " + ref.averageScore() + "점");
    }
}
