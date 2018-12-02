class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList{
    constructor(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    push(data){
        let newNode = new Node(data);
        if(this.size === 0){
            this.head = newNode;
        }else{
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
        return this;
    }
    
}
