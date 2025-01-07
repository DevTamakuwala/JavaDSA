package HashTable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);

        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        hashTable.printTable();
        System.out.println();
        System.out.println(hashTable.get("tile"));

        System.out.println(hashTable.keys());

    }
}