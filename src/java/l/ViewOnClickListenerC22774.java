package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;

/* compiled from: 11CW */
/* renamed from: l.᩺ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC22774 implements View.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13601 f73527;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73528;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73529;

    public ViewOnClickListenerC22774(Context context, C13601 c13601, XmlResourceParser xmlResourceParser) {
        this.f73529 = -1;
        this.f73528 = 17;
        this.f73527 = c13601;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69969);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f73529 = obtainStyledAttributes.getResourceId(index, this.f73529);
            } else if (index == 0) {
                this.f73528 = obtainStyledAttributes.getInt(index, this.f73528);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50849(C10075 c10075, int i, C13601 c13601) {
        int i2 = this.f73529;
        C10075 c100752 = c10075;
        if (i2 != -1) {
            c100752 = c10075.findViewById(i2);
        }
        if (c100752 == null) {
            return;
        }
        int i3 = c13601.f40567;
        int i4 = c13601.f40564;
        if (i3 == -1) {
            c100752.setOnClickListener(this);
            return;
        }
        int i5 = this.f73528;
        int i6 = i5 & 1;
        boolean z = false;
        boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z = true;
        }
        if (z2 || z) {
            c100752.setOnClickListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            l.ܰۚ r13 = r12.f73527
            l.۟ۚ r0 = l.C13601.m32687(r13)
            l.ۤۚ r0 = l.C7252.m19406(r0)
            boolean r1 = r0.m25324()
            if (r1 != 0) goto L12
            goto Lcb
        L12:
            int r1 = l.C13601.m32680(r13)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1
            if (r1 != r3) goto L41
            int r1 = r0.f30314
            if (r1 != r3) goto L27
            int r13 = l.C13601.m32672(r13)
            r0.m25313(r13)
            return
        L27:
            l.ܰۚ r3 = new l.ܰۚ
            l.۟ۚ r4 = l.C13601.m32687(r13)
            r3.<init>(r4, r13)
            l.C13601.m32681(r3, r1)
            int r13 = l.C13601.m32672(r13)
            l.C13601.m32673(r3, r13)
            r0.m25318(r3)
            r0.m25310(r2)
            return
        L41:
            l.۟ۚ r1 = l.C13601.m32687(r13)
            l.ܰۚ r1 = r1.f22265
            int r4 = r12.f73528
            r5 = r4 & 1
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L56
            r8 = r4 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L54
            goto L56
        L54:
            r8 = 0
            goto L57
        L56:
            r8 = 1
        L57:
            r9 = r4 & 16
            if (r9 != 0) goto L61
            r10 = r4 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L60
            goto L61
        L60:
            r7 = 0
        L61:
            if (r8 == 0) goto L82
            if (r7 == 0) goto L82
            l.۟ۚ r10 = l.C13601.m32687(r13)
            l.ܰۚ r10 = r10.f22265
            if (r10 == r13) goto L70
            r0.m25318(r13)
        L70:
            int r10 = r0.f30314
            int r11 = r0.m25320()
            if (r10 == r11) goto L83
            float r10 = r0.f30343
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L81
            goto L83
        L81:
            r7 = 0
        L82:
            r6 = r8
        L83:
            if (r13 != r1) goto L86
            goto L9b
        L86:
            int r1 = l.C13601.m32672(r13)
            int r8 = l.C13601.m32680(r13)
            if (r8 != r3) goto L95
            int r3 = r0.f30314
            if (r3 == r1) goto Lcb
            goto L9b
        L95:
            int r3 = r0.f30314
            if (r3 == r8) goto L9b
            if (r3 != r1) goto Lcb
        L9b:
            if (r6 == 0) goto La6
            if (r5 == 0) goto La6
            r0.m25318(r13)
            r0.m25310(r2)
            return
        La6:
            r1 = 0
            if (r7 == 0) goto Lb2
            if (r9 == 0) goto Lb2
            r0.m25318(r13)
            r0.m25310(r1)
            return
        Lb2:
            if (r6 == 0) goto Lbf
            r3 = r4 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto Lbf
            r0.m25318(r13)
            r0.m25321(r2)
            return
        Lbf:
            if (r7 == 0) goto Lcb
            r2 = r4 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto Lcb
            r0.m25318(r13)
            r0.m25321(r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC22774.onClick(android.view.View):void");
    }
}
