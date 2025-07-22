package Day2;

public class MaxAndMin {
     public static void main(String[] args) {
    	 int[] arr = {12,44,23,87,56,74};
    	 int max = arr[0];
    	 int min = arr[0];
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]>max) {
    			 max = arr[i];
    		 }else if(arr[i]<min) {
    			 min=arr[i];
    		 }
    		 
    	 }
    	 System.out.println("max value :"+max);
		 System.out.println("min value :"+min);
     }
}
