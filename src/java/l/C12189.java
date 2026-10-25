package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: 8AHX */
/* renamed from: l.۫ۙ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12189 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f36337;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f36338;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f36339 = false;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f36340;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5839 f36341;

    public C12189(C5839 c5839, AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, String str) {
        this.f36341 = c5839;
        this.f36337 = abstractActivityC3346;
        this.f36340 = abstractC15440;
        this.f36338 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        final AbstractActivityC3346 abstractActivityC3346 = this.f36337;
        C4925.m14309(200L, new Runnable() { // from class: l.۬ۙ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C12189.m29664(C12189.this, abstractActivityC3346);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29664(C12189 c12189, AbstractActivityC3346 abstractActivityC3346) {
        if (c12189.f36339) {
            return;
        }
        c12189.m20267(abstractActivityC3346, R.string.MT_Protector_res_0x7f1207a7);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C10073 c10073;
        C10073 c100732;
        C10073 c100733;
        C10073 c100734;
        C10073 c100735;
        C10073 c100736;
        C10073 c100737;
        C10073 c100738;
        C10073 c100739;
        AbstractC15440 abstractC15440 = this.f36340;
        boolean m36488 = abstractC15440.m36488();
        String str = null;
        C5839 c5839 = this.f36341;
        if (m36488) {
            Typeface createFromFile = Typeface.createFromFile(this.f36338);
            if (createFromFile == null || createFromFile == Typeface.DEFAULT) {
                throw new C14501(R.string.MT_Protector_res_0x7f1204c2);
            }
            c100738 = c5839.f17903;
            abstractC15440.m36500(c100738.f30302, (C17558) null, (InterfaceC5627) null);
            c100739 = c5839.f17903;
            c100739.f30303 = true;
        } else {
            c10073 = c5839.f17903;
            abstractC15440.m36500(c10073.f30302, (C17558) null, (InterfaceC5627) null);
            c100732 = c5839.f17903;
            c100732.f30303 = true;
            c100733 = c5839.f17903;
            Typeface createFromFile2 = Typeface.createFromFile(c100733.f30302.mo23554());
            if (createFromFile2 == null || createFromFile2 == Typeface.DEFAULT) {
                throw new C14501(R.string.MT_Protector_res_0x7f1204c2);
            }
        }
        c100734 = c5839.f17903;
        try {
            InputStream mo27926 = c100734.f30302.mo27926();
            try {
                String m25024 = C9913.m25023(mo27926).m25024(4, c5839.m6886().getResources().getConfiguration().locale);
                if (!TextUtils.isEmpty(m25024)) {
                    if (mo27926 != null) {
                        mo27926.close();
                    }
                    str = m25024;
                } else if (mo27926 != null) {
                    mo27926.close();
                }
            } finally {
            }
        } catch (IOException unused) {
        }
        if (str == null) {
            str = abstractC15440.m36517();
        }
        c100735 = c5839.f17903;
        c100735.f30300 = str;
        c100736 = c5839.f17903;
        c100737 = c5839.f17903;
        c100736.f30301 = C20812.m47627(c100737.f30302, "MD5");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C10073 c10073;
        C10073 c100732;
        C10073 c100733;
        C10073 c100734;
        C10073 c100735;
        C5839 c5839 = this.f36341;
        c10073 = c5839.f17903;
        c10073.m25285();
        c100732 = c5839.f17903;
        String[] strArr = c100732.f30295;
        c100733 = c5839.f17903;
        int i = c100733.f30299;
        c100734 = c5839.f17903;
        String str = c100734.f30300;
        if (str == null) {
            str = C4925.m14327(R.string.MT_Protector_res_0x7f1206ff);
        }
        strArr[i] = C4925.m14306(R.string.MT_Protector_res_0x7f120215, str);
        c100735 = c5839.f17903;
        ((BaseAdapter) c100735.f30298.m1443().getAdapter()).notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof IOException)) {
            C21374.m48463(R.string.MT_Protector_res_0x7f1204c2);
        } else {
            this.f36337.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f36339 = true;
        m20273();
    }
}
