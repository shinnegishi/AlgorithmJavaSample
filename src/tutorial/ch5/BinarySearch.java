package tutorial.ch5;
import misc_and_utils.CommonStuff;
//P.115 二分探索法のアルゴリズム
public class BinarySearch implements Runnable{
	private static int[] numarr = {11,13,17,19,23,29,31};
	public void run() {
		System.out.println("第５章 P.115 二分探索法のアルゴリズム");
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int head = 0;
		int tail = 6;
		int center = 0;
		while(head <= tail) {
			center = (head+tail)/2;
			if(numarr[center] == 17) {
				center = center + 1;//nth index
				System.out.println(center+"番目の要素が一致");
				return;
			}else {
				if(numarr[center] < 17) {
					head = center+1;
				}else {
					tail = center-1;
				}
			}
		}
		System.out.println(center+"見つかりませんでした。");
	}
}
