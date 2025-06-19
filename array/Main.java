import java.util.Set;
public class Main{
    public static void main(String[] args) {
        int[] arr = {10, 22, 42, 54, 53, 98};
        Set<Integer> set = new TreeSet<Integer>();


        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(set);

        List<Integer> list = new ArrayList<Integer>(set);
        System.out.println(list.get(list.size() - 2));
    }
}