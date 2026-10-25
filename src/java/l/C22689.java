package l;

import java.util.Arrays;

/* compiled from: N673 */
/* renamed from: l.᩺֫᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22689 extends AbstractC21442 {
    public C4964 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۖܰᩴ, l.ۙ᩺ᩴ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۖܰᩴ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ۖܰᩴ] */
    @Override // l.AbstractC6024, l.InterfaceC0585
    public final void c(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new AbstractC2576();
        } else {
            r0 = new C4964((int) j);
        }
        this.c = r0;
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
    public final void end() {
        long[] jArr = (long[]) this.c.b();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC0585 interfaceC0585 = this.a;
        interfaceC0585.c(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC0585.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC0585.f()) {
                    break;
                }
                interfaceC0585.accept(j);
                i++;
            }
        }
        interfaceC0585.end();
    }

    @Override // l.InterfaceC14696, l.InterfaceC0585
    public final void accept(long j) {
        this.c.accept(j);
    }
}
