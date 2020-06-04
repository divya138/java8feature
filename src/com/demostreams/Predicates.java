package com.demostreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	    public static void main(String args[]) 
	    { 
	        List<String> names = 
	            Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2"); 
	        Predicate<String> p = (s)->s.startsWith("G"); 
	  
	        // Iterate through the list 
	        for (String st:names) 
	        { 
	            // call the test method 
	            if (p.test(st)) 
	                System.out.println(st); 
	        } 
	    } 
	}


