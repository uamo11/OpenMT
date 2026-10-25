package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: N6TT */
/* renamed from: l.ᩳۗᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17789 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17643 f54408;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14260 f54410;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f54411 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f54409 = new HashMap();

    public C17789(C14260 c14260, C17643 c17643) {
        this.f54410 = c14260;
        this.f54408 = c17643;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10734 m41675(long j, long j2) {
        Runnable runnable;
        C21605 c21605;
        C21605 c216052;
        C7493 m48806;
        int i;
        C21605 c216053;
        C21605 c216054;
        runnable = this.f54410.f42949;
        runnable.run();
        if (j < 64 || j >= j2) {
            throw new IOException("Invalid history reference");
        }
        c21605 = this.f54410.f42950;
        synchronized (c21605.f69370.f4153) {
            c216052 = this.f54410.f42950;
            m48806 = c216052.m48806(j);
        }
        if (m48806.f23083 != 5 || (i = m48806.f23082) < 4 || i > 72 || 32 + j + i + 16 > j2 || m48806.f23080 >= this.f54408.f53945) {
            throw new IOException("Invalid history frame boundary");
        }
        c216053 = this.f54410.f42950;
        C5377 m3921 = c216053.f69370.m3921(m48806.f23082 + 16);
        try {
            c216054 = this.f54410.f42950;
            return new C10734(new C12951(c216054.m48802(j, m48806)), m48806.f23082, m3921);
        } catch (IOException | Error | RuntimeException e) {
            m3921.close();
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9365 m41672(int i, long j, long j2, boolean z) {
        int i2;
        C9365 c9365;
        C21605 c21605;
        if (j == 0) {
            return null;
        }
        if (i > 46) {
            throw new IOException("Invalid history sequence depth");
        }
        C10734 m41675 = m41675(j, j2);
        try {
            int readInt = m41675.f32348.readInt();
            if (readInt != (z ? 2 : 4)) {
                if (readInt != (z ? 3 : 5)) {
                    throw new IOException("Invalid history sequence type");
                }
            }
            Object m41670 = m41670(readInt, j);
            if (m41670 != null) {
                C9365 c93652 = (C9365) m41670;
                m41675.close();
                return c93652;
            }
            this.f54408.m41292();
            if (readInt != 2 && readInt != 4) {
                if (m41675.f32347 != 28) {
                    throw new IOException("Invalid history sequence branch");
                }
                int readInt2 = m41675.f32348.readInt();
                int readInt3 = m41675.f32348.readInt();
                long readLong = m41675.f32348.readLong();
                long readLong2 = m41675.f32348.readLong();
                if (readInt2 < 2 || readInt2 > 46 || readInt3 < 2 || readLong == 0 || readLong2 == 0) {
                    throw new IOException("Invalid history sequence metadata");
                }
                if (readInt3 > this.f54408.f53944) {
                    throw new C13842("History logical size limit exceeded");
                }
                int i3 = i + 1;
                i2 = readInt;
                C9365 m41672 = m41672(i3, readLong, j, z);
                C9365 m416722 = m41672(i3, readLong2, j, z);
                if (Math.abs(m41672.f28438 - m416722.f28438) > 1 || readInt2 != Math.max(m41672.f28438, m416722.f28438) + 1 || m41672.f28444 + m416722.f28444 != readInt3) {
                    throw new IOException("Invalid history sequence balance");
                }
                c9365 = new C9365(m41672, m416722);
                c21605 = this.f54410.f42950;
                c9365.f28442 = c21605;
                c9365.f28443 = j;
                this.f54411.put(Long.valueOf(j), new C17083(i2, c9365));
                m41675.close();
                return c9365;
            }
            i2 = readInt;
            if (m41675.f32347 != 12) {
                throw new IOException("Invalid history sequence leaf");
            }
            long readLong3 = m41675.f32348.readLong();
            c9365 = new C9365(z ? m41676(readLong3, j) : m41673(readLong3, j));
            c21605 = this.f54410.f42950;
            c9365.f28442 = c21605;
            c9365.f28443 = j;
            this.f54411.put(Long.valueOf(j), new C17083(i2, c9365));
            m41675.close();
            return c9365;
        } finally {
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8905 m41676(long j, long j2) {
        C21605 c21605;
        C10734 m41675 = m41675(j, j2);
        try {
            C12951 c12951 = m41675.f32348;
            if (c12951.readInt() != 6 || m41675.f32347 != 36) {
                throw new IOException("Invalid history record shape");
            }
            Object m41670 = m41670(6, j);
            if (m41670 != null) {
                C8905 c8905 = (C8905) m41670;
                m41675.close();
                return c8905;
            }
            this.f54408.m41292();
            long readLong = c12951.readLong();
            long readLong2 = c12951.readLong();
            int readInt = c12951.readInt();
            long readLong3 = c12951.readLong();
            int readInt2 = c12951.readInt();
            if (readLong <= 0 || readInt < 0 || readInt > 1 || readInt2 <= 0) {
                throw new IOException("Invalid history record metadata");
            }
            if (readInt2 <= this.f54408.f53944) {
                C15713 c15713 = new C15713(m41672(0, readLong3, j, false));
                if (c15713.m37046() != readInt2) {
                    throw new IOException("History change count mismatch");
                }
                C8905 c89052 = new C8905(readLong, readLong2, readInt == 0 ? EnumC14051.USER : EnumC14051.BATCH, c15713);
                c21605 = this.f54410.f42950;
                c89052.f27085 = c21605;
                c89052.f27086 = j;
                this.f54411.put(Long.valueOf(j), new C17083(6, c89052));
                m41675.close();
                return c89052;
            }
            throw new C13842("History change count limit exceeded");
        } catch (Throwable th) {
            try {
                m41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23224 m41673(long j, long j2) {
        C14820 c14820;
        C14820 c148202;
        C21605 c21605;
        C10734 m41675 = m41675(j, j2);
        try {
            C12951 c12951 = m41675.f32348;
            if (c12951.readInt() != 7 || m41675.f32347 != 72) {
                throw new IOException("Invalid history change shape");
            }
            Object m41670 = m41670(7, j);
            if (m41670 != null) {
                C23224 c23224 = (C23224) m41670;
                m41675.close();
                return c23224;
            }
            this.f54408.m41292();
            int readInt = c12951.readInt();
            long readLong = c12951.readLong();
            long readLong2 = c12951.readLong();
            C5089 m41671 = m41671(c12951);
            long readLong3 = c12951.readLong();
            int readInt2 = c12951.readInt();
            int readInt3 = c12951.readInt();
            int readInt4 = c12951.readInt();
            c14820 = this.f54410.f42951;
            C11999 m35225 = c14820.m35225(readLong3, j, readInt4, readInt2, readInt3, this.f54408);
            long readLong4 = c12951.readLong();
            int readInt5 = c12951.readInt();
            int readInt6 = c12951.readInt();
            int readInt7 = c12951.readInt();
            c148202 = this.f54410.f42951;
            C11999 m352252 = c148202.m35225(readLong4, j, readInt7, readInt5, readInt6, this.f54408);
            if (readInt >= 0) {
                long j3 = readInt;
                if (m35225.m29347() + j3 <= 2147483647L && j3 + m352252.m29347() <= 2147483647L && readLong >= 0 && readLong2 >= 0) {
                    C23224 c232242 = new C23224(readInt, readLong, readLong2, m41671, m35225, m352252);
                    c21605 = this.f54410.f42950;
                    c232242.f74641 = c21605;
                    c232242.f74642 = j;
                    this.f54411.put(Long.valueOf(j), new C17083(7, c232242));
                    m41675.close();
                    return c232242;
                }
            }
            throw new IOException("Invalid history change metadata");
        } catch (Throwable th) {
            try {
                m41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5089 m41671(C12951 c12951) {
        final int readInt = c12951.readInt();
        final int readInt2 = c12951.readInt();
        if (readInt < -1 || readInt2 < -1) {
            throw new IOException("Invalid history selection");
        }
        return (C5089) C13843.computeIfAbsent(this.f54409, Long.valueOf((readInt << 32) | (readInt2 & 4294967295L)), new Function() { // from class: l.ܽۗᩳ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new C5089(readInt, readInt2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m41670(int i, long j) {
        int i2;
        Object obj;
        C17083 c17083 = (C17083) this.f54411.get(Long.valueOf(j));
        if (c17083 == null) {
            return null;
        }
        i2 = c17083.f52387;
        if (i2 != i) {
            throw new IOException("Conflicting history reference types");
        }
        obj = c17083.f52388;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        throw new java.io.IOException("Invalid historical edit mark");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m41674(l.C15713 r10, l.C15713 r11, long r12, long r14) {
        /*
            r9 = this;
            int r0 = r10.m37046()
            long r0 = (long) r0
            int r2 = r11.m37046()
            long r2 = (long) r2
            long r0 = r0 + r2
            l.ܿ᩹ᩳ r2 = r9.f54408
            int r3 = r2.f53944
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto Lba
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r10
            r10 = 1
            r3[r10] = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r1)
        L27:
            if (r4 >= r1) goto L30
            r5 = r3[r4]
            int r4 = l.C8954.m23073(r5, r11, r5, r4, r10)
            goto L27
        L30:
            java.util.List r10 = l.C20195.unmodifiableList(r11)
            java.util.Iterator r10 = r10.iterator()
            r3 = 0
        L3a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb9
            java.lang.Object r11 = r10.next()
            l.ܺۙᩳ r11 = (l.C15713) r11
            java.util.Iterator r11 = r11.iterator()
        L4a:
            r1 = r11
            l.᩷ۙᩳ r1 = (l.C20654) r1
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r1 = r1.next()
            l.ۡ۬ᩳ r1 = (l.C8905) r1
            long r5 = r1.f27082
            l.ܺۙᩳ r1 = r1.f27081
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto Lb1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = r0.add(r5)
            if (r5 == 0) goto Lb1
            int r5 = r1.m37046()
            long r5 = (long) r5
            long r3 = r3 + r5
            int r5 = r2.f53944
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto La9
            java.util.Iterator r1 = r1.iterator()
        L7c:
            r5 = r1
            l.᩷ۙᩳ r5 = (l.C20654) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r5 = r5.next()
            l.᩺᩶ᩳ r5 = (l.C23224) r5
            l.ܳۗᩳ r6 = r9.f54410
            java.lang.Runnable r6 = l.C14260.m33904(r6)
            r6.run()
            long r6 = r5.f74640
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 > 0) goto La1
            long r5 = r5.f74638
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 > 0) goto La1
            goto L7c
        La1:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid historical edit mark"
            r10.<init>(r11)
            throw r10
        La9:
            l.ܰ۬ᩳ r10 = new l.ܰ۬ᩳ
            java.lang.String r11 = "History replay size limit exceeded"
            r10.<init>(r11)
            throw r10
        Lb1:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid history record identity"
            r10.<init>(r11)
            throw r10
        Lb9:
            return
        Lba:
            l.ܰ۬ᩳ r10 = new l.ܰ۬ᩳ
            java.lang.String r11 = "History record count limit exceeded"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17789.m41674(l.ܺۙᩳ, l.ܺۙᩳ, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        throw new java.io.IOException("Historical selection exceeds text length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        throw new java.io.IOException("Historical selection exceeds text length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        throw new java.io.IOException("History range exceeds replayed text");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m41669(l.C15713 r12, int r13, boolean r14, java.lang.Runnable r15) {
        /*
            r12.getClass()
            l.᩷ۙᩳ r0 = new l.᩷ۙᩳ
            r1 = 1
            r0.<init>(r12, r1)
        L9:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto La6
            java.lang.Object r12 = r0.next()
            l.ۡ۬ᩳ r12 = (l.C8905) r12
            l.ܺۙᩳ r12 = r12.f27081
            if (r14 == 0) goto L1e
            java.util.Iterator r12 = r12.iterator()
            goto L27
        L1e:
            r12.getClass()
            l.᩷ۙᩳ r2 = new l.᩷ۙᩳ
            r2.<init>(r12, r1)
            r12 = r2
        L27:
            r2 = r12
            l.᩷ۙᩳ r2 = (l.C20654) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            r15.run()
            java.lang.Object r2 = r2.next()
            l.᩺᩶ᩳ r2 = (l.C23224) r2
            l.ۨ᩹ᩳ r3 = r2.f74636
            l.ۨ᩹ᩳ r4 = r2.f74639
            l.ۚۗᩳ r5 = r2.f74643
            java.lang.String r6 = "Historical selection exceeds text length"
            if (r14 == 0) goto L56
            int r7 = r5.m14642()
            if (r7 > r13) goto L50
            int r7 = r5.m14640()
            if (r7 > r13) goto L50
            goto L56
        L50:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L56:
            if (r14 == 0) goto L5d
            int r7 = r4.m29347()
            goto L61
        L5d:
            int r7 = r3.m29347()
        L61:
            if (r14 == 0) goto L68
            int r3 = r3.m29347()
            goto L6c
        L68:
            int r3 = r4.m29347()
        L6c:
            int r2 = r2.f74637
            if (r2 > r13) goto L9e
            int r2 = r13 - r2
            if (r7 > r2) goto L9e
            long r8 = (long) r13
            long r10 = (long) r7
            long r8 = r8 - r10
            long r2 = (long) r3
            long r8 = r8 + r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r13 > 0) goto L96
            int r13 = (int) r8
            if (r14 != 0) goto L27
            int r2 = r5.m14642()
            if (r2 > r13) goto L90
            int r2 = r5.m14640()
            if (r2 > r13) goto L90
            goto L27
        L90:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r6)
            throw r12
        L96:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "History replay exceeds coordinate limit"
            r12.<init>(r13)
            throw r12
        L9e:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "History range exceeds replayed text"
            r12.<init>(r13)
            throw r12
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17789.m41669(l.ܺۙᩳ, int, boolean, java.lang.Runnable):void");
    }
}
