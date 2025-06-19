package Queue;

public class Queue {
    int front, rear, max;
    int[] que;
    Queue(int size){
        front=-1;
        rear=-1;
        max=size;
        que=new int[max];
    }
    public void add(int d){
        if(rear==max-1){
            System.out.println("queue is full");
            return;
        }
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
            que[rear]=d;
            return;

        }
        rear++;
        que[rear]=d;
    }
    public void printList(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front; i<=rear;i++){
            System.out.println(que[i]+" ");
        }
    }
    public static void main(String[] args) {
        Queue list=new Queue(10);
        list.printList();
        System.out.println();
        list.add(1);

    }
    
}
