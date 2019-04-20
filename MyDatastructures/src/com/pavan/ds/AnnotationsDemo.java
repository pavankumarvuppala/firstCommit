package com.pavan.ds;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@CheckValue(name="Pavan")
public class AnnotationsDemo {

	
	
	public void show() {
		
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		
		AnnotationsDemo a = new AnnotationsDemo();
	//			a.show();

		Class c = a.getClass();
		Annotation aq = c.getAnnotation(CheckValue.class);
		CheckValue ch = (CheckValue) aq;
		System.out.println(ch.name());
	
	}
	
		

	}


