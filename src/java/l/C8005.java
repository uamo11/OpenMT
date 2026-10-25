package l;

import java.util.Set;

/* compiled from: L5VZ */
/* renamed from: l.۠ۜۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8005 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5245 f24723;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15765 f24724;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24725 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24726 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f24727;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15765 f24728;

    public C8005(InterfaceC5245 interfaceC5245, C15765 c15765, int i) {
        C15765 m48522;
        this.f24727 = c15765.getPosition();
        this.f24723 = interfaceC5245;
        this.f24728 = c15765;
        int i2 = i * 4;
        C15765.m37166(c15765, 0);
        m48522 = AbstractC21411.m48522(interfaceC5245, c15765.getPosition());
        this.f24724 = m48522;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f24728.write(0);
        }
        this.f24728.flush();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21320() {
        if (!this.f24725) {
            C15765 c15765 = this.f24724;
            c15765.getClass();
            C15765.m37166(c15765, 0);
        }
        this.f24725 = false;
        this.f24726 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21319(Set set) {
        boolean isEmpty = set.isEmpty();
        C15765 c15765 = this.f24728;
        if (isEmpty) {
            if (this.f24725) {
                int value = EnumC18481.WHITELIST.getValue();
                c15765.getClass();
                C15765.m37168(c15765, value);
                return;
            }
            this.f24726++;
            return;
        }
        if (!this.f24725) {
            this.f24725 = true;
            int position = c15765.getPosition() - this.f24727;
            C15765 c157652 = this.f24724;
            c157652.getClass();
            C15765.m37166(c157652, position);
            for (int i = 0; i < this.f24726; i++) {
                C15765.m37168(c15765, EnumC18481.WHITELIST.getValue());
            }
            this.f24726 = 0;
        }
        int m42966 = EnumC18481.m42966(set);
        c15765.getClass();
        C15765.m37168(c15765, m42966);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21318() {
        int i = this.f24727;
        this.f24724.close();
        C15765 c15765 = null;
        try {
            c15765 = AbstractC21411.m48522(this.f24723, i);
            C15765.m37166(c15765, this.f24728.getPosition() - i);
            c15765.close();
        } catch (Throwable th) {
            if (c15765 != null) {
                c15765.close();
            }
            throw th;
        }
    }
}
