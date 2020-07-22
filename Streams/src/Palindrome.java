import java.util.*;
import java.util.stream.*;
public class Palindrome {
	public static boolean check(String ss) {
		int i = 0,j = ss.length() - 1;
		while(i<j) {
			if(ss.charAt(i) == ss.charAt(j)) {
				i += 1;
				j -= 1;
			}
			else
				return false;
		}
		return true;
		
	}
	public static List<String> palindrome(Stream<String> list){
		List<String> modified = list.filter(s -> check(s)).collect(Collectors.toList());
		
		return modified;
	}
	public static void main(String args[]) {
		Stream<String> list = Stream.of("madam","abb","aca","aba","radar");
		Stream<String> list2 = Stream.of("hello","abb","ahgf","tht","hdj");
		
		System.out.println(palindrome(list));
		System.out.println(palindrome(list2));
		
	}

}
