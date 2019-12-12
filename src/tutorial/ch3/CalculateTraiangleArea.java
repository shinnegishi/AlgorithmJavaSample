package tutorial.ch3;

import java.util.Scanner;
//P.66 三角形の面積を計算するアルゴリズム
public class CalculateTraiangleArea implements Runnable{
	private static Integer base;
	private static Integer height;
	private static Integer area;
	Scanner myObj = new Scanner(System.in);
	

	public void run() {
		System.out.println("第3章 P.66 三角形の面積を計算するアルゴリズム");
		Scanner myObj = new Scanner(System.in);
		System.out.println("底辺の長さ");
		base = Integer.parseInt(myObj.nextLine());
		System.out.println("高さ");
		height = Integer.parseInt(myObj.nextLine());
		area = (base*height)/2;
		System.out.println("三角形の面積："+area);
	}
}
