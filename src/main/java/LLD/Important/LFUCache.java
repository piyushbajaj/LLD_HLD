package LLD.Important;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: DSAlgo
 * Package: LLD.Important.LLD
 * <p>
 * User: piyushbajaj
 * Date: 22/07/24
 * Time: 9:12 pm
 */
public class LFUCache {

    static class DLLNode {
        int key;
        int value;
        DLLNode prev, next;


        public DLLNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    int capacity;
    DLLNode head, tail;
    //Store the element along-with node
    Map<Integer, DLLNode> hashMapDLLNode;

    // Store Frequency along-with DLL
    Map<Integer, DLLNode> hashMapFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        head = new DLLNode(0, 0);
        tail = new DLLNode(0, 0);
        head.next = tail;
        tail.prev = head;

        hashMapDLLNode = new HashMap<>();
        hashMapFrequency = new HashMap<>();
    }

    public int get(int key) {
        return -1;
    }

    public void put(int key, int value) {
        // Insert item in the hashMapDLLNode
    }

    public static void main(String[] args) {

    }
}
