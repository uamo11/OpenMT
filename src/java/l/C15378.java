package l;

import bin.mt.plus.R;
import java.io.InputStream;

/* compiled from: 45AX */
/* renamed from: l.ܶܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15378 extends AbstractC13262 {
    public /* synthetic */ C15378(int i) {
        this();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C15378 m36415() {
        C15378 c15378;
        c15378 = C8324.f25539;
        return c15378;
    }

    public C15378() {
    }

    @Override // l.AbstractC13262
    /* renamed from: ۘ */
    public final String mo10324() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f120aa3);
    }

    @Override // l.AbstractC13262
    /* renamed from: ۜ */
    public final byte[] mo10325() {
        InputStream resourceAsStream = C15378.class.getResourceAsStream("/assets/".concat("testkey.x509.pem"));
        if (resourceAsStream == null) {
            resourceAsStream = C4925.m14325().open("testkey.x509.pem");
        }
        return C0349.m1795(resourceAsStream, 0);
    }

    @Override // l.AbstractC13262
    /* renamed from: ᩷ */
    public final byte[] mo10326() {
        InputStream resourceAsStream = C15378.class.getResourceAsStream("/assets/".concat("testkey.pk8"));
        if (resourceAsStream == null) {
            resourceAsStream = C4925.m14325().open("testkey.pk8");
        }
        return C0349.m1795(resourceAsStream, 0);
    }
}
