import java.util.*;
public class LongestWord{
	public static String FindLongest(String s){
		if(s == null && s.isEmpty()){
		return "";
		}
		String[] str = s.split("\\s+");
		String longestword = "";
		for(String word : str){
		if(word.length() > longestword.length()){
	        longestword = word;			
}}
	return longestword;
	
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();

	System.out.println(FindLongest(s));
}
}
