package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: D5GW */
/* renamed from: l.ۜܰܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C6807 extends View {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f21108;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11041 f21109;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10607 f21110;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21111;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f21112;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f21113;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f21114;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f21115;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerC17390 f21116;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f21117;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4690 f21118;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0923 f21119;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7701 f21120;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18618 f21121;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f21122;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f21123;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f21124;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f21125;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21126;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f21127;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16684 f21128;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14567 f21129;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC5396 f21130;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f21131;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m18468() {
        boolean z;
        if (!this.f21131) {
            z = this.f21128 != null;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C16684 m18472(Runnable runnable, Runnable runnable2) {
        if (!this.f21131 && this.f21128 == null) {
            C16684 c16684 = new C16684(this, runnable, runnable2);
            this.f21128 = c16684;
            return c16684;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m18482(boolean z) {
        this.f21131 = z;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized C14567 m18488() {
        if (this.f21129 != null) {
            return null;
        }
        C14567 c14567 = new C14567(this);
        this.f21129 = c14567;
        return c14567;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18491() {
        return this.f21128 != null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18497() {
        return this.f21129 != null;
    }

    public C6807(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6807(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21113 = SystemClock.uptimeMillis();
        this.f21117 = 0L;
        this.f21108 = 0L;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f21116 = new HandlerC17390(this);
        this.f21121 = new C18618(context);
        this.f21119 = new C0923(context, new C18096(this, context));
        this.f21112 = ViewConfiguration.get(context).getScaledOverflingDistance();
        C11041 c11041 = new C11041(this);
        this.f21109 = c11041;
        this.f21110 = new C10607(this, c11041);
        this.f21118 = new C4690(this);
        C7701 c7701 = new C7701(this);
        c7701.m20615(3500);
        c7701.m20613(new C14127(this));
        this.f21120 = c7701;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18460(final C6807 c6807, MenuItem menuItem) {
        int itemId;
        C11041 c11041 = c6807.f21109;
        try {
            itemId = menuItem.getItemId();
        } catch (IOException e) {
            c6807.m18479(e);
        }
        if ((itemId == R.string.MT_Protector_res_0x7f1205ca || itemId == R.string.MT_Protector_res_0x7f1205de) && c6807.m18468()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            c11041.m27393((byte[]) null);
        } else if (itemId == R.string.MT_Protector_res_0x7f1205de) {
            c11041.m27405();
        } else if (itemId == 17039361) {
            if (c11041.m27407()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120431);
            } else {
                C14567 m18488 = c6807.m18488();
                if (m18488 == null) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
                } else {
                    new C10857(new C16500(), c6807, c6807.getContext(), m18488).m20274();
                }
            }
        } else if (itemId == R.string.MT_Protector_res_0x7f1205c3) {
            int i = C9902.f29951;
            final C18368 m42801 = C18368.m42801(c6807);
            if (m42801 != null) {
                Context context = c6807.getContext();
                int i2 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258(context);
                c19258.m44418(R.array.MT_Protector_res_0x7f030009, new DialogInterface.OnClickListener() { // from class: l.۫ۨܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        C18368 c18368 = m42801;
                        C6807 c68072 = C6807.this;
                        if (c18368.m42802(c68072)) {
                            C14567 m184882 = c68072.m18488();
                            if (m184882 == null) {
                                C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
                                return;
                            }
                            if (!c18368.m42802(c68072)) {
                                m184882.close();
                                return;
                            }
                            if (i3 < 5 && C9902.m25004(c18368.f57066, c18368.f57062, i3) > 524288) {
                                m184882.close();
                                C21374.m48457(R.string.MT_Protector_res_0x7f1201ff);
                            } else {
                                Context context2 = c68072.getContext();
                                new C11686(c18368, context2 instanceof AbstractActivityC3346 ? (AbstractActivityC3346) context2 : null, m184882, c68072, i3, context2).m20274();
                            }
                        }
                    }
                });
                DialogInterfaceC0206 m44415 = c19258.m44415();
                m44415.m1445().setDimAmount(0.0f);
                m44415.m1449();
            }
        } else if (itemId == R.string.MT_Protector_res_0x7f120600) {
            C21273.m48293(c6807);
        } else if (itemId == 17039371) {
            C9446 c9446 = new C9446();
            final C8740 c8740 = new C8740(c6807);
            C16684 m18472 = c6807.m18472(new RunnableC17206(c9446), new Runnable() { // from class: l.ܳ۟ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C8740.this.m22607();
                }
            });
            if (m18472 == null) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1207a7);
            } else {
                new C20735(c8740, c6807, c9446, m18472).m20274();
            }
        }
        c6807.invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18490(int i) {
        C11041 c11041 = this.f21109;
        c11041.m27392(i, true);
        m18464();
        m18483(c11041.m27418());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18495() {
        C14567 c14567;
        synchronized (this) {
            c14567 = this.f21129;
        }
        if (c14567 != null) {
            c14567.m34821();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m18493() {
        C16684 c16684;
        synchronized (this) {
            c16684 = this.f21128;
        }
        if (c16684 == null) {
            return false;
        }
        c16684.m39220();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18484(Runnable runnable) {
        C16684 c16684;
        synchronized (this) {
            c16684 = this.f21128;
        }
        if (c16684 == null) {
            return false;
        }
        c16684.m39217(runnable);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18462(C6807 c6807, C16684 c16684) {
        synchronized (c6807) {
            if (c6807.f21128 == c16684) {
                c6807.f21128 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18461(C6807 c6807, C14567 c14567) {
        synchronized (c6807) {
            if (c6807.f21129 == c14567) {
                c6807.f21129 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18485(byte[] bArr) {
        if (m18468()) {
            return false;
        }
        try {
            this.f21109.m27393(bArr);
            invalidate();
            return true;
        } catch (IOException e) {
            m18479(e);
            return false;
        } catch (C7161 unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12030d);
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18177 m18473(C18177 c18177) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        HandlerC17390 handlerC17390 = this.f21116;
        handlerC17390.removeMessages(2);
        handlerC17390.removeMessages(3);
        this.f21120.m20608();
        m18495();
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        boolean z = this.f21115;
        this.f21115 = false;
        this.f21114 = false;
        this.f21108 = 0L;
        handlerC17390.f53228 = false;
        C18177 m27390 = this.f21109.m27390(c18177);
        this.f21127 = 0L;
        this.f21122 = false;
        if (z && (viewOnClickListenerC5396 = this.f21130) != null) {
            viewOnClickListenerC5396.m15388(false);
        }
        invalidate();
        return m27390;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18476(int i, int i2) {
        C4690 c4690;
        C11041 c11041 = this.f21109;
        c11041.m27409(i, i2);
        invalidate();
        int m27418 = c11041.m27418();
        int m27404 = c11041.m27404();
        if (getHeight() == 0 || (c4690 = this.f21118) == null) {
            return;
        }
        long m13762 = c4690.m13762();
        long j = this.f21127;
        int m27413 = m27418 / c11041.m27413();
        long m13758 = c4690.m13758(m27413);
        if (j <= m13758) {
            m13758 = c4690.m13749(m27413);
            if (j >= m13758) {
                m13758 = j;
            }
        }
        if (m13758 > m13762) {
            m13758 = m13762;
        }
        int m274132 = m27404 / c11041.m27413();
        if (m27413 != m274132) {
            long m137582 = c4690.m13758(m274132);
            if (j <= m137582) {
                m137582 = c4690.m13749(m274132);
                if (j >= m137582) {
                    m137582 = j;
                }
            }
            if (m137582 <= m13762) {
                m13762 = m137582;
            }
            if (j == m13758 && j != m13762) {
                m13758 = m13762;
            } else if (j == m13758 || j != m13762) {
                if (j != m13758) {
                    if (j > m13758 && j > m13762) {
                        m13758 = Math.min(m13758, m13762);
                    } else if (j < m13758 && j < m13762) {
                        m13758 = Math.max(m13758, m13762);
                    }
                }
                m13758 = j;
            }
        }
        if (j != m13758) {
            C18618 c18618 = this.f21121;
            if (!c18618.m43167()) {
                c18618.m43162();
            }
            c18618.m43163(j, m13758 - j);
            invalidate();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18492(int i) {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        if (c11041.m27406()) {
            return;
        }
        try {
            c11041.m27391(i);
            m18464();
            invalidate();
            m18483(c11041.m27418());
        } catch (IOException e) {
            m18479(e);
        } catch (C7161 unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12030d);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m18494() {
        return this.f21127;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18478(long j) {
        this.f21127 = j;
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4690 c4690 = this.f21118;
        boolean m13765 = c4690.m13765();
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = this.f21111;
        int i7 = 0;
        C10607 c10607 = this.f21110;
        boolean z2 = (i5 == i6 || c10607.f31845 == 0) ? false : true;
        C11041 c11041 = this.f21109;
        if (z2) {
            i7 = c4690.m13748(0.0f, this.f21127 + c4690.m13766(), false);
            this.f21111 = i5;
            if (getResources().getConfiguration().orientation == 1) {
                c11041.m27408(8);
            } else {
                c11041.m27408(16);
            }
            c10607.m26628(i5);
        } else {
            c10607.m26629(i5);
        }
        if (m13765) {
            if (m18483(c11041.m27418())) {
                return;
            }
            long m13762 = c4690.m13762();
            if (this.f21127 > m13762) {
                m18478(m13762);
                return;
            }
            return;
        }
        if (!z2) {
            long m137622 = c4690.m13762();
            if (this.f21127 > m137622) {
                m18478(m137622);
                return;
            }
            return;
        }
        long min = Math.min(c4690.m13758(i7 / c11041.m27413()), c4690.m13762());
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        long j = this.f21127;
        c18618.m43163(j, min - j);
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18483(int i) {
        C4690 c4690;
        if (getHeight() == 0 || (c4690 = this.f21118) == null) {
            return false;
        }
        int m27413 = i / this.f21109.m27413();
        long m13758 = c4690.m13758(m27413);
        long m13762 = c4690.m13762();
        long j = this.f21127;
        if (j <= m13758) {
            m13758 = c4690.m13749(m27413);
            if (j >= m13758) {
                m13758 = j;
            }
        }
        if (m13758 <= m13762) {
            m13762 = m13758;
        }
        if (j == m13762) {
            return false;
        }
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        c18618.m43163(j, m13762 - j);
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        if (this.f21114) {
            z = true;
            z2 = true;
        } else {
            z = isFocused() && (SystemClock.uptimeMillis() - this.f21113) % 1000 < 500;
            z2 = isFocused() && SystemClock.uptimeMillis() - this.f21117 < 3500;
        }
        try {
            if (!this.f21115) {
                int uptimeMillis = (int) (SystemClock.uptimeMillis() - this.f21108);
                if (uptimeMillis >= 0) {
                    if (uptimeMillis > 1500) {
                        int i = uptimeMillis - 1500;
                        if (i < 300) {
                            f = 1.0f - (i / 300.0f);
                            this.f21118.m13751(canvas, z, z2, f, this.f21115);
                            this.f21122 = false;
                            return;
                        }
                    }
                }
                f = 0.0f;
                this.f21118.m13751(canvas, z, z2, f, this.f21115);
                this.f21122 = false;
                return;
            }
            this.f21118.m13751(canvas, z, z2, f, this.f21115);
            this.f21122 = false;
            return;
        } catch (IOException e) {
            canvas.drawColor(this.f21110.f31858);
            if (this.f21122 || (viewOnClickListenerC5396 = this.f21130) == null) {
                return;
            }
            this.f21122 = true;
            viewOnClickListenerC5396.m15384(e);
            return;
        }
        f = 1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18463(C6807 c6807, boolean z) {
        if (z) {
            HandlerC17390 handlerC17390 = c6807.f21116;
            handlerC17390.removeMessages(2);
            handlerC17390.sendEmptyMessageDelayed(2, 250L);
            return;
        }
        c6807.m18459(-1, false);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m18467(C6807 c6807) {
        c6807.m18459(-1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if ((((r3.f34502 - r13.f21127) + r1.m20614()) + r15.f31838.getIntrinsicHeight()) > getHeight()) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18459(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6807.m18459(int, boolean):void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        C18618 c18618 = this.f21121;
        if (c18618.m43165()) {
            m18465();
            m18478(c18618.m43166());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m18464() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f21113 = uptimeMillis;
        this.f21117 = uptimeMillis;
        this.f21116.m40745();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m18465() {
        this.f21108 = SystemClock.uptimeMillis();
        HandlerC17390 handlerC17390 = this.f21116;
        handlerC17390.removeMessages(3);
        handlerC17390.sendEmptyMessageDelayed(3, 1500L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21116.m40744();
        m18493();
        m18495();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m18464();
        } else {
            this.f21116.m40744();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0 != 6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r0 > 1.0d) goto L37;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6807.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m18486() {
        this.f21109.m27401();
        this.f21122 = false;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18480(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f21130 = viewOnClickListenerC5396;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18477(int i, int i2, boolean z) {
        this.f21113 = SystemClock.uptimeMillis();
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15383(i, i2, this.f21109.m27415(), z);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18489() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15396();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18475() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            C11041 c11041 = this.f21109;
            viewOnClickListenerC5396.m15389(c11041.m27410(), c11041.m27394(), c11041.m27414().m42394());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18479(IOException iOException) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15384(iOException);
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18487() {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        c11041.m27403();
        invalidate();
        m18483(c11041.m27418());
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18496() {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        c11041.m27417();
        invalidate();
        m18483(c11041.m27418());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23740 m18474(C4607 c4607) {
        if (c4607 != null) {
            return new C23740(c4607.m13518(), c4607.m13520(), 0, this.f21127, c4607.m13519(), c4607.m13517());
        }
        long j = this.f21127;
        C11041 c11041 = this.f21109;
        return new C23740(c11041.m27418(), c11041.m27404(), 0, j, c11041.m27412(), c11041.m27406());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18481(C23740 c23740) {
        C11003.requireNonNull(c23740, "state");
        boolean z = c23740.f76869;
        boolean z2 = c23740.f76867;
        C11041 c11041 = this.f21109;
        int m27415 = c11041.m27415();
        int i = c23740.f76871;
        int i2 = c23740.f76870;
        if (m27415 >= 0) {
            long j = c23740.f76868;
            if (j >= 0) {
                if (z2) {
                    if (m27415 == 0 || i2 < 0 || i < i2 || i >= m27415) {
                        throw new IllegalArgumentException("Invalid range selection");
                    }
                } else if (i2 < 0 || i2 != i || i2 > m27415 || (i2 == m27415 && !z)) {
                    throw new IllegalArgumentException("Invalid cursor selection");
                }
                this.f21127 = Math.min(j, this.f21118.m13762());
                if (z2) {
                    c11041.m27409(i2, i);
                } else {
                    c11041.m27392(i2, z);
                }
                invalidate();
                return;
            }
        }
        throw new IllegalArgumentException("Negative UI state value");
    }
}
