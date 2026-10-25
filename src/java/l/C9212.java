package l;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* compiled from: K14B */
/* renamed from: l.ۡ᩻ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9212 implements InterfaceC18581 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10130 f27899 = new C10130();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f27900;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11005 f27901;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6499 f27902;

    public C9212(C16266 c16266, C6499 c6499, C11005 c11005) {
        this.f27900 = c16266;
        this.f27902 = c6499;
        this.f27901 = c11005;
    }

    @Override // l.InterfaceC18581
    /* renamed from: ۧ */
    public final void mo9498() {
        boolean z;
        C10130 c10130 = this.f27899;
        c10130.writeInt(1382253411);
        z = this.f27900.f50025;
        c10130.m25425(z);
        this.f27902.m17978(c10130);
    }

    @Override // l.InterfaceC18581
    /* renamed from: ֫ */
    public final void mo9497() {
        C3764 c3764;
        try {
            this.f27901.m27338();
            synchronized (this.f27900) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f27901.m27340().mo23555(false));
                try {
                    gZIPOutputStream.write(this.f27899.m25438(), 0, this.f27899.size());
                    gZIPOutputStream.close();
                } finally {
                }
            }
        } catch (IOException e) {
            c3764 = this.f27900.f50030;
            c3764.m11384((Throwable) e);
        }
    }
}
