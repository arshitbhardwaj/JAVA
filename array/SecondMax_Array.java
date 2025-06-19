public class SecondMax_Array {
    public static void main(String[] args) {
        int[] arr = {22, 55, 43, 66, 78, 99};
        int fMax = arr[0];
        int sMax = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(fMax < arr[i]){
                sMax = fMax;
                fMax = arr[i];
            }

            else if( sMax < arr[i] && arr[i] != fMax){
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
    }
    
}
