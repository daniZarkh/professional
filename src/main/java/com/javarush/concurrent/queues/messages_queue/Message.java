package com.javarush.concurrent.queues.messages_queue;

import java.util.concurrent.*;

public class Message implements java.util.concurrent.Delayed {
    private Integer messageId;
    private String messageText;
    private long lifetime;
    private long endTime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
        this.endTime = TimeUnit.NANOSECONDS.convert(lifetime, TimeUnit.MILLISECONDS);
    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(endTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(java.util.concurrent.Delayed o) {
        long d = getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        return (d == 0) ? 0 : ((d > 0) ? 1 : -1);
    }
}
