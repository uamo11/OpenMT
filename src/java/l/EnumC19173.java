package l;

import java.util.Locale;

/* compiled from: H7RN */
/* renamed from: l.᩵ۖ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC19173 {
    ALWAYS,
    LEGACY,
    NONEMPTY;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC19173 m44252(C11781 c11781) {
        String m28825 = c11781.m28825(EnumC0121.f1201);
        if (m28825 == null) {
            return LEGACY;
        }
        return valueOf(m28825.toUpperCase(Locale.US));
    }
}
