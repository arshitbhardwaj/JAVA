public class binarySearchString {
    public static void main(String[] args) {
        String[] s1 = { "Agrim","Arshit", "Dev", "Himanshu", "Ram", "Vikki", };
        String key = "Arshit";
        int first = 0;
        int last = s1.length;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (s1[mid] == key) {
                System.out.println(mid);
                return;
            }
            int check=key.compareTo(s1[mid]);
            if(check>0){
                first=mid+1;
            }
            if(check<0){
                last=mid-1;
            }
        }
    }

}
