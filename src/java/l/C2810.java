package l;

import java.util.HashSet;

/* compiled from: 9981 */
/* renamed from: l.ۖ᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C2810 extends C13425 {
    @Override // l.C13425, l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        C6337 m29289;
        int i = 0;
        try {
            return super.mo2780();
        } finally {
            String[] m11558 = m11558("ARG_PATHS");
            HashSet hashSet = new HashSet();
            int length = m11558.length;
            while (i < length) {
                String str = m11558[i];
                if (str.startsWith("$RECYCLE.BIN$/") && (m29289 = C11982.m29289(str.substring(14))) != null) {
                    hashSet.add(m29289.m17613());
                }
                i++;
            }
            C21939.m49414(hashSet);
        }
    }
}
