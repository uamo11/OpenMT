package l;

import java.util.function.LongSupplier;

/* compiled from: P70J */
/* renamed from: l.᩸᩺ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C21896 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23034 f70096;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20485 f70097;

    public /* synthetic */ C21896(C23034 c23034, C20485 c20485) {
        this.f70096 = c23034;
        this.f70097 = c20485;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܶ᩺ܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6724 m49276() {
        final C20485 c20485 = this.f70097;
        return this.f70096.m51195((C15544) new LongSupplier() { // from class: l.ܶ᩺ܿ
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return C20485.this.getPosition();
            }
        });
    }
}
