package l;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 37CJ */
/* renamed from: l.ܽܶܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16723 extends AbstractViewOnLongClickListenerC14606 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f51354;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1907 f51355;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC17429 f51356;

    public C16723(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(abstractActivityC3346, view);
        this.f51354 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0262);
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final void mo32019(Resources.Theme theme) {
        super.mo32019(theme);
        this.f51354.setTextColor(C21943.f70269);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39361(AbstractC17429 abstractC17429, C1907 c1907) {
        this.f51356 = abstractC17429;
        this.f51355 = c1907;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final boolean mo29330() {
        C1907 c1907 = this.f51355;
        return (c1907 == null || c1907.m6260()) ? false : true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C1907 c1907;
        AbstractC17429 m10144;
        C1907 c19072;
        int i = 0;
        if (this.f51356 == null || (c1907 = this.f51355) == null || c1907.m6260()) {
            return false;
        }
        C3318 c3318 = this.f51356.f37526;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        AbstractC17429 abstractC17429 = this.f51356;
        if (abstractC3255 instanceof C16723) {
            C16723 c16723 = (C16723) abstractC3255;
            int bindingAdapterPosition2 = c16723.getBindingAdapterPosition();
            if (bindingAdapterPosition2 == -1 || (m10144 = c16723.f51356) == null || (c19072 = c16723.f51355) == null) {
                return false;
            }
            if (abstractC17429 == m10144) {
                C2096.m6947(this.f51355.f6429.f11356, c16723.f51356.f53287, c19072.m6260() ? null : Integer.valueOf(c16723.f51355.f6429.f11356));
                abstractC17429.m40770();
                ArrayList arrayList = abstractC17429.f37525;
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C1907 c19073 = (C1907) arrayList.get(i);
                    if (!c19073.m6260() && c19073.f6429.f11356 == this.f51355.f6429.f11356) {
                        this.f51355 = c19073;
                        break;
                    }
                    i++;
                }
                c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }
            if (!c19072.m6260()) {
                r6 = Integer.valueOf(c16723.f51355.f6429.f11356);
            }
        } else {
            if (!(abstractC3255 instanceof C13195)) {
                return false;
            }
            C13195 c13195 = (C13195) abstractC3255;
            AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490 = c13195.f39457;
            if (!(abstractViewOnClickListenerC12490 instanceof C5435)) {
                return false;
            }
            C5435 c5435 = (C5435) abstractViewOnClickListenerC12490;
            if (c13195.getBindingAdapterPosition() == -1) {
                return false;
            }
            C11080 m27492 = C11080.m27492(c5435.f53287, C2096.m6965(), (this.itemView.getHeight() / 2.0f) + this.itemView.getY(), (c13195.itemView.getHeight() / 2.0f) + c13195.itemView.getY());
            m10144 = c3318.m10144(m27492.f33269);
            if (m10144 == null || m10144 == abstractC17429) {
                return false;
            }
            if (m27492.f33268) {
                Iterator it = m10144.f37525.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1907 c19074 = (C1907) ((AbstractViewOnClickListenerC1201) it.next());
                    if (!c19074.m6260()) {
                        r6 = Integer.valueOf(c19074.f6429.f11356);
                        break;
                    }
                }
            }
        }
        boolean z = m10144.f37522;
        C3318 c33182 = m10144.f37526;
        ArrayList arrayList2 = m10144.f37525;
        if (!z) {
            return false;
        }
        int m10143 = (arrayList2.size() == 1 && ((C1907) arrayList2.get(0)).m6260()) ? c33182.m10143(m10144) + 1 : -1;
        C2096.m6947(this.f51355.f6429.f11356, m10144.f53287, r6);
        abstractC17429.m40770();
        ArrayList arrayList3 = abstractC17429.f37525;
        m10144.m40770();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            C1907 c19075 = (C1907) arrayList2.get(i2);
            if (!c19075.m6260() && c19075.f6429.f11356 == this.f51355.f6429.f11356) {
                this.f51356 = m10144;
                this.f51355 = c19075;
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c3318.m10156();
            return true;
        }
        C18135 m42251 = C18135.m42251(bindingAdapterPosition, m10143, c33182.m10143(m10144) + i2 + 1, (arrayList3.size() == 1 && ((C1907) arrayList3.get(0)).m6260()) ? abstractC17429.f37526.m10143(abstractC17429) + 1 : -1);
        boolean z2 = m42251.f56419;
        if (z2) {
            c3318.m10149(this);
        }
        int i3 = m42251.f56421;
        if (i3 != -1) {
            c3318.notifyItemRemoved(i3);
        }
        int i4 = m42251.f56420;
        int i5 = m42251.f56422;
        if (i4 != i5) {
            c3318.notifyItemMoved(i4, i5);
        } else {
            int i6 = m42251.f56417;
            if (i6 != -1) {
                c3318.notifyItemChanged(i6);
            }
        }
        int i7 = m42251.f56418;
        if (i7 != -1) {
            c3318.notifyItemInserted(i7);
        }
        if (z2) {
            c3318.m10153(this);
        }
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1907 c1907;
        AbstractC17429 abstractC17429 = this.f51356;
        if (abstractC17429 == null || abstractC17429.f37526.m10155() || (c1907 = this.f51355) == null || c1907.m6260()) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f44705;
        View view2 = this.f44702;
        C21282 c21282 = new C21282(abstractActivityC3346, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f1202dd, 0, R.string.MT_Protector_res_0x7f1202dd).setIcon(R.drawable.MT_Protector_res_0x7f0801f0);
        m48304.add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e7);
        m48304.add(0, R.string.MT_Protector_res_0x7f1209b5, 0, R.string.MT_Protector_res_0x7f1209b5).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
        m48304.add(0, R.string.MT_Protector_res_0x7f120a8a, 0, R.string.MT_Protector_res_0x7f120a8a).setIcon(R.drawable.MT_Protector_res_0x7f08023f);
        c21282.m48302(new C13970(this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39360(C16723 c16723, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1202dd) {
            c16723.f51355.f6429.mo6367(c16723.f51356.f34527);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            final AbstractC17429 abstractC17429 = c16723.f51356;
            abstractC17429.getClass();
            final C1907 c1907 = c16723.f51355;
            if (c1907 == null || c1907.m6260()) {
                return;
            }
            C19258 buildDialog = abstractC17429.f34527.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f120870, c16723.f44703.getText().toString()));
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩺۠ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    AbstractC17429 abstractC174292 = AbstractC17429.this;
                    C1907 c19072 = c1907;
                    abstractC174292.getClass();
                    int i3 = c19072.f6429.f11356;
                    synchronized (C12749.class) {
                        Iterator it = C12749.m31046().iterator();
                        i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            } else if (((AbstractC3577) it.next()).f11356 == i3) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 == -1) {
                        abstractC174292.f37526.m10156();
                        return;
                    }
                    C12749.m31033(i2);
                    C2096.m6969();
                    abstractC174292.m40770();
                    abstractC174292.f37526.m10156();
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1209b5) {
            c16723.f51356.f37526.m10145();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120a8a) {
            AbstractC17429 abstractC174292 = c16723.f51356;
            C1907 c19072 = c16723.f51355;
            abstractC174292.getClass();
            AbstractC3577 abstractC3577 = c19072.f6429;
            C3535 c3535 = new C3535(abstractC174292.f34527);
            c3535.m10732(abstractC3577.getName());
            C19883 icon = abstractC3577.getIcon();
            AbstractC21294 abstractC21294 = C19883.f64184;
            c3535.m10733(new C12002(icon, 0));
            c3535.m10737("open-ns");
            c3535.m10730();
            c3535.m10731(abstractC3577.f11356);
            c3535.m10736();
        }
    }
}
