import java.util.Arrays;

// Методы для массивов
public class ArraysMethods {

    //  Минимальное значение в ячейке массива
    static int findMin (int [] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }

    //  2-е минимальное значение в ячейке массива НЕ ИЗМЕНЯЯ ЕГО
    static int findSecondMin (int [] arr) {   // int [] array = {2, 5, 8, -6, 1};
        int min = arr[0];
        int min2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min2 && arr[i] != min) min2 = arr[i];
        }
        return min2;
    }

    //  3-е минимальное значение в ячейке массива НЕ ИЗМЕНЯЯ ЕГО
    static int findThirdMin (int [] arr) {
        int min = arr[0];
        int min2 = arr[0];
        int min3 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min2 && arr[i] != min) min2 = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min3) {
                if (arr[i] != min && arr[i] != min2) min3 = arr[i];
            }
        }
        return min3;
    }

    // Максимальное значение в массиве
    static int findMax (int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }

    // 2-е максимальное значение в массиве
    static int findSecondMax (int [] arr){
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max2 && arr[i] != max) max2 = arr[i];
        }
        return max2;
    }

    // 3-е максимальное значение в массиве
    static int findThirdMax (int [] arr){
        int max = arr[0];
        int indexMax = 0;
        int max2 = arr[0];
        int indexMax2 = 0;
        int max3 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        if(indexMax == 0) max2 = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max2 && arr[i] != max){
                max2 = arr[i];
                indexMax2 = i;
            }
        }
        if(indexMax == 0 | indexMax2 == 0) {
            max3 = arr[1];
            if(indexMax == 1 | indexMax2 == 1){
                max3 = arr[2];;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max3){
                if(arr[i] != max && arr[i] != max2){
                    max3 = arr[i];
                }
            }
        }
        return max3;
    }

    // Количество положительных чисел в массиве
    static int positiveNumCount (int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0) count++;
        }
        return count;
    }

    // Количество отрицательных чисел в массиве
    static int negativeNumCount (int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) count++;
        }
        return count;
    }

    // Колличество нечетных чисел в массиве
    static int oddNumCount (int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0) count++;
        }
        return count;
    }

    // Колличество четных чисел в массиве
        static int evenNumCount (int [] arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]%2 == 0 & arr[i] !=0) count++;
            }
            return count;
        }

    // Простые числа в массиве (Простое число - число которое делится без остатка только на себя и на 1)
    //                          Пример до 100: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
    //                                         61, 67, 71, 73, 79, 83, 89, 97

    static String PrimaryNum (int [] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0 & Math.sqrt(arr[i])/10 != 0) result += arr[i] + " ";
            }
        return result;
    }

    // Полностью квадратные числа в массиве (Полный квадрат число, являющееся квадратом некоторого целого числа.
    // Иными словами, квадратом является целое число, квадратный корень из которого извлекается нацело.)
    // Например: 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529,
    //           576, 625, 676, 729, 784, 841, 900 and 961

    static String perfectSquares (int [] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if (arr[i]<0) {
                arr[i] = arr[i]*-1;
                temp = (int) Math.sqrt(arr[i]);
                if (temp*temp == arr[i]) result += "-" + arr[i] + " ";
                arr[i] = arr[i]*-1;
            }else {
                temp = (int) Math.sqrt(arr[i]);
            }
            if (temp*temp == arr[i]) result += arr[i] + " ";
        }
        return result;
    }

    // Полностью кубические числа в массиве (Идеальный куб - это число, которое получается путем трехкратного умножения
    // одного и того же целого числа.) Например: 1, 8, 27, 64

    static String perfectCubes (int [] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            if (arr[i]<0) {
                arr[i] = arr[i]*-1;
                temp = (int) Math.cbrt(arr[i]);
                if (temp*temp*temp == arr[i]) result += "-" + arr[i] + " ";
                arr[i] = arr[i]*-1;
            }else {
                temp = (int) Math.cbrt(arr[i]);
            }
            if (temp*temp*temp == arr[i]) result += arr[i] + " ";
        }
        return result;
    }

    // Сумма всех элементов массива
    static int sumAllElements (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Среднее значение элемнтов массива
    static int meanValue (int [] arr){
        int mean = 0;
        for (int i = 0; i < arr.length; i++) {
            mean += arr[i];
        }
        return mean / arr.length;
    }

    // Медианное значение (Медиана - это "середина" отсортированного списка чисел, если кол-во чисел четно, то вычисляется
    // среднее арефметичиское двух чисел по серидине)
    // Пример для нечетного кол-ва чисел: 3, 5, 7, 12, 13, 14, 21, 23, 23, 23, 23, 29, 39, 40, 56
    //                     Медиана равна:                          23
    // Для четного кол-ва чисел: 3, 5, 7, 12, 13, 14, 21, 23, 23, 23, 23, 29, 40, 56
    //            Медиана равна:                      (21+23)/2 = 22
    static int medianValue (int [] arr){
        int [] arr2 = arr;
        int median = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length ; j++) {
                int temp = 0;
                if(arr2[j]<arr[i]){
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length%2 == 0){
            median = arr2[(arr2.length-1)/2] + arr2[arr2.length/2];
        }else{
            median = arr2[arr2.length/2];
        }
        return median;
    }

    public static void main (String [] args){
        int [] array = {4, 6, -27, -9, 5, 132, 3};
        //              0  1  2     3  4
//        System.out.println("Минимальный элемент = " + findMin(array));
//        System.out.println("2-й минимальный элемент = " + findSecondMin(array));
//        System.out.println("3-й минимальный элемент = " + findThirdMin(array));
//        System.out.println("Максимальный элемент = " + findMax(array));
//        System.out.println("2-й максимальный элемент = " + findSecondMax(array));
//        System.out.println("3-й максимальный элемент = " + findThirdMax(array));
//        System.out.println("Положительных чисел в массиве = " + positiveNumCount(array));
//        System.out.println("Отрицательных чисел в массиве = " + negativeNumCount(array));
//        System.out.println("Отрицательных чисел в массиве = " + negativeNumCount(array));
//        System.out.println("Нечетных чисел в массиве = " + oddNumCount(array));
//        System.out.println("Четных чисел в массиве = " + evenNumCount(array));
//        System.out.println("Простые числа в массиве = " + PrimaryNum(array));
//        System.out.println("Числа являющиеся полными квадратами в массиве = " + perfectSquares(array));
//        System.out.println("Числа являющиеся полными кубами в массиве = " + perfectCubes(array));
//        System.out.println("Сумма всех элементов в массиве = " + sumAllElements(array));
//        System.out.println("Среднее значение всех элементов в массиве = " + meanValue(array));
//        System.out.println("Среднее значение всех элементов в массиве = " + medianValue(array));
    }
}
