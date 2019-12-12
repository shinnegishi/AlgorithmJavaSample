package misc_and_utils;
import java.util.Arrays;
public class CommonStuff {
	public static String joinIntArr(int[] numarr) {
		String[] strarr = Arrays.stream(numarr).mapToObj(String::valueOf).toArray(String[]::new);
		return String.join(",", strarr);
	}
}
