public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //task1


    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrOne = 0;
        for (int i = 0; i < arr.length; i++) {
            arrOne += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrOne + " рублей");


        //task2
        int maxFin = 0;
        int minFin = 0;
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] > maxFin) {
                maxFin = arr[i];
            }
            if (arr[i] < minFin) {
                minFin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minFin + " рублей. Максимальная сумма трат за день составила " + maxFin + " рублей");

        //task3

        int all = 0;
        all = arrOne / arr.length - 1;
        System.out.println("Средняя сумма затрат за месяц составила " + all + " рублей.");

        //task4
        char[] reverseFullName = { 'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("     Проверка кодировки ");
    }


}
