import java.util.ArrayList;
import java.util.List;

/** Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить” */
public class Tasr03 {
    public static void main(String[] args) {
        Integer [] array = new Integer[] {4,6,8,2, null, 6, null};
        checkArray(array);
    }
    public static void checkArray(Integer[] a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i]  == null) {
                b.add(i);
            }
        }
        System.out.println("Items with null " + b);
        //throw new RuntimeException("Array has null's" + b);
        System.out.println(b);
    }
}
