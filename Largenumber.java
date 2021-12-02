package com.sonata;
import java.util.Scanner;

public class Largenumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]= sc.nextInt();
    }
    int first=0,second=0;
    for(int i=0;i<n;i++) {
    	if(arr[i]>first)
    	{
    		second=first;
    		first=arr[i];
    	}
    		else if(arr[i]>second && arr[i]!=first)
    		{
    			second=arr[i];
    		}
    	}
    	System.out.println("First largest:"+first);
      	System.out.println("Second largest:"+second);
    
	
}
}
   