package l;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: MB8H */
/* renamed from: l.ۚᩳᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5523 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 f17088;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17089;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f17090;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17091;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Field f17092;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f17093;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC7639 f17094;

    public C5523(Field field, InterfaceC11873 interfaceC11873) {
        int m18705;
        this.f17092 = field;
        this.f17088 = interfaceC11873;
        EnumC1974 type = interfaceC11873.type();
        this.f17093 = type;
        EnumC13988 cls = interfaceC11873.cls();
        if (cls == EnumC13988.AUTOMATIC) {
            if (interfaceC11873.tagNumber() != -1) {
                cls = EnumC13988.CONTEXT_SPECIFIC;
            } else {
                cls = EnumC13988.UNIVERSAL;
            }
        }
        this.f17089 = AbstractC6913.m18706(cls);
        if (interfaceC11873.tagNumber() != -1) {
            m18705 = interfaceC11873.tagNumber();
        } else {
            m18705 = (type == EnumC1974.CHOICE || type == EnumC1974.ANY) ? -1 : AbstractC6913.m18705(type);
        }
        this.f17091 = m18705;
        EnumC7639 tagging = interfaceC11873.tagging();
        this.f17094 = tagging;
        if ((tagging == EnumC7639.EXPLICIT || tagging == EnumC7639.IMPLICIT) && interfaceC11873.tagNumber() == -1) {
            throw new C22456("Tag number must be specified when tagging mode is " + tagging);
        }
        this.f17090 = interfaceC11873.optional();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Field m15660() {
        return this.f17092;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 m15655() {
        return this.f17088;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m15659() {
        return this.f17090;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15657() {
        return this.f17089;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m15658() {
        return this.f17091;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15656(C17496 c17496, Object obj) {
        ArrayList m36444;
        int m40883 = c17496.m40883();
        int i = this.f17089;
        int i2 = this.f17091;
        if (i2 != -1) {
            int m40882 = c17496.m40882();
            if (m40883 != i || m40882 != i2) {
                throw new C1289("Tag mismatch. Expected: " + AbstractC6913.m18708(i, i2) + ", but found " + AbstractC6913.m18708(m40883, m40882));
            }
        } else if (m40883 != i) {
            throw new C1289("Tag mismatch. Expected class: " + AbstractC6913.m18707(i) + ", but found " + AbstractC6913.m18707(m40883));
        }
        if (this.f17094 == EnumC7639.EXPLICIT) {
            try {
                c17496 = c17496.m40879().m47861();
            } catch (C14673 e) {
                throw new C22456("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.f17092;
        InterfaceC11873 interfaceC11873 = this.f17088;
        EnumC1974 enumC1974 = this.f17093;
        try {
            int i3 = C0583.f2307[enumC1974.ordinal()];
            if (i3 == 4 || i3 == 5) {
                if (C23161.class.equals(field.getType())) {
                    field.set(obj, C8345.m21943(enumC1974, c17496, field.getType()));
                    return;
                } else {
                    if (interfaceC11873.listElementType() == Object.class) {
                        throw new RuntimeException(field.toString());
                    }
                    m36444 = C15399.m36444(c17496, interfaceC11873.listElementType());
                    field.set(obj, m36444);
                    return;
                }
            }
            field.set(obj, C8345.m21943(enumC1974, c17496, field.getType()));
        } catch (Exception e2) {
            throw new C22456("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
