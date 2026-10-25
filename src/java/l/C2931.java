package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 16QU */
/* renamed from: l.ۗ֫ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2931 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f9315;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f9316;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f9317;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9318;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f9319;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f9320;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f9321;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f9322;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13157 f9323;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f9324;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f9325;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f9326;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9327;

    public C2931(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i6) {
        if (i6 < 0 || (i6 & (-32)) != 0) {
            throw new IOException("Invalid session view field mask");
        }
        this.f9327 = i6;
        if (i3 < 0 || i3 > 255 || i4 < -1 || i5 < -1) {
            throw new IOException("Invalid session view coordinates or wrap mode");
        }
        this.f9319 = i;
        this.f9318 = i2;
        this.f9316 = i3;
        this.f9322 = z;
        this.f9315 = z2;
        this.f9321 = z3;
        this.f9326 = i4;
        this.f9317 = i5;
        int i7 = i6 & 2;
        this.f9323 = i7 != 0 ? C13157.m31884(new ByteArrayInputStream(bArr), bArr.length, bArr.length) : null;
        if (i7 == 0 && bArr.length != 0) {
            throw new IOException("Unexpected session text config");
        }
        if ((i6 & 8) != 0) {
            m8938(bArr2);
        } else if (bArr2.length != 0) {
            throw new IOException("Unexpected backward navigation stack");
        }
        if ((i6 & 16) != 0) {
            m8938(bArr3);
        } else if (bArr3.length != 0) {
            throw new IOException("Unexpected forward navigation stack");
        }
        this.f9325 = bArr;
        this.f9320 = bArr2;
        this.f9324 = bArr3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m8935(int i, int i2, int i3, boolean z, boolean z2, boolean z3, C22686 c22686, C22146 c22146, C22146 c221462) {
        C10130 c10130 = new C10130();
        c22686.m50686(c10130);
        C10130 c101302 = new C10130();
        c22146.m49753(c101302);
        C10130 c101303 = new C10130();
        c221462.m49753(c101303);
        return new C2931(i, i2, i3, z, z2, z3, c22686.f73250, c22686.f73229, c10130.m25444(), c101302.m25444(), c101303.m25444(), 31);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2931 m8937(C6102 c6102) {
        int i = (c6102.f18700 ? 1 : 0) | (c6102.f18706 != null ? 2 : 0);
        boolean z = c6102.f18711;
        int i2 = i | (z ? 4 : 0) | (c6102.f18703 != null ? 8 : 0) | (c6102.f18704 != null ? 16 : 0);
        int i3 = c6102.f18709;
        int i4 = c6102.f18710;
        int i5 = c6102.f18699;
        boolean z2 = c6102.f18695;
        boolean z3 = c6102.f18696;
        boolean z4 = c6102.f18702;
        int i6 = z ? c6102.f18697 : -1;
        int i7 = z ? c6102.f18705 : -1;
        byte[] bArr = c6102.f18707;
        return new C2931(i3, i4, i5, z2, z3, z4, i6, i7, bArr == null ? new byte[0] : (byte[]) bArr.clone(), m8939(c6102.f18703), m8939(c6102.f18704), i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m8943(String str) {
        return (this.f9327 & 2) == 0 ? str : new C12951(this.f9325).m31504();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2931 m8949(String str) {
        if ((this.f9327 & 2) == 0) {
            return this;
        }
        byte[] bArr = this.f9325;
        C12951 c12951 = new C12951(bArr);
        c12951.m31504();
        C10130 c10130 = new C10130(bArr.length + 8);
        c10130.m25423((CharSequence) str);
        int available = (int) c12951.available();
        byte[] bArr2 = new byte[available];
        c12951.m31489(available, bArr2);
        c10130.write(bArr2, 0, available);
        return new C2931(this.f9319, this.f9318, this.f9316, this.f9322, this.f9315, this.f9321, this.f9326, this.f9317, c10130.m25444(), this.f9320, this.f9324, this.f9327);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8946(C2931 c2931) {
        if ((c2931.f9327 & 3) != 3) {
            throw new IOException("Page switch requires captured current view settings");
        }
        int i = this.f9318;
        C13157 c13157 = this.f9323;
        if (c13157 != null) {
            float f = c13157.f39329;
            if (f > 0.0f) {
                float f2 = c2931.f9323.f39329;
                if (f2 > 0.0f) {
                    i = (int) Math.min(2147483647L, Math.round((i / f) * f2));
                }
            }
        }
        return new C2931(this.f9319, i, c2931.f9316, c2931.f9322, c2931.f9315, c2931.f9321, this.f9326, this.f9317, c2931.f9325, this.f9320, this.f9324, this.f9327 | 3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8945(int i, int i2, String str) {
        int i3 = this.f9327;
        int i4 = i3 & 2;
        if (i4 == 0) {
            throw new IOException("Reload requires a captured current view config");
        }
        byte[] bArr = this.f9325;
        if (i4 != 0) {
            C12951 c12951 = new C12951(bArr);
            c12951.m31504();
            C10130 c10130 = new C10130(bArr.length + 8);
            c10130.m25423((CharSequence) str);
            byte[] bArr2 = new byte[11];
            c12951.m31489(11, bArr2);
            c10130.write(bArr2, 0, 11);
            c12951.m31498();
            c10130.writeByte(0);
            int available = (int) c12951.available();
            byte[] bArr3 = new byte[available];
            c12951.m31489(available, bArr3);
            c10130.write(bArr3, 0, available);
            bArr = c10130.m25444();
        }
        return new C2931(i, i2, this.f9316, this.f9322, this.f9315, this.f9321, -1, -1, bArr, this.f9320, this.f9324, i3 | 5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8939(ArrayList arrayList) {
        if (arrayList == null) {
            return new byte[0];
        }
        C10130 c10130 = new C10130((arrayList.size() * 8) + 6);
        c10130.writeInt(-1568513661);
        c10130.mo13231(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21441 c21441 = (C21441) it.next();
            c10130.writeInt(c21441.f69027);
            c10130.writeInt(c21441.f69026);
        }
        return c10130.m25444();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m8950() {
        return (this.f9327 & 1) != 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8951() {
        return (this.f9327 & 4) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2931 m8944(int i, int i2) {
        if (this.f9322 || i <= i2) {
            return this;
        }
        return new C2931(this.f9319, this.f9318, this.f9316, true, this.f9315, this.f9321, this.f9326, this.f9317, this.f9325, this.f9320, this.f9324, this.f9327);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        r16 = r0.readInt();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C2931 m8936(int r19, byte[] r20) {
        /*
            r0 = r19
            r1 = r20
            if (r0 < 0) goto L96
            int r2 = r1.length
            if (r2 > r0) goto L96
            int r0 = r1.length
            r2 = 47
            if (r0 < r2) goto L96
            l.۬ۜܽ r0 = new l.۬ۜܽ     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r0.<init>(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            int r1 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            java.lang.String r2 = "Unsupported session view state"
            r3 = 844519237(0x32565745, float:1.2476282E-8)
            if (r1 != r3) goto L87
            int r1 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r4 = 1
            r5 = 2
            if (r1 == r4) goto L2f
            if (r1 != r5) goto L29
            goto L2f
        L29:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r0.<init>(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L8d
        L2f:
            if (r1 != r5) goto L38
            int r1 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r16 = r1
            goto L3c
        L38:
            r1 = 31
            r16 = 31
        L3c:
            int r5 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            int r6 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            int r7 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            boolean r8 = m8941(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            boolean r9 = m8941(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            boolean r10 = m8941(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            int r11 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            int r12 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            byte[] r13 = m8940(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            byte[] r14 = m8940(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            byte[] r15 = m8940(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            long r1 = r0.available()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r17 = 4
            int r4 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r4 != 0) goto L7f
            int r0 = r0.readInt()     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            if (r0 != r3) goto L7f
            l.ۗ֫ܿ r0 = new l.ۗ֫ܿ     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            return r0
        L7f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            java.lang.String r1 = "Trailing or truncated session view state"
            r0.<init>(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L8d
        L87:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r0.<init>(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L8d
        L8d:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Truncated session view state"
            r1.<init>(r2, r0)
            throw r1
        L96:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid session view state length"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2931.m8936(int, byte[]):l.ۗ֫ܿ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8947(C10130 c10130) {
        c10130.writeInt(844519237);
        int i = this.f9327;
        c10130.writeInt(i == 31 ? 1 : 2);
        if (i != 31) {
            c10130.writeInt(i);
        }
        c10130.writeInt(this.f9319);
        c10130.writeInt(this.f9318);
        c10130.writeInt(this.f9316);
        c10130.m25425(this.f9322);
        c10130.m25425(this.f9315);
        c10130.m25425(this.f9321);
        c10130.writeInt(this.f9326);
        c10130.writeInt(this.f9317);
        c10130.m25434(this.f9325);
        c10130.m25434(this.f9320);
        c10130.m25434(this.f9324);
        c10130.writeInt(844519237);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8942() {
        return (this.f9327 == 31 ? 47L : 51L) + this.f9325.length + this.f9320.length + this.f9324.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8948(C22146 c22146, C22146 c221462) {
        int i = this.f9327;
        if ((i & 8) != 0) {
            c22146.m49754(new C12951(this.f9320));
        }
        if ((i & 16) != 0) {
            c221462.m49754(new C12951(this.f9324));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8940(C12951 c12951) {
        if (c12951.available() < 4) {
            throw new IOException("Missing session view field");
        }
        int readInt = c12951.readInt();
        if (readInt < 0 || readInt > c12951.available()) {
            throw new IOException("Invalid session view field length");
        }
        byte[] bArr = new byte[readInt];
        c12951.m31489(readInt, bArr);
        return bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8941(C12951 c12951) {
        int readByte = c12951.readByte() & 255;
        if (readByte == 0 || readByte == 255) {
            return readByte != 0;
        }
        throw new IOException("Invalid session view flag");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8938(byte[] bArr) {
        if (bArr.length < 6) {
            throw new IOException("Truncated session navigation stack");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != -1568513661 || c12951.m31494() * 8 != c12951.available()) {
            throw new IOException("Invalid session navigation stack");
        }
    }
}
