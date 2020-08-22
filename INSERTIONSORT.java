package datastructure;

public class INSERTIONSORT {
	void sort(int ar[]) 
    { 
        int n = ar.length; 
        for (int i = 1; i < n; ++i) { 
            int key = ar[i]; 
            int j = i - 1; 
  
            
            while (j >= 0 && ar[j] > key) { 
                ar[j + 1] = ar[j]; 
                j = j - 1; 
            } 
            ar[j + 1] = key; 
        } 
    } 
  
   
    static void printsort(int ar[]) 
    { 
        int n = ar.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(ar[i] + " "); 
  
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int AR[] = { 48, 23, 69, 33, 1 }; 
  
        INSERTIONSORT T = new INSERTIONSORT(); 
        T.sort(AR); 
  
        printsort(AR); 

}
}
