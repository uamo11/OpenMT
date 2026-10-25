package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: B1BC */
/* renamed from: l.۠֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7812 extends AbstractC4990 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24132 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f24134 = Float.NaN;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f24138 = Float.NaN;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f24130 = Float.NaN;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f24133 = Float.NaN;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f24126 = Float.NaN;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f24129 = Float.NaN;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f24137 = Float.NaN;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f24136 = Float.NaN;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f24127 = Float.NaN;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f24135 = Float.NaN;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f24124 = Float.NaN;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f24128 = Float.NaN;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f24125 = Float.NaN;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f24131 = Float.NaN;

    public C7812() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C0756.m2896(this, context.obtainStyledAttributes(attributeSet, C21840.f69993));
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f24134)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f24138)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f24130)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f24133)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f24126)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f24129)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f24137)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f24124)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f24128)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f24125)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f24136)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f24127)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f24135)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f24131)) {
            hashSet.add("progress");
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // l.AbstractC4990
    /* renamed from: ۧ */
    public final void mo14474(HashMap hashMap) {
        if (this.f24132 == -1) {
            return;
        }
        if (!Float.isNaN(this.f24134)) {
            hashMap.put("alpha", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24138)) {
            hashMap.put("elevation", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24130)) {
            hashMap.put("rotation", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24133)) {
            hashMap.put("rotationX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24126)) {
            hashMap.put("rotationY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24129)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24137)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24124)) {
            hashMap.put("translationX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24128)) {
            hashMap.put("translationY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24125)) {
            hashMap.put("translationZ", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24136)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24127)) {
            hashMap.put("scaleX", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24135)) {
            hashMap.put("scaleY", Integer.valueOf(this.f24132));
        }
        if (!Float.isNaN(this.f24131)) {
            hashMap.put("progress", Integer.valueOf(this.f24132));
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(C20094.m46315("CUSTOM,", (String) it.next()), Integer.valueOf(this.f24132));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x009e, code lost:
    
        if (r1.equals("scaleY") == false) goto L68;
     */
    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo11329(java.util.HashMap r6) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7812.mo11329(java.util.HashMap):void");
    }
}
