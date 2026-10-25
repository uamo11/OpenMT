package java.nio.file;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class InvalidPathException extends IllegalArgumentException {
    public String getInput() {
        throw null;
    }

    public String getReason() {
        return super.getMessage();
    }

    public int getIndex() {
        throw null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        new StringBuilder().append(getReason());
        throw null;
    }
}
