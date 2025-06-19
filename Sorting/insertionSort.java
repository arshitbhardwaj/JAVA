public class insertionSort {
    public static void sort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int j = i - 1;
            while (j >= 0 && curr < a[j]) {
                a[j + 1] = a[j];
            }
            a[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
         int a[]={22,66,55,11,88,99,77};
         sort(a);
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
        
    }
}

         
 
