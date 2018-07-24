import java.util.Scanner;
public class reversestring {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a,s1,reverse="";
	int i,l;
	a=sc.nextLine();
	String s[]=a.split(" ");
	l=s.length;
	for(i=0;i<l;i++){
		StringBuffer bu=new StringBuffer(s[i]);
		bu.reverse();
		reverse+=bu;
		if(i<s.length){
			reverse+=" ";
		}
	
	/*a=sc.next();
	StringBuffer bu=new StringBuffer(a);
	bu.reverse();
	System.out.println(bu);
	*/
}
	System.out.println(reverse);
}
}
