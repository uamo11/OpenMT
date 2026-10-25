package l;

import java.util.logging.Logger;

/* compiled from: X95L */
/* renamed from: l.ۙܰܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4688 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f14878 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile Logger f14879;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f14880;

    public C4688(Class cls) {
        this.f14880 = cls.getName();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Logger m13744() {
        Logger logger = this.f14879;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f14878) {
            Logger logger2 = this.f14879;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f14880);
            this.f14879 = logger3;
            return logger3;
        }
    }
}
