package l;

import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: 470W */
/* renamed from: l.ۜۘܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6520 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f20133;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f20134;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11419 f20135;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20798 f20136;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Executor f20137;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f20138;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20632 f20139;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23097 f20140;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15130 f20141;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10545 f20142;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3158 f20143;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f20144;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0314 f20145;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f20146;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C14280 f20147;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7744 f20148;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f20149;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17809 f20150;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f20151;

    public C6520(C20632 c20632, C17103 c17103, C7744 c7744, C0314 c0314) {
        C23097 c23097;
        Object obj;
        long j;
        int i;
        int i2;
        int i3;
        long j2;
        C17809 c17809;
        C11419 c11419;
        C10545 c10545;
        C14986 c14986;
        C16397 c16397;
        C14986 c149862;
        C16397 m38647;
        C10545 c105452;
        this.f20139 = c20632;
        c23097 = c17103.f52429;
        this.f20140 = c23097;
        obj = c17103.f52418;
        this.f20138 = obj;
        j = c17103.f52419;
        this.f20134 = j;
        i = c17103.f52425;
        this.f20133 = i;
        i2 = c17103.f52421;
        this.f20149 = i2;
        i3 = c17103.f52427;
        this.f20146 = i3;
        j2 = c17103.f52424;
        this.f20151 = j2;
        this.f20145 = c0314;
        this.f20148 = c7744;
        c17809 = c17103.f52420;
        this.f20150 = c17809;
        c11419 = c17103.f52417;
        this.f20135 = c11419;
        c10545 = c17103.f52423;
        this.f20142 = c10545;
        if (c7744.length() != i) {
            throw new IllegalArgumentException("Stable syntax text length changed during request");
        }
        c14986 = c17103.f52422;
        if (c14986 == null) {
            m38647 = c17103.f52426;
        } else {
            c16397 = c17103.f52426;
            c149862 = c17103.f52422;
            m38647 = c16397.m38647(c149862);
        }
        C23453 c23453 = new C23453(this);
        c105452 = c17103.f52423;
        c23097.getClass();
        C3158 c3158 = new C3158(c23097, c7744, c23453, i2, i3, m38647, c105452);
        this.f20143 = c3158;
        c3158.m9657(this.f20150);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18032() {
        this.f20136 = null;
        this.f20137 = null;
        this.f20141 = null;
        this.f20143.m9660();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18033(C20798 c20798, Executor executor, C15130 c15130) {
        this.f20136 = c20798;
        this.f20137 = executor;
        this.f20141 = c15130;
        this.f20143.m9658(c20798, executor, c15130);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4569 m18031(int i, long j, C23244 c23244) {
        try {
            EnumC4569 m9655 = this.f20143.m9655(i, j, c23244);
            if (this.f20143.m9666()) {
                m18028();
                return EnumC4569.YIELDED;
            }
            if (m9655 == EnumC4569.COMPLETED) {
                m18022();
                this.f20148 = null;
            }
            return m9655;
        } catch (Error | RuntimeException e) {
            if (this.f20143.m9661() == EnumC4569.ABORTED) {
                this.f20139.m47212(this);
            }
            throw e;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18028() {
        this.f20143.m9671();
        C16397 m9664 = this.f20143.m9664();
        C10545 m9656 = this.f20143.m9656();
        int i = this.f20133;
        C23097 c23097 = this.f20140;
        C11419 m28193 = C11419.m28188(c23097, i).m28193(m9656);
        this.f20135 = m28193;
        this.f20142 = m28193.m28191(c23097, this.f20149);
        this.f20143.getClass();
        this.f20143.m9660();
        C7744 c7744 = this.f20148;
        C23453 c23453 = new C23453(this);
        C10545 c10545 = this.f20142;
        c23097.getClass();
        C11003.requireNonNull(c7744, TextBundle.TEXT_ENTRY);
        C3158 c3158 = new C3158(c23097, c7744, c23453, this.f20149, this.f20146, m9664, c10545);
        this.f20143 = c3158;
        this.f20150 = null;
        C20798 c20798 = this.f20136;
        if (c20798 != null) {
            c3158.m9658(c20798, this.f20137, this.f20141);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18022() {
        try {
            if (m18025()) {
                this.f20139.m47212(this);
                return;
            }
            C9302 m9673 = this.f20143.m9673();
            if (m9673.m23880() != this.f20146 - this.f20149) {
                throw new IllegalStateException("Window style length differs from requested range");
            }
            C17975 m9663 = this.f20143.m9663();
            if (m9663.m42010() != this.f20146 - this.f20149 || m9663.m42015(0) != this.f20140.f74313) {
                throw new IllegalStateException("Window context differs from requested range");
            }
            C10545 m9667 = this.f20143.m9667();
            if (m9667.m26515() == this.f20140) {
                int m26496 = m9667.m26496();
                int i = this.f20133;
                if (m26496 == i) {
                    C11419 c11419 = this.f20135;
                    if (c11419 == null) {
                        c11419 = C11419.m28188(this.f20140, i);
                    }
                    if (this.f20142 != null && this.f20143.m9669() >= 0) {
                        c11419 = c11419.m28192(this.f20142);
                    }
                    C11419 m28193 = c11419.m28193(m9667);
                    if (m28193.m28194() != this.f20140 || m28193.m28195() != this.f20133) {
                        throw new IllegalStateException("Window checkpoint cache identity differs from request");
                    }
                    C16397 m9662 = this.f20143.m9662();
                    if (m9662.m38649() != this.f20140 || m9662.m38650() != this.f20133) {
                        throw new IllegalStateException("Window restart identity differs from request");
                    }
                    if (m18025()) {
                        this.f20139.m47212(this);
                        return;
                    }
                    C23097 c23097 = this.f20140;
                    long j = this.f20134;
                    int i2 = this.f20133;
                    int i3 = this.f20149;
                    int i4 = this.f20146;
                    this.f20143.getClass();
                    this.f20147 = new C14280(c23097, j, i2, i3, i4, m9673, m9663, m9662, m28193, this.f20150);
                    return;
                }
            }
            throw new IllegalStateException("Window checkpoint identity differs from request");
        } catch (Error | RuntimeException e) {
            this.f20139.m47212(this);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean m18025() {
        if (this.f20144) {
            return true;
        }
        if (C11604.m28506(this.f20145.f1697)) {
            this.f20144 = true;
        }
        return this.f20144;
    }
}
