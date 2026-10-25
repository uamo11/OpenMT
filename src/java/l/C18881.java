package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* compiled from: R1EE */
/* renamed from: l.ᩴܽۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18881 implements InterfaceC19992 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7997 f59517;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f59518;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59520;

    public C18881(InterfaceC7997 interfaceC7997, C12366 c12366, String str, String str2) {
        this.f59517 = interfaceC7997;
        this.f59518 = c12366;
        this.f59519 = str;
        this.f59520 = str2;
    }

    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final InterfaceC7997 mo2262() {
        return this.f59517;
    }

    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final void mo2263(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f59518.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC19992
    /* renamed from: ֫ */
    public final C0941 mo2261(ArrayList arrayList) {
        return new C0941("", "Usage: " + this.f59519 + "->" + this.f59520, arrayList);
    }
}
