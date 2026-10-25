package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: U14P */
/* renamed from: l.ۜۡۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6659 extends C0452 {

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f20676;

    public C6659(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20676 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18195(boolean z) {
        this.f20676 = z;
    }

    @Override // l.C0452, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20676) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // l.C0452, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20676) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
