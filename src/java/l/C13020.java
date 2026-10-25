package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: WB0M */
/* renamed from: l.۬ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13020 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f38970 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f38971 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f38972;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3143 f38973;

    public C13020(C3143 c3143) {
        this.f38973 = c3143;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:9:0x004b, B:11:0x0052, B:12:0x0059, B:14:0x0060, B:21:0x0034, B:23:0x003a, B:25:0x0040), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:9:0x004b, B:11:0x0052, B:12:0x0059, B:14:0x0060, B:21:0x0034, B:23:0x003a, B:25:0x0040), top: B:2:0x001c }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m31603(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            l.ۗۢ r6 = r9.f38973
            android.content.Context r0 = r6.getContext()
            int[] r2 = l.C3390.f10697
            r7 = 0
            l.᩺ۘ r8 = l.C22733.m50796(r0, r10, r2, r11, r7)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r8.m50810()
            r0 = r6
            r3 = r10
            r5 = r11
            l.C17648.m41302(r0, r1, r2, r3, r4, r5)
            r10 = 1
            boolean r11 = r8.m50802(r10)     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L34
            int r10 = r8.m50806(r10, r7)     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L34
            android.content.Context r11 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r10 = l.C21311.m48345(r11, r10)     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L71
            r6.setCheckMarkDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L34 java.lang.Throwable -> L71
            goto L4b
        L34:
            boolean r10 = r8.m50802(r7)     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L4b
            int r10 = r8.m50806(r7, r7)     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L4b
            android.content.Context r11 = r6.getContext()     // Catch: java.lang.Throwable -> L71
            android.graphics.drawable.Drawable r10 = l.C21311.m48345(r11, r10)     // Catch: java.lang.Throwable -> L71
            r6.setCheckMarkDrawable(r10)     // Catch: java.lang.Throwable -> L71
        L4b:
            r10 = 2
            boolean r11 = r8.m50802(r10)     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L59
            android.content.res.ColorStateList r10 = r8.m50804(r10)     // Catch: java.lang.Throwable -> L71
            r6.setCheckMarkTintList(r10)     // Catch: java.lang.Throwable -> L71
        L59:
            r10 = 3
            boolean r11 = r8.m50802(r10)     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L6d
            r11 = -1
            int r10 = r8.m50809(r10, r11)     // Catch: java.lang.Throwable -> L71
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = l.C15320.m36346(r10, r11)     // Catch: java.lang.Throwable -> L71
            r6.setCheckMarkTintMode(r10)     // Catch: java.lang.Throwable -> L71
        L6d:
            r8.m50813()
            return
        L71:
            r10 = move-exception
            r8.m50813()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13020.m31603(android.util.AttributeSet, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31602() {
        C3143 c3143 = this.f38973;
        Drawable checkMarkDrawable = c3143.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f38970 || this.f38971) {
                Drawable mutate = C8184.m21684(checkMarkDrawable).mutate();
                if (this.f38970) {
                    C8184.m21676(mutate, (ColorStateList) null);
                }
                if (this.f38971) {
                    C8184.m21679(mutate, (PorterDuff.Mode) null);
                }
                if (mutate.isStateful()) {
                    mutate.setState(c3143.getDrawableState());
                }
                c3143.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31604() {
        if (this.f38972) {
            this.f38972 = false;
        } else {
            this.f38972 = true;
            m31602();
        }
    }
}
