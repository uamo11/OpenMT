package l;

import java.io.IOException;

/* compiled from: R1TU */
/* renamed from: l.ۨ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11929 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29107(C12951 c12951, InterfaceC6284 interfaceC6284) {
        C22124.m49722((InterfaceC20008) c12951, 67263238);
        if (c12951.available() < 13) {
            throw new IOException("Bad mapping file");
        }
        c12951.skipBytes((int) (c12951.available() - 8));
        int readInt = c12951.readInt();
        C22124.m49722((InterfaceC20008) c12951, 67263238);
        c12951.seek(readInt);
        int readInt2 = c12951.readInt();
        C11905 c11905 = new C11905(readInt2);
        for (int i = 0; i < readInt2; i++) {
            c11905.m29033(i, c12951.m31504());
        }
        c12951.seek(4L);
        while (true) {
            int readByte = c12951.readByte() & 255;
            if (readByte == 0) {
                return;
            }
            if (readByte == 1) {
                interfaceC6284.mo7563((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            } else if (readByte == 2) {
                interfaceC6284.mo7565((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            } else if (readByte == 3) {
                interfaceC6284.mo7564((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            }
        }
    }
}
