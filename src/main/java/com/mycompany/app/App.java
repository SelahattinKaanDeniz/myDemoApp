	
	package com.mycompany.app;
	
	import java.util.ArrayList;
	
	/**
	 * Hello world!
	 *
	 */
	public class App
	{   
		public static boolean countOccur(ArrayList<Integer> a1,ArrayList<Integer> a2,int num1,int num2) {
	        System.out.println("Counting a ocurrence of given integer in both ArrayList separetaly and"
	        		+ "checking if the number of occurences are equal ");
	        int occur1=0;
	        int occur2=0;
	        if (a1 == null || a2==null ) {
	        	System.out.println("------------");
	        	System.out.println("One of the Arraylist parameter is null");
	        	return false;
	        }
	        if(a1.isEmpty()==true || a2.isEmpty()==true) {
	        	System.out.println("------------");
	        	System.out.println("One of the Arraylist is empty");
	        	return false;
	        }
	        	
	       
	  
	        for (int x : a1) {
	          if (x == num1) {
	        	  occur1++;
	          }
	        }
	        for (int i : a2) {
	            if (i == num2) {
	            	occur2++;
	            }
	        }
	        if(occur1==0 || occur2==0) {
	        	System.out.println("------------");
	        	System.out.println("One of the integer paramaters are not in the Arraylist");
	        	return false;
	        
	        }
	        
	        
	        else if(occur1==occur2) {
	        	System.out.println("---------------");
	        	System.out.println("Occurrences are equal");
	        	return true;
	        }
	        else {
	        	System.out.println("---------------");
	        	System.out.println("Occurrences are not equal");
	        	return false;
	        }
	        
	      }
	
		
	    public static void main( String[] args )
	    {
	       
	        ArrayList<Integer> x = new ArrayList<>(); 
	        x.add(1); 
	        x.add(2); 
	        x.add(3); 
	        x.add(1); 
	        x.add(1); 
	        
	        ArrayList<Integer> y = new ArrayList<>(); 
	        y.add(1); 
	        y.add(2); 
	        y.add(4); 
	        y.add(4); 
	        y.add(3);
	        y.add(4);
	        
	        System.out.println("Integer parameters must be in the ArrayLists");
	        
	        App.countOccur(x, y,1,4);
	    }
	}
