import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

//    Составьте ArrayList из набора чисел 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4
//
//    Отфильтруйте положительные числа.
//    Найдите среди этих положительных чисел четные.
//    Отсортируйте отфильтрованные числа в порядке возрастания.
//    Выведите результат на экран.

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int x : intList) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            newList.add(x);
        }
        Collections.sort(newList);
        for (int i : newList) System.out.print(i + " ");
    }
}