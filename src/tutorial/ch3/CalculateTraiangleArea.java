package tutorial.ch3;

import java.util.Scanner;
//P.66 �O�p�`�̖ʐς��v�Z����A���S���Y��
public class CalculateTraiangleArea implements Runnable{
	private static Integer base;
	private static Integer height;
	private static Integer area;
	Scanner myObj = new Scanner(System.in);
	

	public void run() {
		System.out.println("��3�� P.66 �O�p�`�̖ʐς��v�Z����A���S���Y��");
		Scanner myObj = new Scanner(System.in);
		System.out.println("��ӂ̒���");
		base = Integer.parseInt(myObj.nextLine());
		System.out.println("����");
		height = Integer.parseInt(myObj.nextLine());
		area = (base*height)/2;
		System.out.println("�O�p�`�̖ʐρF"+area);
	}
}
