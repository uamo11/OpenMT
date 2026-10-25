package l;

import android.content.Context;
import android.widget.TextView;

/* compiled from: QB4F */
/* renamed from: l.ܽ֨ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16311 extends C20065 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50219;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50220;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f50221;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16311(AbstractC20546 abstractC20546, Context context, EnumC6434[] enumC6434Arr, boolean z, int i) {
        super(context, enumC6434Arr);
        this.f50221 = abstractC20546;
        this.f50220 = z;
        this.f50219 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0.isChecked() == false) goto L8;
     */
    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEnabled(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.f50220
            l.᩷֨ܳ r1 = r3.f50221
            r2 = 1
            if (r0 != 0) goto L15
            int r0 = r3.f50219
            if (r0 <= r2) goto L1e
            l.ۗۘ r0 = l.AbstractC20546.m47049(r1)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L1e
        L15:
            l.ۜ֨ܳ[] r0 = l.AbstractC20546.m47054(r1)
            int r0 = r0.length
            int r0 = r0 + (-5)
            if (r4 >= r0) goto L1f
        L1e:
            return r2
        L1f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16311.isEnabled(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0.isChecked() == false) goto L8;
     */
    @Override // l.C2072, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getCount() {
        /*
            r3 = this;
            boolean r0 = r3.f50220
            l.᩷֨ܳ r1 = r3.f50221
            if (r0 != 0) goto L15
            int r0 = r3.f50219
            r2 = 1
            if (r0 <= r2) goto L37
            l.ۗۘ r0 = l.AbstractC20546.m47049(r1)
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto L37
        L15:
            android.widget.Spinner r0 = l.AbstractC20546.m47053(r1)
            int r0 = r0.getSelectedItemPosition()
            l.ۜ֨ܳ[] r2 = l.AbstractC20546.m47054(r1)
            int r2 = r2.length
            int r2 = r2 + (-5)
            if (r0 < r2) goto L37
            android.widget.Spinner r0 = l.AbstractC20546.m47053(r1)
            android.widget.Spinner r2 = l.AbstractC20546.m47053(r1)
            int r2 = r2.getSelectedItemPosition()
            int r2 = r2 + (-5)
            r0.setSelection(r2)
        L37:
            l.ۜ֨ܳ[] r0 = l.AbstractC20546.m47054(r1)
            int r0 = r0.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16311.getCount():int");
    }

    @Override // l.C20065
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo38390(TextView textView, int i, boolean z) {
        if (z) {
            textView.setAlpha(isEnabled(i) ? 1.0f : 0.3f);
        }
    }
}
