package tutorial.ch7;
import misc_and_utils.CommonStuff;
//P.151 単純選択法のアルゴリズム
public class SimpleSelectionMethod implements Runnable{
	private static int[] numarr = {12,13,11,14,10};
	public void run() {
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int i;
		int k;
		int indexMin;
		int w;
		i = 0;
		while(i<4) {
			indexMin = i;
			k = i + 1;
				while(k < 5) {
					if(numarr[k] < numarr[indexMin]) {
						indexMin  = k;
					}
					k = k + 1;
				}
			w = numarr[i];
			numarr[i] = numarr[indexMin];
			numarr[indexMin] = w;
			i = i + 1;
		}
		System.out.println("＊＊AFTER＊＊");
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
	}
}
