package com.javarush.concurrent.queues.queue_again;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Storage {
    private final BlockingDeque<Integer> deque = new LinkedBlockingDeque<>(2);

    public void take() {
        try {
            System.out.println("take - " + deque.poll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void put(int i) {
        try {
            deque.add(i);
            System.out.println("put - " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
