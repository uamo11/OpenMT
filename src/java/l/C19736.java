package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 94PF */
/* renamed from: l.᩵᩸ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19736 extends AbstractViewOnLongClickListenerC14606 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0684 f63762;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19030 f63763;

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final boolean mo29330() {
        return true;
    }

    public C19736(Main main, View view, C0684 c0684) {
        super(main, view);
        this.f63762 = c0684;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫ */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C0684.m2772(this.f63762, this, (C19736) abstractC3255);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f63762.f37526.m10155() || this.f63763 == null) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f44705;
        View view2 = this.f44702;
        C21282 c21282 = new C21282(abstractActivityC3346, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9).setIcon(R.drawable.MT_Protector_res_0x7f080231);
        m48304.add(0, R.string.MT_Protector_res_0x7f120530, 0, R.string.MT_Protector_res_0x7f120530).setIcon(R.drawable.MT_Protector_res_0x7f080219);
        m48304.add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e7);
        m48304.add(0, R.string.MT_Protector_res_0x7f1209b5, 0, R.string.MT_Protector_res_0x7f1209b5).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
        c21282.m48302(new C3362(1, this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45443(final C19736 c19736, MenuItem menuItem) {
        String str;
        final C0684 c0684 = c19736.f63762;
        str = c19736.f63763.f59949;
        int i = 0;
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
            AbstractC15440 abstractC15440 = C0684.f2624;
            C4213 c4213 = new C4213(c0684, c0684.f34527, m39866);
            c4213.m31258(R.string.MT_Protector_res_0x7f1205f9);
            c4213.m31250((CharSequence) m39866.getName());
            c4213.m31244();
            c4213.m31279(6);
            c4213.m31281();
            c4213.m31266(true);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120530) {
            String mo23554 = m39866.mo23554();
            AbstractC15440 abstractC154402 = C0684.f2624;
            Main main = c0684.f34527;
            main.m127();
            if (main.m132() != null) {
                main.m132().m24070().m39046(mo23554);
                return;
            }
            return;
        }
        if (itemId != R.string.MT_Protector_res_0x7f1205ca) {
            if (itemId == R.string.MT_Protector_res_0x7f1209b5) {
                c0684.f37526.m10145();
                return;
            }
            return;
        }
        AbstractC15440 abstractC154403 = C0684.f2624;
        C19258 buildDialog = c0684.f34527.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
        buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f120870, c19736.f44703.getText().toString()));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC23725(c0684, m39866, c19736, 2));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC9152(i, c0684, c19736));
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ܺ᩸ܳ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0684.this.f37526.notifyItemChanged(c19736.getBindingAdapterPosition());
            }
        });
        buildDialog.m44438();
    }
}
