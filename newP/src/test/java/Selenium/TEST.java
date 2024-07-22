package Selenium;

import java.util.HashMap;

public class TEST {

	public static void main(String[] args) {
		String s="Selenium";
	       char s1[]=s.toCharArray();
	      
	      HashMap<Character, Integer> map=new HashMap<>();
	      
	      
	      for(int i=0;i<=s1.length-1;i++)
	      {
	          if(!map.containsKey(s1[i]))
	          {
	          //map.put(map.get(s1[i]), 1);
	        	  map.put(s1[i], 1);
	          }
	          else
	          {
	              //map.put((s1[i])+1);
	        	  map.put(s1[i], map.get(s1[i])+1);
	          }
	      }
	      
	      for(char s2:map.keySet())
	      {
	          System.out.println(s2+" contains "+ map.get(s2)+" times");
	      }

	}

}
