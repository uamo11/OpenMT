package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: S97P */
/* renamed from: l.ۨ᩸᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11982 extends AbstractC13921 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C11982 f35872 = new C11982();

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
    }

    @Override // l.AbstractC13921
    /* renamed from: ܽ */
    public final String mo7654() {
        return "trash";
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        if (z) {
            C21939.m49415();
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433().mo27926();
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        C6337 m29289 = m29289(str);
        if (m29289 == null) {
            return null;
        }
        boolean endsWith = str.endsWith("/");
        C12687 c12687 = new C12687(m29289.m17612(), C9523.m24406(str));
        if (c12687.isDirectory() != endsWith) {
            return null;
        }
        return c12687;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("trash".getBytes());
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String m39731 = AbstractC16891.m39731(str);
        int i = 0;
        if (str.equals("/") || str.isEmpty()) {
            List m49422 = C21939.m49422();
            ArrayList arrayList = new ArrayList(m49422.size());
            int size = m49422.size();
            while (i < size) {
                arrayList.add(new C12687((C21234) m49422.get(i)));
                i++;
            }
            return arrayList;
        }
        C6337 m29289 = m29289(str);
        if (m29289 == null) {
            return new ArrayList();
        }
        List mo23549 = m29289.m17612().mo23549(true);
        ArrayList arrayList2 = new ArrayList(mo23549.size());
        int size2 = mo23549.size();
        while (i < size2) {
            arrayList2.add(new C12687((AbstractC15440) mo23549.get(i), m39731));
            i++;
        }
        return arrayList2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C6337 m29289(String str) {
        boolean startsWith = str.startsWith("/");
        int indexOf = str.indexOf(47, startsWith ? 1 : 0);
        if (indexOf == -1) {
            return null;
        }
        return new C6337(str.substring(startsWith ? 1 : 0, indexOf), str.substring(indexOf));
    }
}
