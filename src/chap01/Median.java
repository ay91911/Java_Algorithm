package chap01;

import java.util.Scanner;

//3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ����մϴ�

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
		System.out.println("�� ���� ���� 3���� �Է��Ͻÿ�");
		int a = str.nextInt();
		int b = str.nextInt();
		int c = str.nextInt();
		System.out.println("��  �� �߰����� "+med3(a,b,c)+"�Դϴ�.");
	}
}
