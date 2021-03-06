package task;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by VladislavGolovatyuk on 15.07.17.
 * @version 1.2
 */
public class Module03 {
    public static void main(String[] args) {


        //ввод и вычисление размера массива

        Scanner sc = new Scanner(System.in);


        System.out.println("Здравствуйте!!! Сегодня Вы увидите свой первый Java массив.");
        System.out.println("Для этого следуй инструкциям из консоли и удачи)");
        System.out.println();
        System.out.println("Вводите через пробел числа, которые вы бы хотели увидеть в " +
                "Вашем массиве, а когда устаните это делать нажмите ENTER:)");

        String array = sc.nextLine();

        int sizeOfMyArray = 0;
            for (String retval : array.split(" ")) {
                sizeOfMyArray++;
        }

        int myArray[] = new int[sizeOfMyArray];
        int counterOfIndex = 0;

        for (String retval : array.split(" ")) {
            myArray[counterOfIndex] = Integer.parseInt(retval);
            counterOfIndex++;
        }

        String s = Arrays.toString(myArray);

        //максимум без сортировки

        int maxNumberOfArray = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNumberOfArray)
                maxNumberOfArray = myArray[i];
        }

        //минимум без сортировки

        int minNumberOfArray = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minNumberOfArray)
                minNumberOfArray = myArray[i];
        }

        //Вывод инфы о массиве

        System.out.println("А вот и элементы Вашего массива: " + s);
        System.out.println("Наибольшим элементом Вашего массива является: " + maxNumberOfArray);
        System.out.println("Наименьшим элементом Вашего массива является: " + minNumberOfArray);
        System.out.println();

        //подсчёт количества элементов со значением 5

        int fiveRepeat = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] == 5) {
                fiveRepeat++;
            }
        }
        System.out.println("В вашем массиве есть следущее количество пятерок - " + fiveRepeat + ".");

        //сортировка массива

        for (int index = 0; index < myArray.length; index++) {
            for (int j = index; j >= 1; j--) {
                if (myArray[j - 1] > myArray[j]) {
                    int t = myArray[j];
                    myArray[j] = myArray[j - 1];
                    myArray[j - 1] = t;
                }
            }
        }

        String x = Arrays.toString(myArray);
        System.out.println();

        System.out.println("А вот-так выглядит Ваш массив после bubbleSort");
        System.out.println(x);
        System.out.println();

        // выведение максимального и минимального количества повторений

        int[] myArray2 = new int[myArray.length];
        int maxNumberRepeat = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    maxNumberRepeat++;
                }
            }
            myArray2[i] = maxNumberRepeat;
            maxNumberRepeat = 0;
        }

        int finalMax = myArray2[0];
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] > finalMax) {
                finalMax = myArray2[i];
            }
        }

        int finalMin = myArray2[0];
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] != finalMin) {
                finalMin = myArray2[i];
            }
        }
        
        System.out.println("В Вашем массиве, одинаковое число максимально " +
                "выводится : " + finalMax + " раз.");
        System.out.println();
        System.out.println("В Вашем массиве, одинаковое число минимально " +
                "выводится : " + finalMin + " раз.");

    }
}


