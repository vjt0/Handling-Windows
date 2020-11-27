package handelingWindows;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class JavaLearning {
	 public static void reverse() {
		 int num=54321;
		 int reverse=0;
		 while(num!=0) {
			 int value =num%10;
			 reverse=reverse*10+value;
			 num=num/10;
		 }
		 System.out.println("reverse is "+reverse);
	 }
	
	public static void getFactorial() {
		int num =5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
		}System.out.println("Factorial is -: "+fact);
	}
	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void duplicate() {
		String[] name = { "Kevin", "Nilay", "vijay", "vijay", "Kevin", "Nilay", "vijay", "vijay" };
		Set<String> set = new HashSet<String>();
		for (String s : name) {
			if (set.add(s) == false) {
				System.out.println("Duplicate is " + s);
			}
		}
	}

	public static void main(String[] args) {
		boolean value = isPrime(22);
		if (value == true) {
			System.out.println("No is Prime");
		}
		duplicate();
		getFactorial();
		reverse();

		String[] name = { "Kevin", "Nilay", "vijay", "vijay", "Kevin", "Nilay", "vijay", "vijay" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : name) {
			Integer count = map.get(s);
			if (count == null) {
				map.put(s, 1);
			} else {
				map.put(s, ++count);

			}
		}
		Set<Entry<String, Integer>> display = map.entrySet();
		for (Entry<String, Integer> entry : display) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate value is " + entry.getKey() + "    " + entry.getValue() + "   times");
			}
		}

	}
}
