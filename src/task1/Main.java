package task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Пример удаления дубликатов из односвязного списка");

        // Создаем односвязный список
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(1);

        System.out.println("Перед удаление дубликатов:");
        RemoveDuplicates.printList(head); // Выводим список до удаления дубликатов

        RemoveDuplicates.removeDuplicates(head); // Удаляем дубликаты

        System.out.println("После удаления дубликатов:");
        RemoveDuplicates.printList(head); // Выводим список после удаления дубликатов
    }
}