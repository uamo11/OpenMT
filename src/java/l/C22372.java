package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.text.GetChars;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import com.alipay.sdk.m.c0.d;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* compiled from: 3B3L */
/* renamed from: l.᩹ܶᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22372 extends AbstractC1582 {

    /* renamed from: ۠᩹ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f72485;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f72486;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C16832 f72489;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C23888 f72491;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f72492;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f72493;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f72494;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f72495;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6273 f72496;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C19677 f72497;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C13328 f72499;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C4028 f72500;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C18845 f72501;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f72502;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f72503;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15545 f72504;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C21565 f72505;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C11915 f72506;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f72508;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C5652 f72509;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72510;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C19656 f72511;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C23077 f72513;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public ResultCallback f72514;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f72515;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C4301 f72516;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12392 f72517;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public Runnable f72518;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f72512 = FutureC3575.m10905(null);

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C0604 f72487 = new C0604();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f72488 = new C1911(this);

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f72490 = 0;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Object f72498 = new Object();

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C4583 f72507 = new C4583();

    static {
        ApplicationC12518.m30701(158);
        f72485 = new short[]{81, 25580, 25565, 25536, 25548, 25494, 25536, 25557, 25556, 25494, 25563, 25556, 25561, 25547, 25547, 9241, -12663, -12648, -12642, -12656, -12649, -12642, -12634, -12644, -12643, -12656, -12659, -12656, -12649, -12642, -25933, -18869, 23773, -12620, -12627, -12588, -12630, -12672, -12649, -12659, -12648, -12671};
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private native void m50194();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private native void m50196(boolean z);

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private native void m50205();

    @Override // l.ComponentCallbacksC9205
    public native void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8967 m50142(final C22372 c22372, final C23077 c23077) {
        c22372.getClass();
        final C4028 c4028 = (C4028) m50178(new Callable() { // from class: l.ᩳ۠ᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4028 c40282;
                C19656 c19656;
                C19677 c19677;
                C19677 c196772;
                C19656 c196562;
                C22372 c223722 = C22372.this;
                c223722.getClass();
                final C4028 c40283 = new C4028(c223722, c23077);
                c40282 = c223722.f72500;
                if (c40282 != null) {
                    throw new IllegalStateException("A save capture is already waiting");
                }
                c223722.f72500 = c40283;
                C12392 c12392 = c40283.f12786;
                if (c12392 != null) {
                    c12392.m30326(c40283.f12792);
                }
                C9344 c9344 = c40283.f12791;
                if (c9344 != null) {
                    c9344.m24106(c40283.f12794);
                }
                c19656 = c223722.f72511;
                if (c19656 != null) {
                    c196562 = c223722.f72511;
                    FutureC3575 m45186 = c196562.m45186();
                    c40283.f12790 = m45186;
                    m45186.m10910(new InterfaceC8017() { // from class: l.ۖܶᩳ
                        @Override // l.InterfaceC8017
                        /* renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            C4028.this.m12126();
                        }
                    });
                }
                c19677 = c223722.f72497;
                if (c19677 != null) {
                    c196772 = c223722.f72497;
                    c40283.f12797 = c196772;
                    FutureC3575 m45254 = c196772.m45254();
                    c40283.f12795 = m45254;
                    m45254.m10910((InterfaceC8017) new C6955(1, c40283));
                }
                c40283.m12126();
                return c40283;
            }
        });
        try {
            try {
                return (C8967) c4028.f12793.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Exception) {
                    throw ((Exception) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        } catch (Throwable th) {
            m50178(new Callable() { // from class: l.ܿ۠ᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CancellationException cancellationException = new CancellationException("Saving observation ended");
                    C4028 c40282 = C4028.this;
                    c40282.m12125(cancellationException);
                    C8967 c8967 = c40282.f12784;
                    if (c8967 == null) {
                        return null;
                    }
                    c8967.close();
                    return null;
                }
            });
            throw th;
        }
    }

    public C22372() {
        setHasOptionsMenu(true);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50232() {
        this.f5606.remove("temp");
        C9344 c9344 = this.f5607;
        if (c9344 != null) {
            c9344.m24120(false);
        }
        mo5408("temp");
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72508 = false;
        this.f72499 = ViewOnClickListenerC19121.m44079(this, new C11084(this));
        this.f72496 = ViewOnClickListenerC19121.m44073(this, new C8762(this));
        this.f72509 = C8474.m22146(this, new C23786(1, this));
        if (bundle != null) {
            this.f72490 = bundle.getLong("xmlTransFileTime", 0L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50149(C22372 c22372, int i) {
        if (i == 2) {
            c22372.m50171();
        }
    }

    @Override // l.AbstractC1582
    /* renamed from: ܺ */
    public final boolean mo5419() {
        return this.f5606.getBoolean("temp", false);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f5607.m24110(this, view.findViewById(R.id.MT_Protector_res_0x7f0a02e5), (C12392) view.findViewById(R.id.MT_Protector_res_0x7f0a0613));
        this.f5607.m24143(getResources().getBoolean(R.bool.MT_Protector_res_0x7f050009));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.MT_Protector_res_0x7f0a0458);
        C10392 c10392 = new C10392((ActivityC16315) requireActivity());
        c10392.m26205(false);
        c10392.m26203();
        progressBar.setIndeterminateDrawable(c10392);
        this.f5607.m24111(this, progressBar);
        final TextView textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a02d1);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a04bb);
        this.f5607.m24112(this, textView);
        this.f5607.m24129(this, textView2);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֨ᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C22372.this.m50143(view2);
            }
        });
        textView2.setOnClickListener(new ViewOnClickListenerC2205(0, this));
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۠֨ᩳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C4925.m14314((CharSequence) textView.getText().toString());
                return true;
            }
        });
        C12392 c12392 = (C12392) view.findViewById(R.id.MT_Protector_res_0x7f0a0613);
        this.f72517 = c12392;
        c12392.m30328(this.f72488);
        C12392 c123922 = this.f72517;
        C9344 c9344 = this.f5607;
        C11003.requireNonNull(c9344);
        c123922.m30335(new C19264(c9344));
        this.f72517.m30327(new C6270(this));
        this.f72502 = bundle == null ? null : bundle.getString("editSessionIdOnStart");
        this.f72494 = bundle == null ? 0L : bundle.getLong("editSessionMarkOnStart");
        InterfaceC23586 viewLifecycleOwner = getViewLifecycleOwner();
        C12392 c123923 = this.f72517;
        C11003.requireNonNull(c123923);
        this.f72507.m13483(viewLifecycleOwner, new C8762(c123923));
        this.f72516 = new C4301(view, this.f72517);
        C15545 c15545 = new C15545((ActivityC16315) requireActivity(), this.f72517, TextBundle.TEXT_ENTRY, new C18139(this, view));
        this.f72504 = c15545;
        c15545.m36683(getViewLifecycleOwner(), this.f72516, ActivityC8638.class);
        this.f72517.m30334(new C17433(this));
        this.f72517.m30330(new InterfaceC8035() { // from class: l.֡۠ᩳ
            @Override // l.InterfaceC8035
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo1646(int i, int i2) {
                C22372.this.m50215();
            }
        });
        this.f72517.m30338(new C14610(this));
        m50198();
        m50215();
        this.f72503 = true;
        this.f72516.m12888();
        m50218(-1, true, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50152(C22372 c22372, View view) {
        int i;
        if (c22372.m50213() || c22372.m50192() || c22372.m50195()) {
            i = C14776.f45134;
        } else {
            C23077 c23077 = c22372.f72513;
            i = c23077 == null ? -1 : c23077.f74223;
        }
        if (i != -1 && !c22372.m50167()) {
            c22372.m50180(i);
        } else {
            c22372.m50143(view);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50157(C22372 c22372, C4342 c4342, RuntimeException runtimeException) {
        C12392 c12392;
        if (c22372.f72503 && (c12392 = c22372.f72517) != null && c12392.m30436() == c4342) {
            C16832 c16832 = c22372.f72489;
            if (c16832 != null) {
                c16832.m39612();
                c22372.f72489 = null;
            }
            c22372.m5421(true);
            c22372.f72517.m30407(true);
            c22372.f5603.m46502((Throwable) runtimeException);
        }
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("editSessionIdOnStart", this.f72502);
        bundle.putLong("editSessionMarkOnStart", this.f72494);
        bundle.putLong("transFileTime", this.f72490);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50145(final C4733 c4733) {
        C19258 buildDialog = ((ActivityC16315) requireActivity()).buildDialog();
        buildDialog.m44436(m50239());
        buildDialog.m44424(getString(R.string.MT_Protector_res_0x7f120806, c4733.f15019.getName()));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC20675(1, this, c4733));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ܶ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22372 c22372 = C22372.this;
                c22372.f72517.m30456(true);
                c22372.m5409(true);
                c22372.m5407(c4733.f15019.mo23117());
            }
        });
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = m44438;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50180(int i) {
        ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
        C12392 c12392 = this.f72517;
        C11915 c11915 = this.f72506;
        int[] m30369 = c12392.m30369();
        Charset m35151 = C14776.m35151(i);
        new C21151(c12392, c11915, m30369, activityC16315, m35151, c12392.m30531().getBytes(m35151).length).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m50181(C4733 c4733) {
        C19258 buildDialog = ((ActivityC16315) requireActivity()).buildDialog();
        buildDialog.m44436(m50239());
        int i = 0;
        buildDialog.m44424(getString(R.string.MT_Protector_res_0x7f1204d7, c4733.f15019.getName()));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1204cd, new DialogInterfaceOnClickListenerC9261(i, this));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f120873, new DialogInterfaceOnClickListenerC8555(this, c4733, i));
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = m44438;
    }

    @Override // l.ComponentCallbacksC9205
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View m38460 = ((ActivityC16315) requireActivity()).m38460(R.layout.MT_Protector_res_0x7f0d0054);
        if (m38460 == null) {
            m38460 = super.onCreateView(layoutInflater, viewGroup, bundle);
            C11003.requireNonNull(m38460);
        }
        C4925.m14316(new RunnableC1126(1, this), 600L);
        C7261.f22281.m1668(getViewLifecycleOwner(), new C21235(1, this));
        return m38460;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50218(final int i, final boolean z, final boolean z2) {
        Point point;
        C19656 c19656;
        C12392 c12392;
        if (this.f72493) {
            return;
        }
        if (this.f72501 != null) {
            this.f72518 = new Runnable() { // from class: l.ۙ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372.this.m50218(i, z, z2);
                }
            };
            if (!this.f72503 || (c12392 = this.f72517) == null) {
                return;
            }
            c12392.m30412(true);
            this.f5607.m24114(this, true);
            return;
        }
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            this.f72518 = new Runnable() { // from class: l.ۗ֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372.this.m50218(i, z, z2);
                }
            };
            c19677.m45248();
            return;
        }
        boolean m5410 = m5410();
        this.f72510 = m5410;
        if (!m5410 && !z && !m5420().f15019.mo23120()) {
            this.f5603.m46502((Throwable) new FileNotFoundException(m5420().f15019.mo23554()));
            this.f72508 = true;
            return;
        }
        Point point2 = new Point();
        if (z2 && (c19656 = this.f72511) != null) {
            point = c19656.m45189();
            point2 = this.f72511.m45190();
        } else if (z2 && this.f72503) {
            C12392 c123922 = this.f72517;
            point = c123922.m30472(c123922.m30444());
            point2.x = this.f72517.getScrollX();
            point2.y = this.f72517.m30408();
        } else {
            point = null;
        }
        final Point point3 = point;
        final Point point4 = point2;
        C19656 c196562 = this.f72511;
        if (c196562 != null || this.f72506 != null) {
            if (c196562 != null) {
                C12392 c123923 = c196562.f63452;
                C12392 c123924 = this.f72517;
                if (c123923 != c123924 && this.f72503) {
                    if (this.f72505 == null) {
                        this.f72505 = c123924.m30539();
                    }
                    this.f5607.m24114(this, true);
                }
            }
            this.f72518 = new Runnable() { // from class: l.۬֨ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372.this.m50228(z, i, point3, point4);
                }
            };
            m50203(false);
            return;
        }
        m50228(z, i, point3, point4);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        if (this.f72503) {
            ((ActivityC16315) requireActivity()).m10236(this.f72517);
            if (this.f72504.m36684() && this.f72503) {
                this.f72516.m12888();
            }
        }
        m50237();
        m50177();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m50237() {
        ActivityC0737 activity = getActivity();
        if (activity == null || !((ActivityC16315) activity).m38456()) {
            boolean z = ApplicationC20075.f65010.getBoolean("check_file_time", true);
            boolean z2 = ApplicationC20075.f65010.getBoolean("check_file_exists", true);
            if ((z2 || z) && isResumed() && !m5414() && m5417() && !m5410()) {
                C4733 m5420 = m5420();
                AbstractC15440 abstractC15440 = m5420.f15019;
                if (abstractC15440.getClass() == C14798.class) {
                    return;
                }
                boolean mo23120 = abstractC15440.mo23120();
                Bundle bundle = this.f5606;
                if (!mo23120) {
                    if (z2 && bundle.getBoolean("checkFileExists")) {
                        m50181(m5420);
                        return;
                    }
                    return;
                }
                if (z) {
                    long j = bundle.getLong("fileTime", -1L);
                    if (j == -1 || abstractC15440.mo23117() == j) {
                        return;
                    }
                    m50145(m5420);
                }
            }
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m50233() {
        if (this.f72493) {
            return;
        }
        final InterfaceC20758 m25230 = C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(m25230) && this.f72506 == null && this.f72497 == null && this.f72501 == null) {
            final C14987 m5411 = m5411();
            C1802.m5993().postDelayed(new Runnable() { // from class: l.۟ۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372 c22372 = C22372.this;
                    C14987 c14987 = m5411;
                    C7932 m35517 = c14987.m35517();
                    try {
                        if (m35517 == null) {
                            return;
                        }
                        try {
                            c22372.m5418().mo23552();
                            C17852.m41824(c22372.m5412()).mo23552();
                            synchronized (c14987.f45700) {
                                C17852.m41820(c22372.m5412()).mo23552();
                            }
                            if (c22372.f5606.getBoolean("pageMode")) {
                                int m5423 = c22372.m5423();
                                for (int i = 0; i < m5423; i++) {
                                    C17852.m41822(c22372.m5412() + "-" + i).mo23552();
                                }
                            }
                        } catch (Error | RuntimeException e) {
                            m35517.m21239(e);
                            throw e;
                        }
                    } finally {
                        m35517.close();
                    }
                }
            }, 500L);
            return;
        }
        this.f72493 = true;
        this.f72518 = null;
        C16832 c16832 = this.f72489;
        if (c16832 != null) {
            c16832.m39612();
            this.f72489 = null;
        }
        FutureC3575 m10905 = FutureC3575.m10905(null);
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            m10905 = c19677.m45254().m10911((InterfaceC15071) new C17021());
            this.f72497.m45248();
        }
        FutureC3575 m109052 = (this.f72506 == null && this.f72511 == null) ? FutureC3575.m10905(null) : m50203(true);
        C18845 c18845 = this.f72501;
        FutureC3575 m109053 = c18845 == null ? FutureC3575.m10905(null) : c18845.f59440;
        final C22477 m50424 = C22477.m50424(m25230);
        FutureC3575 m10911 = this.f72512.m10911((InterfaceC15071) new C23202(6));
        FutureC3575 m50427 = m50424.m50427();
        C1802.m5993().removeCallbacksAndMessages(this.f5604);
        FutureC3575.m10898(m10905, m109052, m109053, m10911, m50427, m5411().m35515()).m10920(new Runnable() { // from class: l.ܳ֨ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C23721.m52302(m25230);
                    C22372 c22372 = C22372.this;
                    c22372.m5418().mo23552();
                    C17852.m41824(c22372.m5412()).mo23552();
                    C17852.m41820(c22372.m5412()).mo23552();
                    if (c22372.f5606.getBoolean("pageMode")) {
                        int m5423 = c22372.m5423();
                        for (int i = 0; i < m5423; i++) {
                            C17852.m41822(c22372.m5412() + "-" + i).mo23552();
                        }
                    }
                } catch (IOException e) {
                    throw new C13452(e);
                }
            }
        }, C1802.f6209).m10910(new InterfaceC8017() { // from class: l.᩻֨ᩳ
            @Override // l.InterfaceC8017
            /* renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C20256 c20256;
                m50424.m50428(th);
                if (th == null || (c20256 = C22372.this.f5603) == null) {
                    return;
                }
                c20256.m46502(th);
            }
        });
    }

    @Override // l.AbstractC1582
    /* renamed from: ֫ */
    public final void mo5408(String... strArr) {
        final InterfaceC20758 m25230 = C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(m25230) && this.f72497 == null && this.f72506 == null) {
            AbstractC15440 m41820 = C17852.m41820(m5412());
            final C14987 m5411 = m5411();
            final RunnableC8450 runnableC8450 = new RunnableC8450(m41820, this.f5606, m5411.f45700);
            C1802.m5991(new Runnable() { // from class: l.ܰۖᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8450 runnableC84502 = runnableC8450;
                    C7932 m35517 = C14987.this.m35517();
                    try {
                        if (m35517 == null) {
                            return;
                        }
                        try {
                            runnableC84502.m22126();
                            m35517.close();
                        } catch (IOException e) {
                            m35517.m21239(e);
                            m35517.close();
                        } catch (Error e2) {
                            e = e2;
                            m35517.m21239(e);
                            throw e;
                        } catch (RuntimeException e3) {
                            e = e3;
                            m35517.m21239(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        m35517.close();
                        throw th;
                    }
                }
            }, this.f5604, 200L);
            return;
        }
        if (this.f72493 || strArr.length == 0) {
            return;
        }
        final C0604 c0604 = new C0604();
        c0604.m2481(this.f5606, strArr);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new Runnable() { // from class: l.᩸۠ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C22372.this.m50147(m25230, c0604);
                }
            });
            return;
        }
        C18845 c18845 = this.f72501;
        if (c18845 != null) {
            c18845.f59442.m2481(this.f5606, strArr);
        }
        m50147(m25230, c0604);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50147(final InterfaceC20758 interfaceC20758, final C0604 c0604) {
        FutureC3575 m10905;
        if (this.f72493) {
            return;
        }
        if (this.f72497 != null) {
            this.f72487.m2482(c0604);
            m10905 = this.f72497.m45254().m10911((InterfaceC15071) new C9967());
        } else {
            m10905 = FutureC3575.m10905(Boolean.FALSE);
        }
        if (this.f72506 != null && this.f72511 == null && this.f72503) {
            return;
        }
        final C22477 m50424 = C22477.m50424(interfaceC20758);
        final C6417 c6417 = C23350.f75019;
        this.f72512 = FutureC3575.m10898(this.f72512, m10905.m10927(new InterfaceC21423() { // from class: l.ۛ֨ᩳ
            @Override // l.InterfaceC21423
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C22477 c22477 = m50424;
                if (booleanValue) {
                    c22477.m50428((Throwable) null);
                    return FutureC3575.m10905(null);
                }
                FutureC3575 m50427 = c22477.m50427();
                final C22372 c22372 = C22372.this;
                final InterfaceC20758 interfaceC207582 = interfaceC20758;
                final C0604 c06042 = c0604;
                final C6417 c64172 = c6417;
                return m50427.m10920(new Runnable() { // from class: l.ܽ۠ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22372.m50164(C22372.this, interfaceC207582, c06042, c64172);
                    }
                }, c64172.f19852);
            }
        }).m10910(new InterfaceC8017() { // from class: l.ۨ֨ᩳ
            @Override // l.InterfaceC8017
            /* renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C20256 c20256;
                m50424.m50428((Throwable) null);
                if (th == null || (c20256 = C22372.this.f5603) == null) {
                    return;
                }
                c20256.m46502(th);
            }
        }));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50164(C22372 c22372, InterfaceC20758 interfaceC20758, C0604 c0604, C6417 c6417) {
        if (c22372.f72493) {
            return;
        }
        try {
            C11915.m29060(interfaceC20758, c0604, c6417);
        } catch (IOException e) {
            throw new C13452(e);
        }
    }

    @Override // l.AbstractC1582
    /* renamed from: ֡ */
    public final void mo5405() {
        if (!C20529.m47015(C10050.m25230(m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]))) && this.f72497 == null && this.f72506 == null) {
            AbstractC15440 m41820 = C17852.m41820(m5412());
            C1802.m5993().removeCallbacksAndMessages(this.f5604);
            C14987 m5411 = m5411();
            RunnableC8450 runnableC8450 = new RunnableC8450(m41820, this.f5606, m5411.f45700);
            C7932 m35517 = m5411.m35517();
            try {
                if (m35517 == null) {
                    return;
                }
                try {
                    runnableC8450.m22126();
                    m35517.close();
                } catch (IOException e) {
                    m35517.m21239(e);
                    m35517.close();
                } catch (Error e2) {
                    e = e2;
                    m35517.m21239(e);
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    m35517.m21239(e);
                    throw e;
                }
            } catch (Throwable th) {
                m35517.close();
                throw th;
            }
        }
    }

    @Override // l.AbstractC1582, l.ComponentCallbacksC9205
    public final void onPause() {
        super.onPause();
        ((ActivityC16315) requireActivity()).m10234();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        C4028 c4028 = this.f72500;
        if (c4028 != null) {
            c4028.m12125(new CancellationException("Saving view was destroyed"));
        }
        this.f72486 = null;
        super.onDestroyView();
        if (this.f72497 == null && this.f72506 != null && this.f72511 == null) {
            m50203(true);
        }
        C19656 c19656 = this.f72511;
        if (c19656 != null) {
            c19656.m45185();
        }
        this.f72503 = false;
        this.f72518 = null;
        if (this.f72505 != null) {
            this.f72517.m30412(false);
            this.f72517.m30342(this.f72505);
            this.f72505 = null;
            if (this.f72511 == null && this.f72497 == null && this.f72501 == null) {
                this.f5607.m24114(this, false);
            }
        }
        C19677 c19677 = this.f72497;
        if (c19677 != null) {
            c19677.m45252();
        }
        C15545 c15545 = this.f72504;
        if (c15545 != null && (c19656 == null || c19656.f63452 != this.f72517)) {
            c15545.m36695();
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f72495;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        this.f72495 = null;
        C12392 c12392 = this.f72517;
        if (c12392 != null) {
            c12392.m30327((C6270) null);
            if (c19656 != null) {
                C12392 c123922 = c19656.f63452;
                C12392 c123923 = this.f72517;
                if (c123922 == c123923) {
                    c123923.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                }
            }
            if (c19677 != null) {
                C12392 c123924 = c19677.f63579;
                C12392 c123925 = this.f72517;
                if (c123924 == c123925) {
                    c123925.m30338((InterfaceC19449) null);
                    this.f72517.m30335((InterfaceC14528) null);
                }
            }
            if (this.f72517.m30436() instanceof C4342) {
                this.f72517.m30338((InterfaceC19449) null);
                this.f72517.m30335((InterfaceC14528) null);
                this.f72517.mo25910((CharSequence) "");
            } else if (this.f72517.m30436().mo1607()) {
                final C20256 c20256 = this.f5603;
                m5411().m35516(this.f72517.m30436(), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ᩴ֨ᩳ
                    @Override // l.InterfaceC8017
                    /* renamed from: ۧ */
                    public final void mo4663(Object obj, Throwable th) {
                        C20256 c202562;
                        if (th == null || (c202562 = C20256.this) == null) {
                            return;
                        }
                        c202562.m46502(th);
                    }
                });
            }
        }
        this.f72491 = null;
        this.f72515 = 0;
        this.f72516 = null;
        this.f72517 = null;
        this.f72504 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50165(C22372 c22372, InterfaceMenuC23000 interfaceMenuC23000, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, Boolean bool) {
        C23077 c23077;
        interfaceMenuC23000.findItem(R.id.MT_Protector_res_0x7f0a0375).setTitle(bool.booleanValue() ? R.string.MT_Protector_res_0x7f1201d8 : R.string.MT_Protector_res_0x7f1205fc);
        boolean booleanValue = bool.booleanValue();
        int i = R.string.MT_Protector_res_0x7f1204c7;
        if (booleanValue) {
            menuItem.setVisible(false);
            c22372.f5607.m24137(c22372.m50195());
            c22372.f5607.m24134(false);
            menuItem2.setTitle(R.string.MT_Protector_res_0x7f1204c7);
        } else {
            menuItem.setVisible(true);
            menuItem.setTitle(R.string.MT_Protector_res_0x7f120611);
            String lowerCase = c22372.m5420().m10174().toLowerCase();
            boolean equals = lowerCase.equals(".smali");
            boolean equals2 = lowerCase.equals(".jasm");
            c22372.f5607.m24137(equals || equals2);
            c22372.f5607.m24134(equals);
            if (!equals2) {
                i = R.string.MT_Protector_res_0x7f1209ad;
            }
            menuItem2.setTitle(i);
        }
        if (bool.booleanValue() && (c23077 = c22372.f72513) != null && c23077.m51241() && c22372.f72513.f74222 > 0) {
            menuItem3.setVisible(true);
            C9344 c9344 = c22372.f5607;
            C12534 c12534 = c22372.f72513.f74221;
            c9344.m24139((c12534 == null || c12534.m30769() == null || !ActivityC16315.m38430()) ? false : true);
            return;
        }
        menuItem3.setVisible(false);
    }

    @Override // l.ComponentCallbacksC9205
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String name;
        C13328 c13328;
        int i = 1;
        if (this.f5607.m24142()) {
            return true;
        }
        this.f72517.m30443();
        int itemId = menuItem.getItemId();
        final int i2 = 0;
        r9 = false;
        boolean z = false;
        if (itemId == R.id.more) {
            menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a0536).setChecked(this.f72517.m30437());
            menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a034e).setVisible("HTML".equalsIgnoreCase(this.f72504.m36694()) || "Markdown".equalsIgnoreCase(this.f72504.m36694()));
            MenuItem findItem = menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a0332);
            if (this.f72517.m30491() == null) {
                findItem.setVisible(false);
            } else {
                findItem.setVisible(true);
                if (C23196.m51454() && ApplicationC20075.f65008.getBoolean("cc", true)) {
                    z = true;
                }
                findItem.setChecked(z);
            }
            this.f5607.m24131(this.f72517.m30374());
            this.f5607.m24141(this.f72517.m30514());
            if (m50202()) {
                menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a038f).setVisible(C5916.m16579((GetChars) this.f72517.m30436()));
                return true;
            }
            menuItem.getSubMenu().findItem(R.id.MT_Protector_res_0x7f0a038f).setVisible(m50191());
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a036e) {
            if (!m5426()) {
                m50218(-1, false, true);
                return true;
            }
            C19258 buildDialog = ((ActivityC16315) requireActivity()).buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f1205f7);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC8680(i, this));
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0331) {
            ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
            if (!m5426()) {
                activityC16315.m38448(this);
                return true;
            }
            C19258 buildDialog2 = activityC16315.buildDialog();
            buildDialog2.m44436(m50239());
            buildDialog2.m44416(R.string.MT_Protector_res_0x7f1208cd);
            buildDialog2.m44442(R.string.MT_Protector_res_0x7f1208c4, new DialogInterfaceOnClickListenerC14904(this, activityC16315, i2));
            buildDialog2.m44434(R.string.MT_Protector_res_0x7f1202c2, new DialogInterfaceOnClickListenerC21256(this, activityC16315, i2));
            buildDialog2.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a038a) {
            this.f72504.m36696();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0380) {
            this.f72504.m36676(ActivityC8638.class);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a035b || itemId == R.id.MT_Protector_res_0x7f0a035c) {
            m50232();
            m5425();
            DialogInterfaceOnClickListenerC10816.m27034(R.string.MT_Protector_res_0x7f1205e7, (ActivityC16315) requireActivity(), "menu_keep_in_editor_tip");
            return true;
        }
        if (m5414()) {
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a036f) {
            int i3 = C14776.f45125;
            String[] strArr = new String[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                strArr[i4] = C14776.m35153(i4);
            }
            final int[] iArr = {this.f72513.f74223};
            C19258 buildDialog3 = ((ActivityC16315) requireActivity()).buildDialog();
            buildDialog3.m44433(R.string.MT_Protector_res_0x7f1205f8);
            buildDialog3.m44429(strArr, this.f72513.f74223, new DialogInterfaceOnClickListenerC21259(i, iArr));
            buildDialog3.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֨֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    C22372.m50166(C22372.this, iArr, dialogInterface);
                }
            });
            buildDialog3.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog3.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0375) {
            ActivityC16315 activityC163152 = (ActivityC16315) requireActivity();
            if (!m5410() || (c13328 = this.f72499) == null) {
                m50221(activityC163152, (ResultCallback) null);
                return true;
            }
            this.f72514 = null;
            c13328.m32311(null, R.string.MT_Protector_res_0x7f1205fc, m5420().f15019.getName(), Bundle.EMPTY);
            return true;
        }
        Bundle bundle = this.f5606;
        if (itemId == R.id.MT_Protector_res_0x7f0a0377) {
            AbstractC15440 abstractC15440 = m5420().f15019;
            String string = bundle.getString("save_as_path");
            if (string == null) {
                string = abstractC15440.getParent();
            }
            this.f72514 = null;
            this.f72499.m32311(string, R.string.MT_Protector_res_0x7f1205fd, abstractC15440.getName(), Bundle.EMPTY);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a033e) {
            C4733 m5420 = m5420();
            String string2 = bundle.getString("save_as_path");
            if (string2 == null) {
                string2 = m5420.f15019.getParent();
            }
            C6273 c6273 = this.f72496;
            String str = m5420.m10173() + "_plain" + m5420.m10174();
            c6273.getClass();
            C6273.m17282(c6273, R.string.MT_Protector_res_0x7f120353, string2, str, (String[]) null, 24);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a037f) {
            int i5 = C14776.f45125;
            String[] strArr2 = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr2[i6] = C14776.m35153(i6);
            }
            C19258 buildDialog4 = ((ActivityC16315) requireActivity()).buildDialog();
            buildDialog4.m44433(R.string.MT_Protector_res_0x7f120605);
            buildDialog4.m44429(strArr2, this.f72513.f74223, new DialogInterface.OnClickListener() { // from class: l.᩺֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C22372.m50185(C22372.this, dialogInterface, i7);
                }
            });
            buildDialog4.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog4.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a035d) {
            String[] strArr3 = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
            final String[] strArr4 = {"\r\n", "\r", "\n"};
            String m30531 = this.f72517.m30531();
            m30531.getClass();
            if (m30531.equals("\r")) {
                i2 = 1;
            } else if (!m30531.equals("\r\n")) {
                i2 = 2;
            }
            C19258 buildDialog5 = ((ActivityC16315) requireActivity()).buildDialog();
            buildDialog5.m44433(R.string.MT_Protector_res_0x7f120519);
            buildDialog5.m44429(strArr3, i2, new DialogInterface.OnClickListener() { // from class: l.۫֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C22372 c22372 = C22372.this;
                    if (i7 != i2) {
                        c22372.f72517.m30499(strArr4[i7]);
                        c22372.f72517.m30456(true);
                    } else {
                        c22372.getClass();
                    }
                    dialogInterface.dismiss();
                }
            });
            buildDialog5.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog5.m44438();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0387) {
            C23077 c23077 = this.f72513;
            if (c23077 == null) {
                return true;
            }
            m50180(c23077.f74223);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0484) {
            this.f72517.m30407(!r0.m30441());
            this.f5607.m24145(this.f72517.m30441());
            this.f72504.m36693();
            if (!this.f72503) {
                return true;
            }
            this.f72516.m12888();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0282) {
            if (this.f72513.f74221.m30769() == null) {
                ((ActivityC16315) requireActivity()).m10217(R.string.MT_Protector_res_0x7f120a76, R.string.MT_Protector_res_0x7f1200f6, false);
                return true;
            }
            ActivityC16315 activityC163153 = (ActivityC16315) requireActivity();
            int i7 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC163153);
            c19258.m44433(R.string.MT_Protector_res_0x7f120b7b);
            c19258.m44416(R.string.MT_Protector_res_0x7f120807);
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC3616(this, menuItem, i2));
            c19258.m44438();
            return true;
        }
        try {
            if (itemId == R.id.MT_Protector_res_0x7f0a0352) {
                C10130 c10130 = new C10130();
                String obj = this.f72517.m30436().toString();
                C2134 c2134 = new C2134(this.f72513.f74221);
                c2134.m7056(this.f72513.f74225);
                c2134.m7058(this.f72513.f74224);
                c2134.m7055(obj);
                c2134.m7057(c10130);
                Intent intent = new Intent((ActivityC16315) requireActivity(), (Class<?>) ActivityC19887.class);
                intent.putExtra(e.m, c10130.m25429());
                AbstractC15440 abstractC154402 = this.f72513.f74220;
                if (abstractC154402 != null) {
                    intent.putExtra("arscPath", abstractC154402.mo23554());
                }
                startActivity(intent);
                return true;
            }
            if (itemId == R.id.MT_Protector_res_0x7f0a038d) {
                if (m5410()) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f1208ce);
                    return true;
                }
                C15068 m24909 = C9840.m24909(this.f72517.m30436().toString(), (String) null);
                C10130 c101302 = new C10130();
                c101302.mo13231(o.a.h);
                m24909.mo1516(c101302);
                String m35657 = m24909.m35657();
                C16293.f50113.m36526(m35657 + ".mtsx.bin").m36496(c101302);
                Intent intent2 = new Intent((ActivityC16315) requireActivity(), (Class<?>) ActivityC16440.class);
                intent2.putExtra("syntaxName", m24909.m35657());
                intent2.setData(C16999.m39866(m5420().f15019.mo23554() + "_preview", new String[0]).m36522());
                startActivity(intent2);
                return true;
            }
            if (itemId == R.id.MT_Protector_res_0x7f0a034e) {
                ActivityC16315 activityC163154 = (ActivityC16315) requireActivity();
                InterfaceC7785 m30436 = this.f72517.m30436();
                String m305312 = this.f72517.m30531();
                boolean m5410 = m5410();
                AbstractC15440 abstractC154403 = m5420().f15019;
                String mo23554 = m5410 ? null : abstractC154403.mo23554();
                String name2 = abstractC154403.getName();
                boolean equalsIgnoreCase = "Markdown".equalsIgnoreCase(this.f72504.m36694());
                boolean m48208 = C21238.m48208(activityC163154);
                int m30525 = equalsIgnoreCase ? this.f72517.m30525() : 0;
                boolean z2 = (equalsIgnoreCase || mo23554 == null || (name = abstractC154403.getName()) == null || !".mhtml".equalsIgnoreCase(AbstractC15440.m36487(name))) ? false : true;
                new C23783(this, z2 ? this.f72513.f74223 : C14776.f45134, m30436, m305312, activityC163154, z2, equalsIgnoreCase, m30525, name2, m48208, mo23554).m20274();
                return true;
            }
            if (itemId == R.id.MT_Protector_res_0x7f0a0383) {
                m50171();
                return true;
            }
            if (itemId == R.id.MT_Protector_res_0x7f0a0384) {
                new C1742((ActivityC16315) requireActivity(), C1742.m5819(this.f72517));
                return true;
            }
            if (itemId != R.id.MT_Protector_res_0x7f0a0332) {
                if (itemId != R.id.MT_Protector_res_0x7f0a038f) {
                    this.f72504.m36690(menuItem);
                    return true;
                }
                if (m50202()) {
                    new C6850(this, (ActivityC16315) requireActivity(), m5412(), C16293.f50117.m36526("xmlTrans")).m20274();
                    return true;
                }
                if (!m50191()) {
                    throw new RuntimeException();
                }
                new C20962(this, (ActivityC16315) requireActivity(), m5412(), C16293.f50117.m36526("jsonTrans")).m20274();
                return true;
            }
            if (!C23196.m51460()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120757);
                new ViewOnClickListenerC0059((ActivityC16315) requireActivity());
                return true;
            }
            if (!C23196.m51454()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120415);
                return true;
            }
            if (this.f72517.m30491() == null) {
                return true;
            }
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC20075.f65008.edit().putBoolean("cc", menuItem.isChecked()).apply();
            return true;
        } catch (Exception e) {
            m50144(e, (ActivityC16315) null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m50177() {
        if (this.f72490 == 0 || !isVisible() || m5414()) {
            return;
        }
        int i = 0;
        if (!this.f72503 || !this.f72508) {
            C4925.m14316(new RunnableC6438(i, this), 100L);
            return;
        }
        if (!m50202()) {
            if (m50191()) {
                AbstractC15440 m36526 = C16293.f50117.m36526("jsonTrans");
                if (!m36526.mo23120() || m36526.mo23117() == this.f72490) {
                    this.f72490 = 0L;
                    return;
                }
                try {
                    C21434 m14984 = AbstractC5206.m14984(m36526.m36489(), EnumC13671.OrderedField);
                    if (m5412().equals(m14984.m48553("<--id-c5skl23kjndf-->"))) {
                        C12450.m30608(m14984, this.f72517);
                        this.f72517.m30345(false);
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f72490 = 0L;
                    throw th;
                }
                this.f72490 = 0L;
                return;
            }
            return;
        }
        AbstractC15440 m365262 = C16293.f50117.m36526("xmlTrans");
        if (!m365262.mo23120() || m365262.mo23117() == this.f72490) {
            this.f72490 = 0L;
            return;
        }
        try {
            C21434 m149842 = AbstractC5206.m14984(m365262.m36489(), EnumC13671.OrderedField);
            if (m5412().equals(m149842.m48553("<--id-c5skl23kjndf-->"))) {
                C5916.m16578(m149842, this.f72517.m30436());
                this.f72517.m30345(false);
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            this.f72490 = 0L;
            throw th2;
        }
        this.f72490 = 0L;
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private boolean m50202() {
        C12392 c12392 = this.f72517;
        return (c12392 != null && DocumentReader.RESERVED.equalsIgnoreCase(c12392.m30440())) || m5420().f15019.getName().toLowerCase().endsWith(".xml");
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private boolean m50191() {
        C12392 c12392 = this.f72517;
        return (c12392 != null && "json".equalsIgnoreCase(c12392.m30440())) || m5420().f15019.getName().toLowerCase().endsWith(".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public void m50171() {
        if (!this.f72508) {
            C4925.m14316(new RunnableC9673(this, C9170.m23579(getViewLifecycleOwner())), 100L);
            return;
        }
        String lowerCase = m5420().m10174().toLowerCase();
        if (!m50195() && !lowerCase.equals(".jasm")) {
            if (lowerCase.equals(".smali")) {
                new C22167(this, (ActivityC16315) requireActivity()).m20274();
                return;
            }
            return;
        }
        new C20051(this, (ActivityC16315) requireActivity()).m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50160(C22372 c22372, C12392 c12392, boolean z, AtomicBoolean atomicBoolean, Point point, Point point2, C11915 c11915, Throwable th) {
        if (c22372.f72503 && c22372.f72517 == c12392) {
            if (th != null) {
                Throwable th2 = th;
                while ((th2 instanceof C13452) && th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                if (th2 instanceof CancellationException) {
                    return;
                }
                c22372.m5421(true);
                c22372.f72517.m30407(true);
                c22372.f5603.m46502(th);
                c22372.f72508 = true;
                return;
            }
            c22372.m50196(z);
            if (atomicBoolean.get()) {
                c22372.m50205();
            }
            if (z || point == null || point.x == -1) {
                return;
            }
            new C17000(c22372, c11915, point, point2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50228(final boolean z, final int i, final Point point, final Point point2) {
        C9344 c9344;
        String name;
        C11273 m41182;
        final C2931 c2931;
        byte[] bArr;
        byte[] bArr2;
        if (this.f5607 != null && Looper.myLooper() == Looper.getMainLooper()) {
            this.f5607.m24107(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper() && this.f72503 && this.f72517 != null && this.f72504 != null && (c9344 = this.f5607) != null && ((!c9344.m24142() || this.f72505 != null) && !this.f72517.m30370() && this.f72497 == null && this.f72511 == null && this.f72506 == null && this.f72491 == null)) {
            final C6417 c6417 = C23350.f75019;
            final InterfaceC20758 of = C6646.of(C17852.m41819().mo23554(), new String[0]);
            final String m5412 = m5412();
            final C12392 c12392 = this.f72517;
            final C4733 m5420 = m5420();
            final boolean m5410 = m5410();
            boolean m50213 = m50213();
            Bundle bundle = this.f5606;
            final boolean z2 = m50213 || m50192() || m50195() || bundle.getBoolean("forceTryAXml") || bundle.getBoolean("forceTryClass");
            final InterfaceC20758 m25230 = C10050.m25230(m5412, of);
            boolean z3 = (C20529.m47015(m25230) || m5418().mo23120()) ? false : true;
            final Bundle bundle2 = new Bundle(bundle);
            int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            bundle2.putInt("textPageSize", C4925.f15523.getInt("text_page_size", 50000000));
            if (z3) {
                try {
                    C15545 c15545 = this.f72504;
                    if (bundle.getBoolean("forceTryAXml")) {
                        name = ".xml";
                    } else {
                        name = bundle.getBoolean("forceTryClass") ? ".class" : m5420.f15019.getName();
                    }
                    c15545.m36677(name);
                    C2931 m30527 = c12392.m30527();
                    C10130 c10130 = new C10130();
                    C10130 c101302 = new C10130();
                    this.f72504.m36688(c10130);
                    this.f72504.m36681(c101302);
                    byte[] m25444 = c10130.m25444();
                    byte[] m254442 = c101302.m25444();
                    m41182 = m5410 ? C17622.m41182() : null;
                    c2931 = m30527;
                    bArr = m25444;
                    bArr2 = m254442;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            } else {
                c2931 = null;
                bArr = null;
                bArr2 = null;
                m41182 = null;
            }
            C1802.m5993().removeCallbacksAndMessages(this.f5604);
            final FutureC3575 m35515 = m5411().m35515();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(!z);
            final boolean z4 = z3;
            final byte[] bArr3 = bArr;
            final byte[] bArr4 = bArr2;
            final C11273 c11273 = m41182;
            C19677 c19677 = new C19677(this, new InterfaceC18971() { // from class: l.֫۠ᩳ
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
                @Override // l.InterfaceC18971
                /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final l.C11915 mo5717(l.InterfaceC17066 r17) {
                    /*
                        Method dump skipped, instructions count: 303
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l.C1706.mo5717(l.ܿۖ᩷):l.ۨ᩵ᩳ");
                }
            }, 8388608);
            c19677.f63558 = z || point == null || point.x == -1;
            FutureC3575 m50139 = m50139(c19677, c6417.f19852, m25230);
            if (z && !z3) {
                c19677.m45249(m5412, m25230);
            }
            m50139.m10910(new InterfaceC8017() { // from class: l.ۧ۠ᩳ
                @Override // l.InterfaceC8017
                /* renamed from: ۧ */
                public final void mo4663(Object obj, Throwable th) {
                    C22372.m50160(C22372.this, c12392, z, atomicBoolean, point, point2, (C11915) obj, th);
                }
            });
            return;
        }
        throw new IllegalStateException("Fragment session loading requires an idle foreground view");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FutureC3575 m50139(C19677 c19677, Executor executor, InterfaceC20758 interfaceC20758) {
        C21565 c21565 = this.f72505;
        if (c21565 == null) {
            c21565 = this.f72517.m30539();
        }
        c19677.f63572 = c21565;
        this.f72505 = null;
        this.f72497 = c19677;
        this.f72486 = c19677.m45254();
        this.f5607.m24114(this, true);
        if (interfaceC20758 == null) {
            c19677.m45250(executor);
        } else {
            c19677.m45251(C22477.m50424(interfaceC20758), executor);
        }
        return c19677.m45254();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50226(C19677 c19677) {
        if (this.f72497 == c19677 && this.f72503 && this.f72517 == c19677.f63579) {
            this.f5607.m24135(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50227(C19677 c19677, C11915 c11915, boolean z) {
        if (this.f72497 != c19677) {
            return;
        }
        this.f72497 = null;
        if (z && c19677.m45253()) {
            this.f72506 = c11915;
            this.f72487.m2480(this.f5606);
            this.f72487 = new C0604();
            C16832 c16832 = new C16832(this, c11915, this.f72515);
            this.f72489 = c16832;
            c16832.m39611();
        }
        if (!z && c11915 != null && this.f72491 == c11915.f35622) {
            this.f72491 = null;
            this.f72515 = 0;
        }
        if (this.f72501 != null) {
            return;
        }
        this.f5607.m24114(this, false);
        m50207();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private FutureC3575 m50203(boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session close requires the main thread");
        }
        C19656 c19656 = this.f72511;
        if (c19656 != null) {
            return c19656.m45187();
        }
        C4028 c4028 = this.f72500;
        if (c4028 != null) {
            c4028.m12125(new CancellationException("Saving session is closing"));
        }
        C11915 c11915 = this.f72506;
        if (c11915 == null) {
            return FutureC3575.m10905(null);
        }
        C12392 c12392 = this.f72517;
        if (c12392 == null || this.f72504 == null || c12392.m30436() != c11915.f35630) {
            throw new IllegalStateException("Fragment session owner changed before close");
        }
        C16832 c16832 = this.f72489;
        if (c16832 != null) {
            c16832.m39612();
            this.f72489 = null;
        }
        FutureC3575 futureC3575 = new FutureC3575();
        this.f72486 = futureC3575;
        futureC3575.m10914((Throwable) new CancellationException("Saving session is closing"));
        this.f72511 = new C19656(this, c11915, this.f72515, this.f72513, z);
        if (z) {
            this.f5607.m24126(this);
        } else {
            this.f5607.m24114(this, true);
        }
        return this.f72511.m45187();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50230(C11915 c11915, C12392 c12392) {
        return this.f72503 && this.f72517 == c12392 && this.f72506 == c11915 && this.f72511 == null && this.f72497 == null && c12392.m30436() == c11915.f35630;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23077 m50231() {
        return this.f72513;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50224(C19656 c19656) {
        if (this.f72511 != c19656) {
            return;
        }
        C11915 c11915 = c19656.f63455;
        if (c11915.f35622.m52635() != null) {
            this.f5603.m46502((Throwable) c11915.f35622.m52635());
        }
        this.f72511 = null;
        if (this.f72506 == c11915) {
            this.f72506 = null;
        }
        if (this.f72491 == c11915.f35622) {
            this.f72491 = null;
            this.f72515 = 0;
        }
        if (this.f72501 != null) {
            return;
        }
        if (this.f72505 == null) {
            this.f5607.m24114(this, false);
        }
        m50207();
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m50207() {
        Runnable runnable = this.f72518;
        C12392 c12392 = this.f72517;
        if (runnable == null || !this.f72503) {
            this.f72518 = null;
        } else {
            C4925.m14315(new RunnableC19053(this, runnable, c12392, 1));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50188(C22372 c22372, C12392 c12392, Runnable runnable) {
        if (c22372.f72518 != runnable) {
            return;
        }
        c22372.f72518 = null;
        try {
            try {
                if (c22372.f72503 && c22372.f72517 == c12392) {
                    runnable.run();
                }
            } finally {
                C4028 c4028 = c22372.f72500;
                if (c4028 != null) {
                    c4028.m12126();
                }
            }
        } catch (Error | RuntimeException e) {
            C4028 c40282 = c22372.f72500;
            if (c40282 != null) {
                c40282.m12125(e);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50225(C19656 c19656, Throwable th) {
        C20256 c20256;
        if (this.f72511 != c19656 || (c20256 = this.f5603) == null) {
            return;
        }
        c20256.m46502(th);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m50217(final C11915 c11915, int i, C21565 c21565) {
        C12392 c12392;
        C12392 c123922;
        FutureC3575 m30421;
        C12392 c123923 = this.f72517;
        if (c123923 != null) {
            InterfaceC7785 m30436 = c123923.m30436();
            C4342 c4342 = c11915.f35630;
            if (m30436 == c4342) {
                C10483 c10483 = c11915.f35623;
                C23888 c23888 = c11915.f35622;
                if (Looper.myLooper() == Looper.getMainLooper() && this.f72503 && (c12392 = this.f72517) != null && this.f72504 != null) {
                    InterfaceC7785 m304362 = c12392.m30436();
                    if (m304362 instanceof C4342) {
                        C4342 c43422 = (C4342) m304362;
                        if (c23888.m52632(c43422.mo1601())) {
                            if (this.f72491 != null) {
                                throw new IllegalStateException("Fragment recovery is already bound");
                            }
                            if (i < 0) {
                                throw new IllegalArgumentException("Negative fragment state limit");
                            }
                            C6249 c6249 = c10483.f31452;
                            c6249.m17225(c43422.mo1601());
                            c43422.mo1601().m52365();
                            Bundle m44358 = c6249.f19337.m44358();
                            C12392 c123924 = this.f72517;
                            C15545 c15545 = this.f72504;
                            c15545.m36679(c6249.f19335, c6249.f19334, c6249.f19331);
                            if (!this.f72503 || this.f72517 != c123924 || this.f72504 != c15545 || c123924.m30436() != c43422) {
                                throw new CancellationException("Fragment owner changed during restoration");
                            }
                            c6249.m17225(c43422.mo1601());
                            if (Looper.myLooper() == Looper.getMainLooper() && (c123922 = this.f72517) != null) {
                                InterfaceC7785 m304363 = c123922.m30436();
                                if (m304363 instanceof C4342) {
                                    C4342 c43423 = (C4342) m304363;
                                    if (c23888.m52632(c43423.mo1601())) {
                                        if (this.f72491 != null) {
                                            throw new IllegalStateException("Fragment persistence is already bound");
                                        }
                                        if (i < 0) {
                                            throw new IllegalArgumentException("Negative fragment state limit");
                                        }
                                        c43423.mo1601().m52365();
                                        this.f72491 = c23888;
                                        this.f72515 = i;
                                        Bundle bundle = this.f5606;
                                        bundle.clear();
                                        bundle.putAll(m44358);
                                        this.f72487.m2480(bundle);
                                        this.f72513 = c10483.f31451;
                                        this.f72510 = m5410();
                                        m50194();
                                        final C12392 c123925 = this.f72517;
                                        final C15545 c155452 = this.f72504;
                                        if (c21565 == null) {
                                            m30421 = c123925.m30473(c4342);
                                        } else {
                                            m30421 = c123925.m30421(c4342, c21565);
                                        }
                                        return m30421.m10907(new Runnable() { // from class: l.۠۠ᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C22372 c22372 = C22372.this;
                                                if (c22372.f72503) {
                                                    C12392 c123926 = c22372.f72517;
                                                    C12392 c123927 = c123925;
                                                    if (c123926 == c123927 && c22372.f72504 == c155452 && c123927.m30436() == c11915.f35630) {
                                                        return;
                                                    }
                                                }
                                                throw new CancellationException("Fragment changed before its restored view was ready");
                                            }
                                        });
                                    }
                                }
                            }
                            throw new IllegalStateException("Session persistence requires the foreground fragment owner");
                        }
                    }
                }
                throw new IllegalStateException("Fragment recovery requires the foreground session owner");
            }
        }
        throw new IllegalStateException("Fragment recovery editable does not belong to its resource owner");
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18581 m50235() {
        C12392 c12392;
        C9344 c9344 = this.f5607;
        if (c9344 != null && !c9344.m24142() && this.f72503) {
            if (this.f72491 == null && ((c12392 = this.f72517) == null || !(c12392.m30436() instanceof C4342))) {
                C7932 m35517 = m5411().m35517();
                if (m35517 != null) {
                    C12392 c123922 = this.f72517;
                    C15545 c15545 = this.f72504;
                    try {
                        AbstractC15440 m5418 = m5418();
                        if (m5414()) {
                            m5418.mo23552();
                            m35517.close();
                            return null;
                        }
                        if (c123922 == null || c15545 == null) {
                            throw new IllegalStateException("Legacy save view is unavailable");
                        }
                        return new C4528(this, c123922, c15545, m35517, m5418);
                    } catch (Error | RuntimeException e) {
                        m35517.m21239(e);
                        throw e;
                    }
                }
            } else {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new IllegalStateException("Fragment state capture requires the foreground thread");
                }
                if (!m5414()) {
                    C12392 c123923 = this.f72517;
                    C11003.requireNonNull(c123923);
                    InterfaceC7785 m30436 = c123923.m30436();
                    if (!(m30436 instanceof C4342)) {
                        throw new IllegalStateException("Fragment session owner changed before capture");
                    }
                    C4342 c4342 = (C4342) m30436;
                    C23888 c23888 = this.f72491;
                    if (c23888 == null || !c23888.m52632(c4342.mo1601())) {
                        throw new IllegalStateException("Fragment session persistence is not bound");
                    }
                    C20256 c20256 = this.f5603;
                    C11003.requireNonNull(c20256);
                    try {
                        return new C3117(m50193(), c20256);
                    } catch (IOException | IllegalStateException e2) {
                        c20256.m46502(e2);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FutureC3575 m50193() {
        C12392 c12392 = this.f72517;
        C11003.requireNonNull(c12392);
        InterfaceC7785 m30436 = c12392.m30436();
        if (!(m30436 instanceof C4342)) {
            throw new IllegalStateException("Fragment session owner changed before capture");
        }
        C4342 c4342 = (C4342) m30436;
        C23888 c23888 = this.f72491;
        if (c23888 == null || !c23888.m52632(c4342.mo1601())) {
            throw new IllegalStateException("Fragment session persistence is not bound");
        }
        C10130 c10130 = new C10130();
        C10130 c101302 = new C10130();
        this.f72504.m36688(c10130);
        this.f72504.m36681(c101302);
        FutureC3575 m52631 = c23888.m52631(C13304.m32268(c12392, this.f5606, this.f72513, c10130.m25444(), c101302.m25444(), this.f72515, -1L, null));
        C23721 mo1601 = c4342.mo1601();
        C11003.requireNonNull(mo1601);
        return m52631.m10927((InterfaceC21423) new C12620(1, mo1601));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50219(String str, boolean z) {
        C4733 c4733 = new C4733(C16999.m39866(str, new String[0]));
        ActivityC16315 activityC16315 = (ActivityC16315) requireActivity();
        ResultCallback resultCallback = this.f72514;
        this.f72514 = null;
        new C5939(this, activityC16315, c4733, z, resultCallback).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m50182(final ActivityC16315 activityC16315) {
        if (m5410() && this.f72499 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(d.A, true);
            this.f72514 = null;
            this.f72499.m32311(null, R.string.MT_Protector_res_0x7f1205fc, m5420().f15019.getName(), bundle);
            return;
        }
        m50222(activityC16315, new Runnable() { // from class: l.ܺ۠ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C22372 c22372 = C22372.this;
                c22372.getClass();
                activityC16315.m38448(c22372);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50146(final ActivityC16315 activityC16315, boolean z) {
        View m10216 = activityC16315.m10216(R.layout.MT_Protector_res_0x7f0d0101);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        checkBox.setChecked(z);
        final RunnableC2412 runnableC2412 = new RunnableC2412(this, checkBox, activityC16315);
        C19258 buildDialog = activityC16315.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1208c6, new DialogInterface.OnClickListener() { // from class: l.ۘ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C22372.this.m50222(activityC16315, runnableC2412);
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ᩴ۠ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RunnableC2412.this.run();
            }
        };
        int i = R.string.MT_Protector_res_0x7f120319;
        buildDialog.m44434(R.string.MT_Protector_res_0x7f120319, onClickListener);
        Button m1446 = buildDialog.m44438().m1446();
        if (!checkBox.isChecked()) {
            i = R.string.MT_Protector_res_0x7f1202c2;
        }
        m1446.setText(i);
        checkBox.setOnCheckedChangeListener(new C19346(m1446, 0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50221(ActivityC16315 activityC16315, ResultCallback resultCallback) {
        if (m5426()) {
            new C11584(this, activityC16315, resultCallback).m20274();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50222(ActivityC16315 activityC16315, Runnable runnable) {
        if (!m5426()) {
            runnable.run();
        } else {
            C12392 c12392 = this.f72517;
            m50221(activityC16315, new C22872(this, c12392, c12392 == null ? null : c12392.m30436(), m5420().f15019.mo23554(), runnable));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m50178(Callable callable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        C4925.m14315(futureTask);
        boolean z = false;
        while (true) {
            try {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) {
                        throw ((Exception) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return futureTask.get();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8967 m50179(C22372 c22372, C23077 c23077) {
        C14799 m35197;
        if (c22372.f72503 && c22372.f72517 != null && c22372.f72511 == null && c22372.f72518 == null && !c22372.f5607.m24142()) {
            FutureC3575 futureC3575 = c22372.f72486;
            if (futureC3575 != null) {
                if (futureC3575.isDone()) {
                    if (((C11915) c22372.f72486.m10930()).f35630 != c22372.f72517.m30436()) {
                        throw new CancellationException("Saving content was replaced after loading");
                    }
                }
            }
            if (c22372.f72508 && c22372.f72513 != null && c22372.f72517.m30536()) {
                if (c22372.m5414()) {
                    throw new IllegalStateException("Cannot save failed editor content");
                }
                C12392 c12392 = c22372.f72517;
                InterfaceC7785 m30436 = c12392.m30436();
                if (m30436 instanceof C4342) {
                    C4342 c4342 = (C4342) m30436;
                    if (!c4342.mo1601().m52350().m14691()) {
                        if (c4342.mo1601().m52350().m14689() != EnumC0191.LOADING) {
                            throw new IllegalStateException("Cannot save incomplete source text");
                        }
                    }
                }
                C4733 m5420 = c22372.m5420();
                if (c23077 == null) {
                    c23077 = c22372.f72513;
                }
                C11915 c11915 = c22372.f72506;
                if (c11915 == null || c11915.f35630 != m30436) {
                    m35197 = C14799.m35197(m30436, c12392.m30531(), c23077, -1, null);
                } else {
                    m35197 = C14799.m35199(c11915, c12392.m30531(), c23077);
                }
                try {
                    if (c12392.m30436() != m30436) {
                        throw new IllegalStateException("Editor changed during saving capture");
                    }
                    return new C8967(c22372, c12392, m30436, c12392.m30530(), m5420, m35197);
                } catch (Error | RuntimeException e) {
                    m35197.close();
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50190(C22372 c22372, C18845 c18845) {
        if (c22372.f72501 != c18845) {
            return;
        }
        c22372.f72501 = null;
        c18845.f59441.m50428((Throwable) null);
        c18845.f59440.m10912((Object) null);
        if (c22372.f72518 != null && c22372.f72503) {
            c22372.f72517.m30412(false);
            c22372.f5607.m24114(c22372, false);
        }
        c22372.m50207();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50144(Exception exc, ActivityC16315 activityC16315) {
        int i;
        this.f5603.m46502((Throwable) exc);
        if (activityC16315 == null) {
            activityC16315 = (ActivityC16315) getActivity();
        }
        if (activityC16315 != null) {
            activityC16315.m38461();
            if (!isResumed()) {
                activityC16315.m38453(this);
            }
        }
        boolean z = exc instanceof C4343;
        C4583 c4583 = this.f72507;
        if (z) {
            int m13050 = ((C4343) exc).m13050() - 1;
            if (m13050 >= 0) {
                c4583.m13481(Integer.valueOf(m13050));
                return;
            }
            return;
        }
        if (exc instanceof C1580) {
            int m38634 = ((C1580) exc).m5400().m38634();
            if (m38634 == -1 || m38634 - 1 < 0) {
                return;
            }
            c4583.m13481(Integer.valueOf(i));
            return;
        }
        if (exc instanceof C14658) {
            C14658 c14658 = (C14658) exc;
            C19287.m44466(c14658.f44794, c14658.f44798).m44474(this.f72517);
        } else if (exc instanceof C3781) {
            ((C3781) exc).m11437(this.f72517);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50185(C22372 c22372, DialogInterface dialogInterface, int i) {
        C23077 c23077 = c22372.f72513;
        if (c23077.f74223 != i) {
            c23077.f74223 = i;
            c22372.f72517.m30456(true);
            c22372.m50215();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50166(C22372 c22372, int[] iArr, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (c22372.f72513.f74223 != iArr[0]) {
            if (!c22372.m5426()) {
                c22372.m50218(iArr[0], false, false);
                return;
            }
            C19258 buildDialog = ((ActivityC16315) c22372.requireActivity()).buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f1205f7);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC3616(c22372, iArr, 1));
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r0.mo1601().m52329() != r10.f72494) goto L63;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m50229() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22372.m50229():boolean");
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m50213() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51241();
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m50192() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51240();
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m50195() {
        C23077 c23077 = this.f72513;
        return c23077 != null && c23077.m51242();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean m50173() {
        C23077 c23077 = this.f72513;
        if (c23077 != null) {
            return c23077.m51241() || this.f72513.m51240() || this.f72513.m51242();
        }
        return false;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m50239() {
        String str = this.f72492;
        if (str != null) {
            return str;
        }
        String string = this.f5606.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        if (string != null) {
            this.f72492 = string;
            return string;
        }
        try {
            String m18061 = C6554.m18061(80, m5420().f15019.getName());
            this.f72492 = m18061;
            return m18061;
        } catch (Exception unused) {
            return "Error";
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m50238() {
        if (!m5426()) {
            return m50239();
        }
        return "*" + m50239();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean m50167() {
        C13576 c13576;
        C11915 c11915 = this.f72506;
        return (c11915 == null || (c13576 = c11915.f35628) == null || c13576.m32656() <= 1) ? false : true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50236(boolean z) {
        C13576 c13576;
        if (z) {
            return true;
        }
        C11915 c11915 = this.f72506;
        return (c11915 == null || (c13576 = c11915.f35628) == null || !c13576.m32652(c11915.f35631)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 m50138(final int i, Runnable runnable) {
        FutureC3575 futureC3575 = new FutureC3575();
        final C11915 c11915 = this.f72506;
        if (!m50167() || i < 0 || i >= c11915.f35628.m32656() || c11915.f35628.m32651() || this.f72511 != null || this.f72497 != null || this.f5607.m24142()) {
            futureC3575.m10914((Throwable) new IllegalStateException("Text page is unavailable"));
            return futureC3575;
        }
        if (i == c11915.f35631) {
            if (runnable != null) {
                runnable.run();
            }
            futureC3575.m10912((Object) null);
            return futureC3575;
        }
        final C12392 c12392 = this.f72517;
        final C13576 c13576 = c11915.f35628;
        final int i2 = this.f72515;
        try {
            FutureC3575 m50203 = m50203(false);
            final C19656 c19656 = this.f72511;
            C11003.requireNonNull(c19656);
            m50203.m10927(new InterfaceC21423() { // from class: l.ܰ֨ᩳ
                @Override // l.InterfaceC21423
                public final Object apply(Object obj) {
                    return C22372.m50141(C22372.this, c12392, c19656, c11915, c13576, i, i2);
                }
            }).m10909(new C7144(this, c12392, runnable)).m10910((InterfaceC8017) new C13011(this, futureC3575, c12392));
            return futureC3575;
        } catch (RuntimeException e) {
            futureC3575.m10914((Throwable) e);
            return futureC3575;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ FutureC3575 m50141(C22372 c22372, C12392 c12392, C19656 c19656, C11915 c11915, final C13576 c13576, final int i, final int i2) {
        if (!c22372.f72503 || c22372.f72517 != c12392) {
            throw new CancellationException("Page view was destroyed");
        }
        final C18950 m45188 = c19656.m45188();
        final C6417 c6417 = c11915.f35622.f77236;
        return c22372.m50139(new C19677(c22372, new InterfaceC18971() { // from class: l.ۚ۠ᩳ
            @Override // l.InterfaceC18971
            /* renamed from: ֫ */
            public final C11915 mo5717(InterfaceC17066 interfaceC17066) {
                C18950 c18950 = m45188;
                C13576 m32640 = C13576.m32640(C13576.this.f40498);
                int i3 = i;
                C6417 c64172 = c6417;
                int i4 = i2;
                C11915 m32647 = m32640.m32647(i3, c64172, i4, interfaceC17066, true);
                try {
                    m32647.m29075(c18950.m43738(), c18950.m43737(), c18950.m43736(), c64172, i4);
                    return m32647;
                } catch (IOException | Error | RuntimeException e) {
                    m32647.m29068().m10930();
                    throw e;
                }
            }
        }, i2), c6417.f19852, c13576.f40498);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50159(C22372 c22372, C12392 c12392, Runnable runnable) {
        if (!c22372.f72503 || c22372.f72517 != c12392) {
            throw new CancellationException("Page view was destroyed");
        }
        c22372.m50196(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50155(C22372 c22372, FutureC3575 futureC3575, C12392 c12392, Throwable th) {
        if (th == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if (c22372.f72503 && c22372.f72517 == c12392) {
            if (c22372.f72506 == null) {
                c22372.m5421(true);
            }
            c22372.f5603.m46502(th);
        }
        futureC3575.m10914(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m50198() {
        StringBuilder sb = new StringBuilder();
        if (m5426()) {
            sb.append("*");
        }
        if (m50167()) {
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(this.f72506.f35631 + 1);
            sb.append("/");
            sb.append(this.f72506.f35628.m32656());
            sb.append(") ");
        }
        sb.append(m50239());
        this.f5607.m24105(sb.toString());
        this.f5607.m24104(m5426() ? C21943.f70260 : C21943.f70287);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public void m50215() {
        StringBuilder sb = new StringBuilder();
        C12392 c12392 = this.f72517;
        if (c12392 != null) {
            int m30444 = c12392.m30444();
            int m30448 = c12392.m30448();
            Point m30472 = c12392.m30472(m30444);
            sb.append(m30472.x);
            sb.append(':');
            sb.append(m30472.y);
            if (m30444 != m30448) {
                sb.append(" (");
                sb.append(Math.abs(m30448 - m30444));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            }
        }
        if (this.f72513 != null) {
            if (sb.length() > 0) {
                sb.append("   ");
            }
            if (this.f72513.m51241()) {
                sb.append("AXML");
            } else if (this.f72513.m51240()) {
                sb.append("ABX");
            } else {
                sb.append(C14776.m35153(this.f72513.f74223));
            }
        }
        if (sb.length() == 0) {
            this.f5607.m24124("...");
        } else {
            this.f5607.m24124(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m50143(View view) {
        final int i;
        String m35153;
        int i2 = 0;
        if (m50167() && view.getId() == R.id.MT_Protector_res_0x7f0a02d1) {
            int m32656 = this.f72506.f35628.m32656();
            CharSequence[] charSequenceArr = new CharSequence[m32656];
            while (i2 < m32656) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = String.valueOf(i3);
                i2 = i3;
            }
            C19258 buildDialog = ((ActivityC16315) requireActivity()).buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f12072f);
            buildDialog.m44429(charSequenceArr, this.f72506.f35631, new DialogInterface.OnClickListener() { // from class: l.᩹֨ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    C22372.m50151(C22372.this, dialogInterface, i4);
                }
            });
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44438();
            return;
        }
        C4733 m5420 = m5420();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector_res_0x7f120739));
        int i4 = 1;
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) m5420.f15019.mo23554()).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector_res_0x7f1205af));
        if (m50213()) {
            i = C14776.f45134;
            m35153 = "AXML";
        } else if (m50192()) {
            i = C14776.f45134;
            m35153 = "ABX";
        } else if (m50195()) {
            i = C14776.f45134;
            m35153 = "Class";
        } else {
            C23077 c23077 = this.f72513;
            i = c23077 == null ? -1 : c23077.f74223;
            m35153 = i == -1 ? "?" : C14776.m35153(i);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) m35153).append((CharSequence) "\n");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(R.string.MT_Protector_res_0x7f120519));
        spannableStringBuilder.setSpan(new StyleSpan(1), length2, spannableStringBuilder.length(), 33);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) "\n");
        String[] strArr = {"Windows (CRLF)", "MacOS (CR)", "Unix-like (LF)"};
        String m30531 = this.f72517.m30531();
        m30531.getClass();
        if (m30531.equals("\r")) {
            i2 = 1;
        } else if (!m30531.equals("\r\n")) {
            i2 = 2;
        }
        append.append((CharSequence) strArr[i2]);
        C19258 buildDialog2 = ((ActivityC16315) requireActivity()).buildDialog();
        buildDialog2.m44436(m50239());
        buildDialog2.m44424(spannableStringBuilder);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f12060e, new DialogInterface.OnClickListener() { // from class: l.᩶֨ᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C22372.m50184(C22372.this, i);
            }
        });
        buildDialog2.m44440(R.string.MT_Protector_res_0x7f1206c4, new DialogInterfaceOnClickListenerC18322(i4, this));
        ((TextView) buildDialog2.m44438().m1433(android.R.id.message)).setTextIsSelectable(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50151(C22372 c22372, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        c22372.m50138(i, (Runnable) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50184(C22372 c22372, int i) {
        if (i != -1) {
            c22372.m50180(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50223(ActivityC16315 activityC16315, DialogInterfaceC19598 dialogInterfaceC19598) {
        C13699 c13699 = new C13699(this, activityC16315, activityC16315, dialogInterfaceC19598);
        c13699.m31258(R.string.MT_Protector_res_0x7f1206c4);
        c13699.m31268(40);
        String string = this.f5606.getString("remark");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        c13699.m31250((CharSequence) string);
        c13699.m31281();
        c13699.m31266(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50220(ActivityC16315 activityC16315) {
        if (m5426()) {
            if (m5410() && this.f72499 == null) {
                activityC16315.m38453(this);
            }
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC16315);
            c19258.m44436(m50239());
            c19258.m44416(R.string.MT_Protector_res_0x7f1208cd);
            int i2 = 1;
            c19258.m44442(R.string.MT_Protector_res_0x7f1205fc, new DialogInterfaceOnClickListenerC14904(this, activityC16315, i2));
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            c19258.m44440(R.string.MT_Protector_res_0x7f1202c2, new DialogInterfaceOnClickListenerC21256(this, activityC16315, i2));
            c19258.m44438();
            return;
        }
        activityC16315.m38448(this);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C12534 m50216() {
        C12534 c12534 = this.f72513.f74221;
        C11003.requireNonNull(c12534);
        return c12534;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Map m50234() {
        Map map = this.f72513.f74225;
        C11003.requireNonNull(map);
        return map;
    }

    @Override // l.ComponentCallbacksC9205, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5607.m24143(getResources().getBoolean(R.bool.MT_Protector_res_0x7f050009));
    }
}
