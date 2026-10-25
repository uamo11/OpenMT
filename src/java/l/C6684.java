package l;

import java.util.Arrays;

/* compiled from: VBIK */
/* renamed from: l.ۜۢܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C6684 extends EnumC8095 {
    public /* synthetic */ C6684() {
        this("FORMAT_45CC", 31);
    }

    public C6684(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m21487;
        int m21504;
        int m21519;
        int m21479;
        int m21491;
        int m215042;
        int m215192;
        m21487 = EnumC8095.m21487(i);
        if (m21487 != 250) {
            throw new UnsupportedOperationException(String.valueOf(m21487));
        }
        m21504 = EnumC8095.m21504(i);
        m21519 = EnumC8095.m21519(i);
        int read = interfaceC16186.read();
        int read2 = interfaceC16186.read();
        m21479 = EnumC8095.m21479(read2);
        m21491 = EnumC8095.m21491(read2);
        m215042 = EnumC8095.m21504(read2);
        m215192 = EnumC8095.m21519(read2);
        int read3 = interfaceC16186.read();
        C9838.m24906(m21487);
        if (m21519 < 1 || m21519 > 5) {
            throw new C0374("bogus registerCount: ".concat(C14712.m35007(m21519)), null);
        }
        return new C15149(this, m21487, read, read3, Arrays.copyOfRange(new int[]{m21479, m21491, m215042, m215192, m21504}, 0, m21519));
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int m21509;
        C15149 c15149 = (C15149) abstractC4193;
        int m12649 = c15149.m12649();
        m21509 = EnumC8095.m21509(c15149.m35853(), c15149.mo2709());
        EnumC8095.m21512(m12649, m21509);
        EnumC8095.m21499(c15149.mo2707(), c15149.mo2708(), c15149.mo12651(), c15149.m35854());
        interfaceC2782.m8592();
    }
}
