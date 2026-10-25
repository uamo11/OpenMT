package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: C4QU */
/* renamed from: l.ܳۨܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14507 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long f44477 = 0;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f44478 = true;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Set f44479 = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f44480 = new AtomicLong();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11521 f44481;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C11521 f44482;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f44483;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f44484;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BaseAdapter f44485;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7287 f44486 = new C7287();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f44487;

    public C14507(AbstractActivityC3346 abstractActivityC3346) {
        this.f44483 = abstractActivityC3346;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34666() {
        LinkedList linkedList = ActivityRecordService.f16;
        synchronized (linkedList) {
            this.f44484 = new ArrayList(linkedList);
        }
        this.f44485 = new C12931(this);
        C19258 buildDialog = this.f44483.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120028);
        buildDialog.m44422(this.f44485, (DialogInterfaceOnClickListenerC1348) null);
        buildDialog.m44442((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector_res_0x7f1209e1 : R.string.MT_Protector_res_0x7f1209d2, null);
        DialogInterfaceC0206 m16343 = C5834.m16343(buildDialog, R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120634, (DialogInterface.OnClickListener) null);
        this.f44487 = m16343;
        final Button m1447 = m16343.m1447();
        f44479.add(m1447);
        this.f44487.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܺۛܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C14507.m34636(C14507.this, m1447);
            }
        });
        this.f44487.m1443().setOnItemClickListener(new C15047());
        this.f44487.m1447().setOnClickListener(new ViewOnClickListenerC14054(2, this));
        this.f44487.m1443().setTag(this);
        this.f44483.getLifecycle().mo19833(new C22809(this));
        this.f44487.m1448().setOnClickListener(new ViewOnClickListenerC1833(1, this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34636(C14507 c14507, Button button) {
        m34664(c14507);
        f44479.remove(button);
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        if (abstractActivityC3346 instanceof ActivityC19701) {
            abstractActivityC3346.finish();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34635(C14507 c14507, View view) {
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        C21282 c21282 = new C21282(abstractActivityC3346, view, 0);
        C3060 m48304 = c21282.m48304();
        boolean z = true;
        if (!ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true) ? false : C21769.m49098(abstractActivityC3346)) {
            z = (ActivityRecordService.m47() && ActivityRecordService.m46()) ? true ^ ActivityRecordService.m48() : false;
        }
        m48304.add(0, R.string.MT_Protector_res_0x7f120183, 0, R.string.MT_Protector_res_0x7f120183);
        if (z) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1202f6, 0, R.string.MT_Protector_res_0x7f1202f6);
        } else {
            m48304.add(0, R.string.MT_Protector_res_0x7f1202b9, 0, R.string.MT_Protector_res_0x7f1202b9);
        }
        c21282.m48302(new C16648(3, c14507));
        c21282.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34634(C14507 c14507, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f120183) {
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                linkedList.clear();
                ActivityRecordService.m49();
            }
            ActivityRecordService.f14 = null;
            c14507.f44484.clear();
            c14507.f44485.notifyDataSetChanged();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1202b9) {
            C22870.m50970(ApplicationC20075.f65008, "activity_record_floating_enable", false);
            ActivityRecordService.m44();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1202f6) {
            C22870.m50970(ApplicationC20075.f65008, "activity_record_floating_enable", true);
            if (C9255.m23764(c14507.f44483)) {
                if (ActivityRecordService.m47() && ActivityRecordService.m46()) {
                    ActivityRecordService.m45();
                    return;
                }
                return;
            }
            try {
                C21769.m49100(c14507.f44483, null);
            } catch (Throwable th) {
                c14507.f44483.m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34633(C14507 c14507) {
        boolean m47 = ActivityRecordService.m47();
        if (m47 && ActivityRecordService.m46()) {
            m34660();
            return;
        }
        if (!m47) {
            m34637(false);
        }
        C11521 c11521 = new C11521(c14507);
        if (m34665(c11521)) {
            C11521 c115212 = f44482;
            if (c115212 != null) {
                f44481 = c11521;
                if (c115212.f34408 || m34655(c115212, false)) {
                    return;
                }
                m34631(f44482, EnumC13636.UNHANDLED, (EnumC5876) null);
                return;
            }
            f44482 = c11521;
            if (!m34662(c11521)) {
                f44482 = null;
            } else {
                m34647(c11521, false);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34647(final C11521 c11521, boolean z) {
        EnumC13636 enumC13636;
        if (m34655(c11521, false)) {
            if (ActivityRecordService.m47()) {
                m34637(true);
                m34631(c11521, EnumC13636.HANDLED, (EnumC5876) null);
                return;
            }
            if (f44478 && !z && !C9255.m23781()) {
                EnumC10110 enumC10110 = EnumC10110.SHELL_INIT;
                c11521.f34407 = enumC10110;
                c11521.f34408 = true;
                m34629(c11521, enumC10110);
                try {
                    C1802.f6208.execute(new RunnableC17330(c11521, new C20177()));
                    return;
                } catch (RejectedExecutionException unused) {
                    C4925.m14315(new Runnable() { // from class: l.᩹ۛܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C14507.m34641(C11521.this);
                        }
                    });
                    return;
                }
            }
            c11521.f34407 = EnumC10110.CONTINUE_SELECTION;
            WeakReference weakReference = c11521.f34404;
            if (f44478 && C9255.m23768()) {
                C14507 c14507 = (C14507) weakReference.get();
                if (c14507 != null) {
                    AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
                    if (m34655(c11521, false)) {
                        c11521.f34407 = EnumC10110.CHOICE;
                        try {
                            View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d006e);
                            TextView textView = (TextView) m10216.findViewById(R.id.text);
                            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector_res_0x7f120023) + "\n\n" + C4925.m14327(R.string.MT_Protector_res_0x7f120020));
                            int indexOf = TextUtils.indexOf(spannableString, "\n\n");
                            while (indexOf != -1) {
                                int i = indexOf + 2;
                                spannableString.setSpan(new RelativeSizeSpan(0.5f), indexOf, i, 33);
                                indexOf = TextUtils.indexOf(spannableString, "\n\n", i);
                            }
                            textView.setText(spannableString);
                            final Button button = (Button) m10216.findViewById(R.id.button1);
                            final Button button2 = (Button) m10216.findViewById(R.id.button2);
                            C14096.m33705(button2);
                            C19258 buildDialog = abstractActivityC3346.buildDialog();
                            buildDialog.m44421(m10216);
                            final DialogInterfaceC0206 m44438 = buildDialog.m44438();
                            if (!m44438.m1442()) {
                                m34632(c11521, true);
                                return;
                            }
                            C7287 c7287 = c14507.f44486;
                            if (c7287.f22371 != c11521 || !m34655(c11521, false)) {
                                m44438.dismiss();
                                enumC13636 = EnumC13636.UNHANDLED;
                            } else {
                                c7287.f22370 = m44438;
                                m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۙۛܿ
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        C14507.m34663(C11521.this, m44438);
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: l.ۗۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C14507.m34627(C11521.this, m44438, button, button2);
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: l.ۖۛܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C14507.m34658(C11521.this, m44438);
                                    }
                                });
                                return;
                            }
                        } catch (RuntimeException unused2) {
                            m34632(c11521, true);
                            return;
                        }
                    }
                }
                enumC13636 = EnumC13636.UNHANDLED;
            } else if (!m34655(c11521, false)) {
                enumC13636 = EnumC13636.UNHANDLED;
            } else {
                if (!ApplicationC20075.f65008.getBoolean("forbid_tip_ar_manual", true)) {
                    m34632(c11521, true);
                    return;
                }
                C14507 c145072 = (C14507) weakReference.get();
                if (c145072 == null) {
                    enumC13636 = EnumC13636.UNHANDLED;
                } else {
                    c11521.f34407 = EnumC10110.MANUAL_PROMPT;
                    try {
                        C19258 buildDialog2 = c145072.f44483.buildDialog();
                        buildDialog2.m44433(R.string.MT_Protector_res_0x7f120a76);
                        buildDialog2.m44416(R.string.MT_Protector_res_0x7f120020);
                        buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                        buildDialog2.m44440(R.string.MT_Protector_res_0x7f120a78, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC0206 m444382 = buildDialog2.m44438();
                        if (!m444382.m1442()) {
                            m34632(c11521, true);
                            return;
                        }
                        C7287 c72872 = c145072.f44486;
                        if (c72872.f22371 != c11521 || !m34655(c11521, false)) {
                            m444382.dismiss();
                            enumC13636 = EnumC13636.UNHANDLED;
                        } else {
                            c72872.f22370 = m444382;
                            m444382.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۘۛܿ
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C14507.m34663(C11521.this, m444382);
                                }
                            });
                            m444382.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C14507.m34626(C11521.this, m444382);
                                }
                            });
                            m444382.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۛܿ
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C14507.m34661(C11521.this, m444382);
                                }
                            });
                            return;
                        }
                    } catch (RuntimeException unused3) {
                        m34632(c11521, true);
                        return;
                    }
                }
            }
            m34631(c11521, enumC13636, (EnumC5876) null);
            return;
        }
        m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m34641(C11521 c11521) {
        if (f44482 != c11521) {
            return;
        }
        m34648(c11521);
        c11521.f34408 = false;
        if (m34655(c11521, false)) {
            c11521.f34407 = EnumC10110.CONTINUE_SELECTION;
            m34647(c11521, true);
        } else {
            m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34627(final C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206, Button button, Button button2) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.CHOICE)) {
            EnumC10110 enumC10110 = EnumC10110.SHELL_WORKER;
            c11521.f34407 = enumC10110;
            c11521.f34408 = true;
            dialogInterfaceC0206.m1441(false);
            button.setEnabled(false);
            button2.setEnabled(false);
            m34629(c11521, enumC10110);
            try {
                C1802.f6208.execute(new RunnableC16624(c11521, new C20177()));
            } catch (RejectedExecutionException unused) {
                C4925.m14315(new Runnable() { // from class: l.֡ۛܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14507.m34646(C11521.this, EnumC5876.COMMAND_FAILED);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r2.size() != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c4, code lost:
    
        if (r19 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c6, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01d2, code lost:
    
        if (m34638(1000, r17, r13, r14, r15) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d4, code lost:
    
        r1 = m34623(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01df, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01e3, code lost:
    
        r11 = r8;
        r1 = m34623(r9, r12, r10, r17, r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01ef, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return m34624(r9, r12, r0, r17, r13, r14, r15, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r8.f36465 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0108, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: RuntimeException -> 0x0210, TryCatch #7 {RuntimeException -> 0x0210, blocks: (B:14:0x0051, B:16:0x0057, B:21:0x005d, B:24:0x0065, B:28:0x006f, B:31:0x0075, B:33:0x0079, B:44:0x0099, B:46:0x009d, B:48:0x00a1, B:54:0x00b9, B:58:0x00bf, B:72:0x00cc, B:74:0x00dc, B:77:0x00e1, B:90:0x011e, B:52:0x00a7), top: B:13:0x0051, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0219  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC5876 m34643() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14507.m34643():l.ۛۛܿ");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34658(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.CHOICE)) {
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34646(l.C11521 r9, l.EnumC5876 r10) {
        /*
            l.ۨۛܿ r0 = l.C14507.f44482
            if (r0 == r9) goto L5
            return
        L5:
            if (r10 != 0) goto L9
            l.ۛۛܿ r10 = l.EnumC5876.COMMAND_FAILED
        L9:
            l.ۛۛܿ r0 = l.EnumC5876.STARTED
            if (r10 != r0) goto L15
            boolean r1 = bin.mt.function.ar.ActivityRecordService.m47()
            if (r1 != 0) goto L15
            l.ۛۛܿ r10 = l.EnumC5876.STATE_UNKNOWN
        L15:
            java.lang.ref.WeakReference r1 = r9.f34404
            java.lang.Object r1 = r1.get()
            l.ܳۨܿ r1 = (l.C14507) r1
            r2 = 0
            if (r1 == 0) goto L2a
            l.۟ۛܿ r1 = r1.f44486
            l.ۨۛܿ r3 = r1.f22371
            if (r3 == r9) goto L27
            goto L2a
        L27:
            l.֡ۚۢ r1 = r1.f22370
            goto L2b
        L2a:
            r1 = r2
        L2b:
            l.ۤۛܿ r3 = l.EnumC10110.SHELL_WORKER
            boolean r1 = m34640(r9, r1, r3)
            m34648(r9)
            r3 = 0
            r9.f34408 = r3
            r4 = 1
            if (r1 != 0) goto L60
            m34657(r9)
            if (r10 != r0) goto L57
            long r5 = r9.f34402
            long r7 = l.C14507.f44477
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L57
            m34637(r4)     // Catch: java.lang.Throwable -> L50
            l.ܰۛܿ r10 = l.EnumC13636.HANDLED
            m34631(r9, r10, r2)
            return
        L50:
            r10 = move-exception
            l.ܰۛܿ r0 = l.EnumC13636.HANDLED
            m34631(r9, r0, r2)
            throw r10
        L57:
            l.ܰۛܿ r1 = l.EnumC13636.UNHANDLED
            if (r10 != r0) goto L5c
            r10 = r2
        L5c:
            m34631(r9, r1, r10)
            return
        L60:
            java.lang.ref.WeakReference r1 = r9.f34404
            java.lang.Object r1 = r1.get()
            l.ܳۨܿ r1 = (l.C14507) r1
            if (r1 == 0) goto L74
            l.۟ۛܿ r1 = r1.f44486
            l.ۨۛܿ r5 = r1.f22371
            if (r5 == r9) goto L71
            goto L74
        L71:
            l.֡ۚۢ r1 = r1.f22370
            goto L75
        L74:
            r1 = r2
        L75:
            if (r10 != r0) goto L94
            l.ۤۛܿ r10 = l.EnumC10110.FINISHING
            r9.f34407 = r10
            m34649(r9, r1)
            m34637(r4)     // Catch: java.lang.Throwable -> L8d
            r10 = 2131886114(0x7f120022, float:1.9406798E38)
            l.C21374.m48457(r10)     // Catch: java.lang.Throwable -> L8d
            l.ܰۛܿ r10 = l.EnumC13636.HANDLED
            m34631(r9, r10, r2)
            return
        L8d:
            r10 = move-exception
            l.ܰۛܿ r0 = l.EnumC13636.HANDLED
            m34631(r9, r0, r2)
            throw r10
        L94:
            l.ۛۛܿ r0 = l.EnumC5876.STATE_UNKNOWN
            if (r10 == r0) goto La4
            l.ۛۛܿ r0 = l.EnumC5876.ENTRY_MISSING
            if (r10 == r0) goto La4
            l.ۛۛܿ r0 = l.EnumC5876.BIND_TIMEOUT
            if (r10 == r0) goto La4
            l.ۛۛܿ r0 = l.EnumC5876.UNSUPPORTED_PROFILE
            if (r10 != r0) goto La6
        La4:
            l.C14507.f44478 = r3
        La6:
            l.ۤۛܿ r10 = l.EnumC10110.MANUAL_COMMIT
            r9.f34407 = r10
            m34649(r9, r1)
            m34632(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14507.m34646(l.ۨۛܿ, l.ۛۛܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34626(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.MANUAL_PROMPT)) {
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34661(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (m34640(c11521, dialogInterfaceC0206, EnumC10110.MANUAL_PROMPT)) {
            C22870.m50970(ApplicationC20075.f65008, "forbid_tip_ar_manual", false);
            c11521.f34407 = EnumC10110.MANUAL_COMMIT;
            m34649(c11521, dialogInterfaceC0206);
            m34632(c11521, true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34632(C11521 c11521, boolean z) {
        EnumC13636 enumC13636;
        if (!m34655(c11521, false)) {
            enumC13636 = EnumC13636.UNHANDLED;
        } else if (z && ActivityRecordService.m47()) {
            m34637(true);
            enumC13636 = EnumC13636.HANDLED;
        } else {
            C14507 c14507 = (C14507) c11521.f34404.get();
            if (c14507 == null) {
                enumC13636 = EnumC13636.UNHANDLED;
            } else {
                c11521.f34407 = EnumC10110.MANUAL_COMMIT;
                try {
                    c14507.f44483.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                    try {
                        C21374.m48464(C4925.m14306(R.string.MT_Protector_res_0x7f120755, C4925.m14327(R.string.MT_Protector_res_0x7f120028)));
                    } catch (RuntimeException unused) {
                    }
                    enumC13636 = EnumC13636.HANDLED;
                } catch (RuntimeException unused2) {
                    enumC13636 = EnumC13636.UNHANDLED;
                }
            }
        }
        m34631(c11521, enumC13636, (EnumC5876) null);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m34660() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC21399());
            return;
        }
        f44477++;
        m34637(false);
        f44481 = null;
        C11521 c11521 = f44482;
        if (c11521 == null) {
            return;
        }
        c11521.f34406 = true;
        m34657(c11521);
        if (c11521.f34408) {
            return;
        }
        m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34637(boolean z) {
        ActivityRecordService.m42(z);
        int i = z ? R.string.MT_Protector_res_0x7f1209e1 : R.string.MT_Protector_res_0x7f1209d2;
        for (Button button : f44479) {
            if (button != null) {
                button.setText(i);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m34663(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22370 == dialogInterfaceC0206) {
                c7287.f22370 = null;
            }
        }
        if (f44482 == c11521) {
            EnumC10110 enumC10110 = c11521.f34407;
            if (enumC10110 == EnumC10110.CHOICE || enumC10110 == EnumC10110.MANUAL_PROMPT) {
                c11521.f34406 = true;
                m34631(c11521, EnumC13636.UNHANDLED, (EnumC5876) null);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m34657(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null) {
            return;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return;
        }
        c11521.f34407 = EnumC10110.FINISHING;
        m34648(c11521);
        DialogInterfaceC0206 dialogInterfaceC0206 = c7287.f22370;
        c7287.f22370 = null;
        c7287.f22371 = null;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        dialogInterfaceC0206.dismiss();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m34649(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206 == null) {
            return;
        }
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22370 == dialogInterfaceC0206) {
                c7287.f22370 = null;
            }
        }
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34629(final C11521 c11521, final EnumC10110 enumC10110) {
        m34648(c11521);
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 != c11521) {
                return;
            }
            final long j = c11521.f34403 + 1;
            c11521.f34403 = j;
            c7287.f22369 = j;
            C4925.m14316(new Runnable() { // from class: l.᩶ۛܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C14507.m34630(C11521.this, enumC10110, j);
                }
            }, 200L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34630(C11521 c11521, EnumC10110 enumC10110, long j) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 != null && m34655(c11521, false) && c11521.f34407 == enumC10110 && c11521.f34403 == j) {
            C7287 c7287 = c14507.f44486;
            if (c7287.f22371 == c11521 && c7287.f22369 == j) {
                try {
                    C13136 c13136 = new C13136(c14507.f44483, R.string.MT_Protector_res_0x7f120528);
                    c13136.m31864();
                    if (m34655(c11521, false) && c11521.f34407 == enumC10110 && c11521.f34403 == j && c7287.f22371 == c11521 && c7287.f22369 == j) {
                        c7287.f22368 = c13136;
                    } else {
                        c13136.m31857();
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m34648(C11521 c11521) {
        long j = c11521.f34403 + 1;
        c11521.f34403 = j;
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null) {
            return;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return;
        }
        c7287.f22369 = j;
        C13136 c13136 = c7287.f22368;
        c7287.f22368 = null;
        if (c13136 != null) {
            c13136.m31857();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m34662(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        if (c14507 == null || !m34665(c11521)) {
            return false;
        }
        C7287 c7287 = c14507.f44486;
        C11521 c115212 = c7287.f22371;
        if (c115212 != null && c115212 != c11521) {
            m34657(c115212);
        }
        c7287.f22371 = c11521;
        c7287.f22370 = null;
        c7287.f22368 = null;
        c7287.f22369 = c11521.f34403;
        c11521.f34406 = false;
        return true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m34665(C11521 c11521) {
        C14507 c14507 = (C14507) c11521.f34404.get();
        DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) c11521.f34405.get();
        if (c14507 == null) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = c14507.f44483;
        return dialogInterfaceC0206 != null && c14507.f44487 == dialogInterfaceC0206 && dialogInterfaceC0206.m1442() && abstractActivityC3346.getLifecycle().mo19832() == EnumC13728.RESUMED && !abstractActivityC3346.isFinishing() && !abstractActivityC3346.isDestroyed();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m34655(C11521 c11521, boolean z) {
        C14507 c14507;
        if (f44482 != c11521 || c11521.f34402 != f44477 || c11521.f34406 || !m34665(c11521) || (c14507 = (C14507) c11521.f34404.get()) == null) {
            return false;
        }
        C7287 c7287 = c14507.f44486;
        if (c7287.f22371 != c11521) {
            return false;
        }
        if (!z) {
            return true;
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = c7287.f22370;
        return dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34640(C11521 c11521, DialogInterfaceC0206 dialogInterfaceC0206, EnumC10110 enumC10110) {
        C14507 c14507;
        return dialogInterfaceC0206 != null && c11521.f34407 == enumC10110 && m34655(c11521, true) && (c14507 = (C14507) c11521.f34404.get()) != null && c14507.f44486.f22370 == dialogInterfaceC0206;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34631(C11521 c11521, EnumC13636 enumC13636, EnumC5876 enumC5876) {
        if (f44482 != c11521) {
            return;
        }
        c11521.f34407 = EnumC10110.FINISHING;
        long j = c11521.f34402;
        m34657(c11521);
        f44482 = null;
        if (enumC5876 != null && j == f44477 && (enumC5876 == EnumC5876.STATE_UNKNOWN || enumC5876 == EnumC5876.ENTRY_MISSING || enumC5876 == EnumC5876.BIND_TIMEOUT || enumC5876 == EnumC5876.UNSUPPORTED_PROFILE)) {
            f44478 = false;
        }
        C11521 c115212 = f44481;
        f44481 = null;
        if (c115212 == null) {
            return;
        }
        long j2 = c115212.f34402;
        if (!(enumC13636 == EnumC13636.HANDLED && j2 == j) && j2 == f44477 && m34665(c115212)) {
            f44482 = c115212;
            if (!m34662(c115212)) {
                f44482 = null;
            } else if (enumC5876 != null) {
                m34632(c115212, false);
            } else {
                m34647(c115212, false);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m34664(C14507 c14507) {
        C11521 c11521 = f44481;
        if (c11521 != null && c11521.f34404.get() == c14507) {
            f44481 = null;
        }
        C11521 c115212 = f44482;
        if (c115212 == null || c115212.f34404.get() != c14507) {
            return;
        }
        c115212.f34406 = true;
        m34657(c115212);
        if (c115212.f34408) {
            return;
        }
        m34631(c115212, EnumC13636.UNHANDLED, (EnumC5876) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5876 m34623(InterfaceC10085 interfaceC10085, int i, int i2, long j, C0937 c0937, C12226 c12226) {
        if (i2 >= 24) {
            return null;
        }
        C1808 m34620 = m34620(interfaceC10085, i, "accessibility_enabled", j, c0937, c12226);
        if (m34620.f6234) {
            if ("1".equals(((String) m34620.f6233.get(0)).trim())) {
                return null;
            }
            if (m34621(interfaceC10085, i, "accessibility_enabled", "1", j, c0937, c12226).f6234) {
                C1808 m346202 = m34620(interfaceC10085, i, "accessibility_enabled", j, c0937, c12226);
                if (m346202.f6234 && "1".equals(((String) m346202.f6233.get(0)).trim())) {
                    return null;
                }
                if (c12226.f36465) {
                    return EnumC5876.STATE_UNKNOWN;
                }
                return EnumC5876.COMMAND_FAILED;
            }
            if (c12226.f36465) {
                return EnumC5876.STATE_UNKNOWN;
            }
            return EnumC5876.COMMAND_FAILED;
        }
        if (c12226.f36465) {
            return EnumC5876.STATE_UNKNOWN;
        }
        return EnumC5876.COMMAND_FAILED;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5876 m34624(InterfaceC10085 interfaceC10085, int i, String str, long j, C5171 c5171, C0937 c0937, C7993 c7993, C12226 c12226) {
        m34638(Math.min(8000L, Math.max(0L, (j - SystemClock.elapsedRealtime()) - 2500)), j, c5171, c0937, c7993);
        C1808 m34620 = m34620(interfaceC10085, i, "enabled_accessibility_services", j, c0937, c12226);
        if (m34620.f6234) {
            if (!m34639((String) m34620.f6233.get(0), str)) {
                return EnumC5876.ENTRY_MISSING;
            }
            if (ActivityRecordService.m47()) {
                return EnumC5876.STARTED;
            }
            return EnumC5876.BIND_TIMEOUT;
        }
        if (c12226.f36465) {
            return EnumC5876.STATE_UNKNOWN;
        }
        return EnumC5876.COMMAND_FAILED;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34638(long j, long j2, C5171 c5171, C0937 c0937, C7993 c7993) {
        if (ActivityRecordService.m47()) {
            return true;
        }
        long min = Math.min(j2, Math.max(0L, j) + SystemClock.elapsedRealtime());
        while (SystemClock.elapsedRealtime() < min) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long min2 = Math.min(200L, min - elapsedRealtime);
            if (min2 <= 0) {
                return false;
            }
            SystemClock.sleep(min2);
            if (ActivityRecordService.m47()) {
                return true;
            }
            if (SystemClock.elapsedRealtime() <= elapsedRealtime) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34620(InterfaceC10085 interfaceC10085, int i, String str, long j, C0937 c0937, C12226 c12226) {
        return m34622(interfaceC10085, "settings get --user " + i + " secure " + str, 1, false, j, c0937, c12226);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34621(InterfaceC10085 interfaceC10085, int i, String str, String str2, long j, C0937 c0937, C12226 c12226) {
        StringBuilder sb = new StringBuilder("settings put --user ");
        sb.append(i);
        sb.append(" secure ");
        sb.append(str);
        sb.append(" ");
        sb.append("'" + str2.replace("'", "'\\''") + "'");
        return m34622(interfaceC10085, sb.toString(), 0, true, j, c0937, c12226);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1808 m34622(InterfaceC10085 interfaceC10085, String str, int i, boolean z, long j, C0937 c0937, C12226 c12226) {
        boolean z2;
        boolean z3;
        synchronized (interfaceC10085) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            if (elapsedRealtime <= 0) {
                return new C1808(Collections.EMPTY_LIST, false);
            }
            long min = Math.min(2500L, elapsedRealtime);
            if (z) {
                c12226.f36465 = true;
            }
            String str2 = "MT_AR_DONE:" + Long.toHexString(f44480.incrementAndGet());
            try {
                try {
                    C12201 mo25342 = interfaceC10085.mo25342(min, "{ " + str + "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- '" + str2 + "'");
                    String[] split = mo25342.f36414.split("\\n", -1);
                    int length = split.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        if ("Read shell timeout.".equals(split[i2].trim())) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    boolean mo25345 = interfaceC10085.mo25345();
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = mo25342.f36415;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < strArr.length) {
                            String str3 = strArr[i3];
                            if (str2.equals(str3)) {
                                i4++;
                                if (i3 != strArr.length - 1) {
                                    break;
                                }
                                i3++;
                            } else {
                                if (!str3.startsWith("MT_AR_OUT:")) {
                                    break;
                                }
                                arrayList.add(str3.substring(10));
                                i3++;
                            }
                        } else if (i4 == 1) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                    if (z2 || !mo25345 || (!z3 && (interfaceC10085 instanceof C12906))) {
                        try {
                            interfaceC10085.close();
                        } catch (RuntimeException unused) {
                        }
                    }
                    if (!mo25342.m29683() && z3 && arrayList.size() == i) {
                        return new C1808(arrayList, true);
                    }
                    return new C1808(Collections.EMPTY_LIST, false);
                } catch (RuntimeException unused2) {
                    return new C1808(Collections.EMPTY_LIST, false);
                }
            } catch (RuntimeException unused3) {
                interfaceC10085.close();
                return new C1808(Collections.EMPTY_LIST, false);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34639(String str, String str2) {
        ComponentName unflattenFromString;
        if (str == null || str.isEmpty() || "null".equals(str) || (unflattenFromString = ComponentName.unflattenFromString(str2)) == null) {
            return false;
        }
        for (String str3 : str.split(":", -1)) {
            if (!str3.isEmpty() && unflattenFromString.equals(ComponentName.unflattenFromString(str3))) {
                return true;
            }
        }
        return false;
    }
}
