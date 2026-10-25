package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: C1US */
/* renamed from: l.ۖ۬ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2551 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116 A[Catch: Exception -> 0x0132, LOOP:1: B:34:0x0110->B:36:0x0116, LOOP_END, TryCatch #3 {Exception -> 0x0132, blocks: (B:2:0x0000, B:5:0x0037, B:8:0x0041, B:10:0x0049, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:19:0x0065, B:22:0x006d, B:33:0x0108, B:34:0x0110, B:36:0x0116, B:43:0x012c, B:46:0x0088, B:48:0x0090, B:49:0x0095, B:51:0x009b, B:54:0x00a5, B:57:0x00ac, B:60:0x00b4, B:71:0x00c9, B:72:0x00ce, B:74:0x00d4, B:77:0x00de, B:80:0x00e5, B:83:0x00ed), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x0132, blocks: (B:2:0x0000, B:5:0x0037, B:8:0x0041, B:10:0x0049, B:11:0x004e, B:13:0x0054, B:16:0x005e, B:19:0x0065, B:22:0x006d, B:33:0x0108, B:34:0x0110, B:36:0x0116, B:43:0x012c, B:46:0x0088, B:48:0x0090, B:49:0x0095, B:51:0x009b, B:54:0x00a5, B:57:0x00ac, B:60:0x00b4, B:71:0x00c9, B:72:0x00ce, B:74:0x00d4, B:77:0x00de, B:80:0x00e5, B:83:0x00ed), top: B:1:0x0000 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C15955 m8086() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2551.m8086():l.ܺ۬ܳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8085(String str) {
        if (str.endsWith("K")) {
            return (long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f);
        }
        if (str.endsWith("M")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
        if (str.endsWith("G")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * 1048576;
        }
        if (str.endsWith("T")) {
            return ((long) (Float.parseFloat(str.substring(0, str.length() - 1)) * 1024.0f)) * 1073741824;
        }
        return Long.parseLong(str);
    }
}
