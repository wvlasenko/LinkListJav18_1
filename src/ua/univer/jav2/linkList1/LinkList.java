package ua.univer.jav2.linkList1;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, String name) {
        Link newLink = new Link(id, name);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link prew = first; // сохранение ссылки
        first = first.next;
        return prew;
    }

    public void displayList() {
        System.out.println("List ( first -->last):");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;

        }
        System.out.println(" ");
    }
}