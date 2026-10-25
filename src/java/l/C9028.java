package l;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 64SD */
/* renamed from: l.ۡܿܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9028 extends AbstractC9049 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13260 f27392;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f27393;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC9734 f27394;

    public C9028(EnumC9734 enumC9734) {
        C13260 c13260 = new C13260();
        this.f27392 = c13260;
        this.f27393 = new ArrayList();
        C11003.requireNonNull(enumC9734);
        this.f27394 = enumC9734;
        c13260.m32181(true);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C9028 m23280() {
        return new C9028(EnumC9734.ERROR);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23277(EnumC9734 enumC9734) {
        return new C9028(enumC9734);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23278(byte[] bArr) {
        return m23279(bArr, EnumC9734.ERROR);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23279(byte[] bArr, EnumC9734 enumC9734) {
        return m23276(new C23326(bArr), enumC9734);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9028 m23276(AbstractC9049 abstractC9049, EnumC9734 enumC9734) {
        C9028 c9028 = new C9028(enumC9734);
        boolean mo3391 = abstractC9049.mo14959().mo3391();
        C13260 c13260 = c9028.f27392;
        c13260.m32181(mo3391);
        for (InterfaceC4277 interfaceC4277 : abstractC9049.mo21936()) {
            C8322 m23281 = c9028.m23281(interfaceC4277.mo12858(), interfaceC4277.getPackageName());
            m23281.m21922(interfaceC4277.mo12848());
            for (InterfaceC9216 interfaceC9216 : interfaceC4277.mo12855()) {
                m23281.m21919(interfaceC9216.mo23657(), interfaceC9216.getPackageName());
            }
            for (InterfaceC16270 interfaceC16270 : interfaceC4277.mo12845()) {
                C0560 m21917 = m23281.m21917(interfaceC16270.getName(), interfaceC16270.mo12339());
                for (InterfaceC2866 interfaceC2866 : interfaceC16270.mo12337()) {
                    m21917.m2308(interfaceC2866.mo8776(), new C15859(interfaceC2866.mo8775()));
                }
            }
            for (InterfaceC19094 interfaceC19094 : interfaceC4277.mo12857()) {
                C15376 m21923 = m23281.m21923();
                for (InterfaceC19800 interfaceC19800 : interfaceC19094.mo43981()) {
                    m21923.m36411(interfaceC19800.mo45543(), interfaceC19800.mo45542());
                }
            }
            for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                C20317 m21925 = m23281.m21925(interfaceC0748.mo2870(), interfaceC0748.getTypeName());
                m21925.m46624(interfaceC0748.mo2878());
                C18955 c18955 = new C18955();
                ArrayList arrayList = new ArrayList(interfaceC0748.mo2871());
                Iterator it = interfaceC0748.mo2872().iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC7099) it.next());
                }
                Collections.sort(arrayList, C8200.comparing(new C7680(1)));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC7099 interfaceC7099 = (InterfaceC7099) it2.next();
                    if (c18955.add(interfaceC7099.mo18742())) {
                        C2678 m46608 = m21925.m46608(interfaceC7099.mo18743());
                        m46608.m8397(interfaceC7099.mo2345());
                        m46608.m8395(interfaceC7099.mo2349());
                        for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                            m21925.m46611(interfaceC21211.mo47883(), interfaceC21211.mo29406(), true);
                            m46608.m8392(interfaceC21211.mo47883()).m43645(interfaceC21211);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C20317 c20317 : m23281.mo12850()) {
                for (int mo2871 = c20317.mo2871() - 1; mo2871 >= 0; mo2871--) {
                    if (!c20317.mo2877(mo2871).mo18746().iterator().hasNext()) {
                        c20317.m46626(mo2871);
                    }
                }
                if (c20317.mo2871() == 0) {
                    arrayList2.add(Integer.valueOf(c20317.mo2870()));
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                m23281.m21918(((Integer) it3.next()).intValue());
            }
        }
        c13260.m32187();
        return c9028;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8322 m23281(int i, String str) {
        ArrayList arrayList = this.f27393;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8322 c8322 = (C8322) it.next();
            if (c8322.mo12858() == i) {
                if (!c8322.getPackageName().equals(str)) {
                    EnumC9734 enumC9734 = EnumC9734.MERGE;
                    EnumC9734 enumC97342 = this.f27394;
                    if (enumC97342 != enumC9734) {
                        if (enumC97342 == EnumC9734.ERROR) {
                            throw new RuntimeException(String.format("There is already a package with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c8322.getPackageName(), str));
                        }
                        if (enumC97342 == EnumC9734.CREATE) {
                            break;
                        }
                    }
                }
                return c8322;
            }
        }
        C8322 c83222 = new C8322(this, i, str);
        arrayList.add(c83222);
        return c83222;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m23285() {
        C13260 c13260 = this.f27392;
        c13260.m32183();
        Iterator it = m23370().iterator();
        while (it.hasNext()) {
            ((C8322) it.next()).m21926();
        }
        c13260.m32188();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23282(OutputStream outputStream) {
        C10130 c10130 = new C10130();
        m23283(c10130, (C19277) null);
        c10130.m25421(outputStream);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23283(InterfaceC4485 interfaceC4485, C19277 c19277) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m23370().iterator();
        int i = 0;
        while (it.hasNext()) {
            C11850 c11850 = new C11850((C8322) it.next());
            arrayList.add(c11850);
            i += c11850.f35370.size();
        }
        interfaceC4485.mo13229((short) 2);
        interfaceC4485.mo13229((short) 12);
        long position = interfaceC4485.getPosition();
        interfaceC4485.mo13232();
        interfaceC4485.writeInt(i);
        this.f27392.m32180(interfaceC4485, true, c19277);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C11850 c118502 = (C11850) it2.next();
            c118502.f35371.m21921(interfaceC4485, c19277, c118502);
        }
        long position2 = interfaceC4485.getPosition();
        interfaceC4485.seek(position);
        interfaceC4485.writeInt((int) ((position2 - position) + 4));
        interfaceC4485.seek(position2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19277 m23287() {
        int m32185 = this.f27392.m32185();
        for (C8322 c8322 : m23370()) {
            c8322.getClass();
            HashMap hashMap = new HashMap();
            int i = 0;
            int i2 = 1;
            for (C20317 c20317 : c8322.mo12850()) {
                String typeName = c20317.getTypeName();
                Integer num = (Integer) hashMap.get(typeName);
                int intValue = num == null ? 1 : num.intValue() + 1;
                hashMap.put(typeName, Integer.valueOf(intValue));
                i2 = Math.max(i2, intValue);
                i += c20317.m46625();
            }
            m32185 = C23202.m51496(i2, 3, i, m32185);
        }
        return new C19277(m32185);
    }

    @Override // l.InterfaceC9922
    /* renamed from: ᩻ۧ */
    public final InterfaceC12743 mo14959() {
        return this.f27392;
    }

    @Override // l.InterfaceC9922
    /* renamed from: ᩻ۧ */
    public final C13260 mo14959() {
        return this.f27392;
    }

    @Override // l.InterfaceC9922
    /* renamed from: ۚ */
    public final int mo14956() {
        return this.f27393.size();
    }

    @Override // l.InterfaceC9922
    /* renamed from: ۢ */
    public final C8322 mo14957(int i) {
        return (C8322) this.f27393.get(i);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23284() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27393;
            if (i >= arrayList.size()) {
                return;
            }
            if (((C8322) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8322 m23286() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f27393;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C8322) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                return (C8322) arrayList.get(i);
            }
            i++;
        }
    }
}
