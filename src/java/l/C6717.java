package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: P9GY */
/* renamed from: l.ۜۧۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6717 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0386 f20840;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C20829 f20841;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C0530 f20842;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f20843;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumSet f20844;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f20845;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID f20846;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC5326 f20849;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f20850 = new byte[0];

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20847 = 1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f20848 = false;

    public C6717(UUID uuid, String str, int i, C4332 c4332) {
        this.f20846 = uuid;
        this.f20844 = EnumSet.copyOf((Collection) c4332.m13022());
        this.f20842 = new C0530(str, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18279(C0366 c0366) {
        C22964 m1816 = c0366.m1816();
        this.f20842 = c0366.m1815();
        this.f20841 = new C20829(m1816.m51105(), m1816.m51100(), m1816.m51101(), m1816.m51102(), this.f20842.m2249().contains(EnumC5866.SMB2_GLOBAL_CAP_LARGE_MTU));
        this.f20840 = c0366.m1813();
        this.f20845 = c0366.m1814();
        this.f20849 = c0366.m1818();
        this.f20843 = c0366.m1817() != null ? c0366.m1817() : new byte[0];
        System.currentTimeMillis();
        m1816.m51104().m51133();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID m18289() {
        return this.f20846;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m18283() {
        return (this.f20842.m2253() & 2) > 0;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20829 m18285() {
        return this.f20841;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m18288() {
        byte[] bArr = this.f20850;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumSet m18287() {
        return this.f20844;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC0386 m18284() {
        return this.f20840;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m18282() {
        if (this.f20841.m47645() == EnumC22094.SMB_3_1_1) {
            return this.f20840 != null;
        }
        EnumC5866 enumC5866 = EnumC5866.SMB2_GLOBAL_CAP_ENCRYPTION;
        return this.f20844.contains(enumC5866) && this.f20842.m2249().contains(enumC5866);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18280() {
        return this.f20848 && this.f20841.m47645().m49681() && m18282();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m18286() {
        return this.f20842.m2249().contains(EnumC5866.SMB2_GLOBAL_CAP_LARGE_MTU);
    }

    public final String toString() {
        return "ConnectionContext{\n  serverGuid=" + this.f20842.m2255() + ",\n  serverName='" + this.f20842.m2254() + "',\n  negotiatedProtocol=" + this.f20841 + ",\n  clientGuid=" + this.f20846 + ",\n  clientCapabilities=" + this.f20844 + ",\n  serverCapabilities=" + this.f20842.m2249() + ",\n  clientSecurityMode=" + this.f20847 + ",\n  serverSecurityMode=" + this.f20842.m2253() + ",\n  server='" + this.f20842 + "'\n}";
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0530 m18290() {
        return this.f20842;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC5326 m18291() {
        return this.f20849;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m18281() {
        return this.f20843;
    }
}
