class Main {
    int queue[]={5, 10, 15, 20, 25};
    int front=0, rear = 4;

    void getRear(){
        if (front> rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Rear Element: " + queue[rear]);
        }
    }
    public static void main(String[] args) {
        Main q = new Main();
        q.getRear();
    }
}
