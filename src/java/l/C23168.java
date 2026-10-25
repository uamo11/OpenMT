package l;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: N7KG */
/* renamed from: l.᩺ᩴ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23168 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f74455 = new C4314();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74456;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f74457 = new HashSet();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f74458;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4725 f74459;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4824 f74460;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f74461;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22364 f74462;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f74463;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23168 m51341(C2903 c2903) {
        C23168 c23168 = (C23168) c2903.m8838(f74455);
        return c23168 == null ? new C23168(c2903) : c23168;
    }

    public C23168(C2903 c2903) {
        c2903.m8841(f74455, this);
        C11781 m28823 = C11781.m28823(c2903);
        this.f74456 = m28823.m28832(EnumC0121.f1210);
        C22364 m50099 = C22364.m50099(c2903);
        this.f74462 = m50099;
        C4824 m14050 = C4824.m14050(c2903);
        this.f74460 = m14050;
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f74463 = m38301;
        EnumC20347 enumC20347 = EnumC20347.PREVIEW;
        this.f74459 = new C4725(m50099, m38301, m14050.m14055(enumC20347), "preview", enumC20347);
        this.f74458 = m28823.m28831("forcePreview");
        HashMap hashMap = new HashMap();
        for (EnumC10892 enumC10892 : EnumC10892.values()) {
            int i = enumC10892.f32756;
            EnumC16280 m38300 = EnumC16280.m38300(enumC10892.f32755);
            if (m38300 != null) {
                hashMap.put(Integer.valueOf(i), m38300);
            }
        }
        this.f74461 = hashMap;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51349() {
        this.f74457.add(this.f74462.m50117());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51345(InterfaceC3109 interfaceC3109, C11076 c11076) {
        this.f74459.m13840(interfaceC3109, c11076);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51348(InterfaceC18278 interfaceC18278) {
        return this.f74457.contains(interfaceC18278);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51344(InterfaceC3109 interfaceC3109, EnumC10637 enumC10637) {
        C11076 c11076;
        C12171.m29642(this.f74456);
        C12171.m29642(m51351(enumC10637));
        if (this.f74460.m14056(EnumC20347.PREVIEW)) {
            return;
        }
        this.f74457.add(this.f74462.m50117());
        if (enumC10637.m26685()) {
            C11576 m26687 = enumC10637.m26687();
            C11076 c110762 = C14001.f42334;
            c11076 = new C11076("compiler", "preview.feature.use.plural", m26687);
        } else {
            C11576 m266872 = enumC10637.m26687();
            C11076 c110763 = C14001.f42334;
            c11076 = new C11076("compiler", "preview.feature.use", m266872);
        }
        this.f74459.m13840(interfaceC3109, c11076);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51347() {
        return this.f74456;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51350(InterfaceC18278 interfaceC18278, int i) {
        C12171.m29642(this.f74456);
        EnumC20347 enumC20347 = EnumC20347.PREVIEW;
        if (this.f74460.m14055(enumC20347)) {
            HashSet hashSet = this.f74457;
            C22364 c22364 = this.f74462;
            hashSet.add(c22364.m50117());
            String str = ((EnumC16280) this.f74461.get(Integer.valueOf(i))).f50071;
            C11076 c11076 = C14001.f42334;
            c22364.m7281(enumC20347, (InterfaceC3109) null, new C11076("compiler", "preview.feature.use.classfile", interfaceC18278, str));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51351(EnumC10637 enumC10637) {
        int i = C11880.f35419[enumC10637.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return this.f74458;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12281 m51342(EnumC10637 enumC10637) {
        C12171.m29642(!this.f74456);
        if (enumC10637.m26685()) {
            C11576 m26687 = enumC10637.m26687();
            C12281 c12281 = C6241.f19132;
            return new C12281("compiler", "preview.feature.disabled.plural", m26687);
        }
        C11576 m266872 = enumC10637.m26687();
        C12281 c122812 = C6241.f19132;
        return new C12281("compiler", "preview.feature.disabled", m266872);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12281 m51343(InterfaceC18278 interfaceC18278, int i) {
        C12171.m29642(!this.f74456);
        String str = ((EnumC16280) this.f74461.get(Integer.valueOf(i))).f50071;
        C12281 c12281 = C6241.f19132;
        return new C12281("compiler", "preview.feature.disabled.classfile", interfaceC18278, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51352() {
        this.f74459.m13839();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51346(AbstractC12612 abstractC12612, EnumC10637 enumC10637) {
        boolean m51351 = m51351(enumC10637);
        C22364 c22364 = this.f74462;
        boolean z = this.f74456;
        if (m51351 && !z) {
            c22364.m7280(EnumC20043.SOURCE_LEVEL, abstractC12612, m51342(enumC10637));
            return;
        }
        EnumC16280 enumC16280 = this.f74463;
        if (!enumC10637.m26686(enumC16280)) {
            c22364.m7280(EnumC20043.SOURCE_LEVEL, abstractC12612, enumC10637.m26684(enumC16280.f50071));
        }
        if (z && m51351(enumC10637)) {
            m51344((InterfaceC3109) abstractC12612, enumC10637);
        }
    }
}
