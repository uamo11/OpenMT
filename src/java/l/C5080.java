package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: M7EX */
/* renamed from: l.ۚۗۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5080 extends AbstractC13546 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15962;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f15963;

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[Catch: all -> 0x0119, TryCatch #1 {, blocks: (B:4:0x0005, B:10:0x0010, B:11:0x002e, B:13:0x0035, B:15:0x004c, B:18:0x0055, B:19:0x006c, B:20:0x0076, B:22:0x007c, B:24:0x008f, B:25:0x0097, B:28:0x00a0, B:35:0x00a3, B:31:0x00ab, B:41:0x00d2, B:43:0x00d7, B:46:0x00e4, B:49:0x00f4, B:51:0x0107, B:60:0x0118, B:53:0x0108, B:54:0x0113), top: B:3:0x0005, inners: #0 }] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int m14628() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5080.m14628():int");
    }

    public C5080(C21596 c21596) {
        super("jasm", c21596);
        this.f15963 = new HashMap();
        this.f15962 = new ArrayList();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14627(long j, String str, Object... objArr) {
        EnumC21309 enumC21309 = EnumC21309.WARNING;
        String m32594 = AbstractC13546.m32594(str, objArr);
        m14622(j, m32594 == null ? new C22719(EnumC21309.ERROR, null) : new C22719(enumC21309, m32594));
    }

    @Override // l.AbstractC13546, l.InterfaceC2964
    /* renamed from: ֫ */
    public final void mo9065(long j, String str, Object... objArr) {
        EnumC21309 enumC21309 = EnumC21309.ERROR;
        String m32594 = AbstractC13546.m32594(str, objArr);
        m14622(j, m32594 == null ? new C22719(enumC21309, null) : new C22719(enumC21309, m32594));
    }

    @Override // l.AbstractC13546
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo14626(String str, Object... objArr) {
        return AbstractC13546.m32594(str, objArr);
    }

    @Override // l.AbstractC13546
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14625(InterfaceC23712 interfaceC23712) {
        super.mo14625(interfaceC23712);
        ArrayList arrayList = this.f15962;
        arrayList.clear();
        arrayList.addAll(interfaceC23712.mo6120());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14623(long j, long j2) {
        return (j2 & 4294967295L) - ((C5378.stream(this.f15962.subList(0, ((int) j) - 1)).mapToInt(new C15318()).sum() + j) - 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14624(EnumC21309 enumC21309) {
        HashMap hashMap = this.f15963;
        if (hashMap.isEmpty()) {
            return 0L;
        }
        return C5378.stream(hashMap.values()).flatMap(new C3433(5)).filter(new C0235(1, enumC21309)).count();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m14629() {
        return this.f15963.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14621(InterfaceC1134 interfaceC1134, C6491 c6491) {
        int longValue = (int) (((Long) c6491.f20042).longValue() - 1);
        long longValue2 = ((Long) c6491.f20042).longValue();
        ArrayList arrayList = this.f15962;
        boolean z = longValue2 > ((long) arrayList.size());
        String str = (String) arrayList.get(Math.min(arrayList.size() - 1, longValue));
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\t') {
                j++;
            }
        }
        String replace = str.replace("\t", InterfaceC2964.f9410);
        long length = z ? replace.length() : ((r2.length() * j) + ((Long) c6491.f20043).longValue()) - j;
        interfaceC1134.mo1973(replace);
        StringBuilder sb = new StringBuilder();
        int i2 = (int) length;
        sb.append(i2 <= 0 ? "" : new String(new char[i2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, " "));
        sb.append("^");
        interfaceC1134.mo1973(sb.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14622(long j, C22719 c22719) {
        String m28250;
        if (j != 2147483647L && this.f15962.isEmpty()) {
            EnumC21309 enumC21309 = EnumC21309.ERROR;
            m14620(2147483647L, new C22719(enumC21309, EnumC11431.LONG.m28251(enumC21309, m32595(), "Content of the file %s not found", m32598())));
            j = 2147483647L;
        }
        EnumC21309 m50754 = c22719.m50754();
        if (j == 2147483647L) {
            m28250 = EnumC11431.VERBOSE.m28250(m32595(), c22719);
        } else {
            m28250 = EnumC11431.LONG.m28250(m32595(), c22719);
        }
        m14620(j, new C22719(m50754, m28250));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14620(long j, C22719 c22719) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.f15963;
        Set set = (Set) hashMap.get(valueOf);
        if (set != null) {
            set.add(c22719);
            return;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(c22719);
        hashMap.put(Long.valueOf(j), hashSet);
    }
}
