package lesson4;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class ArrayToMap {

    public static void main(String[] args) {

        String[] words = {
                "мороженое", "two", "конфета", "машина", "two",
                "two", "север", "фото", "дерево", "дерево",
                "привет", "машина", "привет", "мороженое", "фото", "на", "память", "память"
        };

        System.out.println("Вывод всех слов: " + Arrays.asList(words));


        LinkedHashMap<String, Integer> repeat = new LinkedHashMap<>();

        for (String s : words) {
            repeat.put(s, repeat.getOrDefault(s, 0) + 1);
        }

        System.out.println("Количество повторений слов: " + repeat);
    }
}
