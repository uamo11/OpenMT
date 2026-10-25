package l;

import com.alipay.sdk.m.y.q;

/* compiled from: 6AF6 */
/* renamed from: l.۬ۘ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12875 extends AbstractC17191 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C16477 f38650;

    public C12875(C12029 c12029, String str) {
        super(c12029.m29391(), str, c12029.m29392(), c12029.m29393(), c12029.m29390(), !c12029.m29389());
        if ((c12029.m29386().m5759() & 4) != 0) {
            String[] split = c12029.m29394().split("\\s+", 5);
            if (split.length == 5) {
                int i = 0;
                String str2 = split[0];
                String str3 = split[2];
                String str4 = split[3];
                if (str2.length() != 10) {
                    return;
                }
                try {
                    int m27177 = C10881.m27177(str2.substring(1));
                    char charAt = str2.charAt(0);
                    if (charAt == '-') {
                        i = 32768;
                    } else if (charAt == 'l') {
                        i = 40960;
                    } else if (charAt == 'p') {
                        i = 4096;
                    } else if (charAt != 's') {
                        switch (charAt) {
                            case 'b':
                                i = 24576;
                                break;
                            case q.f /* 99 */:
                                i = 8192;
                                break;
                            case 'd':
                                i = 16384;
                                break;
                        }
                    } else {
                        i = 49152;
                    }
                    if (i == 0) {
                        return;
                    }
                    this.f38650 = new C16477(i | m27177, str3, str4);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ֨ۧ */
    public final C16477 mo24428() {
        return this.f38650;
    }

    @Override // l.AbstractC17191
    /* renamed from: ֫ */
    public final void mo29864(C16477 c16477) {
        if (this.f38650 == null) {
            throw new UnsupportedOperationException();
        }
        this.f38650 = c16477;
    }
}
