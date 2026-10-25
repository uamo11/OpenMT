package l;

/* compiled from: O5NZ */
/* renamed from: l.᩻᩸ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23965 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Byte[] f77722;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f77723;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52793(C23965 c23965, byte[] bArr) {
        c23965.getClass();
        int length = bArr.length;
        Byte[] bArr2 = c23965.f77722;
        if (length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                Byte b = bArr2[i];
                if (b == null || b.byteValue() == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public C23965(String str, String str2) {
        this.f77723 = str;
        String[] split = str2.split(" ");
        this.f77722 = new Byte[split.length];
        for (int i = 0; i < split.length; i++) {
            String str3 = split[i];
            if (str3.length() != 2) {
                throw new RuntimeException(str2);
            }
            if (!str3.equals("??")) {
                this.f77722[i] = Byte.valueOf((byte) Integer.parseInt(str3, 16));
            }
        }
    }
}
