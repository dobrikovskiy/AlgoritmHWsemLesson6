package task3;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1); // Временный узел для упрощения работы с новым списком
        ListNode current = dummy; // Указатель на текущий узел в новом списке

        // Итерируемся по обоим спискам
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1; // Добавляем узел из l1
                l1 = l1.next; // Переходим к следующему узлу в l1
            } else {
                current.next = l2; // Добавляем узел из l2
                l2 = l2.next; // Переходим к следующему узлу в l2
            }
            current = current.next; // Переходим к следующему узлу в новом списке
        }

        // Присоединяем оставшиеся элементы одного из списков
        current.next = (l1 != null) ? l1 : l2;

        return dummy.next; // Возвращаем новый объединенный список, пропуская временный узел
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Создаем первый отсортированный список
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Создаем второй отсортированный список
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Сливаем два отсортированных списка
        ListNode mergedList = mergeTwoLists(l1, l2);

        // Выводим объединенный список
        System.out.println("Merged List:");
        printList(mergedList);
    }
}