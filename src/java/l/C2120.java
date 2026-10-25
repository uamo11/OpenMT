package l;

import java.io.IOException;

/* compiled from: O17J */
/* renamed from: l.֫᩹ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2120 extends AbstractC21087 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17642 f7082;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11293 f7083;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120(C11293 c11293, C11293 c112932, InterfaceC6975 interfaceC6975) {
        super(c112932, interfaceC6975);
        this.f7083 = c11293;
    }

    @Override // l.AbstractC21087
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo7026() {
        C19697 mo27937 = this.f7083.mo27937();
        try {
            this.f7082 = mo27937.m45366(this.f68007.mo23554());
            mo27937.f63634 = 0L;
            return this.f7082.m41291();
        } catch (Throwable th) {
            mo27937.f63634 = 0L;
            throw th;
        }
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7024(int i) {
        C19697 c19697 = null;
        try {
            c19697 = this.f7083.mo27937();
            c19697.m45356(this.f68007.mo23554(), i, false, false);
            this.f7083.mo27930();
            c19697.f63634 = 0L;
        } catch (IOException unused) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo7023() {
        if (this.f7082 == null) {
            return -1L;
        }
        return r0.m41283() | (this.f7082.m41281() << 32);
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7025(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        C19697 c19697 = null;
        try {
            c19697 = this.f7083.mo27937();
            c19697.m45355(this.f68007.mo23554(), i, i2, false, false);
            this.f7083.mo27930();
            c19697.f63634 = 0L;
        } catch (IOException unused) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }
}
