class Main {
    int queue[]=new int[5];
    int front =0, rear=-1;
    void enqueue(int x){
        if (rear==4){
            System.out.println("Queue Overflow");
        }
        else{
            rear++;
            queue[rear] = x;
        }
    }

    void display(){
        for (int i=front; i<= rear;i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        Main q = new Main();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.print("Queue: ");
        q.display();
    }
}
