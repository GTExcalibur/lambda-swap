package com.github.gtexcalibur;

import java.io.IOException;
import java.io.UncheckedIOException;

public class API {

    @FunctionalInterface
    public interface SafeConsumer<T> {
        void accept(T t) throws IOException;
    }

    public void foo(SafeConsumer<String> worker) {
        try {
            worker.accept("version2");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
