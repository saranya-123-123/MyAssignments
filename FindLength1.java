package week1.day2;

public class FindLength1 {

	public static void main(String[] args) {
		String s="Hello World";
		
//	int indexOf = s.indexOf(" World");
//	System.out.println(indexOf);
	
	String[] split = s.split(" ");
	int length = split.length;
		System.out.println(split[1].length());

}}



