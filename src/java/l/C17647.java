package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import bin.mt.plus.R;

/* compiled from: 8985 */
/* renamed from: l.ܿ᩹᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17647 extends AbstractC10128 {
    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(final C16560 c16560) {
        final Resources m14338 = C4925.m14338();
        final CharSequence[] charSequenceArr = {m14338.getString(R.string.MT_Protector_res_0x7f1205b1), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 1, 1), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 3, 3), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 7, 7), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 14, 14), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 30, 30), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 60, 60), m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110008, 90, 90)};
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205b0);
        buildDialog.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.۟᩸᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C16560 c165602 = c16560;
                C19258 buildDialog2 = c165602.m39056().buildDialog();
                buildDialog2.m44433(R.string.MT_Protector_res_0x7f120b7b);
                buildDialog2.m44424(m14338.getString(R.string.MT_Protector_res_0x7f1205b3, charSequenceArr[i]));
                buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener(C17647.this, i, c165602) { // from class: l.֫᩹᩻

                    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ int f7085;

                    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
                    public final /* synthetic */ C16560 f7086;

                    {
                        this.f7085 = i;
                        this.f7086 = c165602;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
                    @Override // android.content.DialogInterface.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.content.DialogInterface r4, int r5) {
                        /*
                            r3 = this;
                            long r4 = java.lang.System.currentTimeMillis()
                            int r0 = r3.f7085
                            switch(r0) {
                                case 0: goto L32;
                                case 1: goto L2d;
                                case 2: goto L29;
                                case 3: goto L25;
                                case 4: goto L21;
                                case 5: goto L1b;
                                case 6: goto L15;
                                case 7: goto Lf;
                                default: goto L9;
                            }
                        L9:
                            java.lang.RuntimeException r4 = new java.lang.RuntimeException
                            r4.<init>()
                            throw r4
                        Lf:
                            r1 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
                            goto L30
                        L15:
                            r1 = 5184000000(0x134fd9000, double:2.561236308E-314)
                            goto L30
                        L1b:
                            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
                            goto L30
                        L21:
                            r1 = 1209600000(0x48190800, double:5.97621805E-315)
                            goto L30
                        L25:
                            r1 = 604800000(0x240c8400, double:2.988109026E-315)
                            goto L30
                        L29:
                            r1 = 259200000(0xf731400, double:1.280618154E-315)
                            goto L30
                        L2d:
                            r1 = 86400000(0x5265c00, double:4.2687272E-316)
                        L30:
                            long r4 = r4 - r1
                            goto L37
                        L32:
                            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                        L37:
                            l.ܽۢܳ r1 = r3.f7086
                            bin.mt.plus.Main r1 = r1.m39056()
                            if (r0 != 0) goto L41
                            r0 = 1
                            goto L42
                        L41:
                            r0 = 0
                        L42:
                            l.ᩳ᩹᩻ r2 = new l.ᩳ᩹᩻
                            r2.<init>(r1, r4, r0)
                            r2.m20274()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC2125.onClick(android.content.DialogInterface, int):void");
                    }
                });
                buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog2.m44438();
            }
        });
        buildDialog.m44438();
    }
}
