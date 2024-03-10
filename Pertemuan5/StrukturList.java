package Pertemuan5;

public class StrukturList {

    private Node HEAD; // Node yang menunjukkan kepala dari linked list

    public StrukturList(Node HEAD) {
        this.HEAD = HEAD; // Menginisialisasi kepala linked list
    }

    // Menambahkan elemen di akhir linked list
    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;

            // Menemukan posisi terakhir dalam linked list
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }

            // Menambahkan elemen baru di akhir linked list
            posNode.setNext(newNode);
        }
    }
    
    // Menambahkan elemen di awal linked list
    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            newNode.next = HEAD;
            HEAD = newNode; // Mengubah kepala linked list menjadi elemen baru
        }
    }

    // Menambahkan elemen di tengah linked list pada posisi tertentu
    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode; // Jika linked list kosong, elemen baru menjadi kepala
        } else {
            Node posNode = null;
            Node curNode = HEAD;
            int i = 1;
            if (position == 1) { // Jika memasukkan di awal
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                // Menemukan posisi yang dimaksud
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                // Menambahkan elemen baru di posisi yang dimaksud
                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }

    // Mengecek apakah linked list kosong
    private boolean isEmpty() {
        return HEAD == null;
    }
    
    // Menampilkan semua elemen dalam linked list
    public void displayElement() {
        Node curNode = HEAD;

        while (curNode != null) {
            System.out.print(curNode.getData() + " "); // Menampilkan data dari setiap elemen
            curNode = curNode.getNext(); // Pindah ke elemen berikutnya
        }
    }  
    
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            HEAD = HEAD.getNext();
        }
    }
  
    //fungsi remove Tail List
    public void removeTail() {
        Node preNode = null;
        Node lastNode = null;

        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                lastNode.setNext(null);
                lastNode = null;
            }
        }
    }

    //fungsi remove mid
    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu == true) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }


    //menampilkan isi linked list
    public void displayElement1() {
        Node curNode = HEAD;

        while(curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
