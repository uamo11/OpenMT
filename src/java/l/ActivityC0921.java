package l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: E72G */
/* renamed from: l.֨ۚ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ActivityC0921 extends AbstractActivityC3346 {

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final C19267 f3512;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final int f3513;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f3514;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final int f3515;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f3516;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final C19267 f3517;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public C0215 f3518;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3519;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public Bundle f3520;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3521;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C18561 f3522;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public String f3523;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC19972 f3526;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public View f3527;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f3528;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C14669 f3529;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public FrameLayout f3530;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public TextView f3531;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public FrameLayout f3532;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public WebView f3533;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3534;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ProgressBar f3535;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C3381 f3536;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3537;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C0974 f3538;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C21282 f3539;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C5155 f3541;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3542;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3543;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C2676 f3544;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3545;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public int f3525 = 100;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public volatile C19267 f3540 = f3517;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final Object f3524 = new Object();

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "HtmlPreviewActivity";
    }

    static {
        int[] iArr = {25, 33, 50, 67, 75, 80, 90, 100, UMErrorCode.E_UM_BE_JSON_FAILED, q.h, 150, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 200, 250, 300, 400, 500};
        f3516 = iArr;
        f3513 = iArr[0];
        f3515 = iArr[16];
        f3514 = new ConcurrentMapC10942();
        f3517 = new C19267(false, null);
        f3512 = new C19267(true, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3294(C16560 c16560, final InterfaceC17889 interfaceC17889, C18904 c18904, String str, final RunnableC10458 runnableC10458) {
        m3292(c16560.m39056(), c16560.m39063(), interfaceC17889, c18904, str, C18904.m43630(c16560), new Runnable() { // from class: l.ۜۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19267 c19267 = ActivityC0921.f3517;
                C9340.m24035(InterfaceC17889.this, 2000);
                runnableC10458.run();
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3283(ShortcutActivity shortcutActivity, String str) {
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        if (!m39866.mo23119()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
            return;
        }
        C2499 c2499 = C2499.f7958;
        InterfaceC17889 mo7638 = c2499.mo7638(m39866.mo23554());
        if (mo7638 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
            return;
        }
        final C18904 m43632 = C18904.m43632(m39866.mo23554());
        final C1264 c1264 = new C1264(C4925.f15527);
        final String m4323 = c1264.m4323(m43632);
        m3292(shortcutActivity, c2499, mo7638, m43632, m4323, Collections.EMPTY_LIST, new Runnable() { // from class: l.᩷ۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19267 c19267 = ActivityC0921.f3517;
                C1264.this.m4324(m43632, m4323, false);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3278(Activity activity, String str, String str2, boolean z, AbstractC15440 abstractC15440) {
        m3279(activity, str, str2, z, abstractC15440, -1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3277(Activity activity, String str, String str2, AbstractC15440 abstractC15440, int i) {
        m3279(activity, str, str2, false, abstractC15440, Math.max(0, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:8:0x001c, B:11:0x0023, B:20:0x003e, B:22:0x0056, B:24:0x0062, B:26:0x006e, B:27:0x0085, B:29:0x0095, B:31:0x009b, B:34:0x00b3, B:35:0x00ba, B:37:0x008a, B:40:0x002a, B:42:0x0014, B:44:0x000a), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:8:0x001c, B:11:0x0023, B:20:0x003e, B:22:0x0056, B:24:0x0062, B:26:0x006e, B:27:0x0085, B:29:0x0095, B:31:0x009b, B:34:0x00b3, B:35:0x00ba, B:37:0x008a, B:40:0x002a, B:42:0x0014, B:44:0x000a), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3279(android.app.Activity r17, java.lang.String r18, java.lang.String r19, boolean r20, l.AbstractC15440 r21, int r22) {
        /*
            r0 = r18
            r1 = r22
            r2 = 0
            r3 = 0
            if (r0 != 0) goto La
            r0 = r3
            goto L10
        La:
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.RuntimeException -> Lbb
            l.ܶ᩵ܿ r0 = l.C16999.m39866(r0, r2)     // Catch: java.lang.RuntimeException -> Lbb
        L10:
            if (r0 != 0) goto L14
            r2 = r3
            goto L18
        L14:
            java.lang.String r2 = r0.getParent()     // Catch: java.lang.RuntimeException -> Lbb
        L18:
            java.lang.String r4 = "/"
            if (r2 == 0) goto L2f
            boolean r5 = r2.startsWith(r4)     // Catch: java.lang.RuntimeException -> Lbb
            if (r5 != 0) goto L23
            goto L2f
        L23:
            boolean r5 = r2.endsWith(r4)     // Catch: java.lang.RuntimeException -> Lbb
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.RuntimeException -> Lbb
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L35
            r5 = 1
            r15 = 1
            goto L37
        L35:
            r5 = 0
            r15 = 0
        L37:
            if (r15 == 0) goto L91
            if (r20 != 0) goto L8a
            if (r1 < 0) goto L3e
            goto L8a
        L3e:
            java.lang.String r0 = r0.mo23554()     // Catch: java.lang.RuntimeException -> Lbb
            l.ᩴܿܳ r0 = l.C18904.m43632(r0)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r2 = r0.m43636()     // Catch: java.lang.RuntimeException -> Lbb
            l.ܶ᩵ܿ r4 = l.C16293.f50111     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.RuntimeException -> Lbb
            boolean r4 = l.C16999.m39872(r2, r4)     // Catch: java.lang.RuntimeException -> Lbb
            if (r4 != 0) goto L84
            l.ܶ᩵ܿ r4 = l.C16293.f50116     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.RuntimeException -> Lbb
            boolean r4 = l.C16999.m39872(r2, r4)     // Catch: java.lang.RuntimeException -> Lbb
            if (r4 != 0) goto L84
            l.ܶ᩵ܿ r4 = l.C16293.f50110     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r4 = r4.mo23554()     // Catch: java.lang.RuntimeException -> Lbb
            boolean r4 = l.C16999.m39872(r2, r4)     // Catch: java.lang.RuntimeException -> Lbb
            if (r4 != 0) goto L84
            l.֨ܿܳ r2 = new l.֨ܿܳ     // Catch: java.lang.RuntimeException -> Lbb
            l.۫ۤۡ r3 = l.C4925.f15527     // Catch: java.lang.RuntimeException -> Lbb
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r3 = r2.m4323(r0)     // Catch: java.lang.RuntimeException -> Lbb
            l.ܰ֡᩷ r4 = new l.ܰ֡᩷     // Catch: java.lang.RuntimeException -> Lbb
            r4.<init>()     // Catch: java.lang.RuntimeException -> Lbb
            r16 = r4
            r4 = r3
            r3 = r16
            goto L85
        L84:
            r4 = r2
        L85:
            java.lang.String r0 = r0.m43637(r4)     // Catch: java.lang.RuntimeException -> Lbb
            goto L93
        L8a:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.RuntimeException -> Lbb
            r9 = r0
            r8 = r2
            goto L95
        L91:
            java.lang.String r0 = "index.html"
        L93:
            r9 = r0
            r8 = r4
        L95:
            java.lang.String r10 = l.C6909.m18704(r8, r9)     // Catch: java.lang.RuntimeException -> Lbb
            if (r10 == 0) goto Lb3
            l.ۚۚ᩷ r0 = new l.ۚۚ᩷     // Catch: java.lang.RuntimeException -> Lbb
            l.ۖۧ᩻ r7 = l.C2499.f7958     // Catch: java.lang.RuntimeException -> Lbb
            r12 = 1
            r6 = r0
            r11 = r19
            r13 = r20
            r14 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.RuntimeException -> Lbb
            l.C5155.m14713(r0, r1)     // Catch: java.lang.RuntimeException -> Lbb
            r1 = r17
            m3280(r1, r0, r3)     // Catch: java.lang.RuntimeException -> Lbb
            return
        Lb3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r1 = "Invalid HTML preview path"
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> Lbb
            throw r0     // Catch: java.lang.RuntimeException -> Lbb
        Lbb:
            r21.mo23552()
            r0 = 2131887889(0x7f120711, float:1.9410398E38)
            l.C21374.m48457(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0921.m3279(android.app.Activity, java.lang.String, java.lang.String, boolean, l.ܶ᩵ܿ, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3292(ActivityC2124 activityC2124, AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, C18904 c18904, String str, List list, Runnable runnable) {
        Object obj;
        AbstractC13921 m28856;
        String m43637;
        String m18704;
        boolean equals = "local".equals(abstractC13921.mo7654());
        if (!(abstractC13921 instanceof C2499) && !(abstractC13921 instanceof AbstractC3163) && !(abstractC13921 instanceof C19247) && !(abstractC13921 instanceof C17626) && !(abstractC13921 instanceof C2346)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC16891.m39726(((Long) it.next()).longValue());
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
            return;
        }
        AbstractC13921 abstractC139212 = null;
        try {
            if (equals) {
                m28856 = C2499.f7958;
            } else {
                m28856 = C11806.m28856(abstractC13921.m33350(), true);
            }
            abstractC139212 = m28856;
            m43637 = c18904.m43637(str);
            m18704 = C6909.m18704(str, m43637);
        } catch (RuntimeException unused) {
            obj = abstractC139212;
        }
        try {
            if (m18704 == null) {
                throw new IllegalArgumentException("Invalid HTML preview path");
            }
            C5155 c5155 = new C5155(abstractC139212, str, m43637, m18704, interfaceC17889.getName(), equals, "multipart/related".equals(C1285.m4347(interfaceC17889.getName())), null, true);
            c5155.f16112 = list;
            m3280(activityC2124, c5155, runnable);
        } catch (RuntimeException unused2) {
            obj = abstractC139212;
            if (obj instanceof AutoCloseable) {
                try {
                    C5368.m15342((AutoCloseable) obj);
                } catch (Exception unused3) {
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC16891.m39726(((Long) it2.next()).longValue());
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3280(Activity activity, final C5155 c5155, Runnable runnable) {
        final String uuid = UUID.randomUUID().toString();
        ConcurrentMapC10942 concurrentMapC10942 = f3514;
        concurrentMapC10942.put(uuid, c5155);
        C4925.m14324().postDelayed(new Runnable() { // from class: l.᩺֡᩷
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC0921.m3293(c5155, uuid);
            }
        }, 60000L);
        Intent intent = new Intent(activity, (Class<?>) ActivityC0921.class);
        intent.putExtra("session_token", uuid);
        try {
            activity.startActivity(intent);
            if (runnable != null) {
                runnable.run();
            }
        } catch (RuntimeException unused) {
            if (concurrentMapC10942.remove(uuid, c5155)) {
                c5155.close();
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3293(C5155 c5155, String str) {
        boolean z;
        z = c5155.f16114;
        if (z || !f3514.remove(str, c5155)) {
            return;
        }
        c5155.close();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        AbstractC13921 abstractC13921;
        String str2;
        boolean z;
        boolean z2;
        AbstractC15440 abstractC15440;
        AbstractC15440 abstractC154402;
        String str3;
        boolean z3;
        int i;
        String str4;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        String str5;
        String str6;
        Uri m18701;
        AbstractC15440 abstractC154403;
        String str7;
        AbstractC15440 abstractC154404;
        String str8;
        AbstractC13921 abstractC139212;
        String str9;
        boolean z6;
        C19267 c19267;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("session_token");
        this.f3523 = stringExtra;
        C5155 c5155 = stringExtra == null ? null : (C5155) f3514.get(stringExtra);
        this.f3541 = c5155;
        if (c5155 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
            finish();
            return;
        }
        c5155.f16114 = true;
        boolean z7 = false;
        if (bundle != null) {
            this.f3520 = bundle.getBundle("markdown_scroll");
            this.f3525 = m3318(bundle.getInt("zoom_percent", 100));
            if (bundle.getBoolean("preview_resources_allowed")) {
                c19267 = f3512;
            } else {
                c19267 = new C19267(false, bundle.getString("source_label"));
            }
            this.f3540 = c19267;
        }
        m10241(R.layout.MT_Protector_res_0x7f0d0031);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۢۚ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19267 c192672 = ActivityC0921.f3517;
                ActivityC0921.this.finish();
            }
        });
        str = this.f3541.f16106;
        setTitle(str);
        this.f3535 = (ProgressBar) m10241(R.id.MT_Protector_res_0x7f0a0270);
        this.f3527 = m10241(R.id.MT_Protector_res_0x7f0a0271);
        View m10241 = m10241(R.id.MT_Protector_res_0x7f0a026f);
        this.f3526 = new ViewOnTouchListenerC19972(m10241, ApplicationC20075.f65008);
        m10241.setOnClickListener(new ViewOnClickListenerC13202(this, 1));
        C18934.m43699(m10241, getString(R.string.MT_Protector_res_0x7f120457));
        C4948.m14388(getWindow(), false);
        C17648.m41310(this.f3527, new C15612(this));
        abstractC13921 = this.f3541.f16102;
        str2 = this.f3541.f16109;
        z = this.f3541.f16111;
        z2 = this.f3541.f16105;
        if (z2) {
            abstractC154402 = null;
        } else {
            abstractC15440 = this.f3541.f16116;
            abstractC154402 = abstractC15440;
        }
        str3 = this.f3541.f16108;
        z3 = this.f3541.f16115;
        this.f3544 = new C2676(this, abstractC13921, str2, z, abstractC154402, str3, z3);
        i = this.f3541.f16107;
        if (i >= 0) {
            this.f3536 = new C3381(getAssets());
        }
        C19320 c19320 = new C19320();
        str4 = this.f3541.f16104;
        c19320.m44516(str4);
        c19320.m44517(this.f3544);
        this.f3538 = c19320.m44515();
        C15737 c15737 = new C15737(this, this);
        this.f3533 = c15737;
        c15737.setOnTouchListener(this.f3526);
        int i4 = -1;
        ((FrameLayout) m10241(R.id.MT_Protector_res_0x7f0a026e)).addView(this.f3533, new FrameLayout.LayoutParams(-1, -1));
        this.f3533.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۡۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                ActivityC0921.m3285(ActivityC0921.this, i5, i7, i9, i11);
            }
        });
        WebView webView = this.f3533;
        i2 = this.f3541.f16107;
        if (i2 < 0) {
            this.f3529 = new C14669(webView);
        } else {
            C18561 c18561 = new C18561(this.f3541);
            this.f3522 = c18561;
            webView.addJavascriptInterface(c18561, "__mtMarkdownState");
        }
        i3 = this.f3541.f16107;
        if (i3 >= 0 && C21238.m48208(this)) {
            i4 = Color.rgb(13, 17, 23);
        }
        webView.setBackgroundColor(i4);
        m3282(webView, C21238.m48208(this));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(false);
        z4 = this.f3541.f16105;
        settings.setAllowContentAccess(z4);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1 ^ (this.f3540.f60641 ? 1 : 0));
        webView.setWebViewClient(new C2333(this));
        webView.setWebChromeClient(new C3744(this));
        webView.setDownloadListener(new C11360());
        if (bundle != null && bundle.getBoolean("fullscreen")) {
            z7 = true;
        }
        m3306(z7);
        z5 = this.f3541.f16105;
        if (z5) {
            abstractC154403 = this.f3541.f16116;
            if (abstractC154403 == null) {
                str8 = this.f3541.f16113;
                abstractC139212 = this.f3541.f16102;
                str9 = this.f3541.f16108;
                z6 = this.f3541.f16111;
                m18701 = C4813.m14028(str8, this, abstractC139212, str9, z6);
            } else {
                str7 = this.f3541.f16113;
                abstractC154404 = this.f3541.f16116;
                m18701 = C4813.m14029(str7, this, abstractC154404);
            }
        } else {
            str5 = this.f3541.f16104;
            str6 = this.f3541.f16103;
            m18701 = C6909.m18701(str5, str6);
        }
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("web_view");
        WebBackForwardList restoreState = bundle2 == null ? null : this.f3533.restoreState(bundle2);
        if (restoreState == null) {
            m3281(m18701);
            this.f3533.loadUrl(m18701.toString());
        } else {
            WebHistoryItem currentItem = restoreState.getCurrentItem();
            String url = currentItem == null ? null : currentItem.getUrl();
            m3281(url != null ? Uri.parse(url) : null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3285(ActivityC0921 activityC0921, int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            activityC0921.m3324();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3282(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        if (C13573.m32624("ALGORITHMIC_DARKENING")) {
            C18614.m43154(settings);
        }
        if (C13573.m32624("FORCE_DARK") && C13573.m32624("FORCE_DARK_STRATEGY")) {
            C18614.m43155(settings);
            C18614.m43153(settings, z ? 2 : 0);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m3320(ActivityC0921 activityC0921, Uri uri) {
        C5155 c5155;
        AbstractC13921 abstractC13921;
        String str;
        String str2;
        if (!activityC0921.f3528 || activityC0921.isFinishing() || activityC0921.isDestroyed() || (c5155 = activityC0921.f3541) == null) {
            return;
        }
        abstractC13921 = c5155.f16102;
        if (abstractC13921 instanceof AbstractC3163) {
            str = activityC0921.f3541.f16104;
            if (!C6909.m18703(uri, str)) {
                str2 = activityC0921.f3541.f16113;
                if (!C4813.m14031(uri, str2)) {
                    return;
                }
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f120711);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3281(Uri uri) {
        String str;
        boolean z;
        str = this.f3541.f16104;
        z = this.f3541.f16105;
        m3295(m3274(uri, str, z ? this.f3541.f16113 : null, this.f3540));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r6.getScheme() == null) goto L9;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3288(l.ActivityC0921 r4, android.webkit.WebView r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r5.getUrl()
            r1 = 0
            if (r6 == 0) goto L18
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Le
            goto L18
        Le:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r0 = r6.getScheme()
            if (r0 != 0) goto L19
        L18:
            r6 = r1
        L19:
            if (r6 == 0) goto L56
            r4.m3281(r6)
            l.᩵ۚ᩷ r0 = r4.f3540
            boolean r0 = r0.f60641
            if (r0 == 0) goto L56
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.fragment(r1)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            java.lang.Object r0 = r4.f3524
            monitor-enter(r0)
            l.֡ۚ᩷ r2 = r4.f3518     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L51
            java.lang.String r3 = r2.f1472     // Catch: java.lang.Throwable -> L53
            boolean r3 = r3.equals(r6)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L44
            goto L51
        L44:
            r4.f3518 = r1     // Catch: java.lang.Throwable -> L53
            boolean r4 = r2.m1460(r6)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L56
            r5.reload()
            return
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            return
        L53:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r4
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0921.m3288(l.֨ۚ᩷, android.webkit.WebView, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m3312(Uri uri) {
        String str;
        boolean z;
        C19267 c19267 = this.f3540;
        str = this.f3541.f16104;
        z = this.f3541.f16105;
        C19267 m3274 = m3274(uri, str, z ? this.f3541.f16113 : null, c19267);
        if (uri == null || c19267.f60641 || !m3274.f60641) {
            if (!m3274.f60641 || c19267.f60641) {
                m3300();
                return;
            }
            return;
        }
        String uri2 = uri.buildUpon().fragment(null).build().toString();
        synchronized (this.f3524) {
            C0215 c0215 = this.f3518;
            if (c0215 == null || !c0215.f1472.equals(uri2)) {
                this.f3518 = new C0215(uri2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m3300() {
        synchronized (this.f3524) {
            this.f3518 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m3305(ActivityC0921 activityC0921, Uri uri) {
        String str;
        boolean z;
        C19267 c19267 = activityC0921.f3540;
        str = activityC0921.f3541.f16104;
        z = activityC0921.f3541.f16105;
        C19267 m3274 = m3274(uri, str, z ? activityC0921.f3541.f16113 : null, c19267);
        if (!activityC0921.f3519 || m3274.f60641) {
            return;
        }
        activityC0921.m3295(m3274);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3295(C19267 c19267) {
        C5155 c5155;
        String str;
        boolean z = this.f3519;
        boolean z2 = c19267.f60641;
        boolean z3 = z2 && !z;
        this.f3519 = z2;
        this.f3540 = c19267;
        WebView webView = this.f3533;
        if (webView != null) {
            webView.getSettings().setMixedContentMode(!c19267.f60641 ? 1 : 0);
        }
        C9762 c9762 = this.f10584;
        if (c9762 != null) {
            c9762.setSubtitle(c19267.f60642);
        }
        if (!z3 || (c5155 = this.f3541) == null) {
            return;
        }
        str = c5155.f16106;
        setTitle(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3303(android.net.Uri r3) {
        /*
            java.lang.String r0 = r3.getScheme()
            r1 = 0
            if (r0 == 0) goto L52
            java.lang.String r2 = "http"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L18
            java.lang.String r2 = "https"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 != 0) goto L18
            goto L52
        L18:
            java.lang.String r3 = r3.getEncodedAuthority()
            if (r3 != 0) goto L1f
            goto L33
        L1f:
            r2 = 64
            int r2 = r3.lastIndexOf(r2)
            if (r2 < 0) goto L2d
            int r2 = r2 + 1
            java.lang.String r3 = r3.substring(r2)
        L2d:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L34
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L37
            goto L52
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r2)
            r1.append(r0)
            java.lang.String r0 = "://"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0921.m3303(android.net.Uri):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19267 m3274(Uri uri, String str, String str2, C19267 c19267) {
        String m3303;
        boolean m18703 = C6909.m18703(uri, str);
        C19267 c192672 = f3512;
        if (m18703 || C4813.m14031(uri, str2)) {
            return c192672;
        }
        String scheme = uri == null ? null : uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String m33032 = m3303(uri);
                if (m33032 == null) {
                    return f3517;
                }
                return new C19267(false, m33032);
            }
            if (lowerCase.equals("blob")) {
                Uri parse = Uri.parse(uri.toString().substring(scheme.length() + 1));
                if (C6909.m18703(parse, str)) {
                    return c192672;
                }
                String scheme2 = parse.getScheme();
                if (scheme2 != null && ((scheme2.equalsIgnoreCase(a.s) || scheme2.equalsIgnoreCase(b.a)) && (m3303 = m3303(parse)) != null)) {
                    return new C19267(false, m3303);
                }
                return new C19267(false, "blob:");
            }
            if (lowerCase.equals(e.m) || lowerCase.equals("about")) {
                return new C19267(false, lowerCase.concat(":"));
            }
        }
        return c19267;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3273(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m3311(ActivityC0921 activityC0921, String str) {
        String str2;
        boolean z;
        String str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                str2 = activityC0921.f3541.f16104;
                z = activityC0921.f3541.f16105;
                C19267 m3274 = m3274(parse, str2, z ? activityC0921.f3541.f16113 : null, activityC0921.f3540);
                str3 = activityC0921.f3541.f16106;
                return m3274.f60641 ? str3 : m3274.f60642;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse m3272(l.ActivityC0921 r12, android.webkit.WebResourceRequest r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC0921.m3272(l.֨ۚ᩷, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m3321(Uri uri) {
        String str;
        boolean z;
        str = this.f3541.f16104;
        z = this.f3541.f16105;
        String str2 = null;
        String str3 = z ? this.f3541.f16113 : null;
        if (C6909.m18703(uri, str) || C4813.m14031(uri, str3)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals("about") || lowerCase.equals(e.m) || lowerCase.equals("blob") || lowerCase.equals("javascript") || lowerCase.equals("cid")) {
                return false;
            }
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String encodedAuthority = uri.getEncodedAuthority();
                if (encodedAuthority != null) {
                    int lastIndexOf = encodedAuthority.lastIndexOf(64);
                    if (lastIndexOf >= 0) {
                        encodedAuthority = encodedAuthority.substring(lastIndexOf + 1);
                    }
                    if (!encodedAuthority.isEmpty()) {
                        str2 = encodedAuthority;
                    }
                }
                if (str2 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C21610 m3275(ActivityC0921 activityC0921, View view, C21610 c21610) {
        C11007 m48815 = c21610.m48815((activityC0921.f3545 ? 0 : 7) | 128);
        view.setPadding(m48815.f33109, m48815.f33111, m48815.f33110, Math.max(m48815.f33108, c21610.m48815(8).f33108));
        activityC0921.f3526.m46058(c21610.m48815(7));
        return C21610.f69386;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m3306(boolean z) {
        this.f3545 = z;
        this.f10584.setVisibility(z ? 8 : 0);
        this.f3535.setVisibility((!this.f3528 || z) ? 8 : 0);
        this.f3526.m46059(z);
        m3308();
        C17648.m41339(this.f3527);
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m3308() {
        C12437 m10244 = m10244();
        if (this.f3545) {
            m10244.m30602(2);
            m10244.m30599(7);
        } else {
            m10244.m30602(1);
            m10244.m30604(7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f3545) {
            m3308();
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3527 != null) {
            this.f3526.m46059(this.f3545);
            m3308();
            C17648.m41339(this.f3527);
        }
        WebView webView = this.f3533;
        if (webView != null) {
            m3313(webView.getUrl());
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector_res_0x7f0f000f, menu);
        this.f3537 = menu.findItem(R.id.MT_Protector_res_0x7f0a0394);
        this.f3534 = menu.findItem(R.id.MT_Protector_res_0x7f0a0395);
        m3298();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        if (this.f3533 == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a0394) {
            if (this.f3533.canGoBack()) {
                this.f3533.goBack();
                return true;
            }
        } else if (itemId == R.id.MT_Protector_res_0x7f0a0395) {
            if (this.f3533.canGoForward()) {
                this.f3533.goForward();
                return true;
            }
        } else if (itemId == R.id.MT_Protector_res_0x7f0a0396) {
            View findViewById = this.f10584.findViewById(R.id.MT_Protector_res_0x7f0a0396);
            if (findViewById != null) {
                C21282 m45699 = C19871.m45699(findViewById);
                C3060 m48304 = m45699.m48304();
                this.f3543 = m48304.add(0, 1, 0, R.string.MT_Protector_res_0x7f1205f5).setIcon(R.drawable.MT_Protector_res_0x7f08022b);
                this.f3521 = m48304.add(0, 2, 1, R.string.MT_Protector_res_0x7f1209df).setIcon(R.drawable.MT_Protector_res_0x7f0801dd);
                m48304.add(0, 5, 2, R.string.MT_Protector_res_0x7f120458).setIcon(R.drawable.MT_Protector_res_0x7f0801ff);
                i = this.f3541.f16107;
                if (i < 0) {
                    this.f3542 = m48304.add(0, 3, 3, R.string.MT_Protector_res_0x7f1204b0).setIcon(R.drawable.MT_Protector_res_0x7f0801e0);
                }
                m48304.add(0, 4, 4, R.string.MT_Protector_res_0x7f120316).setIcon(R.drawable.MT_Protector_res_0x7f0801f5);
                m45699.m48306();
                m45699.m48302(new C3362(4, this));
                m45699.m48301(new C4157(this));
                Context context = findViewById.getContext();
                ViewParent parent = findViewById.getParent();
                if (parent instanceof C8788) {
                    C8788 c8788 = (C8788) parent;
                    context = c8788.getContext();
                    int m22681 = c8788.m22681();
                    if (m22681 != 0) {
                        context = new C12729(context, m22681);
                    }
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector_res_0x7f0d012c, (ViewGroup) null, false);
                this.f3530 = (FrameLayout) inflate.findViewById(R.id.MT_Protector_res_0x7f0a0273);
                this.f3531 = (TextView) inflate.findViewById(R.id.MT_Protector_res_0x7f0a0274);
                this.f3532 = (FrameLayout) inflate.findViewById(R.id.MT_Protector_res_0x7f0a0272);
                this.f3530.setOnClickListener(new ViewOnClickListenerC20259(4, this));
                this.f3532.setOnClickListener(new ViewOnClickListenerC18869(this, 2));
                this.f3539 = m45699;
                m3298();
                C19871.m45700(m45699, this.f3525 + "%", inflate);
            }
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3290(ActivityC0921 activityC0921, C21282 c21282) {
        if (activityC0921.f3539 == c21282) {
            activityC0921.f3539 = null;
            activityC0921.f3543 = null;
            activityC0921.f3521 = null;
            activityC0921.f3542 = null;
            activityC0921.f3530 = null;
            activityC0921.f3531 = null;
            activityC0921.f3532 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3297(ActivityC0921 activityC0921, MenuItem menuItem) {
        AbstractC13921 abstractC13921;
        String str;
        if (activityC0921.f3533 != null) {
            if (menuItem.getItemId() == 1) {
                activityC0921.f3533.reload();
                return true;
            }
            if (menuItem.getItemId() == 2) {
                activityC0921.m3300();
                activityC0921.f3533.stopLoading();
                abstractC13921 = activityC0921.f3541.f16102;
                if (abstractC13921 instanceof AbstractC3163) {
                    activityC0921.f3544.m8386();
                    str = activityC0921.f3541.f16113;
                    C4813.m14032(str);
                }
                activityC0921.m3276(100, false);
                return true;
            }
            if (menuItem.getItemId() == 5) {
                activityC0921.m3306(true);
                return true;
            }
            if (menuItem.getItemId() == 3) {
                if (activityC0921.m3309()) {
                    activityC0921.f3529.m34959(C21238.m48208(activityC0921));
                }
                return true;
            }
            if (menuItem.getItemId() == 4) {
                activityC0921.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3296(boolean z) {
        int i;
        if (this.f3533 == null) {
            return;
        }
        int i2 = this.f3525;
        int[] iArr = f3516;
        if (z) {
            int i3 = 0;
            while (true) {
                if (i3 < 17) {
                    i = iArr[i3];
                    if (i > i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i = f3515;
                    break;
                }
            }
        } else {
            int i4 = 16;
            while (true) {
                if (i4 >= 0) {
                    i = iArr[i4];
                    if (i < i2) {
                        break;
                    } else {
                        i4--;
                    }
                } else {
                    i = f3513;
                    break;
                }
            }
        }
        if (i == i2) {
            return;
        }
        m3317(i);
        m3324();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m3324() {
        WebView webView = this.f3533;
        if (webView == null || webView.getWidth() <= 0) {
            return;
        }
        int max = Math.max(1, Math.round(this.f3533.getWidth() / this.f3533.getResources().getDisplayMetrics().density));
        WebView webView2 = this.f3533;
        StringBuilder m32308 = C13325.m32308(m3318(this.f3525), "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key='__mt_html_preview_viewport_7d26a6c9__';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content='',metas=head.getElementsByTagName('meta');for(var i=0;i<metas.length;i++){if((metas[i].name||'').toLowerCase()==='viewport'){nodes.push(metas[i]);content=metas[i].getAttribute('content')||'';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement('meta');meta.name='viewport';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content='width='+width+',initial-scale='+scale+',minimum-scale='+Math.min(scale,0.1)+',maximum-scale='+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute('content',content);}})(", ",");
        m32308.append(Math.max(1, max));
        m32308.append(");");
        webView2.evaluateJavascript(m32308.toString(), null);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m3317(int i) {
        int m3318 = m3318(i);
        this.f3525 = m3318;
        TextView textView = this.f3531;
        if (textView != null) {
            textView.setText(m3318 + "%");
        }
        FrameLayout frameLayout = this.f3530;
        if (frameLayout != null) {
            frameLayout.setEnabled(this.f3525 > f3513);
        }
        FrameLayout frameLayout2 = this.f3532;
        if (frameLayout2 != null) {
            frameLayout2.setEnabled(this.f3525 < f3515);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m3318(int i) {
        int min = Math.min(f3515, i);
        int i2 = f3513;
        int max = Math.max(i2, min);
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = f3516[i3];
            if (Math.abs(i4 - max) < Math.abs(i2 - max)) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void onBackPressed() {
        C14669 c14669 = this.f3529;
        if (c14669 == null || !c14669.m34960(new RunnableC7412(7, this))) {
            WebView webView = this.f3533;
            if (webView != null && webView.canGoBack()) {
                this.f3533.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m3304(ActivityC0921 activityC0921) {
        WebView webView = activityC0921.f3533;
        if (webView != null && webView.canGoBack()) {
            activityC0921.f3533.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3276(int i, boolean z) {
        this.f3528 = z;
        ProgressBar progressBar = this.f3535;
        if (progressBar != null) {
            progressBar.setProgress(i);
            this.f3535.setVisibility((!z || this.f3545) ? 8 : 0);
        }
        m3298();
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m3298() {
        MenuItem menuItem = this.f3537;
        boolean z = false;
        if (menuItem != null) {
            WebView webView = this.f3533;
            menuItem.setEnabled(webView != null && webView.canGoBack());
        }
        MenuItem menuItem2 = this.f3534;
        if (menuItem2 != null) {
            WebView webView2 = this.f3533;
            if (webView2 != null && webView2.canGoForward()) {
                z = true;
            }
            menuItem2.setEnabled(z);
        }
        MenuItem menuItem3 = this.f3543;
        if (menuItem3 != null) {
            menuItem3.setVisible(!this.f3528);
        }
        MenuItem menuItem4 = this.f3521;
        if (menuItem4 != null) {
            menuItem4.setVisible(this.f3528);
        }
        MenuItem menuItem5 = this.f3542;
        if (menuItem5 != null) {
            menuItem5.setEnabled(m3309());
        }
        m3317(this.f3525);
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m3309() {
        C5155 c5155;
        int i;
        String str;
        WebView webView = this.f3533;
        String url = webView == null ? null : webView.getUrl();
        if (url == null || (c5155 = this.f3541) == null) {
            return false;
        }
        i = c5155.f16107;
        if (i >= 0) {
            return false;
        }
        Uri parse = Uri.parse(url);
        str = this.f3541.f16113;
        return !C4813.m14031(parse, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m3313(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        if (this.f3533 == null || !m3322(str)) {
            return;
        }
        boolean m48208 = C21238.m48208(this);
        this.f3533.setBackgroundColor(m48208 ? Color.rgb(13, 17, 23) : -1);
        m3282(this.f3533, m48208);
        str2 = this.f3541.f16104;
        str3 = this.f3541.f16103;
        String uri = C6909.m18701(str2, str3).toString();
        final Bundle bundle = this.f3520;
        if (bundle == null) {
            str4 = "null";
        } else {
            str4 = "{x:" + bundle.getFloat("x") + ",y:" + bundle.getFloat("y") + l.d;
        }
        str5 = this.f3541.f16110;
        String quote = str5 != null ? JSONObject.quote(str5) : "null";
        WebView webView = this.f3533;
        StringBuilder sb = new StringBuilder("(function(){if(location.href.split('#')[0]!==");
        sb.append(JSONObject.quote(uri));
        sb.append("||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply(");
        sb.append(m48208);
        sb.append(",");
        i = this.f3541.f16107;
        sb.append(i);
        sb.append(",");
        sb.append(str4);
        sb.append(",");
        sb.append(quote);
        sb.append(",function(state){window.__mtMarkdownState.save(");
        str6 = this.f3522.f57604;
        sb.append(JSONObject.quote(str6));
        sb.append(",state);});return true;})()");
        webView.evaluateJavascript(sb.toString(), new ValueCallback() { // from class: l.ܳۚ᩷
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ActivityC0921.m3287(ActivityC0921.this, bundle, (String) obj);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3287(ActivityC0921 activityC0921, Bundle bundle, String str) {
        if ("true".equals(str) && activityC0921.f3520 == bundle) {
            activityC0921.f3520 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m3322(String str) {
        int i;
        String str2;
        String str3;
        C5155 c5155 = this.f3541;
        if (c5155 == null) {
            return false;
        }
        i = c5155.f16107;
        if (i < 0 || str == null) {
            return false;
        }
        Uri build = Uri.parse(str).buildUpon().fragment(null).build();
        str2 = this.f3541.f16104;
        str3 = this.f3541.f16103;
        return build.equals(C6909.m18701(str2, str3));
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onPause() {
        WebView webView = this.f3533;
        if (webView != null) {
            webView.onPause();
        }
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(false);
        }
        super.onPause();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(this.f3545);
        }
        WebView webView = this.f3533;
        if (webView != null) {
            webView.onResume();
            m3313(this.f3533.getUrl());
        }
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f3533 != null) {
            Bundle bundle2 = new Bundle();
            this.f3533.saveState(bundle2);
            bundle.putBundle("web_view", bundle2);
            if (m3322(this.f3533.getUrl())) {
                Bundle bundle3 = new Bundle();
                float max = Math.max(0.01f, this.f3533.getScale());
                bundle3.putFloat("x", this.f3533.getScrollX() / max);
                bundle3.putFloat("y", this.f3533.getScrollY() / max);
                bundle.putBundle("markdown_scroll", bundle3);
            }
        }
        C19267 c19267 = this.f3540;
        bundle.putBoolean("preview_resources_allowed", c19267.f60641);
        bundle.putString("source_label", c19267.f60642);
        bundle.putInt("zoom_percent", this.f3525);
        bundle.putBoolean("fullscreen", this.f3545);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C5155 c5155;
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(false);
        }
        C14669 c14669 = this.f3529;
        if (c14669 != null) {
            c14669.m34958();
        }
        C18561 c18561 = this.f3522;
        if (c18561 != null) {
            C18561.m43102(c18561);
            WebView webView = this.f3533;
            if (webView != null) {
                webView.removeJavascriptInterface("__mtMarkdownState");
            }
        }
        C21282 c21282 = this.f3539;
        if (c21282 != null) {
            c21282.m48299();
            this.f3539 = null;
        }
        C5155 c51552 = this.f3541;
        C4813.m14033(c51552 == null ? null : c51552.f16113);
        m3300();
        WebView webView2 = this.f3533;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        C2676 c2676 = this.f3544;
        if (c2676 != null) {
            c2676.close();
            this.f3544 = null;
        }
        WebView webView3 = this.f3533;
        if (webView3 != null) {
            webView3.setWebChromeClient(null);
            this.f3533.setWebViewClient(new WebViewClient());
            this.f3533.clearHistory();
            ViewGroup viewGroup = (ViewGroup) this.f3533.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f3533);
            }
            this.f3533.destroy();
            this.f3533 = null;
        }
        if (!isChangingConfigurations() && (c5155 = this.f3541) != null) {
            f3514.remove(this.f3523, c5155);
            this.f3541.close();
            this.f3541 = null;
        }
        super.onDestroy();
    }
}
