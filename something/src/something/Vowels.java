package something;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowels {
public static int findVowels(String st) {
int count=0;
for(int i=0;i<st.length();i++)
{
if (st.charAt(i)=='a'||st.charAt(i)=='e'||
st.charAt(i)=='i'||st.charAt(i)=='o'||
st.charAt(i)=='u') 
{
count++;
}
}return count;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String s = sc.nextLine();
int max=0,temp=0;
String s1=" ",s2=" ";
StringTokenizer st = new StringTokenizer(s);
int j =st.countTokens();
        while(st.hasMoreTokens()) 
        {
        s1 =st.nextToken();
        temp = Vowels.findVowels(s1);
        if(max<temp) 
        	{
        	max = temp;
        	}
        }
System.out.println(max+" "+s2);
}
}