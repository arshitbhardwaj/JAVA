public class Max_Element {
    public static void main(String[] args) {
        int[] arr = {2,5,8,9,10};
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++ ){
            if( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
