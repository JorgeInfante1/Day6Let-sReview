package com.day6letsreview.app;

public class Solution
{

	public static void main(String[] args) 
	{
		
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
		         *  Your class should be named Solution. */
		        String phrase = "Hacker";
		        String phrase1 = "Rank";
		        //char[] even = new char[10];
		        //char[] odd = new char[10];
		        
		        // Hacker Phrase
		        for(int i=0;i<phrase.length();i++)
		        {
		        	if(i%2==0)
		        	{
		        		char even = phrase.charAt(i);
		        		System.out.print(even);
		        		
		        	}
		        			        	
		        }
		        System.out.print(" ");
		        for(int i=0;i<phrase.length();i++)
		        {
		        	if(i%2==1)
		        	{
		        		char odd = phrase.charAt(i);
		        		System.out.print(odd);
		        	}
		        }
		        
		        //Rank Phrase
		        System.out.println("  ");
		        for (byte i=0;i<phrase1.length();i++)
		        {
		        	if(i%2==0)
		        	{
		        	char even1 = phrase1.charAt(i);
		        	System.out.print(even1);
		        	}
		        }
		        System.out.print(" ");
		        for (byte i=0;i<phrase1.length();i++)
		        {
		        	if(i%2==1)
		        	{
		        	char even1 = phrase1.charAt(i);
		        	System.out.print(even1);
		        	}
		        }

	}

}
