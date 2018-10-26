public class ListElement {

   private ListElement next;

   private ListElement previous;

   private int data;

   public ListElement(){

       this.data = 0;

       this.next = null;

       this . previous = null ; }
   
   public static void main(String args[]){
		
	ListElement single = new ListElement();
	single.setData(0);
	System.out.println(single.getData());
	}

   public void setData(int data) {

       this.data = data;

       }

   public int getData () {

       return this . data ;

       }

   public ListElement getNext() {

       return next;

   }

   public ListElement getPrevious() {

       return previous;

   }

   public void setNext(ListElement next) {

       this.next = next;

   }

   public void setPrevious(ListElement previous) {

       this.previous = previous;

   }
}
