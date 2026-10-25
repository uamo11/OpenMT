package l;

import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: H78K */
/* renamed from: l.ۜ᩻ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7092 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8420 f21796;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18920 m19091(C19626 c19626) {
        if (c19626 == null) {
            return new C18920(false, null);
        }
        try {
            C23326 m45090 = c19626.m45090();
            m45090.mo14956();
            for (InterfaceC4277 interfaceC4277 : m45090.mo21936()) {
                interfaceC4277.mo12851();
                Iterator it = interfaceC4277.mo12850().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0748) it.next()).mo2878();
                }
            }
            return new C18920(true, null);
        } catch (Exception e) {
            return new C18920(false, e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage());
        }
    }

    public C7092(C8420 c8420, C9915 c9915) {
        this.f21796 = c8420;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18381 m19090(C18090 c18090) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = c18090.getEntry("AndroidManifest.xml") != null;
        boolean z4 = c18090.getEntry("resources.arsc") != null;
        Iterator it = c18090.m42194().iterator();
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            if (!c3545.isDirectory()) {
                arrayList.add(C13874.m33236(c3545));
            }
        }
        try {
            z = !c18090.m42190(true).isEmpty();
        } catch (IOException unused) {
            z = false;
        }
        if (z3 && (z || z4)) {
            z2 = true;
        }
        return new C18381(arrayList, z2);
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0088: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:60:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C14852 m19097(l.AbstractC15440 r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Not an APK"
            java.lang.String r1 = "NOT_APK"
            l.۠᩷ۜ r2 = r11.f21796
            r3 = 0
            r4 = 0
            l.ᩳܰۡ r5 = new l.ᩳܰۡ     // Catch: java.lang.Exception -> L8a l.C3059 -> Lb1
            r5.<init>(r12)     // Catch: java.lang.Exception -> L8a l.C3059 -> Lb1
            l.ᩳ᩻ۜ r6 = m19090(r5)     // Catch: java.lang.Throwable -> L7a
            boolean r7 = r6.f57098     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto L75
            l.᩶ۨ᩻ r7 = l.C3224.m9893(r5)     // Catch: java.lang.Throwable -> L71
            java.lang.String r8 = r7.f65279     // Catch: java.lang.Throwable -> L71
            l.C18041.m42095(r8)     // Catch: java.lang.Throwable -> L71
            l.ܶ᩵ܿ r8 = r2.m22054()     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = "original.apk"
            l.ܶ᩵ܿ r9 = r8.m36526(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = l.C8420.m22039(r5, r9)     // Catch: java.lang.Throwable -> L6f
            l.֡᩷ۜ r12 = r11.m19088(r8, r12, r9, r13)     // Catch: java.lang.Throwable -> L6f
            r11.m19095(r5, r12)     // Catch: java.lang.Throwable -> L6f
            r11.m19092(r5, r12)     // Catch: java.lang.Throwable -> L6f
        L36:
            r13 = 100
            if (r4 >= r13) goto L67
            java.lang.String r13 = r2.m22056()     // Catch: java.lang.Throwable -> L6f
            l.֡᩷ۜ r9 = m19087(r12, r8, r13)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r10 = r9.f2550     // Catch: java.lang.Throwable -> L6f
            l.C8420.m22043(r8, r9)     // Catch: java.lang.Throwable -> L6f
            boolean r13 = r2.m22055(r8, r13)     // Catch: java.lang.Throwable -> L6f
            if (r13 == 0) goto L64
            l.ܶ᩵ܿ r12 = r2.m22059(r10)     // Catch: java.lang.Throwable -> L6f
            l.֡᩷ۜ r12 = m19087(r9, r12, r10)     // Catch: java.lang.Throwable -> L6f
            l.ܳ᩻ۜ r13 = r11.m19089(r12, r6, r7)     // Catch: java.lang.Throwable -> L6f
            long r6 = r12.f2549     // Catch: java.lang.Throwable -> L6f
            r13.f45305 = r6     // Catch: java.lang.Throwable -> L6f
            r5.close()     // Catch: java.lang.Exception -> L61 l.C3059 -> L87
            return r13
        L61:
            r12 = move-exception
            r4 = 1
            goto L8c
        L64:
            int r4 = r4 + 1
            goto L36
        L67:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = "Unable to publish workspace"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L6f
            throw r12     // Catch: java.lang.Throwable -> L6f
        L6f:
            r12 = move-exception
            goto L73
        L71:
            r12 = move-exception
            r8 = r3
        L73:
            r4 = 1
            goto L7c
        L75:
            l.ۗۛ᩻ r12 = l.C3059.m9368(r1, r0)     // Catch: java.lang.Throwable -> L7a
            throw r12     // Catch: java.lang.Throwable -> L7a
        L7a:
            r12 = move-exception
            r8 = r3
        L7c:
            r5.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r13 = move-exception
            r12.addSuppressed(r13)     // Catch: java.lang.Exception -> L85 l.C3059 -> L87
        L84:
            throw r12     // Catch: java.lang.Exception -> L85 l.C3059 -> L87
        L85:
            r12 = move-exception
            goto L8c
        L87:
            r12 = move-exception
            r3 = r8
            goto Lb2
        L8a:
            r12 = move-exception
            r8 = r3
        L8c:
            if (r8 == 0) goto L94
            l.C8420.m22045(r8)
            l.C15972.m37753()
        L94:
            if (r4 == 0) goto Lac
            java.lang.String r13 = r12.getMessage()
            if (r13 != 0) goto L9f
            java.lang.String r12 = "Failed to create workspace."
            goto La3
        L9f:
            java.lang.String r12 = r12.getMessage()
        La3:
            java.lang.String r13 = "WORKSPACE_CREATE_FAILED"
            java.lang.String r0 = "fatal"
            l.ۗۛ᩻ r12 = l.C3059.m9367(r3, r13, r12, r0)
            throw r12
        Lac:
            l.ۗۛ᩻ r12 = l.C3059.m9368(r1, r0)
            throw r12
        Lb1:
            r12 = move-exception
        Lb2:
            if (r3 == 0) goto Lba
            l.C8420.m22045(r3)
            l.C15972.m37753()
        Lba:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7092.m19097(l.ܶ᩵ܿ, boolean):l.ܳ᩻ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0658 m19088(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, String str, boolean z) {
        C0658 c0658 = new C0658(abstractC15440, "");
        c0658.f2540 = z;
        c0658.f2546 = C12301.m29847(abstractC154402.mo23544(), "sourcePath");
        c0658.f2539 = abstractC154402.mo23127();
        c0658.f2542 = abstractC154402.mo23117();
        c0658.f2548 = str;
        long currentTimeMillis = System.currentTimeMillis();
        c0658.f2538 = currentTimeMillis;
        c0658.f2549 = currentTimeMillis;
        return c0658;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0658 m19087(C0658 c0658, AbstractC15440 abstractC15440, String str) {
        C0658 c06582 = new C0658(abstractC15440, str);
        c06582.f2540 = c0658.f2540;
        c06582.f2546 = c0658.f2546;
        c06582.f2539 = c0658.f2539;
        c06582.f2542 = c0658.f2542;
        c06582.f2548 = c0658.f2548;
        c06582.f2538 = c0658.f2538;
        c06582.f2549 = c0658.f2549;
        c06582.f2544.addAll(c0658.f2544);
        c06582.f2543 = c0658.f2543;
        c06582.f2545 = c0658.f2545;
        c06582.f2551 = c0658.f2551;
        c06582.f2552 = c0658.f2552;
        c06582.f2541 = c0658.f2541;
        return c06582;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19095(C18090 c18090, C0658 c0658) {
        C3545 entry = c18090.getEntry("resources.arsc");
        if (entry == null) {
            c0658.f2543 = "absent";
            c0658.f2545 = null;
            return;
        }
        AbstractC15440 abstractC15440 = c0658.f2547;
        int i = C8420.f25794;
        AbstractC15440 m36526 = abstractC15440.m36526("entries").m36526("resources.arsc");
        try {
            m36526.m36493(c18090.m42189(entry));
            c0658.f2551 = C8420.m22046(m36526);
            long mo23127 = m36526.mo23127();
            c0658.f2552 = mo23127;
            c0658.f2541 = true;
            try {
                C18920 m19091 = m19091(new C19626(mo23127, m36526, c0658.f2551));
                if (m19091.f59607) {
                    c0658.f2543 = "available";
                    c0658.f2545 = null;
                } else {
                    m19094(c0658);
                    c0658.f2543 = "parse_error";
                    c0658.f2545 = m19091.f59608;
                }
            } catch (Exception e) {
                m19094(c0658);
                c0658.f2543 = "parse_error";
                c0658.f2545 = e.getMessage() == null ? "Failed to parse resources.arsc" : e.getMessage();
            }
        } catch (Exception e2) {
            m36526.mo23552();
            m19094(c0658);
            c0658.f2543 = "extract_error";
            c0658.f2545 = e2.getMessage() == null ? "Failed to extract resources.arsc" : e2.getMessage();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19092(C18090 c18090, C0658 c0658) {
        ArrayList arrayList = c0658.f2544;
        AbstractC15440 abstractC15440 = c0658.f2547;
        arrayList.clear();
        boolean z = false;
        for (C3545 c3545 : c18090.m42190(true)) {
            String name = c3545.getName();
            if (z) {
                arrayList.add(new C19710(name, "skipped", "Skipped after previous dex error", null));
            } else {
                int i = C8420.f25794;
                AbstractC15440 m36526 = abstractC15440.m36526("entries").m36526(name);
                try {
                    m36526.m36493(c18090.m42189(c3545));
                    C14844.m35245(m36526, C8420.m22044(abstractC15440, name));
                    arrayList.add(new C19710(name, "available", null, "cache/dex/" + name + ".type_index"));
                } catch (Exception e) {
                    arrayList.add(new C19710(name, d.O, e.getMessage() == null ? "Failed to open dex" : e.getMessage(), null));
                    z = true;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14852 m19096(C0658 c0658) {
        try {
            C18090 c18090 = new C18090(c0658.f2547.m36526("original.apk"));
            try {
                C14852 m19089 = m19089(c0658, m19090(c18090), C3224.m9893(c18090));
                c18090.close();
                return m19089;
            } finally {
            }
        } catch (Exception unused) {
            throw C18081.m42149(c0658.f2546, c0658.f2540);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C14852 m19089(l.C0658 r23, l.C18381 r24, l.C20158 r25) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7092.m19089(l.֡᩷ۜ, l.ᩳ᩻ۜ, l.᩶ۨ᩻):l.ܳ᩻ۜ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19094(C0658 c0658) {
        if (c0658.f2551 != null || c0658.f2552 != -1) {
            c0658.f2541 = true;
        }
        c0658.f2551 = null;
        c0658.f2552 = -1L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m19093(AbstractC15440 abstractC15440) {
        InputStream mo27926 = abstractC15440.mo27926();
        try {
            int i = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            C0521 c0521 = new C0521(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
            byte[] bArr = new byte[8192];
            while (i > 0) {
                int read = mo27926.read(bArr, 0, Math.min(8192, i));
                if (read == -1) {
                    break;
                }
                c0521.write(bArr, 0, read);
                i -= read;
            }
            byte[] bArr2 = c0521.f2176;
            int length = bArr2.length;
            int i2 = c0521.f2177;
            if (length == i2) {
                if (mo27926 != null) {
                    mo27926.close();
                }
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr2, i2);
            if (mo27926 != null) {
                mo27926.close();
            }
            return copyOf;
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
