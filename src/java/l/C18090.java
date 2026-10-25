package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipException;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: A5XF */
/* renamed from: l.ᩳܰۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18090 implements Closeable {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C12717 f56325 = new C12717();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f56326;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f56327;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7889 f56328;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f56329;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f56330;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f56331;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f56332;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f56333;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f56334;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Charset f56335;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f56336;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f56337;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f56338;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public List f56339;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56340;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f56341;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f56342;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f56343;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C18090 m42203() {
        C18090 c18090;
        if (this.f56331) {
            throw new IOException("Closed");
        }
        c18090 = new C18090(this.f56328.mo21174(), null, false, null, null);
        c18090.f56332 = this.f56332;
        c18090.f56342 = this.f56342;
        c18090.f56326 = this.f56326;
        c18090.f56343 = this.f56343;
        c18090.f56340 = this.f56340;
        this.f56334.add(c18090);
        return c18090;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42168(AbstractC15440 abstractC15440, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C18090(abstractC15440.m36513("r"), null, false, null, null);
        }
        AbstractC15440 m36514 = abstractC15440.m36514();
        C12951 c12951 = new C12951(bArr);
        int readInt = c12951.readInt();
        AbstractC15440[] abstractC15440Arr = new AbstractC15440[readInt];
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            abstractC15440Arr[i] = m36514.m36526(c12951.m31506());
            jArr[i] = c12951.readLong();
        }
        return new C18090(C0127.m1200(C19885.m45717(abstractC15440.getName(), jArr, new C14127(abstractC15440Arr))), null, false, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42176(AbstractC15440 abstractC15440) {
        byte[] bArr;
        AbstractC15440 m36536 = abstractC15440.m36536();
        C16678 m42165 = m42165(m36536, abstractC15440.getName());
        if (m42165 != null) {
            bArr = m42165.f51190;
            return bArr;
        }
        C23411 m36513 = abstractC15440.m36513("r");
        try {
            C18090 c18090 = new C18090(m36513, null, false, null, null);
            try {
                c18090.m42172(m36536, (InterfaceC13422) null, true);
                byte[] bArr2 = c18090.f56332;
                c18090.close();
                return bArr2;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            C0349.m1793(m36513);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42166(AbstractC15440 abstractC15440, Charset charset) {
        return new C18090(abstractC15440.m36513("r"), abstractC15440.m36536(), true, charset, null, true, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42173(byte[] bArr, int[] iArr) {
        int m35152 = C14776.m35152(bArr.length, bArr);
        if (m35152 == C14776.f45134) {
            for (byte b : bArr) {
                if (b <= 0) {
                    iArr[m35152] = iArr[m35152] + 1;
                    return;
                }
            }
            int i = C14776.f45134;
            iArr[i] = iArr[i] + 1;
            int i2 = C14776.f45131;
            iArr[i2] = iArr[i2] + 1;
            int i3 = C14776.f45132;
            iArr[i3] = iArr[i3] + 1;
            int i4 = C14776.f45128;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        iArr[m35152] = iArr[m35152] + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42167(AbstractC15440 abstractC15440, boolean z) {
        C23411 m36513 = abstractC15440.m36513("r");
        try {
            C18090 c18090 = new C18090(m36513, null, false, null, null, z, false);
            C11035 m42183 = c18090.m42183();
            if (m42183 != null && (m42183.f33174 != 0 || m42183.f33173 != 0 || m42183.f33171 != m42183.f33175)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            c18090.m42172((AbstractC15440) null, (InterfaceC13422) null, false);
            return c18090;
        } catch (IOException | RuntimeException e) {
            C0349.m1793(m36513);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42169(C23411 c23411, C8083 c8083) {
        try {
            return new C18090(c23411, null, true, null, c8083, false, true);
        } catch (IOException | RuntimeException e) {
            C0349.m1793(c23411);
            throw e;
        }
    }

    public C18090(String str) {
        this(str, (C16014) null, 0);
    }

    public C18090(AbstractC15440 abstractC15440) {
        this(abstractC15440, (Charset) null, (InterfaceC13422) null);
    }

    public C18090(AbstractC15440 abstractC15440, Charset charset) {
        this(abstractC15440, charset, (InterfaceC13422) null);
    }

    public C18090(String str, C16014 c16014) {
        this(str, c16014, 0);
    }

    public C18090(String str, C16014 c16014, int i) {
        this(C16999.m39866(str, new String[0]), (Charset) null, c16014);
    }

    public C18090(AbstractC15440 abstractC15440, Charset charset, InterfaceC13422 interfaceC13422) {
        this(abstractC15440.m36513("r"), abstractC15440.m36536(), true, charset, interfaceC13422);
    }

    public C18090(InterfaceC7889 interfaceC7889, AbstractC15440 abstractC15440, boolean z, Charset charset, InterfaceC13422 interfaceC13422) {
        this(interfaceC7889, abstractC15440, z, charset, interfaceC13422, false, false);
    }

    public C18090(InterfaceC7889 interfaceC7889, AbstractC15440 abstractC15440, boolean z, Charset charset, InterfaceC13422 interfaceC13422, boolean z2, boolean z3) {
        String str;
        C4365 c4365;
        int i;
        byte[] bArr;
        this.f56333 = new LinkedHashMap();
        List list = Collections.EMPTY_LIST;
        this.f56341 = list;
        this.f56339 = list;
        this.f56326 = "";
        this.f56331 = false;
        this.f56334 = C16895.m39756();
        this.f56337 = z2;
        this.f56327 = z3;
        this.f56328 = interfaceC7889;
        this.f56335 = charset;
        this.f56342 = C15972.m37750(interfaceC7889.getName().toLowerCase());
        if (z) {
            final C16678 m42165 = m42165(abstractC15440, this.f56328.getName());
            if (m42165 != null) {
                InterfaceC2245 mo21173 = this.f56328.mo21173();
                str = m42165.f51188;
                c4365 = m42165.f51191;
                C19885 m45717 = C19885.m45717(str, c4365.m17072(), new InterfaceC22001() { // from class: l.ۤ᩺ۡ
                    @Override // l.InterfaceC22001
                    /* renamed from: ۧ */
                    public final InterfaceC2245 mo17661(int i2) {
                        ArrayList arrayList;
                        arrayList = C16678.this.f51192;
                        return ((AbstractC15440) arrayList.get(i2)).mo23557("r");
                    }
                });
                i = m42165.f51189;
                m45717.m45723(i, mo21173);
                this.f56328 = C0127.m1200(m45717);
                bArr = m42165.f51190;
                this.f56332 = bArr;
            }
            m42172(abstractC15440, interfaceC13422, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16678 m42165(AbstractC15440 abstractC15440, String str) {
        if (abstractC15440 == null || !str.matches("(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C4365 c4365 = new C4365();
        int parseInt = Integer.parseInt(str.substring(str.length() - 3));
        String m36561 = C15472.m36561(3, 0, str);
        int i = 1;
        while (true) {
            if (i > 999) {
                break;
            }
            AbstractC15440 m36526 = abstractC15440.m36526(String.format(Locale.ENGLISH, "%s%03d", m36561, Integer.valueOf(i)));
            if (m36526.mo23119()) {
                c4365.add(m36526.mo23127());
                arrayList.add(m36526);
                i++;
            } else if (i < parseInt) {
                arrayList.clear();
                c4365.clear();
            }
        }
        int size = c4365.size();
        if (size <= 1) {
            return null;
        }
        arrayList.trimToSize();
        c4365.m13087();
        C10130 c10130 = new C10130();
        c10130.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            c10130.m25439(((AbstractC15440) arrayList.get(i2)).getName());
            c10130.m25431(c4365.getLong(i2));
        }
        return new C16678(str, parseInt - 1, arrayList, c4365, c10130.m25444());
    }

    public final C3545 getEntry(String str) {
        return (C3545) this.f56333.get(str);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3545 m42211(String str) {
        C3545 c3545 = (C3545) this.f56333.get(str);
        if (c3545 != null) {
            return c3545;
        }
        StringBuilder m9834 = C3200.m9834("Entry not found: ", str, "\n(");
        m9834.append(this.f56328.getName());
        m9834.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IOException(m9834.toString());
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Map m42195() {
        return C20195.unmodifiableMap(this.f56333);
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final Collection m42210() {
        return C20195.unmodifiableCollection(this.f56333.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (m42174(r1, false, r2) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:8:0x0012->B:32:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058 A[SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m42205() {
        /*
            r9 = this;
            boolean r0 = r9.f56337
            if (r0 == 0) goto L76
            java.lang.String r0 = r9.f56338
            if (r0 != 0) goto L6e
            boolean r0 = r9.f56336
            if (r0 != 0) goto L66
            java.util.List r0 = r9.f56339
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            l.֫ܰۡ r1 = (l.C1862) r1
            long r2 = l.C1862.m6186(r1)
            r4 = 0
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L40
            boolean r2 = l.C1862.m6183(r1)
            boolean r2 = r9.m42174(r1, r6, r2)
            if (r2 != 0) goto L3e
            boolean r2 = l.C1862.m6183(r1)
            boolean r2 = r9.m42174(r1, r7, r2)
            if (r2 == 0) goto L40
        L3e:
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 != 0) goto L58
            boolean r3 = l.C1862.m6181(r1)
            if (r3 == 0) goto L58
            boolean r2 = r9.m42174(r1, r6, r7)
            if (r2 != 0) goto L57
            boolean r1 = r9.m42174(r1, r7, r7)
            if (r1 == 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            r2 = r6
        L58:
            if (r2 == 0) goto L5b
            goto L12
        L5b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ZIP data descriptor does not match central directory"
            r0.<init>(r1)
            throw r0
        L63:
            java.util.List r0 = r9.f56341
            return r0
        L66:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ZIP central directory contains an unreadable local file header"
            r0.<init>(r1)
            throw r0
        L6e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r9.f56338
            r0.<init>(r1)
            throw r0
        L76:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ZIP was not opened for testing"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18090.m42205():java.util.List");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42181(String str) {
        if (this.f56337 && this.f56338 == null) {
            this.f56338 = str;
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] m42188() {
        return this.f56332;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m42194() {
        ArrayList arrayList = new ArrayList(this.f56333.values());
        Collections.sort(arrayList, f56325);
        return arrayList;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m42207() {
        return this.f56333.size();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m42208() {
        return this.f56326;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42192(String str) {
        if (str == null) {
            str = "";
        }
        this.f56326 = str;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m42197() {
        return this.f56329;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m42213() {
        return this.f56326.isEmpty();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m42212() {
        return this.f56342;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m42201() {
        return this.f56343;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m42199() {
        if (!this.f56343) {
            throw new IllegalStateException();
        }
        m42180(this.f56340);
        C10130 c10130 = new C10130();
        long m42182 = m42182() - 24;
        while (m42182 > 0) {
            int m421822 = (int) m42182();
            m42182 -= m421822 + 8;
            if (m42182 >= 0) {
                int m42177 = m42177();
                if (m42177 != 1114793335) {
                    c10130.m25431(m421822);
                    c10130.writeInt(m42177);
                    byte[] m42175 = m42175(m421822 - 4);
                    c10130.write(m42175, 0, m42175.length);
                } else {
                    m42184(m421822 - 4);
                }
            }
        }
        return c10130.m25444();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m42209() {
        return this.f56330;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:234|(1:275)(1:238)|(4:240|241|242|(1:244)(15:269|(1:268)(1:250)|251|252|(10:259|260|261|262|263|186|(6:188|189|190|191|192|193)(3:224|225|226)|(3:209|210|(1:214))|(4:196|197|198|200)(5:203|204|205|206|207)|181)|264|260|261|262|263|186|(0)(0)|(0)|(0)(0)|181))(1:274)|245|(0)|268|251|252|(12:254|256|259|260|261|262|263|186|(0)(0)|(0)|(0)(0)|181)|264|260|261|262|263|186|(0)(0)|(0)|(0)(0)|181) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0730, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0731, code lost:
    
        r10 = r58;
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x06bf, code lost:
    
        r9 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0261, code lost:
    
        if (r31 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x02a6, code lost:
    
        if (m42177() == 67324752) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0711 A[Catch: EOFException -> 0x071e, TRY_LEAVE, TryCatch #4 {EOFException -> 0x071e, blocks: (B:198:0x070a, B:203:0x0711), top: B:197:0x070a }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06e5 A[Catch: EOFException -> 0x0728, TRY_LEAVE, TryCatch #7 {EOFException -> 0x0728, blocks: (B:193:0x06db, B:224:0x06e5), top: B:192:0x06db }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0647 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x059f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42172(l.AbstractC15440 r59, l.InterfaceC13422 r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 2331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18090.m42172(l.ܶ᩵ܿ, l.۬᩺ۡ, boolean):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m42185(String str) {
        if (this.f56327) {
            throw new IOException(str);
        }
        m42181(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d8, code lost:
    
        if (r5 != r18.getSize()) goto L64;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42170(l.C3545 r18, byte[] r19, int r20, int r21, int r22, long r23, long r25, byte[] r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18090.m42170(l.ۗ᩺ۡ, byte[], int, int, int, long, long, byte[], byte[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42174(C1862 c1862, boolean z, boolean z2) {
        long j;
        int i;
        long j2;
        long j3;
        try {
            j = c1862.f6354;
            m42180(j);
            if (z && m42177() != 134695760) {
                return false;
            }
            int m42177 = m42177();
            long m42182 = z2 ? m42182() : m42178();
            long m421822 = z2 ? m42182() : m42178();
            i = c1862.f6352;
            if (m42177 != i) {
                return false;
            }
            j2 = c1862.f6350;
            if (m42182 != j2) {
                return false;
            }
            j3 = c1862.f6353;
            return m421822 == j3;
        } catch (EOFException unused) {
            return false;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (IOException e2) {
            throw new C13855(e2.getMessage(), e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42171(InterfaceC13422 interfaceC13422, boolean z) {
        int i;
        long j;
        Charset charset;
        boolean z2;
        boolean z3;
        long m42178;
        long m421782;
        long j2;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        long j3;
        int i3;
        long j4;
        int i4;
        ArrayList arrayList = new ArrayList();
        int i5 = C14776.f45125;
        int[] iArr = new int[i5];
        long length = this.f56328.length();
        m42180(0L);
        if (m42177() != 67324752) {
            InterfaceC7889 interfaceC7889 = this.f56328;
            int i6 = 4;
            byte[] bArr3 = {UTF8.S_P4A, 75, 3, 4};
            long min = Math.min(interfaceC7889.length(), 52428800L);
            long j5 = 4;
            if (min < j5) {
                i = i5;
                j = length;
            } else {
                int[] iArr2 = new int[4];
                int i7 = 1;
                int i8 = 0;
                while (i7 < i6) {
                    while (true) {
                        if (i8 <= 0) {
                            i4 = i5;
                            break;
                        }
                        i4 = i5;
                        if (bArr3[i8] == bArr3[i7]) {
                            break;
                        }
                        i8 = iArr2[i8 - 1];
                        i5 = i4;
                    }
                    if (bArr3[i8] == bArr3[i7]) {
                        i8++;
                    }
                    iArr2[i7] = i8;
                    i7++;
                    i6 = 4;
                    i5 = i4;
                }
                i = i5;
                byte[] bArr4 = new byte[65536];
                j = length;
                interfaceC7889.seek(0L);
                int i9 = 0;
                int i10 = 0;
                long j6 = 0;
                int i11 = 0;
                while (j6 < min) {
                    if (i9 >= i10) {
                        j2 = min;
                        int mo21175 = interfaceC7889.mo21175(0, (int) Math.min(65536, min - j6), bArr4);
                        if (mo21175 == 0) {
                            break;
                        }
                        i10 = mo21175;
                        i9 = 0;
                    } else {
                        j2 = min;
                    }
                    int i12 = i9 + 1;
                    if (bArr4[i9] == bArr3[i11]) {
                        i11++;
                        if (i11 == 4) {
                            long j7 = j6 - j5;
                            long j8 = j7 + 1;
                            int i13 = i10;
                            long filePointer = interfaceC7889.getFilePointer();
                            bArr2 = bArr3;
                            try {
                                interfaceC7889.seek(j7 + 5);
                                int mo21172 = interfaceC7889.mo21172();
                                if (mo21172 == 45 || mo21172 == 20 || mo21172 == 10) {
                                    interfaceC7889.mo21172();
                                    int mo211722 = interfaceC7889.mo21172();
                                    if (mo211722 == 0 || mo211722 == 8 || mo211722 == 9 || mo211722 == 12 || mo211722 == 14 || mo211722 == 95) {
                                        interfaceC7889.readInt();
                                        interfaceC7889.readInt();
                                        long readInt = interfaceC7889.readInt() & 4294967295L;
                                        interfaceC7889.readInt();
                                        bArr = bArr4;
                                        int mo211723 = interfaceC7889.mo21172();
                                        if (mo211723 != 0) {
                                            i2 = i13;
                                            j3 = j5;
                                            i3 = i12;
                                            if (interfaceC7889.getFilePointer() + mo211723 + interfaceC7889.mo21172() + readInt <= interfaceC7889.length()) {
                                                interfaceC7889.seek(filePointer);
                                                j4 = j8;
                                                break;
                                            }
                                            i11 = 0;
                                        }
                                        interfaceC7889.seek(filePointer);
                                        i2 = i13;
                                        j3 = j5;
                                        i3 = i12;
                                        i11 = 0;
                                    }
                                }
                                bArr = bArr4;
                                interfaceC7889.seek(filePointer);
                                i2 = i13;
                                j3 = j5;
                                i3 = i12;
                                i11 = 0;
                            } finally {
                                interfaceC7889.seek(filePointer);
                            }
                        } else {
                            bArr = bArr4;
                            i2 = i10;
                            bArr2 = bArr3;
                            j3 = j5;
                            i3 = i12;
                        }
                    } else {
                        bArr = bArr4;
                        i2 = i10;
                        bArr2 = bArr3;
                        j3 = j5;
                        i3 = i12;
                        if (i11 > 0) {
                            i11 = iArr2[i11 - 1];
                            bArr3 = bArr2;
                            bArr4 = bArr;
                            min = j2;
                            i10 = i2;
                            j5 = j3;
                        }
                    }
                    j6++;
                    i9 = i3;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    min = j2;
                    i10 = i2;
                    j5 = j3;
                }
            }
            j4 = -1;
            if (j4 != -1) {
                m42180(j4);
            }
        } else {
            i = i5;
            j = length;
            m42180(0L);
        }
        int i14 = 50000;
        loop0: while (true) {
            int available = this.f56328.available();
            charset = this.f56335;
            if (available <= 30 || m42177() != 67324752) {
                break;
            }
            C3545 c3545 = new C3545();
            long j9 = 4;
            c3545.m10799(this.f56328.getFilePointer() - 4);
            m42186();
            c3545.m10802(m42186());
            c3545.m10814(m42186());
            c3545.setTime(C2568.m8115(m42178()));
            c3545.m10769(m42177());
            c3545.m10770(m42178());
            c3545.m10805(m42178());
            int m42186 = m42186();
            int m421862 = m42186();
            boolean m10786 = c3545.m10786();
            byte[] m42175 = m42175(m42186);
            boolean z4 = (interfaceC13422 == null || interfaceC13422.mo21452(m42175)) ? false : true;
            if (!z4 && !m10786 && i14 > 0 && charset == null) {
                m42173(m42175, iArr);
                i14--;
            }
            c3545.m10806(m42175);
            if (m421862 > 0) {
                byte[] m421752 = m42175(m421862);
                z2 = c3545.m10803(m421752);
                if (z2) {
                    m421752 = C8484.m22155(1, m421752);
                }
                c3545.m10800(m421752);
            } else {
                z2 = false;
            }
            c3545.m10787(this.f56328.getFilePointer());
            int i15 = 8;
            if ((c3545.m10796() & 8) == 8) {
                int i16 = 0;
                while (true) {
                    int read = this.f56328.read();
                    if (read == -1) {
                        break loop0;
                    }
                    i16 = (i16 >>> i15) | (read << 24);
                    if (i16 == 134695760) {
                        long filePointer2 = (this.f56328.getFilePointer() - c3545.m10811()) - j9;
                        int m42177 = m42177();
                        if (z2) {
                            m42178 = m42182();
                            m421782 = m42182();
                        } else {
                            m42178 = m42178();
                            m421782 = m42178();
                        }
                        long j10 = m42178;
                        z3 = z4;
                        long j11 = m421782;
                        if (j10 == filePointer2) {
                            c3545.m10769(m42177);
                            c3545.m10770(j10);
                            c3545.m10805(j11);
                            break;
                        }
                    } else {
                        z3 = z4;
                    }
                    j9 = 4;
                    z4 = z3;
                    i15 = 8;
                }
            } else {
                z3 = z4;
                if (j - c3545.m10811() < c3545.m10793()) {
                    break;
                }
                m42184(c3545.m10793());
                if (!z3) {
                    arrayList.add(c3545);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                throw new ZipException("Archive is not a ZIP archive");
            }
            return;
        }
        Charset charset2 = StandardCharsets.UTF_8;
        if (charset == null) {
            int i17 = C14776.f45134;
            int i18 = i;
            for (int i19 = 0; i19 < i18; i19++) {
                if (i19 != i17 && iArr[i19] > iArr[i17]) {
                    i17 = i19;
                }
            }
            charset = C14776.m35151(i17);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3545 c35452 = (C3545) it.next();
            if (c35452.m10786()) {
                c35452.m10772(charset2, false, this.f56342);
            } else {
                c35452.m10772(charset, true, this.f56342);
            }
            if (!this.f56342 && c35452.getName().equals("AndroidManifest.xml") && this.f56332 == null) {
                this.f56342 = true;
            }
        }
        LinkedHashMap linkedHashMap = this.f56333;
        linkedHashMap.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3545 c35453 = (C3545) it2.next();
            m42187(c35453);
            linkedHashMap.put(c35453.getName(), c35453);
        }
        if (this.f56337) {
            this.f56341 = C20195.unmodifiableList(new ArrayList(arrayList));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m42187(C3545 c3545) {
        int m10767;
        if (c3545.m10808()) {
            if (this.f56342) {
                c3545.m10802(c3545.m10796() & (-2));
            } else {
                C8484 m22152 = C8484.m22152(39169, c3545.m10766());
                if (m22152 != null) {
                    c3545.m10798(99);
                    c3545.m10774(m22152);
                    byte[] m22157 = m22152.m22157();
                    if (m22157.length < 7) {
                        throw new ZipException("Invalid aes extra data record. (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    boolean z = C2568.f8121;
                    if (7 > m22157.length) {
                        throw new EOFException();
                    }
                    c3545.m10814(C15972.m37760(5, m22157));
                } else if ((c3545.m10796() & 64) != 0) {
                    c3545.m10798(1);
                } else {
                    c3545.m10798(0);
                }
            }
        }
        if (this.f56342 && (m10767 = c3545.m10767()) != 8 && m10767 != 0) {
            c3545.m10814(0);
        }
        if (this.f56342 && c3545.m10767() == 0 && c3545.getSize() != c3545.m10793()) {
            c3545.m10770(c3545.getSize());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11035 m42164(long j, int i, long j2) {
        m42180(j);
        int m42177 = m42177();
        if (m42177 != 101075792) {
            throw new IOException("Invalid zip64 eocd record offset, sig=" + Integer.toHexString(m42177) + " offset=" + j);
        }
        if (this.f56327) {
            long m42182 = m42182();
            long j3 = j2 - 20;
            if (m42182 < 44 || j > 9223372036854775795L || m42182 > 9223372036854775795L - j || j + 12 + m42182 != j3) {
                throw new IOException(C16014.m37865(m42182, "Invalid zip64 eocd record size: "));
            }
            m42184(4L);
        } else {
            m42184(12L);
        }
        return new C11035(m42177(), m42177(), m42182(), m42182(), m42182(), m42182(), j, i, true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12445 m42206(C3545 c3545) {
        return new C12445(this.f56328, c3545.m10811(), c3545.m10793(), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m42189(C3545 c3545) {
        return m42163(c3545, true, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InputStream m42198(C3545 c3545) {
        return m42163(c3545, false, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream m42202(C3545 c3545) {
        if (c3545.getSize() < 0) {
            throw new IOException("Unknown uncompressed size (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (c3545.m10793() < 0) {
            throw new IOException("Unknown compressed size (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return m42163(c3545, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c0  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream m42163(l.C3545 r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18090.m42163(l.ۗ᩺ۡ, boolean, boolean):java.io.InputStream");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m42200(C3545 c3545) {
        if (c3545.getSize() > 20971520) {
            try {
                InputStream m42163 = m42163(c3545, true, false);
                try {
                    byte[] m1794 = C0349.m1794(c3545.getSize(), m42163);
                    m42163.close();
                    return m1794;
                } finally {
                }
            } catch (Exception unused) {
                return m42193(c3545, (C19277) null);
            }
        }
        return m42193(c3545, (C19277) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m42193(C3545 c3545, C19277 c19277) {
        int size = (int) c3545.getSize();
        byte[] bArr = new byte[size];
        int i = 0;
        InputStream m42163 = m42163(c3545, true, false);
        while (i < size) {
            try {
                int read = m42163.read(bArr, i, size - i);
                if (read == -1) {
                    break;
                }
                i += read;
                if (c19277 != null) {
                    c19277.m44460(read);
                }
            } catch (Throwable th) {
                try {
                    m42163.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != size || m42163.read() != -1) {
            throw new IOException("The length of data has been read is incorrect. (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        m42163.close();
        return bArr;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18090 m42204(C3545 c3545) {
        if (c3545.m10767() != 0) {
            throw new IOException("Entry is not stored: " + c3545.getName());
        }
        return new C18090(this.f56328.mo21176(c3545.m10811(), c3545.m10793()), null, true, null, null);
    }

    public final String getName() {
        InterfaceC7889 interfaceC7889 = this.f56328;
        if (interfaceC7889 == null) {
            return null;
        }
        return interfaceC7889.getName();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m42190(boolean z) {
        String m42179 = m42179(1);
        C3545 entry = getEntry(m42179);
        if (entry == null) {
            if (z) {
                return Collections.EMPTY_LIST;
            }
            StringBuilder m9834 = C3200.m9834("Entry not found: ", m42179, "\n(");
            m9834.append(this.f56328.getName());
            m9834.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IOException(m9834.toString());
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (entry != null) {
            arrayList.add(entry);
            i++;
            entry = getEntry(m42179(i));
        }
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42179(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C18307.m42645(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|7|(4:9|10|11|(13:13|(3:18|19|21)|23|24|(1:26)(1:65)|27|28|(1:30)(1:61)|31|(1:60)(1:35)|(3:37|38|39)(1:59)|40|(3:42|44|45)(4:(2:(1:48)(1:54)|49)(1:55)|50|51|52)))|67|24|(0)(0)|27|28|(0)(0)|31|(1:33)|60|(0)(0)|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:31:0x00c0, B:35:0x00dc, B:61:0x0094), top: B:27:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[Catch: IOException -> 0x0126, TRY_LEAVE, TryCatch #1 {IOException -> 0x0126, blocks: (B:39:0x00fa, B:42:0x0109), top: B:38:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:31:0x00c0, B:35:0x00dc, B:61:0x0094), top: B:27:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C11035 m42183() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18090.m42183():l.ۧܰۡ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42180(long j) {
        this.f56328.seek(j);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m42184(long j) {
        if (j < 0) {
            throw new IOException(C16014.m37865(j, "Skip "));
        }
        long filePointer = this.f56328.getFilePointer() + j;
        if (filePointer > this.f56328.length()) {
            throw new EOFException();
        }
        this.f56328.seek(filePointer);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m42175(int i) {
        byte[] bArr = new byte[i];
        this.f56328.readFully(bArr);
        return bArr;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private int m42177() {
        int read = this.f56328.read();
        int read2 = this.f56328.read();
        int read3 = this.f56328.read();
        int read4 = this.f56328.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return read | (read2 << 8) | (read3 << 16) | (read4 << 24);
        }
        throw new EOFException();
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m42186() {
        int read = this.f56328.read();
        int read2 = this.f56328.read();
        if ((read | read2) >= 0) {
            return read | (read2 << 8);
        }
        throw new EOFException();
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m42178() {
        return m42177() & 4294967295L;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private long m42182() {
        return m42178() | (m42178() << 32);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m42191();
        if (this.f56331) {
            return;
        }
        this.f56328.close();
        this.f56331 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42191() {
        List list = this.f56334;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22194.m49850((C18090) it.next());
        }
        list.clear();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 m42214() {
        return this.f56328;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14561 m42196() {
        return new C14561(this);
    }
}
