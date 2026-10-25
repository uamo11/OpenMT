package l;

import java.io.StringWriter;

/* compiled from: V2E3 */
/* renamed from: l.ܿᩴ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17523 extends AbstractC22734 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53519 = true;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20968 f53520;

    public C17523(int i, int i2) {
        this.f53520 = C20968.m47784(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17523 m40960(int i, int i2) {
        return new C17523(i, i2);
    }

    @Override // l.AbstractC22734
    /* renamed from: ֫ */
    public final boolean mo23385(int i, StringWriter stringWriter) {
        if (this.f53519 != this.f53520.m47785(Integer.valueOf(i))) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
