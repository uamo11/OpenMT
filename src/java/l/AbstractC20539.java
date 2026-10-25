package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: Z2OJ */
/* renamed from: l.᩷֨ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC20539 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9250 f66149;

    public AbstractC20539(AbstractC9250 abstractC9250) {
        if (abstractC9250 == null) {
            throw new IllegalArgumentException("Expecting non-null transport");
        }
        this.f66149 = abstractC9250;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11491 m47030(C10080 c10080, EnumC22074... enumC22074Arr) {
        C11491 m23747 = this.f66149.m23747(c10080);
        int m35552 = m23747.m35552();
        for (EnumC22074 enumC22074 : enumC22074Arr) {
            if (enumC22074 != null && enumC22074.m49668(m35552)) {
                return m23747;
            }
        }
        EnumC22074 m49667 = EnumC22074.m49667(m35552);
        C9375 c9375 = new C9375(String.format("%s returned error code: 0x%08X %s", "NetrShareEnum[1]", Integer.valueOf(m35552), m49667 == null ? "" : MotionUtils.EASING_TYPE_FORMAT_START + m49667 + MotionUtils.EASING_TYPE_FORMAT_END));
        EnumC22074.m49667(m35552);
        throw c9375;
    }
}
