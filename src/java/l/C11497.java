package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: 58GU */
/* renamed from: l.ۨۚۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11497 extends View {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f34349;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22785 f34350;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f34351;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f34352;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f34353;

    public C11497(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34351 = new ArrayList();
        this.f34353 = Collections.EMPTY_LIST;
        this.f34349 = 0.0533f;
        this.f34350 = C22785.f73570;
        this.f34352 = 0.08f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28325(List list, C22785 c22785, float f, float f2) {
        this.f34353 = list;
        this.f34350 = c22785;
        this.f34349 = f;
        this.f34352 = f2;
        while (true) {
            ArrayList arrayList = this.f34351;
            if (arrayList.size() < list.size()) {
                arrayList.add(new C19341(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r3 != 2) goto L41;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11497.dispatchDraw(android.graphics.Canvas):void");
    }
}
