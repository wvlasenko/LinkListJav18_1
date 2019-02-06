package ua.univer.jav2.linkList1;

public class Link {
    public int iData;
    public String name;
    public Link next;

    public Link(int id, String name) {
        this.iData = id;
        this.name = name;
    }

    public void displayLink() {
        System.out.println("{" + iData + "," + name + "}");
    }

    @Override
    public String toString() {
        return "Link{" +
                "iData=" + iData +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}