package ua.univer.jav2.linkList1;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(1, "Pasha");
        theList.insertFirst(2, "Sasha");
        theList.insertFirst(3, "Misha");
        theList.insertFirst(4, "Grisha");
        theList.insertFirst(5, "Vasya");
        theList.insertFirst(6, "Masya");
        theList.displayList();

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            System.out.println("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}


