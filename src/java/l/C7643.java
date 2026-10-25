package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: 195F */
/* renamed from: l.۟ᩳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C7643 extends AbstractC6138 {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f23608 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20439(BufferedInputStream bufferedInputStream, AbstractC15440 abstractC15440, long j, C19277 c19277) {
        OutputStream mo23555 = abstractC15440.mo23555(false);
        try {
            byte[] bArr = new byte[1024];
            while (j > 0) {
                int read = bufferedInputStream.read(bArr, 0, (int) Math.min(1024, j));
                if (read == -1) {
                    break;
                }
                c19277.m44460(read);
                mo23555.write(bArr, 0, read);
                j -= read;
                if (mo1526()) {
                    break;
                }
            }
            if (mo23555 != null) {
                mo23555.close();
            }
            if (mo1526()) {
                abstractC15440.mo23552();
            } else {
                this.f23608.add(abstractC15440.getName());
            }
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76960;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, C9523.m24404(m11556("file")), C4925.m14327(R.string.MT_Protector_res_0x7f120a8e));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1209cf);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440 m11515 = m11515("file");
        C20344 c20344 = (C20344) m11529("arguments");
        String m11556 = m11556("pattern");
        C17721.m41504(m11515, EnumC16309.MODIFY_DIRECTORY);
        try {
            if (!c20344.m46667()) {
                m20440(m11515, c20344, m11556);
            } else {
                long mo23127 = m11515.mo23127();
                C19277 c19277 = new C19277(mo23127 > 4611686018427387903L ? C13132.FOREVER_NS : mo23127 * 2);
                c19277.m44459(new C23786(3, this));
                C14677.m34979(new C12582(m11515), new C13992(this, m11515, m11556), c20344, c19277, new C23674(this));
            }
        } catch (C11877 unused) {
        }
        if (!mo1526() && c20344.f65669) {
            m11515.mo27929();
        }
        return m11545();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0036, code lost:
    
        if (r0 == 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0038, B:10:0x004b, B:12:0x005c, B:14:0x0062, B:18:0x007e, B:22:0x0090, B:24:0x0087, B:25:0x0075, B:27:0x0079, B:36:0x003b), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:8:0x0038, B:10:0x004b, B:12:0x005c, B:14:0x0062, B:18:0x007e, B:22:0x0090, B:24:0x0087, B:25:0x0075, B:27:0x0079, B:36:0x003b), top: B:2:0x001a }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20440(l.AbstractC15440 r19, l.C20344 r20, java.lang.String r21) {
        /*
            r18 = this;
            r7 = r18
            r0 = r20
            long r1 = r19.mo23127()
            l.᩵ۛۡ r8 = new l.᩵ۛۡ
            r8.<init>(r1)
            l.᩻ܶ᩷ r3 = new l.᩻ܶ᩷
            r4 = 3
            r3.<init>(r4, r7)
            r8.m44459(r3)
            java.io.BufferedInputStream r9 = r19.m36518()
            int r3 = r0.f65671     // Catch: java.lang.Throwable -> La2
            r10 = 1
            if (r3 != 0) goto L3b
            int r3 = r0.f65665     // Catch: java.lang.Throwable -> La2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La2
            int r0 = r0.f65672     // Catch: java.lang.Throwable -> La2
            int r0 = r0 * 10
            long r5 = r10 << r0
            long r3 = r3 * r5
            long r5 = r1 / r3
            int r0 = (int) r5     // Catch: java.lang.Throwable -> La2
            long r5 = (long) r0     // Catch: java.lang.Throwable -> La2
            long r5 = r5 * r3
            int r12 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r12 == 0) goto L36
            goto L38
        L36:
            if (r0 != 0) goto L4a
        L38:
            int r0 = r0 + 1
            goto L4a
        L3b:
            int r0 = r0.f65666     // Catch: java.lang.Throwable -> La2
            long r3 = (long) r0     // Catch: java.lang.Throwable -> La2
            long r3 = r1 / r3
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 >= 0) goto L4a
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L4a
            r12 = r10
            goto L4b
        L4a:
            r12 = r3
        L4b:
            long r3 = (long) r0     // Catch: java.lang.Throwable -> La2
            long r3 = r3 * r12
            long r1 = r1 - r3
            int r14 = (int) r1     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> La2
            int r15 = r1.length()     // Catch: java.lang.Throwable -> La2
            r1 = 1
            r6 = 1
        L5a:
            if (r6 > r0) goto L9e
            boolean r1 = r18.mo1526()     // Catch: java.lang.Throwable -> La2
            if (r1 != 0) goto L9e
            r4 = r21
            java.lang.String r1 = m20442(r6, r15, r4)     // Catch: java.lang.Throwable -> La2
            r7.mo11520(r1)     // Catch: java.lang.Throwable -> La2
            if (r6 != r0) goto L75
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L72:
            r16 = r2
            goto L7e
        L75:
            int r2 = r0 - r6
            if (r2 >= r14) goto L7c
            long r2 = r12 + r10
            goto L72
        L7c:
            r16 = r12
        L7e:
            java.lang.String r2 = r19.getParent()     // Catch: java.lang.Throwable -> La2
            if (r2 != 0) goto L87
            r1 = 0
        L85:
            r3 = r1
            goto L90
        L87:
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> La2
            l.ܶ᩵ܿ r1 = l.C16999.m39866(r2, r1)     // Catch: java.lang.Throwable -> La2
            goto L85
        L90:
            r1 = r18
            r2 = r9
            r4 = r16
            r16 = r6
            r6 = r8
            r1.m20439(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> La2
            int r6 = r16 + 1
            goto L5a
        L9e:
            r9.close()
            return
        La2:
            r0 = move-exception
            r1 = r0
            r9.close()     // Catch: java.lang.Throwable -> La8
            goto Lad
        La8:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        Lad:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7643.m20440(l.ܶ᩵ܿ, l.᩶ᩳ᩻, java.lang.String):void");
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        ArrayList arrayList = this.f23608;
        if (arrayList.isEmpty() || !m11542(c16560)) {
            return;
        }
        c16560.m39000((Collection) arrayList);
        c16560.m39015();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m20442(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, '0');
        }
        return str.replace("{D}", sb.toString());
    }
}
