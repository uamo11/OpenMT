package l;

import java.util.concurrent.locks.LockSupport;

/* compiled from: N673 */
/* renamed from: l.᩸ۤᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21525 extends C0357 {
    public static final C18350 h;
    public static final long i;
    public C22230 e;
    public volatile C22230 f;
    public volatile Thread g;
    public volatile int lockState;

    static {
        C18350 c18350 = C18350.b;
        h = c18350;
        i = c18350.h(C21525.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    public C21525(C22230 c22230) {
        super(-2, null, null);
        int i2;
        this.f = c22230;
        C22230 c222302 = null;
        while (c22230 != null) {
            C22230 c222303 = (C22230) c22230.d;
            c22230.g = null;
            c22230.f = null;
            if (c222302 == null) {
                c22230.e = null;
                c22230.i = false;
            } else {
                Object obj = c22230.b;
                int i3 = c22230.a;
                C22230 c222304 = c222302;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = c222304.b;
                    int i4 = c222304.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentMapC10942.c(obj)) != null) {
                            int i5 = ConcurrentMapC10942.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i2 = compareTo;
                            }
                        }
                        i2 = i(obj, obj2);
                    }
                    C22230 c222305 = i2 <= 0 ? c222304.f : c222304.g;
                    if (c222305 == null) {
                        break;
                    } else {
                        c222304 = c222305;
                    }
                }
                c22230.e = c222304;
                if (i2 <= 0) {
                    c222304.f = c22230;
                } else {
                    c222304.g = c22230;
                }
                c22230 = c(c222302, c22230);
            }
            c222302 = c22230;
            c22230 = c222303;
        }
        this.e = c222302;
    }

    public final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                if (h.c(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.c(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    @Override // l.C0357
    public final C0357 a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C0357 c0357 = this.f;
        while (true) {
            C22230 c22230 = null;
            if (c0357 == null) {
                return null;
            }
            int i3 = this.lockState;
            if ((i3 & 3) != 0) {
                if (c0357.a != i2 || ((obj2 = c0357.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    c0357 = c0357.d;
                }
            } else {
                C18350 c18350 = h;
                long j = i;
                if (c18350.c(this, j, i3, i3 + 4)) {
                    try {
                        C22230 c222302 = this.e;
                        if (c222302 != null) {
                            c22230 = c222302.b(i2, obj, null);
                        }
                        if (c18350.e(this, j) == 6 && (thread2 = this.g) != null) {
                            LockSupport.unpark(thread2);
                        }
                        return c22230;
                    } catch (Throwable th) {
                        if (h.e(this, i) == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                        throw th;
                    }
                }
            }
        }
        return c0357;
    }

    public final C22230 e(int i2, Object obj, Object obj2) {
        int i3;
        C22230 b;
        C22230 b2;
        boolean z = false;
        C22230 c22230 = this.e;
        Class<?> cls = null;
        while (c22230 != null) {
            int i4 = c22230.a;
            if (i4 > i2) {
                i3 = -1;
            } else if (i4 < i2) {
                i3 = 1;
            } else {
                Object obj3 = c22230.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c22230;
                }
                if (cls != null || (cls = ConcurrentMapC10942.c(obj)) != null) {
                    int i5 = ConcurrentMapC10942.g;
                    int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (compareTo != 0) {
                        i3 = compareTo;
                    }
                }
                if (!z) {
                    C22230 c222302 = c22230.f;
                    if (c222302 != null && (b2 = c222302.b(i2, obj, cls)) != null) {
                        return b2;
                    }
                    C22230 c222303 = c22230.g;
                    if (c222303 != null && (b = c222303.b(i2, obj, cls)) != null) {
                        return b;
                    }
                    z = true;
                }
                i3 = i(obj, obj3);
            }
            C22230 c222304 = i3 <= 0 ? c22230.f : c22230.g;
            if (c222304 == null) {
                C22230 c222305 = this.f;
                C22230 c222306 = new C22230(i2, obj, obj2, c222305, c22230);
                this.f = c222306;
                if (c222305 != null) {
                    c222305.h = c222306;
                }
                if (i3 <= 0) {
                    c22230.f = c222306;
                } else {
                    c22230.g = c222306;
                }
                if (!c22230.i) {
                    c222306.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, c222306);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            c22230 = c222304;
        }
        C22230 c222307 = new C22230(i2, obj, obj2, null, null);
        this.e = c222307;
        this.f = c222307;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(l.C22230 r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21525.f(l.᩹ۤᩴ):boolean");
    }

    public static C22230 g(C22230 c22230, C22230 c222302) {
        C22230 c222303;
        if (c222302 != null && (c222303 = c222302.g) != null) {
            C22230 c222304 = c222303.f;
            c222302.g = c222304;
            if (c222304 != null) {
                c222304.e = c222302;
            }
            C22230 c222305 = c222302.e;
            c222303.e = c222305;
            if (c222305 == null) {
                c222303.i = false;
                c22230 = c222303;
            } else if (c222305.f == c222302) {
                c222305.f = c222303;
            } else {
                c222305.g = c222303;
            }
            c222303.f = c222302;
            c222302.e = c222303;
        }
        return c22230;
    }

    public static C22230 h(C22230 c22230, C22230 c222302) {
        C22230 c222303;
        if (c222302 != null && (c222303 = c222302.f) != null) {
            C22230 c222304 = c222303.g;
            c222302.f = c222304;
            if (c222304 != null) {
                c222304.e = c222302;
            }
            C22230 c222305 = c222302.e;
            c222303.e = c222305;
            if (c222305 == null) {
                c222303.i = false;
                c22230 = c222303;
            } else if (c222305.g == c222302) {
                c222305.g = c222303;
            } else {
                c222305.f = c222303;
            }
            c222303.g = c222302;
            c222302.e = c222303;
        }
        return c22230;
    }

    public static C22230 c(C22230 c22230, C22230 c222302) {
        C22230 c222303;
        c222302.i = true;
        while (true) {
            C22230 c222304 = c222302.e;
            if (c222304 == null) {
                c222302.i = false;
                return c222302;
            }
            if (!c222304.i || (c222303 = c222304.e) == null) {
                break;
            }
            C22230 c222305 = c222303.f;
            if (c222304 == c222305) {
                C22230 c222306 = c222303.g;
                if (c222306 != null && c222306.i) {
                    c222306.i = false;
                    c222304.i = false;
                    c222303.i = true;
                    c222302 = c222303;
                } else {
                    if (c222302 == c222304.g) {
                        c22230 = g(c22230, c222304);
                        C22230 c222307 = c222304.e;
                        c222303 = c222307 == null ? null : c222307.e;
                        c222304 = c222307;
                        c222302 = c222304;
                    }
                    if (c222304 != null) {
                        c222304.i = false;
                        if (c222303 != null) {
                            c222303.i = true;
                            c22230 = h(c22230, c222303);
                        }
                    }
                }
            } else if (c222305 != null && c222305.i) {
                c222305.i = false;
                c222304.i = false;
                c222303.i = true;
                c222302 = c222303;
            } else {
                if (c222302 == c222304.f) {
                    c22230 = h(c22230, c222304);
                    C22230 c222308 = c222304.e;
                    c222303 = c222308 == null ? null : c222308.e;
                    c222304 = c222308;
                    c222302 = c222304;
                }
                if (c222304 != null) {
                    c222304.i = false;
                    if (c222303 != null) {
                        c222303.i = true;
                        c22230 = g(c22230, c222303);
                    }
                }
            }
        }
        return c22230;
    }

    public static C22230 b(C22230 c22230, C22230 c222302) {
        while (c222302 != null && c222302 != c22230) {
            C22230 c222303 = c222302.e;
            if (c222303 == null) {
                c222302.i = false;
                return c222302;
            }
            if (c222302.i) {
                c222302.i = false;
                return c22230;
            }
            C22230 c222304 = c222303.f;
            if (c222304 == c222302) {
                C22230 c222305 = c222303.g;
                if (c222305 != null && c222305.i) {
                    c222305.i = false;
                    c222303.i = true;
                    c22230 = g(c22230, c222303);
                    c222303 = c222302.e;
                    c222305 = c222303 == null ? null : c222303.g;
                }
                if (c222305 != null) {
                    C22230 c222306 = c222305.f;
                    C22230 c222307 = c222305.g;
                    if ((c222307 == null || !c222307.i) && (c222306 == null || !c222306.i)) {
                        c222305.i = true;
                    } else {
                        if (c222307 == null || !c222307.i) {
                            if (c222306 != null) {
                                c222306.i = false;
                            }
                            c222305.i = true;
                            c22230 = h(c22230, c222305);
                            c222303 = c222302.e;
                            c222305 = c222303 != null ? c222303.g : null;
                        }
                        if (c222305 != null) {
                            c222305.i = c222303 == null ? false : c222303.i;
                            C22230 c222308 = c222305.g;
                            if (c222308 != null) {
                                c222308.i = false;
                            }
                        }
                        if (c222303 != null) {
                            c222303.i = false;
                            c22230 = g(c22230, c222303);
                        }
                        c222302 = c22230;
                        c22230 = c222302;
                    }
                }
                c222302 = c222303;
            } else {
                if (c222304 != null && c222304.i) {
                    c222304.i = false;
                    c222303.i = true;
                    c22230 = h(c22230, c222303);
                    c222303 = c222302.e;
                    c222304 = c222303 == null ? null : c222303.f;
                }
                if (c222304 != null) {
                    C22230 c222309 = c222304.f;
                    C22230 c2223010 = c222304.g;
                    if ((c222309 == null || !c222309.i) && (c2223010 == null || !c2223010.i)) {
                        c222304.i = true;
                    } else {
                        if (c222309 == null || !c222309.i) {
                            if (c2223010 != null) {
                                c2223010.i = false;
                            }
                            c222304.i = true;
                            c22230 = g(c22230, c222304);
                            c222303 = c222302.e;
                            c222304 = c222303 != null ? c222303.f : null;
                        }
                        if (c222304 != null) {
                            c222304.i = c222303 == null ? false : c222303.i;
                            C22230 c2223011 = c222304.f;
                            if (c2223011 != null) {
                                c2223011.i = false;
                            }
                        }
                        if (c222303 != null) {
                            c222303.i = false;
                            c22230 = h(c22230, c222303);
                        }
                        c222302 = c22230;
                        c22230 = c222302;
                    }
                }
                c222302 = c222303;
            }
        }
        return c22230;
    }
}
