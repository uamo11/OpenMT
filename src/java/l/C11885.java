package l;

import java.io.BufferedOutputStream;
import java.io.InputStream;

/* compiled from: D6WI */
/* renamed from: l.ۨᩴۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11885 implements InterfaceC9294 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f35435;

    public C11885(long j) {
        this.f35435 = j;
    }

    @Override // l.InterfaceC9294
    /* renamed from: ֫ */
    public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) {
        long j = c14937.f45532;
        long j2 = this.f35435;
        if (j2 > j) {
            throw C6240.m17179("Truncation cannot extend the file.", j, j2);
        }
        InputStream m35392 = c14937.m35392();
        try {
            C21679.m48949(m35392, bufferedOutputStream, j2, j2 == j);
            if (m35392 != null) {
                m35392.close();
            }
        } catch (Throwable th) {
            if (m35392 != null) {
                try {
                    m35392.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC9294
    /* renamed from: ֫ */
    public final void mo7074() {
        C21679.m48948();
    }
}
