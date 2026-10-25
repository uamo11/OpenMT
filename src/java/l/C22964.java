package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: Z9K8 */
/* renamed from: l.᩺ۨۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22964 extends C16614 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22984 f73956;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f73957;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73958;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f73959;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f73960;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public UUID f73961;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumSet f73962 = EnumSet.noneOf(EnumC5866.class);

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f73963;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f73964;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // l.C16614
    /* renamed from: ۧ */
    public final void mo7050(C0097 c0097) {
        int i;
        int i2;
        ?? r0;
        c0097.m26096(2);
        this.f73958 = c0097.m26100();
        EnumC22094 m49678 = EnumC22094.m49678(c0097.m26100());
        this.f73960 = m49678;
        EnumC22094 enumC22094 = EnumC22094.SMB_3_1_1;
        if (m49678 == enumC22094) {
            i = c0097.m26100();
        } else {
            c0097.m26096(2);
            i = 0;
        }
        this.f73961 = new UUID((((c0097.m26082() << 16) | c0097.m26100()) << 16) | c0097.m26100(), AbstractC23024.f74107.mo17000(c0097));
        this.f73962 = C15262.m36278(c0097.m26082(), EnumC5866.class);
        this.f73957 = c0097.m26099();
        this.f73964 = c0097.m26099();
        this.f73963 = c0097.m26099();
        this.f73956 = C13811.m33143(c0097);
        C13811.m33143(c0097);
        int m26100 = c0097.m26100();
        int m261002 = c0097.m26100();
        if (this.f73960 == enumC22094) {
            i2 = c0097.m26100();
        } else {
            c0097.m26096(2);
            i2 = 0;
        }
        if (m261002 > 0) {
            c0097.m26097(m26100);
            c0097.m26094(m261002);
        }
        if (this.f73960 == enumC22094) {
            c0097.m26097(i2);
            try {
                r0 = new ArrayList();
                for (int i3 = 0; i3 < i; i3++) {
                    r0.add(AbstractC1424.m4921(c0097));
                }
            } catch (C13146 e) {
                throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
            }
        } else {
            r0 = Collections.EMPTY_LIST;
        }
        this.f73959 = r0;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m51098() {
        return this.f73958;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC22094 m51105() {
        return this.f73960;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID m51103() {
        return this.f73961;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set m51099() {
        return this.f73962;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m51100() {
        return this.f73957;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m51101() {
        return this.f73964;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m51102() {
        return this.f73963;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22984 m51104() {
        return this.f73956;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m51097() {
        return this.f73959;
    }
}
