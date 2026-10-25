package l;

import java.io.BufferedOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: V1EH */
/* renamed from: l.۠ۨ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8162 implements Supplier {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f25160;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25161;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BufferedOutputStream f25162;

    public /* synthetic */ C8162(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f25161 = z;
        this.f25162 = bufferedOutputStream;
        this.f25160 = atomicInteger;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new C13100(this.f25161, this.f25162, this.f25160);
    }
}
