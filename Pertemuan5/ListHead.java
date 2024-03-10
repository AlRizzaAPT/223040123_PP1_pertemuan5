package Pertemuan5;

public class ListHead {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(null);
        System.out.println("LATIHAN 4");
        list.addHead(2.0);
        list.addMid(6.0, 2);
        list.addMid(3.0, 3);
        list.addMid(5.0, 4);
        list.addTail(1.0);
        list.displayElement();
        System.out.println("\nHapus elemen di akhir list : ");
        list.removeTail();
        list.displayElement();
        System.out.println("\nHapus elemen di depan list : ");
        list.removeHead(); // Memanggil metode removeHead() untuk menghapus elemen di depan list
        list.displayElement();
    }
}
