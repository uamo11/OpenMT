package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: N673 */
/* renamed from: l.ᩳۙᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17832 implements InterfaceC14303 {
    public final InterfaceC14303[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17832(java.util.List r2, boolean r3) {
        /*
            r1 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            l.ܳۙᩴ[] r0 = new l.InterfaceC14303[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            l.ܳۙᩴ[] r2 = (l.InterfaceC14303[]) r2
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17832.<init>(java.util.List, boolean):void");
    }

    public C17832(InterfaceC14303[] interfaceC14303Arr, boolean z) {
        this.a = interfaceC14303Arr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r9.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2 == false) goto L15;
     */
    @Override // l.InterfaceC14303
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(l.C10071 r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 1
            boolean r2 = r7.b
            if (r2 == 0) goto Le
            int r3 = r8.c
            int r3 = r3 + r1
            r8.c = r3
        Le:
            l.ܳۙᩴ[] r3 = r7.a     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2d
            r5 = 0
        L12:
            if (r5 >= r4) goto L25
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r6.l(r8, r9)     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L22
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2c
            goto L27
        L22:
            int r5 = r5 + 1
            goto L12
        L25:
            if (r2 == 0) goto L2c
        L27:
            int r9 = r8.c
            int r9 = r9 - r1
            r8.c = r9
        L2c:
            return r1
        L2d:
            r9 = move-exception
            if (r2 == 0) goto L35
            int r0 = r8.c
            int r0 = r0 - r1
            r8.c = r0
        L35:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17832.l(l.ۤۙᩴ, java.lang.StringBuilder):boolean");
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC14303[] interfaceC14303Arr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c3015.d;
            C16420 c = c3015.c();
            c.getClass();
            C16420 c16420 = new C16420();
            ((HashMap) c16420.a).putAll(c.a);
            c16420.b = c.b;
            c16420.c = c.c;
            c16420.d = c.d;
            arrayList.add(c16420);
            int length = interfaceC14303Arr.length;
            int i3 = i;
            while (i2 < length) {
                i3 = interfaceC14303Arr[i2].m(c3015, charSequence, i3);
                if (i3 < 0) {
                    c3015.d.remove(r8.size() - 1);
                    return i;
                }
                i2++;
            }
            c3015.d.remove(r8.size() - 2);
            return i3;
        }
        int length2 = interfaceC14303Arr.length;
        while (i2 < length2) {
            i = interfaceC14303Arr[i2].m(c3015, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC14303[] interfaceC14303Arr = this.a;
        if (interfaceC14303Arr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : MotionUtils.EASING_TYPE_FORMAT_START);
            for (InterfaceC14303 interfaceC14303 : interfaceC14303Arr) {
                sb.append(interfaceC14303);
            }
            sb.append(z ? "]" : MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
