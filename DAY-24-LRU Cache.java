class LRUCache {
       class Node{
           int key;
           int val;
           Node prev;
           Node next;
       }
    
      final Node head=new Node();
    final Node tail= new Node();
    int cap;
    HashMap<Integer,Node> mapc;
    public LRUCache(int capacity) {
        head.next=tail;
        tail.prev=head;
        mapc = new HashMap(capacity);
        cap=capacity;
    }
    
    public int get(int key) {
        int res=-1;
        Node node=mapc.get(key);
        if(node!=null){
            res=node.val;
            remove(node);
            add(node); 
        }
        return res;
    }
    
    public void put(int key, int value) {
        Node node=mapc.get(key);
        if(node!=null){
            remove(node);
            node.val=value;
            add(node);
        }else{
            if(mapc.size()==cap){
                mapc.remove(tail.prev.key);
                 remove(tail.prev);
            }
            
            Node newnode=new Node();
            newnode.key=key;
            newnode.val=value;
            add(newnode);
            mapc.put(key,newnode);
        }
    }
    
    public void add(Node n){
        Node head_next=head.next;
        n.next=head_next;
        head.next=n;;
        n.prev=head;
        head_next.prev=n;
    }
    
    public void remove(Node n ){
        Node n_next=n.next;
        Node n_prev=n.prev;
        
        n_next.prev=n_prev;
        n_prev.next=n_next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
