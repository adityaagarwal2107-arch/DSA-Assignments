class Main{
    int queue[]=new int[5];
    int front=0,rear= -1;

    void enqueue(int x) {
        if(rear==4) {
            System.out.println("Queue Overflow");
        }else{
            rear++;
            queue[rear] = x;
        }
    }

    void dequeue(){
        if (front>rear){
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println("Deleted Element: " + queue[front]);
            front++;
        }
    }
    void display() {
        for(int i=front; i <=rear;i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    void getFront(){
        if(front > rear)
            System.out.println("Queue is Empty");
        else
            System.out.println("Front: "+queue[front]);
    }
    void getRear() {
        if(front > rear)
            System.out.println("Queue is Empty");
        else
            System.out.println("Rear: " + queue[rear]);
    }

    public static void main(String[] args) {
        Main q =new Main();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();

        q.enqueue(40);
        q.enqueue(50);
        System.out.print("Queue: ");
        q.display();
        q.getFront();
        q.getRear();
    }
}
