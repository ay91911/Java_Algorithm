package chap01;

import java.util.Scanner;

public class practice01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		if(d>max)max=d;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���ϰ��� �ϴ� ���� 4�� �Է��� �ּ���");
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		int d= stdIn.nextInt();
		System.out.println("�ִ밪��?: "+max4(a,b,c,d));
	}

}
