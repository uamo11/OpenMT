package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: L4NY */
/* renamed from: l.֫ۜܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC1661 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5805;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5806;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5807;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC1661 f5808;

    /* renamed from: ܽ */
    public abstract void mo1455(C2450 c2450);

    /* renamed from: ᩳ */
    public boolean mo1456(C2450 c2450) {
        return !(this instanceof C15024);
    }

    public AbstractC1661(int i, int i2) {
        this.f5805 = i;
        this.f5807 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1661 mo5603(AbstractC1661 abstractC1661) {
        this.f5808 = abstractC1661;
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5604() {
        this.f5806 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5605(C2450 c2450) {
        if (this.f5806 && c2450.m7919().m39040()) {
            return false;
        }
        return mo1456(c2450);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5608(C2450 c2450) {
        AbstractC1661 abstractC1661 = this.f5808;
        if (abstractC1661 == null) {
            return false;
        }
        if (abstractC1661.f5806 && c2450.m7919().m39040()) {
            return false;
        }
        return this.f5808.mo1456(c2450);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m5609() {
        return this.f5806;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m5610() {
        return this.f5805;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m5607() {
        return this.f5807;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5606(C2450 c2450, boolean z) {
        if (z) {
            if (!m5608(c2450)) {
                return false;
            }
            this.f5808.mo1455(c2450);
            return true;
        }
        if (!m5605(c2450)) {
            return false;
        }
        mo1455(c2450);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m5602(final C2450 c2450, int i, CharSequence charSequence) {
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44433(i);
        buildDialog.m44424(charSequence);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۟᩻ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AbstractC1661.this.mo2321(c2450);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        return buildDialog.m44438();
    }

    /* renamed from: ܿ */
    public void mo2321(C2450 c2450) {
        throw new RuntimeException("Please override method onQueryOK()");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m5601(C2450 c2450) {
        int m7918 = c2450.m7918();
        if (m7918 == 1) {
            return C4925.m14306(R.string.MT_Protector_res_0x7f1203b2, C4925.m14327(R.string.MT_Protector_res_0x7f1205ca).toLowerCase(), c2450.m7913().mo36985());
        }
        return C4925.m14306(R.string.MT_Protector_res_0x7f1203b1, C4925.m14327(R.string.MT_Protector_res_0x7f1205ca).toLowerCase(), Integer.valueOf(m7918));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5600(C2450 c2450, int i) {
        int m7918 = c2450.m7918();
        if (m7918 == 1) {
            return C4925.m14306(R.string.MT_Protector_res_0x7f1203b4, C4925.m14327(i).toLowerCase(), c2450.m7913().mo36985(), c2450.m7919().m39059());
        }
        return C4925.m14306(R.string.MT_Protector_res_0x7f1203b3, C4925.m14327(i).toLowerCase(), Integer.valueOf(m7918), c2450.m7919().m39059());
    }
}
