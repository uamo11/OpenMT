package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: 88N4 */
/* renamed from: l.ܽᩴۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16827 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f51646;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9773 f51647;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f51648;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f51655 = C3603.f11423;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f51653 = new C17714();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8353 f51649 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51651 = new ArrayList();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f51650 = 0;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long[] f51654 = C3603.f11420;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51652 = -9223372036854775807L;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return true;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C16827(InterfaceC9773 interfaceC9773) {
        this.f51647 = interfaceC9773;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        C22632.m50634(this.f51650 == 0);
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(0, 3);
        this.f51648 = mo3429;
        C8353 c8353 = this.f51649;
        if (c8353 != null) {
            mo3429.mo8456(c8353);
            interfaceC21830.mo3431();
            interfaceC21830.mo3430(new C17971(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f51650 = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r22.f51646 != r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        r5 = r22.f51652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
    
        if (r5 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0083, code lost:
    
        r2 = l.C21062.m47907(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        r22.f51647.mo6618(r22.f51655, 0, r22.f51646, r2, new l.C2184(2, r22));
        java.util.Collections.sort(r4);
        r22.f51654 = new long[r4.size()];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (r2 >= r4.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ba, code lost:
    
        r5 = r22.f51654;
        r6 = ((l.C11184) r4.get(r2)).f33573;
        r5[r2] = r6;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        r22.f51655 = l.C3603.f11423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        r22.f51650 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
    
        r2 = l.C21062.m47908();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        throw l.C9080.m23440("SubtitleParser failed.", r0);
     */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r23, l.C23615 r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16827.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        int i = this.f51650;
        C22632.m50634((i == 0 || i == 5) ? false : true);
        this.f51652 = j2;
        if (this.f51650 == 2) {
            this.f51650 = 1;
        }
        if (this.f51650 == 4) {
            this.f51650 = 3;
        }
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
        if (this.f51650 == 5) {
            return;
        }
        this.f51647.reset();
        this.f51650 = 5;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39575(C16827 c16827, C12866 c12866) {
        C11184 c11184 = new C11184(c12866.f38639, C2989.m9124(c12866.f38637, c12866.f38636));
        c16827.f51651.add(c11184);
        long j = c16827.f51652;
        if (j == -9223372036854775807L || c12866.f38638 >= j) {
            c16827.m39574(c11184);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39574(C11184 c11184) {
        byte[] bArr;
        byte[] bArr2;
        long j;
        C22632.m50632(this.f51648);
        bArr = c11184.f33572;
        int length = bArr.length;
        bArr2 = c11184.f33572;
        C17714 c17714 = this.f51653;
        c17714.getClass();
        c17714.m41462(bArr2.length, bArr2);
        this.f51648.mo8453(length, c17714);
        InterfaceC19383 interfaceC19383 = this.f51648;
        j = c11184.f33573;
        interfaceC19383.mo8455(j, 1, length, 0, null);
    }
}
