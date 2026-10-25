package l;

import android.os.Build;
import java.io.File;

/* compiled from: 898C */
/* renamed from: l.ۨᩴܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11893 extends C15587 {
    @Override // l.C15587, l.AbstractC15440
    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo29016() {
        return false;
    }

    @Override // l.C15587, l.AbstractC15440
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo29017(InterfaceC17066 interfaceC17066) {
        return false;
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final String m29018() {
        return this.f48020.getPath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if ("Android/obb".equalsIgnoreCase(r1) == false) goto L17;
     */
    @Override // l.C15587, l.AbstractC15440
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mo23549(final boolean r5) {
        /*
            r4 = this;
            java.io.File r0 = r4.f48020
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto Le
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        Le:
            boolean r1 = l.C16999.m39886()
            if (r1 == 0) goto L43
            java.lang.String r1 = r4.mo23554()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r1.toLowerCase(r2)
            java.lang.String r3 = "/android/data"
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L2e
            java.lang.String r3 = "/android/obb"
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L43
        L2e:
            java.lang.String r1 = l.C16999.m39859(r1)
            java.lang.String r2 = "Android/data"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 != 0) goto L44
            java.lang.String r2 = "Android/obb"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            l.ܿ᩺ᩴ r0 = l.C22311.stream(r0)
            l.ۤᩴܿ r2 = new l.ۤᩴܿ
            r2.<init>()
            l.ܿ᩺ᩴ r5 = r0.filter(r2)
            l.ۛᩴܿ r0 = new l.ۛᩴܿ
            r2 = 0
            r0.<init>(r2, r1)
            l.ܿ᩺ᩴ r5 = r5.map(r0)
            l.ۨۨᩴ r0 = l.C22976.toList()
            java.lang.Object r5 = r5.collect(r0)
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11893.mo23549(boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ AbstractC15440 m29014(File file, String str) {
        AbstractC15440 abstractC15440;
        if (str == null || Build.VERSION.SDK_INT < 30) {
            abstractC15440 = C16999.m39866(m29015(file.getPath()), new String[0]);
        } else {
            String m29015 = m29015(file.getPath());
            boolean isDirectory = file.isDirectory();
            C4527 c4527 = new C4527(isDirectory ? -1L : file.length(), file.lastModified(), isDirectory);
            File file2 = new File(m29015);
            StringBuilder m19190 = C7166.m19190(str, "/");
            m19190.append(file.getName());
            abstractC15440 = C16999.m39865(file2, m19190.toString(), c4527);
        }
        return abstractC15440 instanceof InterfaceC21855 ? ((InterfaceC21855) abstractC15440).mo27913() : abstractC15440;
    }

    @Override // l.C15587, l.AbstractC15440
    public final String getName() {
        String name = this.f48020.getName();
        return name.equals("\u200bAndroid") ? "Android" : name;
    }

    @Override // l.C15587, l.AbstractC15440
    /* renamed from: ܺ֫ */
    public final String mo23554() {
        return m29015(this.f48020.getPath());
    }

    @Override // l.C15587, l.AbstractC15440
    public final String getParent() {
        return m29015(this.f48020.getParent());
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m29015(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("\u200bAndroid");
        if (indexOf < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf));
        sb.append("Android");
        return C20087.m46305(indexOf + 8, str, sb);
    }
}
