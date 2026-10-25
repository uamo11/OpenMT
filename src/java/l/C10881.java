package l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: B32G */
/* renamed from: l.ۧ۠᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10881 implements InterfaceC2452 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ExecutorService f32718;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char m27176(int i) {
        int i2 = i & 61440;
        if (i2 == 4096) {
            return 'p';
        }
        if (i2 == 8192) {
            return 'c';
        }
        if (i2 == 16384) {
            return 'd';
        }
        if (i2 == 24576) {
            return 'b';
        }
        if (i2 == 32768) {
            return '-';
        }
        if (i2 != 40960) {
            return i2 != 49152 ? '?' : 's';
        }
        return 'l';
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean[] m27181(int i) {
        return new boolean[]{(i & 256) != 0, (i & 128) != 0, (i & 64) != 0, (i & 32) != 0, (i & 16) != 0, (i & 8) != 0, (i & 4) != 0, (i & 2) != 0, (i & 1) != 0, (i & 2048) != 0, (i & 1024) != 0, (i & 512) != 0};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized Executor m27178() {
        ExecutorService executorService;
        synchronized (C10881.class) {
            if (f32718 == null) {
                String str = C3603.f11424;
                f32718 = Executors.newSingleThreadExecutor(new ThreadFactoryC15596("ExoPlayer:BackgroundExecutor"));
            }
            executorService = f32718;
        }
        return executorService;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27179(Throwable th, Throwable th2) {
        C11233.m27805(th, "<this>");
        C11233.m27805(th2, "exception");
        if (th != th2) {
            C10569.f31719.mo29285(th, th2);
        }
    }

    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        int m29168 = ((C11955) c16040.m37919()).m29168();
        byte[] bArr = (byte[]) ((C11955) c16040.m37919()).m29175();
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ m29168);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m27180(int i) {
        StringBuilder sb = new StringBuilder(9);
        sb.append((i & 256) != 0 ? 'r' : '-');
        sb.append((i & 128) != 0 ? 'w' : '-');
        if ((i & 2048) != 0) {
            sb.append((i & 64) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 64) != 0 ? 'x' : '-');
        }
        sb.append((i & 32) != 0 ? 'r' : '-');
        sb.append((i & 16) != 0 ? 'w' : '-');
        if ((i & 1024) != 0) {
            sb.append((i & 8) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 8) != 0 ? 'x' : '-');
        }
        sb.append((i & 4) == 0 ? '-' : 'r');
        sb.append((i & 2) == 0 ? '-' : 'w');
        if ((i & 512) != 0) {
            sb.append((i & 1) != 0 ? 't' : 'T');
        } else {
            sb.append((i & 1) != 0 ? 'x' : '-');
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r2 != '-') goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m27177(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10881.m27177(java.lang.String):int");
    }
}
