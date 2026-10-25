package l;

import android.net.Uri;

/* compiled from: T8RT */
/* renamed from: l.᩺֫ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22682 implements InterfaceC8840 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f73207;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f73208;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10045 f73209;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f73210;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5749 f73211;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f73212;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10264 f73213;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f73214;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f73215;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC11058 f73216;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f73217;

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC8840 mo22839(InterfaceC11058 interfaceC11058) {
        m50669(interfaceC11058);
        return this;
    }

    public C22682(InterfaceC15097 interfaceC15097, InterfaceC20419 interfaceC20419) {
        this.f73207 = interfaceC15097;
        C10045 c10045 = new C10045();
        this.f73209 = c10045;
        C5749 c5749 = new C5749(interfaceC20419, c10045);
        this.f73211 = c5749;
        c5749.m16177(interfaceC15097);
        this.f73208 = -9223372036854775807L;
        this.f73212 = -9223372036854775807L;
        this.f73215 = -9223372036854775807L;
        this.f73217 = -3.4028235E38f;
        this.f73214 = -3.4028235E38f;
        this.f73210 = true;
    }

    @Override // l.InterfaceC8840
    @Deprecated
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22840(boolean z) {
        this.f73210 = z;
        this.f73211.m16178(z);
        return this;
    }

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22838(C10045 c10045) {
        this.f73209 = c10045;
        this.f73211.m16175(c10045);
        return this;
    }

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22837() {
        this.f73211.m16174();
        return this;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50669(InterfaceC11058 interfaceC11058) {
        C22632.m50629(interfaceC11058, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f73216 = interfaceC11058;
        this.f73211.m16176(interfaceC11058);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50668(C10264 c10264) {
        this.f73213 = c10264;
    }

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC3901 mo22836(C11197 c11197) {
        InterfaceC8840 interfaceC8840;
        C10264 c10264;
        C11881 c11881 = c11197.f33612;
        C6236 c6236 = c11197.f33610;
        c11881.getClass();
        C11881 c118812 = c11197.f33612;
        Uri uri = c118812.f35426;
        String str = c118812.f35423;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (C11003.equals(str, "application/x-image-uri")) {
            String str2 = C3603.f11424;
            throw null;
        }
        int m11006 = C3603.m11006(c118812.f35426, str);
        long j = c118812.f35421;
        C5749 c5749 = this.f73211;
        if (j != -9223372036854775807L) {
            c5749.m16179();
        }
        if (m11006 == 2 && (c10264 = this.f73213) != null) {
            InterfaceC11058 interfaceC11058 = this.f73216;
            interfaceC8840 = c10264;
            if (interfaceC11058 != null) {
                c10264.m25998(interfaceC11058);
                interfaceC8840 = c10264;
            }
        } else {
            try {
                interfaceC8840 = c5749.m16173(m11006);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        C10470 m17173 = c6236.m17173();
        if (c6236.f19103 == -9223372036854775807L) {
            m17173.m26362(this.f73208);
        }
        if (c6236.f19104 == -3.4028235E38f) {
            m17173.m26360(this.f73217);
        }
        if (c6236.f19101 == -3.4028235E38f) {
            m17173.m26358(this.f73214);
        }
        if (c6236.f19102 == -9223372036854775807L) {
            m17173.m26361(this.f73212);
        }
        if (c6236.f19100 == -9223372036854775807L) {
            m17173.m26359(this.f73215);
        }
        C6236 m26357 = m17173.m26357();
        if (!m26357.equals(c6236)) {
            C22464 m27766 = c11197.m27766();
            m27766.m50399(m26357);
            c11197 = m27766.m50394();
        }
        C11881 c118813 = c11197.f33612;
        InterfaceC3901 mo22836 = interfaceC8840.mo22836(c11197);
        AbstractC14545 abstractC14545 = c118813.f35424;
        if (!abstractC14545.isEmpty()) {
            InterfaceC3901[] interfaceC3901Arr = new InterfaceC3901[abstractC14545.size() + 1];
            interfaceC3901Arr[0] = mo22836;
            for (int i = 0; i < abstractC14545.size(); i++) {
                boolean z = this.f73210;
                InterfaceC15097 interfaceC15097 = this.f73207;
                if (z) {
                    C1297 c1297 = new C1297();
                    c1297.m4465(((C2024) abstractC14545.get(i)).f6753);
                    c1297.m4471(((C2024) abstractC14545.get(i)).f6751);
                    c1297.m4466(((C2024) abstractC14545.get(i)).f6750);
                    c1297.m4454(((C2024) abstractC14545.get(i)).f6752);
                    c1297.m4473(((C2024) abstractC14545.get(i)).f6749);
                    c1297.m4469(((C2024) abstractC14545.get(i)).f6748);
                    C8353 m4440 = c1297.m4440();
                    C14647 c14647 = new C14647(interfaceC15097, new C6546(this, m4440));
                    if (this.f73209.mo18777(m4440)) {
                        C1297 m21948 = m4440.m21948();
                        m21948.m4465("application/x-media3-cues");
                        m21948.m4445(m4440.f25614);
                        m21948.m4464(this.f73209.mo18778(m4440));
                        m4440 = m21948.m4440();
                    }
                    c14647.m34935(m4440);
                    InterfaceC11058 interfaceC110582 = this.f73216;
                    if (interfaceC110582 != null) {
                        c14647.m34936(interfaceC110582);
                    }
                    String uri2 = ((C2024) abstractC14545.get(i)).f6754.toString();
                    C22464 c22464 = new C22464();
                    c22464.m50401(uri2);
                    interfaceC3901Arr[i + 1] = c14647.mo22836(c22464.m50394());
                } else {
                    C20293 c20293 = new C20293(interfaceC15097);
                    InterfaceC11058 interfaceC110583 = this.f73216;
                    if (interfaceC110583 != null) {
                        c20293.m46545(interfaceC110583);
                    }
                    interfaceC3901Arr[i + 1] = c20293.m46544((C2024) abstractC14545.get(i));
                }
            }
            mo22836 = new C3195(interfaceC3901Arr);
        }
        C3414 c3414 = c11197.f33609;
        boolean z2 = c3414.f15255;
        long j2 = c3414.f15253;
        long j3 = c3414.f15256;
        if (j3 == 0 && j2 == Long.MIN_VALUE && !z2) {
            return mo22836;
        }
        C18449 c18449 = new C18449(mo22836);
        c18449.m42933(j3);
        c18449.m42931(j2);
        c18449.m42935(!c3414.f15254);
        c18449.m42932(c3414.f15257);
        c18449.m42936(z2);
        c18449.m42934(c3414.f15252);
        return c18449.m42930();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC1368[] m50667(C22682 c22682, C8353 c8353) {
        InterfaceC1368 c11394;
        if (c22682.f73209.mo18777(c8353)) {
            c11394 = new C16827(c22682.f73209.mo18779(c8353));
        } else {
            c11394 = new C11394(c8353);
        }
        return new InterfaceC1368[]{c11394};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC8840 m50666(Class cls, InterfaceC15097 interfaceC15097) {
        try {
            return (InterfaceC8840) cls.getConstructor(InterfaceC15097.class).newInstance(interfaceC15097);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
