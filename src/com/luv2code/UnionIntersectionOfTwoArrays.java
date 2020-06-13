package com.luv2code;

import java.util.HashSet;

public class UnionIntersectionOfTwoArrays {

	public static void main(String[] args) {
		
	      int arr1[]= {1,2,3,4,5,6};
		  int arr2[]= {3,4,5,6,7};
		    
		    
		    HashSet<Integer> hs=new HashSet<Integer>();
		    
		    for(int i=0;i<arr1.length;i++)
		    	hs.add(arr1[i]);
		    for(int i=0;i<arr2.length;i++)
		    	hs.add(arr2[i]);

		    System.out.println(hs.size());
	        System.out.println("Union "+hs);
		    //Intersection
		    
		    HashSet<Integer> hs1 = new HashSet<>(); 
	       // HashSet<Integer> hs2 = new HashSet<>(); 
	          System.out.println("Interscetion is ");
	        for (int i = 0; i < arr1.length; i++)  
	            hs1.add(arr1[i]); 
	          
	        for (int i = 0; i < arr2.length; i++)  
	            if (hs1.contains(arr2[i]))
	            	
	               System.out.print(arr2[i] + " "); 
	

	}

}
