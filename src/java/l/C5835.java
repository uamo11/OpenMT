package l;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R147 */
/* renamed from: l.ۛۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5835 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7246 f17887;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f17888;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f17889;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Path f17890;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7246 f17891;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16376 f17893;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f17894;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f17895 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f17896 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public RectF f17892 = new RectF();

    public C5835(C16376 c16376, C7246 c7246, C7246 c72462, int i) {
        this.f17893 = c16376;
        this.f17891 = c7246;
        this.f17887 = c72462;
        this.f17889 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16346(String str, String str2) {
        this.f17888 = str;
        this.f17894 = str2;
        Path m34681 = C14533.m34681(str2);
        this.f17890 = m34681;
        m34681.computeBounds(this.f17892, true);
        ArrayList arrayList = this.f17895;
        arrayList.clear();
        ArrayList arrayList2 = this.f17896;
        arrayList2.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C17356 c17356 : C14533.m34679(str)) {
            float[] m40687 = c17356.m40687();
            char m40688 = c17356.m40688();
            if (m40688 == 'C') {
                for (int i = 0; i < m40687.length; i += 6) {
                    Path path = new Path();
                    path.moveTo(f, f2);
                    int i2 = i + 4;
                    int i3 = i + 5;
                    path.cubicTo(m40687[i], m40687[i + 1], m40687[i + 2], m40687[i + 3], m40687[i2], m40687[i3]);
                    arrayList.add(path);
                    f = m40687[i2];
                    f2 = m40687[i3];
                }
            } else if (m40688 == 'M') {
                if (m40687.length != 2) {
                    throw new RuntimeException(str);
                }
                f = m40687[0];
                f2 = m40687[1];
            } else {
                throw new RuntimeException(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Path path2 = (Path) it.next();
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            arrayList2.add(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ff A[EDGE_INSN: B:24:0x00ff->B:25:0x00ff BREAK  A[LOOP:0: B:16:0x00d2->B:22:0x00fc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16345(android.graphics.Canvas r18, l.C1539 r19, android.graphics.RectF r20, float r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5835.m16345(android.graphics.Canvas, l.֫ۖܽ, android.graphics.RectF, float):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5835.class != obj.getClass()) {
            return false;
        }
        C5835 c5835 = (C5835) obj;
        if (this.f17891.equals(c5835.f17891)) {
            return this.f17887.equals(c5835.f17887);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17891.f22229 * 31) + this.f17887.f22229;
    }

    public C5835(C16376 c16376, C12951 c12951) {
        this.f17893 = c16376;
        ArrayList arrayList = c16376.f50393;
        this.f17891 = (C7246) arrayList.get(c12951.readInt());
        this.f17887 = (C7246) arrayList.get(c12951.readInt());
        this.f17889 = c12951.readInt();
        if (c12951.readByte() != 0) {
            m16346(c12951.m31506(), c12951.m31506());
        }
    }
}
