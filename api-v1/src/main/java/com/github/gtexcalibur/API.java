package com.github.gtexcalibur;

public class API {

    @FunctionalInterface
    public interface SafeConsumer<T> {
        void accept(T t);
    }

    public void foo(SafeConsumer<Object> worker) {
        worker.accept("version1");
    }
}
