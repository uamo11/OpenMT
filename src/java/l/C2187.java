package l;

import android.content.DialogInterface;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 6AY4 */
/* renamed from: l.ۖ֡᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2187 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f7190;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f7191;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2123 f7192;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f7193;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7194;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20765 f7195;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7196;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f7197 = true;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7198;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7199;

    public C2187(boolean z, ViewOnClickListenerC19121 viewOnClickListenerC19121, C16773 c16773, C20765 c20765, int i, InterfaceC2123 interfaceC2123, boolean z2) {
        this.f7198 = z;
        this.f7191 = viewOnClickListenerC19121;
        this.f7193 = c16773;
        this.f7195 = c20765;
        this.f7199 = i;
        this.f7192 = interfaceC2123;
        this.f7194 = z2;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m7206() {
        List list = this.f7190;
        if (list != null) {
            return list;
        }
        C11233.m27804("tempItems");
        throw null;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12346 c12346;
        C12346 c123462;
        if (this.f7198) {
            return;
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
        c12346 = viewOnClickListenerC19121.f60243;
        if (c12346 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        if (c12346.m29962()) {
            return;
        }
        c123462 = viewOnClickListenerC19121.f60243;
        if (c123462 != null) {
            c123462.postDelayed(new RunnableC9306(1, this, viewOnClickListenerC19121), 300L);
        } else {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7205(C2187 c2187, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        C12346 c12346;
        if (c2187.f7197) {
            c12346 = viewOnClickListenerC19121.f60243;
            if (c12346 != null) {
                c12346.m29958(true);
            } else {
                C11233.m27804("swipeRefreshLayout");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x006c, code lost:
    
        if (r2.isEmpty() == false) goto L16;
     */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2187.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AtomicInteger atomicInteger;
        this.f7197 = false;
        if (this.f7195.mo19832().m33028(EnumC13728.CREATED)) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
            atomicInteger = viewOnClickListenerC19121.f60245;
            if (atomicInteger.get() != this.f7199) {
                return;
            }
            if (!this.f7198 || this.f7196) {
                ViewOnClickListenerC19121.m44094(viewOnClickListenerC19121, m7206());
                InterfaceC2123 interfaceC2123 = this.f7192;
                if (interfaceC2123 != null) {
                    interfaceC2123.mo4049();
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AtomicInteger atomicInteger;
        this.f7197 = false;
        if (this.f7195.mo19832().m33028(EnumC13728.CREATED)) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
            atomicInteger = viewOnClickListenerC19121.f60245;
            if (atomicInteger.get() != this.f7199) {
                return;
            }
            viewOnClickListenerC19121.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (this.f7194) {
                List list = Collections.EMPTY_LIST;
                C11233.m27803(list, "emptyList(...)");
                ViewOnClickListenerC19121.m44094(viewOnClickListenerC19121, list);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346;
        c12346 = this.f7191.f60243;
        if (c12346 != null) {
            c12346.m29958(false);
        } else {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
    }
}
