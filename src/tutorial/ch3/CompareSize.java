package tutorial.ch3;
import java.util.Scanner;
//P.69-70 �Q�̃f�[�^�̑召�𔻒肷��A���S���Y��
public class CompareSize implements Runnable{
	private static int a;
	private static int b;
	public void run() {
		System.out.println("��3�� P.69-70 �Q�̃f�[�^�̑召�𔻒肷��A���S���Y��");
		Scanner myObj = new Scanner(System.in);
		System.out.println("a�̒l����͂��Ă�������");
		a = myObj.nextInt();
		System.out.println("b�̒l����͂��Ă�������");
		b = myObj.nextInt();
		compareValue(a, b);
	}
	public static void compareValue(int a, int b) {
		if(a > b) {
			System.out.println(a);
		}else if( a == b) {
			System.out.println("a��b�͓������B");
		}else{
			System.out.println(b);
		}
	}
}
