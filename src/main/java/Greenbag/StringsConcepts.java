package Greenbag;

public class StringsConcepts {
	
	String name =" sathish kumar R ";
	String secondname="sathish Kumar R";
	String age="";
	
	
	public void stringhandle()
	{
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		for (int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		System.out.println(name.compareTo(secondname));
		System.out.println(name.equals(secondname));
		System.out.println(name.equalsIgnoreCase(secondname));
		System.out.println(name.startsWith("athis"));
		System.out.println(name.endsWith("athis"));
		System.out.println(name.contains("athis"));
		System.out.println(age.isEmpty());
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name+secondname);
		System.out.println(name.concat(secondname));
		System.out.println(name.replaceAll("zsd","A"));
		String[] newarray=name.split("\s");
		for(String eachvalue : newarray)
		{
			System.out.println(eachvalue);
		}
		System.out.println(name.substring(1,4));
		System.out.println(name.substring(4));
		char[] n=name.toCharArray();
		for(char eachvalue : n)
		{
			System.out.println(eachvalue);
		}
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsConcepts s = new StringsConcepts();
		s.stringhandle();
	}

}
