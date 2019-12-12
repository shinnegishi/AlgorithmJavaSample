package tutorial.ch3;
import misc_and_utils.CommonStuff;
//P.79 合計を計算するアルゴリズム
public class CalculateSum implements Runnable{
	private static int[] numarr = {12,13,11,14,10};
	public void run() {

		System.out.println("ARRAY["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int sum = 0;
		for(int i = 0; i < numarr.length; i++) {
			sum = sum + numarr[i];
		}
		System.out.println(sum);
	}
}
