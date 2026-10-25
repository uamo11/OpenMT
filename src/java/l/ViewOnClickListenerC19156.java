package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: J57U */
/* renamed from: l.᩵֫ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC19156 implements View.OnClickListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f60357;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f60358;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC5396 f60359;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f60360;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public View f60361;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9278 f60362;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f60363;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f60364;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20567 f60365;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9278 f60366;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f60367;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C18450 f60368;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f60369;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public View f60370;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44234(boolean z) {
        View view = this.f60370;
        this.f60364 = z;
        if (z) {
            if (this.f60363) {
                this.f60363 = false;
                this.f60360.setVisibility(8);
                view.setRotationX(0.0f);
            }
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC19156 m44222(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = new ViewOnClickListenerC19156();
        viewOnClickListenerC19156.f60357 = false;
        viewOnClickListenerC19156.f60363 = false;
        viewOnClickListenerC19156.f60358 = true;
        viewOnClickListenerC19156.f60359 = viewOnClickListenerC5396;
        viewOnClickListenerC19156.f60361 = viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04df);
        viewOnClickListenerC19156.f60360 = viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04b5);
        viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a01f5).setOnClickListener(viewOnClickListenerC19156);
        viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a01f4).setOnClickListener(viewOnClickListenerC19156);
        View m10241 = viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04ad);
        viewOnClickListenerC19156.f60369 = m10241;
        m10241.setOnClickListener(viewOnClickListenerC19156);
        View m102412 = viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04ae);
        viewOnClickListenerC19156.f60367 = m102412;
        m102412.setOnClickListener(viewOnClickListenerC19156);
        viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a0102).setOnClickListener(viewOnClickListenerC19156);
        View m102413 = viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04b3);
        viewOnClickListenerC19156.f60370 = m102413;
        m102413.setOnClickListener(viewOnClickListenerC19156);
        viewOnClickListenerC19156.f60370 = ((ViewGroup) m102413).getChildAt(1);
        viewOnClickListenerC19156.f60366 = new C9278(true, (C5062) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04d6), (TextView) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04db), (Spinner) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04e4), (CheckBox) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04da));
        viewOnClickListenerC19156.f60362 = new C9278(false, (C5062) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04af), (TextView) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04b2), (Spinner) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04b4), (CheckBox) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a04b0));
        return viewOnClickListenerC19156;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m44238() {
        return this.f60368 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44233() {
        C18450 c18450 = this.f60368;
        if (c18450 != null) {
            c18450.cancel();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44235() {
        View view = this.f60367;
        View view2 = this.f60369;
        C9278 c9278 = this.f60366;
        if (c9278.f28110 || c9278.f28105) {
            m44236();
            return;
        }
        if (!this.f60363 || this.f60362.f28105) {
            view2.setEnabled(false);
            view.setEnabled(false);
        } else {
            view2.setEnabled(true);
            view.setEnabled(true);
        }
        if (this.f60357) {
            return;
        }
        this.f60359.m15398();
        this.f60361.setVisibility(0);
        this.f60357 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44236() {
        if (this.f60357) {
            this.f60361.setVisibility(8);
            this.f60357 = false;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44237() {
        return this.f60357;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f60370;
        View view3 = this.f60360;
        C9278 c9278 = this.f60362;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f60359;
        if (m44238()) {
            return;
        }
        int id = view.getId();
        if ((id == R.id.MT_Protector_res_0x7f0a04ad || id == R.id.MT_Protector_res_0x7f0a04ae) && viewOnClickListenerC5396.f16793.m18491()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a01f5) {
            m44232();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a01f4) {
            m44231();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a04ad) {
            C6807 c6807 = viewOnClickListenerC5396.f16793;
            C20567 c20567 = this.f60365;
            if (c20567 != null) {
                C11041 c11041 = c6807.f21109;
                if (c20567.m47129(c11041.m27414(), c11041.m27418(), c11041.m27404(), c11041.m27406())) {
                    c9278.m23801();
                    if (c6807.m18485(c9278.f28112)) {
                        if (this.f60358) {
                            m44231();
                            return;
                        } else {
                            m44232();
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.f60358) {
                m44231();
                return;
            } else {
                m44232();
                return;
            }
        }
        if (id != R.id.MT_Protector_res_0x7f0a04ae) {
            if (id == R.id.MT_Protector_res_0x7f0a0102) {
                m44236();
                return;
            }
            if (id != R.id.MT_Protector_res_0x7f0a04b3 || this.f60364) {
                return;
            }
            if (this.f60363) {
                this.f60363 = false;
                view3.setVisibility(8);
                view2.setRotationX(0.0f);
                return;
            } else {
                this.f60363 = true;
                view3.setVisibility(0);
                view2.setRotationX(180.0f);
                return;
            }
        }
        C9278 c92782 = this.f60366;
        c92782.m23801();
        c9278.m23801();
        C6807 c68072 = viewOnClickListenerC5396.f16793;
        C18177 m27414 = c68072.f21109.m27414();
        byte[] bArr = c92782.f28112;
        byte[] bArr2 = c9278.f28112;
        if (bArr == null || bArr.length == 0) {
            this.f60365 = null;
            return;
        }
        final C18450 c18450 = new C18450();
        final C2222 c2222 = new C2222(this, c68072, m27414);
        C16684 m18472 = c68072.m18472(new Runnable() { // from class: l.᩺۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C18450.this.cancel();
            }
        }, new Runnable() { // from class: l.ܰ۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C2222.this.m7401();
            }
        });
        if (m18472 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
        } else {
            new C6455(this, c18450, m27414, m18472, c2222, bArr, bArr2, c68072).m20274();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m44232() {
        this.f60358 = false;
        C9278 c9278 = this.f60366;
        c9278.m23801();
        C6807 c6807 = this.f60359.f16793;
        C11041 c11041 = c6807.f21109;
        C18177 m27414 = c11041.m27414();
        byte[] bArr = c9278.f28112;
        if (bArr == null || bArr.length == 0) {
            this.f60365 = null;
            return;
        }
        this.f60365 = null;
        new C10689(this, new C18450(), m27414, bArr, !c11041.m27406() ? c11041.m27418() : c11041.m27418() - 1, c6807).m20274();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m44231() {
        long m27404;
        this.f60358 = true;
        C9278 c9278 = this.f60366;
        c9278.m23801();
        C6807 c6807 = this.f60359.f16793;
        C11041 c11041 = c6807.f21109;
        C18177 m27414 = c11041.m27414();
        byte[] bArr = c9278.f28112;
        if (bArr == null || bArr.length == 0) {
            this.f60365 = null;
            return;
        }
        this.f60365 = null;
        if (!c11041.m27406()) {
            m27404 = c11041.m27418();
        } else {
            m27404 = c11041.m27404() + 1;
        }
        new C17038(this, new C18450(), m27414, bArr, m44219(m27404, false), c6807).m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8572 m44221(C18177 c18177, C16059 c16059, byte[] bArr, byte[] bArr2, C23388 c23388) {
        C11003.requireNonNull(c18177, "document");
        C11003.requireNonNull(bArr, "pattern");
        if (bArr.length == 0) {
            return new C8572(0L, 0, false);
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        InterfaceC17066 m38504 = C16360.m38504(c23388);
        C11122 m42379 = c18177.m42379(c16059);
        try {
            if (bArr.length > c16059.length()) {
                C8572 c8572 = new C8572(0L, 0, false);
                m42379.close();
                return c8572;
            }
            C15626 c15626 = new C15626(m42379.m27596(bArr.length, bArr3), c16059.length(), bArr, bArr3, m38504);
            try {
                c16059.m37966(c15626, c16059.length());
                if (m38504.mo1526()) {
                    C8572 m22281 = C8572.m22281();
                    m42379.close();
                    return m22281;
                }
                try {
                    C8572 finish = c15626.finish();
                    if (m38504.mo1526()) {
                        C8572 m222812 = C8572.m22281();
                        m42379.close();
                        return m222812;
                    }
                    if (finish.f26173 != 0) {
                        int i = finish.f26174;
                        m42379.m27601(i, i);
                        if (!m42379.m27600(m38504)) {
                            C8572 m222813 = C8572.m22281();
                            m42379.close();
                            return m222813;
                        }
                    }
                    m42379.close();
                    return finish;
                } catch (C23821 unused) {
                    C8572 m222814 = C8572.m22281();
                    m42379.close();
                    return m222814;
                }
            } catch (C3633 unused2) {
                C8572 m222815 = C8572.m22281();
                m42379.close();
                return m222815;
            }
        } catch (Throwable th) {
            try {
                m42379.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44225(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18450 c18450) {
        if (viewOnClickListenerC19156.f60368 != null) {
            throw new IllegalStateException("Another search task is active");
        }
        viewOnClickListenerC19156.f60368 = c18450;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44230(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18450 c18450) {
        if (viewOnClickListenerC19156.f60368 == c18450) {
            viewOnClickListenerC19156.f60368 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m44227(C18177 c18177) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f60359;
        return (viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed() || viewOnClickListenerC5396.f16793.f21109.m27414() != c18177) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44229(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18177 c18177, C16059 c16059) {
        return c16059 != null && viewOnClickListenerC19156.m44227(c18177) && c18177.m42385() == c16059.m37965();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44224(ViewOnClickListenerC19156 viewOnClickListenerC19156, C6807 c6807, C18177 c18177, Exception exc) {
        if (viewOnClickListenerC19156.m44227(c18177)) {
            if (exc instanceof C7161) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12030d);
            } else if (!(exc instanceof IOException)) {
                viewOnClickListenerC19156.f60359.m10223(exc, (DialogInterface.OnDismissListener) null);
            } else {
                c6807.m18479((IOException) exc);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44223(C16765 c16765) {
        if (c16765 != null) {
            c16765.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44219(long j, boolean z) {
        if (j < (z ? -1L : 0L) || j > 2147483647L) {
            throw new IndexOutOfBoundsException(C16014.m37865(j, "Search offset="));
        }
        return (int) j;
    }
}
