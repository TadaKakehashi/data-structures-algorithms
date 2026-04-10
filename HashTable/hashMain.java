package HashTable;

public class hashMain {
    public static void main(String[] args) {
        hashTable myHashTable = new hashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();
        System.out.println("--------------------------");
        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("paint"));
        System.out.println("--------------------------");
        System.out.println(myHashTable.key());
    }
}
