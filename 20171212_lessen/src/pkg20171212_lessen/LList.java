package pkg20171212_lessen;

public class LList implements iList{

    Node parent;

    @Override
    public void add(int x) {
        Node a = new Node();
        a.x = x;

        if (parent == null) {
            parent = a;
        } else {
            a.next = parent;
            parent = a;
        }
        
        Singleton.addCount(x);
        
    }
    
    public void print(){
        Node a = parent;
        while(a != null){
            System.out.print(a.x+" ");
            a = a.next;
        }
    }

    @Override
    public int size() {
        int s = 0;
        Node a = parent;
        
        while(a != null)
        {
            s++;
            a = a.next;
        }
        
        return s;
    }

    @Override
    public void delete(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get(int aIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}