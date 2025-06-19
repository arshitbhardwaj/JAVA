public class Intersection_array{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,3};
        int[] arr2={1,3,4,3};
        System.out.println("Enter the no. of elements:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && arr2[j]!=-1){
                    arr2[j]=-1;
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

}