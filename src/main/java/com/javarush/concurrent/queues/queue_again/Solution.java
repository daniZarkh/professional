package com.javarush.concurrent.queues.queue_again;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
И снова очередь
*/

public class Solution {
    public static void main(String[] args) {
        Storage storage = new Storage();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Producer(storage));
        executor.execute(new Consumer(storage));
        executor.shutdown();
    }
}