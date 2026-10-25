package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* compiled from: N673 */
/* loaded from: classes.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* compiled from: N673 */
    public interface Filter<T> {
        /* renamed from: accept */
        boolean mo39985accept(T t);
    }

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
