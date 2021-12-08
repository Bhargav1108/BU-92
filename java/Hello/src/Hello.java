
	 import java.lang.*;
	 import java.util.*;
	 class HelloWorld {
		  public static void main(String[] args) {
	     void processArray(int b[]){
	         for(int i=0;i<b.length;i++){
	             if(b[i]==6){
	                 b[i]=-5;
	             }
	             else if(b[i]>48){
	                 b[i]=-3;
	             }
	             else{
	                 System.out.println("");
	             }
	         }
	         for(int j:b){
	             System.out.println(j);
	         }
	     }
	   
	        
	        int n=10;
	        int[] arr=new int[n];
	        Scanner s=new Scanner(System.in);
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	            if(arr[i]<0){
	                break;
	            }
	        }
	        HelloWorld h=new HelloWorld();
	        h.processArray(arr);
	        
	        
	     }
	
	}	

