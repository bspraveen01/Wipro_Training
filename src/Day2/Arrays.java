package Day2;


// Array is a collection elements of same data type. stored in contiguos memory locations. Arrays are fixed in size.
public class Arrays {
        public static void main(String[] args) {
        	// single dimensional Array
        	
        	int[] arr = {10,20,30,40};
        	
        	for(int i=0;i<arr.length;i++) {
        		System.out.print(arr[i]+" ");
        	}
        	
        	System.out.println();
        	
        	// by using new keyword to create an array
        	int[] array = new int[5];
        	array[0]=56;
        	array[1]=97;
        	array[2]=65;
        	array[3]=13;
        	array[4]=44;
        	for(int i=0;i<array.length;i++) {
        		System.out.print(array[i]);
        	}
        	
        	System.out.println();
        	
        	
        	// Sum of Array Elements
        	
        	int sum=0;
        	int[] are = {12,76,98,45,87};
        	for(int i=0;i<are.length;i++) {
        		sum=sum+are[i];
        	}
        	System.out.print("Sum of Array:"+sum);
        	
        	System.out.println();
        	
        	// maximum Array element:
        	int[] arry= {24,63,12,98,56};
        	int max =arr[0];
        	for(int i=0;i<arry.length;i++) {
        		if(arry[i]>max) {
        			max = arry[i];
        		}
        		
        	}
        	System.out.println("array ele maximum :"+max);
        	System.out.println();
        	
        	// two dimensional Array using for each loop
        	int[][] rr = {{1,2,3,4},{1,2,3}};
        	for(int[] x : rr) {
        	    for(int y : x) {
        	        System.out.print(y);
        	    }
        	    
        	    System.out.println();
        	}
        	
        	// two dimensional Array using for loop
        	int [][]pre =  {{1,2,3,4},{1,2,3}};
        	for(int i=0;i<pre.length;i++) { // for rows;
        		for(int j=0;j<pre[i].length;j++) {
        			System.out.print(pre[i][j]+" ");
        		}
        		System.out.println();
        	}

        }
}

/* Array types :
1. 1D Array : single row of elements
2. 2D Array : Table like structure 
3. Jagged Array : Array of arrays with different lengths;
*/