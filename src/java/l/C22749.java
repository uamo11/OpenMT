package l;

import android.os.Bundle;
import java.io.Writer;

/* compiled from: 36NN */
/* renamed from: l.᩺ۘᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22749 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13576 f73465;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f73466;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6417 f73467;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f73468;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73469;

    public C22749(C13576 c13576, int i, CharSequence charSequence, C6417 c6417) {
        this.f73465 = c13576;
        this.f73468 = i;
        this.f73466 = charSequence;
        this.f73467 = c6417;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50827(Writer writer) {
        int i = 0;
        while (true) {
            C13576 c13576 = this.f73465;
            if (i >= c13576.m32656()) {
                return;
            }
            if (i == this.f73468) {
                m50824(writer, this.f73466);
            } else {
                C7744 m32646 = c13576.m32646(i, this.f73467);
                try {
                    m50824(writer, m32646);
                    m32646.close();
                } catch (Throwable th) {
                    try {
                        m32646.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i++;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50828() {
        Object obj;
        Bundle bundle;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        for (int i = 0; i < this.f73465.m32656(); i++) {
            if (i != this.f73468) {
                synchronized (this.f73465) {
                    zArr3 = this.f73465.f40496;
                    if (zArr3[i]) {
                        InterfaceC20758 m32654 = this.f73465.m32654(i);
                        C6417 c6417 = this.f73467;
                        C11915 m29053 = C11915.m29053(m32654, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
                        try {
                            m29053.f35630.mo1600(false);
                            Bundle m44358 = m29053.f35623.f31452.f19337.m44358();
                            m44358.putBoolean("changed", false);
                            C12704 m52357 = m29053.f35630.mo1601().m52357();
                            try {
                                C10483 c10483 = m29053.f35623;
                                C12599 m17224 = c10483.f31452.m17224(m52357, m44358, c10483.f31451, this.f73465.m32658(), true, 8388608);
                                m52357.close();
                                this.f73465.m32654(i);
                                m29053.m29074(m44358, m29053.f35623.f31451, m17224, this.f73467, new C11461());
                                m29053.m29069(m29053.f35630.mo1601().m52371()).m10930();
                            } catch (Throwable th) {
                                try {
                                    m52357.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } finally {
                            m29053.m29068().m10930();
                        }
                    }
                }
            }
        }
        obj = this.f73465.f40502;
        synchronized (obj) {
            synchronized (this.f73465) {
                for (int i2 = 0; i2 < this.f73465.m32656(); i2++) {
                    if (i2 != this.f73468) {
                        zArr2 = this.f73465.f40496;
                        zArr2[i2] = false;
                    }
                }
                bundle = this.f73465.f40503;
                zArr = this.f73465.f40496;
                bundle.putBoolean("changed", zArr[this.f73468]);
            }
            this.f73465.m32645();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50825() {
        return this.f73468;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7744 m50826(int i) {
        if (i == this.f73468) {
            throw new IllegalArgumentException("Active page already has a captured read");
        }
        return this.f73465.m32646(i, this.f73467);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50824(Writer writer, CharSequence charSequence) {
        char[] cArr = new char[32768];
        int i = 0;
        while (i < charSequence.length()) {
            int min = Math.min(32768, charSequence.length() - i);
            for (int i2 = 0; i2 < min; i2++) {
                cArr[i2] = charSequence.charAt(i + i2);
            }
            writer.write(cArr, 0, min);
            i += min;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i;
        int i2;
        FutureC3575 futureC3575;
        synchronized (this.f73465) {
            if (this.f73469) {
                return;
            }
            this.f73469 = true;
            C13576 c13576 = this.f73465;
            i = c13576.f40499;
            c13576.f40499 = i - 1;
            i2 = this.f73465.f40499;
            if (i2 == 0) {
                futureC3575 = this.f73465.f40504;
                futureC3575.m10912((Object) null);
            }
        }
    }
}
