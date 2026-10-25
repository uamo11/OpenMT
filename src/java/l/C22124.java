package l;

import java.io.IOException;

/* compiled from: 861N */
/* renamed from: l.᩹ۜܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C22124 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49722(InterfaceC20008 interfaceC20008, int i) {
        int readInt = interfaceC20008.readInt();
        if (readInt != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(readInt)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49721(C12951 c12951, int i) {
        int m31494 = c12951.m31494();
        if (m31494 != i) {
            throw new IOException(String.format("Expected: 0x%04x, got: 0x%04x", Integer.valueOf(i), Integer.valueOf(m31494)));
        }
    }
}
