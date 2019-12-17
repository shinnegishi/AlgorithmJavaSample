package tutorial.ch5;
import misc_and_utils.CommonStuff;
//P.115 “ñ•ª’Tõ–@‚ÌƒAƒ‹ƒSƒŠƒYƒ€
public class BinarySearch implements Runnable{
	private static int[] numarr = {11,13,17,19,23,29,31};
	public void run() {
		System.out.println("‘æ‚TÍ P.115 “ñ•ª’Tõ–@‚ÌƒAƒ‹ƒSƒŠƒYƒ€");
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int head = 0;
		int tail = 6;
		int center = 0;
		while(head <= tail) {
			center = (head+tail)/2;
			if(numarr[center] == 17) {
				center = center + 1;//nth index
				System.out.println(center+"”Ô–Ú‚Ì—v‘f‚ªˆê’v");
				return;
			}else {
				if(numarr[center] < 17) {
					head = center+1;
				}else {
					tail = center-1;
				}
			}
		}
		System.out.println(center+"Œ©‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½B");
	}
}
