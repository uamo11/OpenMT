package java.io;

import j$.util.Objects;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(String str, IOException iOException) {
        super(str, (Throwable) Objects.requireNonNull(iOException));
    }

    public UncheckedIOException(IOException iOException) {
        super((Throwable) Objects.requireNonNull(iOException));
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
