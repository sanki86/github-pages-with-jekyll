package test;

import java.util.HashMap;

public class count {
	public static void main(String[] args) {
		String abc ="Hi this is sanki plus muthu8";
		String []split= abc.split("");
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<split.length-1;i++) {
			if (map.containsKey(split[i])){
				int mapCount= map.get(split[i]);
				map.put(split[i],mapCount+1);
			}
			else {
				map.put(split[i],1);
			}
			System.out.println(map);
		}
		}
}
 