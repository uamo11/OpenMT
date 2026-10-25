package l;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: P8HP */
/* renamed from: l.֨ۡۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1016 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f3745 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f3744 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f3743 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18656 m3527(String str) {
        try {
            return m3528(str);
        } catch (NumberFormatException | C9080 | XmlPullParserException unused) {
            C19956.m46037("Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L22;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18656 m3528(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = l.C18420.m42843(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld0
            l.ܳ۬ܺ r2 = l.AbstractC14545.of()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = l.C18420.m42843(r0, r8)
            if (r8 == 0) goto L9c
            r2 = 0
            r6 = 0
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc9
            java.lang.String[] r8 = l.C1016.f3745
            r8 = r8[r6]
            java.lang.String r8 = l.C18420.m42841(r0, r8)
            if (r8 == 0) goto L99
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc9
            r6 = 0
        L4a:
            if (r6 >= r7) goto L64
            java.lang.String[] r8 = l.C1016.f3744
            r8 = r8[r6]
            java.lang.String r8 = l.C18420.m42841(r0, r8)
            if (r8 == 0) goto L61
            long r6 = java.lang.Long.parseLong(r8)
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L65
            goto L64
        L61:
            int r6 = r6 + 1
            goto L4a
        L64:
            r6 = r4
        L65:
            r8 = 2
            if (r2 >= r8) goto L94
            java.lang.String[] r8 = l.C1016.f3743
            r8 = r8[r2]
            java.lang.String r8 = l.C18420.m42841(r0, r8)
            if (r8 == 0) goto L91
            long r11 = java.lang.Long.parseLong(r8)
            l.ۘۡۧ r2 = new l.ۘۡۧ
            r15 = 0
            r17 = 0
            java.lang.String r14 = "image/jpeg"
            r13 = r2
            r13.<init>(r14, r15, r17)
            l.ۘۡۧ r8 = new l.ۘۡۧ
            java.lang.String r10 = "video/mp4"
            r13 = 0
            r9 = r8
            r9.<init>(r10, r11, r13)
            l.ܳ۬ܺ r2 = l.AbstractC14545.of(r2, r8)
            goto Lbd
        L91:
            int r2 = r2 + 1
            goto L65
        L94:
            l.ܳ۬ܺ r2 = l.AbstractC14545.of()
            goto Lbd
        L99:
            int r6 = r6 + 1
            goto L35
        L9c:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = l.C18420.m42843(r0, r8)
            if (r8 == 0) goto Lad
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            l.ܳ۬ܺ r2 = m3526(r0, r2, r8)
            goto Lbd
        Lad:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = l.C18420.m42843(r0, r8)
            if (r8 == 0) goto Lbd
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            l.ܳ۬ܺ r2 = m3526(r0, r2, r8)
        Lbd:
            boolean r8 = l.C18420.m42842(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lca
        Lc9:
            return r3
        Lca:
            l.ᩴۡۧ r0 = new l.ᩴۡۧ
            r0.<init>(r6, r2)
            return r0
        Ld0:
            java.lang.String r0 = "Couldn't find xmp metadata"
            l.ۡ᩵֫ r0 = l.C9080.m23440(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1016.m3528(java.lang.String):l.ᩴۡۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m3526(XmlPullParser xmlPullParser, String str, String str2) {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C18420.m42843(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String m42841 = C18420.m42841(xmlPullParser, concat3);
                String m428412 = C18420.m42841(xmlPullParser, concat4);
                String m428413 = C18420.m42841(xmlPullParser, concat5);
                String m428414 = C18420.m42841(xmlPullParser, concat6);
                if (m42841 == null || m428412 == null) {
                    return AbstractC14545.of();
                }
                c1846.m16264(new C3839(m42841, m428413 != null ? Long.parseLong(m428413) : 0L, m428414 != null ? Long.parseLong(m428414) : 0L));
            }
        } while (!C18420.m42842(xmlPullParser, concat2));
        return c1846.m6131();
    }
}
