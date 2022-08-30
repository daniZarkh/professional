package com.javarush.concurrent.queues.messages_queue;

import java.util.concurrent.TimeUnit;

public interface Delayed {

    long getDelay(TimeUnit unit);

    int compareTo(Delayed o);
}
