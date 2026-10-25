package l;

import android.view.View;

/* compiled from: 6ALU */
@InterfaceC0690(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* renamed from: l.᩵᩺, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19766 extends AbstractC15506 implements InterfaceC19763 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63823;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f63824;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f63825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19766(View view, InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f63825 = view;
    }

    @Override // l.AbstractC2808
    /* renamed from: ֫ */
    public final InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        C19766 c19766 = new C19766(this.f63825, interfaceC11791);
        c19766.f63824 = obj;
        return c19766;
    }

    @Override // l.InterfaceC19763
    /* renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        return ((C19766) mo8682(obj, (InterfaceC11791) obj2)).mo8684(C8058.f24861);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1.mo18047(r2, r5) == r0) goto L20;
     */
    @Override // l.AbstractC2808
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8684(java.lang.Object r6) {
        /*
            r5 = this;
            l.ۜ᩸᩵ r0 = l.EnumC7041.f21688
            int r1 = r5.f63823
            android.view.View r2 = r5.f63825
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            l.C18642.m43236(r6)
            goto L59
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f63824
            l.ۜۙ᩵ r1 = (l.AbstractC6544) r1
            l.C18642.m43236(r6)
            goto L35
        L22:
            l.C18642.m43236(r6)
            java.lang.Object r6 = r5.f63824
            r1 = r6
            l.ۜۙ᩵ r1 = (l.AbstractC6544) r1
            r5.f63824 = r1
            r5.f63823 = r4
            l.ۜ᩸᩵ r6 = r1.mo18047(r2, r5)
            if (r6 != r0) goto L35
            goto L58
        L35:
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L59
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r5.f63824 = r6
            r5.f63823 = r3
            r1.getClass()
            l.ۘۨ r6 = new l.ۘۨ
            l.ۘ᩺ r3 = new l.ۘ᩺
            r3.<init>(r2)
            r6.<init>(r3)
            java.lang.Object r6 = r1.mo18046(r6, r5)
            if (r6 != r0) goto L54
            goto L56
        L54:
            l.۠۠᩵ r6 = l.C8058.f24861
        L56:
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            l.۠۠᩵ r6 = l.C8058.f24861
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19766.mo8684(java.lang.Object):java.lang.Object");
    }
}
