package l;

import java.io.IOException;

/* compiled from: I4F9 */
/* renamed from: l.᩸ۧ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21530 extends AbstractRunnableC15091 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f69210;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4596 f69211;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21530(C22235 c22235, C4596 c4596) {
        super("OkHttp %s", c22235.f72148);
        this.f69210 = c22235;
        this.f69211 = c4596;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩹ۧ֡] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ܰ֫֡] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // l.AbstractRunnableC15091
    /* renamed from: ֫ */
    public final void mo3633() {
        Throwable th;
        EnumC13499 enumC13499;
        ?? r0 = this.f69210;
        C4596 c4596 = this.f69211;
        EnumC13499 enumC134992 = EnumC13499.INTERNAL_ERROR;
        ?? r3 = 1;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        r0.m49933(r3, enumC134992);
                    } catch (IOException unused) {
                    }
                    C20032.m46179(c4596);
                    throw th;
                }
            } catch (IOException unused2) {
                enumC13499 = enumC134992;
            } catch (Throwable th3) {
                th = th3;
                r3 = enumC134992;
                r0.m49933(r3, enumC134992);
                C20032.m46179(c4596);
                throw th;
            }
        } catch (IOException unused3) {
        }
        if (!c4596.m13508(true, this)) {
            C18002.m42040("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        while (c4596.m13508(false, this)) {
        }
        enumC13499 = EnumC13499.NO_ERROR;
        try {
            enumC134992 = EnumC13499.CANCEL;
            r0.m49933(enumC13499, enumC134992);
            r3 = enumC13499;
        } catch (IOException unused4) {
            enumC134992 = EnumC13499.PROTOCOL_ERROR;
            r0.m49933(enumC134992, enumC134992);
            r3 = enumC13499;
            C20032.m46179(c4596);
        }
        C20032.m46179(c4596);
    }
}
