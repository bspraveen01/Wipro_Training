package Day2;

public class SearchElement {
   public static int searchElement(int[] arr, int k) {
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==k) {
			   return i;
		   }
	   }
	   return -1;
   }
   public static void main(String[] args) {
	   int arr[] = {12,43,65,73,89};
	   int k=65;
	   int res = searchElement(arr, k);
	   if(res==-1) {
		   System.out.println("does not exist");
	   }else {
		   System.out.println(res);
	   }
   }
}


/* Another method for search Element.
 *  class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

 */