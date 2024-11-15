package task1;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class RemoveDuplicates {
    public static void removeDuplicates(ListNode head) {
        if (head == null) return; // Если список пуст, ничего не делаем

        HashSet<Integer> seen = new HashSet<>(); // Множество для хранения уникальных значений
        ListNode current = head; // Указатель на текущий узел
        seen.add(current.val); // Добавляем значение головы в множество

        // Проходим по списку
        while (current.next != null) {
            if (seen.contains(current.next.val)) {
                // Если значение уже встречалось, пропускаем узел
                current.next = current.next.next; // Удаляем дубликат
            } else {
                // Если значение уникально, добавляем его в множество
                seen.add(current.next.val);
                current = current.next; // Переходим к следующему узлу
            }
        }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}