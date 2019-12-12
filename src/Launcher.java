import java.util.Scanner;  // Import the Scanner class
import tutorial.ch3.CalculateTraiangleArea;
import tutorial.ch3.CalculateSum;
import tutorial.ch3.CalculateMaximum;
import tutorial.ch3.CompareSize;
import tutorial.ch4.LinearSearch;
import tutorial.ch5.BinarySearch;
import tutorial.ch7.SimpleSelectionMethod;

public class Launcher {
	private static Thread t1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("以下から実行したいアルゴリズムの番号を入力してください");
	    System.out.println("[1]P.66 三角形の面積を計算するアルゴリズム");
	    System.out.println("[2]P.69-70 ２つのデータの大小を判定するアルゴリズム");
	    System.out.println("[3]P.79 合計を計算するアルゴリズム");
	    System.out.println("[4]P.86 最大値を探すアルゴリズム");
	    System.out.println("[5]P.99- 線形探索法のアルゴリズム");
	    System.out.println("[6]P.115 二分探索法のアルゴリズム");
	    System.out.println("[7]P.151 単純選択法のアルゴリズム");
	    System.out.println("番号の選択(1～7)");
	    String comandNum = myObj.nextLine();  // Read user input
		
		switch(comandNum)
		{
		   // case statements
		   // values must be of same type of expression
		   case "1":
			   t1 = new Thread(new CalculateTraiangleArea());
			   break; // break is optional
		   
		   case "2":
			   t1 = new Thread(new CompareSize());
			   break; // break is optional

		   case "3":
			   t1 = new Thread(new CalculateSum());
			   break; // break is optional

		   case "4":
			   t1 = new Thread(new CalculateMaximum());
			   break; // break is optional

		   case "5":
			   t1 = new Thread(new LinearSearch());
			   break; // break is optional

		   case "6":
			   t1 = new Thread(new BinarySearch());
			   break; // break is optional

		   case "7":
			   t1 = new Thread(new SimpleSelectionMethod());   // Statements
			   break; // break is optional

		   default :
			   System.out.println("その番号は対応していません");
			   return;
		      // Statements
		}
		t1.start();
	}

}
