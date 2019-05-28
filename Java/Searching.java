import java.util.Arrays;
import java.util.Scanner;

public class Searching {

    public static int linearSearch(int arr[], int n, int x) 
    { 
        for (int i = 0; i < n; i++) {   // Linear search here is iterative, not recursive
            // Return the index of the element if the element is found 
            if (arr[i] == x) 
                return i; 
        } 
  
        // return -1 if the element is not found 
        return -1; 
    } 
  
    public static int binaryRecursiveSearch(int arr[], int first, int last, int key){  
        if (last >= first){  
            int mid = first + (last - first) / 2;   // Dividing by 2 because binary to get the index in the middle of the array
            if (arr[mid] == key){      // After trial and error, this if statement will finally return the index of the integer
               return mid;            
            }  
            if (arr[mid] > key){  
               return binaryRecursiveSearch(arr, first, mid-1, key); // Search in left subarray  
            } else {  
               return binaryRecursiveSearch(arr, mid+1, last, key); // Search in right subarray  
            }  
        }  
        return -1;  
    }  
    
    public static int binaryIterativeSearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was not present 
        return -1; 
    } 
    
    public static int ternarySearch(int l, int r, int key, int ar[]) 
    { 
        if (r >= l) { 
  
            // Find the mid1 nad mid2 
            int mid1 = l + (r - l) / 3; 
            int mid2 = r - (r - l) / 3; 
  
            // Check if key is present at any mid 
            if (ar[mid1] == key) { 
                return mid1; 
            } 
            if (ar[mid2] == key) { 
                return mid2; 
            } 
  
            // Since key is not present at mid, 
            // check in which region it is present 
            // then repeat the Search operation 
            // in that region 
  
            if (key < ar[mid1]) { 
  
                // The key lies in between l and mid1 
                return ternarySearch(l, mid1 - 1, key, ar); 
            } 
            else if (key > ar[mid2]) { 
  
                // The key lies in between mid2 and r 
                return ternarySearch(mid2 + 1, r, key, ar); 
            } 
            else { 
  
                // The key lies in between mid1 and mid2 
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar); 
            } 
        } 
  
        // Key not found 
        return -1; 
    } 
    
    // whitelist, exception filter
    public static void main(String[] args) {
      try {
        // Get user input to know what and how many elements will be in array
        int arrayLength, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("How many integers will be in the array? ");
        arrayLength = s.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter all the integers, all separated by spaces or by pressing Enter key after each number for next box: ");
        for(int i = 0; i < arrayLength; i++)
            arr[i] = s.nextInt();
        System.out.println("Enter integer # of array you inputted that you want to find the sorted position of: ");
        int key = s.nextInt();
        
        // Using our custom-built linearSearch() function, which utilizes recursion

        int index = linearSearch(arr, arrayLength, key); 
        if (index == -1) 
            System.out.println("Linear search says the element is not present in the array."); 
        else
            System.out.println("Linear search found the integer " + key + " at index #" + index); 
      
        // Using our custom-built binaryRecursiveSearch() function, which utilizes recursion
        
        int last = arrayLength-1;  // Accomodating for the index of arrays starting at 0, not 1
        int result = binaryRecursiveSearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Recursive binary search says the element is not present in the array.");  
        else  
            System.out.println("Recursive binary search found the integer " + key + " at index #" + result);
        
        // Using our custom-built binaryIterativeSearch() function, which utilizes iteration
        
        BinarySearch ob = new BinarySearch();  // Utilizing object-oriented programming this time
        int result2 = ob.binaryIterativeSearch(arr, key);  // Notice the length of the array is not needed as an argument to this function
        if (result2 == -1) 
            System.out.println("Iterative binary search says the element is not present in the array."); 
        else
            System.out.println("Iterative binary search found the integer " + key + " at index #" + result2); 
      
        // Using Java's built-in Arrays.binarySearch() method
        Arrays.sort(arr);
        System.out.println("Java's built-in Arrays.binarySearch() method found the integer " + key + " at index #"
                           +Arrays.binarySearch(arr, key)); 
        
        // Using the ternary search function we made, which utilizes recursion
        int p = ternarySearch(0, arrayLength, key, arr); 
        if (p == -1)
          System.out.println("Ternary search says the element is not present in the array.");
        else
          System.out.println("Ternary search found the integer " + key +  " at index #" + p); // Print the result
      }
      catch (Exception er)
      {
         System.out.println("Error: " + er.getMessage());
      }
    }
}