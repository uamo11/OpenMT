package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.io.Serializable;

/* compiled from: Z681 */
/* renamed from: l.᩸᩹ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC21872 extends C2095 {

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public boolean f70043;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f70044;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f70045;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f70046;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public CharSequence f70047;

    public AbstractC21872(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AbstractC21872(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC21872(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC21872(Context context) {
        this(context, null);
    }

    @Override // l.C2095
    /* renamed from: ۛ */
    public final void mo6908() {
        boolean z = !this.f70046;
        m6893((Serializable) Boolean.valueOf(z));
        m49260(z);
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49256() {
        return this.f70046;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49260(boolean z) {
        boolean z2 = this.f70046 != z;
        if (z2 || !this.f70044) {
            this.f70046 = z;
            this.f70044 = true;
            m6934(z);
            if (z2) {
                mo6918(mo6932());
                mo6922();
            }
        }
    }

    @Override // l.C2095
    /* renamed from: ܿ֫ */
    public final boolean mo6932() {
        return (this.f70043 ? this.f70046 : !this.f70046) || super.mo6932();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49259(String str) {
        this.f70047 = str;
        if (this.f70046) {
            mo6922();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49258(String str) {
        this.f70045 = str;
        if (this.f70046) {
            return;
        }
        mo6922();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m49255(boolean z) {
        this.f70043 = z;
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final void mo6895(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m49260(m6903(((Boolean) obj).booleanValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49257(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f70046
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.CharSequence r0 = r4.f70047
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.CharSequence r0 = r4.f70047
            r5.setText(r0)
            goto L2b
        L1a:
            boolean r0 = r4.f70046
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f70045
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f70045
            r5.setText(r0)
        L2b:
            r0 = 0
            goto L2e
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.mo6907()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = 0
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC21872.m49257(android.view.View):void");
    }

    @Override // l.C2095
    /* renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C15520 c15520 = new C15520();
        c15520.f47441 = this.f70046;
        return c15520;
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C15520.class)) {
            super.mo6892(parcelable);
            return;
        }
        C15520 c15520 = (C15520) parcelable;
        super.mo6892(c15520.getSuperState());
        m49260(c15520.f47441);
    }
}
