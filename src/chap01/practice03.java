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
		System.out.println("���ϰ��� �ϴ� ���� 4�� �Է��� �ּ���");
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		int d= stdIn.nextInt();
		System.out.println("�ּҰ���?: "+min4(a,b,c,d));
	}

}
