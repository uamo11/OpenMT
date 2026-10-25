package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: 964K */
/* renamed from: l.ۡۤܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8823 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PackageManager f26893 = C4925.m14320();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f26894;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f26895;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f26896;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f26897;

    public C8823(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, View view) {
        this.f26896 = dialogInterfaceOnClickListenerC19407;
        this.f26894 = view;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f26896.f62792;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f12006a);
        this.f23322.m31860(new Runnable() { // from class: l.᩻ۤܿ
            @Override // java.lang.Runnable
            public final void run() {
                C8823.m22795(C8823.this);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22795(C8823 c8823) {
        c8823.f26896.m44706(true);
        c8823.f23322.m31857();
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0067 */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            r9 = this;
            android.content.pm.PackageManager r0 = r9.f26893
            l.᩵ۤܿ r1 = r9.f26896
            r2 = 0
            l.ۘܶۡ r3 = l.DialogInterfaceOnClickListenerC19407.m44717(r1)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r3 = r3.m12094()     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r2)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            int r4 = r3.versionCode     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            l.ۘܶۡ r6 = l.DialogInterfaceOnClickListenerC19407.m44717(r1)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            long r6 = r6.m12098()     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            l.DialogInterfaceOnClickListenerC19407.m44705(r1, r4)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L2d
            goto L32
        L2b:
            r3 = 0
            goto L32
        L2d:
            l.DialogInterfaceOnClickListenerC19407.m44705(r1, r2)
            java.lang.String r3 = ""
        L32:
            boolean r4 = l.DialogInterfaceOnClickListenerC19407.m44712(r1)
            if (r4 == 0) goto L5f
            boolean r4 = l.DialogInterfaceOnClickListenerC19407.m44707()
            if (r4 == 0) goto L5f
            boolean r4 = l.C20549.m47086()
            if (r4 != 0) goto L5c
            boolean r4 = l.C20549.m47084()
            if (r4 == 0) goto L5f
            l.᩵ܶ᩷ r4 = l.C19554.m44967()
            java.lang.String r5 = "disable_install_by_shizuku"
            boolean r4 = r4.m44969(r5)
            if (r4 != 0) goto L5f
            int r4 = l.C20549.m47087()
            if (r4 == 0) goto L5f
        L5c:
            l.DialogInterfaceOnClickListenerC19407.m44705(r1, r2)
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r4 = l.DialogInterfaceOnClickListenerC19407.m44711(r1)
            boolean r4 = r4.get()
            if (r4 == 0) goto L79
            l.۬۬ܿ r4 = r9.f23322
            boolean r4 = r4.m31868()
            if (r4 == 0) goto L73
            goto L10c
        L73:
            r4 = 10
            android.os.SystemClock.sleep(r4)
            goto L5f
        L79:
            l.ۙۧᩳ r4 = l.DialogInterfaceOnClickListenerC19407.m44724(r1)
            if (r4 == 0) goto L10c
            l.ۙۧᩳ r4 = l.DialogInterfaceOnClickListenerC19407.m44724(r1)
            boolean r4 = r4.m13530()
            if (r4 == 0) goto L10c
            l.ۙۧᩳ r4 = l.DialogInterfaceOnClickListenerC19407.m44724(r1)
            boolean r4 = r4.m13531()
            if (r4 == 0) goto L10c
            java.security.MessageDigest r4 = l.C14460.m34532()
            l.ۙۧᩳ r5 = l.DialogInterfaceOnClickListenerC19407.m44724(r1)
            byte[] r5 = r5.m13532()
            r4.update(r5)
            byte[] r4 = r4.digest()
            java.lang.String r4 = l.C14460.m34531(r4)
            r9.f26895 = r4
            l.۬۬ܿ r4 = r9.f23322
            boolean r4 = r4.m31868()
            if (r4 == 0) goto Lb5
            goto L10c
        Lb5:
            if (r3 == 0) goto Ldf
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lbe
            goto L10c
        Lbe:
            l.ۙۧᩳ r4 = new l.ۙۧᩳ     // Catch: java.lang.Throwable -> Ldf
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Ldf
            l.ܶ᩵ܿ r3 = l.C16999.m39866(r3, r5)     // Catch: java.lang.Throwable -> Ldf
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> Ldf
            java.security.MessageDigest r3 = l.C14460.m34532()     // Catch: java.lang.Throwable -> Ldf
            byte[] r4 = r4.m13532()     // Catch: java.lang.Throwable -> Ldf
            r3.update(r4)     // Catch: java.lang.Throwable -> Ldf
            byte[] r3 = r3.digest()     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r3 = l.C14460.m34531(r3)     // Catch: java.lang.Throwable -> Ldf
            r9.f26897 = r3     // Catch: java.lang.Throwable -> Ldf
            goto L10c
        Ldf:
            l.ۘܶۡ r1 = l.DialogInterfaceOnClickListenerC19407.m44717(r1)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r1 = r1.m12094()     // Catch: java.lang.Throwable -> L10c
            r3 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r3)     // Catch: java.lang.Throwable -> L10c
            if (r0 == 0) goto L10c
            android.content.pm.Signature[] r1 = r0.signatures     // Catch: java.lang.Throwable -> L10c
            if (r1 == 0) goto L10c
            java.security.MessageDigest r1 = l.C14460.m34532()     // Catch: java.lang.Throwable -> L10c
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: java.lang.Throwable -> L10c
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L10c
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L10c
            r1.update(r0)     // Catch: java.lang.Throwable -> L10c
            byte[] r0 = r1.digest()     // Catch: java.lang.Throwable -> L10c
            java.lang.String r0 = l.C14460.m34531(r0)     // Catch: java.lang.Throwable -> L10c
            r9.f26897 = r0     // Catch: java.lang.Throwable -> L10c
        L10c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8823.mo1009():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean z;
        int i;
        C16560 c16560;
        C16560 c165602;
        if (this.f23322.m31868()) {
            return;
        }
        String str = this.f26895;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f26896;
        if (str == null) {
            c165602 = dialogInterfaceOnClickListenerC19407.f62792;
            C19258 buildDialog = c165602.m39056().buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f12005e);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f1204b4, new DialogInterface.OnClickListener() { // from class: l.ۜۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C8823.this.f26896.m44706(false);
                }
            });
            C8960.m23095(buildDialog.m44438());
            return;
        }
        String str2 = this.f26897;
        if (str2 == null || str.equals(str2)) {
            z = dialogInterfaceOnClickListenerC19407.f62793;
            i = z ? R.string.MT_Protector_res_0x7f12005d : 0;
        } else {
            i = R.string.MT_Protector_res_0x7f120067;
        }
        if (i == 0) {
            dialogInterfaceOnClickListenerC19407.m44706(true);
            return;
        }
        c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        C19258 buildDialog2 = c16560.m39056().buildDialog();
        buildDialog2.m44433(R.string.MT_Protector_res_0x7f120b7b);
        buildDialog2.m44416(i);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩷ۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4021 c4021;
                C16560 c165603;
                DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC194072 = C8823.this.f26896;
                dialogInterfaceOnClickListenerC194072.f62794 = true;
                c4021 = dialogInterfaceOnClickListenerC194072.f62796;
                Intent intent = new Intent("android.intent.action.DELETE", Uri.fromParts("package", c4021.m12094(), null));
                c165603 = dialogInterfaceOnClickListenerC194072.f62792;
                c165603.m39056().startActivity(intent);
            }
        });
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog2.m44440(R.string.MT_Protector_res_0x7f1204b4, new DialogInterface.OnClickListener() { // from class: l.ۢۤܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8823.this.f26896.m44706(false);
            }
        });
        C8960.m23095(buildDialog2.m44438());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        if (this.f23322.m31868()) {
            return;
        }
        c16560 = this.f26896.f62792;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        m20273();
        dialogInterfaceC0206 = this.f26896.f62789;
        if (dialogInterfaceC0206.m1442()) {
            this.f26894.setEnabled(true);
        }
    }
}
