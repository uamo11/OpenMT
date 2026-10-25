package l;

import java.text.SimpleDateFormat;

/* compiled from: N12S */
/* renamed from: l.᩻֡ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23346 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m51761(C16560 c16560, int i, String str) {
        return c16560.m38993(C4925.m14327(i) + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(System.currentTimeMillis())) + "." + str, true);
    }
}
