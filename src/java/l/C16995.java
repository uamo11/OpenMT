package l;

import java.util.List;

/* compiled from: J8LX */
/* renamed from: l.ܿ֡ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16995 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14172 f52127 = new C14172(null, 0, "audio/ac4");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f52128 = new C17714(16384);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52129;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r5.mo22066();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if ((r4 - r3) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        return false;
     */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4841(l.InterfaceC8424 r15) {
        /*
            r14 = this;
            l.ᩳ֨֫ r0 = new l.ᩳ֨֫
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.m41482()
            r5 = r15
            l.ܺ᩷ۧ r5 = (l.C16184) r5
            r5.mo22068(r2, r2, r1, r4)
            r0.m41484(r2)
            int r4 = r0.m41491()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L98
            r5.mo22066()
            r5.mo22067(r3, r2)
            r4 = r3
        L27:
            r15 = 0
        L28:
            byte[] r1 = r0.m41482()
            r6 = 7
            r5.mo22068(r2, r2, r6, r1)
            r0.m41484(r2)
            int r1 = r0.m41464()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r1 == r8) goto L51
            if (r1 == r9) goto L51
            r5.mo22066()
            int r4 = r4 + 1
            int r15 = r4 - r3
            r1 = 8192(0x2000, float:1.148E-41)
            if (r15 < r1) goto L4d
            goto L91
        L4d:
            r5.mo22067(r4, r2)
            goto L27
        L51:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L57
            return r8
        L57:
            byte[] r8 = r0.m41482()
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L61
            r1 = -1
            goto L8f
        L61:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L88
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L89
        L88:
            r6 = 4
        L89:
            if (r1 != r9) goto L8d
            int r6 = r6 + 2
        L8d:
            int r1 = r11 + r6
        L8f:
            if (r1 != r12) goto L92
        L91:
            return r2
        L92:
            int r1 = r1 + (-7)
            r5.mo22067(r1, r2)
            goto L28
        L98:
            r0.m41478(r7)
            int r4 = r0.m41467()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo22067(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16995.mo4841(l.۠᩷ۧ):boolean");
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f52127.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
        interfaceC21830.mo3430(new C20794(-9223372036854775807L));
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f52129 = false;
        this.f52127.mo1000();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        C17714 c17714 = this.f52128;
        int read = interfaceC8424.read(c17714.m41482(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        c17714.m41484(0);
        c17714.m41486(read);
        boolean z = this.f52129;
        C14172 c14172 = this.f52127;
        if (!z) {
            c14172.mo1001(4, 0L);
            this.f52129 = true;
        }
        c14172.mo1002(c17714);
        return 0;
    }
}
