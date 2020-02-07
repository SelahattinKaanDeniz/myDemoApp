	
	package com.mycompany.app;
	
	import java.util.ArrayList;
	import static spark.Spark.get;
	import static spark.Spark.port;
	import static spark.Spark.post;
	import java.util.HashMap;
	import java.util.Map;
	import spark.ModelAndView;
	import spark.template.mustache.MustacheTemplateEngine;

	
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
	    	 port(getHerokuAssignedPort());
	    	 get("/", (req, res) -> "Counting Occurences");
	    	 post("/compute", (req, res) -> {
	             //System.out.println(req.queryParams("input1"));
	             //System.out.println(req.queryParams("input2"));

	             String input1 = req.queryParams("input1");
	             java.util.Scanner sc1 = new java.util.Scanner(input1);
	             sc1.useDelimiter("[;\r\n]+");
	             java.util.ArrayList<Integer> inputList1 = new java.util.ArrayList<>();
	             while (sc1.hasNext())
	             {
	               int value1 = Integer.parseInt(sc1.next().replaceAll("\\s",""));
	               inputList1.add(value1);
	             }
	             String input2 = req.queryParams("input2");
	             java.util.Scanner sc2 = new java.util.Scanner(input2);
	             sc2.useDelimiter("[;\r\n]+");
	             java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
	             while (sc2.hasNext())
	             {
	               int value2 = Integer.parseInt(sc2.next().replaceAll("\\s",""));
	               inputList2.add(value2);
	             }
	             String int1 = req.queryParams("int1").replaceAll("\\s","");
	             int int1AsInt = Integer.parseInt(int1);
	             String int2 = req.queryParams("int2").replaceAll("\\s","");
	             int int2AsInt = Integer.parseInt(int2);	
	             boolean result = App.countOccur(inputList1,inputList2,int1AsInt,int2AsInt);

	             Map map = new HashMap();
	              map.put("result", result);
	              return new ModelAndView(map, "compute.mustache");
	            }, new MustacheTemplateEngine());




	        
	    }
	    static int getHerokuAssignedPort() {
	        ProcessBuilder processBuilder = new ProcessBuilder();
	        if (processBuilder.environment().get("PORT") != null) {
	            return Integer.parseInt(processBuilder.environment().get("PORT"));
	        }
	        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
	    }


	}
