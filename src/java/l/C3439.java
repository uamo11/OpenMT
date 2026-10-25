package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: H6L4 */
/* renamed from: l.ۗ᩵ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3439 implements InterfaceC19172 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14021 f10867;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10868;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10869;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10870;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10871;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18090 f10872;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4850 f10873;

    public C3439(C14021 c14021, C18090 c18090, C4850 c4850, int i, int i2, String str, String str2) {
        this.f10867 = c14021;
        this.f10872 = c18090;
        this.f10873 = c4850;
        this.f10870 = i;
        this.f10868 = i2;
        this.f10871 = str;
        this.f10869 = str2;
    }

    @Override // l.InterfaceC19172
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10516(AbstractC15440 abstractC15440) {
        C17760 c17760;
        C17760 c177602;
        InterfaceC1393 interfaceC1393;
        C14021 c14021 = this.f10867;
        C4850 c4850 = this.f10873;
        C18090 c18090 = this.f10872;
        try {
            C8918 m22989 = C8918.m22989(abstractC15440);
            if (c18090 != null) {
                try {
                    m22989.m23019(c18090.m42197());
                    if (c18090.m42212()) {
                        m22989.m23025();
                    }
                } finally {
                }
            }
            for (C15432 c15432 : c4850.f15323) {
                C5556.m15716();
                C3545 c3545 = c15432.f47245;
                String str = c15432.f47246;
                if (!c3545.getName().equals(str)) {
                    c3545 = c3545.clone();
                    c3545.m10788(str);
                }
                interfaceC1393 = C14021.f42400;
                m22989.m23015(c3545, c18090, interfaceC1393);
                C5556.m15716();
            }
            for (C1322 c1322 : c4850.f15321) {
                C5556.m15716();
                Object obj = c1322.f4736;
                String str2 = c1322.f4734;
                C6261 c6261 = (C6261) obj;
                c17760 = c14021.f42402;
                C7383 m41607 = c17760.m41607();
                AbstractC15440 abstractC154402 = c6261.f19393;
                boolean z = c6261.f19392;
                m41607.m19883(abstractC154402.mo23554());
                c177602 = c14021.f42402;
                C12619 m15715 = C5556.m15715(c177602, abstractC154402.mo23554(), z);
                C3545 c35452 = new C3545(str2);
                c35452.setTime(c6261.f19394);
                c35452.m10805(z ? 0L : m15715.m30884());
                m22989.m23018(this.f10870);
                m22989.m23009(this.f10868);
                C3545 entry = c18090 == null ? null : c18090.getEntry(str2);
                if (entry != null) {
                    m22989.m23018(entry.m10767());
                }
                m22989.m23026(this.f10871);
                m22989.m23013(c35452);
                if (!z) {
                    try {
                        C13316 c13316 = new C13316(abstractC154402.mo27926());
                        try {
                            OutputStream m23007 = m22989.m23007();
                            byte[] bArr = new byte[65536];
                            while (true) {
                                C5556.m15716();
                                int read = c13316.read(bArr);
                                if (read < 0) {
                                    try {
                                        break;
                                    } catch (C23194 e) {
                                        throw C14021.m33630(c1322.f4735, e, c1322.f4734);
                                    }
                                } else if (read != 0) {
                                    m23007.write(bArr, 0, read);
                                }
                            }
                            c13316.close();
                        } catch (Throwable th) {
                            try {
                                c13316.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        throw new C23194(e2.getMessage(), e2);
                    }
                }
                m22989.m23023();
            }
            m22989.close();
            if (c18090 != null) {
                c18090.close();
            }
        } catch (Throwable th3) {
            if (c18090 != null) {
                try {
                    c18090.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.InterfaceC19172
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10515(C7383 c7383) {
        C5556.m15716();
        if (this.f10872 != null) {
            c7383.m19883(this.f10869);
        }
        Iterator it = this.f10873.f15321.iterator();
        while (it.hasNext()) {
            c7383.m19883(((C6261) ((C1322) it.next()).f4736).f19393.mo23554());
        }
    }
}
