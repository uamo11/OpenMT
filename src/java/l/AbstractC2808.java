package l;

import java.io.Serializable;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CANR */
/* renamed from: l.ۖ᩸᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2808 implements InterfaceC11791, InterfaceC19742, Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 f8778;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract Object mo8684(Object obj);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo8687() {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC11791, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public AbstractC2808(InterfaceC11791 interfaceC11791) {
        this.f8778 = interfaceC11791;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 m8686() {
        return this.f8778;
    }

    @Override // l.InterfaceC11791
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8683(Object obj) {
        InterfaceC11791 interfaceC11791 = this;
        while (true) {
            AbstractC2808 abstractC2808 = (AbstractC2808) interfaceC11791;
            InterfaceC11791 interfaceC117912 = abstractC2808.f8778;
            C11233.m27799(interfaceC117912);
            try {
                obj = abstractC2808.mo8684(obj);
                if (obj == EnumC7041.f21688) {
                    return;
                }
            } catch (Throwable th) {
                obj = C18642.m43235(th);
            }
            abstractC2808.mo8687();
            if (!(interfaceC117912 instanceof AbstractC2808)) {
                interfaceC117912.mo8683(obj);
                return;
            }
            interfaceC11791 = interfaceC117912;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object mo8685 = mo8685();
        if (mo8685 == null) {
            mo8685 = getClass().getName();
        }
        sb.append(mo8685);
        return sb.toString();
    }

    @Override // l.InterfaceC19742
    /* renamed from: ۧ */
    public InterfaceC19742 mo3350() {
        InterfaceC11791 interfaceC11791 = this.f8778;
        if (interfaceC11791 instanceof InterfaceC19742) {
            return (InterfaceC19742) interfaceC11791;
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public StackTraceElement mo8685() {
        int i;
        String str;
        InterfaceC0690 interfaceC0690 = (InterfaceC0690) getClass().getAnnotation(InterfaceC0690.class);
        if (interfaceC0690 == null || interfaceC0690.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? interfaceC0690.l()[i] : -1;
        String m4888 = C1396.m4888(this);
        if (m4888 == null) {
            str = interfaceC0690.c();
        } else {
            str = m4888 + '/' + interfaceC0690.c();
        }
        return new StackTraceElement(str, interfaceC0690.m(), interfaceC0690.f(), i2);
    }
}
