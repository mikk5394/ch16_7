package ch16;
/*
Write a method called deleteBack that deletes the last value (the value at the back of the list)
and returns the deleted value. If the list is empty, throw a NoSuchElementException.
 */
public class ch16_7 {
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(18);
        liste.add(2);
        liste.add(7);
        liste.add(18);
        liste.add(39);
        liste.add(18);
        liste.add(40);
        System.out.println("liste før metodekaldet: " + liste);
        System.out.println("tal som fjernes: " + liste.deleteBack());
        System.out.println("liste efter metodekaldet: " + liste);
    }
    /*
    Kaldte metode:

    public int deleteBack() {

        ListNode current = front;
        int deletedNodeData = 0;
        int lastIndex = 0;

        //Smider en exception hvis listen er tom.
        if (front == null) {
            throw new NoSuchElementException();
        }
        //Hopper ned i bagenden af alle nodesne og laver samtidig en tæller til at finde frem til den
        //sidste nodes index (for senere at kunne fjerne den).
        while (current.next != null) {
            current = current.next;
            lastIndex++;
        }
        //Sætter hermed min variabel til at indeholde dataen fra sidste node
        deletedNodeData = current.data;
        //Sletter derefter sidste node
        remove(lastIndex);
        return deletedNodeData;
    }
     */
}
