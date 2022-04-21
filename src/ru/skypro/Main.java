package ru.skypro;
import java.util.Arrays;
import java.util.Objects;
import static java.lang.Character.toUpperCase;

public class Main {

    public static void main(String[] args) {
        // Task 1,2,3

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpperCase + ".");

        if (fullName.contains("ё")) {
            String fullNameNew = fullName.replace('ё', 'е');
            System.out.println(fullNameNew + ".");
        }
        System.out.println();


        System.out.println("additional tasks");
        System.out.println();

        // arrays
        // task 5
        int[][] num = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 1;
            }
        }
        for (int[] row : num) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        // task 6
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        int[] arr = Arrays.copyOf(array, array.length);
        Arrays.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // task 7
        int[] two = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(two));
        for (int m = 0; m < two.length / 2; m++) {
            int st = two[m];
            two[m] = two[two.length - m - 1];
            two[two.length - m - 1] = st;
        }
        System.out.println(Arrays.toString(two));
        System.out.println();

        // task 8
        int[] arAr = {-4, 2, 5, -8, 8, 10, 4, -7, 12, 4};
        // Arrays.sort(arAr,0,arAr.length);
        // System.out.println(Arrays.toString(arAr));
        for (int i = 0; i < arAr.length - 1; i++) {
            int sum2 = arAr[i] +  arAr[i + 1];
            if (sum2 == -2) {
                System.out.println("Сумма чисел " + arAr[i] + " и " + arAr[i + 1] + " = " + sum2);
                break;
            }
        }
        System.out.println();

        // task 9
        int[] arAr2 = {-4, 2, 6, -8, 8, -10, 4, -7, 12, 4};
        for (int i = 0; i < arAr2.length - 1; i++) {
            int sum2 = arAr2[i] + arAr2[i + 1];
            if (sum2 == -2) {
                System.out.println("Сумма чисел " + arAr2[i] + " и " + arAr2[i + 1] + " = " + sum2);
            }
        }
        System.out.println();


        // String
        // task 5,6
        String name = "Ivanov Ivan Ivanovich";
        int index2 = name.indexOf(" ");
        String lastName2 = name.substring(0, index2);
        int index3 = name.indexOf(" ", index2 + 1);
        String middleName2 = name.substring(index3);
        String firstName2 = name.substring(index2, index3 + 1);
        System.out.println("Фамилия сотрудника — " + lastName2);
        System.out.println("Имя сотрудника —" + firstName2);
        System.out.println("Отчество сотрудника —" + middleName2);

        String fullName3 = "Ivanov Ivan Ivanovich";
        char[] chars = fullName3.toCharArray();
        for (int j = 0; j < chars.length; j++)
            if (j == 0 || j == index2 + 1 || j == index3 + 1)
                chars[j] = toUpperCase(chars[j]);
        String result = new String(chars);
        System.out.println(result);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + result);
        System.out.println();

        //task 7
        String firstString = "135";
        char[] charArrayFirst = firstString.toCharArray();
        String secondString = "246";
        char[] charArraySecond = secondString.toCharArray();
        char[] charArray3 = new char[charArrayFirst.length + charArraySecond.length];
        for(int i = 0; i < charArrayFirst.length; i++) {
            charArray3[i + i] = charArrayFirst[i];
        }
        for(int j = 0; j < secondString.length(); j++) {
            charArray3[j + (j + 1)] = charArraySecond[j];
        }
        String thirdString = new String(charArray3);
        System.out.print("Данные строки —  " + thirdString);
        System.out.println();

        //task 8
        String text = "aabccddefgghiijjkk";
        System.out.println("Строка с повторяющимися элементами:");
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                System.out.print(text.charAt(i));
            }
        }
    }
}


