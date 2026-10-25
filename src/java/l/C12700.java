package l;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 164Z */
/* renamed from: l.۫᩹ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12700 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f38231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f38232;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f38233;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6350 f38234;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16870 f38235;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13132 f38236;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C10402 c10402;
        C10402 c104022;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        ImageView imageView2;
        final C15521 c15521 = (C15521) abstractC3255;
        final C11227 c11227 = (C11227) this.f38233.get(i);
        c10402 = c15521.f47443;
        c10402.m26232(c11227.f33668.f64248);
        c104022 = c15521.f47443;
        c104022.m26233(c11227.mo6742());
        textView = c15521.f47444;
        textView.setText(C4925.m14327(c11227.f33666));
        textView2 = c15521.f47444;
        textView2.setTextColor(C21943.f70275);
        imageView = c15521.f47442;
        imageView.setVisibility(m30973() ? 0 : 8);
        c15521.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12700.m30971(C12700.this, c11227);
            }
        });
        c15521.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۙ᩹ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C12700.m30974(C12700.this, c11227, view);
            }
        });
        imageView2 = c15521.f47442;
        imageView2.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۗ᩹ܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C12700.m30972(C12700.this, c15521, motionEvent);
                return false;
            }
        });
    }

    public C12700(C16870 c16870, C13132 c13132, ArrayList arrayList) {
        this.f38235 = c16870;
        this.f38236 = c13132;
        this.f38233 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30970(C12700 c12700, DialogInterfaceC0206 dialogInterfaceC0206, C1556 c1556, View view) {
        c12700.f38231 = dialogInterfaceC0206;
        c12700.f38232 = c1556;
        c12700.f38234 = new C6350(view, new RunnableC13405(c12700));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m30973() {
        C6350 c6350 = this.f38234;
        return c6350 != null && c6350.m17633();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30975(C12700 c12700) {
        C6350 c6350 = c12700.f38234;
        if (c6350 != null) {
            c6350.m17632();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30976(C12700 c12700, C11227 c11227) {
        ArrayList arrayList = c12700.f38233;
        int indexOf = arrayList.indexOf(c11227);
        if (indexOf == -1) {
            indexOf = -1;
        } else {
            arrayList.remove(indexOf);
            c12700.notifyItemRemoved(indexOf);
        }
        if (indexOf == -1) {
            return;
        }
        c12700.f38235.m39650(c11227.f33665, false);
        if (arrayList.isEmpty()) {
            C13132 c13132 = c12700.f38236;
            DialogInterfaceC0206 dialogInterfaceC0206 = c12700.f38231;
            ViewTreeObserver viewTreeObserver = c13132.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC19051(viewTreeObserver, dialogInterfaceC0206, c13132));
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C15521(0, LayoutInflater.from(this.f38235.f34527).inflate(R.layout.MT_Protector_res_0x7f0d015c, viewGroup, false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30971(C12700 c12700, C11227 c11227) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        if (c12700.m30973() || (dialogInterfaceC0206 = c12700.f38231) == null) {
            return;
        }
        dialogInterfaceC0206.dismiss();
        c11227.mo6740(c12700.f38235.f34527);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.᩹᩹ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m30974(final C12700 c12700, final C11227 c11227, View view) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        if (c12700.m30973() || (dialogInterfaceC0206 = c12700.f38231) == null) {
            return false;
        }
        C16870.m39654(c12700.f38235, view, (InterfaceC2054) c11227, true, dialogInterfaceC0206, new Runnable() { // from class: l.᩸᩹ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C12700.m30975(C12700.this);
            }
        }, (RunnableC22578) new Runnable() { // from class: l.᩹᩹ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C12700.m30976(C12700.this, c11227);
            }
        });
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30972(C12700 c12700, C15521 c15521, MotionEvent motionEvent) {
        if (c12700.m30973() && c12700.f38232 != null && motionEvent.getActionMasked() == 0) {
            c12700.f38232.m5326(c15521);
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f38233.size();
    }
}
