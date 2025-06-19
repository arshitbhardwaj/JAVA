public class linearSearchString {
    public static void main(String[] args) {
        String s1[]={"Arshit", "Vikki", "Agrim","Rohan","Ram"};
        String key="Vikki";
        for(int i=0;i<s1.length;i++){
            if(s1[i]==key){
                System.out.println(i);
                return;
            }

        }
        System.out.println("not found");
    }
    
}
