package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: P6V4 */
/* renamed from: l.ۚܺۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5451 implements Closeable {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final long f16958 = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ScheduledThreadPoolExecutor f16959;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16960;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Semaphore f16961;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f16962;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f16963;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11440 f16964;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f16965;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17760 f16966;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f16967;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f16968;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f16969;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f16970;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized C3059 m15548(String str) {
        JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str == null ? JSON.NULL : JSON.value(str));
        if (this.f16962) {
            return C3059.m9365("FILE_SEARCH_CANCELED", "Text search service is closed. Restore the MCP service before retrying. After an application process restart, start a new search with cursor=\"\".", "warning", (JSONArray) null, add);
        }
        return C3059.m9362(add);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized C21330 m15550(String str, C0867 c0867) {
        C18857 c18857;
        C21330 c21330;
        m15551();
        c18857 = (C18857) this.f16969.remove(str);
        if (c18857 != null) {
            c21330 = c18857.f59462;
            c0867.m3188(c21330);
        }
        return c18857 == null ? null : c18857.f59462;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m15552(String str, C21330 c21330, C0867 c0867) {
        C21330 c213302;
        if (!this.f16962 && this.f16960 != 0 && c21330.m48355() <= this.f16967) {
            m15551();
            m15556(str);
            c0867.m3192();
            LinkedHashMap linkedHashMap = this.f16969;
            this.f16964.getClass();
            linkedHashMap.put(str, new C18857(c21330, System.nanoTime()));
            while (true) {
                if (this.f16969.size() <= this.f16960) {
                    Iterator it = this.f16969.values().iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        c213302 = ((C18857) it.next()).f59462;
                        j += c213302.m48355();
                    }
                    if (j <= this.f16967) {
                        m15555();
                        return;
                    }
                }
                m15556((String) this.f16969.keySet().iterator().next());
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m15556(String str) {
        C21330 c21330;
        C18857 c18857 = (C18857) this.f16969.remove(str);
        if (c18857 != null) {
            c21330 = c18857.f59462;
            try {
                c21330.close();
            } catch (IOException unused) {
            }
        }
    }

    public C5451(C17760 c17760) {
        C11440 c11440 = new C11440();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f16961 = new Semaphore(4, true);
        this.f16969 = new LinkedHashMap(16, 0.75f, true);
        this.f16968 = new HashSet();
        this.f16966 = c17760;
        this.f16964 = c11440;
        this.f16963 = X931RNG.BLOCK128_RESEED_MAX;
        this.f16970 = nanos;
        this.f16960 = 8;
        this.f16967 = 16777216L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0511 m15557(String str, C19563 c19563, String str2) {
        int i;
        C15683 m36956;
        C11459 m15549;
        Throwable th;
        String str3;
        String str4;
        String str5;
        C0867 c0867 = new C0867();
        String str6 = null;
        int i2 = 0;
        try {
            try {
                synchronized (this) {
                    if (this.f16962) {
                        throw new IOException("Text search service is closed.");
                    }
                    this.f16968.add(c0867);
                }
                try {
                    this.f16961.acquire();
                    try {
                        try {
                            synchronized (this) {
                                if (this.f16962) {
                                    throw new IOException("Text search service is closed.");
                                }
                            }
                            C0161.m1279();
                            C7383 m41607 = this.f16966.m41607();
                            this.f16966.getClass();
                            String m41599 = C17760.m41599(str, m41607, MotionUtils.EASING_TYPE_PATH);
                            try {
                                m36956 = str2.isEmpty() ? null : C15683.m36956(str2, m41599);
                                if (m36956 != null) {
                                    str5 = c19563.f63239;
                                    if (!str5.equals(m36956.f48339) || !c19563.m44992(m36956.f48339).equals(m36956.f48337)) {
                                        throw C3059.m9365("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, m41599));
                                    }
                                }
                                m15549 = str2.isEmpty() ? m15549(c19563) : null;
                            } catch (IOException e) {
                                e = e;
                            } catch (IllegalArgumentException e2) {
                                e = e2;
                                str6 = m41599;
                                this.f16966.getClass();
                                throw C17760.m41600(e, str6);
                            } catch (SecurityException e3) {
                                e = e3;
                                str6 = m41599;
                                this.f16966.getClass();
                                throw C17760.m41600(e, str6);
                            } catch (C3059 e4) {
                                e = e4;
                            }
                            try {
                                C10000 m41608 = this.f16966.m41608(m41599);
                                try {
                                    C12619 m41613 = this.f16966.m41613(m41599);
                                    C17760 c17760 = this.f16966;
                                    try {
                                        if (m41613.m30885() == EnumC3447.MISSING) {
                                            c17760.getClass();
                                            throw C17760.m41606(m41599);
                                        }
                                        if (m41613.m30885() != EnumC3447.REGULAR) {
                                            EnumC3447 m30885 = m41613.m30885();
                                            c17760.getClass();
                                            throw C17760.m41603("FILE_NOT_REGULAR", "Text search requires a regular file.", m41599, m30885);
                                        }
                                        if (m41613.m30884() > 9007199254740991L) {
                                            throw C3059.m9365("FILE_STORAGE_ERROR", "File size exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, m41599));
                                        }
                                        byte[] bArr = new byte[32768];
                                        InputStream mo27926 = m41613.m30882().mo27926();
                                        C5101 m3188 = c0867.m3188(mo27926);
                                        while (i2 < 32768) {
                                            try {
                                                try {
                                                    C0161.m1279();
                                                    int read = mo27926.read(bArr, i2, 32768 - i2);
                                                    if (read < 0) {
                                                        break;
                                                    }
                                                    if (read == 0) {
                                                        int read2 = mo27926.read();
                                                        if (read2 < 0) {
                                                            break;
                                                        }
                                                        int i3 = i2 + 1;
                                                        bArr[i2] = (byte) read2;
                                                        i2 = i3;
                                                    } else {
                                                        i2 += read;
                                                    }
                                                } catch (Throwable th2) {
                                                    try {
                                                        m3188.close();
                                                        throw th2;
                                                    } catch (Throwable th3) {
                                                        th2.addSuppressed(th3);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                try {
                                                    m41608.close();
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    th.addSuppressed(th5);
                                                    throw th;
                                                }
                                            }
                                        }
                                        m3188.close();
                                        if (i2 != 32768) {
                                            bArr = Arrays.copyOf(bArr, i2);
                                        }
                                        String m34531 = C14460.m34531(C14460.m34534().digest(bArr));
                                        str3 = c19563.f63239;
                                        C17095 m33920 = C14272.m33920(str3, bArr);
                                        if (m36956 == null) {
                                            m36956 = new C15683(m41599, c19563.m44992(m33920.f52403), m33920.f52403, m41613.m30884(), m41613.m30883(), m34531);
                                            long j = m33920.f52401;
                                            m36956.f48335 = j;
                                            m36956.f48331 = j;
                                        } else if (m36956.f48341 != m41613.m30884() || m36956.f48343 != m41613.m30883() || !m36956.f48330.equals(m34531) || !m36956.f48339.equals(m33920.f52403)) {
                                            throw m15554(m41599);
                                        }
                                        C15683 c15683 = m36956;
                                        C21330 m15550 = m15550(str2, c0867);
                                        if (m15550 == null) {
                                            str4 = m41599;
                                            C21330 c21330 = new C21330(m41613.m30882(), m33920, c15683, c19563, m15549 == null ? m15549(c19563) : m15549, c0867);
                                            c0867.m3188(c21330);
                                            m15550 = c21330;
                                        } else {
                                            str4 = m41599;
                                            c15683 = m15550.f68741;
                                        }
                                        C14978 m48356 = m15550.m48356(this.f16963, this.f16970, this.f16964);
                                        synchronized (this) {
                                            if (this.f16962) {
                                                throw new IOException("Text search service is closed.");
                                            }
                                        }
                                        C12619 m416132 = this.f16966.m41613(str4);
                                        if (m48356.f45651.equals(d.aB)) {
                                            long j2 = c15683.f48341;
                                            if (j2 >= 0 && c15683.f48331 != j2) {
                                                throw m15554(str4);
                                            }
                                        }
                                        if (m416132.m30885() != EnumC3447.REGULAR || m416132.m30884() != m41613.m30884() || m416132.m30883() != m41613.m30883()) {
                                            throw m15554(str4);
                                        }
                                        this.f16966.m41607().m19883(str4);
                                        JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str4).add("encoding", c15683.f48339).add("matchedLines", m48356.f45652).add("blocks", m48356.m35460()).add("searchedThroughByteOffset", c15683.f48331);
                                        long j3 = c15683.f48341;
                                        JSONObject add2 = add.add("scanSize", j3 < 0 ? JSON.NULL : JSON.value(j3)).add("stopReason", m48356.f45651).add("warnings", m48356.f45653);
                                        String m36958 = (m48356.f45651.equals(d.aB) || m48356.f45651.equals("resource_limit") || m48356.f45651.equals("decode_error")) ? "" : c15683.m36958();
                                        if (!m36958.isEmpty()) {
                                            m15552(m36958, m15550, c0867);
                                        }
                                        C0511 c0511 = new C0511(add2, m36958);
                                        m41608.close();
                                        c0867.m3190();
                                        synchronized (this) {
                                            this.f16968.remove(c0867);
                                        }
                                        m15556(str2);
                                        this.f16961.release();
                                        return c0511;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        m41608.close();
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (IOException e5) {
                                e = e5;
                                str6 = m41599;
                                i2 = 1;
                                synchronized (this) {
                                    if (!this.f16962 && !c0867.m3191() && !Thread.currentThread().isInterrupted()) {
                                    }
                                    throw m15548(str6);
                                }
                                this.f16966.getClass();
                                throw C17760.m41601(str6, e);
                            } catch (IllegalArgumentException e6) {
                                e = e6;
                                str6 = m41599;
                                this.f16966.getClass();
                                throw C17760.m41600(e, str6);
                            } catch (SecurityException e7) {
                                e = e7;
                                str6 = m41599;
                                this.f16966.getClass();
                                throw C17760.m41600(e, str6);
                            } catch (C3059 e8) {
                                e = e8;
                                str6 = m41599;
                                if (e.f9610.equals("FILE_OPERATION_INTERRUPTED") && Thread.currentThread().isInterrupted()) {
                                    throw m15548(str6);
                                }
                                throw e;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            i = 1;
                            c0867.m3190();
                            synchronized (this) {
                                this.f16968.remove(c0867);
                            }
                            m15556(str2);
                            if (i != 0) {
                                this.f16961.release();
                            }
                            throw th;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                    } catch (SecurityException e11) {
                        e = e11;
                    } catch (C3059 e12) {
                        e = e12;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Text search canceled while waiting.");
                }
            } catch (Throwable th9) {
                th = th9;
                i = i2;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (IllegalArgumentException e14) {
            e = e14;
        } catch (SecurityException e15) {
            e = e15;
        } catch (C3059 e16) {
            e = e16;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m15549(C19563 c19563) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        z = c19563.f63234;
        int i = z ? 0 : 16;
        z2 = c19563.f63233;
        if (!z2) {
            i |= 66;
        }
        try {
            str2 = c19563.f63240;
            return C11459.m28259(i, str2);
        } catch (PatternSyntaxException e) {
            String str3 = "Invalid regular expression: " + e.getDescription();
            str = c19563.f63240;
            throw C3059.m9364(str3, "pattern", JSON.value(str), JSON.array(), JSON.object());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m15554(String str) {
        return C3059.m9365("FILE_CHANGED_DURING_READ", "The file changed. Restart text search with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15551() {
        long j;
        C21330 c21330;
        this.f16964.getClass();
        long nanoTime = System.nanoTime();
        Iterator it = this.f16969.values().iterator();
        while (it.hasNext()) {
            C18857 c18857 = (C18857) it.next();
            j = c18857.f59463;
            if (nanoTime - j >= f16958) {
                it.remove();
                c21330 = c18857.f59462;
                try {
                    c21330.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15555() {
        long j;
        if (this.f16965) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f16969;
        if (linkedHashMap.isEmpty() || this.f16962) {
            return;
        }
        if (this.f16959 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4040());
            this.f16959 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
            this.f16959.allowCoreThreadTimeOut(true);
            this.f16959.setRemoveOnCancelPolicy(true);
        }
        Iterator it = linkedHashMap.values().iterator();
        long j2 = C13132.FOREVER_NS;
        while (it.hasNext()) {
            j = ((C18857) it.next()).f59463;
            j2 = Math.min(j2, j);
        }
        this.f16965 = true;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.f16959;
        RunnableC23520 runnableC23520 = new RunnableC23520(1, this);
        this.f16964.getClass();
        scheduledThreadPoolExecutor2.schedule(runnableC23520, Math.max(1L, f16958 - (System.nanoTime() - j2)), TimeUnit.NANOSECONDS);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15553(C5451 c5451) {
        synchronized (c5451) {
            c5451.f16965 = false;
            c5451.m15551();
            c5451.m15555();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        C18857[] c18857Arr;
        HashSet hashSet;
        C21330 c21330;
        synchronized (this) {
            this.f16962 = true;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f16959;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
            c18857Arr = (C18857[]) this.f16969.values().toArray(new C18857[0]);
            this.f16969.clear();
            hashSet = new HashSet(this.f16968);
            this.f16968.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0867) it.next()).m3189();
        }
        for (C18857 c18857 : c18857Arr) {
            c21330 = c18857.f59462;
            try {
                c21330.close();
            } catch (IOException unused) {
            }
        }
    }
}
