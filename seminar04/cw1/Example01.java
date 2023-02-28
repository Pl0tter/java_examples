package org.example.seminar04.cw1;

import org.example.seminar04.cw1.model.ListNode;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode head = new ListNode(scanner.nextInt());
        ListNode temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(scanner.nextInt());
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            System.out.print("->" + temp.val);
            temp = temp.next;
        }
        System.out.println("\n reverseList: ");
        ListNode reverse = reverseList(head);
        while (reverse != null) {
            System.out.print("->" + reverse.val);
            reverse = reverse.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextElem = current.next;
            current.next = pred;
            pred = current;
            current = nextElem;
        }
        return pred;
    }
}
