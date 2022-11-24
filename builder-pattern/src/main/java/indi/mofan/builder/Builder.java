package indi.mofan.builder;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 链式调用的新思路
 * 我并不认为这是建造者模式的通用写法
 *
 * @author mofan
 * @date 2022/11/24 22:08
 */
public class Builder<T> {
    private final Supplier<T> CONSTRUCTOR;
    private Consumer<T> injector = (t) -> { };

    private Builder(Supplier<T> constructor) {
        this.CONSTRUCTOR = constructor;
    }

    public static <T> Builder<T> builder(Supplier<T> constructor) {
        return new Builder<>(constructor);
    }

    public <F> Builder<T> with(BiConsumer<T, F> biConsumer, F f) {
        Consumer<T> c = instance -> biConsumer.accept(instance, f);
        injector = injector.andThen(c);
        return this;
    }

    public T build() {
        T t = CONSTRUCTOR.get();
        injector.accept(t);
        return t;
    }

}
