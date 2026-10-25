package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: X992 */
/* renamed from: l.ۢܽ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9719 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14656 f29421;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public TextView f29422;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f29423;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC22302 f29424;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f29425;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21597 f29426;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9503 f29427;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedList f29428 = new LinkedList();

    public C9719(Main main, ArrayList arrayList) {
        this.f29425 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f29425.add(new C21008(this, (PackageInfo) arrayList.get(i)));
        }
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00cd);
        C23592 c23592 = (C23592) m10216.findViewById(R.id.searchView);
        this.f29422 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        C9503 c9503 = (C9503) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        this.f29427 = c9503;
        C14656 c14656 = new C14656(this);
        this.f29421 = c14656;
        c9503.setAdapter((ListAdapter) c14656);
        c9503.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳܽ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C9719.m24704(C9719.this, i2);
            }
        });
        c9503.setFastScrollEnabled(true);
        C4915.m14284(c9503);
        c23592.m52055(new C17479(this));
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC22813(1, this));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f29423 = buildDialog.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24704(C9719 c9719, int i) {
        C14656 c14656 = c9719.f29421;
        ((C21008) c14656.f44790.get(i)).f67823 = !r2.f67823;
        c14656.notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24703(C9719 c9719) {
        if (c9719.f29426 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c9719.f29425.iterator();
            while (it.hasNext()) {
                C21008 c21008 = (C21008) it.next();
                if (c21008.f67823) {
                    arrayList.add(c21008.f67822);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C21597 c21597 = c9719.f29426;
            C16773.m39494((List) c21597.f69347, (C16560) c21597.f69348, arrayList);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24714(ViewOnClickListenerC22302 viewOnClickListenerC22302) {
        this.f29423.m1434(-3, C4925.m14327(R.string.MT_Protector_res_0x7f120a76), null);
        this.f29424 = viewOnClickListenerC22302;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24712(int i) {
        this.f29422.setText(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24713(C21597 c21597) {
        this.f29426 = c21597;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24711() {
        Button m1448;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f29423;
        dialogInterfaceC0206.m1449();
        if (this.f29424 != null && (m1448 = dialogInterfaceC0206.m1448()) != null) {
            m1448.setOnClickListener(this.f29424);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f29425.iterator();
        while (it.hasNext()) {
            C21008 c21008 = (C21008) it.next();
            if (c21008.f67824) {
                linkedList.add(c21008);
            }
        }
        C1802.f6208.execute(new RunnableC2198(2, this, linkedList));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24705(C9719 c9719, LinkedList linkedList) {
        final C21008 c21008;
        while (c9719.f29423.m1442()) {
            while (!c9719.f29428.isEmpty()) {
                int max = Math.max(1, (c9719.f29427.getLastVisiblePosition() - c9719.f29427.getFirstVisiblePosition()) + 1);
                synchronized (c9719.f29428) {
                    while (c9719.f29428.size() > max) {
                        c9719.f29428.removeFirst();
                    }
                    c21008 = (C21008) c9719.f29428.removeLast();
                }
                if (c21008.f67824) {
                    c21008.f67824 = false;
                    final BitmapDrawable m16749 = RunnableC5974.m16749(c21008.f67822);
                    C4925.m14315(new Runnable() { // from class: l.ۜܽ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21008 c210082 = C21008.this;
                            C0734 c0734 = c210082.f67825;
                            boolean z = c210082.f67821;
                            BitmapDrawable bitmapDrawable = m16749;
                            if (!z) {
                                c0734.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0734.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0734.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c9719.f29423.m1442() && c9719.f29427.m24358()) {
                    SystemClock.sleep(100L);
                }
                if (!c9719.f29423.m1442()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (!c9719.f29428.isEmpty()) {
                    break;
                }
                final C21008 c210082 = (C21008) linkedList.removeFirst();
                if (c210082.f67824) {
                    c210082.f67824 = false;
                    final BitmapDrawable m167492 = RunnableC5974.m16749(c210082.f67822);
                    C4925.m14315(new Runnable() { // from class: l.ۜܽ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21008 c2100822 = C21008.this;
                            C0734 c0734 = c2100822.f67825;
                            boolean z = c2100822.f67821;
                            BitmapDrawable bitmapDrawable = m167492;
                            if (!z) {
                                c0734.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0734.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0734.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c9719.f29423.m1442() && c9719.f29427.m24358()) {
                    SystemClock.sleep(100L);
                }
                if (!c9719.f29423.m1442()) {
                    return;
                }
            }
            return;
        }
    }
}
