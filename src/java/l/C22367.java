package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: A4UI */
/* renamed from: l.᩹ܶۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22367 extends AbstractC11079 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72474;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public CharSequence[] f72475;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public HashSet f72476;

    public C22367(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f72476 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29906, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f72475 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f72474 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    public C22367(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector_res_0x7f040189, android.R.attr.dialogPreferenceStyle));
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m50133() {
        return this.f72475;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m50134() {
        return this.f72474;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50132(Set set) {
        HashSet hashSet = this.f72476;
        hashSet.clear();
        hashSet.addAll(set);
        m6917(set);
        mo6922();
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final HashSet m50131() {
        return this.f72476;
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final Object mo6887(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final void mo6895(Object obj) {
        m50132(m6889((Set) obj));
    }

    @Override // l.C2095
    /* renamed from: ᩺ */
    public final Parcelable mo6940() {
        super.mo6940();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (m6906()) {
            return absSavedState;
        }
        C21662 c21662 = new C21662();
        c21662.f69515 = this.f72476;
        return c21662;
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final void mo6892(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C21662.class)) {
            super.mo6892(parcelable);
            return;
        }
        C21662 c21662 = (C21662) parcelable;
        super.mo6892(c21662.getSuperState());
        m50132(c21662.f69515);
    }
}
