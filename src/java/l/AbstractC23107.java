package l;

import java.io.IOException;

/* compiled from: IAZV */
/* renamed from: l.᩺ܽۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23107 {
    @Deprecated
    public AbstractC23107() {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18211 m51295() {
        if (this instanceof C18211) {
            return (C18211) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: ܽ */
    public String mo17081() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C23525 c23525 = new C23525(C19602.m45042(sb));
            c23525.m51977(EnumC16093.LENIENT);
            C21906.f70122.mo2845(c23525, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
