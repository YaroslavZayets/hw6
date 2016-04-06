package multi;


import java.util.concurrent.atomic.AtomicInteger;

public class SingleThreadSum extends Thread {
    private int[] arr;
    private int begin;
    private int end;
    private AtomicInteger res;



    public SingleThreadSum (int[] arr, int begin, int end, AtomicInteger res){
        this.arr=arr;
        this.begin = begin;
        this.end = end;
        this.res = res;
    }


    @Override
    public void run(){
        int sum = 0;
        for (int i = begin; i<end; i++){
            sum +=arr[i];
        }
        res.addAndGet(sum);
    }




}
