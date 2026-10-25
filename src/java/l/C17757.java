package l;

import java.util.Arrays;
import java.util.List;

/* compiled from: 99PI */
/* renamed from: l.ᩳۖۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17757 extends AbstractC0823 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public volatile C16736 f54313;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int[] f54314;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9291[] f54315;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0117[] f54316;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14934[] f54317;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0117[] f54318;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C20412 f54319;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5057 f54320;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0117[] f54321;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f54322;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17757[] f54323;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f54324;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17757 f54325;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f54326;

    public /* synthetic */ C17757(C20412 c20412, C5057 c5057) {
        this(c20412, c5057, null);
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final C20412 mo1132() {
        return this.f54319;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f54319;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f54319.getName();
    }

    @Override // l.AbstractC0823
    /* renamed from: ܿ */
    public final String mo1141() {
        return this.f54326;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f54320;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17757 m41596() {
        return this.f54325;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C16736 m41593() {
        if (this.f54313 == null) {
            C16736 m46765 = this.f54319.m46765();
            if (m46765.m39372()) {
                C11093 builder = m46765.toBuilder();
                builder.m27527();
                m46765 = builder.buildPartial();
                if (!m46765.isInitialized()) {
                    throw AbstractC20704.m47318((InterfaceC23338) m46765);
                }
            }
            C16736 c16736 = m46765;
            synchronized (this) {
                if (this.f54313 == null) {
                    this.f54313 = c16736;
                }
            }
        }
        return this.f54313;
    }

    public final List getFields() {
        return C20195.unmodifiableList(Arrays.asList(this.f54318));
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m41589() {
        return C20195.unmodifiableList(Arrays.asList(this.f54317));
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m41595() {
        return C20195.unmodifiableList(Arrays.asList(this.f54317).subList(0, this.f54324));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m41588() {
        return C20195.unmodifiableList(Arrays.asList(this.f54321));
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m41592() {
        return C20195.unmodifiableList(Arrays.asList(this.f54323));
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m41597() {
        return C20195.unmodifiableList(Arrays.asList(this.f54315));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41594(int i) {
        int binarySearch = Arrays.binarySearch(this.f54314, i);
        if (binarySearch < 0) {
            binarySearch = (~binarySearch) - 1;
        }
        return binarySearch >= 0 && i < this.f54322[binarySearch];
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m41598() {
        return !this.f54319.m46758().isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 m41591(String str) {
        C23401 c23401 = this.f54320.f15895;
        String str2 = this.f54326 + '.' + str;
        c23401.getClass();
        AbstractC0823 m51848 = c23401.m51848(str2, EnumC14228.ALL_SYMBOLS);
        if (m51848 instanceof C0117) {
            return (C0117) m51848;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 m41590(int i) {
        C3646 unused;
        C0117[] c0117Arr = this.f54316;
        int length = c0117Arr.length;
        unused = C0117.f1104;
        int i2 = C21991.f70406;
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            C0117 c0117 = c0117Arr[i5];
            int number = c0117.getNumber();
            if (i < number) {
                i3 = i5 - 1;
            } else {
                if (i <= number) {
                    return c0117;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    public C17757(String str) {
        super(0);
        String str2;
        String str3;
        C17757[] c17757Arr;
        C9291[] c9291Arr;
        C0117[] c0117Arr;
        C0117[] c0117Arr2;
        C0117[] c0117Arr3;
        C14934[] c14934Arr;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str.substring(lastIndexOf + 1);
            str2 = str.substring(0, lastIndexOf);
        } else {
            str2 = "";
            str3 = str;
        }
        C0655 newBuilder = C20412.newBuilder();
        newBuilder.setName(str3);
        C1361 newBuilder2 = C8417.newBuilder();
        newBuilder2.m4780(1);
        newBuilder2.m4779(536870912);
        C8417 buildPartial = newBuilder2.buildPartial();
        if (buildPartial.isInitialized()) {
            newBuilder.m2684(buildPartial);
            this.f54319 = newBuilder.build();
            this.f54326 = str;
            this.f54325 = null;
            c17757Arr = C21991.f70409;
            this.f54323 = c17757Arr;
            c9291Arr = C21991.f70411;
            this.f54315 = c9291Arr;
            c0117Arr = C21991.f70413;
            this.f54318 = c0117Arr;
            c0117Arr2 = C21991.f70413;
            this.f54316 = c0117Arr2;
            c0117Arr3 = C21991.f70413;
            this.f54321 = c0117Arr3;
            c14934Arr = C21991.f70410;
            this.f54317 = c14934Arr;
            this.f54324 = 0;
            C5057 c5057 = new C5057(str2, this);
            this.f54320 = c5057;
            this.f2993 = c5057;
            this.f54314 = new int[]{1};
            this.f54322 = new int[]{536870912};
            return;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17757(l.C20412 r10, l.C5057 r11, l.C17757 r12) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17757.<init>(l.᩶᩷ۖ, l.ۚۖۖ, l.ᩳۖۖ):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void m41586() {
        m3070(this.f54319.m46765().m39373());
        for (C17757 c17757 : this.f54323) {
            c17757.m41586();
        }
        for (C9291 c9291 : this.f54315) {
            C9291.m23849(c9291);
        }
        for (C14934 c14934 : this.f54317) {
            C14934.m35386(c14934);
        }
        for (C0117 c0117 : this.f54318) {
            C0117.m1118(c0117);
        }
        for (C0117 c01172 : this.f54321) {
            C0117.m1118(c01172);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m41587() {
        int i = 0;
        for (C17757 c17757 : this.f54323) {
            c17757.m41587();
        }
        for (C0117 c0117 : this.f54318) {
            C0117.m1119(c0117);
        }
        C0117[] c0117Arr = this.f54316;
        Arrays.sort(c0117Arr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c0117Arr.length) {
                C0117[] c0117Arr2 = this.f54321;
                int length = c0117Arr2.length;
                while (i < length) {
                    C0117.m1119(c0117Arr2[i]);
                    i++;
                }
                return;
            }
            C0117 c01172 = c0117Arr[i2];
            C0117 c01173 = c0117Arr[i3];
            if (c01172.getNumber() == c01173.getNumber()) {
                throw new C6468(c01173, "Field number " + c01173.getNumber() + " has already been used in \"" + c01173.m1144().f54326 + "\" by field \"" + c01172.getName() + "\".", i);
            }
            i2 = i3;
        }
    }
}
