package l;

import java.util.Iterator;

/* compiled from: 37RB */
/* renamed from: l.᩹ۘ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22036 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 f70638;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f70639;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC19920 f70640;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f70641;

    public C22036(EnumC19920 enumC19920, int i, int i2, C2609 c2609) {
        this.f70640 = enumC19920;
        this.f70641 = i;
        this.f70639 = i2;
        this.f70638 = c2609;
        mo3193();
    }

    /* renamed from: ֫ */
    public void mo3193() {
        EnumC21331 enumC21331 = this.f70640.f64483;
        EnumC21331 enumC213312 = EnumC21331.DEFAULT;
        if (enumC21331 == enumC213312) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC213312);
    }

    /* renamed from: ᩳ */
    public AbstractC10370 mo3194() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܳ */
    public String mo35462() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܿ */
    public int mo21214() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5102 m49578() {
        C2609 m49577 = m49577(EnumC0162.JAVADOC);
        if (m49577.isEmpty()) {
            return null;
        }
        return (InterfaceC5102) m49577.f8240;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49579() {
        Iterator it = m49577(EnumC0162.JAVADOC).iterator();
        while (it.hasNext()) {
            if (((InterfaceC5102) it.next()).isDeprecated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m49577(EnumC0162 enumC0162) {
        C2609 c2609 = this.f70638;
        if (c2609 == null) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            InterfaceC5102 interfaceC5102 = (InterfaceC5102) it.next();
            if (interfaceC5102.getStyle() == enumC0162) {
                c18837.m43511(interfaceC5102);
            }
        }
        return c18837.m43517();
    }
}
