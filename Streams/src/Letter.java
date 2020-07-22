import java.util.*;
import java.util.stream.*;
public class Letter {
	public static boolean check(String s) {
		return s.length() == 3 && s.charAt(0) == 'a';
	}
	public static List<String> words_Classifying(Stream<String> list) {
		List<String> letters = list.filter(s -> check(s)).collect(Collectors.toList());
		return letters;
	}

	public static void main(String[] args) {
			
		Stream<String> list = Stream.of("give","take","bad","are","any");
		Stream<String> list2 = Stream.of("hello","bye","good","ans","and");
		System.out.println(words_Classifying(list));
		System.out.println(words_Classifying(list2));
		}

	}

