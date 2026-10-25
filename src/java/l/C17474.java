package l;

import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;

/* compiled from: 35OM */
/* renamed from: l.ܿܽܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17474 extends AbstractC3179 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f53393;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f53394;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f53395;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile Throwable f53396;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C20736 f53397;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f53398;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f53399;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C4507 f53400;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public volatile C20736 f53401;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f53402;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f53403;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f53404;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C20736 f53405;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public volatile RunnableC11125 f53406;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C20736 f53407;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40856(boolean z, char c) {
        if ((c >= 11904 && c <= 12287) || c == 12288 || c == 12290) {
            return true;
        }
        if (c >= 12352 && c <= 12447) {
            if (z) {
                return true;
            }
            if (c == 12353 || c == 12355 || c == 12357 || c == 12359 || c == 12361 || c == 12387 || c == 12419 || c == 12421 || c == 12423 || c == 12430 || c == 12437 || c == 12438) {
                return false;
            }
            switch (c) {
                case 12443:
                case 12444:
                case 12445:
                case 12446:
                    return false;
                default:
                    return true;
            }
        }
        if (c < 12448 || c > 12543) {
            if (c >= 13312 && c <= 19893) {
                return true;
            }
            if (c >= 19968 && c <= 40891) {
                return true;
            }
            if (c >= 63744 && c <= 64217) {
                return true;
            }
            if (c >= 40960 && c <= 42127) {
                return true;
            }
            if (c >= 42128 && c <= 42191) {
                return true;
            }
            if (c < 65122 || c > 65126) {
                return c >= 65280 && c <= 65519;
            }
            return true;
        }
        if (z) {
            return true;
        }
        if (c == 12448 || c == 12449 || c == 12451 || c == 12453 || c == 12455 || c == 12457 || c == 12483 || c == 12515 || c == 12517 || c == 12519 || c == 12526 || c == 12533 || c == 12534) {
            return false;
        }
        switch (c) {
            case 12539:
            case 12540:
            case 12541:
            case 12542:
                return false;
            default:
                return true;
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final synchronized int mo8153(C4590 c4590) {
        return m40863(c4590.m13502(), c4590.m13499());
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final boolean mo8160() {
        return false;
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ */
    public final synchronized long mo9778(int i, int i2) {
        if (this.f53406 == null && !this.f10016 && this.f9998 == this.f53397) {
            return super.mo9778(i, i2);
        }
        if (this.f53406 == null) {
            if (!this.f10021.m30432(this)) {
                return 0L;
            }
            i2 = m40863(i, i2);
        }
        if (!(i2 > 0 && m40863(i, i2) == i2)) {
            return 0L;
        }
        double d = i;
        int min = Math.min(this.f9998.m47364(), Math.max(0, ((int) (d / this.f10037.m24484())) - 200));
        return (r2.get(Math.min(r2.m47364(), ((int) ((d + i2) / this.f10037.m24484())) + 200)).m28750() & 4294967295L) | (r2.get(min).f35062 << 32);
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ */
    public final synchronized boolean mo9780(int i) {
        return super.mo9780(i);
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ */
    public final synchronized boolean mo8167(C4590 c4590) {
        boolean z;
        int m13502 = c4590.m13502();
        int m13499 = c4590.m13499();
        if (m13499 > 0) {
            z = m40863(m13502, m13499) == m13499;
        }
        return z;
    }

    @Override // l.AbstractC3179
    /* renamed from: ܶ */
    public final synchronized void mo9784() {
        if (m9757()) {
            this.f10033.m48861(this, this.f10015, this.f53397, this.f10037.m24485());
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ܽ */
    public final synchronized long mo9787(int i, int i2) {
        if (this.f53406 == null && !this.f10016 && this.f9998 == this.f53397) {
            return super.mo9787(i, i2);
        }
        if (this.f53406 == null) {
            if (!this.f10021.m30432(this)) {
                return -1L;
            }
            i2 = m40863(i, i2);
        }
        if (!(i2 > 0 && m40863(i, i2) == i2)) {
            return -1L;
        }
        int min = Math.min(this.f9998.m47364(), Math.max(0, (int) (i / this.f10037.m24484())));
        return (r2.get(Math.min(r2.m47364(), (int) ((r4 + i2) / this.f10037.m24484()))).m28750() & 4294967295L) | (r2.get(min).f35062 << 32);
    }

    @Override // l.AbstractC3179
    /* renamed from: ܿ */
    public final synchronized boolean mo9791(int i, int i2) {
        if (!this.f10016 && this.f9998 == this.f53397) {
            super.mo9791(i, i2);
            return true;
        }
        return false;
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩷ */
    public final byte mo8172() {
        return (byte) 1;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m40870() {
        return !this.f53395 && this.f9998 == this.f53397;
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z, int i, C3096 c3096, C8865 c8865, C7744 c7744) {
        super(c12392, c22686);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        try {
            this.f53394 = z;
            m9788();
            this.f53398 = c12392.m30394();
            m9767(interfaceC7785);
            this.f53400 = c3096.m9446(this, c8865);
            this.f53397 = this.f9998;
            this.f10000 = m40873();
            if ((this.f53398 - mo8169()) - mo8162() != ((C17474) c3096.f9680).f53399) {
                this.f53400 = null;
            }
            m40862(false);
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z) {
        this(c12392, interfaceC7785, c22686, z, -1, null);
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, boolean z, int i, C7744 c7744) {
        super(c12392, c22686);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f10014 = i;
        if (c7744 != null) {
            m9768(interfaceC7785, c7744.m20762());
        }
        this.f53394 = z;
        this.f53398 = c12392.m30394();
        mo8166(interfaceC7785);
    }

    public C17474(C12392 c12392, InterfaceC7785 interfaceC7785, C22686 c22686, C12951 c12951) {
        super(c12392, interfaceC7785, c22686, c12951);
        this.f53404 = new ReentrantLock();
        this.f53403 = new AtomicInteger(0);
        this.f53395 = false;
        this.f53402 = new AtomicInteger();
        this.f53407 = new C20736();
        this.f53405 = new C20736();
        this.f53398 = c12951.readInt();
        this.f53399 = c12951.readInt();
        this.f53394 = c12951.m31498();
        m9788();
        this.f53397 = this.f9998;
        m9767(interfaceC7785);
        m9773();
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final void mo8158(String str) {
        super.mo8158(str);
        m40858();
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ */
    public final void mo8166(InterfaceC7785 interfaceC7785) {
        try {
            m40866(interfaceC7785);
        } finally {
            if (!this.f10016) {
                m9773();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m40866(InterfaceC7785 interfaceC7785) {
        m9788();
        this.f53400 = null;
        this.f53403.incrementAndGet();
        mo8165();
        try {
            this.f53404.lock();
            this.f10026 = false;
            m9767(interfaceC7785);
            C20736 c20736 = this.f9998.isEmpty() ? this.f9998 : new C20736();
            C21625 c21625 = this.f10033.isEmpty() ? this.f10033 : new C21625();
            c21625.clear();
            C7744 m9797 = m9797();
            try {
                int m24485 = this.f10037.m24485();
                C23266 m9764 = m9764(m9797, 0, m9797.length());
                try {
                    C11747 c11747 = new C11747();
                    boolean z = true;
                    boolean z2 = true;
                    int i = 0;
                    int i2 = 0;
                    while (z2) {
                        if (this.f10026) {
                            c20736.clear();
                            c21625.clear();
                            m9764.close();
                            m9797.close();
                            return;
                        }
                        c21625.add(C19509.m44924(this, m9797, i, m24485));
                        int m51584 = m9764.m51584();
                        if (m51584 == -1) {
                            m51584 = m9797.length();
                            z2 = false;
                        }
                        c11747.m28751(i, m51584, i2);
                        c20736.m47353(c11747);
                        i = m51584 + 1;
                        i2++;
                    }
                    m9764.close();
                    c21625.m48865();
                    m9797.close();
                    this.f9998 = c20736;
                    this.f10033 = c21625;
                    this.f53404.unlock();
                    synchronized (this.f53403) {
                        this.f53397 = this.f9998;
                        this.f53403.incrementAndGet();
                        this.f10000 = m40873();
                        int m30394 = this.f10021.m30394();
                        boolean z3 = m30394 > 0 && m30394 != this.f53398;
                        if (z3) {
                            this.f53398 = m30394;
                        }
                        if ((this.f53398 - mo8169()) - mo8162() > 0) {
                            z = false;
                        }
                        this.f53395 = z;
                        if (!z) {
                            m40862(false);
                            if (z3) {
                                m40858();
                            }
                        }
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            this.f53404.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40869(boolean z) {
        this.f53394 = z;
        this.f53399 = 0;
        m40862(false);
        m40858();
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40872() {
        return this.f53394;
    }

    @Override // l.AbstractC3179
    /* renamed from: ܳ */
    public final void mo9783(int i) {
        synchronized (this.f53403) {
            if (i > 0) {
                if ((this.f53398 != i || this.f53395) && m9757()) {
                    this.f53398 = i;
                    if ((i - mo8169()) - mo8162() <= 0) {
                        this.f53395 = true;
                        return;
                    }
                    if (this.f53397.m47363()) {
                        this.f53395 = false;
                        return;
                    }
                    if (this.f53406 != null) {
                        m40857();
                    } else if (this.f53395) {
                        this.f53395 = false;
                        m40862(false);
                    } else {
                        m40862(true);
                    }
                    m40858();
                    this.f10021.postInvalidate();
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m40874(int i) {
        int i2;
        return !this.f53395 && (i2 = this.f53398) == i && (i2 - mo8169()) - mo8162() > 0;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m40858() {
        int mo8169;
        if (this.f10020.isEmpty() || (mo8169 = (this.f53398 - mo8169()) - mo8162()) <= 0) {
            return;
        }
        this.f10020.size();
        C20736 c20736 = new C20736(0);
        this.f10026 = false;
        String str = this.f10006;
        C20736 c207362 = this.f10020;
        int size = c207362.size();
        C22686 c22686 = this.f10037;
        m40844((CharSequence) str, c207362, c20736, size, mo8169, true, new C18180(c22686, this.f53394, c22686.m50687(), mo9758(), this.f53394), new BooleanSupplier() { // from class: l.۫ۧܿ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C17474.this.f10026;
            }
        }, (C16768) null, false);
        this.f10020 = c20736;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m40863(int i, int i2) {
        if (i < 0 || i2 <= 0 || this.f10019 || this.f53396 != null || this.f9998.isEmpty()) {
            return 0;
        }
        if (this.f9998 == this.f53397 && (!this.f10016 || this.f53401 != null)) {
            return i2;
        }
        if (this.f9998 != this.f53401) {
            return 0;
        }
        return (int) Math.max(0.0d, Math.min(i2, (Math.ceil(this.f10037.m24484() * (this.f9998.size() - 1)) - 1.0d) - i));
    }

    @Override // l.AbstractC3179
    /* renamed from: ۤ */
    public final int mo8164() {
        return this.f53402.get();
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩶ */
    public final Throwable mo8171() {
        return this.f53396;
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m40873() {
        C20736 c20736 = this.f53397;
        return m9761((c20736 == null || c20736.isEmpty() || this.f9998.isEmpty()) ? 0 : this.f53397.m47368().f35064 - this.f9998.m47368().f35064);
    }

    @Override // l.AbstractC3179
    /* renamed from: ۖ */
    public final boolean mo9770() {
        return this.f53406 != null || this.f10016;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40871() {
        RunnableC11125 runnableC11125 = this.f53406;
        this.f53406 = null;
        if (runnableC11125 != null) {
            runnableC11125.f33395 = true;
            this.f9998 = this.f53397;
            this.f53401 = null;
        }
    }

    @Override // l.AbstractC3179
    /* renamed from: ۧ */
    public final void mo8165() {
        m40871();
        if (this.f10016) {
            this.f10019 = true;
            while (this.f10016) {
                SystemClock.sleep(100L);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40862(boolean z) {
        if (m9757() || m9776()) {
            InterfaceC7785 interfaceC7785 = this.f10015;
            boolean mo1605 = interfaceC7785.mo1605();
            int i = this.f53403.get();
            interfaceC7785.setReadOnly(true);
            synchronized (this) {
                if (this.f10015 == interfaceC7785 && i == this.f53403.get()) {
                    m40853(z, interfaceC7785, i, mo1605);
                    return;
                }
                interfaceC7785.setReadOnly(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public void m40857() {
        C18180 c18180;
        C9584 c9584;
        this.f10000 = m40873();
        int mo8169 = (this.f53398 - mo8169()) - mo8162();
        if (mo8169 <= 0) {
            this.f53395 = true;
            return;
        }
        int m9759 = m9759(this.f10021.m30408() + 1);
        int m47355 = this.f9998.m47355(m9759);
        synchronized (this.f10037) {
            c18180 = new C18180(this.f10037.m24488(), this.f53394, this.f10037.m50687(), mo9758(), this.f53394);
        }
        float m30408 = this.f10021.m30408();
        c9584 = c18180.f56559;
        int m24484 = (int) (m30408 - (c9584.m24484() * m9759));
        RunnableC11125 runnableC11125 = this.f53406;
        if (runnableC11125 != null) {
            runnableC11125.f33395 = true;
        }
        this.f53402.incrementAndGet();
        if (this.f10016) {
            this.f10019 = true;
        }
        RunnableC11125 runnableC111252 = new RunnableC11125(this, mo8169, c18180, m47355, m24484);
        this.f53406 = runnableC111252;
        this.f53396 = null;
        this.f53395 = false;
        runnableC111252.f33384.setReadOnly(true);
        C12392 c12392 = this.f10021;
        c12392.getClass();
        int i = 0;
        C4925.m14315(new RunnableC7412(i, c12392));
        runnableC111252.f33394 = new RunnableC1644(i, c12392);
        try {
            C1802.f6208.execute(runnableC111252);
        } catch (Error | RuntimeException e) {
            runnableC111252.f33384.setReadOnly(false);
            runnableC111252.f33394.run();
            this.f53406 = null;
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0192, code lost:
    
        r1 = java.lang.Math.min(r9.size(), l.C6891.f21286 + r2);
        r2 = l.C6891.m18662(new l.C3199(r28), r9.subList(r2, r1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        r7.m47354(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b4, code lost:
    
        r2 = r1;
        r1 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ac, code lost:
    
        m40846(r30, (java.lang.Runnable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01be, code lost:
    
        if (r7 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ea, code lost:
    
        m40846(r30, (java.lang.Runnable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c4, code lost:
    
        if (r12.getAsBoolean() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
    
        r3 = r9.subList(r2, r9.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d4, code lost:
    
        if (r3.isEmpty() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d6, code lost:
    
        r28.f53397 = r7;
        r28.f9998 = r7;
        r28.f53399 = r10;
        m40845(r30, r24, r0, r25, r7, r11, r6, r8);
        r1 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f9, code lost:
    
        if (r32 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fb, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ff, code lost:
    
        m40842(r1, r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0202, code lost:
    
        m40846(r30, (java.lang.Runnable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0206, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fd, code lost:
    
        r2 = l.C6891.f21286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021c, code lost:
    
        m40842(r9.size(), l.C6891.f21286, r7);
        r28.f10016 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0228, code lost:
    
        r28.f53401 = r7;
        r28.f9998 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0232, code lost:
    
        if (r3.size() <= 200) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0234, code lost:
    
        r1 = r28.f10021;
        r1.getClass();
        l.C4925.m14315(new l.RunnableC7412(0, r1));
        r2 = new l.RunnableC1644(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0252, code lost:
    
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0254, code lost:
    
        r28.f10021.m30366();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x025d, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0284, code lost:
    
        l.C1802.f6208.execute(new l.RunnableC13076(r28, r3, r12, r7, r10, r30, r24, r0, r25, r11, r6, r8, r16, r9, r27, r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029e, code lost:
    
        m40845(r30, r24, r0, r25, r7, r11, r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a9, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        r3 = r28;
        r4 = r30;
        r7 = r1;
        r8 = r21;
        r13 = r27;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a3, code lost:
    
        r8 = r21;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c1, code lost:
    
        r1 = true;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ad, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b9, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02b2, code lost:
    
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02c0, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b7, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02af, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b0, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0251, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x024d, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ca, code lost:
    
        r1 = false;
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0249, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02bd, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e3, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0301, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x031c, code lost:
    
        r8 = null;
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02db, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02ff, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0318, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x018e, code lost:
    
        r18 = r1;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x020e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0207, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0159, code lost:
    
        r3 = r3.m13502() + r3.m13499();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0137, code lost:
    
        r3 = l.C6891.m18662(new l.C3199(r28), r9.subList(0, r2), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00fe, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02fa, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02f4, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0323, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0328, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x032b, code lost:
    
        r3.m40846(r4, (java.lang.Runnable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x032f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0333, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0334, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0346, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0330, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0331, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x033d, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0303, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0304, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x030a, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x030e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0310, code lost:
    
        r0.addSuppressed(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0313, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0316, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0314, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x033f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0340, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
        r1 = null;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0336, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0337, code lost:
    
        r27 = r13;
        r3 = r28;
        r4 = r30;
        r1 = null;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r2 = r3.f56559;
        r8 = r2.m24484();
        r6 = (int) (r28.f10021.m30408() - (r1 * r8));
        r1 = m9797();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r2 = l.C9008.m23251(r1, r13, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r1.close();
        r9 = new java.util.ArrayList(r2.size());
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r1.hasNext() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        r20 = (l.C21003) r1.next();
        r9.add(new l.C4610(r13, r20, r10, r3, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020f, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0210, code lost:
    
        r1 = false;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x039a, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x039d, code lost:
    
        if (r1 == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x039f, code lost:
    
        r3.f9998 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03a1, code lost:
    
        r3.m40846(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0208, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0209, code lost:
    
        r1 = false;
        r3 = r28;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        r1 = r28.f10014;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        if (r1 < 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ff, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        if (r3 >= r2.size()) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0110, code lost:
    
        if (((l.C21003) r2.get(r3)).m47821() >= r1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0112, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        r2 = java.lang.Math.min(r9.size(), java.lang.Math.max(l.C6891.f21286, r3 + 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        if (r32 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0127, code lost:
    
        r2 = r9.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012b, code lost:
    
        if (r32 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        r3 = l.C6891.m18663(new l.C3199(r28), r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
    
        if (r28.f10021.m30422(r30) != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014d, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        if (r7 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        if (r2 >= r9.size()) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016c, code lost:
    
        if (r12.getAsBoolean() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0172, code lost:
    
        if (m40855(r7, r1, r8) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0176, code lost:
    
        if (r28.f10014 >= 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0178, code lost:
    
        r18 = r1;
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018b, code lost:
    
        if (r3 < ((r7.size() - 1) * r8)) goto L275;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x038a A[Catch: all -> 0x03a5, TryCatch #3 {all -> 0x03a5, blocks: (B:44:0x0386, B:46:0x038a, B:49:0x0395, B:50:0x039a), top: B:43:0x0386 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a8  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40853(boolean r29, final l.InterfaceC7785 r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17474.m40853(boolean, l.۟᩺ᩳ, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m40854(C17474 c17474, int i, int i2, InterfaceC7785 interfaceC7785, int i3) {
        return (!c17474.f10026 && !c17474.f10019 && i == c17474.f53403.get() && i2 == c17474.f53402.get() && c17474.f10015 == interfaceC7785 && c17474.m9781() == i3) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #5 {all -> 0x006a, blocks: (B:3:0x0009, B:6:0x0012, B:8:0x0018, B:10:0x001e, B:20:0x0072, B:22:0x0078), top: B:2:0x0009 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m40850(l.C17474 r16, java.util.List r17, l.C20133 r18, l.C20736 r19, int r20, l.InterfaceC7785 r21, int r22, int r23, int r24, int r25, int r26, float r27, java.util.ArrayList r28, l.C20736 r29, java.lang.Runnable r30) {
        /*
            r10 = r16
            r11 = r21
            r12 = r29
            r13 = r30
            r1 = 0
            l.ۗۧܿ r0 = new l.ۗۧܿ     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Exception -> L70
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L6a java.lang.Error -> L6c java.lang.Exception -> L70
            r2 = r17
            r14 = r18
            l.᩷۟ᩳ r0 = l.C6891.m18662(r0, r2, r14)     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            if (r0 == 0) goto L58
            boolean r2 = r18.getAsBoolean()     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            if (r2 != 0) goto L58
            l.᩷۟ᩳ r15 = new l.᩷۟ᩳ     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r2 = r19
            r15.<init>(r2)     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r15.m47354(r0)     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r10.f53397 = r15     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r10.f9998 = r15     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r0 = r20
            r10.f53399 = r0     // Catch: java.lang.Error -> L66 java.lang.Exception -> L68 java.lang.Throwable -> L6a
            r1 = r16
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r15
            r7 = r25
            r8 = r26
            r9 = r27
            r1.m40845(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4e java.lang.Error -> L50 java.lang.Exception -> L52
            int r0 = r28.size()     // Catch: java.lang.Throwable -> L4e java.lang.Error -> L50 java.lang.Exception -> L52
            int r1 = l.C6891.f21286     // Catch: java.lang.Throwable -> L4e java.lang.Error -> L50 java.lang.Exception -> L52
            r10.m40842(r0, r1, r15)     // Catch: java.lang.Throwable -> L4e java.lang.Error -> L50 java.lang.Exception -> L52
            goto L62
        L4e:
            r0 = move-exception
            goto L54
        L50:
            r0 = move-exception
            goto L56
        L52:
            r0 = move-exception
            goto L56
        L54:
            r1 = 1
            goto L8a
        L56:
            r1 = 1
            goto L72
        L58:
            l.۫ۨᩳ r0 = r10.f10021
            boolean r0 = r0.m30490(r10)
            if (r0 != 0) goto L62
            r10.f9998 = r12
        L62:
            r10.m40846(r11, r13)
            return
        L66:
            r0 = move-exception
            goto L72
        L68:
            r0 = move-exception
            goto L72
        L6a:
            r0 = move-exception
            goto L8a
        L6c:
            r0 = move-exception
        L6d:
            r14 = r18
            goto L72
        L70:
            r0 = move-exception
            goto L6d
        L72:
            boolean r2 = r18.getAsBoolean()     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L7a
            r10.f53396 = r0     // Catch: java.lang.Throwable -> L6a
        L7a:
            if (r1 != 0) goto L86
            l.۫ۨᩳ r0 = r10.f10021
            boolean r0 = r0.m30490(r10)
            if (r0 != 0) goto L86
            r10.f9998 = r12
        L86:
            r10.m40846(r11, r13)
            return
        L8a:
            if (r1 != 0) goto L96
            l.۫ۨᩳ r1 = r10.f10021
            boolean r1 = r1.m30490(r10)
            if (r1 != 0) goto L96
            r10.f9998 = r12
        L96:
            r10.m40846(r11, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17474.m40850(l.ܿܽܿ, java.util.List, l.᩶ۧܿ, l.᩷۟ᩳ, int, l.۟᩺ᩳ, int, int, int, int, int, float, java.util.ArrayList, l.᩷۟ᩳ, java.lang.Runnable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40842(int i, int i2, C20736 c20736) {
        SystemClock.elapsedRealtime();
        c20736.size();
        Math.min(i2, i);
        Integer.toHexString(System.identityHashCode(this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20736 m40837(CharSequence charSequence, C20736 c20736, C21003 c21003, int i, C18180 c18180, BooleanSupplier booleanSupplier) {
        int i2;
        C9714 c9714;
        C20736 c207362 = new C20736();
        List m47822 = c21003.m47822();
        C13862 m47359 = c20736.m47359();
        C11747 c11747 = new C11747();
        int i3 = 0;
        while (i3 < m47822.size() && !booleanSupplier.getAsBoolean()) {
            C9714 c97142 = (C9714) m47822.get(i3);
            if (c97142.m24699()) {
                if (c20736.m47355(c97142.m24700()) >= c97142.m24698() && c20736.m47358(c97142.m24701() - 1) <= c97142.m24696()) {
                    c207362.m47351(c97142.m24700(), c97142.m24701(), c20736);
                } else {
                    for (int m24700 = c97142.m24700(); m24700 < c97142.m24701(); m24700++) {
                        C11747 m33216 = m47359.m33216(m24700);
                        if (m33216.f35062 < c97142.m24698() || m33216.f35063 > c97142.m24696()) {
                            m33216.m28751(Math.max(m33216.f35062, c97142.m24698()), Math.min(m33216.f35063, c97142.m24696()), m33216.f35064);
                            m33216.m28753(false);
                        }
                        c207362.m47353(m33216);
                    }
                }
                i3++;
            } else {
                C20736 c207363 = new C20736();
                while (true) {
                    i2 = i3 + 1;
                    c9714 = (C9714) m47822.get(i3);
                    int m247002 = c9714.m24700();
                    while (m247002 < c9714.m24701()) {
                        int min = Math.min(c9714.m24701(), c20736.m47365(m247002) + 1);
                        c11747.m28751(Math.max(c20736.m47355(m247002), c9714.m24698()), Math.min(c20736.m47358(min - 1), c9714.m24696()), c20736.m47357(m247002));
                        c207363.m47353(c11747);
                        m247002 = min;
                    }
                    if (i2 >= m47822.size() || ((C9714) m47822.get(i2)).m24699()) {
                        break;
                    }
                    i3 = i2;
                }
                m40844(charSequence, c207363, c207362, c207363.size(), i, c97142.m24697(), c18180, booleanSupplier, (C16768) null, !c9714.m24702());
                i3 = i2;
            }
        }
        return c207362;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40855(C20736 c20736, int i, float f) {
        if (!c20736.isEmpty() && c20736.m47368().f35063 >= i) {
            int size = c20736.size() - 1;
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (c20736.m47358(i3) <= i) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            if (((c20736.size() - i2) - 1) * f > this.f10021.m30542()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40846(InterfaceC7785 interfaceC7785, Runnable runnable) {
        try {
            m9773();
            interfaceC7785.setReadOnly(false);
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                }
            }
            this.f10021.postInvalidate();
        } catch (Throwable th) {
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                }
            }
            this.f10021.postInvalidate();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40845(final InterfaceC7785 interfaceC7785, final int i, final int i2, final int i3, final C20736 c20736, int i4, final int i5, final float f) {
        if (this.f10014 >= 0) {
            return;
        }
        final int m40859 = m40859(c20736, i4);
        this.f10021.post(new Runnable() { // from class: l.ۛۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C17474.m40851(C17474.this, interfaceC7785, i, i2, c20736, i3, f, m40859, i5);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40851(C17474 c17474, InterfaceC7785 interfaceC7785, int i, int i2, C20736 c20736, int i3, float f, int i4, int i5) {
        C12392 c12392 = c17474.f10021;
        if (c12392.f37258 == c17474 && c17474.f10015 == interfaceC7785 && interfaceC7785.mo26548() == i && c17474.m9781() == i && c17474.f53402.get() == i2 && c17474.f9998 == c20736 && !c12392.m30354(c17474) && c12392.m30396() == i3) {
            c12392.m30364(c12392.m30521(((int) (f * i4)) + i5));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40859(C20736 c20736, int i) {
        int size = c20736.size() - 1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) >>> 1;
            if (c20736.m47355(i3) >= i || c20736.m47358(i3) > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40844(CharSequence charSequence, C20736 c20736, C20736 c207362, int i, int i2, boolean z, C18180 c18180, BooleanSupplier booleanSupplier, C16768 c16768, boolean z2) {
        c207362.getClass();
        C6624 c6624 = new C6624(c207362);
        try {
            m40843(charSequence, c20736, c6624, i, i2, z, c18180, booleanSupplier, c16768, z2);
            c6624.close();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x02db, code lost:
    
        r15 = r2;
        r24 = r5;
        r26 = r6;
        r19 = r7;
        r21 = r10;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02e5, code lost:
    
        if (r1 != r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02e9, code lost:
    
        if (r36 != r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02f8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02f8, code lost:
    
        r1 = r32;
        r3 = r34;
        r8 = r10;
        r12 = r13;
        r2 = r15;
        r11 = r16;
        r7 = r19;
        r10 = r21;
        r5 = r24;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x02ef, code lost:
    
        if (r38.getAsBoolean() == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02f2, code lost:
    
        r10.m28751(r1, r3, r14);
        r15.m18156(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01af  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m40843(java.lang.CharSequence r31, l.C20736 r32, l.C6624 r33, int r34, int r35, boolean r36, l.C18180 r37, java.util.function.BooleanSupplier r38, l.C16768 r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17474.m40843(java.lang.CharSequence, l.᩷۟ᩳ, l.ۜ۟ᩳ, int, int, boolean, l.ᩳܽܿ, java.util.function.BooleanSupplier, l.ܽܽܿ, boolean):void");
    }

    @Override // l.AbstractC3179
    /* renamed from: ֨ */
    public final boolean mo9758() {
        return !this.f10037.f73255;
    }

    @Override // l.AbstractC3179
    /* renamed from: ۚ */
    public final boolean mo9774() {
        return this.f53394;
    }

    @Override // l.AbstractC3179
    /* renamed from: ۢ */
    public final float mo8163() {
        return this.f53398;
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final synchronized void mo8155(int i, int i2, int i3) {
        m9785();
        if (mo9770()) {
            throw new IllegalStateException("Layout is still preparing");
        }
        m9767(this.f10015);
        if ((this.f53398 - mo8169()) - mo8162() <= 0) {
            mo8166(this.f10015);
            return;
        }
        try {
            C7744 m9797 = m9797();
            try {
                m40841(i, i2, i3, m9797);
                m9797.close();
            } finally {
            }
        } finally {
            m9773();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40841(int i, int i2, int i3, C7744 c7744) {
        int i4;
        int i5;
        int i6;
        C12392 c12392;
        C22686 c22686;
        C12392 c123922;
        int i7;
        int i8;
        int m9761;
        int i9 = i;
        C20736 c20736 = this.f53407;
        c20736.clear();
        int m9762 = m9762(i9, false);
        c20736.m47353(this.f9998.get(m9762));
        if (i2 > 0) {
            i6 = m9762(i9 + i2, false);
            c20736.m47351(m9762 + 1, i6 + 1, this.f9998);
            C11747 c11747 = c20736.get(0);
            C11747 m47368 = c20736.m47368();
            i4 = c20736.size();
            i5 = m47368.f35064 - c11747.f35064;
            int i10 = m47368.f35063 - i2;
            if (c20736.size() == 1) {
                m47368 = new C11747();
            }
            c11747.f35063 = i9;
            m47368.f35062 = i9;
            m47368.f35063 = i10;
            c20736.clear();
            c20736.m47353(c11747);
            c20736.m47353(m47368);
        } else {
            C11747 c117472 = c20736.get(0);
            C11747 c117473 = new C11747();
            c117473.f35062 = i9;
            c117473.f35063 = c117472.f35063;
            c117472.f35063 = i9;
            c20736.m47362(0, c117472);
            c20736.m47353(c117473);
            i4 = 1;
            i5 = 0;
            i6 = m9762;
        }
        if (i3 > 0) {
            int i11 = c20736.get(0).f35064;
            int i12 = i9 + i3;
            C11747 c117474 = new C11747();
            C23266 m9764 = m9764(c7744, i9, i12);
            boolean z = true;
            while (z) {
                try {
                    int m51584 = m9764.m51584();
                    if (m51584 == -1 || m51584 >= i12) {
                        z = false;
                        m51584 = i12;
                    }
                    c117474.m28751(i9, m51584, i11);
                    c20736.add(c20736.m47364(), c117474);
                    i9 = m51584 + 1;
                    i11++;
                } finally {
                }
            }
            m9764.close();
            c20736.m47350(c20736.m47364(), c20736.size(), i3, 0);
        }
        C11747 m473682 = c20736.m47368();
        m473682.f35064 = c20736.m47357(c20736.size() - 2);
        c20736.m47362(c20736.m47364(), m473682);
        int i13 = c20736.m47368().f35064 - c20736.get(0).f35064;
        for (int m47364 = c20736.m47364(); m47364 >= 0; m47364--) {
            if (c20736.m47355(m47364) == c20736.m47358(m47364) && (!c20736.m47369(m47364) || !c20736.m47356(m47364))) {
                c20736.m47349(m47364, m47364 + 1);
            }
        }
        int i14 = i3 - i2;
        int i15 = i13 - i5;
        int m47357 = this.f9998.m47357(m9762);
        int m47366 = this.f9998.m47366(m9762);
        if (i15 != 0) {
            if (i15 < 0) {
                this.f10033.m48859(m47357, m47357 - i15);
            } else {
                this.f10033.m48864(m47357, i15);
            }
        }
        C12392 c123923 = this.f10021;
        if (c123923.f37211) {
            this.f9998.m47361(m9762, i4, c20736);
            int size = m9762 + c20736.size();
            c20736.clear();
            C20736 c207362 = this.f9998;
            c207362.m47350(size, c207362.size(), i14, i15);
            return;
        }
        C22686 c226862 = this.f10037;
        if (!c226862.f73263 || (m9761 = m9761(i15)) == this.f10000) {
            if (m9762 > 0) {
                C11747 c117475 = this.f9998.get(m9762 - 1);
                if (c117475.f35064 == c20736.get(0).f35064) {
                    c20736.add(0, c117475);
                    m9762--;
                }
            }
            int m473572 = this.f9998.m47357(i6);
            int i16 = i6 + 1;
            int m47365 = (i16 >= this.f9998.size() || this.f9998.m47357(i16) != m473572) ? i16 : this.f9998.m47365(i16) + 1;
            if (i16 < m47365) {
                c12392 = c123923;
                c20736.m47353(new C11747(this.f9998.m47355(i16) + i14, this.f9998.m47358(m47365 - 1) + i14, m473572 + i15));
            } else {
                c12392 = c123923;
            }
            C20736 c207363 = this.f53405;
            c207363.clear();
            int mo8169 = (this.f53398 - mo8169()) - mo8162();
            this.f53399 = mo8169;
            boolean m47369 = this.f9998.m47369(m9762);
            C16768 c16768 = i16 < m47365 ? new C16768(this.f9998, i16, m47365, i14, i15) : null;
            int i17 = m47365;
            c22686 = c226862;
            c123922 = c12392;
            i7 = m47357;
            m40844((CharSequence) c7744, c20736, c207363, c20736.size(), mo8169, m47369, new C18180(c226862, this.f53394, c226862.m50687(), mo9758(), this.f53394), new BooleanSupplier() { // from class: l.ۤۧܿ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return C17474.this.f10026;
                }
            }, c16768, false);
            this.f9998.m47361(m9762, (c16768 == null ? i17 : c16768.f51487) - m9762, c207363);
            int size2 = c207363.size() + m9762;
            c20736.clear();
            c207363.clear();
            C20736 c207364 = this.f9998;
            c207364.m47350(size2, c207364.size(), i14, i15);
        } else {
            this.f9998.m47361(m9762, i4, c20736);
            int size3 = m9762 + c20736.size();
            c20736.clear();
            C20736 c207365 = this.f9998;
            c207365.m47350(size3, c207365.size(), i14, i15);
            this.f10000 = m9761;
            m40862(true);
            i7 = m47357;
            c22686 = c226862;
            c123922 = c123923;
        }
        int m24485 = c22686.m24485();
        int i18 = m47366;
        int i19 = 0;
        while (i19 <= i13) {
            int i20 = i7 + i19;
            int m47367 = this.f9998.m47367(i20, i18);
            this.f10033.m48860(i20, this, c7744, this.f9998.m47355(m47367), m24485);
            i19++;
            i18 = m47367;
        }
        int i21 = i7;
        int i22 = i21 + i13 + 1;
        C23803 c23803 = c123922.f37235.f21235;
        if (c23803.f77021) {
            int m9790 = m9790(c23803.f77020);
            int m97902 = m9790(c23803.f77019);
            C11747 c117476 = this.f9998.get(m9790);
            C11747 c117477 = this.f9998.get(m97902);
            int min = Math.min(i21, c117476.f35064);
            int max = Math.max(i22, c117477.f35064 + 1);
            int i23 = min;
            int i24 = i23;
            while (i24 < i21) {
                int m473672 = this.f9998.m47367(i24, i23);
                this.f10033.m48860(i24, this, c7744, this.f9998.m47355(m473672), m24485);
                i24++;
                i23 = m473672;
            }
            int max2 = Math.max(i23, i22);
            while (i22 < max) {
                int m473673 = this.f9998.m47367(i22, max2);
                this.f10033.m48860(i22, this, c7744, this.f9998.m47355(m473673), m24485);
                i22++;
                max2 = m473673;
            }
            i8 = min;
            i22 = max;
        } else {
            i8 = i21;
        }
        this.f10033.m48866(i8, i22);
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final void mo8154(float f) {
        if (this.f53406 != null) {
            this.f53406.f33389 = true;
            this.f53406.f33395 = true;
        }
        this.f10000 = m40873();
    }

    @Override // l.AbstractC3179
    /* renamed from: ᩸ */
    public final void mo8173() {
        this.f10000 = m40873();
        if (m9757() || m9776()) {
            if (this.f10021.f37258 == this && Looper.myLooper() == Looper.getMainLooper() && !this.f10015.mo1605() && (this.f53406 != null || m9782() > 100000)) {
                m40857();
            } else {
                m40862(false);
            }
        }
        m40858();
        this.f10021.invalidate();
        this.f10021.mo25906();
    }

    static {
        byte[] bArr = new byte[128];
        for (char c : " !?;,=|>\t".toCharArray()) {
            bArr[c] = 1;
        }
        for (char c2 : "+-*/.".toCharArray()) {
            bArr[c2] = 2;
        }
        f53393 = bArr;
    }

    @Override // l.AbstractC3179
    /* renamed from: ֫ */
    public final void mo8159(C10130 c10130) {
        ReentrantLock reentrantLock = this.f53404;
        try {
            reentrantLock.lock();
            super.mo8159(c10130);
            reentrantLock.unlock();
            c10130.writeInt(this.f53398);
            c10130.writeInt(this.f53399);
            c10130.m25425(this.f53394);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
