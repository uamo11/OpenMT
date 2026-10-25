package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import java.io.IOException;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* compiled from: 01UY */
/* renamed from: l.ܿ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17558 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C18264 f53665;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11209 f53666 = new C11209();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53667;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11209 f53668;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18264 f53669;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41048(C18264 c18264) {
        this.f53669 = c18264;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18264 m41049() {
        return this.f53669;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41047() {
        this.f53667 = true;
    }

    public C17558(C18264 c18264) {
        this();
        this.f53669 = c18264;
        this.f53667 = true;
    }

    public C17558() {
        this.f53668 = f53666;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16852 m41046(AbstractC15440 abstractC15440) {
        this.f53669 = null;
        if (abstractC15440.mo36530()) {
            try {
                C11209 c11209 = this.f53668;
                String mo23554 = abstractC15440.mo23554();
                c11209.getClass();
                StructStat stat = Os.stat(mo23554);
                this.f53669 = new C18264(stat.st_mode & 4095, stat.st_uid, stat.st_gid);
                return EnumC16852.SUCCESS;
            } catch (ErrnoException | SecurityException unused) {
                return EnumC16852.FAILED;
            }
        }
        if (abstractC15440 instanceof C13198) {
            C13198 mo32036 = abstractC15440.mo32036();
            if (!mo32036.m32033()) {
                return EnumC16852.FAILED;
            }
            C3321 m32035 = mo32036.m32035();
            this.f53669 = new C18264(m32035.m10171(), m32035.m10169(), m32035.m10167());
            return EnumC16852.SUCCESS;
        }
        C11293 m41045 = m41045(abstractC15440);
        if (m41045 == null || !C22518.m50492().mo2656()) {
            return EnumC16852.UNAVAILABLE;
        }
        C17642 mo27920 = m41045.mo27920();
        if (mo27920 == null) {
            try {
                mo27920 = C20402.m46724(m41045.mo23554());
            } catch (IOException unused2) {
                return EnumC16852.FAILED;
            }
        }
        this.f53669 = new C18264(mo27920);
        return EnumC16852.SUCCESS;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:24|(5:(0)|31|32|33|(1:(2:42|43)(2:40|41))(2:36|37))(9:27|(2:46|47)|31|32|33|(0)|(0)|42|43)|48|32|33|(0)|(0)|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r3 == (-1)) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd A[ADDED_TO_REGION] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.EnumC16852 m41051(l.AbstractC15440 r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17558.m41051(l.ܶ᩵ܿ):l.ܽ᩵ܿ");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11293 m41045(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo27917()) {
            return abstractC15440.mo27925();
        }
        if (Build.VERSION.SDK_INT < 30 || !(abstractC15440 instanceof C12993)) {
            return null;
        }
        return abstractC15440.mo31566().m31569();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41050(AbstractC15440 abstractC15440) {
        C11293 m31569;
        if (this.f53667) {
            return;
        }
        C17642 c17642 = null;
        this.f53669 = null;
        if (abstractC15440.mo23126()) {
            if (abstractC15440 instanceof C13198) {
                C13198 mo32036 = abstractC15440.mo32036();
                if (mo32036.m32033()) {
                    C3321 m32035 = mo32036.m32035();
                    this.f53669 = new C18264(m32035.m10171(), m32035.m10169(), m32035.m10167());
                    return;
                }
                return;
            }
            return;
        }
        if (C22518.m50492().mo2656()) {
            boolean z = false;
            if (abstractC15440.mo27917()) {
                c17642 = abstractC15440.mo27925().mo27920();
            } else if ((abstractC15440 instanceof C12993) && (m31569 = abstractC15440.mo31566().m31569()) != null) {
                c17642 = m31569.mo27920();
                if (c17642 == null) {
                    try {
                        c17642 = C20402.m46724(m31569.mo23554());
                    } catch (IOException unused) {
                    }
                }
            } else if (abstractC15440.mo36530() && abstractC15440.mo29016() && C16999.m39887(abstractC15440.mo23554())) {
                C18264 c18264 = f53665;
                if (c18264 != null) {
                    this.f53669 = c18264;
                    return;
                }
                z = true;
            }
            if (c17642 == null) {
                try {
                    c17642 = C20402.m46724(abstractC15440.mo23554());
                } catch (IOException unused2) {
                }
            }
            if (c17642 != null) {
                C18264 c182642 = new C18264(c17642);
                this.f53669 = c182642;
                if (z) {
                    c182642.f56795 = SecP521R1Field.P16;
                    f53665 = c182642;
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41052(AbstractC15440 abstractC15440) {
        C18264 c18264;
        C11293 m31569;
        if (!(abstractC15440.mo27917() || (abstractC15440 instanceof C13198) || ((abstractC15440 instanceof C12993) && C22518.m50492().mo2656())) || (c18264 = this.f53669) == null) {
            return;
        }
        int i = c18264.f56794;
        int i2 = c18264.f56796;
        if (abstractC15440 instanceof C13198) {
            abstractC15440.mo32036().m32030(c18264.f56795);
            return;
        }
        if (C22518.m50492().mo2656()) {
            String mo23554 = (!(abstractC15440 instanceof C12993) || (m31569 = abstractC15440.mo31566().m31569()) == null) ? abstractC15440.mo23554() : m31569.mo23554();
            try {
                C20402.m46726(mo23554, c18264.f56795, false, false);
            } catch (IOException unused) {
            }
            if (i2 == -1 || i == -1) {
                return;
            }
            if (abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) {
                return;
            }
            try {
                C20402.m46725(mo23554, i2, i, false, false);
            } catch (IOException unused2) {
            }
        }
    }
}
