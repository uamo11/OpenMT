package l;

import android.content.DialogInterface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: XAJ9 */
/* renamed from: l.ۤ֡ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9942 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f30022;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f30023;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f30024;

    public C9942() {
        super(R.string.MT_Protector_res_0x7f1205ba, R.drawable.MT_Protector_res_0x7f0801e2);
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (!c2450.m7916("local") && !c2450.m7916("zip") && !c2450.m7916(b.k)) {
            return false;
        }
        if (c2450.m7918() == 2) {
            return true;
        }
        C16560 m7919 = c2450.m7919();
        return m7919.m39035("local") || m7919.m39035("zip") || m7919.m39035(b.k);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        String name;
        String name2;
        if (c2450.m7918() == 2) {
            List m7909 = c2450.m7909();
            this.f30022 = (InterfaceC17889) m7909.get(0);
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) m7909.get(1);
            AbstractC16891 m7922 = c2450.m7922();
            this.f30023 = m7922;
            this.f30024 = m7922;
            C16560 m7921 = c2450.m7921();
            InterfaceC17889 interfaceC178892 = this.f30022;
            m25068(m7921, interfaceC178892, interfaceC17889, interfaceC178892.getPath(), interfaceC17889.getPath(), true);
            return;
        }
        C16560 m7919 = c2450.m7919();
        this.f30022 = c2450.m7913();
        InterfaceC17889 m39025 = m7919.m39025();
        this.f30024 = c2450.m7922();
        this.f30023 = m7919.m39044();
        boolean m39064 = c2450.m7921().m39064();
        if (this.f30022.getName().equals(m39025.getName())) {
            int i = R.string.MT_Protector_res_0x7f1201c0;
            String m14306 = C4925.m14306(m39064 ? R.string.MT_Protector_res_0x7f1201bf : R.string.MT_Protector_res_0x7f1201c0, this.f30022.getName());
            if (!m39064) {
                i = R.string.MT_Protector_res_0x7f1201bf;
            }
            name2 = C4925.m14306(i, m39025.getName());
            name = m14306;
        } else {
            name = this.f30022.getName();
            name2 = m39025.getName();
        }
        if (m39064) {
            m25068(c2450.m7921(), this.f30022, m39025, name, name2, false);
        } else {
            m25068(c2450.m7921(), m39025, this.f30022, name2, name, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25068(final C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC17889 interfaceC178892, String str, String str2, boolean z) {
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00a9);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(m5610());
        final C14879 c14879 = new C14879();
        c14879.f45411 = interfaceC17889;
        c14879.f45412 = interfaceC178892;
        c14879.f45413 = str;
        c14879.f45414 = str2;
        if (z && interfaceC17889.getTime() > interfaceC178892.getTime()) {
            InterfaceC17889 interfaceC178893 = c14879.f45411;
            c14879.f45411 = c14879.f45412;
            c14879.f45412 = interfaceC178893;
            String str3 = c14879.f45413;
            c14879.f45413 = c14879.f45414;
            c14879.f45414 = str3;
        }
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c14879.f45413, c14879.f45414, editText, editText2);
        Main m39056 = c16560.m39056();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(m39056);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡֡ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C9942.m25067(C9942.this, c16560, c14879);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f12030f, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ֡ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14879 c148792 = C14879.this;
                InterfaceC17889 interfaceC178894 = c148792.f45411;
                c148792.f45411 = c148792.f45412;
                c148792.f45412 = interfaceC178894;
                String str4 = c148792.f45413;
                String str5 = c148792.f45414;
                c148792.f45413 = str5;
                c148792.f45414 = str4;
                C2079.m6836(str5, str4, editText, editText2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25067(C9942 c9942, C16560 c16560, C14879 c14879) {
        AbstractC16891 abstractC16891;
        AbstractC16891 abstractC168912;
        InterfaceC17889 interfaceC17889 = c14879.f45411;
        InterfaceC17889 interfaceC178892 = c14879.f45412;
        if (interfaceC17889 == c9942.f30022) {
            abstractC16891 = c9942.f30024;
            abstractC168912 = c9942.f30023;
        } else {
            abstractC16891 = c9942.f30023;
            abstractC168912 = c9942.f30024;
        }
        abstractC16891.mo15162(interfaceC17889);
        abstractC168912.mo15162(interfaceC178892);
        AbstractC15440 m51761 = C23346.m51761(c16560, c9942.m5610(), "txt");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C12058.class);
        c0994.m3474("saveAsPath", m51761.mo23554());
        c0994.m3474("inputPath1", interfaceC17889.getPath());
        c0994.m3474("inputPath2", interfaceC178892.getPath());
        if (interfaceC17889 instanceof C12645) {
            c0994.m3474("zipPath1", ((C10738) abstractC16891).m26937());
        } else if (interfaceC17889 instanceof AbstractC17191) {
            c0994.m3476("statelessVisitor1", abstractC16891.mo6020().m33350());
        } else if (!(interfaceC17889 instanceof C9555)) {
            throw new RuntimeException();
        }
        if (interfaceC178892 instanceof C12645) {
            c0994.m3474("zipPath2", ((C10738) abstractC168912).m26937());
        } else if (interfaceC178892 instanceof AbstractC17191) {
            c0994.m3476("statelessVisitor2", abstractC168912.mo6020().m33350());
        } else if (!(interfaceC178892 instanceof C9555)) {
            throw new RuntimeException();
        }
        c0994.m3469();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25066(HashMap hashMap, C18090 c18090, String str, boolean z) {
        C14561 m42196 = c18090.m42196();
        String str2 = str.substring(1) + "/";
        for (C3545 c3545 : c18090.m42210()) {
            if (!c3545.isDirectory()) {
                if (c3545.m10808()) {
                    throw new IOException("Comparing encrypted files is not supported");
                }
                if (c3545.getName().startsWith(str2)) {
                    String substring = c3545.getName().substring(str2.length());
                    hashMap.put(substring, new C0768(substring, c3545.getSize(), z ? Long.valueOf(c3545.getSize()) : new C23492(c3545), m42196, c3545));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25064(HashMap hashMap, AbstractC15440 abstractC15440, boolean z, String str, C12058 c12058) {
        Object c7824;
        Object c19820;
        if (c12058.mo1526()) {
            return;
        }
        for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
            if (abstractC154402.mo23113()) {
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(abstractC154402.getName());
                m15339.append("/");
                String sb = m15339.toString();
                if (z) {
                    hashMap.put(sb, new C21231(0L, abstractC154402, sb));
                }
                m25064(hashMap, abstractC154402, z, sb, c12058);
            } else {
                StringBuilder m153392 = C5368.m15339(str);
                m153392.append(abstractC154402.getName());
                String sb2 = m153392.toString();
                if (abstractC154402.mo27911()) {
                    c7824 = new C21231(abstractC154402.mo23127(), abstractC154402, sb2);
                } else {
                    String m36519 = abstractC154402.m36519();
                    if (m36519 != null) {
                        c19820 = new C21936(sb2, m36519);
                    } else {
                        try {
                            C4297 m25061 = m25061(abstractC154402);
                            char c = m25061.f13863;
                            if (c == '-' || c == 'd') {
                                c7824 = new C21231(abstractC154402.mo23127(), abstractC154402, sb2);
                            } else {
                                c19820 = new C19820(sb2, m25061);
                            }
                        } catch (IOException e) {
                            c7824 = new C7824(sb2, e);
                        }
                    }
                    c7824 = c19820;
                }
                hashMap.put(sb2, c7824);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4297 m25061(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo27917()) {
            C17642 m27928 = abstractC15440.mo27925().m27928();
            char m27176 = C10881.m27176(m27928.m41289());
            if (m27176 != 'l') {
                return new C4297((m27176 == 'b' || m27176 == 'c') ? m27928.m41282() : 0L, m27176);
            }
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to resolve special link target: ")));
        }
        if (!abstractC15440.mo36530()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to inspect special file: ")));
        }
        try {
            StructStat lstat = Os.lstat(abstractC15440.mo36531().mo23544());
            char m271762 = C10881.m27176(lstat.st_mode);
            if (m271762 != 'l') {
                return new C4297((m271762 == 'b' || m271762 == 'c') ? lstat.st_rdev : 0L, m271762);
            }
            throw new IOException("Unable to resolve special link target: " + abstractC15440.mo23554());
        } catch (ErrnoException e) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to inspect special file: ")), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25069(String str) {
        C10130 c10130 = new C10130();
        c10130.writeByte(77);
        c10130.writeByte(84);
        c10130.writeByte(0);
        c10130.writeByte(76);
        c10130.writeByte(73);
        c10130.writeByte(78);
        c10130.writeByte(75);
        c10130.writeByte(1);
        c10130.writeByte(78);
        c10130.writeByte(79);
        c10130.writeByte(84);
        c10130.writeByte(2);
        c10130.writeByte(69);
        c10130.writeByte(88);
        c10130.writeByte(73);
        c10130.writeByte(83);
        c10130.writeByte(84);
        c10130.writeByte(83);
        c10130.writeByte(3);
        c10130.m25439(str);
        return c10130.m25444();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25062(HashMap hashMap, AbstractC3163 abstractC3163, String str, boolean z, String str2, C12058 c12058) {
        if (c12058.mo1526()) {
            return;
        }
        Iterator it = abstractC3163.mo7637(str, true).iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory()) {
                StringBuilder m15339 = C5368.m15339(str2);
                m15339.append(interfaceC17889.getName());
                m15339.append("/");
                String sb = m15339.toString();
                if (z) {
                    hashMap.put(sb, new C2886(abstractC3163, interfaceC17889, sb, 0L));
                }
                m25062(hashMap, abstractC3163, interfaceC17889.getPath(), z, sb, c12058);
            } else {
                StringBuilder m153392 = C5368.m15339(str2);
                m153392.append(interfaceC17889.getName());
                String sb2 = m153392.toString();
                hashMap.put(sb2, new C2886(abstractC3163, interfaceC17889, sb2, interfaceC17889.getSize()));
            }
        }
    }
}
