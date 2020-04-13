package com.source;

import java.util.stream.IntStream;

public class ConsecutiveSample {
	
	public  static void consecutive(long num) 
	    { 
	        int start = 1, end = 1; 
	        int sum = 1; 
	      
	        while (start <= num/2) 
	        { 
	            if (sum < num) 
	            { 
	                end += 1; 
	                sum += end; 
	            } 
	            else if (sum > num) 
	            { 
	                sum -= start; 
	                start += 1; 
	            } 
	            else if (sum == num) 
	            { 
	                for (int i = start;i <= end; ++i) 
	                
	                    System.out.print(i + " "); 
	                    System.out.println(); 
	                    sum -= start; 
	                    start += 1;
	                
	             }
	            
	        } 
	    } 
	 
	  
	     
	    public static void main (String[] args) 
	    { 
	    	consecutive(21); 
	    	
	    } 
	} 
	
