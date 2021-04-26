//package net.kzn.shoppingbackend;
//
//public class test {
//	
//	
//	
//		  public static void main(String[] args){
//		    int[] a = new int[100];
//		    a[0] = 1;
//		    a[1] = 5;
//		    a[2] = 7;
//		    a[3] = 4;
//		    a[4] = 1;
//		    a[5] = 2;
//		   solution(a);
//		  }
//		  
//		public static void solution(int[] a){
//		   int max = 0;
//		   int min = 0;
//		   
//		   for (int i=0; i<a.length; i++)
//		{
//		  if (max<a[i]){
//		    max = a[i];
//		  }
//		  if (min>a[i]){
//			    min = a[i];
//			  }
//		}
//
//		for (int j=min + 1; j<max; j++)
//		{
//			for (int m=0; m<a.length; m++) {
//				if(j != a[m] && j != 0 && m>a.length-1) {
//					System.out.println(j);
//					break;
//					//count logic should work
//				}
//			}
//		 
//		}
//
//		 
//		}
//		}
//	
//	
//
//
