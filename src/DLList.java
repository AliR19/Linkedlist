public class DLList {

   private DLList head;
   private int data;
   private DLList next;
   private DLList previous;
   public DLList() {

       head = null;

   }

   public static void main(String[] args) {

      

       DLList list = new DLList();

       DLList l1 = new DLList();

       l1.setData(4);

       list.addElement(l1);

      

       list.printLinkedListHead();

       list.printLinkedListTail();

      

       DLList l2 = new DLList();

       l2.setData(6);

       list.addElement(l2);

       list.printLinkedListHead();

       list.printLinkedListTail();

      

       //list.deleteElement(1);

       list.printLinkedListHead();

       list.printLinkedListTail();

   }
   public void setData(int data1) {

       this.data = data1;

       }

   // add new node at head

   public void addElement(DLList le) {

       le.setNext(head);

       if(head != null) {

           head.setPrevious(le);

       }

       head = le;

   }

	public void setNext(DLList next1) {

	       this.next = next1;
	}
	public void setPrevious(DLList prev1) {
		this.previous = prev1;
	}
public DLList getNext() {
	return next;
}
public DLList getPrevious(){
	return next;
}
   public DLList getElement(int index) {

       if(head == null || index < 0)

           return null;

       int count = 0;

       DLList temp = head;

       while(temp != null && index <= count) {

           if(index == count)

               return temp;

           count++;

           temp =temp.getNext();
          

       }

       return null; // index is greater than totla element

   }

   public DLList deleteElement(int index) {

       if(head == null || index < 0)

           return null;

       if(index == 0) {

           DLList t = head;

           head = head.getNext();

           head.setPrevious(null);

           return t;

       }

       int count = 0;

       DLList temp = head;

       while(temp != null && count < index) {

           count++;

           temp =temp.getNext();      

       }

       if(temp == null)// index is greater than total element

           return null;

       temp.getPrevious().setNext(temp.getNext()); // setting next of previous of temp to next of temp

       // setting previous of next of temp to previous of temp

       if(temp.getNext() != null) {

           temp.getNext().setPrevious(temp.getPrevious());

       }

       return temp;

   }

   public void printLinkedListTail() {

       if(head == null)

           return;

       DLList t = head;

       // reaching to last element

       while(t.getNext() != null)

           t = t.getNext();

       // printing from last

       while(t != null) {

           System.out.print(t.getData()+" ");

           t = t.getPrevious();

       }

       System.out.println();

   }

   private String getData() {
	// TODO Auto-generated method stub
	return null;
}

public void printLinkedListHead() {

       if(head == null)

           return;

       DLList t = head;  

       // reaching to last element

       while(t != null){

           System.out.print(t.getData()+" ");

           t = t.getNext();

       }

       System.out.println();

   }

}



  

  