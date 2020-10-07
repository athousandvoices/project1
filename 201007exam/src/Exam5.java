import java.util.Scanner;


public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int end=-1;
		int i=0;
		int num=0;
		int sum=0;
		double average=0.0;
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		do {
			num=s.nextInt();
			i++;
			sum += num;
		} while (num!=end);
		sum = sum+1;
		average = (double)sum/(i-1);
		System.out.println("정수의 개수는 "+(i-1)+"개이며 합은"+sum+"이고 평균은"+average+"입니다.");
	}

}
