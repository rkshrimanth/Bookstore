package Selenium;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PPPP {
	
	
	public static void main(String[] args) throws IOException {
		
		String s="RAJANIKANTH";
		char ss[]=s.toCharArray();
		
		Map<Character,Integer> map= new LinkedHashMap<>();
		
		for(int i=0;i<=ss.length-1;i++)
		{
			if(!map.containsKey(ss[i]))
			{
				map.put(ss[i], 1);
			}
			else
			{
				map.put(ss[i], map.get(ss[i])+1);
			}
		}
		for(char x:map.keySet())
		{
		System.out.println(x+"  occurs  "+map.get(x)+"  times");
		}
	}
}
	


