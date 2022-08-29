package com.javarush.concurrent.atomic.earn_million;

import java.util.concurrent.atomic.AtomicInteger;

public class CompanyAccount {
    private final AtomicInteger totalMoney;

    public CompanyAccount(int totalMoney) {
        this.totalMoney = new AtomicInteger(totalMoney);
    }

    public int getTotalMoney() {
        return totalMoney.get();
    }

    public void addMoney(int money) {
        totalMoney.getAndAdd(money);
    }
}
