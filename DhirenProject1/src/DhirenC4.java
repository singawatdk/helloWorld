/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {

public int lengthofLongestSubstring (String s){
if(s.length()==0){
return 0;
}
List<Character> substring = new ArrayList<>();
int max = 0;

for(int i = 0;i<s.length();i++){
if(substring.contains(s.charAt(i))){
substring.subList(0,substring.indexOf(s.charAt(i))+1).clear();
}
substring.add(s.charAt(i));
if(max<substring.size())
max = substring.size();
}
return max;
}
}

class DhirenC4 {
public static void main (String[] args){
Solution sol = new Solution();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the test cases :");
int t = sc.nextInt();
for(int i =0 ; i<t; i++)    //while(t-->0)
{
	String s1 = sc.nextLine();
	System.out.println(sol.lengthofLongestSubstring(s1));
	}
sc.close();
}
}