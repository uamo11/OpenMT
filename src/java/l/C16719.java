package l;

import java.util.Locale;
import java.util.Set;

/* compiled from: 544J */
/* renamed from: l.ܽܶ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16719 implements InterfaceC11991 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC12816 f51344;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4520 f51345;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14397 f51346;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set f51347;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3109 f51348;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC20347 f51349;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1903 f51350;

    public C16719(InterfaceC12816 interfaceC12816, AbstractC4520 abstractC4520, EnumC20347 enumC20347, Set set, C14397 c14397, InterfaceC3109 interfaceC3109) {
        if (c14397 == null && interfaceC3109 != null && interfaceC3109.mo9480() != -1) {
            throw new IllegalArgumentException();
        }
        this.f51344 = interfaceC12816;
        this.f51345 = abstractC4520;
        this.f51349 = enumC20347;
        this.f51347 = set;
        this.f51346 = c14397;
        this.f51348 = interfaceC3109;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC12986 m39353() {
        return this.f51345.f14366;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 mo39349() {
        return C2609.m8239();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m39347() {
        return this.f51347.contains(EnumC20043.MANDATORY);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC20347 m39357() {
        return this.f51349;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m39350() {
        C14397 c14397 = this.f51346;
        if (c14397 == null) {
            return null;
        }
        return c14397.f43371;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14397 m39355() {
        return this.f51346;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m39348() {
        InterfaceC3109 interfaceC3109 = this.f51348;
        if (interfaceC3109 == null) {
            return -1;
        }
        return interfaceC3109.mo9483();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m39358() {
        InterfaceC3109 interfaceC3109 = this.f51348;
        if (interfaceC3109 == null) {
            return -1;
        }
        return interfaceC3109.mo9480();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39352() {
        InterfaceC3109 interfaceC3109 = this.f51348;
        if (interfaceC3109 == null) {
            return -1;
        }
        return interfaceC3109.mo9481(this.f51346.f43369);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3109 m39356() {
        return this.f51348;
    }

    @Override // l.InterfaceC11991
    public final long getLineNumber() {
        if (this.f51350 == null) {
            this.f51350 = new C1903(this);
        }
        return this.f51350.m6254();
    }

    @Override // l.InterfaceC11991
    public final long getColumnNumber() {
        if (this.f51350 == null) {
            this.f51350 = new C1903(this);
        }
        return this.f51350.m6253();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object[] m39354() {
        return this.f51345.f14363;
    }

    public final String toString() {
        return this.f51344.mo8643(this, Locale.getDefault());
    }

    @Override // l.InterfaceC11991
    /* renamed from: ֫ */
    public final EnumC6346 mo29297() {
        int ordinal = this.f51345.f14366.ordinal();
        if (ordinal == 1) {
            return EnumC6346.NOTE;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return EnumC6346.ERROR;
            }
            return EnumC6346.OTHER;
        }
        if (this.f51347.contains(EnumC20043.MANDATORY)) {
            return EnumC6346.MANDATORY_WARNING;
        }
        return EnumC6346.WARNING;
    }

    @Override // l.InterfaceC11991
    /* renamed from: ۧ */
    public final String mo29298() {
        return this.f51345.m13293();
    }

    @Override // l.InterfaceC11991
    /* renamed from: ֫ */
    public final String mo29296(Locale locale) {
        return this.f51344.mo8640(this, locale);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39351(EnumC20043 enumC20043) {
        Set set = this.f51347;
        set.add(enumC20043);
        if (this.f51345.f14366 == EnumC12986.ERROR) {
            int ordinal = enumC20043.ordinal();
            if (ordinal == 1) {
                set.add(EnumC20043.RECOVERABLE);
            } else {
                if (ordinal != 2) {
                    return;
                }
                set.remove(EnumC20043.RECOVERABLE);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39346(EnumC20043 enumC20043) {
        return this.f51347.contains(enumC20043);
    }
}
