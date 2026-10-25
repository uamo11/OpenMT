package l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: P86L */
/* renamed from: l.ۗᩳۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3394 implements InterfaceC15387, Cloneable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C3394 f10748 = new C3394();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f10749;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f10750;

    public C3394() {
        List list = Collections.EMPTY_LIST;
        this.f10750 = list;
        this.f10749 = list;
    }

    public final Object clone() {
        try {
            return (C3394) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC15387
    /* renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class m38778 = c16469.m38778();
        boolean m10350 = m10350(m38778, true);
        boolean m103502 = m10350(m38778, false);
        if (m10350 || m103502) {
            return new C4805(this, m103502, m10350, c12524, c16469);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10351(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m10350(field.getType(), z)) {
            return true;
        }
        List list = z ? this.f10750 : this.f10749;
        if (list.isEmpty()) {
            return false;
        }
        new C1900(field);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC16051) it.next()).m37960()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10350(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            int i = C13438.f40152;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.f10750 : this.f10749).iterator();
        while (it.hasNext()) {
            if (((InterfaceC16051) it.next()).m37959()) {
                return true;
            }
        }
        return false;
    }
}
