package l;

import java.io.IOException;
import java.util.HashSet;

/* compiled from: Z71T */
/* renamed from: l.۠ܰܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8218 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20177 f25315 = new C20177();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C1785 f25316 = new C1785(0, 0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f25317;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f25318;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f25319;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f25320;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1785 f25321;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1162 m21761(String str, boolean z) {
        String mo27935;
        HashSet hashSet = null;
        for (int i = 0; i <= 64; i++) {
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            String mo23544 = m39866.mo23544();
            if (hashSet != null && !hashSet.add(mo23544)) {
                throw new IOException("Symbolic link cycle in hex target");
            }
            if (!z) {
                mo27935 = m39866.mo27935();
            } else if (m39866 instanceof C11293) {
                C17642 m27928 = ((C11293) m39866).m27928();
                if (m27928.m41288() != 'l') {
                    mo27935 = null;
                } else {
                    mo27935 = m27928.m41285();
                    if (mo27935 == null) {
                        throw new IOException("Hex target link metadata is unavailable");
                    }
                }
            } else {
                mo27935 = m39866.mo27935();
            }
            if (mo27935 == null) {
                return new C1162(m39866, mo23544);
            }
            if (hashSet == null) {
                hashSet = new HashSet();
                hashSet.add(mo23544);
            }
            if (i == 64) {
                throw new IOException("Too many symbolic links in hex target");
            }
            if (mo27935.startsWith("/")) {
                str = mo27935;
            } else {
                AbstractC15440 m36536 = m39866.m36536();
                while (true) {
                    if (m36536 != null) {
                        if (!mo27935.isEmpty() && !mo27935.equals(".")) {
                            if (mo27935.equals("..")) {
                                str = m36536.getParent();
                                break;
                            }
                            if (mo27935.startsWith("./")) {
                                mo27935 = mo27935.substring(2);
                            } else if (mo27935.startsWith("../")) {
                                mo27935 = mo27935.substring(3);
                                m36536 = m36536.m36536();
                            } else {
                                str = m36536.m36526(mo27935).mo23554();
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        str = m39866.mo23554();
                        break;
                    }
                }
                str = m36536.mo23554();
            }
            if (str == null) {
                throw new C5519();
            }
        }
        throw new IOException("Too many symbolic links in hex target");
    }

    public C8218(String str, C1162 c1162, C1785 c1785) {
        this.f25317 = str;
        this.f25319 = c1162.f4200;
        AbstractC15440 abstractC15440 = c1162.f4199;
        this.f25318 = abstractC15440;
        this.f25321 = c1785;
        this.f25320 = abstractC15440.m36507();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8218 m21766(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (abstractC15440.m36507()) {
            return m21764(abstractC15440);
        }
        return m21763(abstractC15440.mo23554(), (String) null, (C1785) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21765(AbstractC15440 abstractC15440, String str, C1785 c1785) {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (abstractC15440.m36507()) {
            return m21764(abstractC15440);
        }
        return m21763(abstractC15440.mo23554(), str, c1785);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8218 m21767(AbstractC15440 abstractC15440, String str, C1785 c1785) {
        C11003.requireNonNull(abstractC15440, "openedFile");
        if (!abstractC15440.m36507()) {
            try {
                return new C8218(abstractC15440.mo23554(), new C1162(C16999.m39866(str, new String[0]), str), c1785);
            } catch (RuntimeException e) {
                throw new IOException("Unable to restore deferred hex target", e);
            }
        }
        return m21764(abstractC15440);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21768() {
        return this.f25317;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21771() {
        return this.f25319;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m21769() {
        return this.f25318;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1785 m21773() {
        return this.f25321;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21770() {
        C1785 c1785 = this.f25321;
        if (this.f25320) {
            return;
        }
        try {
            C1162 m21761 = m21761(this.f25317, true);
            if (!this.f25319.equals(m21761.f4200)) {
                throw new C5519();
            }
            if (!c1785.equals(m21762(m21761.f4199, c1785))) {
                throw new C5519();
            }
        } catch (C5519 e) {
            throw e;
        } catch (IOException e2) {
            throw new IOException("Unable to validate hex target", e2);
        } catch (RuntimeException e3) {
            throw new IOException("Unable to validate hex target", e3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21764(AbstractC15440 abstractC15440) {
        return new C8218(abstractC15440.mo23554(), new C1162(abstractC15440, abstractC15440.mo23544()), f25316);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8218 m21763(String str, String str2, C1785 c1785) {
        C1162 m21761 = m21761(str, false);
        String str3 = m21761.f4200;
        AbstractC15440 abstractC15440 = m21761.f4199;
        if (abstractC15440.m36507()) {
            return new C8218(str, m21761, f25316);
        }
        if (str2 != null && !str2.equals(str3)) {
            throw new C5519();
        }
        if (!abstractC15440.mo27911() || !abstractC15440.mo23119()) {
            throw new IOException("File can not be read");
        }
        long mo23127 = abstractC15440.mo23127();
        if (mo23127 < 0) {
            throw new IOException("Hex target length is unavailable");
        }
        C1785 c17852 = new C1785(mo23127, abstractC15440.mo23117());
        if (c1785 != null && !c1785.equals(c17852)) {
            throw new C5519();
        }
        C1162 m217612 = m21761(str, false);
        if (str3.equals(m217612.f4200)) {
            AbstractC15440 abstractC154402 = m217612.f4199;
            if (abstractC154402.mo27911() && abstractC154402.mo23119() && abstractC154402.mo23127() == c17852.m5940() && abstractC154402.mo23117() == c17852.m5938()) {
                return new C8218(str, m217612, c17852);
            }
        }
        throw new C5519();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1785 m21762(AbstractC15440 abstractC15440, C1785 c1785) {
        if (!(abstractC15440 instanceof C11293)) {
            if (!abstractC15440.mo27911() || !abstractC15440.mo23119()) {
                throw new IOException("Hex target metadata is unavailable");
            }
            long mo23127 = abstractC15440.mo23127();
            long mo23117 = abstractC15440.mo23117();
            if (mo23127 < 0 || ((mo23127 == 0 && c1785.m5940() != 0) || (mo23117 == 0 && c1785.m5938() != 0))) {
                throw new IOException("Hex target metadata is unavailable");
            }
            return new C1785(mo23127, mo23117);
        }
        C17642 m27928 = ((C11293) abstractC15440).m27928();
        if (m27928.m41288() != '-' || m27928.m41290() < 0) {
            throw new IOException("Hex target metadata is unavailable");
        }
        return new C1785(m27928.m41290(), m27928.m41284());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8218 m21772() {
        if (this.f25320) {
            return this;
        }
        return m21763(this.f25317, this.f25319, (C1785) null);
    }
}
