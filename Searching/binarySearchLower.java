public class binarySearchLower {
    public static void Search(int a2[],int first, int last, int key ){
        int mid=(first+last)/2;
        while(first<last){
            if(a2[mid]<key){
                first=mid+1;
            }else{
                last = mid;
            }        
            System.out.println(first);
        }
    }
    public static void main(String[] args) {
        int a2[] = {2,4,6,8,10,12,14,7};
        int key = 7;
        int last = a2.length;
        Search(a2,0,last,key);
    }
}
