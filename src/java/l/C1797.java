package l;

import android.os.Build;
import java.util.UUID;

/* compiled from: P8JS */
/* renamed from: l.֫ۨ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1797 implements InterfaceC19021 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f6195;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f6196;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UUID f6197;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f6195 = z;
            }
        }
        z = false;
        f6195 = z;
    }

    public C1797(UUID uuid, byte[] bArr) {
        this.f6197 = uuid;
        this.f6196 = bArr;
    }
}
