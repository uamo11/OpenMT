package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: D7B1 */
/* renamed from: l.ۧ۬᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11026 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f33146;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f33149;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f33150;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33151;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33152;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9575 f33153 = new C9575();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7210 f33148 = new C7210(this);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f33147 = C19911.m45803();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27359(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        C13559 m32602;
        Exception exc;
        Exception exc2;
        final C11026 c11026 = new C11026(abstractActivityC3346, runnable);
        final FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۗۗ᩻
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C11026.m27357(C11026.this);
            }
        });
        new Thread(futureTask, "MT MCP initial workspace scan").start();
        long uptimeMillis = SystemClock.uptimeMillis() + 300;
        AbstractActivityC3346 abstractActivityC33462 = c11026.f33146;
        View m10216 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d0079);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0696)).setText(abstractActivityC33462.getString(R.string.MT_Protector_res_0x7f120081, Integer.valueOf(c11026.f33147)));
        C8776 c8776 = (C8776) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        c11026.f33149 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0191);
        c8776.setLayoutManager(new C6495(abstractActivityC33462));
        c8776.setAdapter(c11026.f33148);
        c8776.m22668((abstractActivityC33462.getResources().getDisplayMetrics().heightPixels * 2) / 3);
        try {
            m32602 = (C13559) futureTask.get(Math.max(0L, uptimeMillis - SystemClock.uptimeMillis()), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            m32602 = null;
        } catch (ExecutionException e) {
            m32602 = C13559.m32602(new Exception("Unable to load workspaces", e));
        } catch (TimeoutException unused2) {
            m32602 = null;
        }
        if (m32602 != null) {
            c11026.m27365(m32602, false);
        } else {
            c11026.f33149.setVisibility(8);
        }
        C19258 buildDialog = abstractActivityC33462.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120080);
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        c11026.f33151 = m44438;
        C8960.m23097(m44438);
        if (m32602 != null) {
            exc = m32602.f40463;
            if (exc != null) {
                exc2 = m32602.f40463;
                abstractActivityC33462.m10223(exc2, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        new Thread(new Runnable() { // from class: l.ۙۗ᩻
            @Override // java.lang.Runnable
            public final void run() {
                final C13559 m326022;
                try {
                    m326022 = (C13559) futureTask.get();
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (ExecutionException e2) {
                    m326022 = C13559.m32602(new Exception("Unable to load workspaces", e2));
                }
                final C11026 c110262 = C11026.this;
                C4925.m14315(new Runnable() { // from class: l.ۤۗ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11026.this.m27365(m326022, true);
                    }
                });
            }
        }, "MT MCP initial workspace apply").start();
    }

    public C11026(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        this.f33146 = abstractActivityC3346;
        this.f33150 = runnable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C13559 m27357(C11026 c11026) {
        try {
            return C13559.m32603(c11026.f33153.m24454());
        } catch (Exception e) {
            return C13559.m32602(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27365(C13559 c13559, boolean z) {
        Exception exc;
        List list;
        Exception exc2;
        exc = c13559.f40463;
        if (exc != null) {
            exc2 = c13559.f40463;
            this.f33148.m19295();
            this.f33149.setVisibility(0);
            if (z) {
                this.f33146.m10223(exc2, (DialogInterface.OnDismissListener) null);
                return;
            }
            return;
        }
        list = c13559.f40464;
        m27358(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27358(List list) {
        int min = Math.min(this.f33147, list.size());
        this.f33148.m19296(list.subList(0, min));
        this.f33149.setVisibility(list.isEmpty() ? 0 : 8);
        if (min < list.size()) {
            int i = ServiceC19288.f60689;
            C1802.f6208.execute(new RunnableC3950(1));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27368(final C11026 c11026, final C20864 c20864, final DialogInterfaceC0206 dialogInterfaceC0206) {
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ca);
        buildDialog.m44424(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12006d, c20864.f67521));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205ca, new DialogInterface.OnClickListener() { // from class: l.ۛۗ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C22732(C11026.this, c20864, dialogInterfaceC0206).m20274();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27363(final C11026 c11026, final C20864 c20864) {
        String string;
        int i;
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d007a);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0455);
        TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0456);
        boolean z = c20864.f67522 != null;
        String str = c20864.f67519;
        if (z) {
            textView.setText(R.string.MT_Protector_res_0x7f120074);
            textView2.setText(c20864.f67522);
            textView2.setTextColor(C0881.m3228(abstractActivityC3346, R.color.MT_Protector_res_0x7f06039c));
        } else {
            textView.setText(R.string.MT_Protector_res_0x7f120073);
            if (str == null || str.isEmpty()) {
                string = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1202ea);
            } else {
                int max = Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
                string = (max < 0 || (i = max + 1) >= str.length()) ? str : str.substring(i);
            }
            textView2.setText(string);
            textView2.setTextColor(m27366(m10216));
        }
        ViewOnClickListenerC14813.m35215(textView2);
        String m51028 = C22927.m51028(c20864.f67524);
        TextView textView3 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a052e);
        textView3.setText(m51028);
        ViewOnClickListenerC14813.m35215(textView3);
        String m40572 = C17283.m40572(c20864.f67523);
        TextView textView4 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02c9);
        textView4.setText(m40572);
        ViewOnClickListenerC14813.m35215(textView4);
        String str2 = c20864.f67521;
        TextView textView5 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0503);
        textView5.setText(str2);
        ViewOnClickListenerC14813.m35215(textView5);
        if (str == null || str.isEmpty()) {
            str = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1202ea);
        }
        TextView textView6 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0542);
        textView6.setText(str);
        ViewOnClickListenerC14813.m35215(textView6);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f12007c);
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1205ca, (DialogInterface.OnClickListener) null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f1204cb, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        c11026.f33152 = m44438;
        m44438.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.۬ۗ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0206 dialogInterfaceC0206 = m44438;
                C11026.m27364(C11026.this, c20864, dialogInterfaceC0206);
            }
        });
        m44438.m1448().setOnClickListener(new ViewOnClickListenerC12149(c11026, c20864, m44438, 0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27361(C11026 c11026, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        if (c11026.f33152 == dialogInterfaceC0206) {
            c11026.f33152 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27364(C11026 c11026, C20864 c20864, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (dialogInterfaceC0206.m1442()) {
            dialogInterfaceC0206.dismiss();
        }
        if (c11026.f33152 == dialogInterfaceC0206) {
            c11026.f33152 = null;
        }
        AbstractActivityC3346 abstractActivityC3346 = c11026.f33146;
        if (abstractActivityC3346 instanceof Main) {
            Main main = (Main) abstractActivityC3346;
            DialogInterfaceC0206 dialogInterfaceC02062 = c11026.f33151;
            if (dialogInterfaceC02062 != null) {
                dialogInterfaceC02062.dismiss();
            }
            c11026.f33150.run();
            C9340 m132 = main.m132();
            if (m132 != null) {
                m132.m24070().m39033(c20864.f67520.mo23554(), true);
                return;
            }
            return;
        }
        DialogInterfaceC0206 dialogInterfaceC02063 = c11026.f33151;
        if (dialogInterfaceC02063 != null) {
            dialogInterfaceC02063.dismiss();
        }
        Main.m64((Activity) abstractActivityC3346, c20864.f67520.mo23554(), false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m27366(View view) {
        TypedValue typedValue = new TypedValue();
        if (view.getContext().getTheme().resolveAttribute(android.R.attr.textColorPrimary, typedValue, true)) {
            if (typedValue.resourceId != 0) {
                return C0881.m3228(view.getContext(), typedValue.resourceId);
            }
            return typedValue.data;
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return ((TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0456)).getCurrentTextColor();
    }
}
