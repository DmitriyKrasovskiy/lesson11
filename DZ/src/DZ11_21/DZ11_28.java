package DZ11_21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DZ11_28 {

    public static void main(String[] args) {

        System.out.println("Сколько учеников в списке?");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>(size);


        for (int i = 0; i < size; i++) {
            arrList.add((int) (Math.random() * 5) + 1);
        }

        System.out.println(arrList);

        Iterator<Integer> itr = arrList.iterator();

        int maxMark = 0;
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (i > maxMark) {
                maxMark = i;
            }
        }

        System.out.println("Наивысшая оценка: " + maxMark);
    }
}
