package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.k;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: I7BH */
/* renamed from: l.ۧ֡ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10645 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f32028 = new AtomicLong(1);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f32029 = new ConcurrentMapC10942();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f32027 = Pattern.compile("(.*) \\((\\d+)\\)");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C10645 f32026 = new C10645();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C20376 f32025 = new C20376();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10645 m26705() {
        return f32026;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x00eb, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x001a, B:13:0x0026, B:15:0x002c, B:18:0x0038, B:20:0x0048, B:21:0x004e, B:23:0x0050, B:26:0x005a, B:29:0x0063, B:31:0x0076, B:33:0x007d, B:34:0x009e, B:35:0x00dc, B:36:0x00df, B:38:0x008b, B:40:0x00a4, B:41:0x00b9, B:43:0x00bf, B:46:0x00cb, B:51:0x00cf, B:52:0x00d3, B:54:0x00e1, B:55:0x00e4, B:57:0x00e6, B:58:0x00e9), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26735(java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            l.ۧۤᩴ r0 = r4.f32029
            java.lang.Object r5 = r0.get(r5)
            l.֫֡ۢ r5 = (l.C1472) r5
            if (r5 != 0) goto Lb
            return
        Lb:
            r0 = r5
            monitor-enter(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Leb
            m26708(r5, r1)     // Catch: java.lang.Throwable -> Leb
            boolean r1 = l.C1472.m5045(r5)     // Catch: java.lang.Throwable -> Leb
            if (r1 != 0) goto Le6
            java.util.LinkedHashSet r1 = l.C1472.m5038(r5)     // Catch: java.lang.Throwable -> Leb
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto L26
            goto Le6
        L26:
            l.᩺᩵ۢ r1 = l.C1472.m5099(r5)     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto Le1
            java.lang.String r2 = l.C23197.m51471(r1)     // Catch: java.lang.Throwable -> Leb
            boolean r2 = android.text.TextUtils.equals(r2, r6)     // Catch: java.lang.Throwable -> Leb
            if (r2 != 0) goto L38
            goto Le1
        L38:
            java.util.LinkedHashMap r2 = l.C1472.m5092(r5)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r3 = l.C23197.m51467(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Leb
            l.۟᩵ۢ r2 = (l.C7675) r2     // Catch: java.lang.Throwable -> Leb
            if (r2 != 0) goto L50
            m26717(r5)     // Catch: java.lang.Throwable -> Leb
            m26716(r5)     // Catch: java.lang.Throwable -> Leb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Leb
            return
        L50:
            java.lang.String r3 = "replace"
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L62
            if (r9 == 0) goto L62
            boolean r9 = l.C23197.m51468(r1)     // Catch: java.lang.Throwable -> Leb
            if (r9 == 0) goto L62
            r9 = 1
            goto L63
        L62:
            r9 = 0
        L63:
            java.util.LinkedHashSet r3 = l.C1472.m5038(r5)     // Catch: java.lang.Throwable -> Leb
            r3.add(r6)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5081(r5, r7)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5078(r5, r9)     // Catch: java.lang.Throwable -> Leb
            boolean r6 = l.C23197.m51472(r1)     // Catch: java.lang.Throwable -> Leb
            if (r6 == 0) goto La2
            java.lang.String r6 = "pending"
            l.C7675.m20552(r2, r6)     // Catch: java.lang.Throwable -> Leb
            if (r8 == 0) goto L8b
            l.C1472.m5054(r5)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5086(r5, r7)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5061(r5, r9)     // Catch: java.lang.Throwable -> Leb
            r6 = 0
            l.C1472.m5030(r5, r6)     // Catch: java.lang.Throwable -> Leb
            goto L9e
        L8b:
            l.ۨ᩵ۢ r6 = new l.ۨ᩵ۢ     // Catch: java.lang.Throwable -> Leb
            l.C23197.m51471(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r8 = l.C23197.m51467(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = l.C23197.m51471(r1)     // Catch: java.lang.Throwable -> Leb
            r6.<init>(r8, r1, r7, r9)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5030(r5, r6)     // Catch: java.lang.Throwable -> Leb
        L9e:
            m26717(r5)     // Catch: java.lang.Throwable -> Leb
            goto Ldc
        La2:
            if (r8 == 0) goto Ld3
            l.C1472.m5054(r5)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5086(r5, r7)     // Catch: java.lang.Throwable -> Leb
            l.C1472.m5061(r5, r9)     // Catch: java.lang.Throwable -> Leb
            java.util.LinkedHashMap r6 = l.C1472.m5092(r5)     // Catch: java.lang.Throwable -> Leb
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Leb
        Lb9:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r8 == 0) goto Lcf
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> Leb
            l.۟᩵ۢ r8 = (l.C7675) r8     // Catch: java.lang.Throwable -> Leb
            boolean r1 = l.C7675.m20556(r8)     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto Lb9
            m26711(r5, r8, r7, r9)     // Catch: java.lang.Throwable -> Leb
            goto Lb9
        Lcf:
            m26717(r5)     // Catch: java.lang.Throwable -> Leb
            goto Ldc
        Ld3:
            m26711(r5, r2, r7, r9)     // Catch: java.lang.Throwable -> Leb
            m26717(r5)     // Catch: java.lang.Throwable -> Leb
            m26728(r5)     // Catch: java.lang.Throwable -> Leb
        Ldc:
            m26716(r5)     // Catch: java.lang.Throwable -> Leb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Leb
            return
        Le1:
            m26716(r5)     // Catch: java.lang.Throwable -> Leb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Leb
            return
        Le6:
            m26716(r5)     // Catch: java.lang.Throwable -> Leb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Leb
            return
        Leb:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Leb
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10645.m26735(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r2 != false) goto L15;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m26738(java.lang.String r7) {
        /*
            r6 = this;
            l.ۧۤᩴ r0 = r6.f32029
            java.lang.Object r7 = r0.get(r7)
            l.֫֡ۢ r7 = (l.C1472) r7
            r1 = 0
            if (r7 != 0) goto Lc
            return r1
        Lc:
            r0 = r7
            monitor-enter(r0)
            boolean r2 = l.C1472.m5045(r7)     // Catch: java.lang.Throwable -> L3c
            r3 = 1
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r3
        L17:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L3c
            m26708(r7, r4)     // Catch: java.lang.Throwable -> L3c
            l.C1472.m5051(r7)     // Catch: java.lang.Throwable -> L3c
            m26717(r7)     // Catch: java.lang.Throwable -> L3c
            boolean r2 = l.C1472.m5097(r7)     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L30
            boolean r2 = l.C1472.m5069(r7)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L31
        L30:
            r1 = 1
        L31:
            if (r1 != 0) goto L37
            m26720(r7)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L37:
            m26716(r7)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r3
        L3c:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10645.m26738(java.lang.String):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26737(String str) {
        boolean z;
        boolean z2;
        C23197 c23197;
        LinkedHashMap linkedHashMap;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        LinkedHashMap m26715;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str2;
        String str3;
        int i;
        boolean z14;
        LinkedHashSet linkedHashSet;
        String str4;
        LinkedHashMap m267152;
        boolean z15;
        boolean z16;
        boolean z17;
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            z = c1472.f5239;
            if (!z) {
                z2 = c1472.f5264;
                if (!z2) {
                    c23197 = c1472.f5270;
                    if (c23197 == null) {
                        linkedHashMap = c1472.f5265;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            z17 = ((C7675) it.next()).f23715;
                            if (z17) {
                            }
                        }
                        c1472.f5268 = true;
                        m26723(c1472);
                        ArrayList m26727 = m26727(c1472);
                        try {
                            try {
                                Iterator it2 = m26727.iterator();
                                while (it2.hasNext()) {
                                    C7675 c7675 = (C7675) it2.next();
                                    synchronized (c1472) {
                                        z8 = c1472.f5239;
                                        if (z8) {
                                            LinkedHashMap m267153 = m26715(c1472);
                                            synchronized (c1472) {
                                                c1472.f5268 = false;
                                                z9 = c1472.f5239;
                                                if (!z9) {
                                                    z10 = c1472.f5258;
                                                    if (z10) {
                                                        m26720(c1472);
                                                    } else {
                                                        c1472.f5264 = true;
                                                        m26716(c1472);
                                                    }
                                                }
                                            }
                                            return m267153;
                                        }
                                        z11 = c1472.f5258;
                                        if (z11) {
                                            m26720(c1472);
                                            LinkedHashMap m267154 = m26715(c1472);
                                            synchronized (c1472) {
                                                c1472.f5268 = false;
                                                z12 = c1472.f5239;
                                                if (!z12) {
                                                    z13 = c1472.f5258;
                                                    if (z13) {
                                                        m26720(c1472);
                                                    } else {
                                                        c1472.f5264 = true;
                                                        m26716(c1472);
                                                    }
                                                }
                                            }
                                            return m267154;
                                        }
                                        str2 = c7675.f23709;
                                        c1472.f5230 = str2;
                                        AbstractC15440 m26706 = m26706(c1472, c7675);
                                        try {
                                            C17721.m41504(m26706, EnumC16309.MODIFY_FILE);
                                            if (m26706.mo23120() && !m26706.mo23113()) {
                                                synchronized (c1472) {
                                                    m26718(c1472, m26725(m26706.mo23554()));
                                                    m267152 = m26715(c1472);
                                                }
                                                synchronized (c1472) {
                                                    c1472.f5268 = false;
                                                    z15 = c1472.f5239;
                                                    if (!z15) {
                                                        z16 = c1472.f5258;
                                                        if (z16) {
                                                            m26720(c1472);
                                                        } else {
                                                            c1472.f5264 = true;
                                                            m26716(c1472);
                                                        }
                                                    }
                                                }
                                                return m267152;
                                            }
                                            if (!m26706.mo23120()) {
                                                m26706.m36508();
                                                C14463.m34554(m26706.mo23554(), true);
                                            }
                                            synchronized (c1472) {
                                                str3 = c7675.f23714;
                                                if (!m26721(str3)) {
                                                    c7675.f23714 = "success";
                                                    String m43784 = C18965.m43784(m26706.mo23554());
                                                    if (!TextUtils.isEmpty(m43784) && !"/".equals(m43784)) {
                                                        m43784 = m43784.concat("/");
                                                    }
                                                    c7675.f23713 = m43784;
                                                    i = c1472.f5236;
                                                    c1472.f5236 = i + 1;
                                                    z14 = c7675.f23703;
                                                    if (z14) {
                                                        linkedHashSet = c1472.f5261;
                                                        str4 = c7675.f23713;
                                                        linkedHashSet.add(str4);
                                                    }
                                                    m26716(c1472);
                                                }
                                            }
                                        } catch (C1637 e) {
                                            throw new IOException(e);
                                        }
                                    }
                                }
                                synchronized (c1472) {
                                    c1472.f5268 = false;
                                    z6 = c1472.f5239;
                                    if (!z6) {
                                        z7 = c1472.f5258;
                                        if (z7) {
                                            m26720(c1472);
                                        } else {
                                            c1472.f5264 = true;
                                            m26716(c1472);
                                        }
                                    }
                                }
                                synchronized (c1472) {
                                    m26715 = m26715(c1472);
                                }
                                return m26715;
                            } catch (IOException e2) {
                                synchronized (c1472) {
                                    z3 = c1472.f5239;
                                    if (!z3) {
                                        m26718(c1472, m26729(e2.getMessage()));
                                    }
                                    throw e2;
                                }
                            }
                        } catch (Throwable th) {
                            synchronized (c1472) {
                                c1472.f5268 = false;
                                z4 = c1472.f5239;
                                if (!z4) {
                                    z5 = c1472.f5258;
                                    if (z5) {
                                        m26720(c1472);
                                    } else {
                                        c1472.f5264 = true;
                                        m26716(c1472);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
            m26716(c1472);
            return m26715(c1472);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26733(String str, String str2) {
        boolean z;
        boolean z2;
        C23197 c23197;
        boolean z3;
        LinkedHashMap linkedHashMap;
        String str3;
        boolean z4;
        String str4;
        boolean z5;
        String str5;
        long j;
        String str6;
        String str7;
        long j2;
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m26708(c1472, elapsedRealtime);
            z = c1472.f5239;
            if (!z) {
                z2 = c1472.f5258;
                if (!z2) {
                    c23197 = c1472.f5270;
                    if (c23197 == null) {
                        z3 = c1472.f5264;
                        if (z3) {
                            String m26726 = m26726(c1472);
                            if (!TextUtils.isEmpty(m26726) && TextUtils.equals(m26726, str2)) {
                                linkedHashMap = c1472.f5265;
                                C7675 c7675 = (C7675) linkedHashMap.get(str2);
                                if (c7675 != null && C7675.m20538(c7675)) {
                                    str3 = c1472.f5260;
                                    if (TextUtils.equals(str3, str2)) {
                                        str7 = c7675.f23714;
                                        if (TextUtils.equals(str7, "armed")) {
                                            j2 = c1472.f5256;
                                            if (elapsedRealtime - j2 <= 60000) {
                                                m26723(c1472);
                                                m26716(c1472);
                                                return m26715(c1472);
                                            }
                                        }
                                    }
                                    AbstractC15440 m26706 = m26706(c1472, c7675);
                                    z4 = c7675.f23706;
                                    if (z4) {
                                        if (m26706.mo23120() && m26706.mo23113()) {
                                            m26718(c1472, m26725(m26706.mo23554()));
                                            return m26715(c1472);
                                        }
                                    } else if (m26706.mo23120()) {
                                        if (m26706.mo23113()) {
                                            m26718(c1472, m26725(m26706.mo23554()));
                                            return m26715(c1472);
                                        }
                                        if (!m26719(c1472, c7675)) {
                                            z5 = c1472.f5231;
                                            if (!z5) {
                                                m26712(c1472, c7675, m26706);
                                                m26716(c1472);
                                                return m26715(c1472);
                                            }
                                        }
                                    } else {
                                        str4 = c7675.f23709;
                                        m26709(c1472, str4);
                                    }
                                    c7675.f23714 = "armed";
                                    str5 = c7675.f23709;
                                    c1472.f5260 = str5;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str);
                                    sb.append("-a");
                                    j = c1472.f5242;
                                    c1472.f5242 = 1 + j;
                                    sb.append(j);
                                    c1472.f5246 = sb.toString();
                                    c1472.f5256 = elapsedRealtime;
                                    str6 = c7675.f23709;
                                    c1472.f5230 = str6;
                                    m26723(c1472);
                                    m26716(c1472);
                                    return m26715(c1472);
                                }
                                m26724(c1472, m26726);
                                m26716(c1472);
                                return m26715(c1472);
                            }
                            m26724(c1472, m26726);
                            m26716(c1472);
                            return m26715(c1472);
                        }
                    }
                }
            }
            m26716(c1472);
            return m26715(c1472);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019b, code lost:
    
        if (r0 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019d, code lost:
    
        r0 = r2.f5261;
        r4 = r3.f23713;
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        r2.f5252 = false;
        r0 = r3.f23709;
        r2.f5230 = r0;
        r2.f5241 = 0;
        m26723(r2);
        m26716(r2);
        r0 = m26715(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c5, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c7, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cf, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01de, code lost:
    
        throw new java.util.concurrent.CancellationException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e4, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e6, code lost:
    
        r4 = r3.f23709;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fe, code lost:
    
        throw new java.io.IOException(l.C4925.m14306(bin.mt.plus.R.string.MT_Protector_res_0x7f120862, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ff, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0200, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021f, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x022d, code lost:
    
        if (r5 != null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023a, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023c, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
        r0 = r2.f5258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0248, code lost:
    
        if (r0 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x024a, code lost:
    
        m26720(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0278, code lost:
    
        r0 = m26715(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x027d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x024e, code lost:
    
        r0 = r3.f23713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0256, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0266, code lost:
    
        r3 = r2.f5238;
        r3.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0281, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bb, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02bd, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0233, code lost:
    
        if (r5.mo23120() != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0235, code lost:
    
        r5.mo23552();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0203, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0283, code lost:
    
        if (r5 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x028b, code lost:
    
        r5.mo23552();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0290, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0292, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
        m26720(r2);
        r0 = m26715(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02a4, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02a6, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02af, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r10.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010c, code lost:
    
        r10.close();
        r5 = r3.f23705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r13 != r5) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0119, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        r5 = r2.f5258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        if (r5 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0120, code lost:
    
        if (r0 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0126, code lost:
    
        if (r4.mo23120() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0128, code lost:
    
        r5 = r2.f5234;
        r2.f5234 = java.lang.Math.max(0L, r5 - r13);
        r2.f5241 = 0;
        r2.f5247 = 0;
        r2.f5232 = 0;
        r2.f5252 = false;
        m26712(r2, r3, r4);
        m26716(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014d, code lost:
    
        if (r21.mo23120() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014f, code lost:
    
        r21.mo23552();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0152, code lost:
    
        r0 = m26715(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0159, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        r2.f5252 = false;
        r2.f5241 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0168, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016b, code lost:
    
        m26713(r4, r21, r7, r0, r2);
        l.C14463.m34554(r4.mo23554(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0178, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
    
        r3.f23714 = "success";
        r3.f23713 = l.C18965.m43784(r4.mo23554());
        r3.f23702 = "";
        r0 = r2.f5236;
        r2.f5236 = r0 + 1;
        r0 = r3.f23703;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[Catch: all -> 0x021a, IOException -> 0x022b, CancellationException -> 0x0283, SYNTHETIC, TryCatch #21 {all -> 0x021a, blocks: (B:34:0x008f, B:35:0x0094, B:67:0x010c, B:71:0x0119, B:96:0x016b, B:97:0x0178, B:118:0x01d6, B:177:0x0285, B:179:0x028b, B:181:0x0290, B:200:0x02b5, B:125:0x01e5, B:129:0x01e6, B:130:0x01fe, B:212:0x0219, B:211:0x0216, B:236:0x0224, B:237:0x022a, B:184:0x0292, B:185:0x02a1), top: B:31:0x008e, inners: #6 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap m26734(java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.io.InputStream r25) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10645.m26734(java.lang.String, java.lang.String, java.lang.String, long, java.io.InputStream):java.util.LinkedHashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:8:0x000e, B:10:0x001b, B:11:0x001f, B:13:0x0021, B:15:0x0028, B:17:0x002e, B:22:0x003a, B:23:0x0041, B:26:0x0043, B:28:0x0049, B:30:0x004f, B:32:0x0055, B:38:0x0060, B:39:0x006c, B:41:0x0072, B:44:0x0082, B:45:0x0089, B:49:0x008b, B:50:0x0092, B:52:0x0094, B:53:0x009b), top: B:7:0x000e }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap m26732(java.lang.String r4) {
        /*
            r3 = this;
            l.ۧۤᩴ r0 = r3.f32029
            java.lang.Object r4 = r0.get(r4)
            l.֫֡ۢ r4 = (l.C1472) r4
            if (r4 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            r0 = r4
            monitor-enter(r0)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9d
            m26708(r4, r1)     // Catch: java.lang.Throwable -> L9d
            boolean r1 = l.C1472.m5045(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L21
            java.util.LinkedHashMap r4 = m26715(r4)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r4
        L21:
            boolean r1 = l.C1472.m5082(r4)     // Catch: java.lang.Throwable -> L9d
            r2 = 1
            if (r1 == 0) goto L43
            boolean r1 = l.C1472.m5097(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L37
            boolean r1 = l.C1472.m5069(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L35
            goto L37
        L35:
            r1 = 0
            goto L38
        L37:
            r1 = 1
        L38:
            if (r1 != 0) goto L43
            m26720(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r4 = m26715(r4)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r4
        L43:
            boolean r1 = l.C1472.m5091(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L94
            l.᩺᩵ۢ r1 = l.C1472.m5099(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L94
            boolean r1 = l.C1472.m5097(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L5d
            boolean r1 = l.C1472.m5069(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            if (r2 == 0) goto L60
            goto L94
        L60:
            java.util.LinkedHashMap r1 = l.C1472.m5092(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L9d
        L6c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L9d
            l.۟᩵ۢ r2 = (l.C7675) r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = l.C7675.m20555(r2)     // Catch: java.lang.Throwable -> L9d
            boolean r2 = m26721(r2)     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L6c
            m26716(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r4 = m26715(r4)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r4
        L8b:
            m26730(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r4 = m26715(r4)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r4
        L94:
            m26716(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.LinkedHashMap r4 = m26715(r4)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r4
        L9d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10645.m26732(java.lang.String):java.util.LinkedHashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26710(l.C1472 r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10645.m26710(l.֫֡ۢ, java.util.List):void");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m26714(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            AbstractC15440 m26706 = m26706(c1472, c7675);
            if (C7675.m20532(c7675)) {
                if (!m26706.mo23120()) {
                    continue;
                } else {
                    if (!m26706.mo23113()) {
                        throw new IOException(m26725(m26706.mo23554()));
                    }
                    c7675.f23706 = true;
                }
            } else if (!m26706.mo23120()) {
                continue;
            } else {
                if (m26706.mo23113()) {
                    throw new IOException(m26725(m26706.mo23554()));
                }
                c7675.f23706 = true;
                c7675.f23707 = C18965.m43781(m26706);
                c7675.f23715 = true;
            }
        }
        m26728(c1472);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m26728(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        boolean z;
        String str;
        long j;
        String str2;
        long j2;
        long j3;
        String str3;
        String str4;
        boolean z2;
        boolean z3;
        String str5;
        boolean z4;
        boolean z5;
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            z = c7675.f23715;
            if (z) {
                StringBuilder sb = new StringBuilder();
                str = c1472.f5253;
                sb.append(str);
                sb.append("-c");
                j = c1472.f5254;
                c1472.f5254 = 1 + j;
                sb.append(j);
                String sb2 = sb.toString();
                AbstractC15440 m26706 = m26706(c1472, c7675);
                c7675.f23714 = "waiting_conflict";
                str2 = c7675.f23709;
                String mo23554 = m26706.mo23554();
                j2 = c7675.f23705;
                j3 = c7675.f23710;
                C22306 m50047 = C22306.m50047(j2, j3);
                C22306 m50048 = C22306.m50048(m26706);
                str3 = c1472.f5229;
                str4 = c1472.f5229;
                if ("replace".equals(str4)) {
                    z4 = c7675.f23707;
                    if (z4) {
                        z5 = c1472.f5263;
                        if (z5) {
                            z2 = true;
                            z3 = c7675.f23707;
                            c1472.f5270 = new C23197(sb2, str2, mo23554, m50047, m50048, str3, z2, z3, false);
                            c1472.f5257 = "waiting_conflict";
                            str5 = c7675.f23709;
                            c1472.f5248 = "resolve_conflict";
                            c1472.f5269 = m26729(str5);
                            return;
                        }
                    }
                }
                z2 = false;
                z3 = c7675.f23707;
                c1472.f5270 = new C23197(sb2, str2, mo23554, m50047, m50048, str3, z2, z3, false);
                c1472.f5257 = "waiting_conflict";
                str5 = c7675.f23709;
                c1472.f5248 = "resolve_conflict";
                c1472.f5269 = m26729(str5);
                return;
            }
        }
        m26717(c1472);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26711(C1472 c1472, C7675 c7675, String str, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        long j;
        long j2;
        boolean z4 = false;
        c7675.f23715 = false;
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            c7675.f23714 = "skipped";
            z3 = c7675.f23708;
            if (z3) {
                c7675.f23708 = false;
                i = c1472.f5240;
                c1472.f5240 = i - 1;
                j = c1472.f5266;
                j2 = c7675.f23705;
                c1472.f5266 = j - j2;
                return;
            }
            return;
        }
        c7675.f23714 = "pending";
        c7675.f23711 = str;
        if ("replace".equals(str) && z) {
            z2 = c7675.f23707;
            if (z2) {
                z4 = true;
            }
        }
        c7675.f23712 = z4;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26727(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        String str;
        ArrayList arrayList = new ArrayList();
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            if (C7675.m20532(c7675)) {
                str = c7675.f23714;
                if (!m26721(str)) {
                    arrayList.add(c7675);
                }
            }
        }
        C6083.sort(arrayList, C15254.thenComparing(C8200.comparingInt(new C3442()), new C13319()));
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10498 m26722(C1472 c1472, C7675 c7675) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        String str3;
        LinkedHashSet linkedHashSet;
        String str4;
        int i;
        LinkedHashSet linkedHashSet2;
        boolean z5;
        int i2;
        long j;
        long j2;
        boolean z6;
        String str5;
        boolean z7;
        C11909 c11909;
        C11909 c119092;
        String m26726 = m26726(c1472);
        str = c7675.f23709;
        if (!TextUtils.equals(m26726, str)) {
            m26724(c1472, m26726);
            return C10498.m26392();
        }
        AbstractC15440 m26706 = m26706(c1472, c7675);
        z = c7675.f23706;
        if (z && m26706.mo23120() && m26706.mo23113()) {
            m26718(c1472, m26725(m26706.mo23554()));
            return C10498.m26392();
        }
        z2 = c7675.f23706;
        if (!z2 && m26706.mo23120() && m26706.mo23113()) {
            m26718(c1472, m26725(m26706.mo23554()));
            return C10498.m26392();
        }
        str2 = c7675.f23711;
        z3 = c7675.f23712;
        z4 = c7675.f23706;
        if (!z4 && m26706.mo23120()) {
            if (m26719(c1472, c7675)) {
                c11909 = c1472.f5251;
                str2 = c11909.f35592;
                c119092 = c1472.f5251;
                z3 = c119092.f35594;
                c1472.f5251 = null;
            } else {
                z6 = c1472.f5231;
                if (z6) {
                    str2 = c1472.f5255;
                    if ("replace".equals(str2)) {
                        z7 = c1472.f5233;
                        if (z7 && C18965.m43781(m26706)) {
                            z3 = true;
                            str5 = c7675.f23709;
                            m26709(c1472, str5);
                        }
                    }
                    z3 = false;
                    str5 = c7675.f23709;
                    m26709(c1472, str5);
                } else {
                    m26712(c1472, c7675, m26706);
                    return C10498.m26392();
                }
            }
        } else {
            str3 = c7675.f23709;
            m26709(c1472, str3);
        }
        if (RadialViewGroup.SKIP_TAG.equals(str2)) {
            c7675.f23714 = "skipped";
            c7675.f23702 = "";
            z5 = c7675.f23708;
            if (z5) {
                i2 = c1472.f5236;
                c1472.f5236 = i2 + 1;
                j = c1472.f5266;
                j2 = c7675.f23705;
                c1472.f5266 = j - j2;
                c7675.f23708 = false;
            }
            m26707(c1472);
            m26723(c1472);
            m26716(c1472);
            return C10498.m26392();
        }
        if ("keep_both".equals(str2)) {
            while (true) {
                String m43784 = C18965.m43784(m26706.mo23554());
                if (!m26706.mo23120()) {
                    linkedHashSet2 = c1472.f5238;
                    if (!linkedHashSet2.contains(m43784)) {
                        break;
                    }
                }
                AbstractC15440 m36492 = m26706.m36492(true);
                if (TextUtils.equals(m36492.mo23554(), m26706.mo23554())) {
                    String parent = m26706.getParent();
                    if (!TextUtils.isEmpty(parent)) {
                        String name = m26706.getName();
                        String m36505 = m26706.m36505();
                        String substring = name.substring(0, name.length() - m36505.length());
                        Matcher matcher = f32027.matcher(substring);
                        if (matcher.matches()) {
                            try {
                                i = Integer.parseInt(matcher.group(2));
                                try {
                                    substring = matcher.group(1);
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                            m26706 = C16999.m39866(parent, substring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + m36505);
                        }
                        i = 0;
                        m26706 = C16999.m39866(parent, substring + " (" + (i + 1) + MotionUtils.EASING_TYPE_FORMAT_END + m36505);
                    }
                } else {
                    m26706 = m36492;
                }
            }
        }
        String m437842 = C18965.m43784(m26706.mo23554());
        linkedHashSet = c1472.f5238;
        linkedHashSet.add(m437842);
        m26707(c1472);
        m26723(c1472);
        c7675.f23714 = "uploading";
        c7675.f23713 = m437842;
        c7675.f23702 = "";
        boolean mo23120 = m26706.mo23120();
        AbstractC15440 m36520 = m26706.m36520(".web_upload");
        str4 = c7675.f23709;
        c1472.f5230 = str4;
        m26716(c1472);
        return C10498.m26393(m26706, m36520, z3, mo23120);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26712(C1472 c1472, C7675 c7675, AbstractC15440 abstractC15440) {
        String str;
        long j;
        String str2;
        long j2;
        long j3;
        String str3;
        String str4;
        boolean z;
        String str5;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        str = c1472.f5253;
        sb.append(str);
        sb.append("-c");
        j = c1472.f5254;
        c1472.f5254 = 1 + j;
        sb.append(j);
        String sb2 = sb.toString();
        boolean m43781 = C18965.m43781(abstractC15440);
        c7675.f23707 = m43781;
        c7675.f23714 = "waiting_conflict";
        c7675.f23702 = sb2;
        str2 = c7675.f23709;
        String mo23554 = abstractC15440.mo23554();
        j2 = c7675.f23705;
        j3 = c7675.f23710;
        C22306 m50047 = C22306.m50047(j2, j3);
        C22306 m50048 = C22306.m50048(abstractC15440);
        str3 = c1472.f5229;
        str4 = c1472.f5229;
        if ("replace".equals(str4) && m43781) {
            z2 = c1472.f5263;
            if (z2) {
                z = true;
                c1472.f5270 = new C23197(sb2, str2, mo23554, m50047, m50048, str3, z, m43781, true);
                c1472.f5257 = "waiting_conflict";
                str5 = c7675.f23709;
                c1472.f5248 = "resolve_conflict";
                c1472.f5269 = m26729(str5);
            }
        }
        z = false;
        c1472.f5270 = new C23197(sb2, str2, mo23554, m50047, m50048, str3, z, m43781, true);
        c1472.f5257 = "waiting_conflict";
        str5 = c7675.f23709;
        c1472.f5248 = "resolve_conflict";
        c1472.f5269 = m26729(str5);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26719(C1472 c1472, C7675 c7675) {
        C11909 c11909;
        C11909 c119092;
        String str;
        String str2;
        C11909 c119093;
        String str3;
        String str4;
        c11909 = c1472.f5251;
        if (c11909 == null) {
            return false;
        }
        c119092 = c1472.f5251;
        str = c119092.f35595;
        str2 = c7675.f23709;
        if (!TextUtils.equals(str, str2)) {
            return false;
        }
        c119093 = c1472.f5251;
        str3 = c119093.f35593;
        str4 = c7675.f23702;
        return TextUtils.equals(str3, str4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26709(C1472 c1472, String str) {
        C11909 c11909;
        LinkedHashMap linkedHashMap;
        C11909 c119092;
        String str2;
        c11909 = c1472.f5251;
        if (c11909 != null) {
            c119092 = c1472.f5251;
            str2 = c119092.f35595;
            if (TextUtils.equals(str2, str)) {
                c1472.f5251 = null;
            }
        }
        linkedHashMap = c1472.f5265;
        C7675 c7675 = (C7675) linkedHashMap.get(str);
        if (c7675 != null) {
            c7675.f23702 = "";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26708(C1472 c1472, long j) {
        String str;
        long j2;
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        String str4;
        str = c1472.f5260;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        j2 = c1472.f5256;
        if (j - j2 <= 60000) {
            return;
        }
        linkedHashMap = c1472.f5265;
        str2 = c1472.f5260;
        C7675 c7675 = (C7675) linkedHashMap.get(str2);
        if (c7675 != null) {
            str3 = c7675.f23714;
            if (TextUtils.equals(str3, "armed")) {
                c7675.f23714 = "pending";
                str4 = c7675.f23709;
                m26709(c1472, str4);
            }
        }
        m26707(c1472);
        m26724(c1472, m26726(c1472));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m26724(C1472 c1472, String str) {
        c1472.f5248 = "restart_begin";
        c1472.f5269 = m26729(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m26723(C1472 c1472) {
        c1472.f5248 = "none";
        c1472.f5269 = "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26707(C1472 c1472) {
        c1472.f5260 = "";
        c1472.f5246 = "";
        c1472.f5256 = 0L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26717(C1472 c1472) {
        boolean z;
        c1472.f5270 = null;
        z = c1472.f5239;
        if (z) {
            return;
        }
        c1472.f5257 = "running";
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m26726(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        String str;
        boolean z;
        String str2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            if (C7675.m20538(c7675)) {
                z = c7675.f23708;
                if (z) {
                    str2 = c7675.f23714;
                    if (!m26721(str2)) {
                        z2 = c7675.f23715;
                        if (!z2) {
                            arrayList.add(c7675);
                        }
                    }
                }
            }
        }
        C6083.sort(arrayList, f32025);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return "";
        }
        str = ((C7675) it.next()).f23709;
        return str;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m26716(C1472 c1472) {
        boolean z;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long j5;
        int i3;
        long j6;
        boolean z2;
        C23197 c23197;
        long j7;
        long j8;
        String str;
        z = c1472.f5239;
        if (z) {
            j8 = c1472.f5266;
            if (j8 == 0) {
                str = c1472.f5257;
                if ("success".equals(str)) {
                    c1472.f5250 = 100;
                }
            }
        } else {
            j = c1472.f5266;
            if (j > 0) {
                j2 = c1472.f5234;
                j3 = c1472.f5266;
                c1472.f5250 = (int) Math.max(0L, Math.min(100L, (j2 * 100) / Math.max(j3, 1L)));
            } else {
                c1472.f5250 = 0;
            }
        }
        i = c1472.f5240;
        i2 = c1472.f5236;
        int max = Math.max(i - i2, 0);
        j4 = c1472.f5266;
        j5 = c1472.f5234;
        long max2 = Math.max(j4 - j5, 0L);
        i3 = c1472.f5240;
        if (i3 <= 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(C22927.m51020(max2));
            sb.append("/");
            j7 = c1472.f5266;
            sb.append(C22927.m51020(Math.max(j7, 0L)));
            c1472.f5245 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(max);
            sb2.append(" (");
            sb2.append(C22927.m51020(max2));
            sb2.append("/");
            j6 = c1472.f5266;
            sb2.append(C22927.m51020(Math.max(j6, 0L)));
            sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c1472.f5245 = sb2.toString();
        }
        z2 = c1472.f5239;
        if (z2) {
            m26723(c1472);
            m26707(c1472);
            m26717(c1472);
        } else {
            c23197 = c1472.f5270;
            if (c23197 == null) {
                c1472.f5257 = "running";
            }
        }
        c1472.f5267 = m26726(c1472);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m26730(C1472 c1472) {
        long j;
        String str;
        LinkedHashSet linkedHashSet;
        c1472.f5239 = true;
        c1472.f5257 = "success";
        c1472.f5243 = SystemClock.elapsedRealtime();
        j = c1472.f5266;
        c1472.f5250 = j == 0 ? 100 : c1472.f5250;
        str = c1472.f5259;
        c1472.f5249 = Collections.singletonList(str);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        linkedHashSet = c1472.f5261;
        c1472.f5237 = new ArrayList(linkedHashSet);
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26720(C1472 c1472) {
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            str2 = c7675.f23714;
            if (!m26721(str2)) {
                c7675.f23714 = "cancelled";
            }
        }
        c1472.f5239 = true;
        c1472.f5257 = "cancelled";
        c1472.f5244 = "";
        c1472.f5243 = SystemClock.elapsedRealtime();
        str = c1472.f5259;
        c1472.f5249 = Collections.singletonList(str);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        c1472.f5237 = list;
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26718(C1472 c1472, String str) {
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        linkedHashMap = c1472.f5265;
        for (C7675 c7675 : linkedHashMap.values()) {
            str3 = c7675.f23714;
            if (!m26721(str3)) {
                c7675.f23714 = k.j;
            }
        }
        c1472.f5239 = true;
        c1472.f5257 = "failure";
        c1472.f5244 = m26729(str);
        c1472.f5243 = SystemClock.elapsedRealtime();
        str2 = c1472.f5259;
        c1472.f5249 = Collections.singletonList(str2);
        List list = Collections.EMPTY_LIST;
        c1472.f5262 = Collections.EMPTY_LIST;
        c1472.f5237 = list;
        c1472.f5241 = 0L;
        m26723(c1472);
        m26707(c1472);
        m26717(c1472);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26713(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, boolean z, boolean z2, C1472 c1472) {
        boolean z3;
        z3 = c1472.f5258;
        if (z3) {
            throw new CancellationException();
        }
        try {
            C17721.m41504(abstractC15440, EnumC16309.MODIFY_FILE);
            if (!z2 && abstractC15440.mo23120()) {
                throw new IOException(C4925.m14306(R.string.MT_Protector_res_0x7f120869, abstractC15440.mo23554()));
            }
            if (z && abstractC15440.mo23120() && abstractC15440.mo29016()) {
                abstractC15440.mo29017(new C12614(c1472));
                abstractC154402.m36498(abstractC15440, (Runnable) null);
            } else {
                abstractC154402.m36501(abstractC15440, false, true, null);
            }
        } catch (C1637 e) {
            throw new IOException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m26703(C1472 c1472, int i) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j = c1472.f5247;
        if (j == 0) {
            c1472.f5247 = elapsedRealtime;
        }
        j2 = c1472.f5232;
        c1472.f5232 = j2 + i;
        j3 = c1472.f5247;
        long j7 = elapsedRealtime - j3;
        if (j7 < 200) {
            j6 = c1472.f5241;
            return j6;
        }
        j4 = c1472.f5232;
        c1472.f5241 = Math.max((j4 * 1000) / Math.max(j7, 1L), 0L);
        c1472.f5247 = elapsedRealtime;
        c1472.f5232 = 0L;
        j5 = c1472.f5241;
        return j5;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m26725(String str) {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120723, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26731(String str, List list) {
        C5378.removeIf(this.f32029.entrySet(), new C4853(SystemClock.elapsedRealtime()));
        String str2 = "fu-" + this.f32028.getAndIncrement();
        C1472 c1472 = new C1472(str2, str);
        this.f32029.put(str2, c1472);
        synchronized (c1472) {
            try {
                m26710(c1472, list);
                m26714(c1472);
                m26716(c1472);
            } catch (IOException e) {
                m26718(c1472, m26729(e.getMessage()));
            }
        }
        return str2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m26736(String str) {
        LinkedHashMap m26715;
        C5378.removeIf(this.f32029.entrySet(), new C4853(SystemClock.elapsedRealtime()));
        C1472 c1472 = (C1472) this.f32029.get(str);
        if (c1472 == null) {
            return null;
        }
        synchronized (c1472) {
            m26708(c1472, SystemClock.elapsedRealtime());
            m26716(c1472);
            m26715 = m26715(c1472);
        }
        return m26715;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m26729(String str) {
        return str == null ? "" : str.toString();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m26721(String str) {
        return TextUtils.equals(str, "success") || TextUtils.equals(str, "skipped") || TextUtils.equals(str, k.j) || TextUtils.equals(str, "cancelled");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m26715(C1472 c1472) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        long j;
        String str6;
        List list;
        List list2;
        List list3;
        C23197 c23197;
        LinkedHashMap linkedHashMap;
        C23197 c231972;
        String str7;
        C23197 c231973;
        String str8;
        C23197 c231974;
        C22306 c22306;
        C23197 c231975;
        C22306 c223062;
        C23197 c231976;
        String str9;
        C23197 c231977;
        boolean z2;
        C23197 c231978;
        boolean z3;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        boolean z4;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        str = c1472.f5253;
        linkedHashMap2.put("taskId", str);
        linkedHashMap2.put("type", "upload");
        z = c1472.f5239;
        linkedHashMap2.put("done", Boolean.valueOf(z));
        str2 = c1472.f5257;
        linkedHashMap2.put(c.a, str2);
        str3 = c1472.f5271;
        linkedHashMap2.put("title", str3);
        str4 = c1472.f5230;
        linkedHashMap2.put("name", str4);
        i = c1472.f5250;
        linkedHashMap2.put("progress", Integer.valueOf(i));
        str5 = c1472.f5245;
        linkedHashMap2.put("remaining", str5);
        j = c1472.f5241;
        linkedHashMap2.put("speed", Long.valueOf(j));
        str6 = c1472.f5244;
        linkedHashMap2.put(d.O, str6);
        list = c1472.f5249;
        linkedHashMap2.put("refreshDirectories", list);
        list2 = c1472.f5262;
        linkedHashMap2.put("invalidatePrefixes", list2);
        linkedHashMap2.put("pathMoves", Collections.EMPTY_LIST);
        list3 = c1472.f5237;
        linkedHashMap2.put("markedPaths", list3);
        c23197 = c1472.f5270;
        if (c23197 == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            c231972 = c1472.f5270;
            str7 = c231972.f74568;
            linkedHashMap.put("id", str7);
            c231973 = c1472.f5270;
            str8 = c231973.f74571;
            linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, str8);
            c231974 = c1472.f5270;
            c22306 = c231974.f74570;
            linkedHashMap.put("incoming", m26704(c22306));
            c231975 = c1472.f5270;
            c223062 = c231975.f74566;
            linkedHashMap.put("existing", m26704(c223062));
            c231976 = c1472.f5270;
            str9 = c231976.f74572;
            linkedHashMap.put("selectedAction", str9);
            c231977 = c1472.f5270;
            z2 = c231977.f74565;
            linkedHashMap.put("recyclable", Boolean.valueOf(z2));
            c231978 = c1472.f5270;
            z3 = c231978.f74567;
            linkedHashMap.put("moveToRecycleBin", Boolean.valueOf(z3));
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        str10 = c1472.f5248;
        linkedHashMap2.put("resumeAction", str10);
        str11 = c1472.f5269;
        linkedHashMap2.put("resumePath", str11);
        str12 = c1472.f5267;
        linkedHashMap2.put("nextUploadPath", str12);
        str13 = c1472.f5260;
        linkedHashMap2.put("armedPath", str13);
        str14 = c1472.f5246;
        linkedHashMap2.put("armToken", str14);
        z4 = c1472.f5258;
        linkedHashMap2.put("cancelRequested", Boolean.valueOf(z4));
        return linkedHashMap2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m26706(C1472 c1472, C7675 c7675) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        str = c1472.f5259;
        sb.append(str);
        sb.append("/");
        str2 = c7675.f23709;
        sb.append(str2);
        return C16999.m39866(C18965.m43784(sb.toString()), new String[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m26704(C22306 c22306) {
        if (c22306 == null || !c22306.m50052()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c22306.m50050()));
        linkedHashMap.put("time", Long.valueOf(c22306.m50051()));
        return linkedHashMap;
    }
}
