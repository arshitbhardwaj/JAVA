public class Stack {
    static int max;
    static int top;
    static int[] a;
    Stack(int size){
        top=-1;
        max=size;
        a=new int[max];

    }
    void push(int ele){
        if(top==max-1){
            System.out.println("stack is overflow");
            return;
        }
        top++;
        a[top]=ele;
    }
    void pop()
    {
        if(top==-1){
            System.out.println("stack is underflow");
            return;
        }
        System.out.println("deleted element is "+a[top]);
        top--;

    }
    public void print(){
        if(top==-1){
            
            return;
        }
        for(int i=top;i>=0;i--){

            System.out.println(a[i]);
        }
    }
    void peak(){
        System.out.println("peak element of stack is"+a[top]);
        return;


    }
    void isempty(){
        if(top==max-1);
        return;

    }
    public void search(int key){
        if(top==-1){
            System.out.println("underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            if(key==a[i]){
                System.out.println("Index is"+i);

            }
        }

    
    
    }
    public static void main(String[] args){
        Stack S1 = new Stack(10);
        S1.push(5);
        S1.push(9);
        S1.push(1);
        S1.print();
        S1.search(9);




    }

}


