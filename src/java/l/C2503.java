package l;

import java.util.ArrayList;

/* compiled from: N7MO */
/* renamed from: l.ۖۨ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2503 implements InterfaceC22258 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f7965 = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7966;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC6950 f7967 = new C10045();

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|(2:15|(8:17|(1:(2:20|(1:(2:23|(1:25)(1:52))(6:53|(1:55)(1:68)|56|(4:58|(1:60)|61|(1:63))(1:67)|(1:65)|66))(8:69|(3:71|(3:74|(2:77|78)(1:76)|72)|90)|91|(1:80)(1:89)|(1:82)(1:88)|83|(1:85)(1:87)|86))(1:92))(1:94)|26|27|28|29|30|(3:43|44|45)(2:(2:40|41)|39))(1:95))(1:96)|93|27|28|29|30|(0)(0)|11) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015b, code lost:
    
        r24.mo22066();
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0155, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
    
        r24.mo22066();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8853 m8004(android.net.Uri r19, l.C8353 r20, java.util.List r21, l.C9248 r22, java.util.Map r23, l.C16184 r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2503.m8004(android.net.Uri, l.۠ᩴ֫, java.util.List, l.ۢ֨֫, java.util.Map, l.ܺ᩷ۧ):l.ۡۨ֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8000(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (f7965[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2503 m8001(C10045 c10045) {
        this.f7967 = c10045;
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2503 m8002(boolean z) {
        this.f7966 = z;
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m8003(C8353 c8353) {
        if (!this.f7966 || !this.f7967.mo18777(c8353)) {
            return c8353;
        }
        C1297 m21948 = c8353.m21948();
        String str = c8353.f25619;
        m21948.m4465("application/x-media3-cues");
        m21948.m4464(this.f7967.mo18778(c8353));
        StringBuilder sb = new StringBuilder();
        sb.append(c8353.f25614);
        sb.append(str != null ? " ".concat(str) : "");
        m21948.m4445(sb.toString());
        m21948.m4443(C13132.FOREVER_NS);
        return m21948.m4440();
    }
}
