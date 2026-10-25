package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: O8UQ */
/* renamed from: l.ᩳ᩹ۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18340 extends C17843 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6988 f56997;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f56998;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final float[] f56996 = {0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f56994 = {"x0.5", "x0.75", "x1.0", "x1.25", "x1.5", "x2.0"};

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f56995 = {15, 30, 45, 60, 90};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m42763(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? R.string.MT_Protector_res_0x7f120307 : R.string.MT_Protector_res_0x7f12069f : R.string.MT_Protector_res_0x7f1206a4 : R.string.MT_Protector_res_0x7f12069d : R.string.MT_Protector_res_0x7f12069c;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42754(C18340 c18340, TextView textView, MenuItem menuItem) {
        c18340.getClass();
        int order = menuItem.getOrder();
        if (order < 0 || order >= 6) {
            throw new IllegalArgumentException();
        }
        ApplicationC20075.f65008.edit().mo25853(order, "mps").apply();
        textView.setText(f56994[order]);
        c18340.f56997.f21578.mo15846(f56996[order]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42755(C18340 c18340, TextView textView, C21847 c21847, C21282[] c21282Arr, View view) {
        c18340.getClass();
        if (view.isAttachedToWindow()) {
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            C3060 m48304 = c21282.m48304();
            String[] strArr = f56994;
            m48304.add(0, R.id.text0, 0, strArr[0]);
            m48304.add(0, R.id.text1, 1, strArr[1]);
            m48304.add(0, R.id.text2, 2, strArr[2]);
            m48304.add(0, R.id.text3, 3, strArr[3]);
            m48304.add(0, R.id.text4, 4, strArr[4]);
            m48304.add(0, R.id.MT_Protector_res_0x7f0a05c4, 5, strArr[5]);
            c21282.m48302(new C6324(c18340, textView));
            c21282.m48301((InterfaceC7875) c21847);
            c21282Arr[0] = c21282;
            c21282.m48305();
        }
    }

    public C18340(C6988 c6988, List list, int i) {
        super(i, list);
        this.f56998 = new ArrayList();
        this.f56997 = c6988;
    }

    @Override // l.C17843
    /* renamed from: ۢ */
    public final boolean mo30570() {
        return m42758() == 2;
    }

    @Override // l.C17843
    /* renamed from: ۧ */
    public final void mo41816(int i, int i2) {
        if (i != i2) {
            C6988 c6988 = this.f56997;
            if (c6988 != null) {
                c6988.f21570 = -1;
                c6988.f21572 = false;
                c6988.f21575 = null;
            }
            Iterator it = this.f56998.iterator();
            while (it.hasNext()) {
                ((InterfaceC11285) it.next()).mo27897(i, i2);
            }
            if (c6988 == null || !c6988.f21577) {
                return;
            }
            C8399.m22005(c6988.f21568, i2);
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int m42758() {
        int i = ApplicationC20075.f65008.getInt("mpm", 0);
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m42762() {
        int i = ApplicationC20075.f65008.getInt("mps", 2);
        if (i < 0 || i >= 6) {
            return 2;
        }
        return i;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m42757() {
        int m42758 = m42758() + 1;
        if (m42758 > 3) {
            m42758 = 0;
        }
        ApplicationC20075.f65008.edit().mo25853(m42758, "mpm").apply();
        C21100.f68056.mo1669(Integer.valueOf(m42758));
        return m42758;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [l.۬᩸ۜ] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۫᩸ۜ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۙ᩸ۜ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m42764(final AbstractActivityC3346 abstractActivityC3346) {
        final C2112 c2112 = new C2112();
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01dd);
        final C21282[] c21282Arr = new C21282[1];
        final C21847 c21847 = new C21847(c21282Arr);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0582);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("mbp", false));
        c2978.setOnCheckedChangeListener(new C22552(0));
        final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a054e);
        textView.setText(f56994[m42762()]);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0061).setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩸ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18340.m42755(C18340.this, textView, c21847, c21282Arr, view);
            }
        });
        final TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0530);
        final RunnableC11969 runnableC11969 = new RunnableC11969(abstractActivityC3346, textView2);
        ?? r5 = new InterfaceC12632() { // from class: l.ۙ᩸ۜ
            @Override // l.InterfaceC12632
            /* renamed from: ֫ */
            public final void mo8063() {
                C18340.m42752(AbstractActivityC3346.this, textView2, runnableC11969);
            }
        };
        m42761(abstractActivityC3346, textView2);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0060).setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩸ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18340.m42753(AbstractActivityC3346.this, c2112, c21847, c21282Arr, view);
            }
        });
        final C2447 c2447 = (C2447) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        AbstractC22723 itemAnimator = c2447.getItemAnimator();
        itemAnimator.m50782(0L);
        itemAnimator.m50789(0L);
        itemAnimator.m50792(0L);
        itemAnimator.m50786(0L);
        final C7735 c7735 = new C7735(this);
        c2447.setAdapter(c7735);
        m10216.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC23257(this, new InterfaceC11285() { // from class: l.۬᩸ۜ
            @Override // l.InterfaceC11285
            /* renamed from: ֫ */
            public final void mo27897(int i, int i2) {
                C7735 c77352 = C7735.this;
                c77352.notifyItemChanged(i);
                c77352.notifyItemChanged(i2);
                C2447 c24472 = c2447;
                if (c24472.m7901() || c24472.m7902()) {
                    return;
                }
                c24472.smoothScrollToPosition(i2);
            }
        }, C21100.f68044, new InterfaceC1008() { // from class: l.۫᩸ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                c7735.notifyItemChanged(C18340.this.mo16336());
            }
        }, r5, runnableC11969, c21282Arr, c2112));
        c2447.scrollToPosition(mo16336());
        return m10216;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42752(AbstractActivityC3346 abstractActivityC3346, TextView textView, Runnable runnable) {
        m42761(abstractActivityC3346, textView);
        m42760(runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42753(final AbstractActivityC3346 abstractActivityC3346, final C2112 c2112, C21847 c21847, C21282[] c21282Arr, View view) {
        if (view.isAttachedToWindow()) {
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            C3060 m48304 = c21282.m48304();
            m48304.add(0, 1, 0, R.string.MT_Protector_res_0x7f1206ab);
            int i = 0;
            while (i < 5) {
                int i2 = f56995[i];
                int i3 = i + 100;
                i++;
                m48304.add(0, i3, i, abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1206a9, Integer.valueOf(i2)));
            }
            m48304.add(0, 200, 6, R.string.MT_Protector_res_0x7f1206a6);
            c21282.m48302(new InterfaceC14930() { // from class: l.ۤ᩸ۜ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C18340.m42756(AbstractActivityC3346.this, c2112, menuItem);
                }
            });
            c21282.m48301((InterfaceC7875) c21847);
            c21282Arr[0] = c21282;
            c21282.m48305();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42756(AbstractActivityC3346 abstractActivityC3346, C2112 c2112, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C21805.m49152();
            return true;
        }
        if (itemId != 200) {
            int i = itemId - 100;
            if (i < 0 || i >= 5) {
                return false;
            }
            C21805.m49153(f56995[i]);
            return true;
        }
        C14084 c14084 = new C14084(abstractActivityC3346, c2112);
        c14084.m31258(R.string.MT_Protector_res_0x7f1206a8);
        c14084.m31276(2);
        c14084.m31279(6);
        c14084.m31265(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1206a7));
        int m49157 = C21805.m49157();
        if (m49157 > 0) {
            c14084.m31250((CharSequence) String.valueOf(m49157));
            c14084.m31281();
        }
        c2112.f7046 = c14084;
        c14084.m31266(true);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42761(AbstractActivityC3346 abstractActivityC3346, TextView textView) {
        int m49157 = C21805.m49157();
        if (m49157 > 0) {
            textView.setText(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1206ac, Integer.valueOf(m49157)));
        } else {
            textView.setText(R.string.MT_Protector_res_0x7f1206aa);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42760(Runnable runnable) {
        C4925.m14324().removeCallbacks(runnable);
        long m49155 = C21805.m49155();
        if (m49155 <= 0) {
            return;
        }
        long j = m49155 % 60000;
        C4925.m14324().postDelayed(runnable, j != 0 ? j : 60000L);
    }
}
