package l;

import java.util.HashMap;

/* compiled from: Y5QT */
/* renamed from: l.᩹ۗ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22009 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70561 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f70562;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49531(String str) {
        Integer num = (Integer) f70562.get(str);
        if (num == null) {
            throw new C15431(null, "Invalid verification error: %s", str);
        }
        return num.intValue();
    }

    static {
        HashMap hashMap = new HashMap();
        f70562 = hashMap;
        C12354.m29971(1, hashMap, "generic-error", 2, "no-such-class");
        C12354.m29971(3, hashMap, "no-such-field", 4, "no-such-method");
        C12354.m29971(5, hashMap, "illegal-class-access", 6, "illegal-field-access");
        C12354.m29971(7, hashMap, "illegal-method-access", 8, "class-change-error");
        hashMap.put("instantiation-error", 9);
    }
}
