package l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.BooleanSupplier;

/* compiled from: 5AG2 */
/* renamed from: l.ۙܺ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4758 extends AbstractC3163 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f15105;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15106 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Boolean f15107;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3347 f15108;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Boolean f15109;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f15110;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f15111;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Boolean f15112;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f15113;

    @Override // l.AbstractC3163
    /* renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    public C4758(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f15113 = true;
        this.f15111 = new C3786(new C1230(this), mo13919());
        this.f15108 = C3347.m10246(i, abstractC3577);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C3347 m10246 = C3347.m10246(this.f9954, abstractC3577);
        if (this.f15108.equals(m10246)) {
            return;
        }
        C13019.m31600(this.f15108);
        this.f15108 = m10246;
        this.f15111.m11441();
    }

    public C4758(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
        this.f15110 = c12951.m31502();
        this.f15109 = c12951.m31502();
        this.f15107 = c12951.m31502();
        this.f15112 = c12951.m31502();
        this.f15113 = c12951.m31498();
        Boolean bool = this.f15110;
        if (bool != null) {
            this.f15111.m11443(bool.booleanValue());
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
        c10130.m25422(this.f15110);
        c10130.m25422(this.f15109);
        c10130.m25422(this.f15107);
        c10130.m25422(this.f15112);
        c10130.m25425(this.f15113);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۘ */
    public final String mo9688() {
        return this.f15108.f10604;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۖ */
    public final String mo9686() {
        return this.f15108.f10604;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩹ */
    public final boolean mo9708() {
        return this.f15107 != Boolean.FALSE;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9694(final int i, final String str) {
        m13916(new InterfaceC20281() { // from class: l.ۘܺ᩻
            @Override // l.InterfaceC20281
            /* renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                C4758.m13914(C4758.this, str, i, interfaceC13224);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13914(C4758 c4758, String str, int i, InterfaceC13224 interfaceC13224) {
        if (!interfaceC13224.mo26241(C9523.m24406(str))) {
            interfaceC13224.mo26245();
            throw null;
        }
        if (interfaceC13224.m32094("CHMOD " + Integer.toOctalString(i) + " " + C9523.m24404(str))) {
            return;
        }
        if (interfaceC13224.m32082() == 550) {
            c4758.f15107 = Boolean.FALSE;
        }
        interfaceC13224.mo26245();
        throw null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۗ */
    public final boolean mo9687() {
        return this.f15113;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        f15105 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9700(final long j, final String str) {
        m13916(new InterfaceC20281() { // from class: l.֡ܺ᩻
            @Override // l.InterfaceC20281
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                C4758.m13912(j, str, interfaceC13224);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13912(long j, String str, InterfaceC13224 interfaceC13224) {
        String format;
        SimpleDateFormat simpleDateFormat = f15105;
        synchronized (simpleDateFormat) {
            format = simpleDateFormat.format(Long.valueOf(j));
        }
        if (interfaceC13224.mo26241(C9523.m24406(str)) && interfaceC13224.m32074(C9523.m24404(str), format)) {
            return;
        }
        interfaceC13224.mo26245();
        throw null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ܶ */
    public final String mo9699() {
        return (String) m13908(new InterfaceC22397() { // from class: l.ۡܺ᩻
            @Override // l.InterfaceC22397
            /* renamed from: ֫ */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                return C4758.m13909(C4758.this, interfaceC13224);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m13909(C4758 c4758, InterfaceC13224 interfaceC13224) {
        String str = c4758.f15108.f10606;
        if (!TextUtils.isEmpty(str) && interfaceC13224.mo26241(str)) {
            return interfaceC13224.getPath();
        }
        return interfaceC13224.mo26244();
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩸ */
    public final void mo9707() {
        C1802.f6209.execute(new RunnableC15454(1, this));
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f15111.m11441();
        if (z) {
            C13019.m31600(this.f15108);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۙ */
    public final boolean mo9689() {
        if (this.f15112 == null) {
            synchronized (this) {
                if (this.f15112 == null) {
                    this.f15112 = (Boolean) m13908(new C19576());
                }
            }
        }
        return this.f15112.booleanValue();
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final InputStream mo9681(long j, String str) {
        return m13907(j, str, true);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final OutputStream mo9693(long j, String str) {
        return m13918(str, true);
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9701(final String str, final boolean z) {
        m13916(new InterfaceC20281() { // from class: l.᩷ܺ᩻
            @Override // l.InterfaceC20281
            /* renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                String str2 = str;
                if (!interfaceC13224.mo26241(C9523.m24406(str2))) {
                    interfaceC13224.mo26245();
                    throw null;
                }
                if (z) {
                    if (interfaceC13224.m32073(C9523.m24404(str2))) {
                        return;
                    }
                    interfaceC13224.mo26245();
                    throw null;
                }
                if (interfaceC13224.m32090(C9523.m24404(str2))) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final boolean mo9696(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        return ((Boolean) m13908(new InterfaceC22397() { // from class: l.ۖܺ᩻
            @Override // l.InterfaceC22397
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                return Boolean.valueOf(interfaceC13224.m32091(str, str2));
            }
        })).booleanValue();
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9684(final String str, final String str2) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (!str2.startsWith("/")) {
            str2 = "/".concat(str2);
        }
        m13916(new InterfaceC20281() { // from class: l.ܺܺ᩻
            @Override // l.InterfaceC20281
            /* renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                if (interfaceC13224.m32091(str, str2)) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* renamed from: ܿ */
    public final void mo9702(final String str) {
        m13916(new InterfaceC20281() { // from class: l.ۚܺ᩻
            @Override // l.InterfaceC20281
            /* renamed from: ֫ */
            public final void mo2236(InterfaceC13224 interfaceC13224) {
                int i = C4758.f15106;
                String str2 = str;
                if (interfaceC13224.mo26241(C9523.m24406(str2)) && interfaceC13224.m32093(C9523.m24404(str2))) {
                    return;
                }
                interfaceC13224.mo26245();
                throw null;
            }
        });
    }

    @Override // l.AbstractC3163
    /* renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f15111.m11445(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f15111;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f15111.m11444(str);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String m24406 = C9523.m24406(str);
        C10384 c10384 = (C10384) this.f15111.m11440(m24406, C9523.m24404(str));
        if (c10384 != null) {
            return new C12314(c10384, m24406);
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String m39731 = AbstractC16891.m39731(str);
        Collection<C10384> values = this.f15111.m11446(m39731).values();
        ArrayList arrayList = new ArrayList(values.size() + 1);
        for (C10384 c10384 : values) {
            if (z || !c10384.m26193().startsWith(".")) {
                arrayList.add(new C12314(c10384, m39731));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۢ */
    public final void mo9692(String str) {
        this.f15111.m11442(str);
    }

    @Override // l.AbstractC13921
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo13919() {
        return this.f15110 == Boolean.TRUE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13915(InterfaceC13224 interfaceC13224, C10384[] c10384Arr, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        for (C10384 c10384 : c10384Arr) {
            hashSet.add(c10384.m26193());
        }
        for (C10384 c103842 : c10384Arr) {
            if (c103842.m26189()) {
                String m26193 = c103842.m26193();
                char charAt = m26193.charAt(0);
                if ('a' <= charAt && charAt <= 'z') {
                    lowerCase = m26193.toUpperCase();
                } else if ('A' <= charAt && charAt <= 'Z') {
                    lowerCase = m26193.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    if (interfaceC13224.mo26241(str)) {
                        int m32084 = interfaceC13224.m32084(lowerCase);
                        if (m32084 == 213) {
                            this.f15110 = Boolean.TRUE;
                        } else if (m32084 == 550) {
                            this.f15110 = Boolean.FALSE;
                        } else if (m32084 == 502) {
                            this.f15110 = Boolean.FALSE;
                        }
                        Boolean bool = this.f15110;
                        if (bool != null) {
                            this.f15111.m11443(bool.booleanValue());
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m13910(final C4758 c4758, String str) {
        final String m39731 = AbstractC16891.m39731(str);
        return (List) c4758.m13908(new InterfaceC22397() { // from class: l.ᩴܺ᩻
            @Override // l.InterfaceC22397
            /* renamed from: ֫ */
            public final Object mo8315(InterfaceC13224 interfaceC13224) {
                return C4758.m13911(C4758.this, m39731, interfaceC13224);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m13911(C4758 c4758, String str, InterfaceC13224 interfaceC13224) {
        C10384[] m32088;
        boolean z;
        String m26190;
        String absolutePath;
        if (c4758.f15109 == null) {
            c4758.f15109 = Boolean.valueOf(interfaceC13224.m32075(EnumC13205.MLST));
            c4758.f15113 = interfaceC13224.m32075(EnumC13205.MFMT);
        }
        if (!interfaceC13224.mo26241(str)) {
            interfaceC13224.mo26245();
            throw null;
        }
        if (c4758.f15109.booleanValue()) {
            m32088 = interfaceC13224.m32086();
            int i = 0;
            while (true) {
                if (i >= m32088.length) {
                    break;
                }
                if (m32088[i].m26197().toLowerCase(Locale.ENGLISH).contains("type=cdir;")) {
                    C10384[] c10384Arr = new C10384[m32088.length - 1];
                    System.arraycopy(m32088, 0, c10384Arr, 0, i);
                    System.arraycopy(m32088, i + 1, c10384Arr, i, (m32088.length - i) - 1);
                    m32088 = c10384Arr;
                    break;
                }
                i++;
            }
            if (c4758.f15107 == null && m32088.length > 0) {
                int length = m32088.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C10384 c10384 = m32088[i2];
                    if (c10384.m26193().indexOf(61) == -1) {
                        String m26197 = c10384.m26197();
                        c4758.f15107 = Boolean.valueOf(m26197.contains("UNIX.mode=") || m26197.contains("perm="));
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            m32088 = interfaceC13224.m32088();
            ArrayList arrayList = new ArrayList();
            for (final C10384 c103842 : m32088) {
                if (c103842.m26188() && (m26190 = c103842.m26190()) != null) {
                    if (m26190.indexOf(47) != -1) {
                        if (m26190.startsWith("/")) {
                            absolutePath = new File(m26190).getAbsolutePath();
                        } else {
                            absolutePath = new File(str, m26190).getAbsolutePath();
                        }
                        m26190 = str.equals(C9523.m24406(absolutePath)) ? C9523.m24404(absolutePath) : null;
                    }
                    if (m26190 != null) {
                        int length2 = m32088.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                final C10384 c103843 = m32088[i3];
                                if (c103843.m26193().equals(m26190)) {
                                    arrayList.add(new BooleanSupplier() { // from class: l.ۢܺ᩻
                                        @Override // java.util.function.BooleanSupplier
                                        public final boolean getAsBoolean() {
                                            int i4 = C4758.f15106;
                                            C10384 c103844 = C10384.this;
                                            int m26200 = c103844.m26200();
                                            C10384 c103845 = c103843;
                                            if (m26200 == c103845.m26200()) {
                                                return false;
                                            }
                                            c103844.m26181(c103845.m26200());
                                            return true;
                                        }
                                    });
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
            }
            do {
                Iterator it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    if (((BooleanSupplier) it.next()).getAsBoolean()) {
                        z = true;
                    }
                }
            } while (z);
        }
        if (c4758.f15110 == null && m32088.length > 0) {
            try {
                c4758.m13915(interfaceC13224, m32088, str);
            } catch (IOException unused) {
            }
        }
        return Arrays.asList(m32088);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InputStream m13907(long j, String str, boolean z) {
        InterfaceC13224 m31598 = C13019.m31598(this.f15108);
        try {
            if (!m31598.mo26241(C9523.m24406(str))) {
                m31598.mo26245();
                throw null;
            }
            m31598.m32072(j);
            C0820 m32087 = m31598.m32087(C9523.m24404(str));
            if (m32087 == null) {
                m31598.mo26245();
                throw null;
            }
            return new C15340(this, m32087, m31598);
        } catch (IOException e) {
            m31598.m32072(0L);
            if (!z || !m13917(e)) {
                C13019.m31601(m31598);
                throw e;
            }
            C13019.m31599(m31598);
            return m13907(j, str, false);
        } catch (Error e2) {
            e = e2;
            m31598.m32072(0L);
            C13019.m31601(m31598);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            m31598.m32072(0L);
            C13019.m31601(m31598);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m13908(l.InterfaceC22397 r4) {
        /*
            r3 = this;
            l.ۗܺ᩻ r0 = r3.f15108
            l.۬ܺ᩻ r0 = l.C13019.m31598(r0)
            java.lang.Object r4 = r4.mo8315(r0)     // Catch: java.lang.Throwable -> L10 java.io.IOException -> L12
            if (r0 == 0) goto Lf
            l.C13019.m31601(r0)
        Lf:
            return r4
        L10:
            r4 = move-exception
            goto L30
        L12:
            r1 = move-exception
            boolean r2 = m13917(r1)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L2f
            l.C13019.m31599(r0)     // Catch: java.lang.Throwable -> L10
            l.ۗܺ᩻ r0 = r3.f15108     // Catch: java.lang.Throwable -> L2c
            l.۬ܺ᩻ r0 = l.C13019.m31598(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.mo8315(r0)     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L2b
            l.C13019.m31601(r0)
        L2b:
            return r4
        L2c:
            r4 = move-exception
            r0 = 0
            goto L30
        L2f:
            throw r1     // Catch: java.lang.Throwable -> L10
        L30:
            if (r0 == 0) goto L35
            l.C13019.m31601(r0)
        L35:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4758.m13908(l.᩹ܺ᩻):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13916(l.InterfaceC20281 r4) {
        /*
            r3 = this;
            l.ۗܺ᩻ r0 = r3.f15108
            l.۬ܺ᩻ r0 = l.C13019.m31598(r0)
            r4.mo2236(r0)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            if (r0 == 0) goto L29
            l.C13019.m31601(r0)
            return
        Lf:
            r4 = move-exception
            goto L2e
        L11:
            r1 = move-exception
            boolean r2 = m13917(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L2d
            l.C13019.m31599(r0)     // Catch: java.lang.Throwable -> Lf
            l.ۗܺ᩻ r0 = r3.f15108     // Catch: java.lang.Throwable -> L2a
            l.۬ܺ᩻ r0 = l.C13019.m31598(r0)     // Catch: java.lang.Throwable -> L2a
            r4.mo2236(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L29
            l.C13019.m31601(r0)
        L29:
            return
        L2a:
            r4 = move-exception
            r0 = 0
            goto L2e
        L2d:
            throw r1     // Catch: java.lang.Throwable -> Lf
        L2e:
            if (r0 == 0) goto L33
            l.C13019.m31601(r0)
        L33:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4758.m13916(l.᩶ܺ᩻):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private OutputStream m13918(String str, boolean z) {
        InterfaceC13224 m31598 = C13019.m31598(this.f15108);
        try {
            if (!m31598.mo26241(C9523.m24406(str))) {
                m31598.mo26245();
                throw null;
            }
            OutputStream mo13872 = m31598.mo13872(C9523.m24404(str));
            if (mo13872 == null) {
                m31598.mo26245();
                throw null;
            }
            return new C21692(this, mo13872, m31598, mo13872);
        } catch (IOException e) {
            if (!z || !m13917(e)) {
                C13019.m31601(m31598);
                throw e;
            }
            C13019.m31599(m31598);
            return m13918(str, false);
        } catch (Error e2) {
            e = e2;
            C13019.m31601(m31598);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C13019.m31601(m31598);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13917(IOException iOException) {
        if (iOException instanceof C12500) {
            return true;
        }
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        String lowerCase = message.toLowerCase(Locale.ENGLISH);
        return (lowerCase.contains("connection") && (lowerCase.contains("closed") || lowerCase.contains("reset"))) || lowerCase.contains("broken pipe") || lowerCase.contains("connection abort");
    }
}
