package handelingWindows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import scala.Char;

public class Javaquestions {

	public static void main(String[] args) {
		String value1="appljhbdsjhbadsjabdslhbfdaljadbsgbfdasfbdsfbhdbsfjdbshfeP_";
		String value2="ppanjclsjdbvhebrhejrhvbhrhejbvherjhbhejfbehrhbjehrbjfberjhbfejhrfbherfbhbehrjbfhbldbshadsbfle_";
		char [] arr1=value1.toCharArray();
		char[] arr2=value2.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:arr1) {
		    Integer count =map.get(c);
		    if(count==null) {
		    	map.put(c, 1);
		    }
		    else {map.put(c, ++count);}
		}
		
	
	for(char c:arr2) {
		Integer count=map.get(c);
		if (count==null) {
			map.put(c, 1);
			}else {map.put(c, --count);}
	}
	ArrayList<Integer> list =new ArrayList<Integer>();
	Set<Entry<Character,Integer>>display=map.entrySet();
	for(Entry<Character, Integer> entry:display) {
		Integer al=entry.getValue();
		if(al!=0) {
			list.add(al);
			}}	if (list.isEmpty()) {
		System.out.println("String anagram");
		
	}else {
		System.out.println("String not anagram");
		System.out.println("Removing below char will make it anagram");
		for(Entry<Character, Integer> entry:display) {
			if(entry.getValue() > 0) {
				System.out.println(entry.getKey() + " " + entry.getValue() + " times");
			
		}}
		System.out.println("Adding below char will make it anagram");
		for(Entry<Character, Integer> entry:display) {
			if(entry.getValue() < 0) {
				System.out.println(entry.getKey() + " " + -1 * entry.getValue() + " times");
			
		}}
	}
	}
		
	}


