package l;

/* compiled from: 38C6 */
/* renamed from: l.ܶ᩺ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15538 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f47886;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Integer f47887;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m36639() {
        String str = this.f47886;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36637() {
        return this.f47886;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36634(String str) {
        this.f47886 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36633(Integer num) {
        this.f47887 = num;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36640() {
        return this.f47887 != null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m36638() {
        Integer num = this.f47887;
        C11003.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36635(byte[] bArr) {
        C12951 c12951 = new C12951(bArr);
        byte readByte = c12951.readByte();
        if ((readByte & 1) != 0) {
            this.f47886 = c12951.m31506();
        } else {
            this.f47886 = null;
        }
        if ((readByte & 2) != 0) {
            this.f47887 = Integer.valueOf(c12951.m31494() & 4095);
        } else {
            this.f47887 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m36636() {
        C10130 c10130 = new C10130();
        boolean m36639 = m36639();
        int i = m36639;
        if (m36640()) {
            i = (m36639 ? 1 : 0) | 2;
        }
        c10130.writeByte(i);
        if (m36639()) {
            c10130.m25439(this.f47886);
        }
        if (m36640()) {
            c10130.mo13231(m36638() & 4095);
        }
        return c10130.m25444();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MTUnixExtraData{link='");
        sb.append(this.f47886);
        sb.append("', permissions=");
        Integer num = this.f47887;
        sb.append(num == null ? null : Integer.toOctalString(num.intValue()));
        sb.append('}');
        return sb.toString();
    }
}
