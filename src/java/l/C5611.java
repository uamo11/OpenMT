package l;

/* compiled from: A9TM */
/* renamed from: l.ۚ᩷᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5611 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15916(InterfaceC1377 interfaceC1377, byte[] bArr) {
        int length = bArr.length;
        int read = interfaceC1377.read(bArr, 0, length);
        if (read == -1) {
            return -1;
        }
        int i = length - read;
        while (true) {
            if (i > 0) {
                int read2 = interfaceC1377.read(bArr, read, i);
                if (read2 == -1) {
                    break;
                }
                read += read2;
                i -= read2;
            } else if (read != bArr.length) {
                throw new AssertionError();
            }
        }
        return read;
    }
}
