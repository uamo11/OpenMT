package l;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: D9TI */
/* renamed from: l.ᩳۜ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17897 extends C3695 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f54652;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int f54654;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean f54655;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f54657;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8102 f54658;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f54659;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC3577 f54660;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f54661;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ConnectivityManager f54653 = (ConnectivityManager) C4925.m14326("connectivity");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f54656 = true;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m41876() {
        synchronized (C17897.class) {
            if (f54656) {
                f54656 = false;
                f54655 = ApplicationC20075.f65010.getBoolean("network_thumb_enable", true);
                f54652 = ApplicationC20075.f65010.getBoolean("network_thumb_only_load_on_wifi", true);
                f54654 = ApplicationC20075.f65010.getInt("network_thumb_time_limit", 10);
                f54657 = AbstractC3577.m10932(ApplicationC20075.f65010.getString("network_thumb_image_file_size_limit", "10MB"));
            }
        }
    }

    public C17897(AbstractC3163 abstractC3163) {
        this.f54661 = abstractC3163;
        this.f54658 = new C8102(abstractC3163);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41874() {
        f54656 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m41872() {
        AbstractC3577 abstractC3577 = this.f54661.f9955;
        if (abstractC3577.f11357) {
            return f54655;
        }
        return abstractC3577.f11353;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            if (C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath())) {
                EnumC21142 m43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                if (m43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                } else {
                    if (m43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (m43865 == EnumC21142.MPEG_TS) {
                            interfaceC17889.mo36965(new C7810());
                        }
                        return C19883.f64192;
                    }
                    interfaceC17889.mo36965(new C7810());
                    return C19883.f64188;
                }
            }
        }
        return C3256.m9975(interfaceC17889);
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        long j;
        long j2;
        m41876();
        if (m41872() && interfaceC17889.mo36969()) {
            if (C19025.m43871(interfaceC17889.getPath())) {
                if (!C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath()) || Build.VERSION.SDK_INT < 23) {
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                EnumC21142 m43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                if (m43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                    interfaceC17889.mo36974(0);
                    return 0;
                }
                if (m43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                    if (m43865 != EnumC21142.MPEG_TS) {
                        return 12;
                    }
                    interfaceC17889.mo36965(new C7810());
                    return 12;
                }
                interfaceC17889.mo36965(new C7810());
                interfaceC17889.mo36974(0);
                return 0;
            }
            String mo36971 = interfaceC17889.mo36971();
            boolean equals = mo36971.equals("image/svg+xml");
            AbstractC3163 abstractC3163 = this.f54661;
            if (equals) {
                long size = interfaceC17889.getSize();
                AbstractC3577 abstractC3577 = abstractC3163.f9955;
                if (abstractC3577.f11357) {
                    j2 = f54657;
                } else {
                    j2 = abstractC3577.f11347;
                }
                if (size < j2) {
                    return 2;
                }
            }
            if (mo36971.startsWith("image/")) {
                long size2 = interfaceC17889.getSize();
                AbstractC3577 abstractC35772 = abstractC3163.f9955;
                if (abstractC35772.f11357) {
                    j = f54657;
                } else {
                    j = abstractC35772.f11347;
                }
                if (size2 < j) {
                    return 1;
                }
            }
            String name = interfaceC17889.getName();
            int i = C9459.f28698;
            if (C10062.m25249(name)) {
                return 4;
            }
            if (Build.VERSION.SDK_INT >= 23 && mo36971.startsWith("video/")) {
                return 4;
            }
        }
        return 0;
    }

    @Override // l.C3695
    /* renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        m41876();
        if (m41872()) {
            return m41873(interfaceC17889);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11813 m41871(String str, C19883 c19883, C19883 c198832, InterfaceC4644 interfaceC4644) {
        boolean z;
        int i;
        m41876();
        if (!m41872()) {
            return c198832.f64250;
        }
        if (C3695.m11253(str)) {
            return c19883.f64250;
        }
        if (C3695.m11254(str)) {
            return c198832.f64250;
        }
        ConnectivityManager connectivityManager = f54653;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            AbstractC3163 abstractC3163 = this.f54661;
            AbstractC3577 abstractC3577 = abstractC3163.f9955;
            if (abstractC3577.f11357) {
                z = f54652;
            } else {
                z = abstractC3577.f11352;
            }
            if (!z || (activeNetworkInfo.getType() & 9) != 0) {
                try {
                    AbstractC3577 abstractC35772 = abstractC3163.f9955;
                    if (abstractC35772.f11357) {
                        i = f54654;
                    } else {
                        i = abstractC35772.f11351;
                    }
                    C11813 m28875 = C11813.m28875(C13110.m31774(str, interfaceC4644, i));
                    if (m28875 != null) {
                        return m28875;
                    }
                    C11813 c11813 = c19883.f64250;
                    C3695.m11256(str);
                    return c11813;
                } catch (TimeoutException unused) {
                    C3695.m11255(str);
                    return c198832.f64250;
                }
            }
        }
        Bitmap m31773 = C13110.m31773(str);
        if (m31773 != null) {
            return C11813.m28875(m31773);
        }
        return c198832.f64250;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m41868(C17897 c17897, InterfaceC17889 interfaceC17889) {
        return C17447.m40787(new C6399(new C14159(new C19755(c17897.f54661, interfaceC17889), interfaceC17889.getName(), interfaceC17889.getSize())));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m41869(C17897 c17897, InterfaceC17889 interfaceC17889, AtomicReference atomicReference, AtomicReference atomicReference2) {
        C6399 c6399 = new C6399(new C14159(new C19755(c17897.f54661, interfaceC17889), interfaceC17889.getName(), interfaceC17889.getSize()));
        boolean z = false;
        try {
            try {
                if (((EnumC21142) atomicReference.get()) == null) {
                    EnumC21142 m43863 = C19025.m43863(c6399);
                    atomicReference.set(m43863);
                    C19025.m43868(C19025.m43859("network:" + c17897.m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), m43863);
                    if (m43863 == EnumC21142.NOT_MPEG_TS) {
                        C0349.m1793(c6399);
                        return null;
                    }
                }
                interfaceC17889.mo36965(new C7810());
                z = true;
                try {
                    C9853 m40784 = C17447.m40784(c6399);
                    atomicReference2.set(m40784);
                    return m40784.m24923();
                } catch (IOException unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (!z) {
                    C0349.m1793(c6399);
                }
                throw th;
            }
        } catch (IOException unused2) {
            C0349.m1793(c6399);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m41873(InterfaceC17889 interfaceC17889) {
        return C14460.m34530(this.f54661.mo9688() + interfaceC17889.getPath() + interfaceC17889.getSize() + interfaceC17889.getTime()).toLowerCase();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, final InterfaceC17889 interfaceC17889, int i) {
        String m41873;
        C11813 m28875;
        C19883 c19883;
        if (i == 12) {
            MessageDigest m34534 = C14460.m34534();
            C14460.m34528(m34534, m41875(interfaceC17889));
            m41873 = C14460.m34531(m34534.digest());
        } else {
            m41873 = m41873(interfaceC17889);
        }
        if (i == 12) {
            m41873 = C19025.m43859(m41873, interfaceC17889, interfaceC17889.getTime());
        }
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                AbstractC3163 abstractC3163 = this.f54661;
                ConnectivityManager connectivityManager = f54653;
                if (i == 4) {
                    String name = interfaceC17889.getName();
                    int i3 = C9459.f28698;
                    if (C10062.m25249(name)) {
                        m41876();
                        C19883 mo11258 = mo11258(interfaceC17889);
                        if (!m41872() || C3695.m11254(m41873)) {
                            return mo11258.f64250;
                        }
                        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            AbstractC3577 abstractC3577 = abstractC3163.f9955;
                            if (!(abstractC3577.f11357 ? f54652 : abstractC3577.f11352) || (activeNetworkInfo.getType() & 9) != 0) {
                                AbstractC3577 abstractC35772 = abstractC3163.f9955;
                                C23569 m24305 = C9459.m24305(abstractC3163, interfaceC17889, abstractC35772.f11357 ? f54654 : abstractC35772.f11351);
                                if (m24305.m52038() == EnumC6636.SUCCESS && (m28875 = C11813.m28875(m24305.m52037())) != null) {
                                    return m28875;
                                }
                                if (m24305.m52038() == EnumC6636.TIMEOUT) {
                                    C3695.m11255(m41873);
                                } else if (m24305.m52038() == EnumC6636.CORRUPT) {
                                    return C19883.f64188.f64250;
                                }
                                return mo11258.f64250;
                            }
                        }
                        return mo11258.f64250;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        C19883 c198832 = C19883.f64192;
                        return m41871(m41873, c198832, c198832, new C8779(i2, this, interfaceC17889));
                    }
                } else if (i == 12 && Build.VERSION.SDK_INT >= 23) {
                    C11813 m288752 = C11813.m28875(C13110.m31773(m41873));
                    if (m288752 != null) {
                        C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), EnumC21142.MPEG_TS);
                        interfaceC17889.mo36965(new C7810());
                        return m288752;
                    }
                    EnumC21142 m43865 = C19025.m43865(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()));
                    EnumC21142 enumC21142 = EnumC21142.NOT_MPEG_TS;
                    if (m43865 == enumC21142) {
                        interfaceC17889.mo36965((InterfaceC1629) null);
                        return C3256.m9975(interfaceC17889).f64250;
                    }
                    EnumC21142 enumC211422 = EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL;
                    if (m43865 == enumC211422) {
                        interfaceC17889.mo36965(new C7810());
                        return C19883.f64188.f64250;
                    }
                    if (C3695.m11254(m41873)) {
                        return C19883.f64188.f64250;
                    }
                    NetworkInfo activeNetworkInfo2 = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (m41872() && activeNetworkInfo2 != null && activeNetworkInfo2.isConnected()) {
                        AbstractC3577 abstractC35773 = abstractC3163.f9955;
                        if (!(abstractC35773.f11357 ? f54652 : abstractC35773.f11352) || (activeNetworkInfo2.getType() & 9) != 0) {
                            AtomicReference atomicReference = new AtomicReference(m43865);
                            AtomicReference atomicReference2 = new AtomicReference();
                            try {
                                C22641 c22641 = new C22641(this, interfaceC17889, atomicReference, atomicReference2);
                                AbstractC3577 abstractC35774 = abstractC3163.f9955;
                                Bitmap m31774 = C13110.m31774(m41873, c22641, abstractC35774.f11357 ? f54654 : abstractC35774.f11351);
                                EnumC21142 enumC211423 = (EnumC21142) atomicReference.get();
                                if (m31774 != null) {
                                    C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), EnumC21142.MPEG_TS);
                                    interfaceC17889.mo36965(new C7810());
                                    C11813 m288753 = C11813.m28875(m31774);
                                    return m288753 != null ? m288753 : C19883.f64188.f64250;
                                }
                                if (enumC211423 == enumC21142) {
                                    interfaceC17889.mo36965((InterfaceC1629) null);
                                    return C3256.m9975(interfaceC17889).f64250;
                                }
                                if (enumC211423 == EnumC21142.MPEG_TS) {
                                    interfaceC17889.mo36965(new C7810());
                                }
                                C9853 c9853 = (C9853) atomicReference2.get();
                                if (c9853 != null && c9853.m24924()) {
                                    C19025.m43868(C19025.m43859("network:" + m41875(interfaceC17889), interfaceC17889, interfaceC17889.getTime()), enumC211422);
                                }
                                return C19883.f64188.f64250;
                            } catch (TimeoutException unused) {
                                EnumC21142 enumC211424 = (EnumC21142) atomicReference.get();
                                if (enumC211424 == EnumC21142.NOT_MPEG_TS) {
                                    interfaceC17889.mo36965((InterfaceC1629) null);
                                    c19883 = C3256.m9975(interfaceC17889);
                                } else {
                                    if (enumC211424 == EnumC21142.MPEG_TS) {
                                        interfaceC17889.mo36965(new C7810());
                                    }
                                    C3695.m11255(m41873);
                                    c19883 = C19883.f64188;
                                }
                                return c19883.f64250;
                            }
                        }
                    }
                    return C19883.f64188.f64250;
                }
                throw new RuntimeException();
            }
        }
        C19883 c198833 = C19883.f64187;
        return m41871(m41873, c198833, c198833, new InterfaceC4644() { // from class: l.֫ۜ᩻
            @Override // l.InterfaceC4644
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Bitmap mo5660() {
                C17897 c17897 = C17897.this;
                InterfaceC17889 interfaceC178892 = interfaceC17889;
                AbstractC15440 m36527 = C16293.f50111.m36527();
                ArrayList arrayList = new ArrayList();
                try {
                    return C17447.m40782(new C16485(c17897, arrayList, interfaceC178892, m36527));
                } finally {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0349.m1793((InputStream) it.next());
                    }
                    m36527.mo23552();
                }
            }
        });
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m41875(InterfaceC17889 interfaceC17889) {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            AbstractC3577 abstractC3577 = this.f54661.f9955;
            if (this.f54659 == null || !abstractC3577.equals(this.f54660)) {
                AbstractC3577 clone = abstractC3577.clone();
                MessageDigest m34534 = C14460.m34534();
                m34534.update(b.k.getBytes());
                C14460.m34528(m34534, clone.mo6369().toString());
                String m34531 = C14460.m34531(m34534.digest());
                this.f54659 = m34531;
                this.f54660 = clone;
                str = m34531;
            } else {
                str = this.f54659;
            }
        }
        sb.append(str);
        sb.append((char) 0);
        sb.append(interfaceC17889.getPath());
        sb.append((char) 0);
        sb.append(interfaceC17889.getSize());
        sb.append((char) 0);
        sb.append(interfaceC17889.getTime());
        return sb.toString();
    }
}
