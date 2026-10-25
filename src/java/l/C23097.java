package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: 86ZM */
/* renamed from: l.᩺ܺܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23097 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74309;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74310;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f74311;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f74312;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15068 f74313;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f74314;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f74315;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f74316;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f74317;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74318;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21834 f74319;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15068[] f74320;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC20276[] f74321;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f74322;

    public C23097(AbstractC20276[] abstractC20276Arr, C15068 c15068, C21834 c21834, int i, int i2, int i3) {
        boolean z;
        C21834 unused;
        AbstractC20276[] abstractC20276Arr2 = abstractC20276Arr;
        this.f74321 = abstractC20276Arr2;
        this.f74313 = c15068;
        this.f74319 = c21834;
        int i4 = C7017.f21654;
        unused = c15068.m35669().f22434;
        this.f74310 = i;
        this.f74317 = i2;
        this.f74314 = i3;
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayList.add(c15068);
        identityHashMap.put(c15068, 0);
        int length = abstractC20276Arr2.length;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        while (i5 < length) {
            AbstractC20276 abstractC20276 = abstractC20276Arr2[i5];
            if (abstractC20276 instanceof C12514) {
                C12514 c12514 = (C12514) abstractC20276;
                z3 = c12514.f37608.m28265() ? false : z3;
                if (c12514.f37610) {
                    z4 = false;
                }
            } else if (abstractC20276 instanceof C10398) {
                C10398 c10398 = (C10398) abstractC20276;
                C8281 c8281 = c10398.f31285;
                if (c8281 != null) {
                    for (C15068 c150682 : c8281.f25457) {
                        if (c150682 != null && !identityHashMap.containsKey(c150682)) {
                            identityHashMap.put(c150682, Integer.valueOf(arrayList.size()));
                            arrayList.add(c150682);
                        }
                    }
                    z2 = true;
                }
                if (c10398.f31287.isEmpty() && ((c8281 != null || c10398.f31284.f16989.length != 0) && ((z = c10398.f31288) || !c10398.f31280 || c8281 != null))) {
                    z5 = true;
                    if (z) {
                        z6 = true;
                    }
                }
            }
            i5++;
            abstractC20276Arr2 = abstractC20276Arr;
        }
        this.f74320 = (C15068[]) arrayList.toArray(new C15068[0]);
        this.f74318 = identityHashMap;
        this.f74322 = z2;
        this.f74311 = z3;
        this.f74312 = z3 && z4;
        this.f74316 = z4;
        boolean z7 = z3 && z4 && z5;
        this.f74315 = z7;
        this.f74309 = z7 && z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0140, code lost:
    
        throw m51262(r5, "Invalid group type");
     */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0748  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C23097 m51264(l.C15068 r34) {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23097.m51264(l.ܶۜܿ):l.᩺ܺܿ");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m51274() {
        return this.f74317;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51272() {
        return !this.f74322 || C7017.m18972(this.f74314);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51270() {
        return this.f74322;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51265() {
        return this.f74320.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 m51268(int i) {
        C15068[] c15068Arr = this.f74320;
        return c15068Arr[C11003.checkIndex(i, c15068Arr.length)];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51266(C15068 c15068) {
        Integer num = (Integer) this.f74318.get(c15068);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3158 m51267(CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        return new C3158(this, charSequence, interfaceC17066);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51275() {
        return this.f74311;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m51269() {
        return this.f74312;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51276() {
        return this.f74316;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51271() {
        return this.f74315;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m51273() {
        return this.f74309;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5459 m51263(int[] iArr, C7225[] c7225Arr) {
        int length = iArr.length;
        C7225[] c7225Arr2 = new C7225[length];
        C7225 c7225 = C7225.f22117;
        for (int i = 0; i < length; i++) {
            C7225 c72252 = c7225Arr[iArr[i]];
            c7225Arr2[i] = c72252;
            c7225 = c7225.m19320(c72252);
        }
        return new C5459(iArr, c7225Arr2, c7225);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m51262(AbstractC9693 abstractC9693, String str) {
        String str2;
        StringBuilder m19190 = C7166.m19190(str, ": ");
        m19190.append(abstractC9693.getClass().getSimpleName());
        if (abstractC9693.f29308 == null) {
            str2 = "";
        } else {
            str2 = " at " + abstractC9693.f29308;
        }
        m19190.append(str2);
        return new IllegalArgumentException(m19190.toString());
    }
}
