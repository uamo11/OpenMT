package l;

import android.content.Context;

/* compiled from: RB93 */
/* renamed from: l.۠ܳ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8227 extends C15281 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5677 f25342;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f25343;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f25344;

    public C8227(C4888 c4888, C23686 c23686, boolean z) {
        super(c4888, c23686);
        this.f25343 = false;
        this.f25344 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5677 m21778(Context context) {
        if (this.f25343) {
            return this.f25342;
        }
        C5677 m22198 = C8499.m22198(context, m36288().m14248(), m36288().m14246() == EnumC20411.VISIBLE, this.f25344);
        this.f25342 = m22198;
        this.f25343 = true;
        return m22198;
    }
}
