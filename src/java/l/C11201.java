package l;

import java.io.BufferedOutputStream;
import java.io.InputStream;

/* compiled from: W6LP */
/* renamed from: l.ۧ᩵ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11201 implements InterfaceC19172 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33619;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17550 f33620;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18090 f33621;

    public C11201(C18090 c18090, C17550 c17550, String str) {
        this.f33621 = c18090;
        this.f33620 = c17550;
        this.f33619 = str;
    }

    @Override // l.InterfaceC19172
    /* renamed from: ֫ */
    public final void mo10516(AbstractC15440 abstractC15440) {
        C3059 m24823;
        C3545 c3545;
        try {
            C18090 c18090 = this.f33621;
            c3545 = this.f33620.f53647;
            InputStream m24812 = C9790.m24812(c3545, c18090);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC15440.mo23555(false));
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        C5556.m15716();
                        int read = m24812.read(bArr);
                        if (read < 0) {
                            bufferedOutputStream.close();
                            m24812.close();
                            return;
                        } else if (read > 0) {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (C6967 e) {
            m24823 = C9790.m24823(e.f21474);
            throw m24823;
        }
    }

    @Override // l.InterfaceC19172
    /* renamed from: ֫ */
    public final void mo10515(C7383 c7383) {
        C5556.m15716();
        c7383.m19883(this.f33619);
    }
}
