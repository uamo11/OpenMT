package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* compiled from: 4AWI */
/* renamed from: l.ܳܳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC14588 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f44667;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23761 f44668;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f44669;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f44670;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f44671;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC14588(C23761 c23761, View view) {
        super(view);
        this.f44668 = c23761;
        C19890.m45741(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f44667 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f44669 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f44670 = imageView;
        Drawable m3234 = C0881.m3234(c23761.f76917, R.drawable.MT_Protector_res_0x7f0801ee);
        C11003.requireNonNull(m3234);
        Drawable mutate = m3234.mutate();
        this.f44671 = mutate;
        mutate.setAlpha(119);
        imageView.setImageDrawable(mutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C23761 c23761 = this.f44668;
        BitSet bitSet = c23761.f76920;
        ActivityC0477 activityC0477 = c23761.f76917;
        z = activityC0477.f2073;
        if (z) {
            boolean z2 = bitSet.get(bindingAdapterPosition);
            bitSet.set(bindingAdapterPosition, !z2);
            if (!z2) {
                c23761.f76918++;
            } else {
                c23761.f76918--;
            }
            c23761.f76922 = -1;
            this.itemView.setBackgroundColor(!z2 ? C21943.f70286 : 0);
            activityC0477.m2105(c23761.f76918 > 0);
            if (!z2) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                int abs = Math.abs(bindingAdapterPosition2 - c23761.f76916);
                c23761.f76916 = bindingAdapterPosition2;
                if (abs == 1) {
                    c23761.f76921++;
                } else {
                    c23761.f76921 = 1;
                }
                if (c23761.f76921 == 5) {
                    C21374.m48463(R.string.MT_Protector_res_0x7f120917);
                    c23761.f76921 = 0;
                    return;
                }
                return;
            }
            c23761.f76916 = -2;
            return;
        }
        activityC0477.m2100((C15293) ((ArrayList) c23761.m52425()).get(bindingAdapterPosition), R.string.MT_Protector_res_0x7f1202dd, false, new InterfaceC13041() { // from class: l.ۧܳܿ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C23761 c237612 = ViewOnClickListenerC14588.this.f44668;
                ArrayList arrayList = (ArrayList) c237612.m52425();
                int i = bindingAdapterPosition;
                arrayList.set(i, (C15293) obj);
                c237612.f76915.notifyItemChanged(i);
                C8239.m21822();
            }
        });
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(final View view) {
        boolean z;
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int bindingAdapterPosition = getBindingAdapterPosition();
        C23761 c23761 = this.f44668;
        BitSet bitSet = c23761.f76920;
        ActivityC0477 activityC0477 = c23761.f76917;
        z = activityC0477.f2073;
        if (!z) {
            C21282 c21282 = new C21282(activityC0477, view, 0);
            c21282.m48306();
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1202dd, 0, R.string.MT_Protector_res_0x7f1202dd).setIcon(R.drawable.MT_Protector_res_0x7f0801f0);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ad, 0, R.string.MT_Protector_res_0x7f1205ad).setIcon(R.drawable.MT_Protector_res_0x7f0801ce);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2).setIcon(R.drawable.MT_Protector_res_0x7f0801e4);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e7);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12011f, 0, R.string.MT_Protector_res_0x7f12011f).setIcon(R.drawable.MT_Protector_res_0x7f0801ee);
            c21282.m48302(new InterfaceC14930() { // from class: l.֫ܳܿ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ArrayList arrayList;
                    C6659 c6659;
                    ArrayList arrayList2;
                    C6659 c66592;
                    final ViewOnClickListenerC14588 viewOnClickListenerC14588 = ViewOnClickListenerC14588.this;
                    C23761 c237612 = viewOnClickListenerC14588.f44668;
                    ActivityC0477 activityC04772 = c237612.f76917;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.string.MT_Protector_res_0x7f1202dd) {
                        viewOnClickListenerC14588.onClick(view);
                        return true;
                    }
                    final int i = bindingAdapterPosition;
                    if (itemId == R.string.MT_Protector_res_0x7f1205ad) {
                        arrayList2 = activityC04772.f2064;
                        c66592 = activityC04772.f2066;
                        final C23761 c237613 = (C23761) arrayList2.get(c66592.m2038());
                        final List m15500 = c237613.m52426().m15500();
                        activityC04772.m2100(new C15293(), R.string.MT_Protector_res_0x7f1205ad, true, new InterfaceC13041() { // from class: l.ܽܳܿ
                            @Override // l.InterfaceC13041
                            public final void accept(Object obj) {
                                int i2 = i + 1;
                                m15500.add(i2, (C15293) obj);
                                C23761 c237614 = c237613;
                                c237614.f76915.notifyItemInserted(i2);
                                c237614.f76923.smoothScrollToPosition(i2);
                                C8239.m21822();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                        C19258 buildDialog = activityC04772.buildDialog();
                        buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                        buildDialog.m44424(activityC04772.getString(R.string.MT_Protector_res_0x7f120870, viewOnClickListenerC14588.f44667.getText()));
                        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ᩳܳܿ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                C23761 c237614 = ViewOnClickListenerC14588.this.f44668;
                                ArrayList arrayList3 = (ArrayList) c237614.m52425();
                                int i3 = i;
                                arrayList3.remove(i3);
                                c237614.f76915.notifyItemRemoved(i3);
                                C8239.m21822();
                            }
                        });
                        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                        buildDialog.m44438();
                        return true;
                    }
                    if (itemId != R.string.MT_Protector_res_0x7f1205c2) {
                        if (itemId == R.string.MT_Protector_res_0x7f12011f) {
                            ActivityC0477.m2103(activityC04772, i);
                        }
                        return true;
                    }
                    arrayList = activityC04772.f2064;
                    c6659 = activityC04772.f2066;
                    final C23761 c237614 = (C23761) arrayList.get(c6659.m2038());
                    final List m155002 = c237614.m52426().m15500();
                    activityC04772.m2100(C15293.m36301(((C15293) ((ArrayList) c237612.m52425()).get(i)).m36305()), R.string.MT_Protector_res_0x7f1205c2, true, new InterfaceC13041() { // from class: l.ܿܳܿ
                        @Override // l.InterfaceC13041
                        public final void accept(Object obj) {
                            int i2 = i + 1;
                            m155002.add(i2, (C15293) obj);
                            C23761 c237615 = c237614;
                            c237615.f76915.notifyItemInserted(i2);
                            c237615.f76923.smoothScrollToPosition(i2);
                            C8239.m21822();
                        }
                    });
                    return true;
                }
            });
            C18342.m42767(view, c21282);
            return true;
        }
        int i = c23761.f76922;
        if (i == -1) {
            c23761.f76922 = bindingAdapterPosition;
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c23761.f76918++;
                this.itemView.setBackgroundColor(C21943.f70286);
                activityC0477.m2105(c23761.f76918 > 0);
            }
            return true;
        }
        c23761.f76922 = -1;
        if (i <= bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (bindingAdapterPosition <= i) {
            if (!bitSet.get(bindingAdapterPosition)) {
                bitSet.set(bindingAdapterPosition);
                c23761.f76918++;
            }
            bindingAdapterPosition++;
        }
        c23761.f76915.notifyDataSetChanged();
        activityC0477.m2105(c23761.f76918 > 0);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f44670.getVisibility() != 0 || motionEvent.getAction() != 0) {
            return false;
        }
        this.f44668.f76924.m5326(this);
        return false;
    }
}
