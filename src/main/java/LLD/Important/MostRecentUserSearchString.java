package LLD.Important;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: DSAlgo
 * Package: LLD.Important.LLD
 * <p>
 * User: piyushbajaj
 * Date: 22/07/24
 * Time: 10:07 am
 */
public class MostRecentUserSearchString {

    static class DLLSearchNode {
        char key;
        DLLSearchNode prev, next;

        public DLLSearchNode(char key) {
            this.key = key;
        }
    }

    DLLSearchNode head;
    DLLSearchNode tail;
    Map<Character, DLLSearchNode> hashMap;
    final int capacity;

    public MostRecentUserSearchString(int cap) {
        head = new DLLSearchNode('0');
        tail = new DLLSearchNode('0');
        hashMap = new HashMap<>();
        capacity = cap;
        head.next = tail;
        tail.prev = head;
    }

    /**
     * TC: O(1)
     *
     * @param key
     * @return
     */
//    public char get(char key) {
//        if (!hashMap.containsKey(key)) {
//            return ' ';
//        }
//
//        DLLSearchNode curr = hashMap.get(key);
//        removeFromDLLMap(curr);
//        insertNodeDLLMap(curr);
//
//        return curr.key;
//    }

    /**
     * Remove element from the HashMap and DLL
     * TC: O(1)
     * SC: O(1)
     *
     * @param node
     */
    private void removeFromDLLMap(DLLSearchNode node) {
        hashMap.remove(node.key);
        // remove from the tail previous
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertNodeDLLMap(DLLSearchNode node) {
        hashMap.put(node.key, node);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void put(char key) {
        if (hashMap.containsKey(key)) {
            DLLSearchNode currNode = hashMap.get(key);

            // Bring this node upfront
            removeFromDLLMap(currNode);
        } else {
            if (hashMap.size() == capacity) {
                removeFromDLLMap(tail.prev);
            }
        }
        insertNodeDLLMap(new DLLSearchNode(key));
    }

    private void printHashMap() {
        System.out.println("HashMap => ");
        hashMap.forEach((key, value) -> System.out.println(key + ", " + value.key));
    }

    private void suggestions() {
        DLLSearchNode temp = head.next;
        System.out.print("Suggestions => ");

        if (temp == tail) {
            System.out.println("None");
            return;
        }
        while (temp != tail) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MostRecentUserSearchString p2LruCache = new MostRecentUserSearchString(4);
        p2LruCache.suggestions();
        char userInput1 = 'a';
        char userInput2 = 'b';
        char userInput3 = 'c';
        char userInput4 = 'd';
        char userInput5 = 'e';
        System.out.println("User Input: " + userInput1);
        p2LruCache.put('a');
        p2LruCache.suggestions();

        System.out.println("User Input: " + userInput2);
        p2LruCache.put(userInput2);
        p2LruCache.suggestions();

        System.out.println("User Input: " + userInput3);
        p2LruCache.put(userInput3);
        p2LruCache.suggestions();

        System.out.println("User Input: " + userInput4);
        p2LruCache.put(userInput4);
        p2LruCache.suggestions();

        System.out.println("User Input: " + userInput5);
        p2LruCache.put(userInput5);
        p2LruCache.suggestions();

        System.out.println("User Input: " + userInput2);
        p2LruCache.put(userInput2);
        p2LruCache.suggestions();

        p2LruCache.printHashMap();

    }
}
