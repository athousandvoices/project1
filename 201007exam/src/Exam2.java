import java.util.Scanner;


public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("학점을 입력하세요.(A~D,F): ");
		String score=s.next();
		if(score.equals("A")||score.equals("B")) {
			System.out.println("참 잘하였습니다.");
		} else if(score.equals("C")||score.equals("D")) {
			System.out.println("좀 더 노력하세요.");
		} else if(score.equals("F")){
			System.out.println("다음 학기에 다시 수강하세요.");
		} else {
			System.out.println("잘못된 학점입니다.");
		}
	}

}
