package l;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: 58TM */
/* renamed from: l.ۧۛ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10805 implements InterfaceC0220 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11634 f32494;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HandlerThread f32495;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23669 f32496;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Looper f32497;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13830 f32498;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HandlerC22922 f32499;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19272 f32500;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HandlerC7400 f32501;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f32502;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7276 f32503;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19021 f32504;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f32505;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f32506;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f32507;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5865 f32508;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6550 f32509;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13625 f32510;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5989 f32511;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f32512;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UUID f32513;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f32514;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f32515;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32516;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f32517;

    public C10805(UUID uuid, InterfaceC7276 interfaceC7276, InterfaceC5989 interfaceC5989, InterfaceC11634 interfaceC11634, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, C17319 c17319, Looper looper, InterfaceC11058 interfaceC11058, C13830 c13830) {
        this.f32513 = uuid;
        this.f32511 = interfaceC5989;
        this.f32494 = interfaceC11634;
        this.f32503 = interfaceC7276;
        this.f32507 = z;
        this.f32505 = z2;
        if (bArr == null) {
            list.getClass();
            this.f32506 = C20195.unmodifiableList(list);
        } else {
            this.f32502 = bArr;
            this.f32506 = null;
        }
        this.f32517 = hashMap;
        this.f32496 = c17319;
        this.f32509 = new C6550();
        this.f32514 = interfaceC11058;
        this.f32498 = c13830;
        this.f32516 = 2;
        this.f32497 = looper;
        this.f32501 = new HandlerC7400(this, looper);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27020(byte[] bArr) {
        m27011();
        return Arrays.equals(this.f32515, bArr);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27021() {
        C13625 mo19524 = this.f32503.mo19524();
        this.f32510 = mo19524;
        HandlerC22922 handlerC22922 = this.f32499;
        String str = C3603.f11424;
        mo19524.getClass();
        handlerC22922.getClass();
        handlerC22922.obtainMessage(1, new C13749(C10957.m27273(), true, SystemClock.elapsedRealtime(), mo19524)).sendToTarget();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27022() {
        if (m27017()) {
            m27009(true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27019(Exception exc, boolean z) {
        m27006(z ? 1 : 3, exc);
    }

    @Override // l.InterfaceC0220
    public final int getState() {
        m27011();
        return this.f32516;
    }

    @Override // l.InterfaceC0220
    /* renamed from: ۧ */
    public final boolean mo1473() {
        m27011();
        return this.f32507;
    }

    @Override // l.InterfaceC0220
    public final C19272 getError() {
        m27011();
        if (this.f32516 == 1) {
            return this.f32500;
        }
        return null;
    }

    @Override // l.InterfaceC0220
    /* renamed from: ֫ */
    public final UUID mo1469() {
        m27011();
        return this.f32513;
    }

    @Override // l.InterfaceC0220
    /* renamed from: ܽ */
    public final InterfaceC19021 mo1474() {
        m27011();
        return this.f32504;
    }

    @Override // l.InterfaceC0220
    /* renamed from: ֫ */
    public final boolean mo1471(String str) {
        m27011();
        byte[] bArr = this.f32515;
        C22632.m50632(bArr);
        return this.f32503.mo19523(str, bArr);
    }

    @Override // l.InterfaceC0220
    /* renamed from: ֫ */
    public final void mo1470(C15036 c15036) {
        long j;
        Set set;
        Handler handler;
        m27011();
        if (this.f32512 < 0) {
            C19956.m46033("Session reference count less than zero: " + this.f32512);
            this.f32512 = 0;
        }
        C6550 c6550 = this.f32509;
        if (c15036 != null) {
            c6550.m18055(c15036);
        }
        int i = this.f32512 + 1;
        this.f32512 = i;
        if (i == 1) {
            C22632.m50634(this.f32516 == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f32495 = handlerThread;
            handlerThread.start();
            this.f32499 = new HandlerC22922(this, this.f32495.getLooper());
            if (m27017()) {
                m27009(true);
            }
        } else if (c15036 != null && m27014() && c6550.m18056(c15036) == 1) {
            c15036.m35562(this.f32516);
        }
        C2338 c2338 = ((C15742) this.f32494).f48569;
        j = c2338.f7511;
        if (j != -9223372036854775807L) {
            set = c2338.f7514;
            set.remove(this);
            handler = c2338.f7503;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // l.InterfaceC0220
    /* renamed from: ۧ */
    public final void mo1472(C15036 c15036) {
        ArrayList arrayList;
        C10805 c10805;
        C10805 c108052;
        C9394 c9394;
        long j;
        Handler handler;
        Set set;
        int i;
        long j2;
        Set set2;
        Handler handler2;
        long j3;
        m27011();
        int i2 = this.f32512;
        if (i2 <= 0) {
            C19956.m46033("release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f32512 = i3;
        if (i3 == 0) {
            this.f32516 = 0;
            String str = C3603.f11424;
            this.f32501.removeCallbacksAndMessages(null);
            this.f32499.m51012();
            this.f32499 = null;
            this.f32495.quit();
            this.f32495 = null;
            this.f32504 = null;
            this.f32500 = null;
            this.f32508 = null;
            this.f32510 = null;
            byte[] bArr = this.f32515;
            if (bArr != null) {
                this.f32503.mo19530(bArr);
                this.f32515 = null;
            }
        }
        if (c15036 != null) {
            C6550 c6550 = this.f32509;
            c6550.m18058(c15036);
            if (c6550.m18056(c15036) == 0) {
                c15036.m35567();
            }
        }
        int i4 = this.f32512;
        C2338 c2338 = ((C15742) this.f32494).f48569;
        if (i4 == 1) {
            i = c2338.f7504;
            if (i > 0) {
                j2 = c2338.f7511;
                if (j2 != -9223372036854775807L) {
                    set2 = c2338.f7514;
                    set2.add(this);
                    handler2 = c2338.f7503;
                    handler2.getClass();
                    Runnable runnable = new Runnable() { // from class: l.ۡۛ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10805.this.mo1472((C15036) null);
                        }
                    };
                    long uptimeMillis = SystemClock.uptimeMillis();
                    j3 = c2338.f7511;
                    handler2.postAtTime(runnable, this, uptimeMillis + j3);
                    c2338.m7619();
                }
            }
        }
        if (i4 == 0) {
            arrayList = c2338.f7520;
            arrayList.remove(this);
            c10805 = c2338.f7512;
            if (c10805 == this) {
                c2338.f7512 = null;
            }
            c108052 = c2338.f7508;
            if (c108052 == this) {
                c2338.f7508 = null;
            }
            c9394 = c2338.f7501;
            c9394.m24225(this);
            j = c2338.f7511;
            if (j != -9223372036854775807L) {
                handler = c2338.f7503;
                handler.getClass();
                handler.removeCallbacksAndMessages(this);
                set = c2338.f7514;
                set.remove(this);
            }
        }
        c2338.m7619();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m27017() {
        /*
            r5 = this;
            l.ۛۤ֫ r0 = r5.f32511
            l.۟ۛ֫ r1 = r5.f32503
            boolean r2 = r5.m27014()
            r3 = 1
            if (r2 == 0) goto Lc
            return r3
        Lc:
            byte[] r2 = r1.mo19528()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r5.f32515 = r2     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            l.ܰ۬֫ r4 = r5.f32498     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r1.mo19521(r2, r4)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            byte[] r2 = r5.f32515     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            l.ᩴ᩸֫ r1 = r1.mo19527(r2)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r5.f32504 = r1     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r1 = 3
            r5.f32516 = r1     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            l.ۜۚ֫ r2 = r5.f32509     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            java.util.Set r2 = r2.m18057()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
        L2c:
            boolean r4 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            l.ܶۛ֫ r4 = (l.C15036) r4     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r4.m35562(r1)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            goto L2c
        L3c:
            byte[] r1 = r5.f32515     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            r1.getClass()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L55
            return r3
        L42:
            r1 = move-exception
            goto L45
        L44:
            r1 = move-exception
        L45:
            boolean r2 = l.C12920.m31426(r1)
            if (r2 == 0) goto L51
            l.ۢۛ֫ r0 = (l.C9394) r0
            r0.m24226(r5)
            goto L5a
        L51:
            r5.m27006(r3, r1)
            goto L5a
        L55:
            l.ۢۛ֫ r0 = (l.C9394) r0
            r0.m24226(r5)
        L5a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10805.m27017():boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27013(C10805 c10805, Object obj, Object obj2) {
        InterfaceC5989 interfaceC5989 = c10805.f32511;
        if (obj == c10805.f32510) {
            if (c10805.f32516 == 2 || c10805.m27014()) {
                c10805.f32510 = null;
                if (obj2 instanceof Exception) {
                    ((C9394) interfaceC5989).m24224((Exception) obj2, false);
                    return;
                }
                try {
                    c10805.f32503.mo19525((byte[]) obj2);
                    ((C9394) interfaceC5989).m24223();
                } catch (Exception e) {
                    ((C9394) interfaceC5989).m24224(e, true);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:31|(2:32|33)|(6:35|36|37|38|(1:40)|42)|45|36|37|38|(0)|42) */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071 A[Catch: NumberFormatException -> 0x0075, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0075, blocks: (B:38:0x0069, B:40:0x0071), top: B:37:0x0069 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m27009(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.f32505
            if (r0 == 0) goto L6
            goto Lda
        L6:
            byte[] r0 = r9.f32515
            java.lang.String r1 = l.C3603.f11424
            byte[] r1 = r9.f32502
            r2 = 1
            if (r1 != 0) goto L13
            r9.m27010(r0, r2, r10)
            return
        L13:
            int r1 = r9.f32516
            l.۟ۛ֫ r3 = r9.f32503
            r4 = 4
            if (r1 == r4) goto L2b
            byte[] r1 = r9.f32515     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.Exception -> L24
            byte[] r5 = r9.f32502     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.Exception -> L24
            r3.mo19522(r1, r5)     // Catch: java.lang.NoSuchMethodError -> L22 java.lang.Exception -> L24
            goto L29
        L22:
            r1 = move-exception
            goto L25
        L24:
            r1 = move-exception
        L25:
            r9.m27006(r2, r1)
            r2 = 0
        L29:
            if (r2 == 0) goto Lda
        L2b:
            java.util.UUID r1 = l.C23875.f77203
            java.util.UUID r2 = r9.f32513
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3b
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L93
        L3b:
            r9.m27011()
            byte[] r1 = r9.f32515
            r2 = 0
            if (r1 != 0) goto L45
            r1 = r2
            goto L49
        L45:
            java.util.Map r1 = r3.mo19517(r1)
        L49:
            if (r1 != 0) goto L4c
            goto L7c
        L4c:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "LicenseDurationRemaining"
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L62
            if (r3 == 0) goto L62
            long r7 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L62
            goto L63
        L62:
            r7 = r5
        L63:
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.NumberFormatException -> L75
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L75
            if (r1 == 0) goto L75
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L75
        L75:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.<init>(r3, r1)
        L7c:
            r2.getClass()
            java.lang.Object r1 = r2.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r5, r1)
        L93:
            r5 = 60
            r3 = 2
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto Laf
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Offline license has expired or will expire soon. Remaining seconds: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            l.C19956.m46031(r1)
            r9.m27010(r0, r3, r10)
            return
        Laf:
            r5 = 0
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 > 0) goto Lbe
            l.ܳۨ֫ r10 = new l.ܳۨ֫
            r10.<init>()
            r9.m27006(r3, r10)
            return
        Lbe:
            r9.f32516 = r4
            l.ۜۚ֫ r10 = r9.f32509
            java.util.Set r10 = r10.m18057()
            java.util.Iterator r10 = r10.iterator()
        Lca:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lda
            java.lang.Object r0 = r10.next()
            l.ܶۛ֫ r0 = (l.C15036) r0
            r0.m35566()
            goto Lca
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10805.m27009(boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27010(byte[] bArr, int i, boolean z) {
        try {
            C5865 mo19518 = this.f32503.mo19518(bArr, this.f32506, i, this.f32517);
            this.f32508 = mo19518;
            HandlerC22922 handlerC22922 = this.f32499;
            String str = C3603.f11424;
            mo19518.getClass();
            handlerC22922.getClass();
            handlerC22922.obtainMessage(2, new C13749(C10957.m27273(), z, SystemClock.elapsedRealtime(), mo19518)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m27007(e, true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27008(C10805 c10805, Object obj, Object obj2) {
        C6550 c6550 = c10805.f32509;
        InterfaceC7276 interfaceC7276 = c10805.f32503;
        if (obj == c10805.f32508 && c10805.m27014()) {
            c10805.f32508 = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c10805.m27007((Throwable) obj2, false);
                return;
            }
            try {
                byte[] mo19526 = interfaceC7276.mo19526(c10805.f32515, (byte[]) obj2);
                if (c10805.f32502 != null && mo19526 != null && mo19526.length != 0) {
                    c10805.f32502 = mo19526;
                }
                c10805.f32516 = 4;
                Iterator it = c6550.m18057().iterator();
                while (it.hasNext()) {
                    ((C15036) it.next()).m35561();
                }
            } catch (Exception | NoSuchMethodError e) {
                c10805.m27007(e, true);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27018(int i) {
        if (i == 2 && this.f32516 == 4) {
            String str = C3603.f11424;
            m27009(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27007(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C12920.m31426(th)) {
            ((C9394) this.f32511).m24226(this);
        } else {
            m27006(z ? 1 : 2, th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27006(int i, Throwable th) {
        int i2;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = C3603.m11053(C3603.m11008(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (Build.VERSION.SDK_INT < 23 || !C3043.m9296(th)) {
                if (!(th instanceof NotProvisionedException) && !C12920.m31426(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof C20848) {
                        i2 = 6001;
                    } else if (th instanceof C14331) {
                        i2 = 6003;
                    } else if (th instanceof C14496) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.f32500 = new C19272(i2, th);
        C19956.m46034("DRM session error", th);
        if (!(th instanceof Exception)) {
            if (th instanceof Error) {
                if (!C12920.m31428(th) && !C12920.m31426(th)) {
                    throw ((Error) th);
                }
            } else {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
        } else {
            Iterator it = this.f32509.m18057().iterator();
            while (it.hasNext()) {
                ((C15036) it.next()).m35564((Exception) th);
            }
        }
        if (this.f32516 != 4) {
            this.f32516 = 1;
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m27014() {
        int i = this.f32516;
        return i == 3 || i == 4;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m27011() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f32497;
        if (currentThread != looper.getThread()) {
            C19956.m46036("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
