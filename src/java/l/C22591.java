package l;

import java.util.Random;

/* compiled from: J9FZ */
/* renamed from: l.᩹᩺ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22591 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20475 f73023;

    public C22591(Random random) {
        byte[] bArr;
        C20475 c20475 = new C20475();
        this.f73023 = c20475;
        c20475.f65998 = new C19498(EnumC3975.WINDOWS_MAJOR_VERSION_6, EnumC18792.WINDOWS_MINOR_VERSION_1, EnumC2564.NTLMSSP_REVISION_W2K3);
        c20475.f65996 = true;
        c20475.f65997 = new byte[32];
        bArr = c20475.f65997;
        random.nextBytes(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20475 m50564() {
        return new C20475(this.f73023);
    }
}
