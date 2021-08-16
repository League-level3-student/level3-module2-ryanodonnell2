package _02_More_Algorithms;

import java.lang.reflect.Array;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size()-1; i++) {
			if(eggs.get(i)=="cracked") {
				return i;
			}
		}
		return -1;
	}
	static int countPearls(List<Boolean> list){
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==true) {
				count++;
			}
		}
		return count;
	}
	static Double findTallest(List<Double> list) {
		int tallest = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>list.get(tallest)) {
				tallest = i;
			}
		}
		return list.get(tallest);
	}
	static String findLongestWord(List<String> words) {
		String longest = words.get(0);
		for (int i = 0; i < words.size()-1; i++) {
			if(words.get(i).length()>longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	static boolean containsSOS(List<String> words){
		for (int i = 0; i < words.size()-1; i++) {
			if(words.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	
	static List<Double> sortScores(List<Double> list){
		
		return sort(list);
	}
	
	static List<Double> sort(List<Double> list) {
	    for (int i = 0; i < list.size()-1; i++) {
	        for (int j = 0; j < list.size()-i-1; j++) {
	        	if(list.get(j)<list.get(j+1)) {
	        		double temp = list.get(j);
	        		list.set(j, list.get(j+1));
	        		list.set(j+1, temp);
	        	}
	        }
	    }
	    for (int i = 0; i < list.size()/2-1; i++) {
	    	Double temp = list.get(i);
			list.set(i, list.get(list.size()-i-1));
			list.set(list.size()-i-1, temp);
		}
		return list;
	}
	
	static List<String> sortDNA(List<String> list){
		for (int i = 0; i < list.size()-1; i++) {
	        for (int j = 0; j < list.size()-i-1; j++) {
	        	if(list.get(j).length()>list.get(j+1).length()) {
	        		String temp = list.get(j);
	        		list.set(j, list.get(j+1));
	        		list.set(j+1, temp);
	        	}
	        }
	    }
	return list;
	}
	
	static List<String> sortWords(List<String> list){
		for (int i = 0; i < list.size()-1; i++) {
	        for (int j = 0; j < list.size()-i-1; j++) {
	        	if(list.get(j).length()>list.get(j+1).length()) {
	        		String temp = list.get(j);
	        		list.set(j, list.get(j+1));
	        		list.set(j+1, temp);
	        	}
	        }
	    }
	return list;
	}
}
