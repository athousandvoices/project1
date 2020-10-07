import java.util.Scanner;


public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int end=-1;
		int num=0;
		int sum=0;
		double average=0.0;
		System.out.println("정수를 10개 입력하세요.");

		for(int i=0; i<10; i++){
			num=s.nextInt();
			if(num>0){
				sum += num;
			} else {
				if(num<=0) continue;
			}
		} //for 종료
		System.out.println("양수의 합은 "+sum);
	}

}
