package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: A186 */
/* renamed from: l.ۚ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5564 implements InterfaceC6975 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5627 f17241;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f17242;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17243;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f17244;

    @Override // l.InterfaceC6975
    /* renamed from: ֫ */
    public final void mo2555(AbstractC15440 abstractC15440, int i) {
        OutputStream mo23555 = abstractC15440.mo23555(false);
        try {
            this.f17244[0] = true;
            C14176.m33825(this.f17242, mo23555, this.f17243, this.f17241);
            if (mo23555 != null) {
                mo23555.close();
            }
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C5564(boolean[] zArr, InputStream inputStream, long j, InterfaceC5627 interfaceC5627) {
        this.f17244 = zArr;
        this.f17242 = inputStream;
        this.f17243 = j;
        this.f17241 = interfaceC5627;
    }

    @Override // l.InterfaceC6975
    /* renamed from: ֫ */
    public final boolean mo2556(IOException iOException) {
        return !this.f17244[0];
    }
}
