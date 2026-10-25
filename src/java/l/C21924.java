package l;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: H1BK */
/* renamed from: l.᩹֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21924 extends AbstractC4990 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70195 = 0;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f70192 = -1;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f70187 = Float.NaN;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f70190 = 0.0f;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f70191 = Float.NaN;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f70196 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f70198 = Float.NaN;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f70202 = Float.NaN;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f70201 = Float.NaN;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f70189 = Float.NaN;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f70194 = Float.NaN;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f70193 = Float.NaN;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f70197 = Float.NaN;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f70188 = Float.NaN;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f70199 = Float.NaN;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f70200 = Float.NaN;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f70186 = Float.NaN;

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11329(HashMap hashMap) {
        throw null;
    }

    public C21924() {
        this.f15711 = new HashMap();
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11328(Context context, AttributeSet attributeSet) {
        C21219.m48170(this, context.obtainStyledAttributes(attributeSet, C21840.f69976));
    }

    @Override // l.AbstractC4990
    /* renamed from: ֫ */
    public final void mo11330(HashSet hashSet) {
        if (!Float.isNaN(this.f70198)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f70202)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f70201)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f70194)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f70193)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f70197)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f70188)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f70189)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f70199)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f70200)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f70186)) {
            hashSet.add("translationZ");
        }
        if (this.f15711.size() > 0) {
            Iterator it = this.f15711.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r1.equals("scaleY") == false) goto L66;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49381(java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21924.m49381(java.util.HashMap):void");
    }
}
