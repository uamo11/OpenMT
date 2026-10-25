package l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: H14L */
/* renamed from: l.۟ۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7246 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C11461 f22217 = new C11461();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RectF f22218;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f22219;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f22220;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f22221;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f22222;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16376 f22223;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22224;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f22225;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f22226;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Matrix f22227;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22228;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22229;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f22230;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f22231;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f22232;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f22233;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f22234;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f22235;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f22236;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f22237;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f22238;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19354(C11480 c11480) {
        if (c11480.f34287.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int m19360 = m19360();
        int i = m19355().f34288;
        int i2 = c11480.f34288;
        if (m19360 > i2 || i2 > i) {
            int i3 = this.f22232;
            ArrayList arrayList = this.f22237;
            List list = this.f22234;
            if (i3 == -1) {
                list.add(0, new C11480(-1, ""));
                arrayList.add(0, null);
                this.f22232 = 0;
            }
            C22768 c22768 = new C22768();
            list.add(this.f22232, c11480);
            arrayList.add(this.f22232, c22768);
            C21834 m35651 = C10069.f30268.m35651(C4900.f15473);
            int length = c11480.f34287.length();
            if (length != 0) {
                c22768.f73518.add(new C13595(length, m35651));
            }
            this.f22232++;
        }
    }

    public C7246(C16376 c16376, int i, ArrayList arrayList) {
        this.f22232 = -1;
        this.f22218 = new RectF();
        this.f22220 = C21943.m49431();
        this.f22228 = 0;
        this.f22227 = new Matrix();
        this.f22223 = c16376;
        this.f22229 = i;
        this.f22234 = arrayList;
        this.f22238 = new HashSet();
        if (arrayList.size() > 210) {
            int size = arrayList.size() / 2;
            arrayList.set(size - 100, new C11480(-1, "......"));
            arrayList.subList(size - 99, size + 100).clear();
        }
        int size2 = arrayList.size();
        boolean z = true;
        int i2 = 0;
        while (true) {
            String str = null;
            if (i2 >= size2) {
                break;
            }
            C11480 c11480 = (C11480) arrayList.get(i2);
            if (!c11480.f34287.isEmpty()) {
                if (c11480.f34287.startsWith(".sparse-switch") || c11480.f34287.startsWith(".packed-switch")) {
                    z = false;
                } else if (z) {
                    if (c11480.f34287.length() > 100) {
                        c11480.f34287 = C6554.m18061(100, c11480.f34287);
                    }
                    if (c11480.f34287.startsWith(":")) {
                        int indexOf = c11480.f34287.indexOf(32);
                        str = indexOf == -1 ? c11480.f34287 : c11480.f34287.substring(0, indexOf);
                    }
                    if (str != null) {
                        this.f22238.add(str);
                    }
                }
            }
            i2++;
        }
        this.f22237 = new ArrayList(arrayList.size());
        C17768 c17768 = new C17768();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11480 c114802 = (C11480) it.next();
            if (c114802.f34287.isEmpty()) {
                this.f22237.add(null);
            } else {
                C22768 c22768 = new C22768();
                this.f22237.add(c22768);
                try {
                    c17768.m41620(C10069.f30269.m51267(c114802.f34287, f22217).m9659());
                    while (c17768.m41625()) {
                        C21834 m41624 = c17768.m41624();
                        int m41622 = c17768.m41622();
                        int m41619 = c17768.m41619();
                        if (m41622 != m41619) {
                            c22768.f73518.add(new C13595(m41619, m41624));
                        }
                    }
                } catch (C8097 unused) {
                    C21834 m35661 = C10069.f30268.m35661();
                    int length = c114802.f34287.length();
                    if (length != 0) {
                        c22768.f73518.add(new C13595(length, m35661));
                    }
                }
                c22768.f73518.trimToSize();
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m19360() {
        return ((C11480) this.f22234.get(this.f22232 + 1)).f34288;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19352(Paint paint) {
        float fontSpacing = paint.getFontSpacing();
        List list = this.f22234;
        if (list.isEmpty()) {
            this.f22231 = 4.0f * fontSpacing;
            this.f22221 = (fontSpacing * 3.0f) + paint.measureText("EXIT");
            float measureText = paint.measureText("0") * 0.6f;
            this.f22236 = measureText;
            this.f22235 = measureText;
            this.f22222 = true;
            return;
        }
        this.f22231 = list.size() * fontSpacing;
        float measureText2 = paint.measureText("0");
        float length = (String.valueOf(((C11480) C7166.m19188(1, list)).f34288).length() + 1) * measureText2;
        this.f22235 = 0.7f * measureText2;
        this.f22236 = measureText2 * 0.5f;
        if (this.f22222) {
            this.f22221 = m19348(this.f22226, paint);
        } else {
            this.f22226 = 0;
            int size = list.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                float m19348 = m19348(i, paint);
                if (m19348 > f) {
                    this.f22226 = i;
                    f = m19348;
                }
            }
            this.f22221 = f;
            this.f22222 = true;
        }
        this.f22231 = (this.f22236 * 2.0f) + this.f22231;
        this.f22221 = (this.f22235 * 2.0f) + length + this.f22221;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19348(int i, Paint paint) {
        C11480 c11480 = (C11480) this.f22234.get(i);
        C22768 c22768 = (C22768) this.f22237.get(i);
        float f = 0.0f;
        if (!c11480.f34287.isEmpty() && c22768 != null) {
            Iterator it = c22768.f73518.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C13595 c13595 = (C13595) it.next();
                float measureText = paint.measureText(c11480.f34287, i2, c13595.f40543);
                c13595.f40544 = measureText;
                f += measureText;
                i2 = c13595.f40543;
            }
        }
        return f;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m19358() {
        if (!this.f22222) {
            throw new IllegalStateException("Need measure");
        }
        return this.f22221;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m19356() {
        if (!this.f22222) {
            throw new IllegalStateException("Need measure");
        }
        return this.f22231;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19350(float f, float f2, float f3, float f4) {
        this.f22225 = f;
        this.f22230 = f2;
        this.f22219 = f3;
        this.f22233 = f4;
        this.f22224 = true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m19357() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22225;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m19362() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22230;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m19359() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22219;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m19349() {
        if (!this.f22224) {
            throw new IllegalStateException("Need layout");
        }
        return this.f22233;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0422  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19351(android.graphics.Canvas r39, l.C1539 r40, l.C1539 r41, android.graphics.RectF r42, float r43) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7246.m19351(android.graphics.Canvas, l.֫ۖܽ, l.֫ۖܽ, android.graphics.RectF, float):void");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19361() {
        Iterator it = this.f22237.iterator();
        while (it.hasNext()) {
            C22768 c22768 = (C22768) it.next();
            if (c22768 != null) {
                Iterator it2 = c22768.f73518.iterator();
                while (it2.hasNext()) {
                    C13595 c13595 = (C13595) it2.next();
                    Bitmap bitmap = c13595.f40542;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c13595.f40542 = null;
                    }
                }
            }
        }
        this.f22228 = 0;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11480 m19355() {
        return (C11480) C7166.m19188(1, this.f22234);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C7246.class == obj.getClass() && this.f22229 == ((C7246) obj).f22229;
    }

    public final int hashCode() {
        return this.f22229;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19353(C10130 c10130) {
        c10130.writeInt(this.f22229);
        List<C11480> list = this.f22234;
        c10130.writeInt(list.size());
        for (C11480 c11480 : list) {
            c10130.writeInt(c11480.f34288);
            c10130.m25439(c11480.f34287);
        }
        HashSet hashSet = this.f22238;
        c10130.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        C20423 c20423 = new C20423();
        ArrayList arrayList = this.f22237;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C22768 c22768 = (C22768) it2.next();
            if (c22768 != null) {
                Iterator it3 = c22768.f73518.iterator();
                while (it3.hasNext()) {
                    c20423.m46829(((C13595) it3.next()).f40545);
                }
            }
        }
        c20423.m46827(c10130);
        c10130.writeInt(arrayList.size());
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C22768 c227682 = (C22768) it4.next();
            if (c227682 == null) {
                c10130.writeInt(-1);
            } else {
                ArrayList arrayList2 = c227682.f73518;
                c10130.writeInt(arrayList2.size());
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C13595 c13595 = (C13595) it5.next();
                    c10130.writeByte(c20423.m46825(c13595.f40545));
                    c10130.writeInt(c13595.f40543);
                    c10130.m25419(c13595.f40544);
                }
            }
        }
        c10130.writeByte(this.f22222 ? (byte) 1 : (byte) 0);
        c10130.writeInt(this.f22226);
        c10130.m25419(this.f22235);
        c10130.m25419(this.f22236);
        c10130.m25419(this.f22221);
        c10130.m25419(this.f22231);
        c10130.writeByte(this.f22224 ? (byte) 1 : (byte) 0);
        c10130.m25419(this.f22225);
        c10130.m25419(this.f22230);
        c10130.m25419(this.f22219);
        c10130.m25419(this.f22233);
        c10130.writeInt(this.f22232);
    }

    public C7246(C16376 c16376, C12951 c12951) {
        this.f22232 = -1;
        this.f22218 = new RectF();
        this.f22220 = C21943.m49431();
        this.f22228 = 0;
        this.f22227 = new Matrix();
        this.f22223 = c16376;
        this.f22229 = c12951.readInt();
        int readInt = c12951.readInt();
        this.f22234 = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f22234.add(new C11480(c12951.readInt(), c12951.m31506()));
        }
        int readInt2 = c12951.readInt();
        this.f22238 = new HashSet(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f22238.add(c12951.m31506());
        }
        C20423 c20423 = new C20423();
        c20423.m46828(c12951);
        int readInt3 = c12951.readInt();
        this.f22237 = new ArrayList(readInt3);
        for (int i3 = 0; i3 < readInt3; i3++) {
            int readInt4 = c12951.readInt();
            if (readInt4 == -1) {
                this.f22237.add(null);
            } else {
                C22768 c22768 = new C22768();
                c22768.f73518.ensureCapacity(readInt4);
                for (int i4 = 0; i4 < readInt4; i4++) {
                    C13595 c13595 = new C13595(c12951.readInt(), c20423.m46826(c12951.readByte() & 255));
                    c13595.f40544 = c12951.m31495();
                    c22768.f73518.add(c13595);
                }
                this.f22237.add(c22768);
            }
        }
        this.f22222 = c12951.readByte() != 0;
        this.f22226 = c12951.readInt();
        this.f22235 = c12951.m31495();
        this.f22236 = c12951.m31495();
        this.f22221 = c12951.m31495();
        this.f22231 = c12951.m31495();
        this.f22224 = c12951.readByte() != 0;
        this.f22225 = c12951.m31495();
        this.f22230 = c12951.m31495();
        this.f22219 = c12951.m31495();
        this.f22233 = c12951.m31495();
        this.f22232 = c12951.readInt();
    }
}
