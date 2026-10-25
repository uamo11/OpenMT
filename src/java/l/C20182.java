package l;

import android.os.Looper;
import android.util.SparseArray;
import com.alipay.sdk.m.l.d;
import com.alipay.sdk.m.t0.b;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: G8QA */
/* renamed from: l.᩶۬֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20182 implements InterfaceC19477 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22072 f65310;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65311;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20369 f65312;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC1318 f65313;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22485 f65314;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22298 f65315;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19251 f65316;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f65317;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final SparseArray f65318;

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2506(C19664 c19664) {
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final void mo2515() {
    }

    public C20182(InterfaceC16427 interfaceC16427) {
        interfaceC16427.getClass();
        this.f65317 = interfaceC16427;
        String str = C3603.f11424;
        Looper myLooper = Looper.myLooper();
        this.f65310 = new C22072(myLooper == null ? Looper.getMainLooper() : myLooper, interfaceC16427, new C7416());
        C22485 c22485 = new C22485();
        this.f65314 = c22485;
        this.f65312 = new C20369();
        this.f65315 = new C22298(c22485);
        this.f65318 = new SparseArray();
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44883(C11715 c11715) {
        this.f65310.m49656(c11715);
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44880(InterfaceC1318 interfaceC1318, Looper looper) {
        boolean z;
        AbstractC14545 abstractC14545;
        if (this.f65313 != null) {
            abstractC14545 = this.f65315.f72306;
            if (!abstractC14545.isEmpty()) {
                z = false;
                C22632.m50634(z);
                interfaceC1318.getClass();
                this.f65313 = interfaceC1318;
                this.f65316 = this.f65317.mo33832(looper, null);
                this.f65310 = this.f65310.m49653(looper, new C17054(this, interfaceC1318));
            }
        }
        z = true;
        C22632.m50634(z);
        interfaceC1318.getClass();
        this.f65313 = interfaceC1318;
        this.f65316 = this.f65317.mo33832(looper, null);
        this.f65310 = this.f65310.m49653(looper, new C17054(this, interfaceC1318));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44869() {
        InterfaceC19251 interfaceC19251 = this.f65316;
        C22632.m50632(interfaceC19251);
        interfaceC19251.mo17760(new RunnableC20699(1, this));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44878(List list, C15894 c15894) {
        InterfaceC1318 interfaceC1318 = this.f65313;
        interfaceC1318.getClass();
        this.f65315.m50027(list, c15894, interfaceC1318);
    }

    @Override // l.InterfaceC19477
    /* renamed from: ܽ */
    public final void mo44891() {
        if (this.f65311) {
            return;
        }
        C0425 m46419 = m46419();
        this.f65311 = true;
        m46418(m46419, -1, new C20087(m46419));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44870(int i, int i2, boolean z) {
        C0425 m46415 = m46415();
        m46418(m46415, 1033, new C23202(m46415, i, i2, z));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44889(C3519 c3519) {
        m46418(m46415(), 1007, new C5127());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44887(String str, long j, long j2) {
        C0425 m46415 = m46415();
        m46418(m46415, 1008, new C16014(m46415, str, j2, j));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44882(C8353 c8353, C13396 c13396) {
        m46418(m46415(), 1009, new C21639());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44872(long j) {
        m46418(m46415(), d.a, new C15472());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44873(long j, int i, long j2) {
        m46418(m46415(), 1011, new C7416());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44886(String str) {
        m46418(m46415(), 1012, new ASN1BMPString$$ExternalSyntheticOutline0());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44875(Exception exc) {
        C0425 m46415 = m46415();
        m46418(m46415, 1014, new C3435(m46415, exc, 2));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ܽ */
    public final void mo44892(Exception exc) {
        m46418(m46415(), 1029, new C7166());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44879(C1111 c1111) {
        C0425 m46415 = m46415();
        m46418(m46415, 1031, new C3200(m46415, c1111, 6));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44888(C1111 c1111) {
        C0425 m46415 = m46415();
        m46418(m46415, 1032, new C19373(m46415, c1111, 5));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ܽ */
    public final void mo44893(C3519 c3519) {
        C0425 m46415 = m46415();
        m46418(m46415, 1015, new C20094(m46415, c3519));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44877(String str, long j, long j2) {
        m46418(m46415(), 1016, new C9045());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44890(C8353 c8353, C13396 c13396) {
        m46418(m46415(), 1017, new C19462());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44876(String str) {
        C0425 m46415 = m46415();
        m46418(m46415, 1019, new C19033(m46415, str));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44874(long j, Object obj) {
        C0425 m46415 = m46415();
        m46418(m46415, 26, new C2184(m46415, obj, j));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44885(Exception exc) {
        m46418(m46415(), 1030, new C18736());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2492(int i, int i2) {
        m46418(m46415(), 24, new C12354());
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫ */
    public final void mo21133(int i, C15894 c15894, C10957 c10957, C6723 c6723, int i2) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1000, new C18566(m46416, c10957, c6723, i2));
    }

    @Override // l.InterfaceC15188
    /* renamed from: ۧ */
    public final void mo21137(int i, C15894 c15894, C10957 c10957, C6723 c6723) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1001, new C12662(m46416, c10957, c6723));
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫ */
    public final void mo21132(int i, C15894 c15894, C10957 c10957, C6723 c6723) {
        m46418(m46416(i, c15894), b.c, new C9005());
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫ */
    public final void mo21134(int i, C15894 c15894, C10957 c10957, C6723 c6723, IOException iOException, boolean z) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, b.d, new C20407(m46416, c10957, c6723, iOException, z));
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫ */
    public final void mo21131(int i, C15894 c15894, C6723 c6723) {
        m46418(m46416(i, c15894), 1005, new C16701());
    }

    @Override // l.InterfaceC15188
    /* renamed from: ۧ */
    public final void mo21136(int i, C15894 c15894, final C6723 c6723) {
        final C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1004, new InterfaceC7961() { // from class: l.ܶ۬֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC1131) obj).mo3863(C0425.this, c6723);
            }
        });
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2498(AbstractC4846 abstractC4846, int i) {
        InterfaceC1318 interfaceC1318 = this.f65313;
        interfaceC1318.getClass();
        this.f65315.m50030(interfaceC1318);
        C0425 m46419 = m46419();
        m46418(m46419, 0, new C20087(m46419, i));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2500(C11197 c11197, int i) {
        m46418(m46419(), 1, new C23868());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2502(C14017 c14017) {
        C0425 m46419 = m46419();
        m46418(m46419, 2, new C19373(m46419, c14017, 4));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final void mo2517(boolean z) {
        m46418(m46419(), 3, new C7187());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2505(C18958 c18958) {
        C0425 m46419 = m46419();
        m46418(m46419, 13, new C17665(m46419, c18958));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final void mo2510(int i, boolean z) {
        C0425 m46419 = m46419();
        m46418(m46419, -1, new C8954(m46419, z, i));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ܽ */
    public final void mo2513(int i) {
        C0425 m46419 = m46419();
        m46418(m46419, 4, new C17665(m46419, i));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2494(int i, boolean z) {
        C0425 m46419 = m46419();
        m46418(m46419, 5, new C13325(m46419, z, i));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final void mo2509(int i) {
        C0425 m46419 = m46419();
        m46418(m46419, 6, new C18566(m46419, i));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final void mo2512(boolean z) {
        m46418(m46419(), 7, new C20382());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ᩳ */
    public final void mo2516(int i) {
        m46418(m46419(), 8, new C8083());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ܽ */
    public final void mo2514(boolean z) {
        m46418(m46419(), 9, new C4860());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2493(final int i, final C5552 c5552, final C5552 c55522) {
        if (i == 1) {
            this.f65311 = false;
        }
        InterfaceC1318 interfaceC1318 = this.f65313;
        interfaceC1318.getClass();
        this.f65315.m50028(interfaceC1318);
        final C0425 m46419 = m46419();
        m46418(m46419, 11, new InterfaceC7961(m46419, i, c5552, c55522) { // from class: l.۠۬֫

            /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f25190;

            {
                this.f25190 = i;
            }

            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
                interfaceC1131.getClass();
                interfaceC1131.mo3861(this.f25190);
            }
        });
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2496(C2730 c2730) {
        C0425 m46419 = m46419();
        m46418(m46419, 12, new C3200(m46419, c2730, 5));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2504(C17546 c17546) {
        m46418(m46419(), 14, new C12803());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2507(C23896 c23896) {
        C0425 m46419 = m46419();
        m46418(m46419, 28, new C3435(m46419, c23896, 1));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2495(List list) {
        C0425 m46419 = m46419();
        m46418(m46419, 27, new C17887(m46419, list));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2497(C4288 c4288) {
        C0425 m46419 = m46419();
        m46418(m46419, 27, new C4248(m46419, c4288));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2508(boolean z) {
        C0425 m46415 = m46415();
        m46418(m46415, 23, new C4153(m46415, z));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2491(int i) {
        m46418(m46415(), 21, new C13540());
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2499(C6404 c6404) {
        C0425 m46415 = m46415();
        m46418(m46415, 25, new C23674(m46415, c6404));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2501(C11902 c11902) {
        m46418(m46419(), 19, new C5368());
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫ */
    public final void mo21129(int i, C15894 c15894, int i2) {
        m46418(m46416(i, c15894), 1022, new C18515());
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫ */
    public final void mo21128(int i, C15894 c15894) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1023, new C23202(m46416));
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫ */
    public final void mo21130(int i, C15894 c15894, Exception exc) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1024, new C13325(m46416, exc));
    }

    @Override // l.InterfaceC21388
    /* renamed from: ۧ */
    public final void mo21135(int i, C15894 c15894) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1025, new C8954(m46416));
    }

    @Override // l.InterfaceC21388
    /* renamed from: ܽ */
    public final void mo21138(int i, C15894 c15894) {
        C0425 m46416 = m46416(i, c15894);
        m46418(m46416, 1027, new C11010(m46416));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46418(C0425 c0425, int i, InterfaceC7961 interfaceC7961) {
        this.f65318.put(i, c0425);
        this.f65310.m49659(i, interfaceC7961);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0425 m46419() {
        return m46412(this.f65315.m50026());
    }

    @RequiresNonNull({"player"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0425 m46417(AbstractC4846 abstractC4846, int i, C15894 c15894) {
        C15894 c158942 = abstractC4846.m14110() ? null : c15894;
        long mo33834 = this.f65317.mo33834();
        boolean z = abstractC4846.equals(this.f65313.mo4576()) && i == this.f65313.mo4579();
        long j = 0;
        if (c158942 == null || !c158942.m37669()) {
            if (z) {
                j = this.f65313.mo4594();
            } else if (!abstractC4846.m14110()) {
                j = C3603.m11037(abstractC4846.mo14103(i, this.f65312, 0L).f65749);
            }
        } else if (z && this.f65313.mo4606() == c158942.f49108 && this.f65313.mo4577() == c158942.f49109) {
            j = this.f65313.getCurrentPosition();
        }
        return new C0425(mo33834, abstractC4846, i, c158942, j, this.f65313.mo4576(), this.f65313.mo4579(), this.f65315.m50026(), this.f65313.getCurrentPosition(), this.f65313.mo4582());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46413(C20182 c20182) {
        C0425 m46419 = c20182.m46419();
        c20182.m46418(m46419, 1028, new C15942(m46419));
        c20182.f65310.m49658();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0425 m46412(C15894 c15894) {
        this.f65313.getClass();
        AbstractC4846 m50025 = c15894 == null ? null : this.f65315.m50025(c15894);
        if (c15894 == null || m50025 == null) {
            int mo4579 = this.f65313.mo4579();
            AbstractC4846 mo4576 = this.f65313.mo4576();
            if (mo4579 >= mo4576.mo14107()) {
                mo4576 = AbstractC4846.f15313;
            }
            return m46417(mo4576, mo4579, (C15894) null);
        }
        return m46417(m50025, m50025.mo14105(c15894.f49112, this.f65314).f72806, c15894);
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44871(int i, long j) {
        m46418(m46412(this.f65315.m50031()), 1021, new C20177());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ֫ */
    public final void mo44881(C3519 c3519) {
        C0425 m46412 = m46412(this.f65315.m50031());
        m46418(m46412, 1020, new C6290(m46412, c3519));
    }

    @Override // l.InterfaceC19477
    /* renamed from: ۧ */
    public final void mo44884(int i, long j) {
        m46418(m46412(this.f65315.m50031()), 1018, new C22870());
    }

    @Override // l.InterfaceC19477
    /* renamed from: ᩳ */
    public final void mo44894(C3519 c3519) {
        m46418(m46412(this.f65315.m50031()), 1013, new C18473());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C0425 m46415() {
        return m46412(this.f65315.m50032());
    }

    @Override // l.InterfaceC3380
    /* renamed from: ۧ */
    public final void mo10312(final long j, final int i, final long j2) {
        final C0425 m46412 = m46412(this.f65315.m50029());
        m46418(m46412, 1006, new InterfaceC7961(i, j, j2) { // from class: l.᩸۬֫

            /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ long f69341;

            /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f69343;

            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC1131) obj).mo3862(C0425.this, this.f69343, this.f69341);
            }
        });
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C0425 m46416(int i, C15894 c15894) {
        this.f65313.getClass();
        if (c15894 != null) {
            if (this.f65315.m50025(c15894) != null) {
                return m46412(c15894);
            }
            return m46417(AbstractC4846.f15313, i, c15894);
        }
        AbstractC4846 mo4576 = this.f65313.mo4576();
        if (i >= mo4576.mo14107()) {
            mo4576 = AbstractC4846.f15313;
        }
        return m46417(mo4576, i, (C15894) null);
    }

    @Override // l.InterfaceC0612
    /* renamed from: ֫ */
    public final void mo2503(C16134 c16134) {
        C0425 m46419;
        C15894 c15894;
        if ((c16134 instanceof C18273) && (c15894 = ((C18273) c16134).f56811) != null) {
            m46419 = m46412(c15894);
        } else {
            m46419 = m46419();
        }
        m46418(m46419, 10, new C19907(m46419, c16134));
    }

    @Override // l.InterfaceC0612
    /* renamed from: ۧ */
    public final void mo2511(C16134 c16134) {
        C0425 m46419;
        C15894 c15894;
        if ((c16134 instanceof C18273) && (c15894 = ((C18273) c16134).f56811) != null) {
            m46419 = m46412(c15894);
        } else {
            m46419 = m46419();
        }
        m46418(m46419, 10, new C4153(m46419, c16134));
    }
}
