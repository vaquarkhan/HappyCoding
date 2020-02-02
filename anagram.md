			package com.khan.vaquar.example;

			import java.util.Arrays;

			public class anagram {

				public static void main(String[] args) {
					 String ana1="vaquar   khan";
					 String ana2="rauqav             Khan";
					 
					         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


					        Scanner scan = new Scanner(System.in);
                                                  String str1 = scan.next();
                                                  String str2 = scan.next();
                                                 scan.close();
	
					 
					String  str1 = ana1.replaceAll("\\s+", "");  // for multiple white spaces
					String  str2 = ana2.replaceAll("\\s+", "");  // for multiple white spaces

					System.out.println( isAnagram(str1 ,str2));
					
				}
				
				
				private static boolean isAnagram(String input1 , String input2) {
					
					input1=input1.toLowerCase();
					input2=input2.toLowerCase();

					
					char a[]= input1.toCharArray();
					Arrays.sort(a);
					char b[]= input2.toCharArray();
					Arrays.sort(b);

					//
					System.out.println("a="+a.length);
					System.out.println("b="+b.length);
					//
					if(a.length !=b.length) {
						System.out.println("not matched length");
						return false;
					}
					
					
					
					for (int i = 0; i < a.length; i++) 
						if (a[i] != b[i]) 
							return false; 

					
					
					return true;
				}
				

			}
