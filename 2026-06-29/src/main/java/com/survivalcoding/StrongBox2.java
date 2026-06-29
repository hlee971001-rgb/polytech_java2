package com.survivalcoding;

enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int limit;

    KeyType(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }
}

public class StrongBox2<T> {
    private T item;
    private final KeyType keyType;
    private int count;

    public StrongBox2(KeyType keyType) {
        this.keyType = keyType;
        this.count = 0;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        this.count++;

        if (this.count < this.keyType.getLimit()) {
            return null;
        }

        return this.item;
    }
}