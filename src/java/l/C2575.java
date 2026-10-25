package l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Q5YY */
/* renamed from: l.ۖܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2575 extends AbstractC3179 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public volatile Throwable f8134;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public volatile C14384 f8135;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f8136;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f8137;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C23557 f8138;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f8139;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f8140;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f8141;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C10421 f8142;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C16501 f8143;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public volatile RunnableC15979 f8144;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f8145;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f8146;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f8147;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public volatile C4590 f8148;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public String f8149;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f8150;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f8151;

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8160() {
        return true;
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte mo8172() {
        return (byte) 0;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m8161() {
        return this.f8145 == 0.0f && this.f8142.size() == this.f9998.size();
    }

    public C2575(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, int i, C3096 c3096, C9571 c9571, C7744 c7744) {
        super(c12392, c22686);
        float f;
        this.f8142 = new C10421();
        this.f8140 = new AtomicInteger();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        m9767(interfaceC7785);
        try {
            C10421 c10421 = ((C2575) c3096.f9680).f8142;
            C4507 m9446 = c3096.m9446(this, c9571);
            this.f8142.m26266(this.f9998.size());
            int i2 = 0;
            while (i2 < this.f9998.size()) {
                if (i2 < m9446.m13254()) {
                    f = c10421.getFloat(i2);
                } else {
                    f = i2 >= m9446.m13253() ? c10421.getFloat(((c3096.f9691 + 1) + i2) - m9446.m13253()) : -1.0f;
                }
                this.f8142.add(f);
                if (f > this.f8142.getFloat(this.f8147)) {
                    this.f8147 = i2;
                }
                i2++;
            }
            this.f10000 = m9761(0);
            this.f8141 = true;
            m8143();
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo8164() {
        return this.f8140.get();
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Throwable mo8171() {
        return this.f8134;
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8167(C4590 c4590) {
        return c4590.m13499() > 0 && mo8153(c4590) == c4590.m13499();
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8153(C4590 c4590) {
        if (this.f10019 || this.f8134 != null || this.f8148 == null || c4590.m13499() <= 0) {
            return 0;
        }
        if (this.f10014 < 0) {
            if (c4590.equals(this.f8148)) {
                return c4590.m13499();
            }
            return 0;
        }
        if (this.f8135 == null || c4590.m13500() != this.f8148.m13500() || c4590.m13501() < 0) {
            return 0;
        }
        if (c4590.m13502() < this.f10037.m24484() * r0.m34356()) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(c4590.m13499(), (Math.ceil(this.f10037.m24484() * r0.m34354()) - 1.0d) - c4590.m13502()));
    }

    public C2575(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686) {
        this(c12392, interfaceC7785, c22686, -1, null);
    }

    public C2575(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, int i, C7744 c7744) {
        super(c12392, c22686);
        this.f8142 = new C10421();
        this.f8140 = new AtomicInteger();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        mo8166(interfaceC7785);
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8152(int i, int i2) {
        if (this.f8135 == null) {
            return super.mo8152(i, i2);
        }
        int ceil = (int) Math.ceil(this.f10037.m24484() * r0.m34356());
        return Math.max(ceil, Math.min(i, Math.max(ceil, (((int) (this.f10037.m24484() * r0.m34354())) - i2) - 1)));
    }

    public C2575(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, C12951 c12951) {
        super(c12392, interfaceC7785, c22686, c12951);
        this.f8142 = new C10421();
        this.f8140 = new AtomicInteger();
        this.f8147 = c12951.readInt();
        int size = this.f9998.size();
        this.f8142.m26266(size);
        for (int i = 0; i < size; i++) {
            this.f8142.add(-1.0f);
        }
        m9767(interfaceC7785);
        try {
            C7744 m9797 = m9797();
            try {
                C13862 m47359 = this.f9998.m47359();
                for (int i2 = 0; i2 < this.f9998.size(); i2++) {
                    C11747 m33216 = m47359.m33216(i2);
                    m33216.m28752(m9797);
                    this.f9998.m47362(i2, m33216);
                }
                m9797.close();
                m9773();
                m8143();
            } finally {
            }
        } catch (Throwable th) {
            m9773();
            throw th;
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8158(String str) {
        super.mo8158(str);
        m8145();
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m8145() {
        int size = this.f10020.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            float m28749 = this.f10020.get(i).m28749(this.f10006, this.f10037);
            if (m28749 > f) {
                f = m28749;
            }
        }
        this.f8146 = f;
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8166(InterfaceC7785 interfaceC7785) {
        try {
            m8148(interfaceC7785);
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m8148(InterfaceC7785 interfaceC7785) {
        m9788();
        this.f8141 = false;
        this.f8145 = 0.0f;
        mo8165();
        this.f10026 = false;
        m9767(interfaceC7785);
        C20736 c20736 = this.f9998.isEmpty() ? this.f9998 : new C20736();
        C21625 c21625 = this.f10033.isEmpty() ? this.f10033 : new C21625();
        this.f8142 = new C10421();
        this.f8143 = null;
        this.f8136 = 0.0f;
        c21625.clear();
        C7744 m9797 = m9797();
        try {
            int m24485 = this.f10037.m24485();
            C23266 m9764 = m9764(m9797, 0, m9797.length());
            try {
                C11747 c11747 = new C11747();
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    if (this.f10026) {
                        c20736.clear();
                        this.f8142.clear();
                        c21625.clear();
                        m9764.close();
                        m9797.close();
                        return;
                    }
                    c21625.add(C19509.m44924(this, m9797, i, m24485));
                    int m51584 = m9764.m51584();
                    if (m51584 == -1) {
                        m51584 = m9797.length();
                        z = false;
                    }
                    c11747.m28751(i, m51584, i2);
                    c20736.m47353(c11747);
                    this.f8142.add(-1.0f);
                    i = m51584 + 1;
                    i2++;
                }
                m9764.close();
                c21625.m48865();
                C13862 m47359 = c20736.m47359();
                for (int i3 = 0; i3 < c20736.size(); i3++) {
                    C11747 m33216 = m47359.m33216(i3);
                    m33216.m28752(m9797);
                    c20736.m47362(i3, m33216);
                }
                m9797.close();
                this.f9998 = c20736;
                this.f10033 = c21625;
                this.f10000 = m9761(0);
                m8143();
            } finally {
            }
        } catch (Throwable th) {
            try {
                m9797.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m8143() {
        C9584 m24488;
        RunnableC1644 runnableC1644;
        float f;
        int incrementAndGet = this.f8140.incrementAndGet();
        mo8165();
        this.f8148 = null;
        this.f8143 = null;
        this.f8135 = null;
        this.f8134 = null;
        if (!this.f8141) {
            m9788();
        }
        InterfaceC7785 interfaceC7785 = this.f10015;
        m9767(interfaceC7785);
        boolean z = true;
        interfaceC7785.setReadOnly(true);
        this.f10016 = true;
        this.f10019 = false;
        this.f8151 = 10000;
        try {
            if (this.f8147 >= this.f9998.size()) {
                this.f8147 = 0;
            }
            C7744 m9797 = m9797();
            try {
                if (this.f9998.m47358(this.f8147) - this.f9998.m47355(this.f8147) < 10000 && (!this.f8141 || this.f8142.getFloat(this.f8147) < 0.0f)) {
                    int i = this.f8147;
                    try {
                        this.f8142.mo4099(this.f9998.get(i).m28749(m9797, this.f10037), i);
                        C16501 c16501 = this.f8143;
                        if (c16501 != null) {
                            c16501.m38870(i);
                        }
                    } catch (Exception unused) {
                    }
                    this.f8151 -= this.f9998.m47358(this.f8147) - this.f9998.m47355(this.f8147);
                }
                if (this.f9998.size() < 50 && m9782() < 10000) {
                    float f2 = this.f8142.getFloat(this.f8147);
                    for (int i2 = 0; i2 < this.f9998.size(); i2++) {
                        if (this.f8141 && this.f8142.getFloat(i2) >= 0.0f) {
                            f = this.f8142.getFloat(i2);
                        } else {
                            try {
                                f = this.f9998.get(i2).m28749(m9797, this.f10037);
                                this.f8142.mo4099(f, i2);
                                C16501 c165012 = this.f8143;
                                if (c165012 != null) {
                                    c165012.m38870(i2);
                                }
                            } catch (Exception unused2) {
                                f = 0.0f;
                            }
                        }
                        if (f > f2) {
                            this.f8147 = i2;
                            f2 = f;
                        }
                    }
                    this.f8143 = C16501.m38865(this.f8142);
                    this.f8136 = Math.max(this.f8136, Math.max(0.0f, this.f8142.getFloat(this.f8147)));
                    m9797.close();
                    try {
                        m9773();
                        interfaceC7785.setReadOnly(false);
                        return;
                    } finally {
                    }
                }
                m9797.close();
                C20736 c20736 = this.f9998;
                C10421 c10421 = this.f8142;
                int m9781 = m9781();
                synchronized (this.f10037) {
                    m24488 = this.f10037.m24488();
                }
                C14384 m8133 = m8133(interfaceC7785, m24488);
                if (c20736.size() > 100000) {
                    C12392 c12392 = this.f10021;
                    c12392.getClass();
                    C4925.m14315(new RunnableC7412(0, c12392));
                    runnableC1644 = new RunnableC1644(0, c12392);
                } else {
                    runnableC1644 = null;
                }
                C23557 c23557 = new C23557(new C18097(0, this), c20736, c10421, m24488, this.f8147, m8133, this.f8141, new C17391(this, incrementAndGet, interfaceC7785, c20736, c10421, m9781), new RunnableC14568(this, incrementAndGet, interfaceC7785, c20736, c10421, m9781, runnableC1644));
                c23557.m52018(m8142(m8133));
                this.f8138 = c23557;
                try {
                    c23557.m52017(interfaceC7785.mo1605() ? new ExecutorC23282() : C1802.f6207, Math.min(2, C17615.f53826));
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        th = th2;
        z = false;
        if (!z) {
            try {
                m9773();
                interfaceC7785.setReadOnly(false);
            } finally {
            }
        }
        throw th;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m8141(C2575 c2575, int i, InterfaceC7785 interfaceC7785, C20736 c20736, C10421 c10421, int i2) {
        return (!c2575.f10019 && i == c2575.f8140.get() && c2575.f10015 == interfaceC7785 && c2575.f9998 == c20736 && c2575.f8142 == c10421 && c2575.m9781() == i2) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14384 m8133(InterfaceC7785 interfaceC7785, C9584 c9584) {
        C4590 mo8174 = this.f10014 >= 0 ? mo8174() : this.f10021.m30422(interfaceC7785);
        boolean z = mo8174 != null;
        if (mo8174 == null) {
            mo8174 = new C4590(Math.max(0, this.f10021.getScrollX()), Math.max(0, this.f10021.m30408()), this.f10021.m30394(), this.f10021.m30542());
        }
        if (mo8174.m13500() <= 0 || mo8174.m13499() <= 0 || mo8174.m13502() > Math.max(0, ((int) m9789()) - mo8174.m13499())) {
            return null;
        }
        int max = Math.max(0, m9759(mo8174.m13502()) - 1);
        int min = Math.min(this.f9998.size(), m9759((int) Math.min(2147483647L, mo8174.m13502() + mo8174.m13499())) + 2);
        if (this.f10014 >= 0) {
            max = Math.max(0, max - 16);
            min = Math.min(this.f9998.size(), min + 16);
        }
        int m9790 = m9790(this.f10021.m30444());
        int m97902 = m9790(this.f10021.m30448());
        C14384 c14384 = new C14384(max, min, m9790, m97902);
        C7744 m9797 = m9797();
        try {
            C20873 c20873 = new C20873(m9797);
            m8140(c20873, c9584, this.f8147);
            for (int i = max; i < min; i++) {
                if (!this.f10026 && !this.f10019) {
                    m8140(c20873, c9584, i);
                }
                m9797.close();
                return null;
            }
            if (m9790 < max || m9790 >= min) {
                m8140(c20873, c9584, m9790);
            }
            if (m97902 != m9790 && (m97902 < max || m97902 >= min)) {
                m8140(c20873, c9584, m97902);
            }
            m9797.close();
            if (z) {
                m8175(mo8174.m13501(), mo8174.m13500());
            }
            if (this.f10014 >= 0) {
                mo8174 = new C4590(Math.min(mo8174.m13501(), Math.max(0, ((int) mo8163()) - mo8174.m13500())), mo8174.m13502(), mo8174.m13500(), mo8174.m13499());
            }
            boolean z2 = this.f8142.getFloat(m9790) >= 0.0f && this.f8142.getFloat(m97902) >= 0.0f;
            while (max < min && z2) {
                z2 = this.f8142.getFloat(max) >= 0.0f;
                max++;
            }
            if (z2 && !this.f10026 && !this.f10019 && mo8174.m13501() <= Math.max(0, ((int) mo8163()) - mo8174.m13500())) {
                this.f8135 = c14384;
                this.f8148 = mo8174;
            }
            return c14384;
        } catch (Throwable th) {
            try {
                m9797.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4590 mo8174() {
        return this.f8148 != null ? this.f8148 : super.mo8174();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8140(C20873 c20873, C9584 c9584, int i) {
        if (!this.f8141 || this.f8142.getFloat(i) < 0.0f) {
            C11747 c11747 = this.f9998.get(i);
            int i2 = c11747.f35063 - c11747.f35062;
            int i3 = this.f8151;
            if (i2 >= i3) {
                return;
            }
            this.f8151 = i3 - i2;
            float m28749 = c11747.m28749(c20873, c9584);
            this.f8142.mo4099(m28749, i);
            if (m28749 > this.f8142.getFloat(this.f8147)) {
                this.f8147 = i;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8138(C2575 c2575, int i, InterfaceC7785 interfaceC7785, C20736 c20736, C10421 c10421, int i2, Runnable runnable) {
        try {
            if (i == c2575.f8140.get() && !c2575.f10019 && c2575.f10015 == interfaceC7785 && c2575.f9998 == c20736 && c2575.f8142 == c10421 && c2575.m9781() == i2) {
                c2575.f8147 = c2575.f8138.m52019();
                Throwable m52016 = c2575.f8138.m52016();
                c2575.f8134 = m52016;
                if (m52016 == null) {
                    c2575.f8143 = C16501.m38865(c10421);
                }
                c2575.f8136 = Math.max(c2575.f8136, Math.max(0.0f, c10421.getFloat(c2575.f8147)));
            }
            try {
                c2575.m9773();
                interfaceC7785.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                    }
                }
                c2575.f10021.postInvalidate();
            } catch (Throwable th) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                    }
                }
                c2575.f10021.postInvalidate();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c2575.m9773();
                interfaceC7785.setReadOnly(false);
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                    }
                }
                c2575.f10021.postInvalidate();
                throw th2;
            } catch (Throwable th3) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } finally {
                    }
                }
                c2575.f10021.postInvalidate();
                throw th3;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m8142(C14384 c14384) {
        PriorityQueue priorityQueue = new PriorityQueue(32, C8200.comparingInt(new C23741()));
        C13862 m47359 = this.f9998.m47359();
        for (int i = 0; i < this.f9998.size(); i++) {
            C11747 m33216 = m47359.m33216(i);
            int m28750 = m33216.m28750() - m33216.f35062;
            if (priorityQueue.size() < 32) {
                priorityQueue.add(new C6808(i, m28750));
            } else if (m28750 > ((C6808) priorityQueue.peek()).length()) {
                priorityQueue.remove();
                priorityQueue.add(new C6808(i, m28750));
            }
        }
        C14448 c14448 = new C14448();
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            c14448.add(((C6808) it.next()).m18498());
        }
        c14448.add(this.f8147);
        if (c14384 != null) {
            for (int m34356 = c14384.m34356(); m34356 < c14384.m34354(); m34356++) {
                c14448.add(m34356);
            }
            c14448.add(c14384.m34358());
            c14448.add(c14384.m34357());
        }
        return c14448.mo3586();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m8175(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f8136 = Math.max(this.f8136, ((i + i2) - mo8169()) - mo8162());
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8157(RectF rectF, int i) {
        super.mo8157(rectF, i);
        int m9790 = m9790(Math.max(0, Math.min(i, m9782())));
        if (this.f8145 != 0.0f || this.f8142.getFloat(m9790) >= 0.0f) {
            return;
        }
        this.f8136 = Math.max(this.f8136, rectF.right - mo8169());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8170(int i, int i2) {
        if (this.f10016 || this.f10019 || this.f8145 > 0.0f || i2 <= 0 || this.f9998.isEmpty() || this.f10021.f37258 != this || !m9757() || this.f8144 != null) {
            return;
        }
        int m9759 = m9759(Math.max(0, i));
        int m97592 = m9759(Math.max(0, i) + i2);
        int i3 = m97592 + 1;
        C15859 c15859 = new C15859();
        ArrayList arrayList = new ArrayList();
        m8135(m9759, i3, c15859, arrayList);
        m8135(i3, Math.min(this.f9998.size(), m97592 + 17), c15859, arrayList);
        m8135(Math.max(0, m9759 - 16), m9759, c15859, arrayList);
        if (c15859.isEmpty()) {
            return;
        }
        RunnableC15979 runnableC15979 = new RunnableC15979(this, c15859.mo3586(), (C11747[]) arrayList.toArray(new C11747[0]));
        this.f8144 = runnableC15979;
        try {
            C1802.f6207.execute(runnableC15979);
        } catch (RuntimeException unused) {
            this.f8144 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8135(int i, int i2, C15859 c15859, ArrayList arrayList) {
        C13862 m47359 = this.f9998.m47359();
        while (i < i2 && c15859.size() < 32) {
            if (this.f8142.getFloat(i) < 0.0f) {
                c15859.add(i);
                arrayList.add(m47359.m33216(i).clone());
            }
            i++;
        }
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m8168() {
        RunnableC15979 runnableC15979 = this.f8144;
        if (runnableC15979 != null) {
            runnableC15979.f49320 = true;
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8165() {
        m8168();
        if (this.f10016) {
            this.f10019 = true;
            while (this.f10016) {
                SystemClock.sleep(100L);
            }
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo8169() {
        C22686 c22686 = this.f10037;
        if (c22686.f73291) {
            return super.mo8169();
        }
        return Math.max(super.mo8169(), c22686.f73277);
    }

    @Override // l.AbstractC3179
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int mo8162() {
        C22686 c22686 = this.f10037;
        if (c22686.f73291) {
            return Math.max(super.mo8162(), c22686.f73277);
        }
        return super.mo8162();
    }

    @Override // l.AbstractC3179
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float mo8163() {
        float mo8162;
        int i;
        if (m9775()) {
            C22686 c22686 = this.f10037;
            if (c22686.f73291) {
                mo8162 = mo8169() + this.f8146;
                i = c22686.f73251;
            } else {
                mo8162 = mo8162() + this.f8146;
                i = c22686.f73251;
            }
            return mo8162 + i;
        }
        return mo8169() + m8151() + mo8162();
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private float m8151() {
        if (this.f8145 > 0.0f) {
            return (this.f10037.f29058.getTextSize() / this.f8145) * this.f8150;
        }
        return Math.max(this.f8136, this.f8147 < this.f8142.size() ? Math.max(0.0f, this.f8142.getFloat(this.f8147)) : 0.0f);
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8156(Canvas canvas, int i, float f, int i2, C1539 c1539) {
        float f2;
        if (this.f8149 == null) {
            this.f8149 = C4925.m14327(R.string.MT_Protector_res_0x7f1202e7);
        }
        C22686 c22686 = this.f10037;
        if (i < 0 || i >= this.f8142.size()) {
            f2 = -1.0f;
        } else {
            f2 = this.f8142.getFloat(i);
            if (f2 >= 0.0f && this.f8145 > 0.0f) {
                f2 *= c22686.f29058.getTextSize() / this.f8145;
            }
        }
        if (f2 < 0.0f) {
            return;
        }
        float f3 = i2;
        float measureText = 0.0f + (f2 - c1539.measureText(this.f8149));
        if (f3 > measureText) {
            float m24501 = f - c22686.m24501();
            float ceil = (float) Math.ceil(c22686.m24484() + m24501);
            c1539.setColor(-65536);
            canvas.drawRect(measureText, m24501, f3, ceil, c1539);
            c1539.setColor(-1);
            canvas.drawText(this.f8149, c22686.m24486() + measureText, f, c1539);
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8155(int i, int i2, int i3) {
        m9785();
        m8168();
        boolean z = this.f8145 > 0.0f;
        this.f8145 = 0.0f;
        if (this.f10016) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m9767(this.f10015);
        if (z) {
            this.f8143 = null;
            Arrays.fill(this.f8142.m26267(), -1.0f);
        }
        try {
            C7744 m9797 = m9797();
            try {
                m8134(i, i2, i3, m9797);
                m9797.close();
                if (!z || this.f10021.f37211) {
                    return;
                }
                mo8173();
            } finally {
            }
        } finally {
            m9773();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:22:0x009e, B:27:0x00b0, B:29:0x00c0, B:39:0x00c9, B:41:0x00d6, B:32:0x00da, B:34:0x00e5, B:35:0x00e8), top: B:21:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8134(int r20, int r21, int r22, l.C7744 r23) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2575.m8134(int, int, int, l.۟᩸ᩳ):void");
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8154(float f) {
        if (this.f8145 == 0.0f) {
            this.f8140.incrementAndGet();
            mo8165();
            if (this.f8147 < this.f9998.size()) {
                this.f8150 = m8151();
                this.f8145 = f;
            }
        }
        this.f10000 = m9761(0);
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo8173() {
        boolean m9757 = m9757();
        C12392 c12392 = this.f10021;
        if (!m9757) {
            if (c12392.f37258 == this && c12392.m30519()) {
                return;
            }
            mo8166(this.f10015);
            return;
        }
        this.f8145 = 0.0f;
        this.f8140.incrementAndGet();
        mo8165();
        this.f10000 = m9761(0);
        this.f8141 = false;
        this.f8136 = 0.0f;
        Arrays.fill(this.f8142.m26267(), -1.0f);
        m8143();
        m8145();
        c12392.mo25906();
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8159(C10130 c10130) {
        super.mo8159(c10130);
        c10130.writeInt(this.f8147);
    }
}
