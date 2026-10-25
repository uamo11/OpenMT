package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: 06TX */
/* renamed from: l.ۗۘᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2994 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9133(InterfaceC20758 interfaceC20758, byte[] bArr) {
        FileChannel open = C12084.open(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.WRITE);
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            while (wrap.hasRemaining()) {
                if (open.write(wrap) <= 0) {
                    throw new IOException("App migration write made no progress");
                }
            }
            open.force(true);
            open.close();
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9132(InterfaceC20758 interfaceC20758) {
        C10050.m25231(interfaceC20758);
        FileChannel open = C12084.open(interfaceC20758, EnumC3824.WRITE, EnumC14406.NOFOLLOW_LINKS);
        try {
            open.force(true);
            open.close();
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
