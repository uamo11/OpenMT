package l;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: LAQJ */
/* renamed from: l.֨ۚܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0917 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f3505;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f3506;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12906 f3507;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3508;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f3509;

    public C0917(C10671 c10671, int i) {
        this.f3506 = c10671;
        this.f3508 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f3506;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector_res_0x7f1204bd);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.֡ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0917.this.f3509.m51051();
            }
        });
        c22933.mo49547();
        this.f3509 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        Object obj;
        String str;
        int i;
        String valueOf;
        String str2;
        String str3;
        String str4;
        obj = C20549.f66203;
        synchronized (obj) {
            StringBuilder sb = new StringBuilder("-r -t -d ");
            str = this.f3506.f32090;
            sb.append(C11356.m28107(str));
            String sb2 = sb.toString();
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    i = Integer.parseInt(C16293.f50120.getName());
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                valueOf = String.valueOf(i);
            } else {
                valueOf = "current";
            }
            String m31436 = C12925.m31436(false);
            if (m31436 == null) {
                m31436 = "su";
            }
            this.f3507 = new C12906(m31436, false);
            if (valueOf.equals("current")) {
                str4 = this.f3506.f32090;
                if (!str4.isEmpty()) {
                    C12201 mo25344 = this.f3507.mo25344("am get-current-user", true);
                    String trim = mo25344.m29682().trim();
                    if (!mo25344.m29683()) {
                        try {
                            int parseInt = Integer.parseInt(trim);
                            if (parseInt >= 0) {
                                valueOf = String.valueOf(parseInt);
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    throw new IOException("Unable to resolve current installation user: " + trim);
                }
            }
            String str5 = sb2 + "--user " + valueOf + " ";
            if (Build.VERSION.SDK_INT >= 34) {
                str5 = str5 + "--bypass-low-target-sdk-block ";
            }
            C12906 c12906 = this.f3507;
            str2 = this.f3506.f32090;
            C11356.m28104(c12906, valueOf, str2);
            int i2 = this.f3508;
            if (i2 == 0) {
                str3 = "pm install " + str5 + C9255.m23755(this.f3506.f32088.mo23554());
            } else if (i2 == 1) {
                str3 = "cat " + C9255.m23755(this.f3506.f32088.mo23554()) + " | pm install " + str5 + "-S " + this.f3506.f32088.mo23127();
            } else if (i2 == 2) {
                this.f3505 = C16999.m39866("/data/local/tmp/mt_install.apk", new String[0]);
                this.f3509.mo49542((Runnable) null);
                this.f3506.f32088.m36500(this.f3505, (C17558) null, new C5151(this));
                if (this.f3509.m51053()) {
                    return;
                }
                this.f3509.m51048();
                str3 = "pm install " + str5 + "/data/local/tmp/mt_install.apk";
            } else {
                throw new RuntimeException();
            }
            this.f3509.m51041(true);
            C12906 c129062 = this.f3507;
            c129062.getClass();
            C20549.m47078(c129062.mo25342(0L, str3).m29682());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        String str;
        C5242 c5242;
        if (this.f3509.m51053()) {
            return;
        }
        C10671 c10671 = this.f3506;
        AbstractActivityC3346 abstractActivityC3346 = c10671.f32087;
        String fileName = c10671.getFileName();
        str = c10671.f32091;
        C20549.m47079(abstractActivityC3346, fileName, str);
        c5242 = C20549.f66200;
        c5242.mo1669((Object) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        String str;
        if ((exc instanceof CancellationException) || this.f3509.m51053()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12008a);
            return;
        }
        boolean z = exc instanceof C0086;
        C10671 c10671 = this.f3506;
        if (z) {
            C0086 c0086 = (C0086) exc;
            if (c0086.m1046()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                str = c10671.f32091;
                intent.putExtra("pkgName", str);
                C2234.m7411(C4925.m14335()).m7415(intent);
                return;
            }
            if (c0086.m1047()) {
                AbstractActivityC3346 abstractActivityC3346 = c10671.f32087;
                String message = c0086.getMessage();
                String m1045 = c0086.m1045();
                abstractActivityC3346.getClass();
                abstractActivityC3346.runOnUiThread(new RunnableC9697(abstractActivityC3346, message, m1045, false));
                return;
            }
        }
        c10671.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f3509.m51051();
        C12906 c12906 = this.f3507;
        if (c12906 != null) {
            c12906.close();
        }
        AbstractC15440 abstractC15440 = this.f3505;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }
}
