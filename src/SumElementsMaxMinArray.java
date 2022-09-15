public class SumElementsMaxMinArray {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 6, 5, 7};

        int min = a[0];
        int indexMin = 0;
        int max = a[0];
        int indexMax = 0;
        int sum = 0;
        boolean stop = false;

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                indexMin = i;
            }
            if (max < a[i]) {
                max = a[i];
                indexMax = i;
            }
        }
        System.out.println("Значание min - " + indexMin);
        System.out.println("Значание max - " + indexMax);


        while (!stop) {
            stop = true;
                if (indexMax > indexMin) {
                    for (int j = indexMax-1; j > indexMin; j--) {
                        sum = sum + a[j];
                        System.out.println("Контрольная сумма массива на " + j + " " + "итерации =" + " " + sum);
                    }
                } else {
                    for (int x = indexMin-1; x > indexMax; x--) {
                        sum = sum + a[x];
                        System.out.println("Контрольная сумма массива на " + x + " " + "итерации =" + " " + sum);
                    }
                }
        }
        System.out.println("Сумма значения массива = " + " " + sum);
    }
}

