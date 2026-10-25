package l;

import android.text.TextUtils;

/* compiled from: 179R */
/* renamed from: l.᩶ۗ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19911 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45803() {
        int i = ApplicationC20075.f65008.getInt("amsl", 5);
        if (i < 1 || i > 100) {
            return 5;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16955 m45806() {
        String string = ApplicationC20075.f65008.getString("amsk", "");
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        EnumC8139 enumC8139 = EnumC8139.V1_V2_V3;
        int i = interfaceC12344.getInt("amss", enumC8139.ordinal());
        EnumC8139[] values = EnumC8139.values();
        if (i >= 0 && i < values.length) {
            enumC8139 = values[i];
        }
        return m45804(new C16955(string, enumC8139, ApplicationC20075.f65008.getString("amv1sf", null), ApplicationC20075.f65008.getBoolean("amkv1sd", false)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45807(C16955 c16955) {
        C16955 m45804 = m45804(c16955);
        InterfaceC13049 putBoolean = ApplicationC20075.f65008.edit().putString("amsk", m45804.m39780()).mo25853(m45804.m39781().ordinal(), "amss").putBoolean("amkv1sd", m45804.m39778());
        if (m45804.m39779() == null) {
            putBoolean.remove("amv1sf");
        } else {
            putBoolean.putString("amv1sf", m45804.m39779());
        }
        putBoolean.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (l.C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120aa3).equals(r0) != false) goto L7;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16955 m45804(l.C16955 r4) {
        /*
            java.lang.String r0 = r4.m39780()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto Ld
            goto L21
        Ld:
            l.ܶܿᩳ r1 = l.C15378.m36415()
            r1.getClass()
            r1 = 2131888803(0x7f120aa3, float:1.9412252E38)
            java.lang.String r1 = l.C4925.m14327(r1)
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L22
        L21:
            r0 = r2
        L22:
            java.lang.String r1 = r4.m39779()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L2e
            r1 = 0
            goto L32
        L2e:
            java.lang.String r1 = r4.m39779()
        L32:
            l.ܽ᩺ܽ r2 = new l.ܽ᩺ܽ
            l.۠ۧᩳ r3 = r4.m39781()
            boolean r4 = r4.m39778()
            r2.<init>(r0, r3, r1, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19911.m45804(l.ܽ᩺ܽ):l.ܽ᩺ܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45805(String str) {
        Integer num = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                int parseInt = Integer.parseInt(str.trim());
                boolean z = true;
                if (parseInt < 1 || parseInt > 100) {
                    z = false;
                }
                if (z) {
                    num = Integer.valueOf(parseInt);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (num != null) {
            ApplicationC20075.f65008.edit().mo25853(num.intValue(), "amsl").apply();
        }
    }
}
