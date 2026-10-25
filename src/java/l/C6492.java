package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: 274A */
/* renamed from: l.ۜۗۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6492 implements InterfaceC21449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f20044;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f20045;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20046 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9315 f20047;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23713 f20048;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f20049;

    public C6492(C23713 c23713, C9315 c9315, String str, boolean z) {
        this.f20048 = c23713;
        this.f20047 = c9315;
        this.f20045 = str;
        this.f20044 = z;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f20046;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        if (this.f20049 != null) {
            throw new IOException("Data source is already open");
        }
        C4515 m9467 = c3104.m9467();
        m9467.m13282(this.f20045);
        C3104 m13278 = m9467.m13278();
        long j = c3104.f9713;
        if (j == -1) {
            j = C13132.FOREVER_NS;
        }
        long min = Math.min(X931RNG.BLOCK64_RESEED_MAX, j);
        C23713 c23713 = this.f20048;
        C16197 m52285 = c23713.m52285();
        InterfaceC15097 m23961 = C9315.m23961(c23713);
        long mo38152 = m52285 != null ? m52285.mo38152(this.f20045, c3104.f9718, j) : -1L;
        if (mo38152 >= min) {
            if (mo38152 < j) {
                j = (mo38152 / X931RNG.BLOCK64_RESEED_MAX) * X931RNG.BLOCK64_RESEED_MAX;
            }
            m13278 = m13278.m9466(0L, j);
            this.f20049 = m23961.mo6247();
        } else {
            if (this.f20044) {
                m23961 = this.f20047;
            }
            this.f20049 = m23961.mo6247();
        }
        Iterator it = this.f20046.iterator();
        while (it.hasNext()) {
            this.f20049.mo5937((InterfaceC0486) it.next());
        }
        return this.f20049.mo1620(m13278);
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC21449 interfaceC21449 = this.f20049;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        return interfaceC21449.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f20049;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f20049;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC21449 interfaceC21449 = this.f20049;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                this.f20049 = null;
            }
        }
    }
}
