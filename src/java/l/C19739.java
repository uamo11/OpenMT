package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 618F */
/* renamed from: l.᩵᩸ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19739 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f63769;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5242 f63770 = new C5242();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f63771;

    /* JADX WARN: Removed duplicated region for block: B:11:0x018b A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:107:0x001e, B:108:0x002e, B:110:0x0034, B:113:0x0042, B:115:0x004e, B:118:0x005a, B:81:0x0081, B:82:0x00bc, B:84:0x00c2, B:87:0x00d2, B:92:0x00e2, B:95:0x00f6, B:63:0x0106, B:65:0x013c, B:67:0x015e, B:69:0x0166, B:73:0x016e, B:11:0x018b, B:12:0x0190, B:14:0x0196, B:47:0x01a8, B:18:0x01ae, B:43:0x01ba, B:21:0x01be, B:23:0x01c2, B:26:0x01ca, B:38:0x01d5, B:35:0x01f2, B:31:0x01f6, B:50:0x022d, B:52:0x0231, B:54:0x023b, B:56:0x0250, B:61:0x0243, B:79:0x0186, B:105:0x0101, B:127:0x007b), top: B:3:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List m45452(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19739.m45452(java.lang.String):java.util.List");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45450(Main main, C5624 c5624) {
        f63770.m1668(main, c5624);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45448() {
        return f63771;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m45451() {
        ArrayList arrayList = f63769;
        return arrayList != null ? arrayList : m45452(null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4216 m45449(String str) {
        if (str.startsWith("/data") || str.startsWith("/system") || str.startsWith("/proc")) {
            return null;
        }
        ArrayList arrayList = (ArrayList) m45451();
        if (arrayList.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4216 c4216 = (C4216) it.next();
            if (lowerCase.startsWith(c4216.f13685)) {
                return c4216;
            }
        }
        return null;
    }
}
