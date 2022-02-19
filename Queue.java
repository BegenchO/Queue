class Queue {
    Node front, rear;
    
    Queue() {
        this.front = this.rear = null;    
    }
    
    void enqueue(int data) {
        Node temp = new Node(data);
        
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    
    void displayAll() {
         
         Node current = front;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
     }
    
} // end class