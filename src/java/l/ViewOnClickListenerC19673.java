package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 715M */
/* renamed from: l.᩵᩵ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC19673 extends AbstractC3255 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C10402 f63538;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable f63539;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f63540;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f63541;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f63542;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f63543;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f63544;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9089 f63545;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16828 f63546;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC19673(C5561 c5561, C9089 c9089, View view) {
        super(view);
        this.f63540 = c5561;
        this.f63545 = c9089;
        this.f63538 = (C10402) view.findViewById(R.id.icon);
        this.f63542 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f63543 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f63541 = view.findViewById(R.id.MT_Protector_res_0x7f0a0445);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f63544 = imageView;
        Drawable mutate = C0881.m3234(c5561.f17216, R.drawable.MT_Protector_res_0x7f0801ee).mutate();
        this.f63539 = mutate;
        mutate.setAlpha(119);
        imageView.setImageDrawable(mutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        C19890.m45741(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45226() {
        TextView textView = this.f63542;
        if (textView.getTextColors().getDefaultColor() != C21943.f70275.getDefaultColor()) {
            this.f63538.m26234();
            textView.setTextColor(C21943.f70275);
            this.f63543.setTextColor(C21943.f70273);
            C19890.m45741(this.itemView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.MT_Protector_res_0x7f0a0115) {
            C9089 c9089 = this.f63545;
            boolean z = c9089.f27548;
            C5561 c5561 = this.f63540;
            if (z) {
                boolean m39587 = this.f63546.m39587();
                this.f63546.m39586(!m39587);
                if (!m39587) {
                    c9089.f27553++;
                } else {
                    c9089.f27553--;
                }
                c9089.f27555 = -1;
                this.itemView.setBackgroundColor(!m39587 ? C21943.f70286 : 0);
                C5561.m15772(c5561, c9089.f27553 > 0);
                if (!m39587) {
                    int bindingAdapterPosition = getBindingAdapterPosition();
                    int abs = Math.abs(bindingAdapterPosition - c9089.f27549);
                    c9089.f27549 = bindingAdapterPosition;
                    if (abs == 1) {
                        c9089.f27554++;
                    } else {
                        c9089.f27554 = 1;
                    }
                    if (c9089.f27554 == 5) {
                        C21374.m48463(R.string.MT_Protector_res_0x7f120917);
                        c9089.f27554 = 0;
                        return;
                    }
                    return;
                }
                c9089.f27549 = -2;
                return;
            }
            if (c5561.f17236.m22793()) {
                return;
            }
            if (this.f63546.m39598() == null || C12749.m31047(this.f63546.m39598().m40974()) != null) {
                c5561.f17225.mo12404(this.f63546.m39588(), this.f63546.m39598());
            } else {
                this.f63546.m39580(c5561.f17216, new RunnableC2739(this, getBindingAdapterPosition()));
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.getVisibility() != 0) {
            return false;
        }
        this.f63545.f27557.m5326(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C5561 c5561 = this.f63540;
        if (!C5561.m15779(c5561)) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C9089 c9089 = this.f63545;
        if (!c9089.f27548) {
            C21282 c21282 = new C21282(view.getContext(), this.f63541, 0);
            c21282.m48306();
            C3060 m48304 = c21282.m48304();
            boolean m51419 = c9089.f27556.m51419();
            int m51411 = m51419 ? -1 : c9089.f27556.m51411(this.f63546);
            boolean z = !C5561.m15787(c5561);
            boolean z2 = !c9089.m23460() && m51411 > 0;
            if (!m51419) {
                m48304.add(0, R.string.MT_Protector_res_0x7f1202dd, 0, R.string.MT_Protector_res_0x7f1202dd).setIcon(R.drawable.MT_Protector_res_0x7f0801f0);
                m48304.add(0, R.string.MT_Protector_res_0x7f1205ec, 0, R.string.MT_Protector_res_0x7f1205ec).setIcon(R.drawable.MT_Protector_res_0x7f0801e5);
            }
            m48304.add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e7);
            if (m51419) {
                m48304.add(0, R.string.MT_Protector_res_0x7f12011f, 0, R.string.MT_Protector_res_0x7f120120).setIcon(R.drawable.MT_Protector_res_0x7f0801ee).setEnabled(z);
                m48304.add(0, R.string.MT_Protector_res_0x7f1205ae, 0, R.string.MT_Protector_res_0x7f1205ae).setIcon(R.drawable.MT_Protector_res_0x7f0801cf);
            } else {
                m48304.add(0, R.string.MT_Protector_res_0x7f120646, 0, R.string.MT_Protector_res_0x7f120646).setIcon(R.drawable.MT_Protector_res_0x7f0801d4).setEnabled(z2);
                m48304.add(0, R.string.MT_Protector_res_0x7f12011f, 0, R.string.MT_Protector_res_0x7f12011f).setIcon(R.drawable.MT_Protector_res_0x7f0801ee).setEnabled(z);
            }
            m48304.add(0, R.string.MT_Protector_res_0x7f120a8a, 0, R.string.MT_Protector_res_0x7f120a8a).setIcon(R.drawable.MT_Protector_res_0x7f08023f);
            c21282.m48302(new InterfaceC14930() { // from class: l.ܺ᩵ܳ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ViewOnClickListenerC19673.m45218(ViewOnClickListenerC19673.this, menuItem);
                    return true;
                }
            });
            c21282.m48305();
            return true;
        }
        if (c9089.f27555 == -1) {
            c9089.f27555 = getBindingAdapterPosition();
            if (!this.f63546.m39587()) {
                this.f63546.m39586(true);
                c9089.f27553++;
                this.itemView.setBackgroundColor(C21943.f70286);
                C5561.m15772(c5561, c9089.f27553 > 0);
            }
            return true;
        }
        int i = c9089.f27555;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c9089.f27555 = -1;
        if (i > bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (i <= bindingAdapterPosition) {
            C16828 m51415 = c9089.f27556.m51415(i);
            if (!m51415.m39587()) {
                m51415.m39586(true);
                c9089.f27553++;
            }
            i++;
        }
        c9089.notifyDataSetChanged();
        C5561.m15772(c5561, c9089.f27553 > 0);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45218(final ViewOnClickListenerC19673 viewOnClickListenerC19673, MenuItem menuItem) {
        C5561 c5561 = viewOnClickListenerC19673.f63540;
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1202dd) {
            viewOnClickListenerC19673.f63546.m39580(c5561.f17216, new RunnableC2739(viewOnClickListenerC19673, viewOnClickListenerC19673.getBindingAdapterPosition()));
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120646) {
            C9089.m23454(c9089, viewOnClickListenerC19673.f63546);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ec) {
            final DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005 = new DialogInterfaceOnClickListenerC14005(c9089.f27556.f74505);
            C19258 buildDialog = c5561.f17216.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ed);
            buildDialog.m44429(dialogInterfaceOnClickListenerC14005.f42365, dialogInterfaceOnClickListenerC14005.f42366, dialogInterfaceOnClickListenerC14005);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۘ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC19673.m45219(ViewOnClickListenerC19673.this, dialogInterfaceOnClickListenerC14005);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
            int i = c9089.f27556.m51419() ? R.string.MT_Protector_res_0x7f120877 : R.string.MT_Protector_res_0x7f12086d;
            C19258 buildDialog2 = c5561.f17216.buildDialog();
            buildDialog2.m44433(R.string.MT_Protector_res_0x7f1205ca);
            buildDialog2.m44424(C4925.m14306(i, viewOnClickListenerC19673.f63542.getText().toString()));
            buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ᩴ᩵ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC19673.m45216(ViewOnClickListenerC19673.this);
                }
            });
            buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog2.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f12011f) {
            c9089.m23464(viewOnClickListenerC19673.getBindingAdapterPosition());
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f1205ae) {
            C9068.m23403(viewOnClickListenerC19673.f63546.m39588(), viewOnClickListenerC19673.f63546.m39598(), -1);
            C21374.m48457(R.string.MT_Protector_res_0x7f120030);
        } else if (itemId == R.string.MT_Protector_res_0x7f120a8a) {
            viewOnClickListenerC19673.f63546.m39579(c5561.f17216);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45219(ViewOnClickListenerC19673 viewOnClickListenerC19673, DialogInterfaceOnClickListenerC14005 dialogInterfaceOnClickListenerC14005) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        if (dialogInterfaceOnClickListenerC14005.f42367 != dialogInterfaceOnClickListenerC14005.f42366) {
            int m51411 = c9089.f27556.m51411(viewOnClickListenerC19673.f63546);
            if (m51411 != -1) {
                C9068.m23398(c9089.f27556.f74505, dialogInterfaceOnClickListenerC14005.f42365[dialogInterfaceOnClickListenerC14005.f42366].m47909(), m51411);
            } else {
                c9089.m23466();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45216(ViewOnClickListenerC19673 viewOnClickListenerC19673) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        try {
            int bindingAdapterPosition = viewOnClickListenerC19673.getBindingAdapterPosition();
            int m51411 = c9089.f27556.m51411(viewOnClickListenerC19673.f63546);
            if (m51411 == -1) {
                c9089.m23466();
            } else {
                c9089.f27556.m51412(m51411);
                C9089.m23449(c9089, viewOnClickListenerC19673.f63546, bindingAdapterPosition);
            }
        } catch (RuntimeException unused) {
            c9089.notifyDataSetChanged();
        }
        C19547.f63204.mo1664(Object.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45217(ViewOnClickListenerC19673 viewOnClickListenerC19673, int i) {
        C9089 c9089 = viewOnClickListenerC19673.f63545;
        if (i == -1) {
            i = C9089.m23446(c9089, viewOnClickListenerC19673.f63546);
        }
        if (i != -1) {
            c9089.notifyItemChanged(i);
        } else {
            c9089.m23466();
        }
        C19547.f63204.mo1664(Object.class);
    }
}
