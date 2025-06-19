public class subset {
    public static void main(String[] args) {
        int arr1[]={33,51,5,31,9,4,3};
        int arr2[]={51,9,33,3};
        int x=arr1.length;
        int y=arr2.length;
        if(subset(arr1,arr2,x,y)){
            System.out.print("array 2 is a subset of array 1");
            
        
        }else{
            System.out.print("array 2 is not the subset of array 1");
        }
    }
    static boolean subset(int arr1[], int arr2[], int x, int y){
        int i,j=0;
        for(i=0;i<y;i++){
            for(j=0;j<x;j++)
            if(arr2[i]==arr2[j])
            break;
            if(j==x)
            return false;
        }
        return true;
    }
    
}
