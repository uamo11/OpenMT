package l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: E1KB */
/* renamed from: l.᩺ܰ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC23038 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener, InterfaceC14930 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f74137;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13865 f74138;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f74139;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f74140;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC23038(C13865 c13865, View view) {
        super(view);
        C10339 c10339;
        this.f74138 = c13865;
        this.f74137 = (TextView) view.findViewById(R.id.textView);
        this.f74140 = (TextView) view.findViewById(R.id.textView2);
        C19890.m45744(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        c10339 = c13865.f41342;
        imageView.setImageDrawable(c10339.f41371);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51207(String str) {
        C19452 c19452;
        int i;
        int i2;
        C19452 c194522;
        String m18061 = C6554.m18061(50, C14336.m34210(str));
        TextView textView = this.f74137;
        textView.setText(m18061);
        String m180612 = C6554.m18061(200, str);
        TextView textView2 = this.f74140;
        textView2.setText(m180612);
        TextPaint paint = textView.getPaint();
        TextPaint paint2 = textView2.getPaint();
        int flags = paint.getFlags();
        int flags2 = paint2.getFlags();
        C13865 c13865 = this.f74138;
        c19452 = c13865.f41343;
        if (c19452 != null) {
            c194522 = c13865.f41343;
            if (!c194522.m44838(str)) {
                this.f74139 = false;
                i = flags | 16;
                i2 = flags2 | 16;
                textView.setTextColor(C21943.f70273);
                textView2.setTextColor(C21943.f70273);
                paint.setFlags(i);
                paint2.setFlags(i2);
            }
        }
        this.f74139 = true;
        i = flags & (-17);
        i2 = flags2 & (-17);
        textView.setTextColor(C21943.f70275);
        textView2.setTextColor(C21943.f70275);
        paint.setFlags(i);
        paint2.setFlags(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19452 c19452;
        C19452 c194522;
        if (C13876.f41361.m22793()) {
            return;
        }
        final String charSequence = this.f74140.getText().toString();
        C13865 c13865 = this.f74138;
        c19452 = c13865.f41343;
        if (c19452 != null) {
            c194522 = c13865.f41343;
            if (!c194522.m44838(charSequence)) {
                m51206(charSequence);
                return;
            }
        }
        C4925.m14316(new Runnable() { // from class: l.ۛܰ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19452 c194523;
                C19452 c194524;
                C13865 c138652 = ViewOnClickListenerC23038.this.f74138;
                c194523 = c138652.f41343;
                if (c194523 != null) {
                    c194524 = c138652.f41343;
                    c194524.m44818(charSequence);
                }
            }
        }, 500L);
        ((ActivityC17169) c13865.requireActivity()).m40354(charSequence, (C19287) null);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21282 c21282 = new C21282(this.f74138.requireContext(), view, 0);
        if (this.f74139) {
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120530, 0, R.string.MT_Protector_res_0x7f120530);
        }
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
        c21282.m48302(this);
        c21282.m48305();
        return true;
    }

    @Override // l.InterfaceC14930
    public final boolean onMenuItemClick(MenuItem menuItem) {
        C19452 c19452;
        C3764 c3764;
        String charSequence = this.f74140.getText().toString();
        int itemId = menuItem.getItemId();
        C13865 c13865 = this.f74138;
        if (itemId == R.string.MT_Protector_res_0x7f120530) {
            c3764 = c13865.f41339;
            c3764.m11405(charSequence);
            return true;
        }
        c19452 = c13865.f41343;
        if (c19452 == null) {
            return true;
        }
        m51206(charSequence);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51206(final String str) {
        C13865 c13865 = this.f74138;
        Context requireContext = c13865.requireContext();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(requireContext);
        c19258.m44433(R.string.MT_Protector_res_0x7f12023f);
        c19258.m44424(c13865.getString(R.string.MT_Protector_res_0x7f120870, this.f74137.getText()));
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۨܰ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C19452 c19452;
                c19452 = ViewOnClickListenerC23038.this.f74138.f41343;
                c19452.m44840(str);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }
}
