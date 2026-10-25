package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: QABT */
/* renamed from: l.᩹᩹ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22571 implements InterfaceC18099 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10577 f72977;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f72978;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0430 f72979;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12693 f72980;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f72981;

    public C22571(C10577 c10577, AtomicReference atomicReference, C0430 c0430, C12693 c12693, AtomicBoolean atomicBoolean) {
        this.f72977 = c10577;
        this.f72978 = atomicReference;
        this.f72979 = c0430;
        this.f72980 = c12693;
        this.f72981 = atomicBoolean;
    }

    @Override // l.InterfaceC18099
    /* renamed from: ֫ */
    public final void mo42221(IOException iOException) {
        AtomicReference atomicReference;
        try {
            do {
                atomicReference = this.f72978;
                if (!atomicReference.compareAndSet(null, iOException)) {
                }
                this.f72979.close();
            } while (atomicReference.get() == null);
            this.f72979.close();
        } catch (Exception unused) {
        }
    }

    @Override // l.InterfaceC18099
    /* renamed from: ֫ */
    public final void mo42222(C18621 c18621) {
        AtomicReference atomicReference;
        try {
            if (this.f72980.f38213 && c18621.m43177() == 403) {
                this.f72977.m26583();
            }
            C18275.m42607(c18621);
            this.f72981.set(true);
        } catch (IOException e) {
            try {
                do {
                    atomicReference = this.f72978;
                    if (!atomicReference.compareAndSet(null, e)) {
                    }
                    break;
                } while (atomicReference.get() == null);
                break;
                c18621.close();
            } catch (Exception unused) {
            }
            try {
                this.f72979.close();
            } catch (Exception unused2) {
            }
        }
    }
}
