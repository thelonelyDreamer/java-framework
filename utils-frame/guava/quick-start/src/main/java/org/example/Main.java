package org.example;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ListeningExecutorService listeningExecutorService
                = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
        ListenableFuture<Integer> future = listeningExecutorService.submit(() -> 8);
        Futures.addCallback(future, new FutureCallback<Integer>() {
            @Override
            public void onSuccess(Integer integer) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        },listeningExecutorService);

    }
}