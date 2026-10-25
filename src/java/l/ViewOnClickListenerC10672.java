package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 75NJ */
/* renamed from: l.ۧ֨ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC10672 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f32093;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f32094;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f32095;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f32096;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f32097;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f32098;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f32099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10672(ActivityC16315 activityC16315, View view) {
        super(view);
        this.f32095 = activityC16315;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f32098 = view.findViewById(R.id.MT_Protector_res_0x7f0a0054);
        this.f32096 = view.findViewById(R.id.MT_Protector_res_0x7f0a0445);
        this.f32097 = (ImageView) view.findViewById(R.id.icon);
        this.f32093 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f32094 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f32099 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable m3234 = C0881.m3234(activityC16315, R.drawable.MT_Protector_res_0x7f0801ee);
        C11003.requireNonNull(m3234);
        Drawable mutate = m3234.mutate();
        mutate.setAlpha(119);
        imageView.setImageDrawable(mutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16557 c16557;
        int bindingAdapterPosition;
        ActivityC16315 activityC16315 = this.f32095;
        c16557 = activityC16315.f50244;
        if (c16557.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC16315.m38428(activityC16315, bindingAdapterPosition);
        activityC16315.m38461();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16557 c16557;
        final int bindingAdapterPosition;
        ArrayList arrayList;
        ActivityC16315 activityC16315 = this.f32095;
        c16557 = activityC16315.f50244;
        if (c16557.m38954() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return false;
        }
        arrayList = activityC16315.f50241;
        final C22372 c22372 = (C22372) arrayList.get(bindingAdapterPosition);
        View view2 = this.f32096;
        C21282 c21282 = new C21282(activityC16315, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f120189, 0, R.string.MT_Protector_res_0x7f120189).setIcon(R.drawable.MT_Protector_res_0x7f0801dd);
        ActivityC16315.m38418(activityC16315, m48304, bindingAdapterPosition);
        m48304.add(0, R.string.MT_Protector_res_0x7f1206c4, 0, R.string.MT_Protector_res_0x7f1206c4).setIcon(R.drawable.MT_Protector_res_0x7f08022d);
        if (c22372.m5413()) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1209de, 0, R.string.MT_Protector_res_0x7f120875).setIcon(R.drawable.MT_Protector_res_0x7f080230);
        } else {
            m48304.add(0, R.string.MT_Protector_res_0x7f1209de, 0, R.string.MT_Protector_res_0x7f1209de).setIcon(R.drawable.MT_Protector_res_0x7f080244);
        }
        m48304.add(0, R.string.MT_Protector_res_0x7f1209b5, 0, R.string.MT_Protector_res_0x7f1209b5).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
        c21282.m48302(new InterfaceC14930() { // from class: l.֫֨ᩳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C16557 c165572;
                ActivityC16315 activityC163152 = ViewOnClickListenerC10672.this.f32095;
                int itemId = menuItem.getItemId();
                C22372 c223722 = c22372;
                if (itemId == R.string.MT_Protector_res_0x7f120189) {
                    c223722.m50220(activityC163152);
                    return true;
                }
                int i = bindingAdapterPosition;
                if (itemId == R.id.MT_Protector_res_0x7f0a036b) {
                    activityC163152.m38451(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector_res_0x7f0a0369) {
                    View m10216 = activityC163152.m10216(R.layout.MT_Protector_res_0x7f0d00e5);
                    ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(R.string.MT_Protector_res_0x7f1207d2);
                    DialogInterfaceOnClickListenerC20675 dialogInterfaceOnClickListenerC20675 = new DialogInterfaceOnClickListenerC20675(0, activityC163152, (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9));
                    C19258 buildDialog = activityC163152.buildDialog();
                    buildDialog.m44421(m10216);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, dialogInterfaceOnClickListenerC20675);
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44438();
                    return true;
                }
                if (itemId == R.id.MT_Protector_res_0x7f0a036c) {
                    View m102162 = activityC163152.m10216(R.layout.MT_Protector_res_0x7f0d00e5);
                    ((TextView) m102162.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(R.string.MT_Protector_res_0x7f1207d9);
                    m102162.findViewById(R.id.MT_Protector_res_0x7f0a00d9).setVisibility(8);
                    DialogInterfaceOnClickListenerC8680 dialogInterfaceOnClickListenerC8680 = new DialogInterfaceOnClickListenerC8680(0, activityC163152);
                    C19258 buildDialog2 = activityC163152.buildDialog();
                    buildDialog2.m44421(m102162);
                    buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, dialogInterfaceOnClickListenerC8680);
                    buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog2.m44438();
                    return true;
                }
                if (itemId == R.id.MT_Protector_res_0x7f0a0368) {
                    activityC163152.m38457(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector_res_0x7f0a036a) {
                    activityC163152.m38462(i);
                    return true;
                }
                if (itemId == R.string.MT_Protector_res_0x7f1206c4) {
                    c223722.m50223(activityC163152, (DialogInterfaceC19598) null);
                    return true;
                }
                if (itemId == R.string.MT_Protector_res_0x7f1209de) {
                    ActivityC16315.m38435(activityC163152, i);
                    return true;
                }
                if (itemId != R.string.MT_Protector_res_0x7f1209b5) {
                    return true;
                }
                c165572 = activityC163152.f50244;
                c165572.m38948();
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C16557 c16557;
        ImageView imageView = this.f32099;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        c16557 = this.f32095.f50244;
        c16557.m38951(this);
        return true;
    }
}
