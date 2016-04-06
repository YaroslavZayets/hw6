package multi;


import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadSum {

    static void sum (int[] arr, int threadNumber){
        AtomicInteger res = new AtomicInteger();
        int size = arr.length/threadNumber;
        for (int i = 0; i<threadNumber; i++){
            int begin = size*i;
            int end = ((i+1)*size);
            if ((arr.length-end)<size){
                end = threadNumber;
            }
            SingleThreadSum s = new SingleThreadSum(arr,begin,end,res);
            s.start();

            try {
                s.join();
            } catch (InterruptedException e){
                System.out.println(e);
            }

        }
        System.out.println("Сумма масива = " + res.get());

    }
}
