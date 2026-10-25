package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: J7J5 */
/* renamed from: l.᩹ۘ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC22048 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f70669;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f70670;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19932 f70671;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC22048(ActivityC19932 activityC19932, View view) {
        super(view);
        this.f70671 = activityC19932;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f70669 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f70670 = imageView;
        Drawable m3234 = C0881.m3234(activityC19932, R.drawable.MT_Protector_res_0x7f0801ee);
        C11003.requireNonNull(m3234);
        Drawable mutate = m3234.mutate();
        mutate.setAlpha(119);
        imageView.setImageDrawable(mutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        int i;
        int bindingAdapterPosition = getBindingAdapterPosition();
        ActivityC19932 activityC19932 = this.f70671;
        activityC19932.f64530 = bindingAdapterPosition;
        list = activityC19932.f64531;
        i = activityC19932.f64530;
        ((C2292) list.get(i)).mo6367((AbstractActivityC3346) activityC19932);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C21282 c21282 = new C21282(this.f70671, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1202dd, 0, R.string.MT_Protector_res_0x7f1202dd).setIcon(R.drawable.MT_Protector_res_0x7f0801f0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e6);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.ܶۘ᩻
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC22048 viewOnClickListenerC22048 = ViewOnClickListenerC22048.this;
                ActivityC19932 activityC19932 = viewOnClickListenerC22048.f70671;
                if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1202dd) {
                    viewOnClickListenerC22048.onClick(view);
                } else {
                    C19258 buildDialog = activityC19932.buildDialog();
                    buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                    buildDialog.m44424(activityC19932.getString(R.string.MT_Protector_res_0x7f120870, viewOnClickListenerC22048.f70669.getText()));
                    final int i = bindingAdapterPosition;
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩸ۘ᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C7936 c7936;
                            int i3 = i;
                            C12749.m31043(i3);
                            c7936 = ViewOnClickListenerC22048.this.f70671.f64532;
                            c7936.notifyItemRemoved(i3);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44438();
                }
                return true;
            }
        });
        C18342.m42767(view, c21282);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1556 c1556;
        if (this.f70670.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        c1556 = this.f70671.f64533;
        c1556.m5326(this);
        return false;
    }
}
