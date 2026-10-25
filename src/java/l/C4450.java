package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: C9QS */
/* renamed from: l.ۙۚ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4450 extends AbstractC22366 {

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f14201;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public volatile C22670 f14202;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f14204;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f14205;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C15249 f14207;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f14203 = new HashSet();

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C4586 f14200 = new C4586(false);

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19485 f14206 = new C22089(this);

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        C22670 c22670;
        C22670 c226702;
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        C5031 c5031 = (C5031) m11526();
        this.f14201 = c5031.m14529();
        boolean z = m11558.length == 1;
        this.f14205 = z;
        if (z) {
            m50128();
        }
        C17721.m41503(m11556, EnumC16309.MODIFY_DIRECTORY);
        C16999.m39866(m11556, new String[0]).m36508();
        this.f14207 = C15249.m36217(m11556, this.f14200, this.f14206, new C20026(C16340.m38484(c5031)));
        if (this.f14201) {
            c22670 = new C22670();
            this.f14202 = c22670;
            if (this.f14204 || mo1526()) {
                c22670.m50658();
            }
        } else {
            c22670 = null;
        }
        try {
            if (this.f14201) {
                c5031.m14535(c226702);
            }
            this.f14207.m36242(m11558, (AbstractC13921) c5031, true, false);
            if (!this.f14207.m36243(false)) {
                cancel();
                return C17222.m40521();
            }
            if (this.f14201) {
                c226702 = new C22670();
                this.f14202 = c226702;
                if (this.f14204 || mo1526()) {
                    c226702.m50658();
                }
            } else {
                c226702 = null;
            }
            try {
                InterfaceC0091 m14530 = this.f14201 ? c5031.m14530(c226702) : c5031.m14530((C22670) null);
                try {
                    Iterator it = this.f14207.m36248().iterator();
                    while (it.hasNext()) {
                        m13201((AbstractC1139) it.next(), m14530);
                    }
                    m14530.close();
                    if (this.f14202 == c226702) {
                        this.f14202 = null;
                    }
                    return m11545();
                } finally {
                }
            } finally {
                if (this.f14202 == c226702) {
                    this.f14202 = null;
                }
            }
        } finally {
            if (this.f14202 == c226702) {
                this.f14202 = null;
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(this.f14201 ? R.string.MT_Protector_res_0x7f120a28 : R.string.MT_Protector_res_0x7f120a2a, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    public final void cancel() {
        super.cancel();
        this.f14204 = true;
        C22670 c22670 = this.f14202;
        if (c22670 != null) {
            c22670.m50658();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13201(AbstractC1139 abstractC1139, InterfaceC0091 interfaceC0091) {
        if (mo1526()) {
            return;
        }
        if (abstractC1139.m3888()) {
            throw new IOException("Unsupported payload directory entry: " + abstractC1139.m3910());
        }
        this.f14207.m47715();
        int i = this.f14201 ? R.string.MT_Protector_res_0x7f1202d0 : R.string.MT_Protector_res_0x7f12037a;
        if (this.f14207.m47716() > 1) {
            mo11546(C4925.m14327(i) + MotionUtils.EASING_TYPE_FORMAT_START + this.f14207.m47714() + "/" + this.f14207.m47716() + MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            m11536(i);
        }
        mo11520(abstractC1139.m3898());
        if (this.f14205) {
            mo11538(0);
        } else {
            m50129(0);
            mo11538(this.f14207.m47712());
        }
        AbstractC15440 m3892 = abstractC1139.m3892();
        if (abstractC1139.m3879()) {
            if (abstractC1139.m3908()) {
                m3892 = m3892.m36492(true);
                abstractC1139.m3896(m3892);
                if (abstractC1139.m3893() != null) {
                    abstractC1139.m3907(m3892.getName());
                }
            } else if (abstractC1139.m3880()) {
                m3892.mo29017(this);
            } else {
                m3892.mo23552();
            }
        }
        String m3910 = abstractC1139.m3910();
        if (m3910.startsWith("/")) {
            m3910 = m3910.substring(1);
        }
        C13621 mo1053 = interfaceC0091.mo1053(m3910);
        try {
            C23411 m36513 = m3892.m36513("rw");
            try {
                interfaceC0091.mo1051(mo1053, m36513, new C19973(this, mo1053));
                m36513.close();
                if (mo1526()) {
                    m3892.mo27929();
                    return;
                }
                C17558 m3901 = abstractC1139.m3901();
                if (m3901 != null) {
                    m3901.m41052(m3892);
                }
                this.f14207.m47708(abstractC1139.m3913());
                C14463.m34554(abstractC1139.m3900(), true);
                if (abstractC1139.m3893() != null) {
                    this.f14203.add((String) abstractC1139.m3893());
                }
            } catch (Throwable th) {
                try {
                    m36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            m3892.mo27929();
            throw e;
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        if (mo1526()) {
            return C17222.m40521();
        }
        return C17222.m40517(exc);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        HashSet hashSet = this.f14203;
        if (hashSet.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) hashSet);
        c165602.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
