package chap01;

import java.util.Scanner;

public class practice02 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("비교하고자 하는 값을 3개 입력해 주세요");
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		System.out.println("최소값은?: "+min3(a,b,c));
	}

}
