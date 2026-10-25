package l;

import android.content.IIntentSender;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: LAQJ */
/* renamed from: l.۫ۚܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12206 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f36420;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f36421;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7267 f36422;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f36423;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f36424;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14197 f36425;

    public C12206(C10671 c10671, InterfaceC7267 interfaceC7267) {
        this.f36421 = c10671;
        this.f36422 = interfaceC7267;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f36421;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector_res_0x7f120797);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.᩹ۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12206.this.f36420.m51051();
            }
        });
        c22933.mo49547();
        this.f36420 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        boolean z;
        boolean z2;
        boolean isShutdown;
        C10671 c10671 = this.f36421;
        z = c10671.f32092;
        if (z) {
            C20549.m47082(c10671.f32088, c10671.f32089);
        }
        ExecutorService executorService = null;
        try {
            PackageInstaller.Session mo19504 = this.f36422.mo19504(C4321.m12974());
            try {
                z2 = c10671.f32092;
                if (z2) {
                    this.f36423 = new C22789();
                    C18090 c18090 = new C18090(c10671.f32088);
                    try {
                        this.f36423.m50867(c18090, c10671.f32089);
                        this.f36420.m51049(R.string.MT_Protector_res_0x7f1204bd);
                        C19277 c19277 = new C19277(this.f36423.f73579);
                        c19277.m44459(new InterfaceC2343() { // from class: l.᩶ۚܿ
                            @Override // l.InterfaceC2343
                            /* renamed from: ֫ */
                            public final void mo6264(int i) {
                                C12206 c12206 = C12206.this;
                                c12206.f36420.m51045(i);
                                if (i == 100) {
                                    c12206.f36420.m51041(true);
                                }
                            }
                        });
                        this.f36425 = new C14197(c18090.m42196(), c19277);
                        this.f36420.mo49542(new Runnable() { // from class: l.ۙۚܿ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C12206.this.f36425.f42854 = true;
                            }
                        });
                        ExecutorService executorService2 = C1802.f6211;
                        executorService = Executors.newFixedThreadPool(C17615.f53826);
                        this.f36423.m50865(this.f36425, mo19504, executorService);
                        C14197 c14197 = this.f36425;
                        if (c14197.f42854) {
                            mo19504.abandon();
                            c18090.close();
                            mo19504.close();
                            if (executorService != null) {
                                if (isShutdown) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        c14197.m33866();
                        c18090.close();
                    } finally {
                    }
                } else {
                    this.f36420.m51049(R.string.MT_Protector_res_0x7f1204bd);
                    this.f36420.mo49542((Runnable) null);
                    C19277 c192772 = new C19277(c10671.f32088.mo23127());
                    c192772.m44459(new InterfaceC2343() { // from class: l.ۗۚܿ
                        @Override // l.InterfaceC2343
                        /* renamed from: ֫ */
                        public final void mo6264(int i) {
                            C12206 c12206 = C12206.this;
                            c12206.f36420.m51045(i);
                            if (i == 100) {
                                c12206.f36420.m51041(true);
                            }
                        }
                    });
                    OutputStream openWrite = mo19504.openWrite(c10671.getFileName(), 0L, -1L);
                    try {
                        c10671.f32088.m36495(openWrite, new C12911(this, c192772));
                        if (openWrite != null) {
                            openWrite.close();
                        }
                        if (this.f36420.m51053()) {
                            mo19504.abandon();
                            mo19504.close();
                            return;
                        }
                    } finally {
                    }
                }
                C13616 c13616 = new C13616();
                c13616.f40615 = new CountDownLatch(1);
                mo19504.commit((IntentSender) IntentSender.class.getConstructor(IIntentSender.class).newInstance(c13616));
                while (!c13616.f40615.await(500L, TimeUnit.MILLISECONDS)) {
                    if (this.f36420.m51053()) {
                        mo19504.abandon();
                        mo19504.close();
                        if (executorService == null || executorService.isShutdown()) {
                            return;
                        }
                        executorService.shutdownNow();
                        return;
                    }
                }
                Intent intent = c13616.f40616;
                int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
                if (intExtra == 0) {
                    this.f36424 = intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                    C22789 c22789 = this.f36423;
                    if (c22789 != null) {
                        c22789.m50866(this.f36425, this.f36420, executorService);
                    }
                } else {
                    if (intExtra == 3) {
                        throw new CancellationException();
                    }
                    String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    if (TextUtils.isEmpty(stringExtra)) {
                        throw new C1637(R.string.MT_Protector_res_0x7f120050);
                    }
                    C20549.m47078(stringExtra.replace("Success", ""));
                }
                mo19504.close();
                if (executorService == null || executorService.isShutdown()) {
                    return;
                }
                executorService.shutdownNow();
            } finally {
            }
        } finally {
            if (0 != 0 && !executorService.isShutdown()) {
                executorService.shutdownNow();
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean z;
        C5242 c5242;
        if (!this.f36420.m51053()) {
            C10671 c10671 = this.f36421;
            C20549.m47079(c10671.f32087, c10671.getFileName(), this.f36424);
            z = c10671.f32092;
            if (z) {
                return;
            }
            c5242 = C20549.f66200;
            c5242.mo1669((Object) null);
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f12008a);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        String str;
        String message = exc.getMessage();
        if (message != null && message.equals("binder haven't been received")) {
            this.f36422.mo19505();
            return;
        }
        if ((exc instanceof CancellationException) || this.f36420.m51053()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12008a);
            return;
        }
        boolean z = exc instanceof C0086;
        C10671 c10671 = this.f36421;
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
                String message2 = c0086.getMessage();
                String m1045 = c0086.m1045();
                abstractActivityC3346.getClass();
                abstractActivityC3346.runOnUiThread(new RunnableC9697(abstractActivityC3346, message2, m1045, false));
                return;
            }
        }
        c10671.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f36420.m51051();
    }
}
