package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collections;

/* compiled from: 99PI */
/* renamed from: l.֡ۖۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0117 extends AbstractC0823 implements Comparable, InterfaceC18504 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C3646 f1104 = new C3646();

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132[] f1105 = EnumC7132.values();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public EnumC19169 f1106;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f1107;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17757 f1108;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f1109;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20766 f1110;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5057 f1111;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f1112;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17757 f1113;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9291 f1114;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17757 f1115;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14934 f1116;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f1117;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0117 c0117 = (C0117) obj;
        if (c0117.f1108 == this.f1108) {
            return this.f1110.m47467() - c0117.f1110.m47467();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    static {
        EnumC19169[] enumC19169Arr;
        enumC19169Arr = EnumC19169.f60399;
        if (enumC19169Arr.length != EnumC6654.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m1130() {
        return this.f1112;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23338 mo1132() {
        return this.f1110;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f1110.getName();
    }

    @Override // l.InterfaceC18504
    public final int getNumber() {
        return this.f1110.m47467();
    }

    public final String toString() {
        return this.f1109;
    }

    @Override // l.AbstractC0823
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo1141() {
        return this.f1109;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC18463 m1138() {
        return getType().m44249();
    }

    @Override // l.InterfaceC18504
    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public final EnumC1694 mo1140() {
        return mo1142().m19146();
    }

    @Override // l.AbstractC0823
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5057 mo1134() {
        return this.f1111;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m1135() {
        if (this.f1111.m14582().isEmpty()) {
            return getType() == EnumC19169.f60405 && this.f1114.m3069().m16725() == EnumC1030.CLOSED;
        }
        if (getType() == EnumC19169.f60405) {
            return ((C14724) m3069().m29576((AbstractC11408) C23897.f77257)).m35033() || this.f1114.m3069().m16725() == EnumC1030.CLOSED;
        }
        return false;
    }

    public final EnumC19169 getType() {
        C17757 c17757;
        C17757 c177572;
        if (this.f1106 == EnumC19169.f60400 && (((c17757 = this.f1115) == null || !c17757.mo1132().m46765().m39374()) && (((c177572 = this.f1108) == null || !c177572.mo1132().m46765().m39374()) && this.f2992 != null && m3069().m16722() == EnumC4558.DELIMITED))) {
            return EnumC19169.f60403;
        }
        return this.f1106;
    }

    @Override // l.InterfaceC18504
    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final EnumC7132 mo1142() {
        return f1105[getType().ordinal()];
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m1149() {
        if (getType() != EnumC19169.f60409) {
            return false;
        }
        if (this.f1108.mo1132().m46765().m39374() || ((C14724) m3069().m29576((AbstractC11408) C23897.f77257)).m35036().equals(EnumC17547.VERIFY)) {
            return true;
        }
        return m3069().m16729().equals(EnumC10203.VERIFY);
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m1137() {
        return getType() == EnumC19169.f60400 && mo1129() && m1147().mo1132().m46765().m39374();
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m1128() {
        return m3069().m16727() == EnumC15140.LEGACY_REQUIRED;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m1136() {
        return this.f1110.m47464() == EnumC14414.LABEL_OPTIONAL && m3069().m16727() != EnumC15140.LEGACY_REQUIRED;
    }

    @Override // l.InterfaceC18504
    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1129() {
        return this.f1110.m47464() == EnumC14414.LABEL_REPEATED;
    }

    @Override // l.InterfaceC18504
    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo1143() {
        if (m1133()) {
            return m3069().m16728().equals(EnumC13024.PACKED);
        }
        return false;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m1133() {
        return mo1129() && mo1142().mo16157();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object m1122() {
        if (m1138() == EnumC18463.MESSAGE) {
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }
        return this.f1107;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17757 m1123() {
        if (this.f1110.m47461()) {
            return this.f1113;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not an extension. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1126() {
        return this.f1110.m47461();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17757 m1144() {
        return this.f1108;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14934 m1139() {
        return this.f1116;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14934 m1148() {
        C14934 c14934 = this.f1116;
        if (c14934 == null || c14934.m35388()) {
            return null;
        }
        return c14934;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m1145() {
        if (mo1129()) {
            return false;
        }
        return this.f1117 || getType() == EnumC19169.f60400 || getType() == EnumC19169.f60403 || this.f1110.m47461() || this.f1116 != null || m3069().m16727() != EnumC15140.IMPLICIT;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m1125() {
        if (getType() != EnumC19169.f60403) {
            return false;
        }
        String lowerCase = m1147().getName().toLowerCase();
        C20766 c20766 = this.f1110;
        if (lowerCase.equals(c20766.getName()) && m1147().mo1134() == this.f1111) {
            return c20766.m47461() ? m1147().m41596() == m1123() : m1147().m41596() == this.f1108;
        }
        return false;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17757 m1147() {
        if (m1138() == EnumC18463.MESSAGE) {
            return this.f1115;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not of message type. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9291 m1127() {
        if (m1138() == EnumC18463.ENUM) {
            return this.f1114;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not of enum type. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0117(l.C20766 r3, l.C5057 r4, l.C17757 r5, int r6, boolean r7) {
        /*
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r2.f2993 = r5
            r2.f1112 = r6
            r2.f1110 = r3
            java.lang.String r6 = r3.getName()
            java.lang.String r6 = l.C21991.m49472(r4, r5, r6)
            r2.f1109 = r6
            r2.f1111 = r4
            boolean r6 = r3.hasType()
            if (r6 == 0) goto L26
            l.ۜۡۖ r6 = r3.getType()
            l.᩵ۖۖ r6 = l.EnumC19169.m44247(r6)
            r2.f1106 = r6
        L26:
            boolean r6 = r3.m47468()
            r2.f1117 = r6
            int r6 = r3.m47467()
            if (r6 <= 0) goto Lbb
            r6 = 0
            if (r7 == 0) goto L5f
            boolean r7 = r3.m47461()
            if (r7 == 0) goto L57
            r2.f1108 = r6
            if (r5 == 0) goto L42
            r2.f1113 = r5
            goto L46
        L42:
            r2.f1113 = r6
            r2.f2993 = r4
        L46:
            boolean r3 = r3.m47472()
            if (r3 != 0) goto L4f
            r2.f1116 = r6
            goto Lab
        L4f:
            l.ۜۖۖ r3 = new l.ۜۖۖ
            java.lang.String r4 = "FieldDescriptorProto.oneof_index set for extension field."
            r3.<init>(r2, r4, r0)
            throw r3
        L57:
            l.ۜۖۖ r3 = new l.ۜۖۖ
            java.lang.String r4 = "FieldDescriptorProto.extendee not set for extension field."
            r3.<init>(r2, r4, r0)
            throw r3
        L5f:
            boolean r7 = r3.m47461()
            if (r7 != 0) goto Lb3
            r2.f1108 = r5
            boolean r7 = r3.m47472()
            if (r7 == 0) goto La7
            int r7 = r3.m47458()
            if (r7 < 0) goto L97
            int r7 = r3.m47458()
            l.᩶᩷ۖ r1 = r5.mo1132()
            int r1 = r1.m46756()
            if (r7 >= r1) goto L97
            java.util.List r5 = r5.m41589()
            int r3 = r3.m47458()
            java.lang.Object r3 = r5.get(r3)
            l.ܶۖۖ r3 = (l.C14934) r3
            r2.f1116 = r3
            l.C14934.m35385(r3)
            r2.f2993 = r3
            goto La9
        L97:
            l.ۜۖۖ r3 = new l.ۜۖۖ
            java.lang.String r4 = r5.getName()
            java.lang.String r5 = "FieldDescriptorProto.oneof_index is out of range for type "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r2, r4, r0)
            throw r3
        La7:
            r2.f1116 = r6
        La9:
            r2.f1113 = r6
        Lab:
            l.᩻ۖۖ r3 = l.C5057.m14575(r4)
            r3.m51849(r2)
            return
        Lb3:
            l.ۜۖۖ r3 = new l.ۜۖۖ
            java.lang.String r4 = "FieldDescriptorProto.extendee set for non-extension field."
            r3.<init>(r2, r4, r0)
            throw r3
        Lbb:
            l.ۜۖۖ r3 = new l.ۜۖۖ
            java.lang.String r4 = "Field numbers must be positive integers."
            r3.<init>(r2, r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0117.<init>(l.᩷ۡۖ, l.ۚۖۖ, l.ᩳۖۖ, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1118(C0117 c0117) {
        c0117.m3070(c0117.f1110.m47459().m9548());
    }

    @Override // l.AbstractC0823
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5969 mo1146() {
        C0324 newBuilder = C5969.newBuilder();
        C5057 c5057 = this.f1111;
        if (c5057.m14583().getNumber() >= EnumC3478.EDITION_2023.getNumber()) {
            return newBuilder.build();
        }
        C20766 c20766 = this.f1110;
        if (c20766.m47464() == EnumC14414.LABEL_REQUIRED) {
            newBuilder.m1736(EnumC15140.LEGACY_REQUIRED);
        }
        if (c20766.getType() == EnumC6654.TYPE_GROUP) {
            newBuilder.m1733(EnumC4558.DELIMITED);
        }
        if (c5057.m14583() == EnumC3478.EDITION_PROTO2 && c20766.m47459().m9538()) {
            newBuilder.m1735(EnumC13024.PACKED);
        }
        if (c5057.m14583() == EnumC3478.EDITION_PROTO3 && c20766.m47459().m9542() && !c20766.m47459().m9538()) {
            newBuilder.m1735(EnumC13024.EXPANDED);
        }
        return newBuilder.build();
    }

    @Override // l.AbstractC0823
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo1150() {
        C5057 c5057 = this.f1111;
        if (c5057.m14583().getNumber() >= EnumC3478.EDITION_2023.getNumber()) {
            return false;
        }
        C20766 c20766 = this.f1110;
        if (c20766.m47464() == EnumC14414.LABEL_REQUIRED || c20766.getType() == EnumC6654.TYPE_GROUP || c20766.m47459().m9538()) {
            return true;
        }
        return c5057.m14583() == EnumC3478.EDITION_PROTO3 && c20766.m47459().m9542() && !c20766.m47459().m9538();
    }

    @Override // l.AbstractC0823
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo1131() {
        C17757 c17757 = this.f1108;
        if (c17757 != null && c17757.mo1132().m46765().m39380() && this.f1110.m47461()) {
            if (!m1136() || getType() != EnumC19169.f60400) {
                throw new C6468(this, "Extensions of MessageSets must be optional messages.", 0);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1119(C0117 c0117) {
        Object obj;
        C5057 c5057 = c0117.f1111;
        C20766 c20766 = c0117.f1110;
        int i = 0;
        if (c20766.m47461()) {
            AbstractC0823 m51847 = c5057.f15895.m51847(c20766.m47471(), c0117, EnumC14228.TYPES_ONLY);
            if (!(m51847 instanceof C17757)) {
                throw new C6468(c0117, "\"" + c20766.m47471() + "\" is not a message type.", i);
            }
            C17757 c17757 = (C17757) m51847;
            c0117.f1108 = c17757;
            if (!c17757.m41594(c20766.m47467())) {
                throw new C6468(c0117, "\"" + c0117.f1108.mo1141() + "\" does not declare " + c20766.m47467() + " as an extension number.", i);
            }
        }
        if (c20766.m47460()) {
            AbstractC0823 m518472 = c5057.f15895.m51847(c20766.m47469(), c0117, EnumC14228.TYPES_ONLY);
            if (!c20766.hasType()) {
                if (m518472 instanceof C17757) {
                    c0117.f1106 = EnumC19169.f60400;
                } else if (m518472 instanceof C9291) {
                    c0117.f1106 = EnumC19169.f60405;
                } else {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not a type.", i);
                }
            }
            if (c0117.f1106.m44249() == EnumC18463.MESSAGE) {
                if (!(m518472 instanceof C17757)) {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not a message type.", i);
                }
                c0117.f1115 = (C17757) m518472;
                if (c20766.m47456()) {
                    throw new C6468(c0117, "Messages can't have default values.", i);
                }
            } else if (c0117.f1106.m44249() == EnumC18463.ENUM) {
                if (!(m518472 instanceof C9291)) {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not an enum type.", i);
                }
                c0117.f1114 = (C9291) m518472;
            } else {
                throw new C6468(c0117, "Field with primitive type has type_name.", i);
            }
        } else if (c0117.f1106.m44249() == EnumC18463.MESSAGE || c0117.f1106.m44249() == EnumC18463.ENUM) {
            throw new C6468(c0117, "Field with message or enum type missing type_name.", i);
        }
        if (c20766.m47459().m9538() && !c0117.m1133()) {
            throw new C6468(c0117, "[packed = true] can only be specified for repeated primitive fields.", i);
        }
        if (c20766.m47456()) {
            if (c0117.mo1129()) {
                throw new C6468(c0117, "Repeated fields cannot have default values.", i);
            }
            try {
                switch (C16345.f50316[c0117.f1106.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c0117.f1107 = Integer.valueOf(C11490.m28309(c20766.m47462()));
                        return;
                    case 4:
                    case 5:
                        c0117.f1107 = Integer.valueOf(C11490.m28314(c20766.m47462()));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        c0117.f1107 = Long.valueOf(C11490.m28312(c20766.m47462()));
                        return;
                    case 9:
                    case 10:
                        c0117.f1107 = Long.valueOf(C11490.m28316(c20766.m47462()));
                        return;
                    case 11:
                        if (c20766.m47462().equals("inf")) {
                            c0117.f1107 = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (c20766.m47462().equals("-inf")) {
                            c0117.f1107 = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (c20766.m47462().equals("nan")) {
                            c0117.f1107 = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            c0117.f1107 = Float.valueOf(c20766.m47462());
                            return;
                        }
                    case 12:
                        if (c20766.m47462().equals("inf")) {
                            c0117.f1107 = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (c20766.m47462().equals("-inf")) {
                            c0117.f1107 = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (c20766.m47462().equals("nan")) {
                            c0117.f1107 = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            c0117.f1107 = Double.valueOf(c20766.m47462());
                            return;
                        }
                    case 13:
                        c0117.f1107 = Boolean.valueOf(c20766.m47462());
                        return;
                    case 14:
                        c0117.f1107 = c20766.m47462();
                        return;
                    case 15:
                        try {
                            c0117.f1107 = C11490.m28315(c20766.m47462());
                            return;
                        } catch (C3023 e) {
                            throw new C6468(c0117, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 16:
                        C2235 m23852 = c0117.f1114.m23852(c20766.m47462());
                        c0117.f1107 = m23852;
                        if (m23852 != null) {
                            return;
                        }
                        throw new C6468(c0117, "Unknown enum default value: \"" + c20766.m47462() + '\"', i);
                    case 17:
                    case 18:
                        throw new C6468(c0117, "Message type had default value.", i);
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new C6468(c0117, "Could not parse default value: \"" + c20766.m47462() + '\"', e2);
            }
            throw new C6468(c0117, "Could not parse default value: \"" + c20766.m47462() + '\"', e2);
        }
        if (c0117.mo1129()) {
            c0117.f1107 = Collections.EMPTY_LIST;
            return;
        }
        int i2 = C16345.f50315[c0117.f1106.m44249().ordinal()];
        if (i2 == 1) {
            c0117.f1107 = c0117.f1114.m23854().get(0);
        } else if (i2 != 2) {
            obj = c0117.f1106.m44249().f57252;
            c0117.f1107 = obj;
        } else {
            c0117.f1107 = null;
        }
    }

    @Override // l.InterfaceC18504
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9228 mo1124(InterfaceC9228 interfaceC9228, InterfaceC8522 interfaceC8522) {
        return ((InterfaceC14165) interfaceC9228).mergeFrom((InterfaceC23338) interfaceC8522);
    }
}
