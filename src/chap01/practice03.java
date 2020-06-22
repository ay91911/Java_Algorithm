package chap01;

import java.util.Scanner;

public class practice03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b<min)min=b;
		if(c<min)min=c;
		if(d<min)min=d;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("비교하고자 하는 값을 4개 입력해 주세요");
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		int d= stdIn.nextInt();
		System.out.println("최소값은?: "+min4(a,b,c,d));
	}

}
