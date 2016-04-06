package multi;

import java.math.BigInteger;

public class FactorialRunnable implements Runnable{
    @Override
    public void run (){
        int n = Integer.parseInt(Thread.currentThread().getName());
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++){
            result = BigInteger.valueOf(i).multiply(result);
        }
        System.out.println(" Факториал потока" + Thread.currentThread().getName() + " : " + result);

    }

}
