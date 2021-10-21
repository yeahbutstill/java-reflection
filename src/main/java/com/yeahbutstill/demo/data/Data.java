package com.yeahbutstill.demo.data;

public class Data<T extends AutoCloseable> {

    private T data;

    public Data() {
    }

    public Data(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
