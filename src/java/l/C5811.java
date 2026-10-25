package l;

import java.util.List;

/* compiled from: P8MK */
/* renamed from: l.ۛۘۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5811 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16314(l.InterfaceC13571 r13, l.C21062 r14, l.InterfaceC23483 r15) {
        /*
            long r0 = r14.f67934
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            r5 = 0
            goto L27
        Le:
            int r5 = r13.mo4659(r0)
            r6 = -1
            if (r5 != r6) goto L19
            int r5 = r13.mo4658()
        L19:
            if (r5 <= 0) goto L27
            int r6 = r5 + (-1)
            long r6 = r13.mo4660(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L27
            int r5 = r5 + (-1)
        L27:
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L52
            int r3 = r13.mo4658()
            if (r5 >= r3) goto L52
            java.util.List r11 = r13.mo4661(r0)
            long r3 = r13.mo4660(r5)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L52
            long r7 = r14.f67934
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 >= 0) goto L52
            l.۬ۘۧ r12 = new l.۬ۘۧ
            long r9 = r3 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r3 = 1
            goto L53
        L52:
            r3 = 0
        L53:
            r4 = r5
        L54:
            int r6 = r13.mo4658()
            if (r4 >= r6) goto L60
            m16313(r13, r4, r15)
            int r4 = r4 + 1
            goto L54
        L60:
            boolean r14 = r14.f67933
            if (r14 == 0) goto L89
            if (r3 == 0) goto L68
            int r5 = r5 + (-1)
        L68:
            if (r2 >= r5) goto L70
            m16313(r13, r2, r15)
            int r2 = r2 + 1
            goto L68
        L70:
            if (r3 == 0) goto L89
            l.۬ۘۧ r14 = new l.۬ۘۧ
            java.util.List r11 = r13.mo4661(r0)
            long r7 = r13.mo4660(r5)
            long r2 = r13.mo4660(r5)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5811.m16314(l.ܰۘۧ, l.᩷ᩴۧ, l.᩻ۚ֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16313(InterfaceC13571 interfaceC13571, int i, InterfaceC23483 interfaceC23483) {
        long mo4660 = interfaceC13571.mo4660(i);
        List mo4661 = interfaceC13571.mo4661(mo4660);
        if (mo4661.isEmpty()) {
            return;
        }
        if (i == interfaceC13571.mo4658() - 1) {
            throw new IllegalStateException();
        }
        long mo46602 = interfaceC13571.mo4660(i + 1) - interfaceC13571.mo4660(i);
        if (mo46602 > 0) {
            interfaceC23483.accept(new C12866(mo4660, mo46602, mo4661));
        }
    }
}
