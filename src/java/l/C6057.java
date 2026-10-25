package l;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: 6AM8 */
/* renamed from: l.ۛ۫ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6057 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f18555;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC10318 f18556;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC20169 f18557;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18179 f18558;

    public C6057(C18179 c18179, Executor executor) {
        C11233.m27805(executor, "executor");
        this.f18558 = c18179;
        this.f18555 = executor;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16896(InterfaceC20169 interfaceC20169) {
        this.f18557 = interfaceC20169;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16895(Activity activity) {
        InterfaceC10318 interfaceC10318 = this.f18556;
        if (interfaceC10318 != null) {
            ((C18059) interfaceC10318).mo26069((CancellationException) null);
        }
        this.f18556 = C14262.m33911(C22730.m50793(new C21607(this.f18555)), new C10291(this, activity, null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16894() {
        InterfaceC10318 interfaceC10318 = this.f18556;
        if (interfaceC10318 == null) {
            return;
        }
        ((C18059) interfaceC10318).mo26069((CancellationException) null);
    }
}
