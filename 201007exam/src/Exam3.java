import java.util.Scanner;


public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("학점을 입력하세요.(A~D,F): ");
		String score=s.next();
		switch(score){
		case("A"):
			System.out.println("참 잘하였습니다.");
			break;
		case("B"):
			System.out.println("참 잘하였습니다.");
			break;
		case("C"):
			System.out.println("좀 더 노력하세요.");
			break;
		case("D"):
			System.out.println("좀 더 노력하세요.");
			break;
		case("F"):
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");
			break;
		}
	}

}
