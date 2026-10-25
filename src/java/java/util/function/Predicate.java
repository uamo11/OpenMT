package java.util.function;

/* compiled from: N673 */
/* loaded from: classes.dex */
public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    /* renamed from: negate */
    Predicate<T> mo4928negate();

    boolean test(T t);
}
