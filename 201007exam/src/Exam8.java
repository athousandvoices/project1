import java.util.Scanner;


public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String city=null;
		System.out.println("exit를 입력하면 종료합니다.");
		do {
			System.out.print(">>");
			city=s.next();
			if(city.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		} while (true);
	}

}
