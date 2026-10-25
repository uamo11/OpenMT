package l;

import android.content.Context;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: Q8Q4 */
/* renamed from: l.ۖ᩻ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2863 implements InterfaceC6599, InterfaceC4274 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f9123;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f9124;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8353 f9125;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f9126;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9127;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC17182 f9128;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f9129;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f9130;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1451 f9131;

    public C2863(C1451 c1451, Context context) {
        ExecutorC21641 executorC21641;
        this.f9131 = c1451;
        this.f9130 = C3603.m11043(context) ? 1 : 5;
        this.f9124 = AbstractC14545.of();
        this.f9129 = -9223372036854775807L;
        this.f9128 = InterfaceC17182.f52657;
        executorC21641 = C1451.f5167;
        this.f9126 = executorC21641;
    }

    @Override // l.InterfaceC6599
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo8765() {
        boolean z;
        C1451 c1451 = this.f9131;
        z = c1451.f5181;
        if (z) {
            c1451.m4990();
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8773() {
        boolean z;
        C1451 c1451 = this.f9131;
        z = c1451.f5181;
        if (z) {
            c1451.m4988();
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8758(InterfaceC17182 interfaceC17182, Executor executor) {
        this.f9128 = interfaceC17182;
        this.f9126 = executor;
    }

    @Override // l.InterfaceC6599
    public final boolean isInitialized() {
        return this.f9127;
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8757(C8353 c8353, long j, int i, List list) {
        boolean z;
        C20537 c20537;
        C22632.m50634(this.f9127);
        this.f9124 = AbstractC14545.copyOf((Collection) list);
        this.f9125 = c8353;
        C1451 c1451 = this.f9131;
        c1451.f5178 = -9223372036854775807L;
        c1451.f5174 = false;
        m8748(c8353);
        boolean z2 = this.f9129 == -9223372036854775807L;
        z = c1451.f5181;
        if (z || z2) {
            long j2 = z2 ? -4611686018427387904L : this.f9129 + 1;
            c20537 = c1451.f5171;
            c20537.m47026(j2, new C5685(j + this.f9123, i, j2));
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8760(long j, InterfaceC14359 interfaceC14359) {
        C22632.m50634(this.f9127);
        C1451 c1451 = this.f9131;
        if (!C1451.m4971(c1451)) {
            return false;
        }
        InterfaceC23337 m4984 = C1451.m4984(c1451);
        m4984.getClass();
        if (m4984.m51741() >= this.f9130) {
            return false;
        }
        InterfaceC23337 m49842 = C1451.m4984(c1451);
        m49842.getClass();
        if (!m49842.m51746()) {
            return false;
        }
        long j2 = j + this.f9123;
        this.f9129 = j2;
        ((C7529) interfaceC14359).mo20217(j2 * 1000);
        return true;
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8761(C8353 c8353) {
        C22632.m50634(!this.f9127);
        C1451.m4969(this.f9131, c8353);
        this.f9127 = true;
        return true;
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8762(boolean z) {
        return C1451.m4975(this.f9131, z && this.f9127);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8766(boolean z) {
        boolean z2 = this.f9127;
        C1451 c1451 = this.f9131;
        if (z2) {
            InterfaceC23337 m4984 = C1451.m4984(c1451);
            m4984.getClass();
            m4984.flush();
        }
        this.f9129 = -9223372036854775807L;
        C1451.m4968(c1451, z);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8767() {
        return this.f9127 && C1451.m4972(this.f9131);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Surface mo8771() {
        C22632.m50634(this.f9127);
        InterfaceC23337 m4984 = C1451.m4984(this.f9131);
        m4984.getClass();
        return m4984.m51744();
    }

    @Override // l.InterfaceC6599
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo8772() {
        long j;
        if (this.f9127) {
            C1451 c1451 = this.f9131;
            j = c1451.f5176;
            C1451.m4968(c1451, false);
            InterfaceC23337 m4984 = C1451.m4984(c1451);
            m4984.getClass();
            m4984.m51745();
            c1451.f5176 = j;
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo8774() {
        long j;
        long j2;
        long j3 = this.f9129;
        C1451 c1451 = this.f9131;
        c1451.f5178 = j3;
        j = c1451.f5176;
        j2 = c1451.f5178;
        if (j >= j2) {
            C1451.m4977(c1451);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @Override // l.InterfaceC6599
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8763() {
        /*
            r11 = this;
            l.֨᩻ۧ r0 = r11.f9131
            l.᩷֨֫ r1 = l.C1451.m4976(r0)
            int r1 = r1.m47029()
            if (r1 != 0) goto L10
            l.C1451.m4982(r0)
            return
        L10:
            l.᩷֨֫ r1 = new l.᩷֨֫
            r1.<init>()
            r2 = 1
            r3 = 1
        L17:
            l.᩷֨֫ r4 = l.C1451.m4976(r0)
            int r4 = r4.m47029()
            if (r4 <= 0) goto L4e
            l.᩷֨֫ r4 = l.C1451.m4976(r0)
            java.lang.Object r4 = r4.m47027()
            l.ۚ᩻ۧ r4 = (l.C5685) r4
            r4.getClass()
            if (r3 == 0) goto L48
            int r3 = r4.f17541
            if (r3 == 0) goto L3b
            if (r3 != r2) goto L37
            goto L3b
        L37:
            l.C1451.m4982(r0)
            goto L47
        L3b:
            l.ۚ᩻ۧ r3 = new l.ۚ᩻ۧ
            long r6 = r4.f17543
            r8 = 0
            long r9 = r4.f17542
            r5 = r3
            r5.<init>(r6, r8, r9)
            r4 = r3
        L47:
            r3 = 0
        L48:
            long r5 = r4.f17542
            r1.m47026(r5, r4)
            goto L17
        L4e:
            l.C1451.m4966(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2863.mo8763():void");
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8759(InterfaceC22618 interfaceC22618) {
        C1451.m4967(this.f9131, interfaceC22618);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8750(float f) {
        C1451.m4962(this.f9131, f);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8755(List list) {
        if (this.f9124.equals(list)) {
            return;
        }
        this.f9124 = AbstractC14545.copyOf((Collection) list);
        C8353 c8353 = this.f9125;
        if (c8353 != null) {
            m8748(c8353);
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8752(long j) {
        this.f9123 = j;
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8754(Surface surface, C17008 c17008) {
        this.f9131.m4986(surface, c17008);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo8764() {
        this.f9131.m4985();
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8751(int i) {
        C1451.m4963(this.f9131, i);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8753(long j, long j2) {
        C1451.m4965(this.f9131, j + this.f9123, j2);
    }

    @Override // l.InterfaceC6599
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8770(boolean z) {
        boolean z2;
        C1451 c1451 = this.f9131;
        z2 = c1451.f5181;
        if (z2) {
            C1451.m4979(c1451, z);
        }
    }

    @Override // l.InterfaceC6599
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8749() {
        this.f9131.m4989();
    }

    @Override // l.InterfaceC4274
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8769() {
        InterfaceC17182 interfaceC17182 = this.f9128;
        Executor executor = this.f9126;
        C11003.requireNonNull(interfaceC17182);
        executor.execute(new RunnableC10560(1, interfaceC17182));
    }

    @Override // l.InterfaceC4274
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo8768() {
        final InterfaceC17182 interfaceC17182 = this.f9128;
        Executor executor = this.f9126;
        C11003.requireNonNull(interfaceC17182);
        executor.execute(new Runnable() { // from class: l.ۡ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC17182.this.mo25027();
            }
        });
    }

    @Override // l.InterfaceC4274
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8756(final C6404 c6404) {
        final InterfaceC17182 interfaceC17182 = this.f9128;
        this.f9126.execute(new Runnable() { // from class: l.ܺ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC17182.this.mo25026(c6404);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8748(C8353 c8353) {
        C1297 m21948 = c8353.m21948();
        C21054 c21054 = c8353.f25637;
        if (c21054 == null || !c21054.m47900()) {
            c21054 = C21054.f67913;
        }
        m21948.m4448(c21054);
        m21948.m4440();
        InterfaceC23337 m4984 = C1451.m4984(this.f9131);
        m4984.getClass();
        m4984.m51740();
    }
}
