class Main {
    int queue[] ={15, 25, 35, 45, 55};
    int front=0, rear= 4;

    void getFront() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Front Element: " + queue[front]);
        }
    }

    public static void main(String[] args){
        Main q = new Main();

        q.getFront();
    }
}
