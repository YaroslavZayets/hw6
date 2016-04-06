package multi;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i < 100; i++) {
//            Thread th = new Thread(new FactorialRunnable(), Integer.toString(i));
//            th.start();
//        }


        int[] arr = new int[100_000_00];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1000);
        }

        long start = System.currentTimeMillis();
        sum(arr);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms " + " обычным методом");
        long mstart = System.currentTimeMillis();
        MultiThreadSum.sum(arr,8);
        long mend = System.currentTimeMillis();
        System.out.println((mend - mstart) + " ms " + " многопоточным методом");

    }


    static void sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Сумма масива = " + result);
    }


    }



