package l;

import java.util.ArrayList;

/* compiled from: M1KI */
/* renamed from: l.ۧ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10863 implements InterfaceC17918 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC1690 f32635;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15800 f32633 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f32631 = 0.0f;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f32634 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f32632 = false;

    public C10863() {
    }

    public C10863(C16506 c16506) {
        this.f32635 = new C7128(this, c16506);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            l.ܺ۠ r0 = r9.f32633
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            l.ܺ۠ r1 = r9.f32633
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = l.C16014.m37867(r0, r1)
            float r1 = r9.f32631
            r2 = 0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = l.C5368.m15339(r0)
            float r1 = r9.f32631
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            l.֫۠ r4 = r9.f32635
            int r4 = r4.mo5700()
        L3b:
            if (r2 >= r4) goto L97
            l.֫۠ r5 = r9.f32635
            l.ܺ۠ r5 = r5.mo5694(r2)
            if (r5 != 0) goto L46
            goto L94
        L46:
            l.֫۠ r6 = r9.f32635
            float r6 = r6.mo5699(r2)
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L51
            goto L94
        L51:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L60
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L71
            java.lang.String r1 = "- "
            goto L6b
        L60:
            if (r7 <= 0) goto L69
            java.lang.String r1 = " + "
            java.lang.String r0 = l.C16014.m37867(r0, r1)
            goto L71
        L69:
            java.lang.String r1 = " - "
        L6b:
            java.lang.String r0 = l.C16014.m37867(r0, r1)
            float r6 = r6 * r8
        L71:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L7c
            java.lang.String r0 = l.C16014.m37867(r0, r5)
            goto L93
        L7c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L93:
            r1 = 1
        L94:
            int r2 = r2 + 1
            goto L3b
        L97:
            if (r1 != 0) goto L9f
            java.lang.String r1 = "0.0"
            java.lang.String r0 = l.C16014.m37867(r0, r1)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10863.toString():java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27159(C15800 c15800, C15800 c158002, C15800 c158003, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f32631 = i;
        }
        if (!z) {
            this.f32635.mo5697(c15800, -1.0f);
            this.f32635.mo5697(c158002, 1.0f);
            this.f32635.mo5697(c158003, 1.0f);
        } else {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c158002, -1.0f);
            this.f32635.mo5697(c158003, -1.0f);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27164(C15800 c15800, C15800 c158002, C15800 c158003, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f32631 = i;
        }
        if (!z) {
            this.f32635.mo5697(c15800, -1.0f);
            this.f32635.mo5697(c158002, 1.0f);
            this.f32635.mo5697(c158003, -1.0f);
        } else {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c158002, -1.0f);
            this.f32635.mo5697(c158003, 1.0f);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27158(float f, float f2, float f3, C15800 c15800, C15800 c158002, C15800 c158003, C15800 c158004) {
        this.f32631 = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c158002, -1.0f);
            this.f32635.mo5697(c158004, 1.0f);
            this.f32635.mo5697(c158003, -1.0f);
            return;
        }
        if (f == 0.0f) {
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c158002, -1.0f);
        } else {
            if (f3 == 0.0f) {
                this.f32635.mo5697(c158003, 1.0f);
                this.f32635.mo5697(c158004, -1.0f);
                return;
            }
            float f4 = (f / f2) / (f3 / f2);
            this.f32635.mo5697(c15800, 1.0f);
            this.f32635.mo5697(c158002, -1.0f);
            this.f32635.mo5697(c158004, f4);
            this.f32635.mo5697(c158003, -f4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27161(C17212 c17212, int i) {
        this.f32635.mo5697(c17212.m40494(i), 1.0f);
        this.f32635.mo5697(c17212.m40494(i), -1.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27160(C15800 c15800, C15800 c158002, C15800 c158003, C15800 c158004, float f) {
        this.f32635.mo5697(c158003, 0.5f);
        this.f32635.mo5697(c158004, 0.5f);
        this.f32635.mo5697(c15800, -0.5f);
        this.f32635.mo5697(c158002, -0.5f);
        this.f32631 = -f;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27163(C15800 c15800) {
        C15800 c158002 = this.f32633;
        if (c158002 != null) {
            this.f32635.mo5697(c158002, -1.0f);
            this.f32633.f48738 = -1;
            this.f32633 = null;
        }
        float mo5693 = this.f32635.mo5693(c15800, true) * (-1.0f);
        this.f32633 = c15800;
        if (mo5693 == 1.0f) {
            return;
        }
        this.f32631 /= mo5693;
        this.f32635.mo5696(mo5693);
    }

    /* renamed from: ֫ */
    public boolean mo24288() {
        return this.f32633 == null && this.f32631 == 0.0f && this.f32635.mo5700() == 0;
    }

    /* renamed from: ֫ */
    public void mo24287(C17212 c17212, C10863 c10863, boolean z) {
        float mo5691 = this.f32635.mo5691(c10863, z);
        this.f32631 = (c10863.f32631 * mo5691) + this.f32631;
        if (z) {
            c10863.f32633.m37440(this);
        }
        if (this.f32633 == null || this.f32635.mo5700() != 0) {
            return;
        }
        this.f32632 = true;
        c17212.f52800 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27162(C17212 c17212, C15800 c15800, boolean z) {
        if (c15800.f48739) {
            float mo5692 = this.f32635.mo5692(c15800);
            this.f32631 = (c15800.f48734 * mo5692) + this.f32631;
            this.f32635.mo5693(c15800, z);
            if (z) {
                c15800.m37440(this);
            }
            if (this.f32635.mo5700() == 0) {
                this.f32632 = true;
                c17212.f52800 = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15800 m27156(boolean[] zArr, C15800 c15800) {
        EnumC8746 enumC8746;
        int mo5700 = this.f32635.mo5700();
        C15800 c158002 = null;
        float f = 0.0f;
        for (int i = 0; i < mo5700; i++) {
            float mo5699 = this.f32635.mo5699(i);
            if (mo5699 < 0.0f) {
                C15800 mo5694 = this.f32635.mo5694(i);
                if ((zArr == null || !zArr[mo5694.f48743]) && mo5694 != c15800 && (((enumC8746 = mo5694.f48744) == EnumC8746.SLACK || enumC8746 == EnumC8746.ERROR) && mo5699 < f)) {
                    f = mo5699;
                    c158002 = mo5694;
                }
            }
        }
        return c158002;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15800 m27157(C15800 c15800) {
        return m27156((boolean[]) null, c15800);
    }

    @Override // l.InterfaceC17918
    /* renamed from: ֫ */
    public C15800 mo24286(boolean[] zArr) {
        return m27156(zArr, (C15800) null);
    }
}
