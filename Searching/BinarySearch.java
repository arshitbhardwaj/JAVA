public class BinarySearch{
    public static void search(int a[], int first, int last, int key)
    {
        int mid=(first+last)/2;
        while(first<=last){
            if(a[mid]<key){
                first=mid+1;
            }
            else if(a[mid]==key){
                System.out.print("Element is found at index:"+mid);
                break;
            }
            else{
                last=mid-1;
                
            }
            mid=(first+last)/2;
            
        }
        if(first>last){
            System.out.print("Element not found:");
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int key=20;
        int last=a.length-1;
        search(a,0,last,key);
    }
}