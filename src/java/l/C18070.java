package l;

/* compiled from: J1UA */
/* renamed from: l.ᩳ۬ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18070 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56286;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f56287;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56288;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56289;

    public C18070(String str) {
        int length;
        this.f56287 = str;
        if (str.charAt(0) == '<') {
            this.f56288 = 1;
            int i = 1;
            do {
                int i2 = this.f56288;
                this.f56288 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt == '<') {
                    i++;
                } else if (charAt == '>') {
                    i--;
                }
            } while (i > 0);
        }
        int indexOf = str.indexOf(40, this.f56288);
        if (indexOf >= 0) {
            length = str.indexOf(41, indexOf);
        } else {
            length = str.length();
        }
        this.f56286 = length;
        this.f56289 = indexOf >= 0 ? indexOf + 1 : this.f56288;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42135() {
        return this.f56289 < this.f56286;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m42136() {
        String str;
        int i = this.f56289;
        while (true) {
            int i2 = this.f56289;
            str = this.f56287;
            if (str.charAt(i2) != '[') {
                break;
            }
            this.f56289++;
        }
        int i3 = this.f56289;
        this.f56289 = i3 + 1;
        char charAt = str.charAt(i3);
        if (charAt == '<') {
            m42134();
        } else if (charAt == 'L' || charAt == 'T') {
            while (true) {
                int i4 = this.f56289;
                this.f56289 = i4 + 1;
                char charAt2 = str.charAt(i4);
                if (charAt2 == ';') {
                    break;
                }
                if (charAt2 == '<') {
                    m42134();
                }
            }
        }
        return str.substring(i, this.f56289);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42134() {
        int i = 1;
        do {
            int i2 = this.f56289;
            this.f56289 = i2 + 1;
            char charAt = this.f56287.charAt(i2);
            if (charAt == '<') {
                i++;
            } else if (charAt == '>') {
                i--;
            }
        } while (i > 0);
    }
}
