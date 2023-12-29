package chapter_06;

import java.util.*;

public class BreadthFirstSearch {
    private static Map<String, List<String>> graph = new HashMap<>();

    /**
     * Поиск элемента (узла) в ширину - да, нет
     * (как я понимаю это пример для книги)
     *
     * Queue<String> searchQueue = new ArrayDeque<>();
     * пока не очень понятно, зачем тут двунаправленная очередь ArrayDeque
     * (как я понимаю для обхода в глубину используют Stack)
     *
     * new ArrayDeque<>(graph.get(name)); - интересная конструкция
     *
     * List<String> searched = new ArrayList<>(); - а почему это не связано с хешем
     *
     */
    private static boolean search(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        //С помощью этого списка вы сможете отслеживать, каких людей вы нашли раньше.
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            // Ищите этого человека, только если вы еще не искали его
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is а mango seller!");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    //отмечаем человека как посещенного
                    searched.add(person);
                }
            }
        }
        return false;
    }

    // как я понимаю человек у которого на конце m - продавец манго
    private static boolean person_is_seller(String name) {
        return name.endsWith("m");
    }

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }
}
