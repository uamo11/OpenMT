package l;

import android.graphics.Bitmap;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: I23M */
/* renamed from: l.᩷ۧ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20844 extends C3695 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C20844 f67485 = new C20844();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67486 = Pattern.compile("/data/user(_de)?/\\d+/");

    @Override // l.C3695
    /* renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        AbstractC15440 mo32387 = mo32387(interfaceC17889);
        mo32387.getClass();
        if ((mo32387 instanceof C6849) && !m47660()) {
            return null;
        }
        if (i == 1 && interfaceC17889.getSize() > 268435456) {
            return null;
        }
        String path = interfaceC17889.getPath();
        long size = interfaceC17889.getSize();
        long time = interfaceC17889.getTime();
        int i2 = C13110.f39245;
        return C14460.m34530(path + size + time).toLowerCase();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            if (C19025.m43869(interfaceC17889.getSize(), interfaceC17889.getPath())) {
                EnumC21142 m43865 = C19025.m43865(m47661(interfaceC17889));
                if (m43865 == EnumC21142.NOT_MPEG_TS) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                } else {
                    if (m43865 != EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL) {
                        if (m43865 == EnumC21142.MPEG_TS) {
                            interfaceC17889.mo36965(new C5933(1));
                        }
                        return C19883.f64192;
                    }
                    interfaceC17889.mo36965(new C5933(1));
                    return C19883.f64188;
                }
            }
        }
        C19883 m9975 = C3256.m9975(interfaceC17889);
        if (m9975 == C19883.f64193) {
            String lowerCase = interfaceC17889.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C19883.f64240;
            }
            if ((interfaceC17889 instanceof C9555) && interfaceC17889.getParent().endsWith("/keys/") && (lowerCase.endsWith(".aes") || lowerCase.endsWith(".key") || lowerCase.endsWith(".enc") || lowerCase.endsWith(".pk8") || lowerCase.endsWith(".x509.pem"))) {
                return C19883.f64211;
            }
        }
        return m9975;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        if (r12.equals("/system/product/app/") == false) goto L145;
     */
    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo9351(l.InterfaceC17889 r12) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20844.mo9351(l.ᩳۜܳ):int");
    }

    /* renamed from: ܽ */
    public AbstractC15440 mo32387(InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433();
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C11813 m28875;
        String path = interfaceC17889.getPath();
        long size = interfaceC17889.getSize();
        long time = interfaceC17889.getTime();
        int i2 = C13110.f39245;
        String lowerCase = C14460.m34530(path + size + time).toLowerCase();
        if (i == 12) {
            lowerCase = C19025.m43859(lowerCase, interfaceC17889, interfaceC17889.getTime());
        }
        final AbstractC15440 mo32387 = mo32387(interfaceC17889);
        C11813 c11813 = null;
        switch (i) {
            case 1:
                mo32387.getClass();
                if ((!(mo32387 instanceof C6849) || m47660()) && interfaceC17889.getSize() <= 268435456) {
                    return C3695.m11250(lowerCase, C19883.f64215, true, new C13970(mo32387));
                }
                return mo11258(interfaceC17889).f64250;
            case 2:
                mo32387.getClass();
                return (!(mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64215, true, new C11505(mo32387)) : mo11258(interfaceC17889).f64250;
            case 3:
                mo32387.getClass();
                if ((mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                C19883 c19883 = C19883.f64196;
                C11813 m11250 = C3695.m11250(lowerCase, c19883, true, new C17887(mo32387));
                if (m11250 != c19883.f64250) {
                    interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a02a4, Boolean.TRUE);
                }
                return m11250;
            case 4:
                mo32387.getClass();
                if ((mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                String name = interfaceC17889.getName();
                int i3 = C9459.f28698;
                if (!C10062.m25249(name)) {
                    return C3695.m11250(lowerCase, C19883.f64188, true, new C14492(mo32387, 0));
                }
                C23569 m24305 = C9459.m24305(abstractC16891 == null ? C2499.f7958 : abstractC16891.mo6020(), interfaceC17889, 5);
                return (m24305.m52038() != EnumC6636.SUCCESS || (m28875 = C11813.m28875(m24305.m52037())) == null) ? m24305.m52038() == EnumC6636.CORRUPT ? C19883.f64188.f64250 : mo11258(interfaceC17889).f64250 : m28875;
            case 5:
                mo32387.getClass();
                return (!(mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64205, false, new C4503(mo32387)) : mo11258(interfaceC17889).f64250;
            case 6:
                mo32387.getClass();
                return (!(mo32387 instanceof C6849) || m47660()) ? C3695.m11250(lowerCase, C19883.f64229, true, new C7385(3, mo32387)) : mo11258(interfaceC17889).f64250;
            case 7:
                C11813 m28876 = C11813.m28876(RunnableC5974.m16752(interfaceC17889.getName()));
                return m28876 == null ? C19883.f64181.f64250 : m28876;
            case 8:
                C11813 m288762 = C11813.m28876(RunnableC5974.m16756(mo32387.mo23554()));
                return m288762 == null ? C19883.f64181.f64250 : m288762;
            case 9:
                try {
                    C23411 m36513 = mo32387.m36513("r");
                    try {
                        int i4 = C6297.f19463;
                        C11813 c118132 = ((m36513.length() > 40 && m36513.readInt() == 1230326093 && m36513.readInt() == 1128350240 && m36513.readInt() == 173036875) ? C19883.f64233 : C19883.f64193).f64250;
                        m36513.close();
                        return c118132;
                    } finally {
                    }
                } catch (IOException unused) {
                    return C19883.f64193.f64250;
                }
            case 10:
                try {
                    Uri uri = ((C9555) interfaceC17889).m24434().f12779;
                    int i5 = C18844.f59431;
                    if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                        c11813 = C11813.m28876(RunnableC5974.m16752(C18844.m43539(uri)));
                    }
                } catch (Exception unused2) {
                }
                return c11813 == null ? C19883.f64181.f64250 : c11813;
            case 11:
                mo32387.getClass();
                if ((mo32387 instanceof C6849) && !m47660()) {
                    return mo11258(interfaceC17889).f64250;
                }
                C19883 c198832 = C19883.f64237;
                C11813 m112502 = C3695.m11250(lowerCase, c198832, true, new InterfaceC4644() { // from class: l.᩻ۧ᩻
                    @Override // l.InterfaceC4644
                    /* renamed from: ֫ */
                    public final Bitmap mo5660() {
                        return C17447.m40790(AbstractC15440.this);
                    }
                });
                if (m112502 == c198832.f64250) {
                    return m112502;
                }
                C11813 m288763 = C11813.m28876(RunnableC5974.m16753(m112502, lowerCase));
                C11003.requireNonNull(m288763);
                return m288763;
            case 12:
                C11813 m288752 = C11813.m28875(C13110.m31773(lowerCase));
                if (m288752 != null) {
                    C19025.m43868(m47661(interfaceC17889), EnumC21142.MPEG_TS);
                    interfaceC17889.mo36965(new C5933(1));
                    return m288752;
                }
                EnumC21142 m43865 = C19025.m43865(m47661(interfaceC17889));
                EnumC21142 enumC21142 = EnumC21142.NOT_MPEG_TS;
                if (m43865 == enumC21142) {
                    interfaceC17889.mo36965((InterfaceC1629) null);
                    return C3256.m9975(interfaceC17889).f64250;
                }
                EnumC21142 enumC211422 = EnumC21142.MPEG_TS_WITHOUT_THUMBNAIL;
                if (m43865 == enumC211422) {
                    interfaceC17889.mo36965(new C5933(1));
                    return C19883.f64188.f64250;
                }
                if (m43865 == null) {
                    try {
                        InputStream mo27926 = mo32387.mo27926();
                        try {
                            EnumC21142 m43864 = C19025.m43864(mo27926);
                            if (mo27926 != null) {
                                mo27926.close();
                            }
                            C19025.m43868(m47661(interfaceC17889), m43864);
                            if (m43864 == enumC21142) {
                                interfaceC17889.mo36965((InterfaceC1629) null);
                                return C3256.m9975(interfaceC17889).f64250;
                            }
                        } finally {
                        }
                    } catch (IOException unused3) {
                        return C19883.f64188.f64250;
                    }
                }
                interfaceC17889.mo36965(new C5933(1));
                final AtomicReference atomicReference = new AtomicReference();
                C11813 m112503 = C3695.m11250(lowerCase, C19883.f64188, false, new InterfaceC4644() { // from class: l.ۜۧ᩻
                    @Override // l.InterfaceC4644
                    /* renamed from: ֫ */
                    public final Bitmap mo5660() {
                        C9853 m40792 = C17447.m40792(AbstractC15440.this);
                        atomicReference.set(m40792);
                        return m40792.m24923();
                    }
                });
                C9853 c9853 = (C9853) atomicReference.get();
                if (c9853 != null && c9853.m24924()) {
                    C19025.m43868(m47661(interfaceC17889), enumC211422);
                }
                return m112503;
            default:
                throw new RuntimeException();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m47661(InterfaceC17889 interfaceC17889) {
        return C19025.m43859("local:" + interfaceC17889.getPath() + (char) 0 + interfaceC17889.getSize() + (char) 0 + interfaceC17889.getTime(), interfaceC17889, interfaceC17889.getTime());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m47660() {
        return ApplicationC20075.f65010.getBoolean("external_storage_thumb_enable", true);
    }
}
