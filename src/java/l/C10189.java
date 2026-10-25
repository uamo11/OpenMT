package l;

/* compiled from: T8NR */
/* renamed from: l.ۤۡۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10189 implements InterfaceC14723 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30613;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f30614;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f30615;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f30616;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f30617;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30618;

    @Override // l.InterfaceC14723
    /* renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10189 m25587(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10189.m25587(java.util.Map):l.ۤۡۧ");
    }

    public C10189(int i, String str, String str2, String str3, boolean z, int i2) {
        C22632.m50631(i2 == -1 || i2 > 0);
        this.f30613 = i;
        this.f30614 = str;
        this.f30617 = str2;
        this.f30615 = str3;
        this.f30616 = z;
        this.f30618 = i2;
    }

    @Override // l.InterfaceC14723
    /* renamed from: ֫ */
    public final void mo1026(C18252 c18252) {
        String str = this.f30617;
        if (str != null) {
            c18252.m42572(str);
        }
        String str2 = this.f30614;
        if (str2 != null) {
            c18252.m42588(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10189.class == obj.getClass()) {
            C10189 c10189 = (C10189) obj;
            if (this.f30613 == c10189.f30613 && C11003.equals(this.f30614, c10189.f30614) && C11003.equals(this.f30617, c10189.f30617) && C11003.equals(this.f30615, c10189.f30615) && this.f30616 == c10189.f30616 && this.f30618 == c10189.f30618) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f30613 + 527) * 31;
        String str = this.f30614;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30617;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30615;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f30616 ? 1 : 0)) * 31) + this.f30618;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f30617 + "\", genre=\"" + this.f30614 + "\", bitrate=" + this.f30613 + ", metadataInterval=" + this.f30618;
    }
}
