package l;

import java.util.function.ToIntFunction;

/* compiled from: M3ZI */
/* renamed from: l.᩺ۚ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC22782 {
    START_POS(new C11117(1)),
    FIRST_STAT_POS(new C5849()),
    END_POS(new C11494());


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ToIntFunction f73566;

    EnumC22782(ToIntFunction toIntFunction) {
        this.f73566 = toIntFunction;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m50863(AbstractC5144 abstractC5144) {
        return this.f73566.applyAsInt(abstractC5144);
    }
}
