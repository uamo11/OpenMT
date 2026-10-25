package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Field;

/* compiled from: 8B7K */
/* renamed from: l.ۗᩳᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3406 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 f10776;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f10777;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f10778;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Field f10779;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f10780;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f10781;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f10782;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC7639 f10783;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f10784;

    public C3406(Object obj, Field field, InterfaceC11873 interfaceC11873) {
        int m39524;
        this.f10784 = obj;
        this.f10779 = field;
        this.f10776 = interfaceC11873;
        EnumC1974 type = interfaceC11873.type();
        this.f10778 = type;
        this.f10781 = interfaceC11873.elementType();
        EnumC13988 cls = interfaceC11873.cls();
        if (cls == EnumC13988.AUTOMATIC) {
            if (interfaceC11873.tagNumber() != -1) {
                cls = EnumC13988.CONTEXT_SPECIFIC;
            } else {
                cls = EnumC13988.UNIVERSAL;
            }
        }
        int i = C11147.f33468[cls.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported tag class: " + cls);
                    }
                    i2 = 0;
                }
            }
        }
        this.f10780 = i2;
        if (interfaceC11873.tagNumber() != -1) {
            m39524 = interfaceC11873.tagNumber();
        } else {
            m39524 = (type == EnumC1974.CHOICE || type == EnumC1974.ANY) ? -1 : AbstractC16790.m39524(type);
        }
        this.f10782 = m39524;
        EnumC7639 tagging = interfaceC11873.tagging();
        this.f10783 = tagging;
        if ((tagging == EnumC7639.EXPLICIT || tagging == EnumC7639.IMPLICIT) && interfaceC11873.tagNumber() == -1) {
            throw new C6228("Tag number must be specified when tagging mode is " + tagging);
        }
        this.f10777 = interfaceC11873.optional();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Field m10376() {
        return this.f10779;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 m10375() {
        return this.f10776;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m10377() {
        Object m26337;
        byte[] m26338;
        m26337 = C10462.m26337(this.f10779, this.f10784);
        if (m26337 == null) {
            if (this.f10777) {
                return null;
            }
            throw new C6228("Required field not set");
        }
        byte[] m30818 = C12578.m30818(m26337, this.f10778, this.f10781);
        int[] iArr = C4817.f15240;
        EnumC7639 enumC7639 = this.f10783;
        int i = iArr[enumC7639.ordinal()];
        if (i == 1) {
            return m30818;
        }
        int i2 = this.f10780;
        int i3 = this.f10782;
        if (i == 2) {
            m26338 = C10462.m26338(i2, true, i3, m30818);
            return m26338;
        }
        if (i != 3) {
            throw new RuntimeException("Unknown tagging mode: " + enumC7639);
        }
        byte b = m30818[0];
        if ((b & bo.j) == 31) {
            throw new C6228("High-tag-number form not supported");
        }
        if (i3 >= 31) {
            throw new C6228(C19370.m44628(i3, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & bo.k) | i3);
        m30818[0] = b2;
        m30818[0] = (byte) ((b2 & 63) | (i2 << 6));
        return m30818;
    }
}
