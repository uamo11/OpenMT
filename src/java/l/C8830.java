package l;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: I4F9 */
/* renamed from: l.ۡۧ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8830 extends AbstractRunnableC15091 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26901;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f26902;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8830(C22235 c22235, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f26902 = c22235;
        this.f26901 = i;
    }

    @Override // l.AbstractRunnableC15091
    /* renamed from: ֫ */
    public final void mo3633() {
        this.f26902.f72157.getClass();
        try {
            this.f26902.f72147.m16815(this.f26901, EnumC13499.CANCEL);
            synchronized (this.f26902) {
                this.f26902.f72142.remove(Integer.valueOf(this.f26901));
            }
        } catch (IOException unused) {
        }
    }
}
