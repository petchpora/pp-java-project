package com.pp.helloWorld;

public class JavaPart2 {
	public static void main(String[] arge) {
		//Make string form char
		char chara1[] = { 'T', 'H', 'I', 'S', ' ', 'I', 'S', ' ', 'I', 'T' };
		String str = new String(chara1);
		System.out.println(str);

		String myStr1 = "This";
		String myStr2 = "This";
		String myStr3 = "Java is my newd friend!";
		String myStr4 = "           t oo many s p a c e              ";
		if (myStr1.equals(myStr2))
			System.out.println("Yes, equal.");
		if (myStr1.contains("T"))
			System.out.println("Yes, it is.");
		System.out.println(myStr3.length());
		System.out.println(myStr3.substring(0, 10));
		System.out.println(myStr4.trim());
		System.out.println(myStr4.trim().toUpperCase());
		System.out.println("////////////LAB12//////////////");
		lab12();
		System.out.println("////////////LAB13//////////////");
		lab13();
	}

	public static void lab12() {
		// lab12
		String str1 = "You and Me";
		String str2 = " you and me ";
		// 12.1
		System.out.println(str1.equals(str2));
		// 12.2
		System.out.println(str1.contains("and"));
		// 12.3
		System.out.println(str1.length());
		// 12.4
		System.out.println(str1.substring(5, str1.length()));
		// 12.5
		System.out.println(str2.trim());
		// 12.6
		System.out.println(str2.toUpperCase());
		// 12.7
		System.out.println(str2.trim().toUpperCase());

	}

	public static void lab13() {
		//lab13
		// 13.1
		int[][] arrint4 = { { 1, 2, 3 }, { 40, 50, 60 }, { 700, 800, 900 } };

		for (int[] i1 : arrint4) {
			for (int i2 : i1) {
				System.out.println(i2);
			}
		}

		// 13.2
		int sum = 0;
		for (int[] i3 : arrint4) {
			int lastEle = i3[i3.length-1];
			sum+=lastEle;
		}
		System.out.println("Sum of the last element = "+sum);
	}
}
