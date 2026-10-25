package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: D6X3 */
/* renamed from: l.ܶۖۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14937 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f45530;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f45531;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f45532;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f45533;

    public C14937(long j, AbstractC15440 abstractC15440, String str, boolean z) {
        this.f45531 = abstractC15440;
        this.f45530 = z;
        this.f45532 = j;
        this.f45533 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m35392() {
        if (!this.f45530) {
            throw new IOException("The source file does not exist");
        }
        return this.f45531.mo27926();
    }
}
