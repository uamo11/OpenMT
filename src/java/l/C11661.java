package l;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: K1EG */
/* renamed from: l.ۨۧۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11661 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28544(ArrayList arrayList, AbstractC15440 abstractC15440, C6016 c6016, C8182 c8182) {
        boolean mo23120 = abstractC15440.mo23120();
        try {
            m28546(arrayList, abstractC15440, c6016, c8182);
        } catch (Throwable th) {
            if (!mo23120) {
                abstractC15440.mo23552();
            } else {
                abstractC15440.m36526("dex").mo23552();
            }
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215 A[Catch: Exception -> 0x0253, TryCatch #7 {Exception -> 0x0253, blocks: (B:100:0x0177, B:85:0x0210, B:87:0x0215, B:90:0x021f, B:72:0x019d, B:74:0x01a4, B:75:0x01ca, B:78:0x01d1, B:80:0x01e6, B:82:0x01e9, B:83:0x01f8, B:37:0x022c), top: B:99:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f A[Catch: Exception -> 0x0253, TryCatch #7 {Exception -> 0x0253, blocks: (B:100:0x0177, B:85:0x0210, B:87:0x0215, B:90:0x021f, B:72:0x019d, B:74:0x01a4, B:75:0x01ca, B:78:0x01d1, B:80:0x01e6, B:82:0x01e9, B:83:0x01f8, B:37:0x022c), top: B:99:0x0177 }] */
    /* JADX WARN: Type inference failed for: r8v10, types: [l.۬ۛ֡] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [l.۬ۛ֡] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m28546(java.util.ArrayList r31, l.AbstractC15440 r32, l.C6016 r33, l.C8182 r34) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11661.m28546(java.util.ArrayList, l.ܶ᩵ܿ, l.ۛۧۢ, l.۠۫᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28545(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '/' && (i = i + 1) >= 12) {
                return true;
            }
        }
        return false;
    }
}
