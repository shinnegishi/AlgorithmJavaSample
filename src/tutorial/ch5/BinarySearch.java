package tutorial.ch5;
import misc_and_utils.CommonStuff;
//P.115 �񕪒T���@�̃A���S���Y��
public class BinarySearch implements Runnable{
	private static int[] numarr = {11,13,17,19,23,29,31};
	public void run() {
		System.out.println("��T�� P.115 �񕪒T���@�̃A���S���Y��");
		System.out.println("array["+String.valueOf(numarr.length)+"]<-{"+CommonStuff.joinIntArr(numarr)+"}");
		int head = 0;
		int tail = 6;
		int center = 0;
		while(head <= tail) {
			center = (head+tail)/2;
			if(numarr[center] == 17) {
				center = center + 1;//nth index
				System.out.println(center+"�Ԗڂ̗v�f����v");
				return;
			}else {
				if(numarr[center] < 17) {
					head = center+1;
				}else {
					tail = center-1;
				}
			}
		}
		System.out.println(center+"������܂���ł����B");
	}
}
