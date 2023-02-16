package it.develhope.ASyncCallbacks;

import java.util.function.Supplier;

public class MyTaskWithReturn implements Supplier<String> {
    @Override
    public String get() {
        return "The Task is finished";
    }
}
