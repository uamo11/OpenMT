package l;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 473S */
/* renamed from: l.᩶᩵ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C20378 implements InterfaceC12784, InterfaceC4644, InterfaceC20106, InterfaceC21013 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65777;

    public /* synthetic */ C20378(Object obj) {
        this.f65777 = obj;
    }

    @Override // l.InterfaceC20106
    /* renamed from: ֫ */
    public void mo13218(Object obj) {
        ((C14772) this.f65777).m35126((C11825) obj, true);
    }

    @Override // l.InterfaceC12784
    /* renamed from: ֫ */
    public void mo15503(String str) {
        ((AtomicReference) this.f65777).set(str);
    }

    @Override // l.InterfaceC4644
    /* renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40789((InterfaceC11098) this.f65777);
    }

    @Override // l.InterfaceC21013
    /* renamed from: ۧ */
    public Object mo12796() {
        throw new C13934((String) this.f65777);
    }
}
