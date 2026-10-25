package l;

import java.util.List;

/* compiled from: 98TO */
/* renamed from: l.ܽ֡ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16289 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17701 f50080 = new C17701("audio/ac3");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f50081 = new C17714(2786);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50082;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r5.mo22066();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4841(l.InterfaceC8424 r8) {
        /*
            r7 = this;
            l.ᩳ֨֫ r0 = new l.ᩳ֨֫
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.m41482()
            r5 = r8
            l.ܺ᩷ۧ r5 = (l.C16184) r5
            r5.mo22068(r2, r2, r1, r4)
            r0.m41484(r2)
            int r4 = r0.m41491()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L62
            r5.mo22066()
            r5.mo22067(r3, r2)
            r4 = r3
        L26:
            r8 = 0
        L27:
            byte[] r1 = r0.m41482()
            r6 = 6
            r5.mo22068(r2, r2, r6, r1)
            r0.m41484(r2)
            int r1 = r0.m41464()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r1 == r6) goto L4a
            r5.mo22066()
            int r4 = r4 + 1
            int r8 = r4 - r3
            r1 = 8192(0x2000, float:1.148E-41)
            if (r8 < r1) goto L46
            goto L5b
        L46:
            r5.mo22067(r4, r2)
            goto L26
        L4a:
            r1 = 1
            int r8 = r8 + r1
            r6 = 4
            if (r8 < r6) goto L50
            return r1
        L50:
            byte[] r1 = r0.m41482()
            int r1 = l.C5893.m16512(r1)
            r6 = -1
            if (r1 != r6) goto L5c
        L5b:
            return r2
        L5c:
            int r1 = r1 + (-6)
            r5.mo22067(r1, r2)
            goto L27
        L62:
            r4 = 3
            r0.m41478(r4)
            int r4 = r0.m41467()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo22067(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16289.mo4841(l.۠᩷ۧ):boolean");
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f50080.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
        interfaceC21830.mo3430(new C20794(-9223372036854775807L));
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f50082 = false;
        this.f50080.mo1000();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        C17714 c17714 = this.f50081;
        int read = interfaceC8424.read(c17714.m41482(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        c17714.m41484(0);
        c17714.m41486(read);
        boolean z = this.f50082;
        C17701 c17701 = this.f50080;
        if (!z) {
            c17701.mo1001(4, 0L);
            this.f50082 = true;
        }
        c17701.mo1002(c17714);
        return 0;
    }
}
