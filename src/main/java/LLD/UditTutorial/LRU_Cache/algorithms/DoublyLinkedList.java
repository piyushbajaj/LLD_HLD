package LLD.UditTutorial.LRU_Cache.algorithms;

import java.util.NoSuchElementException;

import LLD.UditTutorial.LRU_Cache.algorithms.exceptions.InvalidElementException;

/**
 * Project: DS_Algo
 * Package: LLD.UditTutorial.LRU_Cache.algorithms
 * <p>
 * User: piyushbajaj
 * Date: 13/03/23
 * Time: 2:31 pm
 */
public class DoublyLinkedList<E> {
    DoublyLinkedListNode<E> dummyHead;
    DoublyLinkedListNode<E> dummyTail;

    public DoublyLinkedList() {
        // We can instantiate these by null, since we are never gonna use val for these dummyNodes
        dummyHead = new DoublyLinkedListNode<>(null);
        dummyTail = new DoublyLinkedListNode<>(null);

        // Also Initially there are no items
        // so just join dummyHead and Tail, we can add items in between them easily.
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addElementAtLast(1);
        doublyLinkedList.addElementAtLast(2);
        doublyLinkedList.addElementAtLast(3);

        System.out.println(doublyLinkedList.getLastNode().element);

    }

    /**
     * Method to detach a random node from the doubly linked list. The node itself will not be removed from the memory.
     * Just that it will be removed from the list and becomes orphaned.
     *
     * @param node Node to be detached.
     */
    public void detachNode(DoublyLinkedListNode<E> node) {
        // Just Simply modifying the pointers.
        if (node != null) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    /**
     * Helper method to add a node at the end of the list.
     *
     * @param node Node to be added.
     */
    public void addNodeAtLast(DoublyLinkedListNode<E> node) {
        DoublyLinkedListNode<E> tailPrev = dummyTail.prev;
        tailPrev.next = node;
        node.next = dummyTail;
        dummyTail.prev = node;
        node.prev = tailPrev;
    }

    /**
     * Helper method to add an element at the end.
     *
     * @param element Element to be added.
     * @return Reference to new node created for the element.
     */
    public DoublyLinkedListNode<E> addElementAtLast(E element) {
        if (element == null) {
            throw new InvalidElementException();
        }
        DoublyLinkedListNode<E> newNode = new DoublyLinkedListNode<>(element);
        addNodeAtLast(newNode);
        return newNode;
    }

    public boolean isItemPresent() {
        return dummyHead.next == dummyTail;
    }

    public DoublyLinkedListNode<E> getFirstNode() throws NoSuchElementException {
        DoublyLinkedListNode<E> item = null;
        if (isItemPresent()) {
            return null;
        }
        return dummyHead.next;
    }

    public DoublyLinkedListNode<E> getLastNode() throws NoSuchElementException {
        DoublyLinkedListNode<E> item = null;
        if (isItemPresent()) {
            return null;
        }
        return dummyTail.prev;
    }
}
