package chap01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다

public class Median {
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(c>=a)
				return a;
			else
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else
			return b;	
		
	}
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("값 비교할 숫자 3개를 입력하시오");
		int a = str.nextInt();
		int b = str.nextInt();
		int c = str.nextInt();
		System.out.println("이  중 중간값은 "+med3(a,b,c)+"입니다.");
	}
}
