package l;

import java.io.DataInput;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: D70T */
/* renamed from: l.ۢۧܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9547 implements AutoCloseable {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12532[] f28953;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f28954;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DataInput f28955;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC6724 f28958;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21896 f28959;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5477 f28960;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17307 f28961;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f28963;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21541 f28962 = new C21541();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28952 = new ArrayList();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28951 = new ArrayList();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9047[] f28957 = new C9047[0];

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean[] f28950 = new boolean[0];

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6018[] f28956 = new C6018[0];

    public C9547(C5477 c5477, DataInput dataInput, C12532[] c12532Arr, C21896 c21896, C17307 c17307) {
        this.f28960 = c5477;
        this.f28955 = dataInput;
        this.f28953 = c12532Arr;
        this.f28959 = c21896;
        this.f28961 = c17307;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24424() {
        DataInput dataInput = this.f28955;
        int readInt = dataInput.readInt();
        if (readInt < 0 || readInt > 1048576) {
            throw C18177.m42352("Invalid delta table size");
        }
        long m45094 = C19631.m45094(readInt);
        C17307 c17307 = this.f28961;
        c17307.m40619(m45094);
        this.f28957 = new C9047[readInt];
        this.f28950 = new boolean[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInput.readInt();
            if (readInt2 <= 0) {
                throw C18177.m42352("Invalid delta table payload length");
            }
            C9047[] c9047Arr = this.f28957;
            int min = Math.min(65536, readInt2);
            byte[] bArr = new byte[min];
            C9047 c9047 = null;
            C21896 c21896 = this.f28959;
            if (c21896 == null) {
                long j = (readInt2 + 65535) / 65536;
                if (j > 1) {
                    c17307.m40619(C19631.m45094(j - 1));
                }
                while (readInt2 > 0) {
                    int min2 = Math.min(min, readInt2);
                    dataInput.readFully(bArr, 0, min2);
                    c9047 = C19631.m45139(c9047, this.f28962.m48697(min2, bArr));
                    readInt2 -= min2;
                }
            } else {
                if (this.f28958 == null) {
                    this.f28958 = c21896.m49276();
                }
                InterfaceC14484 mo18294 = this.f28958.mo18294(readInt2);
                int i2 = readInt2;
                while (i2 > 0) {
                    int min3 = Math.min(min, i2);
                    dataInput.readFully(bArr, 0, min3);
                    mo18294.mo31883(min3, bArr);
                    i2 -= min3;
                }
                mo18294.finish();
                if (mo18294.position() != readInt2) {
                    throw C18177.m42352("Incomplete delta table payload");
                }
                InterfaceC18883 mo31882 = mo18294.mo31882();
                C11003.requireNonNull(mo31882, "checkpoint delta source");
                this.f28952.add(mo31882);
                c9047 = C19631.m45108(new C21042(mo31882, 0, readInt2, null));
            }
            c9047Arr[i] = c9047;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24425() {
        DataInput dataInput = this.f28955;
        int readInt = dataInput.readInt();
        if (readInt >= 0) {
            int i = 1048576;
            if (readInt <= 1048576) {
                long j = readInt * 24;
                C17307 c17307 = this.f28961;
                c17307.m40619(16 + j);
                ArrayList arrayList = this.f28951;
                arrayList.ensureCapacity(readInt);
                this.f28963 = j;
                String str = "Replacement recipe table exceeds memory limit";
                long j2 = 67108864;
                if (j > 67108864) {
                    throw C18177.m42352("Replacement recipe table exceeds memory limit");
                }
                this.f28956 = new C6018[readInt];
                int i2 = 0;
                while (i2 < readInt) {
                    int readInt2 = dataInput.readInt();
                    int readInt3 = dataInput.readInt();
                    int readInt4 = dataInput.readInt();
                    int readInt5 = dataInput.readInt();
                    if (readInt2 >= 0 && readInt3 > 0 && readInt4 > 0 && readInt5 >= 0) {
                        long j3 = readInt5;
                        if (j3 <= j2) {
                            ArrayList arrayList2 = arrayList;
                            String str2 = str;
                            long m3495 = C1005.m3495(this.f28963, C1005.m3495(j3, 64L));
                            this.f28963 = m3495;
                            if (m3495 > 67108864) {
                                throw C18177.m42352(str2);
                            }
                            c17307.m40619(C1005.m3495(j3, 64L));
                            byte[] bArr = new byte[readInt5];
                            dataInput.readFully(bArr);
                            int readInt6 = dataInput.readInt();
                            if (readInt6 <= 0 || readInt6 > i) {
                                throw C18177.m42352("Invalid replacement recipe index size");
                            }
                            c17307.m40619(C18177.m42299(readInt6));
                            AbstractC11164[] abstractC11164Arr = new AbstractC11164[readInt6];
                            long[] jArr = new long[readInt6];
                            long j4 = 0;
                            int i3 = -1;
                            int i4 = 0;
                            long j5 = 0;
                            while (i4 < readInt6) {
                                int i5 = readInt;
                                byte[] bArr2 = bArr;
                                AbstractC11164 m27687 = AbstractC11164.m27687(dataInput, 0, c17307);
                                int mo21899 = m27687.mo21899(0);
                                if (mo21899 < 0 || (i4 != 0 && mo21899 <= i3)) {
                                    throw C18177.m42352("Replacement recipe starts are not sorted");
                                }
                                i3 = m27687.mo21899(m27687.mo21898() - 1);
                                DataInput dataInput2 = dataInput;
                                j4 = C1005.m3495(j4, m27687.mo21890());
                                if (C18177.m42301(readInt6, j4) > 67108864) {
                                    throw C18177.m42352("Replacement recipe index exceeds memory limit");
                                }
                                j5 = C1005.m3495(j5, m27687.mo21898());
                                abstractC11164Arr[i4] = m27687;
                                jArr[i4] = j5;
                                i4++;
                                readInt = i5;
                                bArr = bArr2;
                                dataInput = dataInput2;
                            }
                            DataInput dataInput3 = dataInput;
                            int i6 = readInt;
                            byte[] bArr3 = bArr;
                            C13073 c13073 = new C13073(abstractC11164Arr, jArr, j5, C18177.m42301(readInt6, j4));
                            long m34952 = C1005.m3495(this.f28963, c13073.m31678());
                            this.f28963 = m34952;
                            if (m34952 > 67108864) {
                                throw C18177.m42352(str2);
                            }
                            C6018 c6018 = new C6018(m24420(readInt2, dataInput3.readInt(), i2), readInt2, readInt3, readInt4, bArr3, c13073);
                            this.f28956[i2] = c6018;
                            arrayList2.add(c6018);
                            i2++;
                            i = 1048576;
                            j2 = 67108864;
                            str = str2;
                            readInt = i6;
                            arrayList = arrayList2;
                            dataInput = dataInput3;
                        }
                    }
                    throw C18177.m42352("Invalid replacement recipe header");
                }
                return;
            }
        }
        throw C18177.m42352("Invalid recipe table size");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 m24420(int i, int i2, int i3) {
        long j;
        C6018 c6018;
        C9047 m45108;
        int i4;
        int readInt;
        C9047 m451082;
        int i5 = i;
        int i6 = i2;
        if (i6 < 0 || (i5 != 0 ? i6 == 0 || i6 > i5 : i6 != 0)) {
            throw C18177.m42352("Invalid extent count");
        }
        if (C19631.m45094(i6) > 67108864) {
            throw C18177.m42352("Span structure exceeds memory limit");
        }
        C9047 c9047 = null;
        long j2 = 0;
        int i7 = 0;
        while (i7 < i6) {
            DataInput dataInput = this.f28955;
            int readUnsignedByte = dataInput.readUnsignedByte();
            int i8 = (int) (i5 - j2);
            C12532[] c12532Arr = this.f28953;
            C17307 c17307 = this.f28961;
            if (readUnsignedByte == 1) {
                int readInt2 = dataInput.readInt();
                readInt = dataInput.readInt();
                C18177.m42317(readInt, i8);
                long j3 = readInt2 + readInt;
                if (readInt2 >= 0) {
                    C5477 c5477 = this.f28960;
                    j = j2;
                    if (j3 <= c5477.length()) {
                        c17307.m40619(C19631.m45094(1L));
                        m451082 = C19631.m45108(new C21042(c5477, readInt2, readInt, C17513.m40906(dataInput, readInt2, readInt, c12532Arr, c17307)));
                    }
                }
                throw C18177.m42352("BASE range is outside source");
            }
            j = j2;
            if (readUnsignedByte == 2) {
                int readInt3 = dataInput.readInt();
                if (readInt3 >= 0) {
                    C9047[] c9047Arr = this.f28957;
                    if (readInt3 < c9047Arr.length) {
                        m45108 = c9047Arr[readInt3];
                        i4 = m45108 == null ? 0 : m45108.f27431;
                        C18177.m42317(i4, i8);
                        if (this.f28950[readInt3]) {
                            c17307.m40619(C19631.m45118(m45108));
                        }
                        this.f28950[readInt3] = true;
                    }
                }
                throw C18177.m42352("Invalid delta identity");
            }
            if (readUnsignedByte == 3) {
                byte readByte = dataInput.readByte();
                readInt = dataInput.readInt();
                C18177.m42317(readInt, i8);
                c17307.m40619(C19631.m45094(1L));
                m451082 = C19631.m45107(new C20130(readByte, readInt));
            } else if (readUnsignedByte == 5) {
                byte readByte2 = dataInput.readByte();
                readInt = dataInput.readInt();
                C18177.m42317(readInt, i8);
                c17307.m40619(C19631.m45094(1L));
                C17513 m40906 = C17513.m40906(dataInput, 0, readInt, c12532Arr, c17307);
                if (m40906 == null) {
                    throw C18177.m42352("Patched FILL has no patches");
                }
                m451082 = C19631.m45108(new C21042(new C20130(readByte2, readInt), 0, readInt, m40906));
            } else {
                if (readUnsignedByte != 4) {
                    throw C18177.m42352(C19370.m44628(readUnsignedByte, "Unknown extent tag "));
                }
                int readInt4 = dataInput.readInt();
                int readInt5 = dataInput.readInt();
                int readInt6 = dataInput.readInt();
                C18177.m42317(readInt6, i8);
                if (readInt4 < 0 || readInt4 >= i3 || (c6018 = this.f28956[readInt4]) == null || readInt5 < 0 || readInt5 + readInt6 > c6018.length()) {
                    throw C18177.m42352("Invalid replacement recipe extent");
                }
                C17513 m409062 = C17513.m40906(dataInput, readInt5, readInt6, c12532Arr, c17307);
                c17307.m40619(C19631.m45094(1L));
                m45108 = C19631.m45108(new C21042(this.f28956[readInt4], readInt5, readInt6, m409062));
                i4 = readInt6;
            }
            c9047 = C19631.m45139(c9047, m45108);
            j2 = j + i4;
            i7++;
            i5 = i;
            i6 = i2;
            m45108 = m451082;
            i4 = readInt;
            c9047 = C19631.m45139(c9047, m45108);
            j2 = j + i4;
            i7++;
            i5 = i;
            i6 = i2;
        }
        if (j2 == i5) {
            return c9047;
        }
        throw C18177.m42352("Extent lengths do not match document length");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24422(C9047 c9047) {
        C9047 c90472;
        ArrayList arrayList = new ArrayList();
        C18177.m42357(c9047, arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        while (!arrayDeque.isEmpty()) {
            C6018 c6018 = (C6018) arrayDeque.pop();
            if (identityHashMap.put(c6018, Boolean.TRUE) == null) {
                arrayList.clear();
                c90472 = c6018.f18476;
                C18177.m42357(c90472, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((C6018) it.next());
                }
            }
        }
        if (identityHashMap.size() != this.f28956.length) {
            throw C18177.m42352("Unreachable replacement recipe definition");
        }
        for (boolean z : this.f28950) {
            if (!z) {
                throw C18177.m42352("Unreachable delta definition");
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24421() {
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            interfaceC6724.finish();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24423(C18177 c18177) {
        if (this.f28954) {
            throw new IllegalStateException("Checkpoint sources already transferred");
        }
        ArrayList arrayList = this.f28952;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c18177.f56546.put((InterfaceC18883) it.next(), Boolean.TRUE);
        }
        ArrayList arrayList2 = this.f28951;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c18177.f56546.put((C6018) it2.next(), Boolean.TRUE);
        }
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            interfaceC6724.mo18293();
        }
        arrayList.clear();
        arrayList2.clear();
        this.f28958 = null;
        this.f28954 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f28954) {
            return;
        }
        ArrayList arrayList = this.f28951;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C6018) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        this.f28952.clear();
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            try {
                interfaceC6724.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    th.addSuppressed(th3);
                }
            }
            this.f28958 = null;
        }
        if (th == null) {
            return;
        }
        C18177.m42320(th);
        throw null;
    }
}
