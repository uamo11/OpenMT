package l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: L51L */
/* renamed from: l.ۛ᩸ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6328 extends AbstractC19902 implements InterfaceC11784, InterfaceC22556 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f19620;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f19621;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f19622;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7055 f19624;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Runnable f19619 = new RunnableC13383(this);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Handler f19623 = new Handler(Looper.getMainLooper());

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C21167 c21167 = (C21167) abstractC3255;
        C2095 m17607 = m17607(i);
        c21167.m48110();
        m17607.mo2792(c21167);
    }

    public C6328(C7055 c7055) {
        this.f19624 = c7055;
        c7055.m6897(this);
        this.f19620 = new ArrayList();
        this.f19621 = new ArrayList();
        this.f19622 = new ArrayList();
        setHasStableIds(c7055.m19034());
        m17610();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17610() {
        Iterator it = this.f19620.iterator();
        while (it.hasNext()) {
            ((C2095) it.next()).m6897((C6328) null);
        }
        ArrayList arrayList = new ArrayList(this.f19620.size());
        this.f19620 = arrayList;
        C7055 c7055 = this.f19624;
        m17604(arrayList, c7055);
        this.f19621 = m17603((AbstractC3506) c7055);
        notifyDataSetChanged();
        Iterator it2 = this.f19620.iterator();
        while (it2.hasNext()) {
            ((C2095) it2.next()).getClass();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17604(ArrayList arrayList, AbstractC3506 abstractC3506) {
        abstractC3506.m10698();
        int m10699 = abstractC3506.m10699();
        for (int i = 0; i < m10699; i++) {
            C2095 m10701 = abstractC3506.m10701(i);
            arrayList.add(m10701);
            C10562 c10562 = new C10562(m10701);
            ArrayList arrayList2 = this.f19622;
            if (!arrayList2.contains(c10562)) {
                arrayList2.add(c10562);
            }
            if (m10701 instanceof AbstractC3506) {
                AbstractC3506 abstractC35062 = (AbstractC3506) m10701;
                if (!(abstractC35062 instanceof C7055)) {
                    m17604(arrayList, abstractC35062);
                }
            }
            m10701.m6897(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m17603(AbstractC3506 abstractC3506) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int m10699 = abstractC3506.m10699();
        int i = 0;
        for (int i2 = 0; i2 < m10699; i2++) {
            C2095 m10701 = abstractC3506.m10701(i2);
            if (m10701.m6905()) {
                if (!m17605(abstractC3506) || i < abstractC3506.m10697()) {
                    arrayList.add(m10701);
                } else {
                    arrayList2.add(m10701);
                }
                if (m10701 instanceof AbstractC3506) {
                    AbstractC3506 abstractC35062 = (AbstractC3506) m10701;
                    if (abstractC35062 instanceof C7055) {
                        continue;
                    } else {
                        if (m17605(abstractC3506) && m17605(abstractC35062)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = m17603(abstractC35062).iterator();
                        while (it.hasNext()) {
                            C2095 c2095 = (C2095) it.next();
                            if (!m17605(abstractC3506) || i < abstractC3506.m10697()) {
                                arrayList.add(c2095);
                            } else {
                                arrayList2.add(c2095);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m17605(abstractC3506) && i > abstractC3506.m10697()) {
            C16016 c16016 = new C16016(abstractC3506.m6886(), arrayList2, abstractC3506.mo6941());
            c16016.m6902((InterfaceC23072) new C12678(this, abstractC3506));
            arrayList.add(c16016);
        }
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m17605(AbstractC3506 abstractC3506) {
        return abstractC3506.m10697() != Integer.MAX_VALUE;
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f19621.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2095 m17607(int i) {
        if (i < 0 || i >= this.f19621.size()) {
            return null;
        }
        return (C2095) this.f19621.get(i);
    }

    @Override // l.AbstractC19902
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return m17607(i).mo6941();
        }
        return -1L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17609(C2095 c2095) {
        int indexOf = this.f19621.indexOf(c2095);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, c2095);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17608() {
        Handler handler = this.f19623;
        Runnable runnable = this.f19619;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        C10562 c10562 = new C10562(m17607(i));
        ArrayList arrayList = this.f19622;
        int indexOf = arrayList.indexOf(c10562);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(c10562);
        return size;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10562 c10562 = (C10562) this.f19622.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C9878.f29899);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C21311.m48345(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c10562.f31697, viewGroup, false);
        if (inflate.getBackground() == null) {
            int i2 = C17648.f53953;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = c10562.f31698;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C21167(inflate);
    }

    @Override // l.InterfaceC22556
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo17606(String str) {
        int size = this.f19621.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((C2095) this.f19621.get(i)).m6911())) {
                return i;
            }
        }
        return -1;
    }
}
