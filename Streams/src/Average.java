//import java.io.*;
import java.util.*;
import java.util.stream.*;
class Average {
	public static double findAverageUsingStream(int[] array) {
	    return Arrays.stream(array).average().orElse(Double.NaN);
	}
	public static void main(String args[])
	{
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4,5,2,4,5};
	System.out.println(findAverageUsingStream(a));
	System.out.println(findAverageUsingStream(b));
}
}
