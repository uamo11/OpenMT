package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: L5KK */
/* renamed from: l.ᩴܶܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18841 extends AbstractViewOnLongClickListenerC14606 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4024 f59428;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19547 f59429;

    public C18841(Main main, View view, C19547 c19547) {
        super(main, view);
        this.f59429 = c19547;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C5242 c5242 = C19547.f63205;
        C19547 c19547 = this.f59429;
        c19547.getClass();
        int bindingAdapterPosition = getBindingAdapterPosition();
        int bindingAdapterPosition2 = ((C18841) abstractC3255).getBindingAdapterPosition();
        C3318 c3318 = c19547.f37526;
        int m10143 = (bindingAdapterPosition - c3318.m10143(c19547)) - 1;
        int m101432 = (bindingAdapterPosition2 - c3318.m10143(c19547)) - 1;
        C9068.m23422().m18783(m10143, m101432);
        C6055.m16890(m10143, m101432, c19547.f37525);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C19547.f63205.mo1664(Object.class);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f59429.f37526.m10155() || this.f59428 == null) {
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
        c21282.m48302((InterfaceC14930) new C6001(3, this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43528(C18841 c18841, MenuItem menuItem) {
        final C19547 c19547 = c18841.f59429;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.string.MT_Protector_res_0x7f1202dd) {
            C5242 c5242 = C19547.f63205;
            c19547.getClass();
            final int bindingAdapterPosition = c18841.getBindingAdapterPosition();
            C9068.m23422().m18789((bindingAdapterPosition - c19547.f37526.m10143(c19547)) - 1).m39580(c19547.f34527, new Runnable() { // from class: l.ۡܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C19547.this.f37526.notifyItemChanged(bindingAdapterPosition, 1);
                    C19547.f63205.mo1664(Object.class);
                }
            });
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            C5242 c52422 = C19547.f63205;
            C19258 buildDialog = c19547.f34527.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f12086d, c18841.f44703.getText().toString()));
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC7388(i, c19547, c18841));
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1209b5) {
            c19547.f37526.m10145();
        } else if (itemId == R.string.MT_Protector_res_0x7f120a8a) {
            C5242 c52423 = C19547.f63205;
            c19547.getClass();
            C9068.m23422().m18789((c18841.getBindingAdapterPosition() - c19547.f37526.m10143(c19547)) - 1).m39579(c19547.f34527);
        }
    }
}
