package l;

import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: N1X5 */
/* renamed from: l.ۙۡᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4549 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Boolean f14514;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC8077 f14515;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f14516;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC18866 f14517;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f14518 = Integer.MIN_VALUE;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f14519 = Integer.MIN_VALUE;

    public C4549() {
        if (f14514 == null) {
            if (!C4925.m14335().bindService(new Intent(C4925.m14335(), (Class<?>) ServiceC22393.class), new ServiceConnectionC21483(), 1)) {
                f14514 = Boolean.FALSE;
            }
        }
        Application m14335 = C4925.m14335();
        Intent intent = new Intent(m14335, (Class<?>) ServiceC16042.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ServiceConnectionC22188 serviceConnectionC22188 = new ServiceConnectionC22188(this);
        if (m14335.bindService(intent, serviceConnectionC22188, 1)) {
            this.f14515 = new RunnableC8077(this, atomicBoolean, m14335, serviceConnectionC22188);
        } else {
            this.f14515 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13371(C4549 c4549, AtomicBoolean atomicBoolean, Application application, ServiceConnection serviceConnection) {
        if (atomicBoolean.compareAndSet(false, true)) {
            c4549.f14517 = null;
            try {
                application.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r7 == Integer.MIN_VALUE) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        l.C1080.m3666(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7 != Integer.MIN_VALUE) goto L19;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13377(java.lang.String r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            l.ᩴܺᩳ r0 = r5.f14517
            if (r0 == 0) goto L8
            java.lang.Boolean r0 = l.C4549.f14514
            if (r0 != 0) goto L18
        L8:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 2000(0x7d0, double:9.88E-321)
            long r0 = r0 + r2
        Lf:
            l.ᩴܺᩳ r2 = r5.f14517
            if (r2 == 0) goto L62
            java.lang.Boolean r2 = l.C4549.f14514
            if (r2 != 0) goto L18
            goto L62
        L18:
            java.lang.String r0 = "/"
            boolean r0 = r6.endsWith(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L26
            java.lang.String r6 = l.C15472.m36561(r1, r2, r6)
        L26:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.f14518 = r0
            r5.f14516 = r2
            l.ᩴܺᩳ r2 = r5.f14517
            java.lang.Boolean r3 = l.C4549.f14514
            boolean r3 = r3.booleanValue()
            boolean r6 = r2.mo8299(r6, r7, r3, r8)
            int r7 = r5.f14519
            l.ᩴܺᩳ r8 = r5.f14517
            if (r8 != 0) goto L45
            if (r7 != r0) goto L41
            goto L5c
        L41:
            l.C1080.m3666(r7)
            goto L5c
        L45:
            l.ᩴܺᩳ r8 = r5.f14517     // Catch: java.lang.Exception -> L59
            int r8 = r8.mo8298()     // Catch: java.lang.Exception -> L59
            r5.f14518 = r8     // Catch: java.lang.Exception -> L59
            int r8 = r5.f14518     // Catch: java.lang.Exception -> L59
            r5.f14519 = r8     // Catch: java.lang.Exception -> L59
            r5.f14516 = r1     // Catch: java.lang.Exception -> L59
            int r8 = r5.f14518     // Catch: java.lang.Exception -> L59
            l.C1080.m3666(r8)     // Catch: java.lang.Exception -> L59
            goto L5c
        L59:
            if (r7 != r0) goto L41
        L5c:
            if (r6 != 0) goto L61
            r5.m13374()
        L61:
            return
        L62:
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L6b
            goto Lf
        L6b:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "Connection timeout"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4549.m13377(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13376() {
        if (this.f14517 != null) {
            try {
                this.f14517.exit();
            } catch (Throwable unused) {
            }
        }
        this.f14517 = null;
        RunnableC8077 runnableC8077 = this.f14515;
        if (runnableC8077 == null) {
            return;
        }
        try {
            runnableC8077.run();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m13381(byte[] bArr) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String mo8311 = this.f14517.mo8311(bArr);
        if (mo8311 == null) {
            m13374();
        }
        return mo8311;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13375(byte[] bArr) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String mo8306 = this.f14517.mo8306(bArr);
        if (mo8306 == null) {
            m13374();
        }
        return Integer.parseInt(mo8306);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m13378(String str, String str2) {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] m25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        byte[] mo8304 = this.f14517.mo8304(m25444);
        if (mo8304 == null) {
            m13374();
        }
        return mo8304;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short[] m13386(String str, String str2) {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] m25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8310 = this.f14517.mo8310(m25444);
        if (mo8310 == null) {
            m13374();
            return null;
        }
        int length = mo8310.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = (short) mo8310[i];
        }
        return sArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] m13382(String str, String str2) {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] m25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8308 = this.f14517.mo8308(m25444);
        if (mo8308 == null) {
            m13374();
            return null;
        }
        int length = mo8308.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) mo8308[i];
        }
        return cArr;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m13384(String str, String str2) {
        C10130 c10130 = new C10130();
        c10130.m25423((CharSequence) str);
        c10130.m25423((CharSequence) str2);
        c10130.writeByte(0);
        byte[] m25444 = c10130.m25444();
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8301 = this.f14517.mo8301(m25444);
        if (mo8301 != null) {
            return mo8301;
        }
        m13374();
        return null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m13388(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int mo8303 = this.f14517.mo8303(str, str2);
        if (mo8303 == -1) {
            m13374();
        }
        return mo8303;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m13380(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        String mo8305 = this.f14517.mo8305(str, str2);
        if (mo8305 == null) {
            m13374();
        }
        return mo8305;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m13387(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8300 = this.f14517.mo8300(str, str2);
        if (mo8300 == null) {
            m13374();
        }
        return mo8300;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m13383(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8312 = this.f14517.mo8312(str, str2);
        if (mo8312 == null) {
            m13374();
        }
        return mo8312;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] m13379(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        int[] mo8307 = this.f14517.mo8307(str, str2);
        if (mo8307 == null) {
            m13374();
        }
        return mo8307;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m13385(String str, String str2) {
        if (this.f14517 == null) {
            throw new RuntimeException("Disconnected");
        }
        this.f14517.mo8309(str, str2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13374() {
        if (this.f14517 == null) {
            throw new C3138("Disconnected after load failure");
        }
        try {
            String[] mo8302 = this.f14517.mo8302();
            if (mo8302 != null) {
                String str = mo8302[0];
                int i = !this.f14516 ? Integer.MIN_VALUE : this.f14518;
                if (i != Integer.MIN_VALUE && i <= -1000) {
                    str = C4925.m14327(R.string.MT_Protector_res_0x7f120280);
                } else if (str != null && str.startsWith("Seccomp fatal:")) {
                    str = C4925.m14327(R.string.MT_Protector_res_0x7f120280);
                }
                throw new C20072(str, mo8302);
            }
        } catch (RemoteException unused) {
            throw new C3138("Disconnected after load failure");
        }
    }
}
