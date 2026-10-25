package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 31K1 */
/* renamed from: l.ᩳۛ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC17875 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f54591;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f54592;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f54593;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f54594;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f54595;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f54596;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f54597;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC17875(ActivityC17169 activityC17169, View view) {
        super(view);
        this.f54593 = activityC17169;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f54596 = view.findViewById(R.id.MT_Protector_res_0x7f0a0054);
        this.f54594 = view.findViewById(R.id.MT_Protector_res_0x7f0a0445);
        this.f54595 = (ImageView) view.findViewById(R.id.icon);
        this.f54591 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f54592 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f54597 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable m3234 = C0881.m3234(activityC17169, R.drawable.MT_Protector_res_0x7f0801ee);
        C11003.requireNonNull(m3234);
        Drawable mutate = m3234.mutate();
        mutate.setAlpha(119);
        imageView.setImageDrawable(mutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16557 c16557;
        int bindingAdapterPosition;
        ActivityC17169 activityC17169 = this.f54593;
        c16557 = activityC17169.f52599;
        if (c16557.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC17169.m40275(activityC17169, bindingAdapterPosition, true);
        activityC17169.m40358();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16557 c16557;
        final int bindingAdapterPosition;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ActivityC17169 activityC17169 = this.f54593;
        c16557 = activityC17169.f52599;
        if (!c16557.m38954() && (bindingAdapterPosition = getBindingAdapterPosition()) != -1) {
            arrayList = activityC17169.f52616;
            final AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(bindingAdapterPosition);
            C10820 m40306 = ActivityC17169.m40306(activityC17169, bindingAdapterPosition);
            if (abstractC14346.mo34235() || C10820.m27048(m40306)) {
                View view2 = this.f54594;
                C21282 c21282 = new C21282(activityC17169, view2, 8388611);
                C7716.m20669(view2);
                c21282.m48306();
                C3060 m48304 = c21282.m48304();
                if (abstractC14346.mo34235()) {
                    m48304.add(0, R.string.MT_Protector_res_0x7f120189, 0, R.string.MT_Protector_res_0x7f120189).setIcon(R.drawable.MT_Protector_res_0x7f0801dd);
                }
                if (C10820.m27048(m40306)) {
                    SubMenu addSubMenu = m48304.addSubMenu(0, R.id.MT_Protector_res_0x7f0a0367, 0, activityC17169.getString(R.string.MT_Protector_res_0x7f120189) + "…");
                    addSubMenu.getItem().setIcon(R.drawable.MT_Protector_res_0x7f0801de);
                    addSubMenu.setHeaderTitle(R.string.MT_Protector_res_0x7f1207ce);
                    MenuItem add = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036b, 0, R.string.MT_Protector_res_0x7f1207d6);
                    i = m40306.f32543;
                    i2 = m40306.f32545;
                    add.setEnabled(i + i2 > 0);
                    MenuItem add2 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a0369, 0, R.string.MT_Protector_res_0x7f1207d1);
                    i3 = m40306.f32544;
                    add2.setEnabled(i3 > 0);
                    MenuItem add3 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036c, 0, R.string.MT_Protector_res_0x7f1207d8);
                    i4 = m40306.f32546;
                    add3.setEnabled(i4 > 0);
                    MenuItem add4 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a0368, 0, R.string.MT_Protector_res_0x7f1207cf);
                    i5 = m40306.f32543;
                    add4.setEnabled(i5 > 0);
                    MenuItem add5 = addSubMenu.add(0, R.id.MT_Protector_res_0x7f0a036a, 0, R.string.MT_Protector_res_0x7f1207d3);
                    i6 = m40306.f32545;
                    add5.setEnabled(i6 > 0);
                }
                if (abstractC14346.mo34235()) {
                    if (abstractC14346.m34230()) {
                        m48304.add(0, R.string.MT_Protector_res_0x7f1209de, 0, R.string.MT_Protector_res_0x7f120875).setIcon(R.drawable.MT_Protector_res_0x7f080230);
                    } else {
                        m48304.add(0, R.string.MT_Protector_res_0x7f1209de, 0, R.string.MT_Protector_res_0x7f1209de).setIcon(R.drawable.MT_Protector_res_0x7f080244);
                    }
                    if (abstractC14346.mo14418()) {
                        m48304.add(0, R.string.MT_Protector_res_0x7f120530, 0, R.string.MT_Protector_res_0x7f120530).setIcon(R.drawable.MT_Protector_res_0x7f080219);
                    }
                    m48304.add(0, R.string.MT_Protector_res_0x7f1209b5, 0, R.string.MT_Protector_res_0x7f1209b5).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
                }
                c21282.m48302(new InterfaceC14930() { // from class: l.ܽۛ᩷
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C16557 c165572;
                        C3764 c3764;
                        ActivityC17169 activityC171692 = ViewOnClickListenerC17875.this.f54593;
                        int itemId = menuItem.getItemId();
                        AbstractC14346 abstractC143462 = abstractC14346;
                        if (itemId == R.string.MT_Protector_res_0x7f120189) {
                            abstractC143462.mo17428(activityC171692);
                            return true;
                        }
                        int i7 = bindingAdapterPosition;
                        if (itemId == R.id.MT_Protector_res_0x7f0a036b) {
                            activityC171692.m40348(i7);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector_res_0x7f0a0369) {
                            View m10216 = activityC171692.m10216(R.layout.MT_Protector_res_0x7f0d00e5);
                            ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(R.string.MT_Protector_res_0x7f1207d2);
                            DialogInterfaceOnClickListenerC12415 dialogInterfaceOnClickListenerC12415 = new DialogInterfaceOnClickListenerC12415(0, activityC171692, (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9));
                            C19258 buildDialog = activityC171692.buildDialog();
                            buildDialog.m44421(m10216);
                            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, dialogInterfaceOnClickListenerC12415);
                            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                            buildDialog.m44438();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector_res_0x7f0a036c) {
                            C19258 buildDialog2 = activityC171692.buildDialog();
                            buildDialog2.m44433(R.string.MT_Protector_res_0x7f120b7b);
                            buildDialog2.m44416(R.string.MT_Protector_res_0x7f1207d9);
                            buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC20919(activityC171692, 1));
                            buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                            buildDialog2.m44438();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector_res_0x7f0a0368) {
                            activityC171692.m40359(i7);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector_res_0x7f0a036a) {
                            activityC171692.m40372(i7);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector_res_0x7f1209de) {
                            ActivityC17169.m40320(activityC171692, i7);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector_res_0x7f120530) {
                            c3764 = activityC171692.f52607;
                            abstractC143462.mo17423(c3764);
                            activityC171692.m40358();
                            return true;
                        }
                        if (itemId != R.string.MT_Protector_res_0x7f1209b5) {
                            return true;
                        }
                        c165572 = activityC171692.f52599;
                        c165572.m38948();
                        return true;
                    }
                });
                c21282.m48305();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C16557 c16557;
        ImageView imageView = this.f54597;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        c16557 = this.f54593.f52599;
        c16557.m38951(this);
        return true;
    }
}
