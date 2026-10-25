package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: M9PM */
/* renamed from: l.ᩴ᩷ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19001 implements InterfaceC20517 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59885 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2773 f59886;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashSet f59887;

    static {
        new C19001();
        f59887 = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        f59886 = new C2773();
    }

    @Override // l.InterfaceC20517
    /* renamed from: ۧ */
    public final boolean mo4612(Class cls) {
        return AbstractC4121.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.۫ᩴۖ] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // l.InterfaceC20517
    /* renamed from: ֫ */
    public final InterfaceC6405 mo4611(Class cls) {
        C4184 c4184;
        C15680 m36921;
        Class<?> returnType;
        if (!AbstractC4121.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        C17757 descriptorForType = m43846(cls).getDescriptorForType();
        List fields = descriptorForType.getFields();
        C22073 c22073 = new C22073(fields.size());
        c22073.m49663(m43846(cls));
        int i = C9829.f29686[descriptorForType.mo1134().m14583().ordinal()];
        c22073.m49661(i != 1 ? i != 2 ? EnumC5700.EDITIONS : EnumC5700.PROTO3 : EnumC5700.PROTO2);
        c22073.m49664(descriptorForType.m41593().m39380());
        C4184 c41842 = new C4184();
        Class<?>[] clsArr = null;
        Field field = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < fields.size()) {
            C0117 c0117 = (C0117) fields.get(i2);
            boolean m1149 = c0117.m1149();
            EnumC18463 m1138 = c0117.m1138();
            EnumC18463 enumC18463 = EnumC18463.ENUM;
            ?? c7006 = (m1138 == enumC18463 && c0117.m1135()) ? new C7006(c0117) : clsArr;
            if (c0117.m1148() != null) {
                C12755 m12629 = c41842.m12629(cls, c0117.m1139());
                EnumC0864 m43843 = m43843(c0117);
                switch (C9829.f29688[m43843.m3179().ordinal()]) {
                    case 1:
                        returnType = Boolean.class;
                        break;
                    case 2:
                        returnType = AbstractC5886.class;
                        break;
                    case 3:
                        returnType = Double.class;
                        break;
                    case 4:
                        returnType = Float.class;
                        break;
                    case 5:
                    case 6:
                        returnType = Integer.class;
                        break;
                    case 7:
                        returnType = Long.class;
                        break;
                    case 8:
                        returnType = String.class;
                        break;
                    case 9:
                        try {
                            returnType = cls.getDeclaredMethod(m43844(c0117.getType() == EnumC19169.f60403 ? c0117.m1147().getName() : c0117.getName()), clsArr).getReturnType();
                            break;
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    default:
                        throw new IllegalArgumentException("Invalid type for oneof: " + m43843);
                }
                c22073.m49662(C15680.m36915(c0117.getNumber(), m43843, m12629, returnType, m1149, c7006));
                c4184 = c41842;
            } else {
                EnumC19169 type = c0117.getType();
                EnumC19169 enumC19169 = EnumC19169.f60403;
                String name = type == enumC19169 ? c0117.m1147().getName() : c0117.getName();
                c4184 = c41842;
                Field m43845 = m43845(cls, C9045.m23341(new StringBuilder(), m43841(name, false), f59887.contains(m43841(name, z)) ? "__" : "_"));
                int number = c0117.getNumber();
                EnumC0864 m438432 = m43843(c0117);
                if (c0117.m1145()) {
                    if (field == null) {
                        field = m43845(cls, C18307.m42645(i3, "bitField", "_"));
                    }
                    c22073.m49662(c0117.m1128() ? C15680.m36924(m43845, number, m438432, field, i4, m1149, c7006) : C15680.m36919(m43845, number, m438432, field, i4, m1149, c7006));
                    int i5 = i4 << 1;
                    if (i5 == 0) {
                        i3++;
                        field = null;
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                } else {
                    if (c0117.m1137()) {
                        C0117 m41590 = c0117.m1147().m41590(2);
                        C21118 c21118 = c7006;
                        if (m41590.m1138() == enumC18463) {
                            c21118 = c7006;
                            if (m41590.m1135()) {
                                c21118 = new C21118(m41590);
                            }
                        }
                        String name2 = c0117.getName();
                        int i6 = C8668.f26436;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cls.getName());
                            sb.append("$");
                            StringBuilder sb2 = new StringBuilder();
                            boolean z2 = true;
                            for (int i7 = 0; i7 < name2.length(); i7++) {
                                char charAt = name2.charAt(i7);
                                if ('a' > charAt || charAt > 'z') {
                                    if ('A' > charAt || charAt > 'Z') {
                                        if ('0' <= charAt && charAt <= '9') {
                                            sb2.append(charAt);
                                        }
                                        z2 = true;
                                    } else if (i7 != 0 || z2) {
                                        sb2.append(charAt);
                                    } else {
                                        sb2.append((char) (charAt + ' '));
                                    }
                                } else if (z2) {
                                    sb2.append((char) (charAt - ' '));
                                } else {
                                    sb2.append(charAt);
                                }
                                z2 = false;
                            }
                            sb.append(sb2.toString());
                            sb.append("DefaultEntryHolder");
                            Field[] declaredFields = Class.forName(sb.toString()).getDeclaredFields();
                            if (declaredFields.length != 1) {
                                throw new IllegalStateException("Unable to look up map field default entry holder class for " + name2 + " in " + cls.getName());
                            }
                            m36921 = C15680.m36916(m43845, number, C21244.m48221(declaredFields[0]), c21118);
                        } finally {
                            RuntimeException runtimeException = new RuntimeException(th);
                        }
                    } else if (c0117.mo1129() && c0117.m1138() == EnumC18463.MESSAGE) {
                        try {
                            m36921 = C15680.m36917(m43845, number, m438432, cls.getDeclaredMethod(m43844(c0117.getType() == enumC19169 ? c0117.m1147().getName() : c0117.getName()), Integer.TYPE).getReturnType());
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        m36921 = c0117.mo1143() ? c7006 != 0 ? C15680.m36921(m43845, number, m438432, c7006, m43845(cls, C9045.m23341(new StringBuilder(), m43841(c0117.getName(), false), "MemoizedSerializedSize"))) : C15680.m36918(m43845, number, m438432, m43845(cls, C9045.m23341(new StringBuilder(), m43841(c0117.getName(), false), "MemoizedSerializedSize"))) : c7006 != 0 ? C15680.m36920(m43845, number, m438432, (InterfaceC12587) c7006) : C15680.m36922(m43845, number, m438432, m1149);
                    }
                    c22073.m49662(m36921);
                }
            }
            i2++;
            z = true;
            clsArr = null;
            c41842 = c4184;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C0117 c01172 = (C0117) fields.get(i8);
            if (c01172.m1128() || (c01172.m1138() == EnumC18463.MESSAGE && f59886.m8570(c01172.m1147()))) {
                arrayList.add(Integer.valueOf(c01172.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        if (size > 0) {
            c22073.m49665(iArr);
        }
        return c22073.m49660();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m43846(Class cls) {
        try {
            return (InterfaceC23338) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0864 m43843(C0117 c0117) {
        switch (C9829.f29687[c0117.getType().ordinal()]) {
            case 1:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3363 : EnumC0864.f3374;
                }
                return EnumC0864.f3380;
            case 2:
                return c0117.mo1129() ? EnumC0864.f3404 : EnumC0864.f3378;
            case 3:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3356 : EnumC0864.f3367;
                }
                return EnumC0864.f3384;
            case 4:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3393 : EnumC0864.f3395;
                }
                return EnumC0864.f3391;
            case 5:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3365 : EnumC0864.f3406;
                }
                return EnumC0864.f3386;
            case 6:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3370 : EnumC0864.f3372;
                }
                return EnumC0864.f3400;
            case 7:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3360 : EnumC0864.f3358;
                }
                return EnumC0864.f3389;
            case 8:
                return c0117.mo1129() ? EnumC0864.f3398 : EnumC0864.f3397;
            case 9:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3355 : EnumC0864.f3362;
                }
                return EnumC0864.f3354;
            case 10:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3402 : EnumC0864.f3388;
                }
                return EnumC0864.f3369;
            case 11:
                if (c0117.m1137()) {
                    return EnumC0864.f3403;
                }
                return c0117.mo1129() ? EnumC0864.f3361 : EnumC0864.f3399;
            case 12:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3381 : EnumC0864.f3383;
                }
                return EnumC0864.f3359;
            case 13:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3379 : EnumC0864.f3364;
                }
                return EnumC0864.f3375;
            case 14:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3368 : EnumC0864.f3385;
                }
                return EnumC0864.f3405;
            case 15:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3392 : EnumC0864.f3377;
                }
                return EnumC0864.f3357;
            case 16:
                return c0117.mo1129() ? EnumC0864.f3394 : EnumC0864.f3396;
            case 17:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3366 : EnumC0864.f3407;
                }
                return EnumC0864.f3387;
            case 18:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3371 : EnumC0864.f3373;
                }
                return EnumC0864.f3401;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + c0117.getType());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m43845(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder m9834 = C3200.m9834("Unable to find field ", str, " in message class ");
            m9834.append(cls.getName());
            throw new IllegalArgumentException(m9834.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43840(String str) {
        return m43841(str, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43844(String str) {
        String m43841 = m43841(str, false);
        return "get" + Character.toUpperCase(m43841.charAt(0)) + m43841.substring(1, m43841.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43841(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '_') {
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                } else {
                    if (z) {
                        sb.append(Character.toUpperCase(charAt));
                        z = false;
                    } else if (i == 0) {
                        sb.append(Character.toLowerCase(charAt));
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            z = true;
        }
        return sb.toString();
    }
}
