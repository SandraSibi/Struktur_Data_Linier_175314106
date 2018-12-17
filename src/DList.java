

public class DList {

    private DListNode head = new DListNode();

    public DList() {
        head.setNext(head);
        head.setPrev(head);
    }

    public void addPertama(int a) {
        addBefore(a, head.next);
    }

    public void addTerakhir(int a) {
        addBefore(a, head);
    }

    private DListNode addBefore(int data, DListNode bantu) {
        DListNode baru = new DListNode(data);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.getPrev().setNext(baru);
        bantu.setPrev(baru);
        return baru;
    }

    public int removePertama() {
        return remove(head.getNext());
    }

    public int removeTerkahir() {
        return remove(head.getPrev());
    }

    public int remove(DListNode bantu) {
        bantu.getPrev().setNext(bantu.getNext());
        bantu.getNext().setPrev(bantu.getPrev());
        bantu.setNext(null);
        bantu.setPrev(null);
        return bantu.getElemen();
    }

    public boolean isEmpty() {
        if (head.getNext() == head) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String isi = "[";
        if (!isEmpty()) {
            DListNode pointer = head.getNext();
            isi += pointer.getElemen();
            pointer = pointer.getNext();
            while (pointer != head) {
                isi = isi + ", " + pointer.getElemen();
                pointer = pointer.getNext();
            }
        }
        return (isi += "]");
    }
}
