package Day2;

import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
    	int[] arr = {12,54,87,23,35};
    	Arrays.sort(arr);
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr.length;j++) {
    			int temp=0;
    			if(arr[i]>arr[j]) {
    				temp =arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}
