package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 964K */
/* renamed from: l.᩵ۤܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC19407 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static WeakReference f62786;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f62788;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f62789;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public View f62790;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16560 f62792;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f62793;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f62794;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4021 f62796;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4611 f62797;

    /* renamed from: ֡ܰ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f62784 = {805, 6642, 6634, 6598, 6651, 6648, 6647, 6598, 6633, 6642, 6634, 6581, 6602, 6646, 6635, 6635, 6624, 6581, 6585, 6637, 6641, 6640, 6634, 6585, 6655, 6636, 6647, 6650, 6637, 6640, 6646, 6647, 6585, 6640, 6634, 6585, 6647, 6646, 6637, 6585, 6634, 6636, 6633, 6633, 6646, 6635, 6637, 6652, 6653, 6585, 6655, 6646, 6635, 6585, 6637, 6641, 6640, 6634, 6585, 6648, 6633, 6633, 6585, 6648, 6637, 6585, 6637, 6641, 6652, 6585, 6644, 6646, 6644, 6652, 6647, 6637, 6584, 17937, 31528, 29392, -6507, 32539, 31855, 22420, 31926, 31384, 16992, -28036, 18189, 27825, 22246, 27825, 18978, 25319, 19206, -26268, -6504};

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f62787 = new AtomicInteger();

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean f62785 = true;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f62795 = new AtomicBoolean();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f62791 = true;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        if (l.C1294.f4556 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (l.C0964.f3626 != 0) goto L48;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m44708(java.lang.String r6) {
        /*
            short[] r0 = l.DialogInterfaceOnClickListenerC19407.f62784
            r1 = 0
            int r2 = l.C1773.m5908()
            if (r2 > 0) goto Lb
            goto La9
        Lb:
            short r0 = r0[r1]
            int r1 = l.RunnableC3474.f10992
            if (r1 > 0) goto L13
            goto L8c
        L13:
            int r1 = r0 + 8940
            int r1 = r1 * r1
            r2 = 35760(0x8bb0, float:5.011E-41)
            int r3 = l.C1773.f6144
            if (r3 > 0) goto L1f
            goto L55
        L1f:
            int r0 = r0 * r2
            int r0 = r0 - r1
            if (r0 <= 0) goto L27
            r0 = 29916(0x74dc, float:4.1921E-41)
            goto L29
        L27:
            r0 = 6553(0x1999, float:9.183E-42)
        L29:
            l.᩵ܶ᩷ r1 = l.C19554.m44967()
            short[] r2 = l.DialogInterfaceOnClickListenerC19407.f62784
            r3 = 1
            int r4 = l.C1294.f4556
            if (r4 < 0) goto L35
            goto L8c
        L35:
            r4 = 10
            int r5 = l.C7106.f21815
            if (r5 == 0) goto L3d
            goto La9
        L3d:
            java.lang.String r2 = l.ServiceConnectionC3453.m10568(r2, r3, r4, r0)
            java.lang.String r3 = ""
            java.lang.String r1 = r1.m44968(r2, r3)
            int r2 = l.C0422.f1886
            if (r2 > 0) goto L4c
            goto L55
        L4c:
            short[] r2 = l.DialogInterfaceOnClickListenerC19407.f62784
            r3 = 11
            r4 = 1
            int r5 = l.C0964.f3626
            if (r5 == 0) goto L65
        L55:
            l.C1773.m5908()
            int r6 = l.C1420.f5096
            if (r6 > 0) goto L5d
            goto La9
        L5d:
            l.C3746.m11369()
            int r6 = l.C1294.f4556
            if (r6 >= 0) goto L8c
            goto La3
        L65:
            java.lang.String r2 = l.AbstractC2021.m6573(r2, r3, r4, r0)
            int r3 = l.C0630.f2410
            if (r3 > 0) goto L6e
            goto La9
        L6e:
            java.lang.String[] r1 = l.ViewOnClickListenerC1958.m6436(r1, r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto Lba
            boolean r6 = l.C9523.m24407()
            if (r6 == 0) goto L99
            short[] r6 = l.DialogInterfaceOnClickListenerC19407.f62784
            r1 = 77
            r2 = 20
            int r3 = l.C2167.f7158
            if (r3 < 0) goto L91
        L8c:
            int r6 = l.C0964.f3626
            if (r6 == 0) goto La3
            goto La9
        L91:
            java.lang.String r6 = l.C11340.m28025(r6, r1, r2, r0)
            l.C21374.m48464(r6)
            goto Lb8
        L99:
            short[] r6 = l.DialogInterfaceOnClickListenerC19407.f62784
            r1 = 12
            r2 = 65
            int r3 = l.C3537.f11231
            if (r3 < 0) goto Lb1
        La3:
            l.AbstractC2021.m6574()
            l.RunnableC1108.m3790()
        La9:
            l.C11340.m28031()
            l.C1504.m5179()
            r6 = 0
            return r6
        Lb1:
            java.lang.String r6 = l.C4159.m12578(r6, r1, r2, r0)
            l.C21374.m48464(r6)
        Lb8:
            r6 = 1
            return r6
        Lba:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC19407.m44708(java.lang.String):boolean");
    }

    public DialogInterfaceOnClickListenerC19407(final C16560 c16560, String str) {
        this.f62792 = c16560;
        this.f62788 = C16999.m39866(str, new String[0]);
        final int incrementAndGet = f62787.incrementAndGet();
        final C13136 c13136 = new C13136(c16560.m39056(), R.string.MT_Protector_res_0x7f120528);
        C1802.f6208.execute(new Runnable() { // from class: l.ۨ۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC19407.m44702(DialogInterfaceOnClickListenerC19407.this, c13136, incrementAndGet, c16560);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44702(final DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, final C13136 c13136, final int i, final C16560 c16560) {
        C4925.m14309(300L, new RunnableC13821(0, dialogInterfaceOnClickListenerC19407, c13136));
        AbstractC15440 abstractC15440 = dialogInterfaceOnClickListenerC19407.f62788;
        C4021 m43525 = C18838.m43525(abstractC15440);
        dialogInterfaceOnClickListenerC19407.f62796 = m43525;
        String str = null;
        if (m43525 == null) {
            try {
                C18090 c18090 = new C18090(abstractC15440);
                try {
                    str = C22263.m49979(c18090);
                    c18090.close();
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        final String str2 = str;
        dialogInterfaceOnClickListenerC19407.f62791 = false;
        C4925.m14315(new Runnable() { // from class: l.۟۫ܿ
            @Override // java.lang.Runnable
            public final void run() {
                DialogInterfaceOnClickListenerC19407.m44701(DialogInterfaceOnClickListenerC19407.this, c13136, i, str2, c16560);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44700(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, C13136 c13136) {
        if (dialogInterfaceOnClickListenerC19407.f62791) {
            c13136.m31860(new RunnableC14532(1, c13136));
            c13136.m31864();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44692(C13136 c13136) {
        f62787.incrementAndGet();
        c13136.m31857();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.۬۫ܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44701(final DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, C13136 c13136, int i, final String str, final C16560 c16560) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        AbstractC15440 abstractC15440 = dialogInterfaceOnClickListenerC19407.f62788;
        c13136.m31857();
        if (i != f62787.get()) {
            return;
        }
        if (dialogInterfaceOnClickListenerC19407.f62796 == null) {
            if (str == null) {
                C19568.m45016(c16560, abstractC15440);
                return;
            }
            String[] strArr = {C4925.m14327(R.string.MT_Protector_res_0x7f120b5e), C4925.m14327(R.string.MT_Protector_res_0x7f120413)};
            C19258 buildDialog = c16560.m39056().buildDialog();
            buildDialog.m44429(strArr, -1, new DialogInterface.OnClickListener() { // from class: l.֫ۤܿ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DialogInterfaceOnClickListenerC19407.m44704(DialogInterfaceOnClickListenerC19407.this, c16560, str, dialogInterface, i2);
                }
            });
            buildDialog.m44433(R.string.MT_Protector_res_0x7f1205f0);
            buildDialog.m44438();
            return;
        }
        final Main m39056 = c16560.m39056();
        View m10216 = m39056.m10216(R.layout.MT_Protector_res_0x7f0d0076);
        dialogInterfaceOnClickListenerC19407.f62790 = m10216;
        ImageView imageView = (ImageView) m10216.findViewById(R.id.icon);
        imageView.setImageDrawable(dialogInterfaceOnClickListenerC19407.f62796.m12099());
        imageView.setOnClickListener(new ViewOnClickListenerC8558(1, dialogInterfaceOnClickListenerC19407));
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a0073), dialogInterfaceOnClickListenerC19407.f62796.m12095());
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a006f), dialogInterfaceOnClickListenerC19407.f62796.m12094());
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a0678), dialogInterfaceOnClickListenerC19407.f62796.m12092());
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a0679), String.valueOf(dialogInterfaceOnClickListenerC19407.f62796.m12098()));
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a052c), C22927.m51020(dialogInterfaceOnClickListenerC19407.f62796.m12097()));
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05b7), C5350.m15314(dialogInterfaceOnClickListenerC19407.f62796.m12091()));
        ViewOnClickListenerC14813.m35216((TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a03a1), C5350.m15314(dialogInterfaceOnClickListenerC19407.f62796.m12096()));
        TextView textView = (TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a0460);
        TextView textView2 = (TextView) dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.signature);
        View findViewById = dialogInterfaceOnClickListenerC19407.f62790.findViewById(R.id.MT_Protector_res_0x7f0a0526);
        ViewOnClickListenerC14813.m35215(textView);
        dialogInterfaceOnClickListenerC19407.m44719();
        C19258 buildDialog2 = m39056.buildDialog();
        buildDialog2.m44421(dialogInterfaceOnClickListenerC19407.f62790);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f1204b2, null);
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f120b5e, dialogInterfaceOnClickListenerC19407);
        if (c16560.m39035("local")) {
            buildDialog2.m44440(R.string.MT_Protector_res_0x7f120413, dialogInterfaceOnClickListenerC19407);
        }
        WeakReference weakReference = f62786;
        if (weakReference != null && (dialogInterfaceC0206 = (DialogInterfaceC0206) weakReference.get()) != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        dialogInterfaceOnClickListenerC19407.f62789 = buildDialog2.m44438();
        f62786 = new WeakReference(dialogInterfaceOnClickListenerC19407.f62789);
        final long m27291 = C10986.m27291(abstractC15440.mo23544());
        Button m1448 = dialogInterfaceOnClickListenerC19407.f62789.m1448();
        dialogInterfaceOnClickListenerC19407.f62789.m1447().setOnClickListener(new ViewOnClickListenerC10940(0, dialogInterfaceOnClickListenerC19407));
        dialogInterfaceOnClickListenerC19407.f62789.m1447().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܽۤܿ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C3822.m11574(c16560, DialogInterfaceOnClickListenerC19407.this.f62788);
                return true;
            }
        });
        m1448.setOnClickListener(dialogInterfaceOnClickListenerC19407);
        final C18701 c18701 = new C18701(dialogInterfaceOnClickListenerC19407);
        m39056.getLifecycle().mo19833(c18701);
        final C2234 m7411 = C2234.m7411(m39056);
        final C3884 c3884 = new C3884(dialogInterfaceOnClickListenerC19407);
        m7411.m7414(c3884, new IntentFilter("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE"));
        dialogInterfaceOnClickListenerC19407.f62789.m1436(new DialogInterface.OnDismissListener() { // from class: l.ᩳۤܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C10986.m27293(m27291);
                m39056.getLifecycle().mo19834(c18701);
                m7411.m7413(c3884);
            }
        });
        C20549.f66199.m1668(dialogInterfaceOnClickListenerC19407.f62789, new C4650(0, dialogInterfaceOnClickListenerC19407));
        C1802.f6208.execute(new RunnableC3239(0, dialogInterfaceOnClickListenerC19407, textView));
        C8177.m21651(textView2, findViewById, dialogInterfaceOnClickListenerC19407.f62788, m39056, true, new InterfaceC13041() { // from class: l.۬۫ܿ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                DialogInterfaceOnClickListenerC19407.this.f62797 = (C4611) obj;
            }
        }, new InterfaceC17066() { // from class: l.۫۫ܿ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                return DialogInterfaceOnClickListenerC19407.m44716(DialogInterfaceOnClickListenerC19407.this);
            }
        }, dialogInterfaceOnClickListenerC19407.f62795);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44704(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, C16560 c16560, String str, DialogInterface dialogInterface, int i) {
        AbstractC15440 abstractC15440 = dialogInterfaceOnClickListenerC19407.f62788;
        dialogInterface.dismiss();
        if (i == 0) {
            C19568.m45016(c16560, abstractC15440);
        } else {
            m44693(c16560, abstractC15440, str, (RunnableC20760) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44698(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, TextView textView) {
        try {
            String m15518 = C5432.m15518(dialogInterfaceOnClickListenerC19407.f62788);
            if (dialogInterfaceOnClickListenerC19407.f62789.m1442()) {
                C4925.m14315(new RunnableC6061(0, textView, m15518));
            }
        } catch (Throwable unused) {
            if (dialogInterfaceOnClickListenerC19407.f62789.m1442()) {
                C4925.m14315(new RunnableC7968(2, textView));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m44716(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407) {
        return !dialogInterfaceOnClickListenerC19407.f62789.m1442();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m44722(final DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407) {
        CharSequence[] charSequenceArr = {C4925.m14327(R.string.MT_Protector_res_0x7f120366), C4925.m14327(R.string.MT_Protector_res_0x7f120364), C4925.m14327(R.string.MT_Protector_res_0x7f120365)};
        C19258 buildDialog = dialogInterfaceOnClickListenerC19407.f62792.m39056().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120363);
        buildDialog.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogInterfaceOnClickListenerC19407.m44696(DialogInterfaceOnClickListenerC19407.this, dialogInterface, i);
            }
        });
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44696(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, DialogInterface dialogInterface, int i) {
        C16560 c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        dialogInterface.dismiss();
        if (i == 0) {
            new C17289(dialogInterfaceOnClickListenerC19407, c16560.m38993(dialogInterfaceOnClickListenerC19407.f62796.m12095() + "_icon.zip", false)).m20274();
            return;
        }
        if (i == 1 || i == 2) {
            new C14466(dialogInterfaceOnClickListenerC19407, c16560.m38993(dialogInterfaceOnClickListenerC19407.f62796.m12095() + "_icon" + new String[]{".png", ".webp"}[i - 1], false), i).m20274();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m44690(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int m27878 = C11266.m27878(200.0f);
        if (intrinsicWidth < m27878) {
            intrinsicHeight = (int) (intrinsicHeight * (m27878 / intrinsicWidth));
            intrinsicWidth = m27878;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect copyBounds = drawable.copyBounds();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(copyBounds);
        return createBitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44694(C18090 c18090, C8918 c8918, C12534 c12534, int i, boolean z, C9028 c9028) {
        C3545 entry;
        Iterator it = c12534.m30767(i).iterator();
        while (it.hasNext()) {
            InterfaceC21211 interfaceC21211 = (InterfaceC21211) it.next();
            if (z) {
                InterfaceC4277 mo29407 = interfaceC21211.mo29407();
                InterfaceC0748 type = interfaceC21211.getType();
                InterfaceC7099 mo29410 = interfaceC21211.mo29410();
                C8322 m23281 = c9028.m23281(mo29407.mo12858(), mo29407.getPackageName());
                m23281.m21922(mo29407.mo12848());
                C20317 m21925 = m23281.m21925(type.mo2870(), type.getTypeName());
                C2678 m46608 = m21925.m46608(mo29410.mo18743());
                m21925.m46611(interfaceC21211.mo47883(), interfaceC21211.mo29406(), false);
                m46608.m8392(interfaceC21211.mo47883()).m43645(interfaceC21211);
            }
            if (!interfaceC21211.mo29412()) {
                InterfaceC1454 value = interfaceC21211.getValue();
                if (value.mo5009() && (entry = c18090.getEntry(value.mo5008().getValue())) != null) {
                    c8918.m23014(entry, c18090);
                    try {
                        XmlResourceParserC10269 m35994 = C15206.m35978(c18090.m42193(entry, (C19277) null)).m35994();
                        while (true) {
                            int next = m35994.next();
                            if (next != 1) {
                                if (next == 2) {
                                    int attributeCount = m35994.getAttributeCount();
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        if (m35994.m26023(i2) == 1) {
                                            m44694(c18090, c8918, c12534, m35994.m26020(i2), true, c9028);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m44719() {
        int i;
        PackageInfo packageInfo;
        long j;
        int i2;
        String str;
        String str2;
        String str3;
        long j2;
        int i3;
        float f;
        Iterator<PackageInfo> it;
        boolean z = this.f62794;
        if (z) {
            this.f62794 = false;
        }
        PackageManager m14320 = C4925.m14320();
        String str4 = null;
        try {
            it = m14320.getInstalledPackages(0).iterator();
            i = 0;
        } catch (Throwable unused) {
            i = 0;
        }
        do {
            if (!it.hasNext()) {
                packageInfo = null;
                break;
            } else {
                packageInfo = it.next();
                if ((packageInfo.applicationInfo.flags & 129) == 0) {
                    i++;
                }
            }
        } while (!packageInfo.packageName.equals(this.f62796.m12094()));
        if (packageInfo == null && i <= 1) {
            try {
                packageInfo = m14320.getPackageInfo(this.f62796.m12094(), 0);
            } catch (Throwable unused2) {
            }
        }
        if (packageInfo != null) {
            String str5 = packageInfo.versionName;
            int i4 = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str6 = applicationInfo.sourceDir;
            str3 = applicationInfo.dataDir;
            AbstractC15440 m36526 = C16293.f50120.m36526("Android/data/" + packageInfo.packageName);
            if (m36526.mo23113()) {
                str4 = m36526.mo23554();
            } else if (Build.VERSION.SDK_INT >= 34 && !C22518.m50492().mo2656() && (packageInfo.applicationInfo.flags & 129) == 0) {
                str4 = m36526.mo23554();
            }
            i2 = packageInfo.applicationInfo.uid;
            j = packageInfo.firstInstallTime;
            j2 = packageInfo.lastUpdateTime;
            i3 = i4;
            str2 = str5;
            str = str4;
            str4 = str6;
        } else {
            j = 0;
            i2 = 0;
            str = null;
            str2 = null;
            str3 = null;
            j2 = 0;
            i3 = 0;
        }
        if (str4 != null && this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a3).getVisibility() == 0 && ((TextView) this.f62790.findViewById(R.id.apkPath)).getText().toString().equals(str4)) {
            return;
        }
        if (str4 != null) {
            this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a3).setVisibility(0);
            this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a5).setVisibility(0);
            this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a6).setVisibility(0);
            if (str3 != null) {
                this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a4).setVisibility(0);
                TextView textView = (TextView) this.f62790.findViewById(R.id.dataDirectory);
                SpannableString spannableString = new SpannableString(str3);
                spannableString.setSpan(new AbsoluteSizeSpan(C11266.m27880(13.0f)), 0, spannableString.length(), 17);
                textView.setText(spannableString);
                ViewOnClickListenerC14813.m35217(textView);
                textView.setOnClickListener(this);
                f = 13.0f;
            } else {
                f = 13.0f;
                this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a4).setVisibility(8);
            }
            if (str != null) {
                this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a7).setVisibility(0);
                ((TextView) this.f62790.findViewById(R.id.textView6)).setText(C4925.m14327(R.string.MT_Protector_res_0x7f120222).concat(" 1"));
                ((TextView) this.f62790.findViewById(R.id.textView10)).setText(C4925.m14327(R.string.MT_Protector_res_0x7f120222).concat(" 2"));
                TextView textView2 = (TextView) this.f62790.findViewById(R.id.dataDirectory2);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new AbsoluteSizeSpan(C11266.m27880(f)), 0, spannableString2.length(), 17);
                textView2.setText(spannableString2);
                ViewOnClickListenerC14813.m35217(textView2);
                textView2.setOnClickListener(this);
            } else {
                this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a7).setVisibility(8);
            }
            ViewOnClickListenerC14813.m35216((TextView) this.f62790.findViewById(R.id.installedVersion), str2 + " (" + i3 + MotionUtils.EASING_TYPE_FORMAT_END);
            TextView textView3 = (TextView) this.f62790.findViewById(R.id.apkPath);
            SpannableString spannableString3 = new SpannableString(str4);
            spannableString3.setSpan(new AbsoluteSizeSpan(C11266.m27880(f)), 0, spannableString3.length(), 17);
            textView3.setText(spannableString3);
            ViewOnClickListenerC14813.m35217(textView3);
            textView3.setOnClickListener(this);
            ViewOnClickListenerC14813.m35216((TextView) this.f62790.findViewById(R.id.uid), String.valueOf(i2));
            ViewOnClickListenerC14813.m35216((TextView) this.f62790.findViewById(R.id.firstInstall), C17283.m40576(j));
            ViewOnClickListenerC14813.m35216((TextView) this.f62790.findViewById(R.id.lastUpdate), C17283.m40576(j2));
            this.f62793 = ((long) i3) > this.f62796.m12098();
            return;
        }
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a3).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a4).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a5).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a6).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a7).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a8).setVisibility(8);
        this.f62790.findViewById(R.id.MT_Protector_res_0x7f0a05a9).setVisibility(8);
        this.f62793 = false;
        if (z) {
            m44706(false);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C19568.m45016(this.f62792, this.f62788);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44697(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, View view) {
        if (!ApplicationC20075.f65010.getBoolean("apk_installation_verify", true)) {
            dialogInterfaceOnClickListenerC19407.m44706(true);
            return;
        }
        C4611 c4611 = dialogInterfaceOnClickListenerC19407.f62797;
        if (c4611 != null && c4611.m13530() && !dialogInterfaceOnClickListenerC19407.f62797.m13531()) {
            C19258 buildDialog = dialogInterfaceOnClickListenerC19407.f62792.m39056().buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f12005e);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f1204b4, new DialogInterfaceOnClickListenerC3573(2, dialogInterfaceOnClickListenerC19407));
            C8960.m23095(buildDialog.m44438());
            return;
        }
        view.setEnabled(false);
        new C8823(dialogInterfaceOnClickListenerC19407, view).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m44706(boolean z) {
        int i = 0;
        if (z && !ApplicationC20075.f65010.getBoolean("apk_installation_confirm", false)) {
            z = false;
        }
        if (z) {
            boolean z2 = (!C20549.m47084() || C19554.m44967().m44969("disable_install_by_shizuku") || C20549.m47087() == 0) ? false : true;
            boolean m47086 = C20549.m47086();
            if (!z2 && !m47086) {
                z = false;
            }
        }
        AbstractC15440 abstractC15440 = this.f62788;
        C16560 c16560 = this.f62792;
        if (z) {
            C19258 buildDialog = c16560.m39056().buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f1204b3, abstractC15440.getName()));
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC20173(i, this));
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        C20549.m47080(c16560.m39056(), abstractC15440, this.f62796.m12094());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C4027 m43540;
        C4027 m435402;
        int id = view.getId();
        C16560 c16560 = this.f62792;
        if (id == R.id.dataDirectory) {
            this.f62789.dismiss();
            if (!C9255.m23780() && (m435402 = C18844.m43540(this.f62796.m12094())) != null) {
                c16560.m39033(m435402.m12120() + "/data", true);
                return;
            }
            c16560.m39033(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.dataDirectory2) {
            this.f62789.dismiss();
            if (!C9255.m23780() && (m43540 = C18844.m43540(this.f62796.m12094())) != null) {
                c16560.m39033(m43540.m12120() + "/android_data", true);
                return;
            }
            c16560.m39033(((TextView) view).getText().toString(), true);
            return;
        }
        if (view.getId() == R.id.apkPath) {
            this.f62789.dismiss();
            File file = new File(((TextView) view).getText().toString());
            c16560.m39053(file.getName());
            c16560.m39033(file.getParent(), true);
            return;
        }
        String m12094 = this.f62796.m12094();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f62789;
        C11003.requireNonNull(dialogInterfaceC0206);
        m44693(c16560, this.f62788, m12094, new RunnableC20760(3, dialogInterfaceC0206));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44693(final C16560 c16560, final AbstractC15440 abstractC15440, final String str, final RunnableC20760 runnableC20760) {
        boolean z = C4925.m14338().getBoolean(R.bool.MT_Protector_res_0x7f050008);
        ViewOnClickListenerC21681 viewOnClickListenerC21681 = new ViewOnClickListenerC21681(c16560.m39056(), null);
        if (z) {
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120088, R.string.MT_Protector_res_0x7f120088);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120b89, R.string.MT_Protector_res_0x7f120b89);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120082, R.string.MT_Protector_res_0x7f120082);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12010c, R.string.MT_Protector_res_0x7f12010c);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12004d, R.string.MT_Protector_res_0x7f12004d);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208a6, R.string.MT_Protector_res_0x7f1208a6);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208b0, R.string.MT_Protector_res_0x7f1208b0);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208a5, R.string.MT_Protector_res_0x7f1208a5);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1204ee, R.string.MT_Protector_res_0x7f1204ee);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120274, R.string.MT_Protector_res_0x7f120274);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120223, R.string.MT_Protector_res_0x7f120223);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12025d, R.string.MT_Protector_res_0x7f12025d);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120533, R.string.MT_Protector_res_0x7f120533);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12028c, R.string.MT_Protector_res_0x7f12028c);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120493, R.string.MT_Protector_res_0x7f120493);
        } else {
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120088, R.string.MT_Protector_res_0x7f120088);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12004d, R.string.MT_Protector_res_0x7f12004d);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120082, R.string.MT_Protector_res_0x7f120082);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12028c, R.string.MT_Protector_res_0x7f12028c);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12025d, R.string.MT_Protector_res_0x7f12025d);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120274, R.string.MT_Protector_res_0x7f120274);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208a6, R.string.MT_Protector_res_0x7f1208a6);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208a5, R.string.MT_Protector_res_0x7f1208a5);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1208b0, R.string.MT_Protector_res_0x7f1208b0);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f12010c, R.string.MT_Protector_res_0x7f12010c);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120b89, R.string.MT_Protector_res_0x7f120b89);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f1204ee, R.string.MT_Protector_res_0x7f1204ee);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120223, R.string.MT_Protector_res_0x7f120223);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120493, R.string.MT_Protector_res_0x7f120493);
            viewOnClickListenerC21681.m48955(R.string.MT_Protector_res_0x7f120533, R.string.MT_Protector_res_0x7f120533);
        }
        viewOnClickListenerC21681.m48958(new InterfaceC15329() { // from class: l.᩺۫ܿ
            @Override // l.InterfaceC15329
            /* renamed from: ֫ */
            public final void mo8585(int i) {
                DialogInterfaceOnClickListenerC19407.m44691(str, runnableC20760, c16560, abstractC15440, i);
            }
        });
        if (z) {
            viewOnClickListenerC21681.m48959();
        } else {
            viewOnClickListenerC21681.m48960();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44691(String str, Runnable runnable, C16560 c16560, AbstractC15440 abstractC15440, int i) {
        if (i == R.string.MT_Protector_res_0x7f1204ee && m44708(str)) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        if (i == R.string.MT_Protector_res_0x7f120088) {
            C14964.m35440(c16560, new String[]{abstractC15440.mo23554()}, str, true, false);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120082) {
            C14964.m35442(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f12004d) {
            C14964.m35445(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f1208a6) {
            C14964.m35443(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f1208a5) {
            C14964.m35438(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f1204ee) {
            C14964.m35452(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f12010c) {
            C14964.m35441(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120533) {
            C14964.m35446(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120493) {
            if (!C23196.m51460()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120757);
                return;
            } else {
                C14964.m35449(abstractC15440, c16560, str);
                return;
            }
        }
        if (i == R.string.MT_Protector_res_0x7f120274) {
            C14964.m35450(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f12025d) {
            C14964.m35451(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f12028c) {
            C14964.m35444(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120223) {
            C14964.m35448(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f1208b0) {
            C14964.m35447(abstractC15440, c16560, str);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120b89) {
            Intent intent = new Intent(c16560.m39056(), (Class<?>) ActivityC19507.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(abstractC15440.m36522());
            intent.putExtra("packageName", str);
            c16560.m39056().startActivity(intent);
        }
    }
}
