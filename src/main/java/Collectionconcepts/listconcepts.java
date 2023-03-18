package Collectionconcepts;

import java.util.*;
import java.util.Iterator;

public class listconcepts {
	
	
	public void arraylist()
	{
		//ArrayList<String> al = new ArrayList<>();
		LinkedList<String> al = new LinkedList<>();
		al.add("sathish");
		al.add("kumar");
		al.add("sathish");
		al.add("b.tech");
		al.remove(1);
		al.set(2, "B.TECH");
		al.sort(null);
		for (String eachvalue :  al)
		{
			System.out.println(eachvalue);
		}
		
		
		//or
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(al.size());
		Object clonearray = new ArrayList<>();
		clonearray = al.clone();
		al.clear();
		
	}
	
	
	public void setinterface()
	{
		//HashSet<String> al = new HashSet<>();
		//LinkedHashSet<String> al = new LinkedHashSet<>();
		TreeSet<String> al = new TreeSet<>();
		al.add("sathish");
		al.add("kumar");
		al.add("sathish");
		al.add("b.tech");
		al.add("address");
		al.add("DOB");
		al.add("");
		al.remove("kumar");
		for (String eachvalue :  al)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println(al.size());
		al.clear();
		al.clone();
		//or
		
		/*Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}
	
	public void mapconcepts()
	{
		//HashMap<String,String> al = new HashMap<>();
		//LinkedHashMap<String,String> al = new LinkedHashMap<>();
		TreeMap<String,String> al = new TreeMap<>();
		al.put("name", "sathish");
		al.put("username", "sathish");
		al.put("pwd", "password");
		al.put("role", "Admin");
		al.put("plc", "placehoilder");
		al.put("", "emptyvalue");
		al.remove("pwd");
		al.remove("role","Admin");
		System.out.println(al.isEmpty());
		
		System.out.println(al.keySet());
		System.out.println(al.values());
		System.out.println(al.get("username"));
		System.out.println(al.entrySet());
		
		for(Map.Entry m : al.entrySet())
		{
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
	}
	
	public static void main(String args[])
	{
		listconcepts l = new listconcepts();
		l.mapconcepts();
	}

}
