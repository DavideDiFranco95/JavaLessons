package it.develhope.ASyncCallbacks;

import java.util.concurrent.CompletableFuture;

public class Start {
    public static void main(String[] args) {
        /*CompletableFuture<Void> myTaskRunnable = CompletableFuture.runAsync(new MyTask());
        System.out.println("----------------------------------------------");
        myTaskRunnable.join();*/
        CompletableFuture<String> myTaskRunnableWithReturn = CompletableFuture.supplyAsync(new MyTaskWithReturn());
        myTaskRunnableWithReturn.thenApplyAsync(inputFromPrevious->{
            System.out.printf("Previous task is finished and I have no output %s\n" , inputFromPrevious);
            return "The return is ALLOWED there";
        })/*.thenAccept(input->{
            System.out.printf("Previous task is finished and result is: %s\n" , input);
        }).thenRun(()->{
            System.out.println("Previous task is finished and I have no output");
        })*/
        .handle((output,throwable)->{
            System.out.println("***Handle***");
            if (throwable!=null){
                throwable.printStackTrace();
            }

            if (output!=null){
                System.out.printf("The final output is %s" , output);
            }
            return "";
        }).whenComplete((output,throwable)->{
            System.out.println("***When Complete***");
            if (throwable!=null){
                throwable.printStackTrace();
            }
            if (output!=null){
                System.out.printf("The final output is %s" , output);
            }
        }).join();
    }
}
