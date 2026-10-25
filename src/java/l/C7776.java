package l;

/* compiled from: 07FG */
/* renamed from: l.۟᩺ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7776 extends C1860 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f24025;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f24026;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f24027;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f24028;

    static {
        StringBuilder sb = new StringBuilder();
        EnumC15204 enumC15204 = EnumC15204.f46586;
        sb.append(enumC15204.m35967());
        EnumC15204 enumC152042 = EnumC15204.f46504;
        sb.append(enumC152042.m35967());
        EnumC15204 enumC152043 = EnumC15204.f46492;
        sb.append(enumC152043.m35967());
        EnumC15204 enumC152044 = EnumC15204.f46449;
        sb.append(enumC152044.m35967());
        sb.append(EnumC15204.f46482.m35967());
        String sb2 = sb.toString();
        f24027 = sb2;
        String str = enumC15204.m35967() + enumC152042.m35967() + enumC152043.m35967() + enumC152044.m35967() + EnumC15204.f46530.m35967();
        f24025 = str;
        f24026 = sb2.length();
        f24028 = str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cc, code lost:
    
        r22.f6339.m11951(r22.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fd, code lost:
    
        return r13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m20804(boolean r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7776.m20804(boolean):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20803(String str, int i, String str2, String str3, short s, short s2, short s3) {
        if (str.length() != i) {
            this.f6339.m11951(this.f6341.f20363, "The table header is incorrect; \"Start Length Slot Name {0}\" is expected", str3);
            throw null;
        }
        if (s == -1) {
            this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"start_pc\"");
            throw null;
        }
        if (s2 == -1) {
            this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"length\"");
            throw null;
        }
        if (s3 != -1) {
            return;
        }
        this.f6339.m11951(this.f6341.f20363, "The {0} format is incorrect; {1} is expected", str2, "\"slot\"");
        throw null;
    }
}
