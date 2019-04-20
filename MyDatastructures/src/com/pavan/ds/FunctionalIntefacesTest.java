package com.pavan.ds;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalIntefacesTest {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<>();

		s.add("pavan");
		s.add("supriya");
		s.add("supya");
		s.add("sriya");

		s.forEach((t) -> {System.out.println (t);System.out.println("finished");});
	
		
		MyFunctionalInteface mfi = (s1, s2) -> System.out.println(s1 + ":" + s2);
				
	
		
		

		mfi.show("one", "two");
		
		
		//System.out.println(mfi);
	}
}

@FunctionalInterface
interface MyFunctionalInteface{
	
	
	void show(String s1, String s2) ;
	
	
}
