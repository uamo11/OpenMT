package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.timepicker.RadialViewGroup;

/* compiled from: M7BP */
/* renamed from: l.ᩴܽ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18891 extends C4586 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Object f59542;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f59543;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C8381 f59544;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59545;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f59546;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f59547;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59548;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f59549;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f59550;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f59551;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f59552;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (l.C4925.f15523.getBoolean("def_mov_recycle_bin", true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18891(java.lang.String r5, l.C8381 r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r4.<init>(r0)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r4.f59542 = r1
            boolean r1 = l.C21939.m49417()
            if (r1 == 0) goto L1d
            android.content.SharedPreferences r1 = l.C4925.f15523
            java.lang.String r2 = "def_mov_recycle_bin"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            r4.f59552 = r3
            r4.f59549 = r0
            r0 = 1
            r4.f59550 = r0
            java.lang.String r0 = ""
            r4.f59543 = r0
            r4.f59546 = r5
            r4.f59544 = r6
            r4.f59547 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18891.<init>(java.lang.String, l.۠᩵ۢ, boolean):void");
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m43612(String str) {
        if ("replace".equals(str)) {
            return 0;
        }
        if (RadialViewGroup.SKIP_TAG.equals(str)) {
            return 1;
        }
        return "keep_both".equals(str) ? 2 : -1;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ܿ֫ */
    public final void mo13495() {
        synchronized (this.f59542) {
        }
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ᩵ */
    public final boolean mo13496() {
        boolean z;
        synchronized (this.f59542) {
            z = !this.f59548;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ֫ */
    public final boolean mo13492(boolean z) {
        return (z || this.f59547 || !mo13496()) ? false : true;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ܶ */
    public final boolean mo13494() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59549 == 0 && this.f59552;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ֫ */
    public final void mo13491(String str, C22306 c22306, C22306 c223062, boolean z) {
        synchronized (this.f59542) {
            if (this.f59545) {
                return;
            }
            if (this.f59547) {
                throw new RuntimeException(C4925.m14327(R.string.MT_Protector_res_0x7f1203a1));
            }
            if (this.f59548) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f59546);
            sb.append("-c");
            long j = this.f59550;
            this.f59550 = 1 + j;
            sb.append(j);
            String sb2 = sb.toString();
            this.f59543 = sb2;
            this.f59551 = true;
            if (!this.f59544.m21986(this.f59546, sb2, str, c22306, c223062, this, z)) {
                m43615(sb2);
                return;
            }
            synchronized (this.f59542) {
                while (this.f59551 && !this.f59545 && TextUtils.equals(sb2, this.f59543)) {
                    try {
                        this.f59542.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f59545 = true;
                        this.f59551 = false;
                        this.f59543 = "";
                    }
                }
            }
        }
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ֫ */
    public final int mo13490(String str, C22306 c22306, C22306 c223062, boolean z, boolean z2) {
        if (z2) {
            return 1;
        }
        if (mo13496()) {
            mo13491(str, c22306, c223062, z);
        }
        return mo13493();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m43616() {
        String str;
        synchronized (this.f59542) {
            int i = this.f59549;
            str = i == 1 ? RadialViewGroup.SKIP_TAG : i == 2 ? "keep_both" : "replace";
        }
        return str;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m43617(String str) {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59551 && TextUtils.equals(this.f59543, str);
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43613(String str, String str2, boolean z, boolean z2) {
        int m43612 = m43612(str2);
        if (m43612 == -1) {
            return false;
        }
        synchronized (this.f59542) {
            if (this.f59551 && TextUtils.equals(this.f59543, str)) {
                this.f59549 = m43612;
                this.f59548 = z;
                this.f59552 = m43612 == 0 && z2;
                this.f59551 = false;
                this.f59543 = "";
                this.f59542.notifyAll();
                return true;
            }
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43615(String str) {
        synchronized (this.f59542) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f59543, str)) {
                this.f59545 = true;
                this.f59551 = false;
                this.f59543 = "";
                this.f59542.notifyAll();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43614() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59552;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        boolean z;
        synchronized (this.f59542) {
            z = this.f59545;
        }
        return z;
    }

    @Override // l.C4586, l.InterfaceC21601
    /* renamed from: ۬ */
    public final int mo13493() {
        int i;
        synchronized (this.f59542) {
            i = this.f59549;
        }
        return i;
    }
}
