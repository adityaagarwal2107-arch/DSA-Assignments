class Main {
    int queue[] ={10, 20, 30, 40, 50};
    int front=0, rear=4;

    void dequeue(){
        if (front>rear) {
            System.out.println("Queue Underflow");
        }
        else{
            System.out.println("Deleted Element: "+ queue[front]);
            front++;
        }
    }
    void display(){
        for (int i=front; i<=rear; i++) {
            System.out.print(queue[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Main q = new Main();

        q.dequeue();

        System.out.print("Queue: ");
        q.display();
    }
}
