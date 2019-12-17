package tutorial.ch4;

import misc_and_utils.CommonStuff;

//P.99- 線形探索法のアルゴリズム
public class LinearSearch implements Runnable{
	private static int[] numarr = {4,2,3,5,1};
	public void run() {
		System.out.println("第４章 P.99- 線形探索法のアルゴリズム");
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int i = 0;
		while(i < 5) {
			if(numarr[i] == 5) {
				i++;
				System.out.println(i+"番目の要素が一致");				
				return;
			}
			i++;
		}
		System.out.println("見つかりませんでした");
	}
}
