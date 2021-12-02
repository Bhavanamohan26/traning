package com.sonata;

public class Ovals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Welcome Onboarding";
		char ch[]=st.toCharArray();
   for (int i=0;i<ch.length;i++) {
	   if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	   {
		   ch[i]='$';
	   }
	   for(int i1=0;i1<ch.length;i1++) {
		   System.out.println(ch[i1]);
	   }
   }
	}
}


