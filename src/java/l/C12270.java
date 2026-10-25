package l;

import java.util.Date;

/* compiled from: 54FE */
/* renamed from: l.۫۟᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12270 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f36547;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f36548;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Date f36549;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f36550;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18621 f36551;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f36552;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f36553;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f36554;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Date f36555;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Date f36556;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8743 f36557;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f36558;

    public C12270(long j, C8743 c8743, C18621 c18621) {
        this.f36547 = -1;
        this.f36558 = j;
        this.f36557 = c8743;
        this.f36551 = c18621;
        if (c18621 != null) {
            this.f36550 = c18621.m43175();
            this.f36548 = c18621.m43179();
            C10338 m43180 = c18621.m43180();
            int m26139 = m43180.m26139();
            for (int i = 0; i < m26139; i++) {
                String m26136 = m43180.m26136(i);
                String m26140 = m43180.m26140(i);
                if ("Date".equalsIgnoreCase(m26136)) {
                    this.f36549 = C5033.m14545(m26140);
                    this.f36553 = m26140;
                } else if ("Expires".equalsIgnoreCase(m26136)) {
                    this.f36556 = C5033.m14545(m26140);
                } else if ("Last-Modified".equalsIgnoreCase(m26136)) {
                    this.f36555 = C5033.m14545(m26140);
                    this.f36552 = m26140;
                } else if ("ETag".equalsIgnoreCase(m26136)) {
                    this.f36554 = m26140;
                } else if ("Age".equalsIgnoreCase(m26136)) {
                    this.f36547 = C0799.m3015(-1, m26140);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b4, code lost:
    
        if (r14 > 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.ۡ۟᩵, l.ᩴ۟᩵] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C10154 m29804() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12270.m29804():l.ۤ۟᩵");
    }
}
