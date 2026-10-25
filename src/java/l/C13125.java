package l;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import net.engio.mbassy.listener.MessageHandler;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: O8L1 */
/* renamed from: l.۬۬֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13125 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4659 f39263 = new C4659();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Random f39264 = new Random();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f39265;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11715 f39270;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20369 f39271 = new C20369();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22485 f39269 = new C22485();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f39267 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4846 f39266 = AbstractC4846.f15313;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39268 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m31792() {
        return this.f39265;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized String m31793(AbstractC4846 abstractC4846, C15894 c15894) {
        String str;
        str = m31784(abstractC4846.mo14105(c15894.f49112, this.f39269).f72806, c15894).f10209;
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m31794(C0425 c0425) {
        boolean z;
        C11715 c11715;
        String str;
        String str2 = this.f39265;
        if (str2 != null) {
            C3248 c3248 = (C3248) this.f39267.get(str2);
            c3248.getClass();
            m31786(c3248);
        }
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c32482 = (C3248) it.next();
            it.remove();
            z = c32482.f10207;
            if (z && (c11715 = this.f39270) != null) {
                str = c32482.f10209;
                c11715.m28607(c0425, str);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m31795(C0425 c0425, int i) {
        boolean z;
        String str;
        String str2;
        boolean unused;
        this.f39270.getClass();
        boolean z2 = i == 0;
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c3248 = (C3248) it.next();
            if (c3248.m9944(c0425)) {
                it.remove();
                z = c3248.f10207;
                if (z) {
                    str = c3248.f10209;
                    boolean equals = str.equals(this.f39265);
                    if (z2 && equals) {
                        unused = c3248.f10205;
                    }
                    if (equals) {
                        m31786(c3248);
                    }
                    C11715 c11715 = this.f39270;
                    str2 = c3248.f10209;
                    c11715.m28607(c0425, str2);
                }
            }
        }
        m31791(c0425);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m31797(C0425 c0425) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        long j;
        int i;
        this.f39270.getClass();
        if (c0425.f1892.m14110()) {
            return;
        }
        C15894 c15894 = c0425.f1895;
        if (c15894 != null) {
            if (c15894.f49111 < m31789()) {
                return;
            }
            C3248 c3248 = (C3248) this.f39267.get(this.f39265);
            if (c3248 != null) {
                j = c3248.f10210;
                if (j == -1) {
                    i = c3248.f10206;
                    if (i != c0425.f1893) {
                        return;
                    }
                }
            }
        }
        C3248 m31784 = m31784(c0425.f1893, c0425.f1895);
        if (this.f39265 == null) {
            str3 = m31784.f10209;
            this.f39265 = str3;
        }
        C15894 c158942 = c0425.f1895;
        if (c158942 != null && c158942.m37669()) {
            C15894 c158943 = c0425.f1895;
            Object obj = c158943.f49112;
            C3248 m317842 = m31784(c0425.f1893, new C15894(c158943.f49108, c158943.f49111, obj));
            z3 = m317842.f10207;
            if (!z3) {
                m317842.f10207 = true;
                c0425.f1892.mo14105(c0425.f1895.f49112, this.f39269);
                this.f39269.m50433(c0425.f1895.f49108);
                Math.max(0L, C3603.m11037(0L) + C3603.m11037(this.f39269.f72804));
                this.f39270.getClass();
            }
        }
        z = m31784.f10207;
        if (!z) {
            m31784.f10207 = true;
            this.f39270.getClass();
        }
        str = m31784.f10209;
        if (str.equals(this.f39265)) {
            z2 = m31784.f10205;
            if (!z2) {
                m31784.f10205 = true;
                C11715 c11715 = this.f39270;
                str2 = m31784.f10209;
                c11715.m28606(c0425, str2);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m31798(C0425 c0425) {
        boolean z;
        String str;
        String str2;
        this.f39270.getClass();
        AbstractC4846 abstractC4846 = this.f39266;
        this.f39266 = c0425.f1892;
        Iterator it = this.f39267.values().iterator();
        while (it.hasNext()) {
            C3248 c3248 = (C3248) it.next();
            if (!c3248.m9945(abstractC4846, this.f39266) || c3248.m9944(c0425)) {
                it.remove();
                z = c3248.f10207;
                if (z) {
                    str = c3248.f10209;
                    if (str.equals(this.f39265)) {
                        m31786(c3248);
                    }
                    C11715 c11715 = this.f39270;
                    str2 = c3248.f10209;
                    c11715.m28607(c0425, str2);
                }
            }
        }
        m31791(c0425);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31796(C11715 c11715) {
        this.f39270 = c11715;
    }

    @RequiresNonNull({MessageHandler.Properties.Listener})
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m31791(C0425 c0425) {
        String str;
        long j;
        C15894 c15894;
        C15894 c158942;
        C15894 c158943;
        AbstractC4846 abstractC4846 = c0425.f1892;
        int i = c0425.f1893;
        C15894 c158944 = c0425.f1895;
        boolean m14110 = abstractC4846.m14110();
        HashMap hashMap = this.f39267;
        if (m14110) {
            String str2 = this.f39265;
            if (str2 != null) {
                C3248 c3248 = (C3248) hashMap.get(str2);
                c3248.getClass();
                m31786(c3248);
                return;
            }
            return;
        }
        C3248 c32482 = (C3248) hashMap.get(this.f39265);
        str = m31784(i, c158944).f10209;
        this.f39265 = str;
        m31797(c0425);
        if (c158944 != null) {
            long j2 = c158944.f49111;
            if (c158944.m37669()) {
                if (c32482 != null) {
                    j = c32482.f10210;
                    if (j == j2) {
                        c15894 = c32482.f10204;
                        if (c15894 != null) {
                            c158942 = c32482.f10204;
                            if (c158942.f49108 == c158944.f49108) {
                                c158943 = c32482.f10204;
                                if (c158943.f49109 == c158944.f49109) {
                                    return;
                                }
                            }
                        }
                    }
                }
                m31784(i, new C15894(j2, c158944.f49112));
                this.f39270.getClass();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31786(C3248 c3248) {
        long j;
        long j2;
        j = c3248.f10210;
        if (j != -1) {
            j2 = c3248.f10210;
            this.f39268 = j2;
        }
        this.f39265 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long m31789() {
        long j;
        long j2;
        C3248 c3248 = (C3248) this.f39267.get(this.f39265);
        if (c3248 != null) {
            j = c3248.f10210;
            if (j != -1) {
                j2 = c3248.f10210;
                return j2;
            }
        }
        return this.f39268 + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3248 m31784(int i, C15894 c15894) {
        long j;
        C15894 c158942;
        C15894 c158943;
        HashMap hashMap = this.f39267;
        C3248 c3248 = null;
        long j2 = C13132.FOREVER_NS;
        for (C3248 c32482 : hashMap.values()) {
            c32482.m9946(i, c15894);
            if (c32482.m9943(i, c15894)) {
                j = c32482.f10210;
                if (j == -1 || j < j2) {
                    c3248 = c32482;
                    j2 = j;
                } else if (j == j2) {
                    String str = C3603.f11424;
                    c158942 = c3248.f10204;
                    if (c158942 != null) {
                        c158943 = c32482.f10204;
                        if (c158943 != null) {
                            c3248 = c32482;
                        }
                    }
                }
            }
        }
        if (c3248 != null) {
            return c3248;
        }
        String m31787 = m31787();
        C3248 c32483 = new C3248(this, m31787, i, c15894);
        hashMap.put(m31787, c32483);
        return c32483;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31787() {
        byte[] bArr = new byte[12];
        f39264.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
