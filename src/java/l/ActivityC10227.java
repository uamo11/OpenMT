package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: D8GL */
/* renamed from: l.ۤۤۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC10227 extends AbstractActivityC3346 {

    /* renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f30721 = {15, 30, 45, 60, 90};

    /* renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30722 = 0;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30723;

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30724;

    /* renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30725;

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30727;

    /* renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30728;

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public int f30729;

    /* renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public View f30730;

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public C10809 f30731;

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public int f30733;

    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public View f30734;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public ImageView f30735;

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public String f30736;

    /* renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30737;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public String f30738;

    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public C13547 f30739;

    /* renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public View f30740;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public View f30741;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public FrameLayout f30742;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C16431 f30744;

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public boolean f30745;

    /* renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public View f30746;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30747;

    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public long f30748;

    /* renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30749;

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public View f30752;

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public Future f30754;

    /* renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public C0289 f30755;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public C5157 f30756;

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30757;

    /* renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public View f30758;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f30759;

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public ImageView f30760;

    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30761;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public TextView f30762;

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public boolean f30763;

    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30764;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public TextView f30765;

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public View f30766;

    /* renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public int f30767;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public C19130 f30768;

    /* renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public TextView f30769;

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30770;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public C4437 f30771;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public ProgressBar f30774;

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC9603 f30775;

    /* renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public ViewGroup f30776;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public GestureDetectorOnGestureListenerC8816 f30777;

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public C23713 f30778;

    /* renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public TextView[] f30779;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f30780;

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public boolean f30781;

    /* renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public TextView f30782;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public volatile int f30783;

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public int f30784;

    /* renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public boolean f30785;

    /* renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4162 f30786;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public View f30787;

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public boolean f30788;

    /* renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public float f30789;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public View f30790;

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public C22720 f30791;

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30792;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public C14895 f30793;

    /* renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public View f30794;

    /* renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public View f30795;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C3877 f30796;

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public Future f30797;

    /* renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public String f30798;

    /* renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30799;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public volatile C15600 f30800;

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public C15807 f30801;

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public long f30805;

    /* renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public View f30806;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public String f30807;

    /* renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public ProgressBar f30809;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30810;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public ImageView f30811;

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public View f30814;

    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public View f30815;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public View f30816;

    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30817;

    /* renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f30818;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public ViewGroup f30819;

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public View f30820;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f30822;

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30823;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public String f30825;

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public C0991 f30826;

    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public C18635 f30827;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final C15870 f30753 = new C15870();

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public C6404 f30808 = C6404.f19812;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30726 = false;

    /* renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f30803 = new AtomicInteger();

    /* renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30802 = new ArrayList();

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public EnumC20811 f30732 = EnumC20811.NONE;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public List f30804 = Collections.EMPTY_LIST;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final C19400 f30750 = new C19400();

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public EnumC18694 f30772 = EnumC18694.NONE;

    /* renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public final C19400 f30824 = new C19400();

    /* renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public final C19400 f30773 = new C19400();

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final C19400 f30813 = new C19400();

    /* renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public final C10516 f30821 = new C10516(new Runnable() { // from class: l.ܺ۬ۜ
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC10227.this.m25848();
        }
    });

    /* renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public final Runnable f30743 = new RunnableC13109(this);

    /* renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public final C2547 f30812 = new InterfaceC12632() { // from class: l.ۖ۬ۜ
        @Override // l.InterfaceC12632
        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void mo8063() {
            ActivityC10227.m25700(ActivityC10227.this);
        }
    };

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final RunnableC18836 f30751 = new RunnableC18836(1, this);

    @Override // l.ActivityC2124
    /* renamed from: ۘ */
    public final int mo7027() {
        return 2;
    }

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "VideoPlayerActivity";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25700(ActivityC10227 activityC10227) {
        activityC10227.m25833();
        activityC10227.m25749();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25810(ActivityC10227 activityC10227) {
        if (activityC10227.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
            activityC10227.m25692(-9223372036854775807L, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[Catch: Exception -> 0x0042, InterruptedException -> 0x0046, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x0046, Exception -> 0x0042, blocks: (B:11:0x0023, B:20:0x003c), top: B:10:0x0023 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m25695(final l.AbstractActivityC3346 r2, android.content.Intent r3, l.AbstractC13921 r4, final l.InterfaceC17889 r5) {
        /*
            boolean r0 = m25817()
            if (r0 == 0) goto L50
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L50
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L50
            boolean r4 = r4 instanceof l.C2499
            if (r4 != 0) goto L17
            goto L50
        L17:
            java.util.concurrent.ExecutorService r4 = l.C1802.f6208
            l.ۢ۫ۜ r0 = new l.ۢ۫ۜ
            r0.<init>()
            java.util.concurrent.Future r2 = r4.submit(r0)
            r4 = 1
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L42 java.lang.InterruptedException -> L46
            r0 = 150(0x96, double:7.4E-322)
            java.lang.Object r5 = r2.get(r0, r5)     // Catch: java.lang.Exception -> L42 java.lang.InterruptedException -> L46
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L42 java.lang.InterruptedException -> L46
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L42 java.lang.InterruptedException -> L46
            if (r5 == 0) goto L38
            if (r5 != r4) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            if (r0 != 0) goto L3c
            goto L50
        L3c:
            java.lang.String r0 = "bin.mt.media.extra.INITIAL_REQUESTED_ORIENTATION"
            r3.putExtra(r0, r5)     // Catch: java.lang.Exception -> L42 java.lang.InterruptedException -> L46
            return
        L42:
            r2.cancel(r4)
            goto L50
        L46:
            r2.cancel(r4)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25695(l.ۗܺ᩷, android.content.Intent, l.ܰܺܳ, l.ᩳۜܳ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b4  */
    /* JADX WARN: Type inference failed for: r1v69, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v48, types: [l.᩹۫ۜ] */
    /* JADX WARN: Type inference failed for: r4v44, types: [l.ܶ۟ۜ] */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.onCreate(android.os.Bundle):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25706(ActivityC10227 activityC10227, GestureDetector gestureDetector, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = activityC10227.f30777;
            int i = gestureDetectorOnGestureListenerC8816.f26873;
            gestureDetectorOnGestureListenerC8816.f26873 = -1;
            gestureDetectorOnGestureListenerC8816.f26877 = false;
            ActivityC10227 activityC102272 = gestureDetectorOnGestureListenerC8816.f26874;
            boolean z = activityC102272.f30726;
            if (!z && !activityC102272.f30745 && i == 0) {
                m25756(activityC102272);
                ((AbstractC14702) activityC102272.f30786).seekTo(gestureDetectorOnGestureListenerC8816.f26876);
                activityC102272.m25734();
            } else if (!z && activityC102272.f30741.getVisibility() != 8) {
                activityC102272.f30741.setVisibility(8);
            }
            gestureDetectorOnGestureListenerC8816.m22785();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25701(ActivityC10227 activityC10227, int i) {
        if (i == -2) {
            activityC10227.f30741.setVisibility(8);
            activityC10227.f30726 = false;
        } else {
            if (i == -1) {
                activityC10227.f30726 = true;
                activityC10227.f30741.setVisibility(0);
                activityC10227.f30765.setVisibility(0);
                activityC10227.f30735.setVisibility(8);
                activityC10227.f30765.setText(R.string.MT_Protector_res_0x7f120528);
                return;
            }
            activityC10227.f30774.setProgress(i * 10);
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25789(ActivityC10227 activityC10227) {
        activityC10227.m25845();
        activityC10227.f30827.m43232();
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static void m25824(final ActivityC10227 activityC10227) {
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 != null) {
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
            if (abstractC14702.m34999()) {
                if (activityC10227.f30785 && activityC10227.f30780) {
                    boolean z = activityC10227.f30745;
                    activityC10227.f30745 = true;
                    boolean m35000 = abstractC14702.m35000();
                    activityC10227.f30727 = m35000;
                    if (m35000) {
                        activityC10227.f30757 = false;
                    } else if (interfaceC1318.mo4603() == 4) {
                        activityC10227.f30757 = true;
                    }
                    activityC10227.m25843(true);
                    if (!z) {
                        String str = activityC10227.f30825;
                        if (!TextUtils.isEmpty(str)) {
                            C22926.m51017(str);
                        }
                        activityC10227.m25820();
                        abstractC14702.mo4581();
                    }
                    activityC10227.m25787();
                    return;
                }
                if (activityC10227.f30788 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
                    return;
                }
                activityC10227.f30788 = true;
                String str2 = activityC10227.f30825;
                if (!TextUtils.isEmpty(str2)) {
                    C22926.m51017(str2);
                }
                activityC10227.f30825 = null;
                C10062.m25251(activityC10227.f30798);
                activityC10227.f30798 = null;
                InterfaceC4162 interfaceC4162 = activityC10227.f30786;
                if (interfaceC4162 != null) {
                    interfaceC4162.stop();
                    ((AbstractC14702) activityC10227.f30786).mo4573();
                }
                C19258 buildDialog = activityC10227.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f1209f5);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡۫ۜ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = ActivityC10227.f30722;
                        ActivityC10227.this.finish();
                    }
                });
                buildDialog.m44428(false);
                buildDialog.m44438();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25843(boolean z) {
        View view = this.f30730;
        if (view != null) {
            boolean z2 = !z;
            view.setEnabled(z2);
            this.f30730.setVisibility(z ? 8 : 0);
            this.f30730.setFocusable(z2);
            this.f30730.setImportantForAccessibility(z ? 4 : 0);
        }
        View view2 = this.f30752;
        if (view2 != null) {
            view2.setVisibility(z ? 8 : 0);
        }
        View view3 = this.f30787;
        if (view3 != null) {
            view3.setVisibility(z ? 8 : 0);
        }
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            boolean z3 = !z;
            c18635.m43227(z3);
            this.f30827.m43225(z3);
        }
        View view4 = this.f30734;
        if (view4 != null) {
            view4.setVisibility(z ? 8 : 0);
        }
        View view5 = this.f30816;
        if (view5 != null) {
            view5.setVisibility(z ? 8 : 0);
        }
        View view6 = this.f30815;
        if (view6 != null) {
            view6.setVisibility(z ? 8 : 0);
        }
        View view7 = this.f30766;
        if (view7 != null) {
            view7.setVisibility(z ? 8 : 0);
        }
        if (z) {
            View view8 = this.f30806;
            if (view8 != null) {
                view8.setVisibility(8);
                this.f30806.setTranslationX(0.0f);
                this.f30806.setTranslationY(0.0f);
            }
            m25734();
            GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
            if (gestureDetectorOnGestureListenerC8816 != null) {
                ActivityC10227 activityC10227 = gestureDetectorOnGestureListenerC8816.f26874;
                if (gestureDetectorOnGestureListenerC8816.f26873 == 0) {
                    gestureDetectorOnGestureListenerC8816.f26873 = -2;
                }
                m25756(activityC10227);
                activityC10227.m25734();
                this.f30777.m22785();
            }
        }
        m25787();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public void m25787() {
        View view = this.f30795;
        if (view == null) {
            return;
        }
        boolean z = this.f30757;
        view.setEnabled(!z);
        this.f30795.setAlpha(!z ? 1.0f : 0.33f);
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25845() {
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        if (this.f30745) {
            if (this.f30757) {
                return;
            }
            if (!C3603.m11031(interfaceC1318, true)) {
                ((AbstractC14702) interfaceC1318).mo4570(false);
                return;
            }
            if (!this.f30727) {
                C3603.m11030(interfaceC1318);
                return;
            }
            InterfaceC1318 interfaceC13182 = this.f30786;
            if (interfaceC13182 == null || this.f30757) {
                return;
            }
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC13182;
            abstractC14702.mo4581();
            if (interfaceC13182.mo4603() == 1) {
                interfaceC13182.mo4584();
            }
            abstractC14702.mo4570(true);
            return;
        }
        if (!C3603.m11031(interfaceC1318, true)) {
            AbstractC14702 abstractC147022 = (AbstractC14702) interfaceC1318;
            if (abstractC147022.mo4589(1)) {
                abstractC147022.pause();
                return;
            }
            return;
        }
        C3603.m11030(interfaceC1318);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25725(ActivityC10227 activityC10227, C16134 c16134) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == null || !activityC10227.f30745 || !activityC10227.f30727 || c16134.f49707 != 1002 || activityC10227.f30759) {
            return false;
        }
        activityC10227.f30759 = true;
        boolean mo4607 = interfaceC4162.mo4607();
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 != null && !activityC10227.f30757) {
            AbstractC14702 abstractC14702 = (AbstractC14702) interfaceC1318;
            abstractC14702.mo4581();
            interfaceC1318.mo4584();
            if (mo4607) {
                abstractC14702.mo4570(true);
            }
        }
        return true;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static boolean m25821(ActivityC10227 activityC10227) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (activityC10227.f30745 && !activityC10227.f30817 && interfaceC4162 != null) {
            C11902 mo4580 = interfaceC4162.mo4580();
            AbstractC20151 it = mo4580.f35552.values().iterator();
            while (it.hasNext()) {
                C12607 c12607 = (C12607) it.next();
                if (c12607.f38012.f39853 == 2 && !c12607.f38013.isEmpty()) {
                    activityC10227.f30817 = true;
                    activityC10227.f30731 = null;
                    boolean mo4607 = interfaceC4162.mo4607();
                    interfaceC4162.mo4569(mo4580.mo29029().mo17262(2, false).mo17261(2).mo17266());
                    InterfaceC1318 interfaceC1318 = activityC10227.f30786;
                    if (interfaceC1318 != null && !activityC10227.f30757) {
                        if (activityC10227.f30727) {
                            ((AbstractC14702) interfaceC1318).mo4581();
                        }
                        interfaceC1318.mo4584();
                        if (mo4607) {
                            ((AbstractC14702) interfaceC1318).mo4570(true);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static void m25750(final ActivityC10227 activityC10227) {
        if (activityC10227.f30724 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
            return;
        }
        activityC10227.f30724 = true;
        C19258 buildDialog = activityC10227.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f1209f8);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120a99, new DialogInterface.OnClickListener() { // from class: l.ۚ۫ۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC10227.m25751(ActivityC10227.this);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC1115(0, activityC10227));
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.۠۫ۜ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ActivityC10227.m25733(ActivityC10227.this);
            }
        });
        buildDialog.m44438();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m25751(ActivityC10227 activityC10227) {
        activityC10227.f30724 = false;
        activityC10227.f30759 = false;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null || activityC10227.f30757) {
            return;
        }
        if (activityC10227.f30727) {
            ((AbstractC14702) interfaceC1318).mo4581();
        }
        interfaceC1318.mo4584();
        ((AbstractC14702) interfaceC1318).mo4570(true);
    }

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static void m25676(ActivityC10227 activityC10227) {
        if (activityC10227.f30810 || activityC10227.isFinishing() || activityC10227.isDestroyed()) {
            return;
        }
        activityC10227.f30810 = true;
        C19258 buildDialog = activityC10227.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f1209f7);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC2527(activityC10227, 0));
        buildDialog.m44428(false);
        buildDialog.m44438();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m25733(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static void m25745(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25795(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25826(ActivityC10227 activityC10227) {
        C10062.m25251(activityC10227.f30798);
        activityC10227.f30798 = null;
        activityC10227.finish();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStart() {
        C18635 c18635;
        super.onStart();
        C12437 m10244 = m10244();
        m10244.m30602(2);
        m10244.m30599(7);
        boolean z = this.f30823;
        if (z) {
            if (!z || (c18635 = this.f30827) == null) {
                return;
            }
            RunnableC18836 runnableC18836 = this.f30751;
            c18635.removeCallbacks(runnableC18836);
            this.f30827.post(runnableC18836);
            return;
        }
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 != null) {
            if (this.f30745 && this.f30727) {
                ((AbstractC14702) interfaceC1318).mo4581();
                if (this.f30770) {
                    ((AbstractC14702) this.f30786).mo4570(true);
                    return;
                }
                return;
            }
            if (this.f30770) {
                ((AbstractC14702) interfaceC1318).mo4570(true);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            final View decorView = getWindow().getDecorView();
            decorView.post(new Runnable() { // from class: l.ۘ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ActivityC10227.f30722;
                    if (decorView.hasWindowFocus()) {
                        C12437 m10244 = ActivityC10227.this.m10244();
                        m10244.m30602(2);
                        m10244.m30599(7);
                    }
                }
            });
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f30749 = false;
        m25823();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        InterfaceC4162 interfaceC4162;
        super.onStop();
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        m25820();
        if (this.f30754 != null) {
            this.f30823 = true;
            m25771(true);
        }
        GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
        if (gestureDetectorOnGestureListenerC8816 != null) {
            gestureDetectorOnGestureListenerC8816.m22785();
        }
        InterfaceC4162 interfaceC41622 = this.f30786;
        if (interfaceC41622 != null) {
            int mo4603 = interfaceC41622.mo4603();
            boolean z = (!this.f30786.mo4607() || mo4603 == 1 || mo4603 == 4) ? false : true;
            this.f30770 = z;
            if (z) {
                ((AbstractC14702) this.f30786).mo4570(false);
            }
        } else {
            this.f30770 = false;
        }
        if (!this.f30745 && (interfaceC4162 = this.f30786) != null && this.f30775 != null) {
            String str = this.f30825;
            long currentPosition = interfaceC4162.getCurrentPosition();
            long duration = this.f30786.getDuration();
            if (duration != -9223372036854775807L && !TextUtils.isEmpty(str)) {
                C22926.m51015(str, currentPosition, duration);
            }
        }
        if (isFinishing()) {
            m25672();
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m25848() {
        this.f30770 = false;
        this.f30823 = false;
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        GestureDetectorOnGestureListenerC8816 gestureDetectorOnGestureListenerC8816 = this.f30777;
        if (gestureDetectorOnGestureListenerC8816 != null) {
            gestureDetectorOnGestureListenerC8816.m22785();
        }
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 != null) {
            ((AbstractC14702) interfaceC1318).mo4570(false);
        }
        getWindow().clearFlags(128);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C10809 c10809;
        super.onSaveInstanceState(bundle);
        InterfaceC9603 interfaceC9603 = this.f30775;
        if (interfaceC9603 != null) {
            bundle.putInt("bin.mt.media.state.CURRENT_MEDIA_INDEX", interfaceC9603.mo16336());
        }
        if (this.f30780) {
            C10809 c108092 = this.f30731;
            if (this.f30786 != null) {
                List m38760 = C16452.m38760(getResources(), this.f30786.mo4574());
                int m38758 = C16452.m38758(m38760, this.f30786.mo4580());
                if (m38758 <= 0 || m38758 > m38760.size()) {
                    c10809 = null;
                } else {
                    int i = m38758 - 1;
                    C7404 c7404 = (C7404) m38760.get(i);
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C8353 m19926 = ((C7404) m38760.get(i3)).m19926();
                        C8353 m199262 = c7404.m19926();
                        if (m19926.f25633 == m199262.f25633 && m19926.f25609 == m199262.f25609 && m19926.f25623 == m199262.f25623 && m19926.f25615 == m199262.f25615 && Float.compare(m19926.f25596, m199262.f25596) == 0 && TextUtils.equals(m19926.f25619, m199262.f25619) && TextUtils.equals(m19926.f25614, m199262.f25614)) {
                            i2++;
                        }
                    }
                    C8353 m199263 = c7404.m19926();
                    c10809 = new C10809(m199263.f25633, m199263.f25609, m199263.f25623, m199263.f25615, m199263.f25596, m199263.f25619, m199263.f25614, i2);
                }
                if (c10809 != null) {
                    c108092 = c10809;
                }
            }
            if (c108092 != null) {
                bundle.putBundle("bin.mt.media.state.VIDEO_QUALITY_SELECTION", c108092.m27025());
            }
        }
    }

    @Override // l.AbstractActivityC3346, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f30790.getVisibility() == 4) {
            this.f30811.setImageResource(R.drawable.MT_Protector_res_0x7f0802cb);
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m25728(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16332();
        activityC10227.m25692(-9223372036854775807L, false);
        activityC10227.f30827.m43232();
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static void m25735(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16332();
        activityC10227.m25692(-9223372036854775807L, false);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m25838(ActivityC10227 activityC10227) {
        activityC10227.m25675();
        activityC10227.f30775.mo16337();
        activityC10227.m25692(-9223372036854775807L, false);
        activityC10227.f30827.m43232();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25691(int i, Bitmap bitmap) {
        View view;
        if (i != this.f30733 || this.f30760 == null || (view = this.f30814) == null || view.getVisibility() != 0) {
            return;
        }
        if (bitmap == null && this.f30763) {
            m25734();
            m25830();
        } else {
            this.f30760.setImageBitmap(bitmap);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25704(ActivityC10227 activityC10227, int i, C13547 c13547) {
        if (i != activityC10227.f30733) {
            return;
        }
        activityC10227.f30739 = c13547;
        View view = activityC10227.f30814;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7198 m25687(final ActivityC10227 activityC10227, long j, boolean z, final boolean z2) {
        InterfaceC9603 interfaceC9603;
        C12053 m38733;
        C7198 c7198;
        C11881 c11881;
        C0991 c0991;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C7198 c71982 = null;
        if (interfaceC4162 == null || (interfaceC9603 = activityC10227.f30775) == null || activityC10227.f30814 == null || activityC10227.f30760 == null) {
            return null;
        }
        if (activityC10227.f30745) {
            activityC10227.m25734();
            return null;
        }
        InterfaceC17889 mo16334 = interfaceC9603.mo16334();
        if (activityC10227.f30780) {
            InterfaceC4162 interfaceC41622 = activityC10227.f30786;
            C19130 c19130 = activityC10227.f30768;
            InterfaceC15097 interfaceC15097 = activityC10227.f30747;
            InterfaceC15097 interfaceC150972 = activityC10227.f30822;
            C23713 c23713 = activityC10227.f30778;
            C0991 c09912 = activityC10227.f30826;
            if (interfaceC41622 == null || c19130 == null || interfaceC15097 == null || interfaceC150972 == null || c23713 == null || c09912 == null || Build.VERSION.SDK_INT < 23 || !c23713.m52289()) {
                activityC10227.m25734();
                return null;
            }
            C2196 m44185 = c19130.m44185();
            if (m44185 == null) {
                activityC10227.m25734();
                return null;
            }
            if (z2) {
                activityC10227.m25839();
                C0991 c09913 = activityC10227.f30826;
                if (c09913 == null) {
                    activityC10227.m25734();
                    return null;
                }
                C4437 c4437 = activityC10227.f30771;
                if (c4437 != null) {
                    c4437.m13184();
                }
                activityC10227.f30760.setImageBitmap(null);
                c0991 = c09913;
            } else {
                c0991 = c09912;
            }
            int i = activityC10227.f30729;
            long j2 = 1 + activityC10227.f30748;
            activityC10227.f30748 = j2;
            activityC10227.f30805 = j;
            activityC10227.f30763 = z;
            C2466 c2466 = new C2466(i, j2, activityC10227.f30733, j, z, m44185, interfaceC15097, interfaceC150972, c23713, c0991, activityC10227.f30744);
            activityC10227.f30753.m37613(c2466);
            long m7950 = c2466.m7950();
            boolean m7946 = c2466.m7946();
            View view = activityC10227.f30814;
            if (view != null && activityC10227.f30760 != null && view.getVisibility() == 0) {
                c71982 = activityC10227.m25762(m7950, m7946);
            }
            C7198 m25846 = activityC10227.m25846();
            return m25846 != null ? m25846 : c71982;
        }
        if (mo16334 != null) {
            C16431 c16431 = activityC10227.f30744;
            if (c16431 == null) {
                m38733 = C12053.f36042;
            } else {
                m38733 = c16431.m38733(mo16334);
            }
            long duration = interfaceC4162.getDuration();
            if (duration <= 0 || duration == -9223372036854775807L || m38733.m29440()) {
                activityC10227.m25734();
                return null;
            }
            if (z && !m38733.m29432()) {
                activityC10227.m25734();
                return null;
            }
            activityC10227.f30805 = j;
            activityC10227.f30763 = z;
            if (z2) {
                activityC10227.f30760.setImageBitmap(null);
            }
            C7198 m25762 = activityC10227.m25762(j, z);
            activityC10227.f30814.setVisibility(0);
            if (m38733.m29432()) {
                if (activityC10227.f30791 == null) {
                    activityC10227.f30791 = new C22720(activityC10227.getApplicationContext());
                }
                activityC10227.f30791.m50778(mo16334, m38733, duration, activityC10227.f30733, new C1760(activityC10227));
                activityC10227.f30791.m50776(m25762.m19281(), m25762.m19280(), j);
                return m25762;
            }
            activityC10227.f30760.setImageBitmap(null);
            C22720 c22720 = activityC10227.f30791;
            if (c22720 != null) {
                c22720.m50775();
                if (m38733.m29437()) {
                    activityC10227.f30791.m50779();
                }
            }
            return m25762;
        }
        final InterfaceC4162 interfaceC41623 = activityC10227.f30786;
        final C23713 c237132 = activityC10227.f30778;
        final InterfaceC15097 interfaceC150973 = activityC10227.f30764;
        final C0991 c09914 = activityC10227.f30826;
        C11197 mo4595 = interfaceC41623 == 0 ? null : ((AbstractC14702) interfaceC41623).mo4595();
        Uri uri = (mo4595 == null || (c11881 = mo4595.f33612) == null) ? null : c11881.f35426;
        long duration2 = interfaceC41623 == 0 ? -9223372036854775807L : interfaceC41623.getDuration();
        if (interfaceC41623 == 0 || c237132 == null || interfaceC150973 == null || c09914 == null || uri == null || duration2 <= 0 || duration2 == -9223372036854775807L || Build.VERSION.SDK_INT < 23 || !c237132.m52289()) {
            activityC10227.m25734();
            return null;
        }
        activityC10227.f30805 = j;
        activityC10227.f30763 = z;
        C15807 c15807 = activityC10227.f30801;
        if (c15807 != null) {
            return activityC10227.m25688(c15807, duration2, j, z, z2);
        }
        Future future = activityC10227.f30797;
        if (future == null || future.isDone()) {
            final int i2 = activityC10227.f30784 + 1;
            activityC10227.f30784 = i2;
            final int i3 = activityC10227.f30733;
            final Uri uri2 = uri;
            c7198 = null;
            activityC10227.f30797 = C1802.f6208.submit(new Runnable() { // from class: l.ܿ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = ActivityC10227.f30722;
                    final C15807 m37444 = C15807.m37444(c237132, uri2, interfaceC150973, c09914);
                    final ActivityC10227 activityC102272 = ActivityC10227.this;
                    final int i5 = i2;
                    final int i6 = i3;
                    final InterfaceC4162 interfaceC41624 = interfaceC41623;
                    final boolean z3 = z2;
                    C4925.m14315(new Runnable() { // from class: l.ۡ۫ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC10227.m25702(ActivityC10227.this, i5, i6, m37444, interfaceC41624, z3);
                        }
                    });
                }
            });
        } else {
            c7198 = null;
        }
        activityC10227.m25734();
        return c7198;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25702(ActivityC10227 activityC10227, int i, int i2, C15807 c15807, InterfaceC4162 interfaceC4162, boolean z) {
        activityC10227.f30797 = null;
        if (i == activityC10227.f30784 && i2 == activityC10227.f30733 && c15807 != null) {
            activityC10227.f30801 = c15807;
            activityC10227.m25688(c15807, interfaceC4162.getDuration(), activityC10227.f30805, activityC10227.f30763, z);
        } else if (c15807 != null) {
            c15807.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7198 m25688(C15807 c15807, long j, long j2, boolean z, boolean z2) {
        ImageView imageView;
        if (j <= 0 || j == -9223372036854775807L || this.f30814 == null || (imageView = this.f30760) == null) {
            return null;
        }
        if (z2) {
            imageView.setImageBitmap(null);
        }
        C7198 m25762 = m25762(j2, z);
        this.f30814.setVisibility(0);
        if (this.f30791 == null) {
            this.f30791 = new C22720(getApplicationContext());
        }
        this.f30791.m50778((InterfaceC17889) null, c15807.m37445(), j, this.f30733, new C10933(this));
        this.f30791.m50776(m25762.m19281(), m25762.m19280(), j2);
        return m25762;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7198 m25846() {
        C2466 m37614;
        if (this.f30796 == null && !this.f30753.m37610() && (m37614 = this.f30753.m37614()) != null) {
            C15600 c15600 = this.f30800;
            C15600 m36762 = c15600 == null ? null : c15600.m36762(m37614.m7943(), m37614.m7950() * 1000);
            if (m36762 != null) {
                return m25686(m37614, m36762);
            }
            final C3877 c3877 = new C3877(m37614);
            this.f30796 = c3877;
            C1802.f6208.execute(new Runnable() { // from class: l.ܳ۫ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    final C15600 c156002;
                    final C3877 c38772 = c3877;
                    int i = ActivityC10227.f30722;
                    try {
                        if (C3877.m11698(c38772, Thread.currentThread())) {
                            C2466 m11700 = C3877.m11700(c38772);
                            c156002 = C15600.m36759(m11700.m7943(), m11700.m7950() * 1000, m11700.m7949(), m11700.m7944(), m11700.m7948(), m11700.m7951(), m11700.m7947());
                        } else {
                            c156002 = null;
                        }
                        C3877.m11699(c38772);
                        final ActivityC10227 activityC10227 = ActivityC10227.this;
                        C4925.m14315(new Runnable() { // from class: l.ܺ۫ۜ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC10227.m25714(ActivityC10227.this, c38772, c156002);
                            }
                        });
                    } catch (Throwable th) {
                        C3877.m11699(c38772);
                        throw th;
                    }
                }
            });
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25714(ActivityC10227 activityC10227, C3877 c3877, C15600 c15600) {
        if (activityC10227.f30796 != c3877) {
            return;
        }
        activityC10227.f30796 = null;
        C2466 m11700 = C3877.m11700(c3877);
        boolean z = m11700.m7952() == activityC10227.f30729 && m11700.m7945() == activityC10227.f30733;
        boolean m37611 = activityC10227.f30753.m37611(m11700);
        if (c15600 != null && z) {
            activityC10227.f30800 = c15600;
            if (activityC10227.m25686(m11700, c15600) != null) {
                return;
            }
        }
        if (c15600 == null && z && !m37611) {
            activityC10227.m25691(m11700.m7945(), (Bitmap) null);
        }
        activityC10227.m25846();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7198 m25686(C2466 c2466, C15600 c15600) {
        int m7952 = c2466.m7952();
        int i = this.f30729;
        int m7945 = c2466.m7945();
        int i2 = this.f30733;
        long m7942 = c2466.m7942();
        long j = this.f30748;
        long m37612 = this.f30753.m37612();
        if (m7952 != i || m7945 != i2 || m7942 > j || m7942 <= m37612 || this.f30753.m37610() || this.f30814 == null || this.f30760 == null) {
            return null;
        }
        this.f30800 = c15600;
        C7198 m25762 = m25762(this.f30805, this.f30763);
        this.f30814.setVisibility(0);
        if (this.f30771 == null) {
            this.f30771 = new C4437();
        }
        this.f30753.m37615(c2466);
        this.f30771.m13187(c15600, c2466.m7945(), new C16576(this, c2466));
        this.f30771.m13185(m25762.m19281(), m25762.m19280());
        return m25762;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25841(C2466 c2466, int i, Bitmap bitmap) {
        if (this.f30753.m37609(c2466)) {
            boolean z = c2466.m7952() == this.f30729 && i == this.f30733;
            boolean z2 = c2466.m7942() == this.f30748;
            if (z && (bitmap != null || z2)) {
                m25691(i, bitmap);
            }
            m25846();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25711(ActivityC10227 activityC10227, C2466 c2466, int i, C13547 c13547) {
        int m7952 = c2466.m7952();
        int i2 = activityC10227.f30729;
        int i3 = activityC10227.f30733;
        if (m7952 == i2 && i == i3 && i == i3) {
            activityC10227.f30739 = c13547;
            View view = activityC10227.f30814;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
        }
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m25839() {
        this.f30729++;
        this.f30753.m37608();
        C3877 c3877 = this.f30796;
        if (c3877 != null) {
            C3877.m11697(c3877);
            if (this.f30826 == C3877.m11700(c3877).m7951()) {
                this.f30826 = new C0991();
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25754(ActivityC10227 activityC10227) {
        activityC10227.f30800 = null;
        C4437 c4437 = activityC10227.f30771;
        activityC10227.f30771 = null;
        if (c4437 != null) {
            c4437.m13186(new RunnableC7281(1));
        }
        activityC10227.m25734();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public void m25734() {
        m25839();
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C22720 c22720 = this.f30791;
        if (c22720 != null) {
            c22720.m50775();
        }
        C4437 c4437 = this.f30771;
        if (c4437 != null) {
            c4437.m13184();
        }
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static void m25788(ActivityC10227 activityC10227) {
        View view = activityC10227.f30806;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static void m25756(ActivityC10227 activityC10227) {
        View view = activityC10227.f30806;
        if (view != null) {
            view.setVisibility(8);
            activityC10227.f30806.setTranslationX(0.0f);
            activityC10227.f30806.setTranslationY(0.0f);
        }
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    private void m25820() {
        this.f30733++;
        this.f30808 = C6404.f19812;
        this.f30739 = null;
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        Future future = this.f30797;
        this.f30797 = null;
        this.f30784++;
        if (future != null) {
            future.cancel(true);
        }
        C15807 c15807 = this.f30801;
        this.f30801 = null;
        C22720 c22720 = this.f30791;
        if (c22720 != null) {
            c22720.m50777(new RunnableC11222(1, c15807));
        } else if (c15807 != null) {
            c15807.close();
        }
        m25839();
        this.f30800 = null;
        C4437 c4437 = this.f30771;
        if (c4437 != null) {
            c4437.m13186(new RunnableC7281(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7198 m25762(long j, boolean z) {
        C8353 c8353;
        char c;
        int m6124;
        int max;
        View view;
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 != null) {
            AbstractC4628 listIterator = interfaceC4162.mo4574().m33608().listIterator(0);
            c8353 = null;
            loop0: while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                C23190 c23190 = (C23190) listIterator.next();
                if (c23190.m51440() == 2) {
                    for (int i = 0; i < c23190.f74548; i++) {
                        if (c23190.m51441(i)) {
                            c8353 = c23190.m51437(i);
                            break loop0;
                        }
                        if (c8353 == null && c23190.m51439(i, true)) {
                            c8353 = c23190.m51437(i);
                        }
                    }
                }
            }
        } else {
            c8353 = null;
        }
        C13547 c13547 = this.f30739;
        C6404 c6404 = this.f30808;
        C13547 m6125 = c8353 == null ? null : C1841.m6125(c8353.f25633, c8353.f25609, c8353.f25599, c8353.f25636);
        if (m6125 != null) {
            c13547 = m6125;
        } else if (c13547 == null) {
            C13547 m61252 = c6404 != null ? C1841.m6125(c6404.f19815, c6404.f19813, 0, c6404.f19814) : null;
            c13547 = m61252 != null ? m61252 : new C13547(16.0f, 9.0f);
        }
        int m27878 = C11266.m27878(180.0f);
        int m278782 = C11266.m27878(180.0f);
        if (m27878 <= 0) {
            m27878 = 16;
        }
        if (m278782 <= 0) {
            m278782 = 9;
        }
        float m32599 = c13547.m32599();
        int max2 = Math.max(1, Math.round(m27878 / m32599));
        if (max2 > m278782) {
            m27878 = Math.max(1, Math.round(m278782 * m32599));
        } else {
            m278782 = max2;
        }
        C7198 c7198 = new C7198(Math.max(1, m27878), Math.max(1, m278782));
        ViewGroup.LayoutParams layoutParams = this.f30814.getLayoutParams();
        layoutParams.width = c7198.m19281();
        layoutParams.height = c7198.m19280();
        this.f30814.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f30742;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f30742;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        if (z) {
            m6124 = C1841.m6124(width, c7198.m19281());
            c = 1;
        } else {
            int m19281 = c7198.m19281();
            InterfaceC4162 interfaceC41622 = this.f30786;
            View view2 = this.f30730;
            if (interfaceC41622 == null || view2 == null || view2.getWidth() <= 0) {
                c = 1;
                m6124 = C1841.m6124(width, m19281);
            } else {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr);
                this.f30742.getLocationInWindow(iArr2);
                int i2 = iArr[0] - iArr2[0];
                int width2 = view2.getWidth();
                long duration = interfaceC41622.getDuration();
                if (duration <= 0 || width2 <= 0) {
                    c = 1;
                    m6124 = C1841.m6124(width, m19281);
                } else {
                    c = 1;
                    m6124 = Math.max(0, Math.min((Math.round(width2 * (Math.max(0L, Math.min(j, duration)) / duration)) + i2) - (m19281 / 2), Math.max(0, width - m19281)));
                }
            }
        }
        int m19280 = c7198.m19280();
        int m278783 = C11266.m27878(12.0f);
        if (z && (view = this.f30806) != null && view.getVisibility() == 0) {
            int m25781 = m19280 + m278783 + m25781(width);
            int max3 = Math.max(0, m278783);
            int i3 = height - m25781;
            max = Math.max(max3, Math.min(i3 / 2, Math.max(max3, i3 - max3)));
        } else {
            View view3 = this.f30790;
            if (view3 != null && view3.getHeight() > 0) {
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f30790.getLocationInWindow(iArr3);
                this.f30742.getLocationInWindow(iArr4);
                int i4 = iArr3[c] - iArr4[c];
                if (i4 > 0) {
                    max = Math.max(m278783, (i4 - m19280) - m278783);
                }
            }
            max = Math.max(m278783, (height - m19280) - C11266.m27878(96.0f));
        }
        this.f30814.setTranslationX(m6124);
        this.f30814.setTranslationY(max);
        if (z) {
            int m192802 = c7198.m19280();
            View view4 = this.f30806;
            if (view4 != null && view4.getVisibility() == 0) {
                int m278784 = C11266.m27878(12.0f);
                m25804(width);
                int measuredWidth = this.f30806.getMeasuredWidth();
                if (measuredWidth <= 0 && (measuredWidth = this.f30806.getWidth()) <= 0) {
                    measuredWidth = width;
                }
                int min = Math.min(max + m192802 + m278784, Math.max(m278784, (height - m25781(width)) - m278784));
                this.f30806.setTranslationX(C1841.m6124(width, measuredWidth));
                this.f30806.setTranslationY(min);
            }
        }
        return c7198;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public void m25830() {
        View view = this.f30806;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        FrameLayout frameLayout = this.f30742;
        int width = frameLayout == null ? 0 : frameLayout.getWidth();
        if (width <= 0) {
            width = getResources().getDisplayMetrics().widthPixels;
        }
        FrameLayout frameLayout2 = this.f30742;
        int height = frameLayout2 == null ? 0 : frameLayout2.getHeight();
        if (height <= 0) {
            height = getResources().getDisplayMetrics().heightPixels;
        }
        int m27878 = C11266.m27878(12.0f);
        m25804(width);
        int measuredWidth = this.f30806.getMeasuredWidth();
        if (measuredWidth <= 0 && (measuredWidth = this.f30806.getWidth()) <= 0) {
            measuredWidth = width;
        }
        int m25781 = m25781(width);
        this.f30806.setTranslationX(C1841.m6124(width, measuredWidth));
        View view2 = this.f30806;
        int max = Math.max(0, m27878);
        int i = height - m25781;
        view2.setTranslationY(Math.max(max, Math.min(i / 2, Math.max(max, i - max))));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m25781(int i) {
        m25804(i);
        int measuredHeight = this.f30806.getMeasuredHeight();
        return measuredHeight > 0 ? measuredHeight : Math.max(1, this.f30806.getHeight());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m25804(int i) {
        int makeMeasureSpec;
        int i2;
        View view = this.f30806;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.width) > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
        this.f30806.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m25825(int i) {
        ViewGroup viewGroup;
        int childCount;
        C0289 c0289 = this.f30755;
        ViewGroup viewGroup2 = this.f30776;
        if (c0289 == null || viewGroup2 == null) {
            return;
        }
        if (i != 4 || (viewGroup = this.f30827.m43222()) == null) {
            viewGroup = viewGroup2;
        }
        if (c0289.getParent() == viewGroup) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c0289.getLayoutParams();
        ViewParent parent = c0289.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(c0289);
        }
        if (viewGroup == viewGroup2) {
            childCount = Math.min(this.f30767, viewGroup.getChildCount());
        } else {
            childCount = viewGroup.getChildCount();
        }
        viewGroup.addView(c0289, childCount, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (android.text.TextUtils.equals(r1, m25739()) != false) goto L15;
     */
    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m25823() {
        /*
            r3 = this;
            l.֡۠ۧ r0 = r3.f30755
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r3.f30749
            if (r1 == 0) goto La
            goto L29
        La:
            boolean r1 = m25817()
            if (r1 != 0) goto L11
            goto L2b
        L11:
            l.᩵ۤۜ r1 = r3.f30750
            java.lang.Object r1 = l.C19400.m44676(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L2b
            java.lang.String r2 = r3.m25739()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L2b
        L29:
            r1 = 4
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25823():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m25684(ActivityC10227 activityC10227, List list) {
        int i;
        C13048 c13048;
        C19811 c19811;
        int i2;
        int i3;
        C19811 c198112;
        ArrayList arrayList = activityC10227.f30802;
        if (!((AbstractCollection) list).isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            AbstractC14545 abstractC14545 = (AbstractC14545) list;
            AbstractC4628 listIterator = abstractC14545.listIterator(0);
            while (listIterator.hasNext()) {
                C19811 c198113 = (C19811) listIterator.next();
                if (c198113.f63987 == null && c198113.f63992 != null && c198113.f63997 == -3.4028235E38f) {
                    arrayList2.add(c198113);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C19811 c198114 = (C19811) it.next();
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            c13048 = (C13048) arrayList3.get(size);
                            c198112 = c13048.f39066;
                            if (c198112 == c198114) {
                                arrayList3.remove(size);
                                break;
                            }
                        } else {
                            int size2 = arrayList3.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    c13048 = null;
                                    break;
                                }
                                c13048 = (C13048) arrayList3.get(size2);
                                c19811 = c13048.f39066;
                                if (c19811.equals(c198114)) {
                                    arrayList3.remove(size2);
                                    break;
                                }
                            }
                        }
                    }
                    if (c13048 == null) {
                        int m25678 = m25678(c198114);
                        int i4 = 0;
                        while (true) {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                C13048 c130482 = (C13048) it2.next();
                                i2 = c130482.f39067;
                                i3 = c130482.f39068;
                                if (i4 >= i3 + i2 || i2 >= i4 + m25678) {
                                }
                            }
                            i4++;
                        }
                        c13048 = new C13048(c198114, i4, m25678);
                    } else {
                        c13048.f39066 = c198114;
                        c13048.f39068 = m25678(c198114);
                    }
                    arrayList4.add(c13048);
                }
                arrayList.clear();
                arrayList.addAll(arrayList4);
                ArrayList arrayList5 = new ArrayList(list.size());
                AbstractC4628 listIterator2 = abstractC14545.listIterator(0);
                int i5 = 0;
                while (listIterator2.hasNext()) {
                    C19811 c198115 = (C19811) listIterator2.next();
                    if (c198115.f63987 == null && c198115.f63992 != null && c198115.f63997 == -3.4028235E38f) {
                        int i6 = i5 + 1;
                        i = ((C13048) arrayList4.get(i5)).f39067;
                        float max = Math.max(0.0f, 0.955f - (i * 0.049999997f));
                        C21927 m45556 = c198115.m45556();
                        m45556.m49385(max, 0);
                        m45556.m49386(2);
                        arrayList5.add(m45556.m49383());
                        i5 = i6;
                    } else {
                        arrayList5.add(c198115);
                    }
                }
                return arrayList5;
            }
            arrayList.clear();
            return list;
        }
        arrayList.clear();
        return list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25678(C19811 c19811) {
        CharSequence charSequence = c19811.f63992;
        int i = 1;
        if (charSequence != null && charSequence.length() != 0) {
            int length = charSequence.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == '\n') {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    private void m25675() {
        if (this.f30745 || this.f30786 == null || this.f30775 == null) {
            return;
        }
        String str = this.f30825;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long duration = this.f30786.getDuration();
        if (duration == -9223372036854775807L) {
            return;
        }
        C22926.m51015(str, this.f30786.getCurrentPosition(), duration);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25692(long j, boolean z) {
        String m25682;
        long max;
        C16431 c16431;
        if (this.f30786 == null || isFinishing() || isDestroyed()) {
            return;
        }
        this.f30745 = false;
        this.f30727 = false;
        this.f30757 = false;
        this.f30759 = false;
        this.f30817 = false;
        this.f30724 = false;
        m25843(false);
        this.f30823 = false;
        int incrementAndGet = this.f30803.incrementAndGet();
        this.f30783 = incrementAndGet;
        C11197 mo16333 = this.f30775.mo16333();
        InterfaceC17889 mo16334 = this.f30775.mo16334();
        if (mo16334 != null) {
            m25682 = m25682(mo16334);
        } else {
            C11881 c11881 = mo16333.f33612;
            if (c11881 != null) {
                Object obj = c11881.f35422;
                if (obj instanceof String) {
                    m25682 = (String) obj;
                }
            }
            throw new IllegalStateException("URL media item has no playback key");
        }
        String str = m25682;
        if (j == -9223372036854775807L) {
            max = C22926.m51013(str);
        } else {
            max = Math.max(0L, j);
        }
        final C8110 c8110 = new C8110(incrementAndGet, mo16333, mo16334, max, str, z, (z || mo16334 == null || (c16431 = this.f30744) == null) ? null : c16431.m38743());
        List m25793 = m25793(c8110.m21573());
        boolean m25813 = m25813(c8110.m21573());
        this.f30792 = z;
        this.f30802.clear();
        m25827();
        m25771(false);
        m25815();
        if (z || c8110.m21569() == null) {
            m25699(c8110, C15164.m35863(c8110.m21572(), m25793, m25813));
        } else {
            this.f30754 = C1802.f6208.submit(new Runnable() { // from class: l.ᩴ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC10227.m25716(ActivityC10227.this, c8110);
                }
            });
        }
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m25815() {
        C16431 c16431 = this.f30744;
        if (c16431 != null) {
            c16431.m38739();
        }
        m25755();
        m25752();
        m25790();
        C19400.m44671(this.f30824);
        m25744();
        m25729();
        m25734();
        this.f30799 = true;
        InterfaceC4162 interfaceC4162 = this.f30786;
        m25742(interfaceC4162 != null ? interfaceC4162.mo4603() : 1);
        m25693((CharSequence) getString(R.string.MT_Protector_res_0x7f120528));
        m25763((CharSequence) getString(R.string.MT_Protector_res_0x7f120528));
        this.f30786.stop();
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static void m25740(ActivityC10227 activityC10227) {
        activityC10227.f30799 = false;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        activityC10227.m25742(interfaceC4162 == null ? 1 : interfaceC4162.mo4603());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m25742(int i) {
        int i2 = 0;
        if (this.f30799 && i != 1) {
            this.f30799 = false;
        }
        View view = this.f30820;
        if (view == null) {
            return;
        }
        if (!this.f30799 && i != 2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25716(final ActivityC10227 activityC10227, final C8110 c8110) {
        final C15164 m35863;
        AbstractC13921 m21569 = c8110.m21569();
        InterfaceC17889 m21568 = c8110.m21568();
        if (m21569 == null || m21568 == null) {
            m35863 = C15164.m35863(c8110.m21572(), Collections.EMPTY_LIST, false);
        } else {
            List list = Collections.EMPTY_LIST;
            try {
                list = C17781.m41660(m21568, m21569);
                C1553 m41661 = C17781.m41661(list, m21568, m21569.mo13919());
                m35863 = m25689(c8110.m21572(), list, m41661, m41661 == null ? EnumC20811.NONE : EnumC20811.AUTO, true);
            } catch (Exception unused) {
                m35863 = C15164.m35863(c8110.m21572(), list, false);
            }
        }
        C4925.m14315(new Runnable() { // from class: l.ᩳ۫ۜ
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC10227.this.m25699(c8110, m35863);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145 A[Catch: Exception -> 0x017a, TryCatch #0 {Exception -> 0x017a, blocks: (B:33:0x00a1, B:35:0x00ab, B:37:0x00b1, B:38:0x00b5, B:40:0x00bd, B:41:0x00bf, B:43:0x00c5, B:46:0x00da, B:47:0x00ea, B:50:0x0101, B:52:0x0119, B:55:0x0124, B:56:0x0138, B:58:0x0145, B:59:0x0167, B:62:0x015c, B:63:0x0133, B:64:0x00fc, B:65:0x00cc, B:67:0x00d7, B:68:0x00de, B:71:0x00e7), top: B:32:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015c A[Catch: Exception -> 0x017a, TryCatch #0 {Exception -> 0x017a, blocks: (B:33:0x00a1, B:35:0x00ab, B:37:0x00b1, B:38:0x00b5, B:40:0x00bd, B:41:0x00bf, B:43:0x00c5, B:46:0x00da, B:47:0x00ea, B:50:0x0101, B:52:0x0119, B:55:0x0124, B:56:0x0138, B:58:0x0145, B:59:0x0167, B:62:0x015c, B:63:0x0133, B:64:0x00fc, B:65:0x00cc, B:67:0x00d7, B:68:0x00de, B:71:0x00e7), top: B:32:0x00a1 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m25699(l.C8110 r9, l.C15164 r10) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25699(l.۠ۤۜ, l.ܶۤۜ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m25771(boolean z) {
        Future future = this.f30754;
        this.f30754 = null;
        if (future != null) {
            future.cancel(true);
        }
        if (z) {
            this.f30783 = this.f30803.incrementAndGet();
        }
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    private void m25827() {
        this.f30732 = EnumC20811.NONE;
        this.f30738 = null;
        C19400.m44671(this.f30824);
        List list = Collections.EMPTY_LIST;
        this.f30804 = list;
        this.f30723 = false;
        this.f30807 = null;
        this.f30749 = false;
        C0289 c0289 = this.f30755;
        if (c0289 == null) {
            return;
        }
        c0289.m1636(list);
        c0289.setVisibility(0);
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25818(ActivityC10227 activityC10227) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == null || activityC10227.f30732 == EnumC20811.NONE || activityC10227.f30792 || TextUtils.isEmpty(activityC10227.f30738)) {
            return false;
        }
        activityC10227.m25692(interfaceC4162.getCurrentPosition(), true);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25709(ActivityC10227 activityC10227, CharSequence charSequence, C11197 c11197) {
        if (!TextUtils.isEmpty(charSequence)) {
            activityC10227.f30769.setText(charSequence);
        } else {
            activityC10227.f30769.setText(c11197 == null ? null : c11197.f33614);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m25682(InterfaceC17889 interfaceC17889) {
        String path = interfaceC17889.getPath();
        C16431 c16431 = this.f30744;
        if (c16431 == null) {
            return path;
        }
        AbstractC13921 m38743 = c16431.m38743();
        if (!(m38743 instanceof AbstractC3163)) {
            return path;
        }
        return ((AbstractC3163) m38743).mo9688() + path;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m25681(C11197 c11197) {
        if (c11197 == null) {
            return null;
        }
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            Object obj = c11881.f35422;
            if (obj instanceof InterfaceC17889) {
                return m25682((InterfaceC17889) obj);
            }
            return obj instanceof String ? (String) obj : c11881.f35426.toString();
        }
        return c11197.f33614;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m25760(C11197 c11197) {
        if (c11197 == null) {
            return null;
        }
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            Object obj = c11881.f35422;
            if (obj instanceof InterfaceC17889) {
                return m25682((InterfaceC17889) obj);
            }
        }
        if (c11881 != null) {
            Object obj2 = c11881.f35422;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        }
        return null;
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    private String m25739() {
        if (!TextUtils.isEmpty(this.f30825)) {
            return this.f30825;
        }
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null) {
            return null;
        }
        return m25760(interfaceC4162.mo4595());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25718(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30750, activityC10227.m25760(c11197), new C3938());
        activityC10227.m25823();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25698(C6404 c6404) {
        InterfaceC4162 interfaceC4162 = this.f30786;
        C19400 c19400 = this.f30750;
        String str = (String) C19400.m44676(c19400);
        if (interfaceC4162 == null || TextUtils.isEmpty(str) || !m25817() || !TextUtils.equals(str, m25739())) {
            return;
        }
        int i = c6404.f19815;
        int i2 = c6404.f19813;
        boolean z = false;
        int m22973 = C8897.m22973(i, i2, 0, c6404.f19814);
        if (m22973 == -1) {
            if (c6404.f19815 <= 0 || i2 <= 0) {
                return;
            }
            C19400.m44675(c19400);
            this.f30749 = false;
            m25823();
            return;
        }
        C19400.m44675(c19400);
        int i3 = getResources().getConfiguration().orientation;
        if (m22973 != 0 ? !(m22973 != 1 || i3 == 1) : i3 != 2) {
            z = true;
        }
        this.f30749 = z;
        this.f30772 = EnumC18694.AUTO;
        if (getRequestedOrientation() != m22973) {
            setRequestedOrientation(m22973);
        }
        if (this.f30749) {
            return;
        }
        m25823();
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m25755() {
        C19400.m44671(this.f30750);
        this.f30749 = false;
        m25823();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m25805(ActivityC10227 activityC10227) {
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        C9876.m24966(activityC10227.f30794);
        C9876.m24966(activityC10227.f30790);
        C9876.m24966(activityC10227.f30746);
        C21165.m48103(activityC10227.f30819);
        C21165.m48103(activityC10227.f30811);
        C21165.m48103(activityC10227.f30740);
        C5157 c5157 = activityC10227.f30756;
        if (c5157 == null) {
            return;
        }
        int m14744 = c5157.m14744();
        int m14742 = activityC10227.f30756.m14742();
        int m14743 = activityC10227.f30756.m14743();
        int m14741 = activityC10227.f30756.m14741();
        if (m14744 > 0) {
            C21165.m48102(-1, Math.max(C11266.m27878(20.0f), C11266.m27878(10.0f) + m14744), -1, activityC10227.f30819);
            C9876.m24967(activityC10227.f30794, -1, m14744, -1, -1);
        }
        if (m14742 > 0) {
            C21165.m48102(m14742, -1, -1, activityC10227.f30811);
            C9876.m24967(activityC10227.f30794, m14742, -1, -1, -1);
            C9876.m24967(activityC10227.f30790, m14742, -1, -1, -1);
            C9876.m24967(activityC10227.f30746, m14742, -1, -1, -1);
        }
        if (m14743 > 0) {
            C21165.m48102(-1, -1, m14743, activityC10227.f30740);
            C9876.m24967(activityC10227.f30794, -1, -1, m14743, -1);
            C9876.m24967(activityC10227.f30790, -1, -1, m14743, -1);
            C9876.m24967(activityC10227.f30746, -1, -1, m14743, -1);
        }
        if (m14741 > 0) {
            C9876.m24967(activityC10227.f30790, -1, -1, -1, m14741);
            C9876.m24967(activityC10227.f30746, -1, -1, -1, m14741);
        }
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private void m25802() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (!ApplicationC20075.f65008.getBoolean("ins", false) || ApplicationC20075.f65008.getBoolean("vpun", true)) {
            if (Build.VERSION.SDK_INT >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } else {
            attributes.layoutInDisplayCutoutMode = 2;
        }
        getWindow().setAttributes(attributes);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25713(ActivityC10227 activityC10227, C2978 c2978, boolean z) {
        c2978.setEnabled(z);
        C22870.m50970(ApplicationC20075.f65008, "vpffs", z);
        activityC10227.m25774();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25712(ActivityC10227 activityC10227, C2978 c2978, C21610 c21610) {
        activityC10227.f30756 = c21610.m48833();
        boolean z = ApplicationC20075.f65008.getBoolean("ins", false);
        if (activityC10227.f30756 == null || z) {
            if (z) {
                C4925.m14315(new RunnableC19109(1, activityC10227));
            }
        } else {
            ApplicationC20075.f65008.edit().putBoolean("ins", true).apply();
            c2978.setVisibility(0);
            if (c2978.isChecked()) {
                c2978.setChecked(false);
            } else {
                activityC10227.m25802();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25796(ActivityC10227 activityC10227, View view) {
        activityC10227.f30786.mo4568(new C2730(((Float) view.getTag()).floatValue()));
        TextView[] textViewArr = activityC10227.f30779;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView = textViewArr[i];
            boolean z = textView == view;
            textView.setTextColor(z ? C21943.f70257 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25764(ActivityC10227 activityC10227) {
        activityC10227.f30827.m43231();
        activityC10227.f30746.scrollTo(0, 0);
        activityC10227.f30746.setTranslationY(r0.getHeight());
        activityC10227.f30758.setVisibility(0);
        View view = activityC10227.f30746;
        ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f).start();
        activityC10227.m25693((CharSequence) null);
        activityC10227.m25763((CharSequence) null);
        activityC10227.f30821.m26422(activityC10227.f30812);
        ((RunnableC13109) activityC10227.f30743).run();
        float f = activityC10227.f30786.mo4599().f8510;
        for (TextView textView : activityC10227.f30779) {
            boolean z = Math.abs(((Float) textView.getTag()).floatValue() - f) < 0.001f;
            textView.setTextColor(z ? C21943.f70257 : -1);
            textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25766(ActivityC10227 activityC10227, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        c21282.m48300(8388661);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, 1, 0, R.string.MT_Protector_res_0x7f1206ab);
        int i = 0;
        while (i < 5) {
            int i2 = f30721[i];
            int i3 = i + 100;
            i++;
            m48304.add(0, i3, i, activityC10227.getString(R.string.MT_Protector_res_0x7f1206a9, Integer.valueOf(i2)));
        }
        m48304.add(0, 200, 6, R.string.MT_Protector_res_0x7f1206a6);
        c21282.m48302(new C1324(activityC10227));
        c21282.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25723(ActivityC10227 activityC10227, MenuItem menuItem) {
        C10516 c10516 = activityC10227.f30821;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            c10516.m26420();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            c10516.m26421(f30721[i]);
            return true;
        }
        C17988 c17988 = new C17988(activityC10227, activityC10227);
        c17988.m5519(R.string.MT_Protector_res_0x7f1206a8);
        c17988.m5523();
        c17988.m5525();
        c17988.m5520(activityC10227.getString(R.string.MT_Protector_res_0x7f1206a7));
        int m26425 = c10516.m26425();
        if (m26425 > 0) {
            c17988.m5522(String.valueOf(m26425));
            c17988.m5526();
        }
        c17988.m5527();
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m25799(boolean z) {
        this.f30821.m26424(this.f30812);
        C4925.m14324().removeCallbacks(this.f30743);
        View view = this.f30746;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), this.f30746.getHeight());
        ofFloat.addListener(new C17282(this));
        if (z) {
            ofFloat.setDuration(150L);
        }
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public void m25833() {
        TextView textView = this.f30737;
        if (textView == null) {
            return;
        }
        int m26425 = this.f30821.m26425();
        if (m26425 > 0) {
            textView.setText(getString(R.string.MT_Protector_res_0x7f1206ac, Integer.valueOf(m26425)));
        } else {
            textView.setText(R.string.MT_Protector_res_0x7f1206aa);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public void m25749() {
        Handler m14324 = C4925.m14324();
        Runnable runnable = this.f30743;
        m14324.removeCallbacks(runnable);
        long m26423 = this.f30821.m26423();
        if (m26423 <= 0) {
            return;
        }
        long j = m26423 % 60000;
        C4925.m14324().postDelayed(runnable, j != 0 ? j : 60000L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25719(ActivityC10227 activityC10227, C12343 c12343, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null || itemId < 0 || itemId > c12343.m29947().size()) {
            return;
        }
        C14017 mo4574 = interfaceC1318.mo4574();
        if (!TextUtils.equals(c12343.m29946(), activityC10227.m25681(((AbstractC14702) interfaceC1318).mo4595()))) {
            activityC10227.m25844(mo4574);
            return;
        }
        if (itemId == 0) {
            activityC10227.f30731 = null;
            interfaceC1318.mo4569(interfaceC1318.mo4580().mo29029().mo17262(2, false).mo17261(2).mo17266());
            activityC10227.m25844(mo4574);
            return;
        }
        C7404 c7404 = (C7404) c12343.m29947().get(itemId - 1);
        for (C7404 c74042 : C16452.m38760(activityC10227.getResources(), mo4574)) {
            if (c74042.m19927() == c7404.m19927() && c74042.m19924().m51438().equals(c7404.m19924().m51438())) {
                activityC10227.f30731 = null;
                interfaceC1318.mo4569(C16452.m38761(interfaceC1318.mo4580(), c7404));
                activityC10227.m25844(mo4574);
                return;
            }
        }
        activityC10227.m25844(mo4574);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25842(C14017 c14017) {
        C7404 c7404;
        InterfaceC4162 interfaceC4162 = this.f30786;
        C10809 c10809 = this.f30731;
        if (!this.f30780 || interfaceC4162 == null || c10809 == null) {
            return;
        }
        Iterator it = C16452.m38760(getResources(), c14017).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c7404 = null;
                break;
            }
            c7404 = (C7404) it.next();
            if (C10809.m27023(c10809, c7404.m19926())) {
                if (i == c10809.m27024()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (c7404 == null) {
            return;
        }
        this.f30731 = null;
        interfaceC4162.mo4569(C16452.m38761(interfaceC4162.mo4580(), c7404));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25844(C14017 c14017) {
        CharSequence text;
        if (this.f30780 && this.f30761 != null) {
            List m38760 = C16452.m38760(getResources(), c14017);
            if (m38760.size() >= 2) {
                InterfaceC4162 interfaceC4162 = this.f30786;
                int m38758 = interfaceC4162 == null ? 0 : C16452.m38758(m38760, interfaceC4162.mo4580());
                if (m38758 > 0 && m38758 <= m38760.size()) {
                    text = ((C7404) m38760.get(m38758 - 1)).m19923();
                } else {
                    text = getText(R.string.MT_Protector_res_0x7f120345);
                }
                this.f30761.setText(text);
                this.f30761.setContentDescription(getString(R.string.MT_Protector_res_0x7f120b55, text));
                this.f30761.setVisibility(0);
                return;
            }
            TextView textView = this.f30761;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.f30761;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static void m25791(ActivityC10227 activityC10227) {
        TextView textView = activityC10227.f30761;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25708(final ActivityC10227 activityC10227, View view) {
        final C12343 m29944;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        int i = 0;
        C21282 c21282 = null;
        if (interfaceC1318 == null || !activityC10227.f30780) {
            m29944 = C12343.m29944(null);
        } else {
            String m25681 = activityC10227.m25681(((AbstractC14702) interfaceC1318).mo4595());
            List m38760 = C16452.m38760(activityC10227.getResources(), interfaceC1318.mo4574());
            if (m38760.size() < 2) {
                m29944 = C12343.m29944(m25681);
            } else {
                m29944 = new C12343(m25681, m38760, C16452.m38758(m38760, interfaceC1318.mo4580()), i);
            }
        }
        if (m29944.m29947().size() >= 2) {
            c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 m48304 = c21282.m48304();
            m48304.add(0, 0, 0, R.string.MT_Protector_res_0x7f120345).setCheckable(true);
            int i2 = 0;
            while (i2 < m29944.m29947().size()) {
                int i3 = i2 + 1;
                m48304.add(0, i3, i3, ((C7404) m29944.m29947().get(i2)).m19925()).setCheckable(true);
                i2 = i3;
            }
            m48304.setGroupCheckable(0, true, true);
            int m29945 = m29944.m29945();
            if (m29945 >= 0 && m29945 < m48304.size()) {
                m48304.getItem(m29945).setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.ۜ۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10227.m25719(ActivityC10227.this, m29944, menuItem);
                    return true;
                }
            });
        } else {
            InterfaceC4162 interfaceC4162 = activityC10227.f30786;
            activityC10227.m25844(interfaceC4162 == null ? C14017.f42393 : interfaceC4162.mo4574());
        }
        if (c21282 != null) {
            c21282.m48305();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m25806(final ActivityC10227 activityC10227, View view) {
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        if (interfaceC1318.mo4574().m33610() && ((AbstractC14702) interfaceC1318).mo4595() != null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120528);
            return;
        }
        final C14459 m25808 = activityC10227.m25808();
        if (!m25808.m34523().isEmpty()) {
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 m48304 = c21282.m48304();
            m48304.add(0, 0, 0, R.string.MT_Protector_res_0x7f120b50).setCheckable(true);
            int i = 0;
            while (i < m25808.m34523().size()) {
                int i2 = i + 1;
                m48304.add(0, i2, i2, ((C23632) m25808.m34523().get(i)).m52118()).setCheckable(true);
                i = i2;
            }
            m48304.setGroupCheckable(0, true, true);
            int m34520 = m25808.m34520();
            if (m34520 >= 0 && m34520 < m48304.size()) {
                m48304.getItem(m34520).setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.᩻۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ActivityC10227.m25720(ActivityC10227.this, m25808, menuItem);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120b51);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25720(ActivityC10227 activityC10227, C14459 c14459, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == 0 || itemId < 0 || itemId > c14459.m34523().size()) {
            return;
        }
        if (!TextUtils.equals(c14459.m34522(), activityC10227.m25681(((AbstractC14702) interfaceC4162).mo4595()))) {
            activityC10227.m25693((CharSequence) null);
            return;
        }
        if (itemId > 0) {
            C23632 c23632 = (C23632) c14459.m34523().get(itemId - 1);
            m25697(interfaceC4162, c23632);
            String m34521 = c14459.m34521();
            if (!TextUtils.isEmpty(m34521)) {
                C13588.m32669(c23632.m52121(), m34521);
            }
            activityC10227.m25693(c23632.m52118());
            return;
        }
        activityC10227.m25744();
        String m345212 = c14459.m34521();
        if (!TextUtils.isEmpty(m345212)) {
            C13588.m32671(m345212);
        }
        activityC10227.m25693((CharSequence) null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25772(ActivityC10227 activityC10227, C14017 c14017) {
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        String str = (String) C19400.m44676(activityC10227.f30813);
        if (interfaceC4162 != null && !TextUtils.isEmpty(str) && !c14017.m33610() && TextUtils.equals(str, activityC10227.f30825)) {
            C14459 m25808 = activityC10227.m25808();
            if (TextUtils.equals(str, m25808.m34521())) {
                if (m25808.m34523().isEmpty()) {
                    activityC10227.m25752();
                    return false;
                }
                if (m25677(m25808.m34523(), interfaceC4162.mo4580()) > 0) {
                    activityC10227.m25752();
                    return false;
                }
                int m32667 = C13588.m32667(str);
                activityC10227.m25752();
                if (m32667 >= 0) {
                    if (m32667 >= m25808.m34523().size()) {
                        C13588.m32671(str);
                        return false;
                    }
                    C23632 c23632 = (C23632) m25808.m34523().get(m32667);
                    m25697(interfaceC4162, c23632);
                    activityC10227.m25693(c23632.m52118());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static void m25831(ActivityC10227 activityC10227) {
        activityC10227.m25693((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m25693(CharSequence charSequence) {
        CharSequence charSequence2;
        TextView textView = this.f30762;
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (textView == null || interfaceC4162 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        Iterator it = m25794(interfaceC4162.mo4574()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequence2 = null;
                break;
            }
            C23632 c23632 = (C23632) it.next();
            if (c23632.m52120().m51442()) {
                charSequence2 = c23632.m52118();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            textView.setText(charSequence2);
            return;
        }
        C14017 mo4574 = interfaceC4162.mo4574();
        if (mo4574.m33610()) {
            textView.setText(R.string.MT_Protector_res_0x7f120528);
        } else if (!mo4574.m33609(1)) {
            textView.setText(R.string.MT_Protector_res_0x7f120b51);
        } else {
            textView.setText(R.string.MT_Protector_res_0x7f120b50);
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private C14459 m25808() {
        String m25760;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return C14459.m34519(null, null);
        }
        C11197 mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
        String m25681 = m25681(mo4595);
        if (!TextUtils.isEmpty(this.f30825)) {
            m25760 = this.f30825;
        } else {
            m25760 = m25760(mo4595);
        }
        String str = m25760;
        C14017 mo4574 = interfaceC1318.mo4574();
        if (mo4574.m33610()) {
            return C14459.m34519(m25681, str);
        }
        List m25794 = m25794(mo4574);
        if (m25794.isEmpty()) {
            return C14459.m34519(m25681, str);
        }
        return new C14459(m25681, str, m25794, m25677(m25794, interfaceC1318.mo4580()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private List m25794(C14017 c14017) {
        ArrayList arrayList = new ArrayList();
        AbstractC4628 listIterator = c14017.m33608().listIterator(0);
        while (listIterator.hasNext()) {
            C23190 c23190 = (C23190) listIterator.next();
            int m51440 = c23190.m51440();
            int i = c23190.f74548;
            if (m51440 == 1) {
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (c23190.m51439(i2, true)) {
                        arrayList2.add(Integer.valueOf(i2));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C6699(c23190, arrayList2, c23190.m51437(((Integer) arrayList2.get(0)).intValue()), arrayList.size()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6699 c6699 = (C6699) it.next();
            arrayList3.add(m25679(c6699.m18250(), false));
            arrayList4.add(m25679(c6699.m18250(), true));
        }
        HashMap m25683 = m25683(arrayList3);
        HashMap m256832 = m25683(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C6699 c66992 = (C6699) arrayList.get(i3);
            String str = (String) arrayList3.get(i3);
            String m25803 = m25803(str);
            if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(m25683, m25803, 0)).intValue() > 1) {
                str = (String) arrayList4.get(i3);
                String m258032 = m25803(str);
                if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(m256832, m258032, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector_res_0x7f120b4f) + " " + (c66992.m18249() + 1);
                }
            }
            arrayList5.add(new C23632(c66992.m18247(), c66992.m18248(), str, c66992.m18249()));
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m25679(l.C8353 r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r3.f25635
            m25694(r1, r0)
            java.lang.String r1 = r3.f25603
            java.lang.String r1 = m25782(r1)
            m25694(r1, r0)
            int r1 = r3.f25608
            java.lang.String r1 = m25836(r1)
            m25694(r1, r0)
            int r1 = r3.f25625
            if (r1 <= 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "ch"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            m25694(r1, r0)
        L35:
            r1 = 0
            if (r4 == 0) goto L68
            java.lang.String r4 = r3.f25614
            java.lang.String r3 = r3.f25619
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L5e
            r3 = 47
            int r3 = r4.lastIndexOf(r3)
            if (r3 < 0) goto L50
            int r3 = r3 + 1
            java.lang.String r4 = r4.substring(r3)
        L50:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L57
            goto L64
        L57:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r4.toUpperCase(r3)
            goto L65
        L5e:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L65
        L64:
            r3 = r1
        L65:
            m25694(r3, r0)
        L68:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6f
            return r1
        L6f:
            java.lang.String r3 = " · "
            java.lang.String r3 = android.text.TextUtils.join(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25679(l.۠ᩴ֫, boolean):java.lang.String");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m25782(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals("und", str)) {
            return null;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        String displayLanguage = forLanguageTag.getDisplayLanguage(Locale.getDefault());
        if (TextUtils.isEmpty(displayLanguage)) {
            displayLanguage = forLanguageTag.getDisplayLanguage(forLanguageTag);
        }
        return TextUtils.isEmpty(displayLanguage) ? str : displayLanguage;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m25836(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C3603.m11051(i));
        arrayList.remove("main");
        if (arrayList.isEmpty()) {
            return null;
        }
        return TextUtils.join("/", arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25697(InterfaceC4162 interfaceC4162, C23632 c23632) {
        interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(1, false).mo17261(1).mo17264(new C12607(c23632.m52120().m51438(), c23632.m52119())).mo17266());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25769(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30813, activityC10227.m25760(c11197), new C3938());
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    private void m25752() {
        C19400.m44671(this.f30813);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r0.mo4569(r1.mo29029().mo17262(1, false).mo17261(1).mo17266());
     */
    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m25744() {
        /*
            r5 = this;
            l.ۘ᩶֫ r0 = r5.f30786
            if (r0 != 0) goto L5
            goto L33
        L5:
            l.ۨ᩵֫ r1 = r0.mo4580()
            l.ۢ۬ܺ r2 = r1.f35552
            l.᩺ۗܺ r2 = r2.values()
            l.᩶ۨܺ r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            l.۫᩵֫ r3 = (l.C12607) r3
            l.۬᩵֫ r3 = r3.f38012
            int r3 = r3.f39853
            if (r3 != r4) goto L13
            goto L34
        L27:
            l.ۛ۬ܺ r2 = r1.f35559
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L34
        L33:
            return
        L34:
            l.ۛ᩵֫ r1 = r1.mo29029()
            r2 = 0
            l.ۛ᩵֫ r1 = r1.mo17262(r4, r2)
            l.ۛ᩵֫ r1 = r1.mo17261(r4)
            l.ۨ᩵֫ r1 = r1.mo17266()
            r0.mo4569(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25744():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m25683(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String m25803 = m25803((String) it.next());
            if (!TextUtils.isEmpty(m25803)) {
                hashMap.put(m25803, Integer.valueOf(((Integer) C13843.getOrDefault(hashMap, m25803, 0)).intValue() + 1));
            }
        }
        return hashMap;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m25803(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25694(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(trim)) {
                return;
            }
        }
        arrayList.add(trim);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25677(List list, C11902 c11902) {
        AbstractC20151 it = c11902.f35552.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C12607 c12607 = (C12607) it.next();
            if (c12607.f38012.f39853 == 1) {
                for (int i = 0; i < list.size(); i++) {
                    if (((C23632) list.get(i)).m52120().m51438().equals(c12607.f38012)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25811(final ActivityC10227 activityC10227, View view) {
        final MenuItem menuItem;
        EnumC22221 enumC22221;
        int i;
        InterfaceC1318 interfaceC1318 = activityC10227.f30786;
        if (interfaceC1318 == null) {
            return;
        }
        final C20105 m25784 = activityC10227.m25784();
        List m46358 = m25784.m46358();
        if (!m46358.isEmpty()) {
            final C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48300(8388661);
            C3060 m48304 = c21282.m48304();
            C22090.m49677(m48304);
            boolean[] zArr = new boolean[3];
            for (int i2 = 0; i2 < m46358.size(); i2++) {
                C21516 c21516 = (C21516) m46358.get(i2);
                int[] iArr = C3232.f10166;
                enumC22221 = c21516.f69180;
                int i3 = iArr[enumC22221.ordinal()];
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i = 1;
                        } else if (i3 != 4) {
                            throw new IncompatibleClassChangeError();
                        }
                        zArr[i] = true;
                        m48304.add(i, i2, i2, c21516.m48684()).setCheckable(true);
                    }
                }
                i = 0;
                zArr[i] = true;
                m48304.add(i, i2, i2, c21516.m48684()).setCheckable(true);
            }
            for (int i4 = 0; i4 < 3; i4++) {
                if (zArr[i4]) {
                    m48304.setGroupCheckable(i4, true, true);
                }
            }
            int m46360 = m25784.m46360();
            if (m46360 < 0 || m46360 >= m48304.size()) {
                menuItem = null;
            } else {
                menuItem = m48304.getItem(m46360);
                menuItem.setChecked(true);
            }
            c21282.m48302(new InterfaceC14930() { // from class: l.᩷۫ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem2) {
                    ActivityC10227.m25707(ActivityC10227.this, menuItem, c21282, m25784, menuItem2);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        if (((AbstractC14702) interfaceC1318).mo4595() != null && interfaceC1318.mo4574().m33610()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120528);
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f120b5b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25707(ActivityC10227 activityC10227, MenuItem menuItem, C21282 c21282, C20105 c20105, MenuItem menuItem2) {
        C14335 c14335;
        boolean z = false;
        if (menuItem != null) {
            c21282.m48304().findItem(menuItem.getItemId()).setChecked(false);
        }
        menuItem2.setChecked(true);
        int itemId = menuItem2.getItemId();
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 == 0 || itemId < 0 || itemId >= c20105.m46358().size()) {
            return;
        }
        if (TextUtils.equals(c20105.m46361(), activityC10227.m25681(((AbstractC14702) interfaceC4162).mo4595()))) {
            activityC10227.m25790();
            C21516 c21516 = (C21516) c20105.m46358().get(itemId);
            if (c21516.m48683() != EnumC22221.FILE) {
                C19400.m44671(activityC10227.f30824);
            }
            String m46359 = c20105.m46359();
            int i = C3232.f10166[c21516.m48683().ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(m46359)) {
                    C20687.m47302(m46359);
                }
                if (activityC10227.f30732 == EnumC20811.MANUAL && activityC10227.f30775 != null) {
                    List m25793 = activityC10227.m25793(c20105.m46359());
                    InterfaceC17889 mo16334 = activityC10227.f30775.mo16334();
                    if (mo16334 == null) {
                        activityC10227.m25729();
                        activityC10227.m25763((CharSequence) null);
                        return;
                    }
                    C16431 c16431 = activityC10227.f30744;
                    if (c16431 != null && c16431.m38743().mo13919()) {
                        z = true;
                    }
                    C1553 m41661 = C17781.m41661(m25793, mo16334, z);
                    activityC10227.m25722(m25689(activityC10227.f30775.mo16333(), m25793, m41661, m41661 == null ? EnumC20811.NONE : EnumC20811.AUTO, activityC10227.m25813(c20105.m46359())));
                    return;
                }
                activityC10227.m25729();
                activityC10227.m25763((CharSequence) null);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(m46359)) {
                    C20687.m47299(m46359, new C14335(EnumC6575.OFF, -1, null));
                }
                interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, true).mo17261(3).mo17266());
                activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector_res_0x7f120b59));
                return;
            }
            if (i == 3) {
                C4582 m48685 = c21516.m48685();
                if (m48685 == null) {
                    return;
                }
                if (!TextUtils.isEmpty(m46359)) {
                    String str = activityC10227.f30738;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    } else {
                        int lastIndexOf = str.lastIndexOf(47);
                        if (lastIndexOf >= 0) {
                            str = str.substring(lastIndexOf + 1);
                        }
                    }
                    if (TextUtils.isEmpty(str) || (!TextUtils.equals(activityC10227.f30738, m48685.m13476()) && !TextUtils.equals(activityC10227.m25837(activityC10227.f30738), m48685.m13475()))) {
                        c14335 = new C14335(EnumC6575.TRACK, m48685.m13478(), null);
                    } else {
                        c14335 = new C14335(EnumC6575.FILE, -1, str);
                    }
                    C20687.m47299(m46359, c14335);
                }
                m25696(interfaceC4162, m48685);
                activityC10227.m25763(m48685.m13474());
                return;
            }
            if (i != 4 || activityC10227.f30775 == null || c21516.m48682() == null) {
                return;
            }
            if (!TextUtils.isEmpty(m46359)) {
                C20687.m47299(m46359, new C14335(EnumC6575.FILE, -1, c21516.m48682().m5311().getName()));
            }
            activityC10227.m25722(m25689(activityC10227.f30775.mo16333(), activityC10227.m25793(c20105.m46359()), c21516.m48682(), EnumC20811.MANUAL, activityC10227.m25813(c20105.m46359())));
            return;
        }
        activityC10227.m25763((CharSequence) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25722(C15164 c15164) {
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 == null || this.f30775 == null || isFinishing() || isDestroyed()) {
            return;
        }
        int incrementAndGet = this.f30803.incrementAndGet();
        this.f30783 = incrementAndGet;
        InterfaceC17889 mo16334 = this.f30775.mo16334();
        if (mo16334 == null) {
            return;
        }
        String m25682 = m25682(mo16334);
        long max = Math.max(0L, interfaceC4162.getCurrentPosition());
        this.f30792 = false;
        this.f30802.clear();
        m25827();
        m25771(false);
        m25815();
        m25699(new C8110(incrementAndGet, this.f30775.mo16333(), mo16334, max, m25682, false, null), c15164);
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static void m25779(ActivityC10227 activityC10227) {
        activityC10227.m25763((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m25763(CharSequence charSequence) {
        CharSequence charSequence2;
        String m25760;
        TextView textView = this.f30782;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (textView == null || interfaceC1318 == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            return;
        }
        if (interfaceC1318.mo4580().f35559.contains(3)) {
            textView.setText(R.string.MT_Protector_res_0x7f120b59);
            return;
        }
        Iterator it = m25809(interfaceC1318.mo4574()).iterator();
        while (true) {
            if (!it.hasNext()) {
                charSequence2 = null;
                break;
            }
            C4582 c4582 = (C4582) it.next();
            if (c4582.m13477().m51441(c4582.m13479())) {
                charSequence2 = c4582.m13474();
                break;
            }
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            textView.setText(charSequence2);
            return;
        }
        if (this.f30732 == EnumC20811.MANUAL && !TextUtils.isEmpty(this.f30738)) {
            textView.setText(m25837(this.f30738));
            return;
        }
        C14017 mo4574 = interfaceC1318.mo4574();
        if (mo4574.m33610()) {
            textView.setText(R.string.MT_Protector_res_0x7f120528);
            return;
        }
        if (!mo4574.m33609(3)) {
            C11197 mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
            if (!TextUtils.isEmpty(this.f30825)) {
                m25760 = this.f30825;
            } else {
                m25760 = m25760(mo4595);
            }
            if (m25793(m25760).isEmpty()) {
                textView.setText(R.string.MT_Protector_res_0x7f120b5b);
                return;
            }
        }
        textView.setText(R.string.MT_Protector_res_0x7f120b58);
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    private C20105 m25784() {
        String m25760;
        List<C4582> m25809;
        int i;
        InterfaceC1318 interfaceC1318 = this.f30786;
        if (interfaceC1318 == null) {
            return C20105.m46357(null, null);
        }
        C11197 mo4595 = ((AbstractC14702) interfaceC1318).mo4595();
        String m25681 = m25681(mo4595);
        if (!TextUtils.isEmpty(this.f30825)) {
            m25760 = this.f30825;
        } else {
            m25760 = m25760(mo4595);
        }
        if (interfaceC1318.mo4574().m33610()) {
            m25809 = Collections.EMPTY_LIST;
        } else {
            m25809 = m25809(interfaceC1318.mo4574());
        }
        List<C1553> m25793 = m25793(m25760);
        if (!m25793.isEmpty() && !TextUtils.isEmpty(this.f30738) && m25761(this.f30738, m25809) != null) {
            ArrayList arrayList = new ArrayList(m25793.size());
            for (C1553 c1553 : m25793) {
                if (!TextUtils.equals(this.f30738, c1553.m5311().getPath())) {
                    arrayList.add(c1553);
                }
            }
            m25793 = arrayList;
        }
        if (m25809.isEmpty() && m25793.isEmpty()) {
            return C20105.m46357(m25681, m25760);
        }
        ArrayList arrayList2 = new ArrayList(m25793.size() + m25809.size() + 2);
        arrayList2.add(new C21516(EnumC22221.AUTO, getString(R.string.MT_Protector_res_0x7f120b58), null, null));
        arrayList2.add(new C21516(EnumC22221.OFF, getString(R.string.MT_Protector_res_0x7f120b59), null, null));
        for (C4582 c4582 : m25809) {
            arrayList2.add(new C21516(EnumC22221.TRACK, c4582.m13474(), c4582, null));
        }
        for (C1553 c15532 : m25793) {
            arrayList2.add(new C21516(EnumC22221.FILE, c15532.m5311().mo36985(), null, c15532));
        }
        C11902 mo4580 = interfaceC1318.mo4580();
        if (!mo4580.f35559.contains(3)) {
            AbstractC20151 it = mo4580.f35552.values().iterator();
            loop3: while (true) {
                if (it.hasNext()) {
                    C12607 c12607 = (C12607) it.next();
                    if (c12607.f38012.f39853 == 3) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            C21516 c21516 = (C21516) arrayList2.get(i2);
                            C4582 m48685 = c21516.m48685();
                            if (c21516.m48683() == EnumC22221.TRACK && m48685 != null && m48685.m13477().m51438().equals(c12607.f38012) && c12607.f38013.contains(Integer.valueOf(m48685.m13479()))) {
                                i = i2;
                                break loop3;
                            }
                        }
                    }
                } else if (this.f30732 == EnumC20811.MANUAL && !TextUtils.isEmpty(this.f30738)) {
                    i = 0;
                    while (true) {
                        if (i >= arrayList2.size()) {
                            i = -1;
                            break;
                        }
                        C21516 c215162 = (C21516) arrayList2.get(i);
                        if (c215162.m48683() == EnumC22221.FILE && c215162.m48682() != null && TextUtils.equals(this.f30738, c215162.m48682().m5311().getPath())) {
                            break;
                        }
                        i++;
                    }
                } else {
                    i = 0;
                }
            }
        } else {
            i = 1;
        }
        return new C20105(i, m25681, m25760, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private List m25809(C14017 c14017) {
        ArrayList arrayList = new ArrayList();
        AbstractC4628 listIterator = c14017.m33608().listIterator(0);
        while (listIterator.hasNext()) {
            C23190 c23190 = (C23190) listIterator.next();
            if (c23190.m51440() == 3) {
                for (int i = 0; i < c23190.f74548; i++) {
                    if (c23190.m51439(i, true)) {
                        arrayList.add(new C3171(c23190, i, c23190.m51437(i), arrayList.size()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3171 c3171 = (C3171) it.next();
            arrayList2.add(m25758(c3171.m9722(), false));
            arrayList3.add(m25758(c3171.m9722(), true));
        }
        HashMap m25683 = m25683(arrayList2);
        HashMap m256832 = m25683(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C3171 c31712 = (C3171) arrayList.get(i2);
            String str = (String) arrayList2.get(i2);
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.MT_Protector_res_0x7f120b5a) + " " + (c31712.m9725() + 1);
            } else if (((Integer) C13843.getOrDefault(m25683, m25803(str), 0)).intValue() > 1) {
                str = (String) arrayList3.get(i2);
                String m25803 = m25803(str);
                if (TextUtils.isEmpty(str) || ((Integer) C13843.getOrDefault(m256832, m25803, 0)).intValue() != 1) {
                    str = getString(R.string.MT_Protector_res_0x7f120b5a) + " " + (c31712.m9725() + 1);
                }
            }
            arrayList4.add(new C4582(c31712.m9724(), c31712.m9723(), c31712.m9722().f25621, c31712.m9722().f25635, str, c31712.m9725()));
        }
        return arrayList4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L15;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m25758(l.C8353 r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r3.f25635
            m25694(r1, r0)
            java.lang.String r1 = r3.f25603
            java.lang.String r1 = m25782(r1)
            m25694(r1, r0)
            int r1 = r3.f25608
            java.lang.String r1 = m25836(r1)
            m25694(r1, r0)
            r1 = 0
            if (r4 == 0) goto L50
            java.lang.String r4 = r3.f25614
            java.lang.String r3 = r3.f25619
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L46
            r3 = 47
            int r3 = r4.lastIndexOf(r3)
            if (r3 < 0) goto L38
            int r3 = r3 + 1
            java.lang.String r4 = r4.substring(r3)
        L38:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L3f
            goto L4c
        L3f:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r4.toUpperCase(r3)
            goto L4d
        L46:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L4d
        L4c:
            r3 = r1
        L4d:
            m25694(r3, r0)
        L50:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L57
            return r1
        L57:
            java.lang.String r3 = " · "
            java.lang.String r3 = android.text.TextUtils.join(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25758(l.۠ᩴ֫, boolean):java.lang.String");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private List m25793(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f30807)) {
            return Collections.EMPTY_LIST;
        }
        return this.f30804;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m25813(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.equals(str, this.f30807) && this.f30723;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15164 m25689(C11197 c11197, List list, C1553 c1553, EnumC20811 enumC20811, boolean z) {
        if (c1553 == null || enumC20811 == EnumC20811.NONE) {
            return C15164.m35863(c11197, list, z);
        }
        C22464 m27766 = c11197.m27766();
        String path = c1553.m5311().getPath();
        C7647 c7647 = new C7647(new Uri.Builder().scheme("mt_media").path(path).build());
        c7647.m20454(c1553.m5312());
        c7647.m20452();
        c7647.m20453(c1553.m5311().mo36985());
        c7647.m20451(path);
        m27766.m50398(Collections.singletonList(c7647.m20450()));
        return new C15164(m27766.m50394(), list, z, enumC20811, c1553.m5311().getPath(), 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C1553 m25685(String str, List list) {
        boolean z;
        C16431 c16431 = this.f30744;
        boolean z2 = c16431 != null && c16431.m38743().mo13919();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553 c1553 = (C1553) it.next();
            String name = c1553.m5311().getName();
            if (name == null || str == null) {
                z = false;
            } else {
                z = z2 ? name.equalsIgnoreCase(str) : name.equals(str);
            }
            if (z) {
                return c1553;
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25812(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30824, activityC10227.m25760(c11197), new C19461());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25797(ActivityC10227 activityC10227, C11197 c11197) {
        C19400.m44674(activityC10227.f30773, activityC10227.m25760(c11197), new C18755());
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    private void m25790() {
        C19400.m44671(this.f30773);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25724(ActivityC10227 activityC10227, C14017 c14017) {
        C4582 m25761;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C19400 c19400 = activityC10227.f30824;
        C1054 c1054 = (C1054) C19400.m44676(c19400);
        if (interfaceC4162 == null || c1054 == null || c14017.m33610() || !TextUtils.equals(c1054.m3623(), activityC10227.f30825)) {
            return false;
        }
        if (!TextUtils.equals(c1054.m3623(), activityC10227.m25784().m46359())) {
            return false;
        }
        List m25809 = activityC10227.m25809(c14017);
        if (m25809.isEmpty() || (m25761 = activityC10227.m25761(c1054.m3624(), m25809)) == null) {
            return false;
        }
        C19400.m44671(c19400);
        m25696(interfaceC4162, m25761);
        activityC10227.m25763(m25761.m13474());
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m25800(ActivityC10227 activityC10227, C14017 c14017) {
        boolean z;
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        C5288 c5288 = (C5288) C19400.m44676(activityC10227.f30773);
        if (interfaceC4162 != null && c5288 != null && !c14017.m33610()) {
            String m15216 = c5288.m15216();
            if (TextUtils.equals(m15216, activityC10227.f30825) && TextUtils.equals(m15216, activityC10227.m25784().m46359())) {
                C14335 m47297 = C20687.m47297(m15216);
                if (m47297 == null) {
                    activityC10227.m25790();
                    return false;
                }
                int i = C3232.f10167[m47297.m34209().ordinal()];
                if (i == 1) {
                    activityC10227.m25790();
                    interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, true).mo17261(3).mo17266());
                    activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector_res_0x7f120b59));
                    return true;
                }
                if (i == 2) {
                    int m34207 = m47297.m34207();
                    List m25809 = activityC10227.m25809(c14017);
                    if (!m25809.isEmpty()) {
                        activityC10227.m25790();
                        if (m34207 < 0 || m34207 >= m25809.size()) {
                            C20687.m47302(m15216);
                            return false;
                        }
                        C4582 c4582 = (C4582) m25809.get(m34207);
                        m25696(interfaceC4162, c4582);
                        activityC10227.m25763(c4582.m13474());
                        return true;
                    }
                } else {
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                    String m34208 = m47297.m34208();
                    if (TextUtils.isEmpty(m34208)) {
                        activityC10227.m25790();
                        C20687.m47302(m15216);
                        return false;
                    }
                    if (c5288.m15217()) {
                        activityC10227.m25790();
                        return false;
                    }
                    String str = activityC10227.f30738;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    } else {
                        int lastIndexOf = str.lastIndexOf(47);
                        if (lastIndexOf >= 0) {
                            str = str.substring(lastIndexOf + 1);
                        }
                    }
                    C16431 c16431 = activityC10227.f30744;
                    boolean z2 = c16431 != null && c16431.m38743().mo13919();
                    if (str == null || m34208 == null) {
                        z = false;
                    } else {
                        z = z2 ? str.equalsIgnoreCase(m34208) : str.equals(m34208);
                    }
                    if (z) {
                        activityC10227.m25790();
                        return false;
                    }
                    if (activityC10227.m25813(m15216) && activityC10227.m25685(m34208, activityC10227.m25793(m15216)) == null) {
                        activityC10227.m25790();
                        C20687.m47302(m15216);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C4582 m25761(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4582 c4582 = (C4582) it.next();
            if (TextUtils.equals(str, c4582.m13476())) {
                return c4582;
            }
        }
        String m25837 = m25837(str);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C4582 c45822 = (C4582) it2.next();
            if (TextUtils.equals(m25837, c45822.m13475())) {
                return c45822;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25696(InterfaceC4162 interfaceC4162, C4582 c4582) {
        interfaceC4162.mo4569(interfaceC4162.mo4580().mo29029().mo17262(3, false).mo17261(3).mo17264(new C12607(c4582.m13477().m51438(), Collections.singletonList(Integer.valueOf(c4582.m13479())))).mo17266());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r0.mo4569(r1.mo29029().mo17262(3, false).mo17261(3).mo17266());
     */
    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m25729() {
        /*
            r5 = this;
            l.ۘ᩶֫ r0 = r5.f30786
            if (r0 != 0) goto L5
            goto L33
        L5:
            l.ۨ᩵֫ r1 = r0.mo4580()
            l.ۢ۬ܺ r2 = r1.f35552
            l.᩺ۗܺ r2 = r2.values()
            l.᩶ۨܺ r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            l.۫᩵֫ r3 = (l.C12607) r3
            l.۬᩵֫ r3 = r3.f38012
            int r3 = r3.f39853
            if (r3 != r4) goto L13
            goto L34
        L27:
            l.ۛ۬ܺ r2 = r1.f35559
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L34
        L33:
            return
        L34:
            l.ۛ᩵֫ r1 = r1.mo29029()
            r2 = 0
            l.ۛ᩵֫ r1 = r1.mo17262(r4, r2)
            l.ۛ᩵֫ r1 = r1.mo17261(r4)
            l.ۨ᩵֫ r1 = r1.mo17266()
            r0.mo4569(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.m25729():void");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m25837(String str) {
        for (C1553 c1553 : this.f30804) {
            if (TextUtils.equals(str, c1553.m5311().getPath())) {
                return c1553.m5311().mo36985();
            }
        }
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r0 != 3) goto L52;
     */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC10227.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static void m25753(ActivityC10227 activityC10227) {
        activityC10227.m25799(false);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m25783(ActivityC10227 activityC10227) {
        activityC10227.m25799(false);
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25730(ActivityC10227 activityC10227) {
        return activityC10227.f30790.getVisibility() == 4;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m25816(ActivityC10227 activityC10227) {
        if (activityC10227.f30790.getVisibility() == 4) {
            activityC10227.f30794.setVisibility(0);
            activityC10227.f30790.setVisibility(0);
            activityC10227.f30740.setVisibility(0);
            activityC10227.f30811.setImageResource(R.drawable.MT_Protector_res_0x7f0802cd);
        } else {
            activityC10227.f30794.setVisibility(4);
            activityC10227.f30790.setVisibility(4);
            activityC10227.f30740.setVisibility(4);
            activityC10227.f30811.setImageResource(R.drawable.MT_Protector_res_0x7f0802cb);
        }
        activityC10227.f30827.m43232();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m25743(ActivityC10227 activityC10227) {
        activityC10227.m25755();
        String m25739 = activityC10227.m25739();
        if (!TextUtils.isEmpty(m25739)) {
            activityC10227.f30736 = m25739;
            activityC10227.f30781 = false;
        } else {
            activityC10227.f30781 = true;
        }
        if (activityC10227.getResources().getConfiguration().orientation == 1) {
            activityC10227.f30772 = EnumC18694.MANUAL;
            if (activityC10227.getRequestedOrientation() != 0) {
                activityC10227.setRequestedOrientation(0);
                return;
            }
            return;
        }
        activityC10227.f30772 = EnumC18694.MANUAL;
        if (activityC10227.getRequestedOrientation() != 1) {
            activityC10227.setRequestedOrientation(1);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m25847(int i) {
        View findViewById = findViewById(i);
        findViewById.setBackground(new C22533());
        return findViewById;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC4927, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode;
        InterfaceC1318 interfaceC1318;
        if (!this.f30745 || ((keyCode = keyEvent.getKeyCode()) != 90 && keyCode != 89 && keyCode != 87 && keyCode != 88 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 79 || keyCode2 == 85) {
                m25845();
            } else if (keyCode2 == 126) {
                InterfaceC4162 interfaceC4162 = this.f30786;
                if (interfaceC4162 != null && C3603.m11031((InterfaceC1318) interfaceC4162, true)) {
                    m25845();
                    return true;
                }
            } else if (keyCode2 == 127 && (interfaceC1318 = this.f30786) != null) {
                ((AbstractC14702) interfaceC1318).mo4570(false);
                return true;
            }
        }
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !isChangingConfigurations()) {
            C10062.m25251(this.f30798);
            this.f30798 = null;
        }
        super.onDestroy();
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.removeCallbacks(this.f30751);
        }
        m25771(true);
        C2547 c2547 = this.f30812;
        C10516 c10516 = this.f30821;
        c10516.m26424(c2547);
        C4925.m14324().removeCallbacks(this.f30743);
        c10516.m26420();
        m25672();
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    private void m25672() {
        this.f30799 = false;
        C16431 c16431 = this.f30744;
        this.f30744 = null;
        final C16657 c16657 = c16431 == null ? null : new C16657(c16431);
        C18635 c18635 = this.f30827;
        if (c18635 != null) {
            c18635.m43224((InterfaceC1318) null);
        }
        InterfaceC4162 interfaceC4162 = this.f30786;
        if (interfaceC4162 != null) {
            interfaceC4162.mo4591();
            this.f30786.mo12583();
            this.f30786 = null;
        }
        if (c16657 != null) {
            c16657.m39178();
        }
        m25755();
        this.f30736 = null;
        this.f30781 = false;
        this.f30772 = EnumC18694.NONE;
        m25752();
        m25790();
        m25827();
        this.f30825 = null;
        if (c16431 != null) {
            c16431.m38742();
            c16657.m39176();
        }
        C23713 c23713 = this.f30778;
        this.f30778 = null;
        final RunnableC7412 runnableC7412 = new RunnableC7412(6, c23713);
        this.f30733++;
        this.f30808 = C6404.f19812;
        this.f30739 = null;
        View view = this.f30814;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.f30760;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        C22720 c22720 = this.f30791;
        this.f30791 = null;
        Future future = this.f30797;
        this.f30797 = null;
        this.f30784++;
        if (future != null) {
            future.cancel(true);
        }
        final C15807 c15807 = this.f30801;
        this.f30801 = null;
        m25839();
        this.f30800 = null;
        C4437 c4437 = this.f30771;
        this.f30771 = null;
        int i = (c22720 == null ? 0 : 1) + (c4437 != null ? 1 : 0);
        if (i == 0) {
            if (c15807 != null) {
                c15807.close();
            }
            if (c16657 != null) {
                c16657.m39177();
            }
            runnableC7412.run();
        } else {
            final AtomicInteger atomicInteger = new AtomicInteger(i);
            Runnable runnable = new Runnable() { // from class: l.᩵۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ActivityC10227.f30722;
                    if (atomicInteger.decrementAndGet() != 0) {
                        return;
                    }
                    C15807 c158072 = c15807;
                    if (c158072 != null) {
                        c158072.close();
                    }
                    C16657 c166572 = c16657;
                    if (c166572 != null) {
                        c166572.m39177();
                    }
                    runnableC7412.run();
                }
            };
            if (c22720 != null) {
                c22720.m50777(runnable);
            }
            if (c4437 != null) {
                c4437.m13186(runnable);
            }
        }
        C19130 c19130 = this.f30768;
        this.f30768 = null;
        if (c19130 != null) {
            c19130.m44181();
        }
        C14895 c14895 = this.f30793;
        this.f30793 = null;
        if (c14895 != null) {
            c14895.close();
        }
        this.f30747 = null;
        this.f30822 = null;
        this.f30764 = null;
        C0991 c0991 = this.f30826;
        this.f30826 = null;
        if (c0991 != null) {
            c0991.close();
        }
        VelocityTracker velocityTracker = this.f30818;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30818 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC21449 m25690(ActivityC10227 activityC10227, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC150972, InterfaceC15097 interfaceC150973, int i) {
        if (i == 4) {
            return interfaceC15097.mo6247();
        }
        if (i == 1) {
            return new C3026(interfaceC150972.mo6247(), activityC10227.f30768);
        }
        return interfaceC150973.mo6247();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m25774() {
        int i = 0;
        if (ApplicationC20075.f65008.getBoolean("vpffs", false)) {
            i = ApplicationC20075.f65008.getBoolean("vpsm", false) ? 3 : 4;
        }
        this.f30827.m43223(i);
        m25825(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25798(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpsm", z);
        activityC10227.m25774();
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25817() {
        return ApplicationC20075.f65008.getBoolean("vpao", false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25721(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpao", z);
        if (!z) {
            activityC10227.m25755();
            if (activityC10227.f30772 != EnumC18694.AUTO) {
                return;
            }
            activityC10227.f30772 = EnumC18694.NONE;
            if (activityC10227.getRequestedOrientation() != -1) {
                activityC10227.setRequestedOrientation(-1);
                return;
            }
            return;
        }
        String m25739 = activityC10227.m25739();
        if (!TextUtils.isEmpty(m25739)) {
            if (!TextUtils.equals(m25739, activityC10227.f30736)) {
                activityC10227.f30736 = null;
            }
            if (!TextUtils.equals(m25739, activityC10227.f30736)) {
                C19400.m44673(activityC10227.f30750, m25739);
                activityC10227.m25823();
            }
        }
        InterfaceC4162 interfaceC4162 = activityC10227.f30786;
        if (interfaceC4162 != null) {
            activityC10227.m25698(interfaceC4162.mo4583());
        }
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static boolean m25727() {
        return ApplicationC20075.f65008.getBoolean("vplp", false);
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean m25747() {
        return ApplicationC20075.f65008.getBoolean("vpapn", false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25770(ActivityC10227 activityC10227, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "vpun", z);
        activityC10227.m25802();
    }
}
