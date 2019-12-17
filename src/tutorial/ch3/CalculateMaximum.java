package tutorial.ch3;
import misc_and_utils.CommonStuff;
//P.86 Å‘å’l‚ğ’T‚·ƒAƒ‹ƒSƒŠƒYƒ€
public class CalculateMaximum implements Runnable{
	private static int[] numarr = {12,13,11,14,10};
	public void run() {
		System.out.println("‘æ3ÍP.86 Å‘å’l‚ğ’T‚·ƒAƒ‹ƒSƒŠƒYƒ€");
		System.out.println("ARRAY["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int max = 0;
		for(int i = 0; i < numarr.length; i++) {
			if(numarr[i] > max) {
				max = numarr[i];
			}
		}
		System.out.println(max);		
	}
}
