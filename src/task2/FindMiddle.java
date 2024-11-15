package task2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class FindMiddle {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null; // Проверка на пустой список

        ListNode slow = head; // Медленный указатель
        ListNode fast = head; // Быстрый указатель

        // Проходим по списку
        while (fast != null && fast.next != null) {
            slow = slow.next; // Двигаем медленный указатель на один узел
            fast = fast.next.next; // Двигаем быстрый указатель на два узла
        }

        return slow; // Возвращаем средний элемент
    }

    public static void main(String[] args) {
        // Создаем односвязный список
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Находим средний элемент
        ListNode middle = findMiddle(head);
        if (middle != null) {
            System.out.println("Middle element: " + middle.val); // Выводим средний элемент
        } else {
            System.out.println("The list is empty."); // Обработка пустого списка
        }
    }
}
