package l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: M799 */
/* renamed from: l.ۤۗۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10021 implements InterfaceC12842 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f30171;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC12842 f30172;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12053 f30173;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23068 f30174;

    public C10021(Context context, C12053 c12053, C23068 c23068) {
        this.f30171 = context;
        this.f30173 = c12053;
        this.f30174 = c23068;
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) {
        InterfaceC12842 interfaceC12842 = this.f30172;
        if (interfaceC12842 != null) {
            return interfaceC12842.mo9068(j, i, i2, interfaceC19899);
        }
        C23068 c23068 = this.f30174;
        if (c23068 != null) {
            try {
                return c23068.mo9068(j, i, i2, interfaceC19899);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (IOException | RuntimeException unused) {
                interfaceC19899.mo21195();
            }
        }
        C23068 c230682 = this.f30174;
        this.f30174 = null;
        C22720.m50768(c230682);
        InterfaceC12842 m29563 = C12137.m29563(this.f30171, this.f30173);
        this.f30172 = m29563;
        return m29563.mo9068(j, i, i2, interfaceC19899);
    }

    @Override // l.InterfaceC12842
    /* renamed from: ᩳ */
    public final C13547 mo9072() {
        InterfaceC12842 interfaceC12842 = this.f30172;
        if (interfaceC12842 == null) {
            interfaceC12842 = this.f30174;
        }
        if (interfaceC12842 == null) {
            return null;
        }
        return interfaceC12842.mo9072();
    }

    @Override // l.InterfaceC12842
    /* renamed from: ۧ */
    public final boolean mo9070() {
        return this.f30174 != null;
    }

    @Override // l.InterfaceC12842
    /* renamed from: ܽ */
    public final void mo9071() {
        C23068 c23068 = this.f30174;
        if (c23068 != null) {
            c23068.mo9071();
        }
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    public final void mo9069() {
        C23068 c23068 = this.f30174;
        InterfaceC12842 interfaceC12842 = this.f30172;
        this.f30174 = null;
        this.f30172 = null;
        C22720.m50768(c23068);
        C22720.m50768(interfaceC12842);
    }
}
