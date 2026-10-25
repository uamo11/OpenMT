package l;

import android.net.Uri;
import android.os.Handler;
import java.io.InterruptedIOException;
import java.util.Map;

/* compiled from: L8S9 */
/* renamed from: l.۟ۧۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7428 implements InterfaceC23757, InterfaceC7160 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18832 f22820;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18176 f22821;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Uri f22822;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f22824;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12367 f22825;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14310 f22827;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22828;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f22829;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22830;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f22831;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23615 f22832 = new C23615();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22823 = true;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f22833 = C10957.m27273();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3104 f22826 = m19959(0);

    public C7428(C18176 c18176, Uri uri, InterfaceC21449 interfaceC21449, C15625 c15625, InterfaceC21830 interfaceC21830, C14310 c14310) {
        this.f22821 = c18176;
        this.f22822 = uri;
        this.f22820 = new C18832(interfaceC21449);
        this.f22825 = c15625;
        this.f22829 = interfaceC21830;
        this.f22827 = c14310;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ۧ */
    public final void mo6511() {
        this.f22830 = true;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ֫ */
    public final void mo6509() {
        C10189 c10189;
        C10189 c101892;
        long j;
        Handler handler;
        RunnableC6017 runnableC6017;
        C10189 c101893;
        C10189 c101894;
        C8353 c8353;
        int i = 0;
        while (i == 0 && !this.f22830) {
            try {
                long j2 = this.f22832.f76532;
                C3104 m19959 = m19959(j2);
                this.f22826 = m19959;
                long mo1620 = this.f22820.mo1620(m19959);
                if (!this.f22830) {
                    if (mo1620 != -1) {
                        mo1620 += j2;
                        C18176.m42279(this.f22821);
                    }
                    long j3 = mo1620;
                    this.f22821.f56501 = C10189.m25587(this.f22820.mo5936());
                    InterfaceC21449 interfaceC21449 = this.f22820;
                    c10189 = this.f22821.f56501;
                    if (c10189 != null) {
                        c101893 = this.f22821.f56501;
                        if (c101893.f30618 != -1) {
                            C18832 c18832 = this.f22820;
                            c101894 = this.f22821.f56501;
                            interfaceC21449 = new C1784(c18832, c101894.f30618, this);
                            InterfaceC19383 m42297 = this.f22821.m42297();
                            this.f22831 = m42297;
                            c8353 = C18176.f56486;
                            m42297.mo8456(c8353);
                        }
                    }
                    InterfaceC21449 interfaceC214492 = interfaceC21449;
                    long j4 = j2;
                    ((C15625) this.f22825).m36824(interfaceC214492, this.f22822, this.f22820.mo5936(), j2, j3, this.f22829);
                    c101892 = this.f22821.f56501;
                    if (c101892 != null) {
                        ((C15625) this.f22825).m36822();
                    }
                    if (this.f22823) {
                        ((C15625) this.f22825).m36823(j4, this.f22824);
                        this.f22823 = false;
                    }
                    while (true) {
                        long j5 = j4;
                        while (i == 0 && !this.f22830) {
                            try {
                                this.f22827.m34147();
                                i = ((C15625) this.f22825).m36821(this.f22832);
                                j4 = ((C15625) this.f22825).m36825();
                                j = this.f22821.f56521;
                                if (j4 > j + j5) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f22827.m34150();
                        handler = this.f22821.f56528;
                        runnableC6017 = this.f22821.f56492;
                        handler.post(runnableC6017);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (((C15625) this.f22825).m36825() != -1) {
                        this.f22832.f76532 = ((C15625) this.f22825).m36825();
                    }
                    C8751.m22643(this.f22820);
                } else {
                    if (i != 1 && ((C15625) this.f22825).m36825() != -1) {
                        this.f22832.f76532 = ((C15625) this.f22825).m36825();
                    }
                    C8751.m22643(this.f22820);
                    return;
                }
            } catch (Throwable th) {
                if (i != 1 && ((C15625) this.f22825).m36825() != -1) {
                    this.f22832.f76532 = ((C15625) this.f22825).m36825();
                }
                C8751.m22643(this.f22820);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19965(C17714 c17714) {
        long m42270;
        long max;
        if (!this.f22828) {
            max = this.f22824;
        } else {
            m42270 = this.f22821.m42270(true);
            max = Math.max(m42270, this.f22824);
        }
        int m41457 = c17714.m41457();
        InterfaceC19383 interfaceC19383 = this.f22831;
        interfaceC19383.getClass();
        interfaceC19383.mo8453(m41457, c17714);
        interfaceC19383.mo8455(max, 1, m41457, 0, null);
        this.f22828 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3104 m19959(long j) {
        Map map;
        C4515 c4515 = new C4515();
        c4515.m13281(this.f22822);
        c4515.m13286(j);
        int i = C18176.f56487;
        c4515.m13282((String) null);
        c4515.m13279(6);
        map = C18176.f56488;
        c4515.m13283(map);
        return c4515.m13278();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19961(C7428 c7428, long j, long j2) {
        c7428.f22832.f76532 = j;
        c7428.f22824 = j2;
        c7428.f22823 = true;
        c7428.f22828 = false;
    }
}
