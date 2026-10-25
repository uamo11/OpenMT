package l;

import java.util.HashMap;
import java.util.Map;

/* compiled from: C9VN */
/* renamed from: l.ۗۚ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3037 extends C19369 implements InterfaceC8682, InterfaceC17148, InterfaceC0795 {
    public static final long serialVersionUID = 484863569441792249L;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f9570;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f9571;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Map f9572;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9573;

    public C3037() {
    }

    public C3037(String str, Exception exc) {
        super(str, exc);
        this.f9573 = -1073741823;
    }

    static {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 71; i++) {
            hashMap.put(Integer.valueOf(InterfaceC8682.f26462[i]), InterfaceC8682.f26463[i]);
        }
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < 41; i2++) {
            int[][] iArr = InterfaceC17148.f52552;
            hashMap2.put(Integer.valueOf(iArr[i2][0]), Integer.valueOf(iArr[i2][1]));
            String str = (String) hashMap.get(Integer.valueOf(iArr[i2][1]));
            if (str != null) {
                hashMap.put(Integer.valueOf(iArr[i2][0]), str);
            }
        }
        hashMap.put(0, "NT_STATUS_SUCCESS");
        f9571 = C20195.unmodifiableMap(hashMap);
        f9572 = C20195.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        for (int i3 = 0; i3 < 10; i3++) {
            hashMap3.put(Integer.valueOf(InterfaceC0795.f2910[i3]), InterfaceC0795.f2911[i3]);
        }
        f9570 = C20195.unmodifiableMap(hashMap3);
    }

    public C3037(String str) {
        super(str);
        this.f9573 = -1073741823;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9288(int i) {
        String str = (String) f9571.get(Integer.valueOf(i));
        return str == null ? "0x".concat(C12085.m29467(i, 8)) : str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m9290(int i) {
        if (((-1073741824) & i) != 0) {
            return i;
        }
        Integer valueOf = Integer.valueOf(i);
        Map map = f9572;
        if (map.containsKey(valueOf)) {
            return ((Integer) map.get(Integer.valueOf(i))).intValue();
        }
        return -1073741823;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3037(int r3, boolean r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L1d
            java.util.Map r0 = l.C3037.f9570
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L21
            r0 = 8
            java.lang.String r0 = l.C12085.m29467(r3, r0)
            java.lang.String r1 = "W"
            java.lang.String r0 = r1.concat(r0)
            goto L21
        L1d:
            java.lang.String r0 = m9288(r3)
        L21:
            r2.<init>(r0)
            if (r4 == 0) goto L27
            goto L2b
        L27:
            int r3 = m9290(r3)
        L2b:
            r2.f9573 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3037.<init>(int, boolean):void");
    }

    public C3037(int i) {
        super(m9288(i), null);
        this.f9573 = m9290(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9291() {
        return this.f9573;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3037 m9289(C19369 c19369) {
        if (c19369 instanceof C3037) {
            return (C3037) c19369;
        }
        return new C3037(c19369.getMessage(), c19369);
    }
}
