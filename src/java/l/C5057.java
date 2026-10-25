package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: 99PI */
/* renamed from: l.ۚۖۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5057 extends AbstractC0823 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C0117[] f15890;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9291[] f15891;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5057[] f15892;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10182 f15893;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21286[] f15894;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23401 f15895;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17757[] f15896;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5057[] f15897;

    @Override // l.AbstractC0823
    /* renamed from: ۧ */
    public final C5057 mo1134() {
        return this;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final C10182 mo1132() {
        return this.f15893;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f15893;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f15893.getName();
    }

    @Override // l.AbstractC0823
    /* renamed from: ܿ */
    public final String mo1141() {
        return this.f15893.getName();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m14580() {
        return this.f15893.m25567();
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List m14578() {
        return C20195.unmodifiableList(Arrays.asList(this.f15896));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m14577() {
        return C20195.unmodifiableList(Arrays.asList(this.f15891));
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m14579() {
        return C20195.unmodifiableList(Arrays.asList(this.f15890));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m14582() {
        return C20195.unmodifiableList(Arrays.asList(this.f15897));
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m14581() {
        return C20195.unmodifiableList(Arrays.asList(this.f15892));
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m14583() {
        C10182 c10182 = this.f15893;
        String m25568 = c10182.m25568();
        if (m25568.equals("proto3")) {
            return EnumC3478.EDITION_PROTO3;
        }
        if (m25568.equals("editions")) {
            return c10182.m25582();
        }
        return EnumC3478.EDITION_PROTO2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5057 m14573(C10182 c10182, C5057[] c5057Arr) {
        C5057 c5057 = new C5057(c10182, c5057Arr, new C23401(c5057Arr));
        for (C17757 c17757 : c5057.f15896) {
            c17757.m41587();
        }
        for (C21286 c21286 : c5057.f15894) {
            C21286.m48310(c21286);
        }
        for (C0117 c0117 : c5057.f15890) {
            C0117.m1119(c0117);
        }
        return c5057;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5057 m14574(String[] strArr, C5057[] c5057Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(C13997.f41723);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(C13997.f41723);
        }
        try {
            C10182 parseFrom = C10182.parseFrom(bytes);
            try {
                return m14573(parseFrom, c5057Arr);
            } catch (C6468 e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + parseFrom.getName() + "\".", e);
            }
        } catch (C2025 e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    public C5057(C10182 c10182, C5057[] c5057Arr, C23401 c23401) {
        super(0);
        C17757[] c17757Arr;
        C9291[] c9291Arr;
        C21286[] c21286Arr;
        C0117[] c0117Arr;
        this.f15895 = c23401;
        this.f15893 = c10182;
        this.f15897 = (C5057[]) c5057Arr.clone();
        HashMap hashMap = new HashMap();
        for (C5057 c5057 : c5057Arr) {
            hashMap.put(c5057.f15893.getName(), c5057);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c10182.m25580(); i++) {
            int m25578 = c10182.m25578(i);
            if (m25578 < 0 || m25578 >= c10182.m25569()) {
                throw new C6468(this, "Invalid public dependency index.");
            }
            C5057 c50572 = (C5057) hashMap.get(c10182.m25565(m25578));
            if (c50572 != null) {
                arrayList.add(c50572);
            }
        }
        C5057[] c5057Arr2 = new C5057[arrayList.size()];
        this.f15892 = c5057Arr2;
        arrayList.toArray(c5057Arr2);
        c23401.m51850(this, this.f15893.m25567());
        if (c10182.m25576() <= 0) {
            c17757Arr = C21991.f70409;
        } else {
            c17757Arr = new C17757[c10182.m25576()];
        }
        this.f15896 = c17757Arr;
        for (int i2 = 0; i2 < c10182.m25576(); i2++) {
            this.f15896[i2] = new C17757(c10182.m25579(i2), this);
        }
        if (c10182.m25572() <= 0) {
            c9291Arr = C21991.f70411;
        } else {
            c9291Arr = new C9291[c10182.m25572()];
        }
        this.f15891 = c9291Arr;
        for (int i3 = 0; i3 < c10182.m25572(); i3++) {
            this.f15891[i3] = new C9291(c10182.m25573(i3), this, null);
        }
        if (c10182.m25581() <= 0) {
            c21286Arr = C21991.f70415;
        } else {
            c21286Arr = new C21286[c10182.m25581()];
        }
        this.f15894 = c21286Arr;
        for (int i4 = 0; i4 < c10182.m25581(); i4++) {
            this.f15894[i4] = new C21286(c10182.m25574(i4), this);
        }
        if (c10182.m25571() <= 0) {
            c0117Arr = C21991.f70413;
        } else {
            c0117Arr = new C0117[c10182.m25571()];
        }
        this.f15890 = c0117Arr;
        for (int i5 = 0; i5 < c10182.m25571(); i5++) {
            this.f15890[i5] = new C0117(c10182.m25577(i5), this, null, i5, true);
        }
    }

    public C5057(String str, C17757 c17757) {
        super(0);
        C9291[] c9291Arr;
        C21286[] c21286Arr;
        C0117[] c0117Arr;
        this.f2993 = null;
        C23401 c23401 = new C23401(new C5057[0]);
        this.f15895 = c23401;
        C12298 newBuilder = C10182.newBuilder();
        newBuilder.m29837(c17757.mo1141() + ".placeholder.proto");
        newBuilder.m29841(str);
        newBuilder.m29840(c17757.mo1132());
        C10182 buildPartial = newBuilder.buildPartial();
        if (buildPartial.isInitialized()) {
            this.f15893 = buildPartial;
            this.f15897 = new C5057[0];
            this.f15892 = new C5057[0];
            this.f15896 = new C17757[]{c17757};
            c9291Arr = C21991.f70411;
            this.f15891 = c9291Arr;
            c21286Arr = C21991.f70415;
            this.f15894 = c21286Arr;
            c0117Arr = C21991.f70413;
            this.f15890 = c0117Arr;
            c23401.m51850(this, str);
            c23401.m51849(c17757);
            return;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m14584() {
        try {
            m14576();
        } catch (C6468 e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f15893.getName() + "\".", e);
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m14576() {
        if (this.f2992 != null) {
            return;
        }
        synchronized (this) {
            if (this.f2992 != null) {
                return;
            }
            m3070(this.f15893.m25566().m19777());
            for (C17757 c17757 : this.f15896) {
                c17757.m41586();
            }
            for (C9291 c9291 : this.f15891) {
                C9291.m23849(c9291);
            }
            for (C21286 c21286 : this.f15894) {
                C21286.m48309(c21286);
            }
            for (C0117 c0117 : this.f15890) {
                C0117.m1118(c0117);
            }
        }
    }

    @Override // l.AbstractC0823
    /* renamed from: ᩷ */
    public final C5969 mo1146() {
        C0324 newBuilder = C5969.newBuilder();
        if (m14583().getNumber() >= EnumC3478.EDITION_2023.getNumber()) {
            return newBuilder.build();
        }
        if (m14583() == EnumC3478.EDITION_PROTO2 && this.f15893.m25566().m19783()) {
            C16114 c16114 = C23897.f77257;
            C16841 newBuilder2 = C14724.newBuilder();
            newBuilder2.m39618(EnumC17547.VERIFY);
            C14724 buildPartial = newBuilder2.buildPartial();
            if (!buildPartial.isInitialized()) {
                throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
            }
            newBuilder.m9114(c16114, buildPartial);
        }
        return newBuilder.build();
    }

    @Override // l.AbstractC0823
    /* renamed from: ᩻ */
    public final boolean mo1150() {
        return m14583().getNumber() < EnumC3478.EDITION_2023.getNumber() && m14583() == EnumC3478.EDITION_PROTO2 && this.f15893.m25566().m19783();
    }
}
