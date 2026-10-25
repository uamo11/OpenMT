package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: J1B7 */
/* renamed from: l.ܺۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15718 extends AbstractC4990 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48480 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f48482 = Float.NaN;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f48486 = Float.NaN;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f48485 = Float.NaN;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f48479 = Float.NaN;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f48478 = Float.NaN;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f48474 = Float.NaN;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f48481 = Float.NaN;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f48473 = Float.NaN;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f48483 = Float.NaN;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f48484 = Float.NaN;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f48471 = Float.NaN;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f48476 = Float.NaN;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f48477 = 0;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f48472 = Float.NaN;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f48475 = 0.0f;

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11329(HashMap hashMap) {
        throw null;
    }

    public C15718() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C8664.m22421(this, context.obtainStyledAttributes(attributeSet, C21840.f69979));
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f48482)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f48486)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f48485)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f48479)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f48478)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f48483)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f48484)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f48471)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f48474)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f48481)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f48473)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f48476)) {
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
        if (this.f48480 == -1) {
            return;
        }
        if (!Float.isNaN(this.f48482)) {
            hashMap.put("alpha", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48486)) {
            hashMap.put("elevation", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48485)) {
            hashMap.put("rotation", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48479)) {
            hashMap.put("rotationX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48478)) {
            hashMap.put("rotationY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48483)) {
            hashMap.put("translationX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48484)) {
            hashMap.put("translationY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48471)) {
            hashMap.put("translationZ", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48474)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48481)) {
            hashMap.put("scaleX", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48481)) {
            hashMap.put("scaleY", Integer.valueOf(this.f48480));
        }
        if (!Float.isNaN(this.f48476)) {
            hashMap.put("progress", Integer.valueOf(this.f48480));
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(C20094.m46315("CUSTOM,", (String) it.next()), Integer.valueOf(this.f48480));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00e1, code lost:
    
        if (r1.equals("rotationY") == false) goto L60;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37091(java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15718.m37091(java.util.HashMap):void");
    }
}
