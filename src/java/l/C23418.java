package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;

/* compiled from: J204 */
/* renamed from: l.᩻ۗ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23418 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75208;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ColorStateList f75209;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Shader f75210;

    public C23418(Shader shader, ColorStateList colorStateList, int i) {
        this.f75210 = shader;
        this.f75209 = colorStateList;
        this.f75208 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23418 m51875(int i) {
        return new C23418(null, null, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Shader m51880() {
        return this.f75210;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51877() {
        return this.f75208;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51878(int i) {
        this.f75208 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51881() {
        return this.f75210 != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51883() {
        ColorStateList colorStateList;
        return this.f75210 == null && (colorStateList = this.f75209) != null && colorStateList.isStateful();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51879(int[] iArr) {
        if (!m51883()) {
            return false;
        }
        ColorStateList colorStateList = this.f75209;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f75208) {
            return false;
        }
        this.f75208 = colorForState;
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m51882() {
        return m51881() || this.f75208 != 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23418 m51876(Resources resources, int i, Resources.Theme theme) {
        try {
            return m51874(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01df, code lost:
    
        if (r13.size() <= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e1, code lost:
    
        r0 = new l.C3663(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e8, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        if (r16 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ed, code lost:
    
        r0 = new l.C3663(r8, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f3, code lost:
    
        r0 = new l.C3663(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        if (r6 == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fc, code lost:
    
        if (r6 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fe, code lost:
    
        r4 = r0.f11554;
        r15 = r0.f11555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0204, code lost:
    
        if (r14 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0206, code lost:
    
        if (r14 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
    
        r3 = new android.graphics.LinearGradient(r10, r21, r20, r19, r4, r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025f, code lost:
    
        return new l.C23418(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020e, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021e, code lost:
    
        r3 = new android.graphics.SweepGradient(r18, r17, r0.f11554, r0.f11555);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022c, code lost:
    
        r2 = r17;
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0233, code lost:
    
        if (r24 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0235, code lost:
    
        r1 = r0.f11554;
        r0 = r0.f11555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x023c, code lost:
    
        if (r14 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x023f, code lost:
    
        if (r14 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0241, code lost:
    
        r4 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0249, code lost:
    
        r3 = new android.graphics.RadialGradient(r7, r2, r24, r1, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0244, code lost:
    
        r4 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0247, code lost:
    
        r4 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0267, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e7, code lost:
    
        r0 = null;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C23418 m51874(android.content.res.Resources r23, int r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23418.m51874(android.content.res.Resources, int, android.content.res.Resources$Theme):l.᩻ۗ");
    }
}
