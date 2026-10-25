package l;

import android.os.AsyncTask;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* compiled from: P70J */
/* renamed from: l.۫᩺ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12723 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Executor f38276 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Executor m31003() {
        return f38276;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6101 m31004(final C23034 c23034, final C8218 c8218, final boolean z, C18177 c18177, final boolean z2, final boolean z3, final boolean z4, Executor executor) {
        C11003.requireNonNull(c8218, "target");
        C11003.requireNonNull(executor, "executor");
        if (z && !z2) {
            throw new IllegalArgumentException("Direct source does not need a lightweight checkpoint");
        }
        if (z3 && (z || z2 || c18177.m42394() || c18177.length() != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid partial hex checkpoint");
        }
        final C6101 m51194 = c23034.m51194();
        try {
            try {
                if (z2) {
                    C8841 m42398 = c18177.m42398();
                    try {
                        m51194.m17014(m42398);
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            m42398.close();
                            throw e;
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                            throw e;
                        }
                    }
                } else {
                    m51194.m17012(c18177.m42387().m47650());
                }
                executor.execute(new Runnable() { // from class: l.۠᩺ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12723.m31012(C23034.this, c8218, z, z2, z3, m51194, z4);
                    }
                });
                return m51194;
            } catch (IOException e3) {
                e = e3;
                m51194.m17013(e);
                throw e;
            }
        } catch (Error e4) {
            e = e4;
            m51194.m17013(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            m51194.m17013(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31009(C23034 c23034, C8218 c8218, long j) {
        C11003.requireNonNull(c23034);
        C11003.requireNonNull(c8218);
        C6101 m51194 = c23034.m51194();
        try {
            m51194.m17012(j);
            m31012(c23034, c8218, false, false, false, m51194, false);
            if (m51194.m17011(C16360.m38504(null)) != EnumC10335.COMMITTED) {
                throw m51194.m17010();
            }
        } catch (IOException | Error | RuntimeException e) {
            m51194.m17013(e);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31012(C23034 c23034, C8218 c8218, boolean z, boolean z2, boolean z3, C6101 c6101, boolean z4) {
        C1785 c1785;
        try {
            C1785 m21773 = c8218.m21773();
            if (z) {
                c1785 = m21773;
            } else {
                C15587 m51201 = c23034.m51201();
                if (m51201.mo23119() && !m51201.m36533()) {
                    C1785 c17852 = new C1785(m51201.mo23127(), m51201.mo23117());
                    if (c17852.m5940() > 2147483647L) {
                        throw new IOException("Hex checkpoint base is too large");
                    }
                    c1785 = c17852;
                } else {
                    throw new IOException("Hex checkpoint base is unavailable");
                }
            }
            C4962 c4962 = new C4962(c6101.m17020(), c6101);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(c4962);
                try {
                    if (z2) {
                        C8841 m17017 = c6101.m17017();
                        try {
                            m31007(c4962, dataOutputStream, c8218, z, m21773, c1785, true, z3, m17017);
                            m17017.close();
                        } finally {
                        }
                    } else {
                        m31007(c4962, dataOutputStream, c8218, z, m21773, c1785, false, z3, null);
                    }
                    dataOutputStream.close();
                    c4962.close();
                    c6101.m17015(z4);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            c6101.m17013(th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31007(C4962 c4962, DataOutputStream dataOutputStream, C8218 c8218, boolean z, C1785 c1785, C1785 c17852, boolean z2, boolean z3, C8841 c8841) {
        dataOutputStream.writeInt(1297369176);
        dataOutputStream.writeInt(7);
        String m21768 = c8218.m21768();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = m21768.getBytes(charset);
        if (bytes.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        byte[] bytes2 = c8218.m21771().getBytes(charset);
        if (bytes2.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes2.length);
        dataOutputStream.write(bytes2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeLong(c1785.m5940());
        dataOutputStream.writeLong(c1785.m5938());
        dataOutputStream.writeLong(c17852.m5940());
        dataOutputStream.writeLong(c17852.m5938());
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.writeBoolean(z3);
        if (z2) {
            c8841.getClass();
            c8841.m22844(dataOutputStream);
        }
        dataOutputStream.writeInt(1481135181);
        dataOutputStream.flush();
        long m14400 = c4962.m14400();
        c4962.m14401();
        dataOutputStream.writeLong(m14400);
        dataOutputStream.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0152 A[Catch: all -> 0x01bd, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x01bd, blocks: (B:119:0x0152, B:141:0x0134), top: B:140:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0116 A[Catch: all -> 0x01c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:7:0x001c, B:10:0x002d, B:15:0x0040, B:22:0x0093, B:26:0x00ab, B:29:0x00bb, B:37:0x00d2, B:133:0x0116, B:138:0x012b, B:143:0x00de, B:146:0x00a0), top: B:6:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00de A[Catch: all -> 0x01c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:7:0x001c, B:10:0x002d, B:15:0x0040, B:22:0x0093, B:26:0x00ab, B:29:0x00bb, B:37:0x00d2, B:133:0x0116, B:138:0x012b, B:143:0x00de, B:146:0x00a0), top: B:6:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0087, blocks: (B:151:0x007f, B:33:0x00c6, B:39:0x00d9, B:42:0x00e6, B:135:0x0120), top: B:150:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0087, blocks: (B:151:0x007f, B:33:0x00c6, B:39:0x00d9, B:42:0x00e6, B:135:0x0120), top: B:150:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141 A[Catch: all -> 0x0114, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x0114, blocks: (B:44:0x00fb, B:46:0x0141), top: B:43:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13428 m31005(l.C23034 r16, l.AbstractC15440 r17, l.C16250 r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12723.m31005(l.᩺ܰܿ, l.ܶ᩵ܿ, l.ܺ᩺ܿ):l.۬᩺ܿ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31002(DataInput dataInput) {
        C22601 c22601 = (C22601) dataInput;
        int readInt = c22601.readInt();
        m31006("Invalid hex checkpoint path length", readInt >= 0 && readInt <= 1048576);
        byte[] bArr = new byte[readInt];
        c22601.readFully(bArr, 0, readInt);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31006(String str, boolean z) {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31011(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }
}
