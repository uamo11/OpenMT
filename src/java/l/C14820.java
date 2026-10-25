package l;

import java.io.IOException;
import java.util.function.Function;

/* compiled from: I6UD */
/* renamed from: l.ܳ᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14820 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f45221;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21605 f45222;

    public C14820(C21605 c21605, Runnable runnable) {
        this.f45222 = c21605;
        this.f45221 = runnable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m35224(C11999 c11999) {
        return m35219(c11999.f35929);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m35219(AbstractC20466 abstractC20466) {
        long m48809;
        this.f45221.run();
        if (abstractC20466 == null) {
            return 0L;
        }
        if (abstractC20466.f65978 >= 0) {
            return abstractC20466.f65978;
        }
        if (abstractC20466 instanceof C21877) {
            C8199 c8199 = ((C21877) abstractC20466).f70059;
            if (c8199 == null || c8199.f25202 != this.f45222) {
                throw new IOException("Text page belongs to another store");
            }
            if (c8199.m21698() < 0) {
                C19489 m3922 = this.f45222.f69370.m3922(c8199);
                try {
                    this.f45222.m48801(c8199, m3922.m44896());
                    m3922.close();
                } catch (Throwable th) {
                    try {
                        m3922.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            abstractC20466.f65978 = c8199.m21698();
            return c8199.m21698();
        }
        C23993 c23993 = (C23993) abstractC20466;
        for (AbstractC20466 abstractC204662 : c23993.f77779) {
            m35219(abstractC204662);
        }
        synchronized (this.f45222.f69370.f4153) {
            C10130 c10130 = new C10130((c23993.f77779.length * 16) + 16);
            c10130.writeInt(c23993.f65975);
            c10130.writeInt(c23993.f77779.length);
            c10130.writeInt(c23993.f65976);
            c10130.writeInt(c23993.f65977);
            for (AbstractC20466 abstractC204663 : c23993.f77779) {
                c10130.m25431(abstractC204663.f65978);
                c10130.writeInt(abstractC204663.f65976);
                c10130.writeInt(abstractC204663.f65977);
            }
            C21605 c21605 = this.f45222;
            long m48810 = c21605.m48810();
            c21605.getClass();
            m48809 = c21605.m48809(m48810, c10130.m25438(), 2, c10130.size());
            c23993.f65978 = m48809;
        }
        return m48809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11999 m35220(C14820 c14820) {
        C21605 c21605 = c14820.f45222;
        return new C11999(null, c21605.f69369, c21605.f69373, c21605);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m35225(long j, long j2, int i, int i2, int i3, C17643 c17643) {
        if (j == 0) {
            if (i != -1 || i2 != 0 || i3 != 0) {
                throw new IOException("Invalid empty recovery root");
            }
            return (C11999) C13843.computeIfAbsent(c17643.f53948, 0L, new Function() { // from class: l.ܽ᩹ᩳ
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C14820.m35220(C14820.this);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
        }
        final AbstractC20466 m35222 = m35222(j, j2, i, true, c17643);
        if (m35222.f65976 != i2 || m35222.f65977 != i3) {
            throw new IOException("Recovery root statistics do not match");
        }
        return (C11999) C13843.computeIfAbsent(c17643.f53948, Long.valueOf(j), new Function() { // from class: l.ᩳ᩹ᩳ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C14820.m35221(C14820.this, m35222);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11999 m35221(C14820 c14820, AbstractC20466 abstractC20466) {
        C21605 c21605 = c14820.f45222;
        return new C11999(abstractC20466, c21605.f69369, c21605.f69373, c21605);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m35222(long j, long j2, int i, boolean z, C17643 c17643) {
        C7493 m48806;
        int i2;
        boolean z2;
        AbstractC20466 c23993;
        C17643 c176432;
        int i3;
        int i4;
        int i5 = i;
        boolean z3 = z;
        this.f45221.run();
        if (i5 < 0 || i5 > 32 || j < 64 || j >= j2) {
            throw new IOException("Invalid recovery tree reference");
        }
        synchronized (this.f45222.f69370.f4153) {
            m48806 = this.f45222.m48806(j);
        }
        long j3 = j + 32;
        if (m48806.f23082 + j3 + 16 > j2 || m48806.f23080 >= c17643.f53945) {
            throw new IOException("Invalid recovery record boundary or identity");
        }
        AbstractC20466 abstractC20466 = (AbstractC20466) c17643.f53947.get(Long.valueOf(j));
        if (abstractC20466 != null) {
            m35223(abstractC20466, i5, z3);
            return abstractC20466;
        }
        c17643.m41292();
        int i6 = 2;
        if (i5 == 0) {
            if (m48806.f23083 != 1 || m48806.f23082 < 16) {
                throw new IOException("Missing recovery text page");
            }
            byte[] bArr = new byte[16];
            synchronized (this.f45222.f69370.f4153) {
                this.f45222.f69371.mo14384(j3, bArr, 0, 16);
            }
            C12951 c12951 = new C12951(bArr);
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            int readInt3 = c12951.readInt();
            int readInt4 = c12951.readInt();
            C21605 c21605 = this.f45222;
            if (readInt != c21605.f69369 || readInt2 < 1 || readInt2 > readInt || readInt3 < 0 || readInt3 > readInt2 || ((readInt4 != 1 && readInt4 != 2) || m48806.f23082 != (readInt2 * readInt4) + 16)) {
                throw new IOException("Invalid recovery text page shape");
            }
            C8199 c8199 = new C8199(c21605, m48806.f23080, j, readInt, readInt2, readInt3, readInt4 == 1);
            C19489 m3922 = this.f45222.f69370.m3922(c8199);
            try {
                c23993 = new C21877(c17643.f53949, c8199);
                m3922.close();
                i3 = i5;
                c176432 = c17643;
                z2 = z3;
            } finally {
            }
        } else {
            if (m48806.f23083 != 2 || (i2 = m48806.f23082) < 16 || i2 > 8192) {
                throw new IOException("Missing recovery index node");
            }
            C5377 m3921 = this.f45222.f69370.m3921(i2 + 16);
            try {
                C12951 c129512 = new C12951(this.f45222.m48802(j, m48806));
                int readInt5 = c129512.readInt();
                int readInt6 = c129512.readInt();
                int readInt7 = c129512.readInt();
                int readInt8 = c129512.readInt();
                if (readInt5 == i5) {
                    if (!z3) {
                        i6 = this.f45222.f69373 / 2;
                    }
                    if (readInt6 >= i6 && readInt6 <= this.f45222.f69373 && m48806.f23082 == (readInt6 * 16) + 16 && readInt7 >= 1 && readInt8 >= 0 && readInt8 <= readInt7) {
                        AbstractC20466[] abstractC20466Arr = new AbstractC20466[readInt6];
                        long j4 = 0;
                        long j5 = 0;
                        int i7 = 0;
                        while (i7 < readInt6) {
                            long readLong = c129512.readLong();
                            int readInt9 = c129512.readInt();
                            int readInt10 = c129512.readInt();
                            int i8 = i7;
                            int i9 = readInt6;
                            boolean z4 = z3;
                            AbstractC20466 m35222 = m35222(readLong, j, i5 - 1, false, c17643);
                            int i10 = m35222.f65976;
                            if (i10 != readInt9 || (i4 = m35222.f65977) != readInt10) {
                                throw new IOException("Recovery child statistics do not match");
                            }
                            abstractC20466Arr[i8] = m35222;
                            j4 += i10;
                            j5 += i4;
                            i7 = i8 + 1;
                            i5 = i;
                            z3 = z4;
                            readInt6 = i9;
                        }
                        z2 = z3;
                        if (j4 != readInt7 || j5 != readInt8 || c129512.available() != 0) {
                            throw new IOException("Invalid recovery index totals");
                        }
                        c176432 = c17643;
                        c23993 = new C23993(c176432.f53949, abstractC20466Arr);
                        m3921.close();
                        i3 = i;
                    }
                }
                throw new IOException("Invalid recovery index shape");
            } finally {
            }
        }
        m35223(c23993, i3, z2);
        c23993.f65978 = j;
        c176432.f53947.put(Long.valueOf(j), c23993);
        return c23993;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35223(AbstractC20466 abstractC20466, int i, boolean z) {
        int i2;
        boolean z2 = abstractC20466 instanceof C21877;
        int length = z2 ? abstractC20466.f65976 : ((C23993) abstractC20466).f77779.length;
        C21605 c21605 = this.f45222;
        int i3 = 2;
        if (z2) {
            if (z) {
                i3 = 1;
            } else {
                i2 = c21605.f69369;
                i3 = i2 / 2;
            }
        } else if (!z) {
            i2 = c21605.f69373;
            i3 = i2 / 2;
        }
        if (abstractC20466.f65975 != i || length < i3) {
            throw new IOException("Invalid recovery node occupancy");
        }
    }
}
