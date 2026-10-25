package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import moe.shizuku.server.IShizukuService;

/* compiled from: N9ZJ */
/* renamed from: l.۬֡᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C12771 extends AbstractC3163 implements InterfaceC16982 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38365 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f38366;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC12336 f38367;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile C19828 f38368;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8538 f38369;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile C12066 f38370;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f38371;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38372;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21776 f38373;

    static {
        ApplicationC12518.m30701(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private native void m31077();

    @Override // l.AbstractC3163
    /* renamed from: ۗ */
    public final boolean mo9687() {
        return true;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩹ */
    public final boolean mo9708() {
        return false;
    }

    public C12771(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f38366 = new Object();
        this.f38369 = new C8538();
        this.f38367 = new C0070();
        this.f38371 = new C3786(new C14887(this), true);
        this.f38370 = C12066.m29443(i, abstractC3577);
        this.f38368 = new C19828(this.f38370);
        m31077();
    }

    public C12771(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C12066 m29443 = C12066.m29443(this.f9954, abstractC3577);
        if (this.f38370.equals(m29443)) {
            return;
        }
        C1482.m5142(m31070(m29443, false).f70306);
        this.f38371.m11441();
    }

    @Override // l.AbstractC3163
    /* renamed from: ۘ */
    public final String mo9688() {
        return this.f38370.f36083;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۖ */
    public final String mo9686() {
        return this.f38370.f36083;
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9700(long j, String str) {
        m31073().mo7214(j, str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ܶ */
    public final String mo9699() {
        return TextUtils.isEmpty(this.f38370.f36085) ? "/" : AbstractC16891.m39731(this.f38370.f36085);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        C21944 m31070;
        this.f38371.m11441();
        if (z) {
            synchronized (this.f38366) {
                m31070 = m31070(this.f38370, true);
            }
            try {
                C1482.m5142(m31070.f70306);
            } finally {
                m31071(m31070);
            }
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܳ */
    public final InterfaceC1377 mo9698(String str) {
        return m31073().mo7213(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final InputStream mo9681(long j, String str) {
        return m31073().mo7212(j, str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final InputStream mo9682(String str, long j, long j2) {
        return m31073().mo7207(str, j, j2);
    }

    @Override // l.InterfaceC16982
    /* renamed from: ֫ */
    public final InputStream mo14222(String str, long j, long j2, C9928 c9928) {
        InterfaceC2188 m31073 = m31073();
        if (m31073 instanceof InterfaceC16982) {
            return ((InterfaceC16982) m31073).mo14222(str, j, j2, c9928);
        }
        return m31073.mo7207(str, j, j2);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final OutputStream mo9693(long j, String str) {
        return m31073().mo7208(j, str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9701(String str, boolean z) {
        m31073().mo7211(str, z);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9684(String str, String str2) {
        m31073().mo7210(str, str2);
    }

    @Override // l.AbstractC3163
    /* renamed from: ܿ */
    public final void mo9702(String str) {
        m31073().mo7215(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f38371.m11445(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f38371;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f38371.m11444(str);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String m24406 = C9523.m24406(str);
        C3452 c3452 = (C3452) this.f38371.m11440(m24406, C9523.m24404(str));
        if (c3452 != null) {
            return new C13329(c3452, m24406);
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String m39731 = AbstractC16891.m39731(str);
        Collection<C3452> values = this.f38371.m11446(m39731).values();
        ArrayList arrayList = new ArrayList(values.size() + 1);
        for (C3452 c3452 : values) {
            if (z || !c3452.f10916) {
                arrayList.add(new C13329(c3452, m39731));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۢ */
    public final void mo9692(String str) {
        this.f38371.m11442(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC2188 m31073() {
        C19828 c19828;
        EnumC15592 m22225;
        EnumC15592 enumC15592;
        C19828 c198282;
        C19828 c198283;
        C19828 c198284;
        EnumC15592 enumC155922;
        C19828 c198285;
        C19828 c198286;
        EnumC15592 enumC155923;
        while (true) {
            synchronized (this.f38366) {
                while (this.f38372 > 0) {
                    try {
                        this.f38366.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                    }
                }
                c19828 = this.f38368;
                m22225 = this.f38369.m22225();
            }
            if (m22225 == EnumC15592.UNKNOWN) {
                C9244 m22224 = this.f38369.m22224(new C0776(c19828), new C7832(this, c19828));
                if (m22224.m23712()) {
                    continue;
                } else {
                    m22225 = m22224.m23713();
                }
            }
            if (m31075(c19828)) {
                C4305 c4305 = new C4305(c19828, m22225);
                enumC15592 = c4305.f13883;
                if (enumC15592 == EnumC15592.SMB1_ONLY) {
                    c198282 = c4305.f13882;
                    return m31069(c198282);
                }
                try {
                    c198284 = c4305.f13882;
                    enumC155922 = c4305.f13883;
                    C10508 m31068 = m31068(c198284, enumC155922);
                    c198285 = c4305.f13882;
                    C12066 c12066 = c198285.f64061;
                    c198286 = c4305.f13882;
                    enumC155923 = c4305.f13883;
                    return new C4863(c12066, m31068, new C21239(this, c198286, enumC155923));
                } catch (C2894 unused) {
                    continue;
                } catch (IOException e2) {
                    c198283 = c4305.f13882;
                    if (m31075(c198283)) {
                        throw e2;
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21944 m31070(C12066 c12066, boolean z) {
        C21944 c21944;
        synchronized (this.f38366) {
            C12066 c120662 = this.f38370;
            this.f38368.f64060 = true;
            this.f38370 = c12066;
            if (z) {
                this.f38372++;
            }
            this.f38368 = new C19828(c12066);
            this.f38369.m22226();
            this.f38366.notifyAll();
            c21944 = new C21944(c120662, z);
        }
        return c21944;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩸ */
    public final void mo9707() {
        C21944 m31070;
        synchronized (this.f38366) {
            m31070 = m31070(this.f38370, false);
        }
        final C12066 c12066 = m31070.f70306;
        C1802.f6209.execute(new Runnable() { // from class: l.ۚ֡᩻
            @Override // java.lang.Runnable
            public final void run() {
                int i = C12771.f38365;
                C1482.m5142(C12066.this);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31071(C21944 c21944) {
        if (c21944.f70305) {
            synchronized (this.f38366) {
                int i = this.f38372;
                if (i > 0) {
                    this.f38372 = i - 1;
                }
                this.f38366.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10508 m31068(C19828 c19828, EnumC15592 enumC15592) {
        EnumC11919 enumC11919;
        synchronized (this.f38366) {
            if (m31075(c19828)) {
                while (!c19828.f64060 && c19828 == this.f38368) {
                    if (this.f38372 != 0) {
                        try {
                            this.f38366.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    }
                }
                throw new C2894();
            }
            throw new C2894();
        }
        try {
            C12066 c12066 = c19828.f64061;
            int i = C1482.f5314;
            if (enumC15592 == EnumC15592.SMB2_ONLY) {
                enumC11919 = EnumC11919.SMB2_ONLY;
            } else if (enumC15592 == EnumC15592.SMB3_ONLY) {
                enumC11919 = EnumC11919.SMB3_ONLY;
            } else {
                throw new IllegalArgumentException("Unsupported SMBJ protocol state: " + enumC15592);
            }
            C10508 m5133 = C1482.m5133(c12066, enumC11919, c19828.f64062, c19828.f64059);
            if (c19828.f64062 && !m5133.m26413()) {
                c19828.f64062 = false;
            }
            if (c19828.f64059 && !m5133.m26412()) {
                c19828.f64059 = false;
            }
            synchronized (this.f38366) {
                if (!m31075(c19828)) {
                    C1482.m5136(m5133);
                    throw new C2894();
                }
                if (m5133.m26412() && !c19828.f64059) {
                    c19828.f64059 = true;
                }
            }
            return m5133;
        } catch (IOException e2) {
            synchronized (this.f38366) {
                if (!m31075(c19828)) {
                    throw new C2894();
                }
                if (c19828.f64059) {
                    c19828.f64059 = false;
                }
                throw e2;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21776 m31069(C19828 c19828) {
        C21776 c21776;
        synchronized (this.f38366) {
            C21776 c217762 = this.f38373;
            if (c217762 == null || !c217762.m49105().equals(c19828.f64061)) {
                C12066 c12066 = c19828.f64061;
                InterfaceC18663 m51762 = C23354.m51762(c12066.f36082, c12066.f36084, c12066.f36087);
                C12066 c120662 = c19828.f64061;
                String str = c120662.f36083;
                int i = c120662.f36086;
                StringBuilder sb = new StringBuilder("smb://");
                sb.append(str);
                if (i != 445) {
                    sb.append(':');
                    sb.append(i);
                }
                this.f38373 = new C21776(c19828.f64061, m51762, sb.toString());
            }
            c21776 = this.f38373;
        }
        return c21776;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m31075(C19828 c19828) {
        return !c19828.f64060 && c19828 == this.f38368;
    }
}
