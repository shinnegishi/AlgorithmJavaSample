package tutorial.ch3;
import java.util.Scanner;
//P.69-70 ２つのデータの大小を判定するアルゴリズム
public class CompareSize implements Runnable{
	private static int a;
	private static int b;
	public void run() {
		System.out.println("第3章 P.69-70 ２つのデータの大小を判定するアルゴリズム");
		Scanner myObj = new Scanner(System.in);
		System.out.println("aの値を入力してください");
		a = myObj.nextInt();
		System.out.println("bの値を入力してください");
		b = myObj.nextInt();
		compareValue(a, b);
	}
	public static void compareValue(int a, int b) {
		if(a > b) {
			System.out.println(a);
		}else if( a == b) {
			System.out.println("aとbは等しい。");
		}else{
			System.out.println(b);
		}
	}
}
