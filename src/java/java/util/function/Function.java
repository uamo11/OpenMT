package java.util.function;

/* compiled from: N673 */
/* loaded from: classes.dex */
public interface Function<T, R> {
    /* renamed from: andThen */
    <V> Function<T, V> mo22274andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
