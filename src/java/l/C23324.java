package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: S6KI */
/* renamed from: l.᩺᩻ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23324 {

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f74953 = Executors.newFixedThreadPool(2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f74954;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12741 f74955;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74956;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12036 f74957;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74958;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f74959;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11813 f74960;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74961;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Executor f74962;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5272 f74963;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1038 f74964;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51714(final C23324 c23324, final C12036 c12036) {
        c23324.getClass();
        final C11813 c11813 = null;
        try {
            if (!c12036.f36017) {
                if (c12036.f36018 == 4) {
                    c11813 = c12036.f36020.mo9350(c12036.f36021, c12036.f36016, c12036.f36019);
                } else {
                    c11813 = ((C3695) c12036.f36020).m11257(c12036.f36016, c12036.f36019, false);
                }
            }
        } catch (Throwable unused) {
        }
        C12741 c12741 = c23324.f74955;
        Runnable runnable = new Runnable() { // from class: l.ۤ᩻ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C23324.m51715(C23324.this, c12036, c11813);
            }
        };
        c12741.getClass();
        C4925.m14315(runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51715(C23324 c23324, C12036 c12036, C11813 c11813) {
        c23324.getClass();
        if (c12036.f36015 != c23324.f74961) {
            if (c23324.f74957 == c12036) {
                c23324.f74957 = null;
                c23324.f74960 = null;
                c23324.f74958 = false;
            }
        } else {
            c23324.f74960 = c11813;
            c23324.f74958 = true;
        }
        c23324.f74963.accept(0L);
    }

    public C23324(C5272 c5272, C1038 c1038) {
        C12741 c12741 = new C12741();
        this.f74956 = new IdentityHashMap();
        this.f74954 = Collections.EMPTY_LIST;
        this.f74962 = f74953;
        this.f74955 = c12741;
        this.f74963 = c5272;
        this.f74964 = c1038;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51717() {
        this.f74961++;
        this.f74954 = Collections.EMPTY_LIST;
        this.f74956.clear();
        this.f74959 = 0L;
        C12036 c12036 = this.f74957;
        if (c12036 != null) {
            c12036.f36017 = true;
        }
        if (this.f74958) {
            this.f74957 = null;
            this.f74960 = null;
            this.f74958 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r5.f36021 != r21) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m51718(java.util.List r19, int r20, l.AbstractC16891 r21, l.InterfaceC10834 r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23324.m51718(java.util.List, int, l.ܽ᩷ܳ, l.ۧۜܳ, int, long):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m51716(InterfaceC17889 interfaceC17889, int i) {
        return (((C6391) this.f74956.get(interfaceC17889)).f19781 & i) != 0;
    }
}
