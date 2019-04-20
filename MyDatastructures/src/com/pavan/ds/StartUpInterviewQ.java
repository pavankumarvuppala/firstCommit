package com.pavan.ds;

import java.util.ArrayList;

public class StartUpInterviewQ {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> s = new ArrayList<>();
		
		for (int i = 0 ; i < 10 ; i ++) {
			
			s.add(i);
		}
		
		System.out.println(s);
		for (int i = 9 ; i >= 0 ; i --) {
			
			s.remove(i);
		}
		
		System.out.println(s);
		
	}
}
