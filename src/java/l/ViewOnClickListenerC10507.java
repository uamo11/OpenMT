package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 6AY4 */
/* renamed from: l.ۤ᩵᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC10507 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f31511;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f31512;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f31513;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f31514;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f31515;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f31516;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f31517;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC10507(ViewOnClickListenerC19121 viewOnClickListenerC19121, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewOnClickListenerC19121).inflate(R.layout.MT_Protector_res_0x7f0d0135, viewGroup, false));
        this.f31513 = viewOnClickListenerC19121;
        View findViewById = this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03d3);
        C11233.m27803(findViewById, "findViewById(...)");
        this.f31511 = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a010e);
        C11233.m27803(findViewById2, "findViewById(...)");
        this.f31516 = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.icon);
        C11233.m27803(findViewById3, "findViewById(...)");
        this.f31515 = (ImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        C11233.m27803(findViewById4, "findViewById(...)");
        this.f31514 = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a028b);
        C11233.m27803(findViewById5, "findViewById(...)");
        this.f31512 = (TextView) findViewById5;
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m26406() {
        InterfaceC17889 interfaceC17889 = this.f31517;
        if (interfaceC17889 != null) {
            return interfaceC17889;
        }
        C11233.m27804("fileItem");
        throw null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View m26409() {
        return this.f31511;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m26405() {
        return this.f31516;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ImageView m26408() {
        return this.f31515;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView m26407() {
        return this.f31514;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView m26410() {
        return this.f31512;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r6.f60252;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            l.᩵֡᩷ r6 = r5.f31513
            l.۫ۤۧ r0 = l.ViewOnClickListenerC19121.m44108(r6)
            r1 = 0
            if (r0 == 0) goto L104
            boolean r0 = r0.m29962()
            if (r0 == 0) goto L11
            goto L8b
        L11:
            l.ܽܽ᩻ r0 = l.ViewOnClickListenerC19121.m44142(r6)
            if (r0 != 0) goto L18
            goto L8b
        L18:
            l.ᩳۜܳ r2 = r5.m26406()
            boolean r2 = r2.mo36982()
            if (r2 == 0) goto L26
            l.ViewOnClickListenerC19121.m44132(r6)
            return
        L26:
            l.ᩳۜܳ r2 = r5.m26406()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L5e
            l.ۧ᩷ܳ r1 = r0.f51868
            l.ۖ᩵ r1 = r1.f33716
            java.lang.String r2 = "backPositionMap"
            l.C11233.m27803(r1, r2)
            java.lang.String r0 = r0.m39741()
            l.ᩳ֡᩷ r2 = l.ViewOnClickListenerC19121.m44141(r6)
            int r2 = r2.m41436()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            l.ᩳۜܳ r0 = r5.m26406()
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = "/"
            java.lang.String r0 = l.C16014.m37867(r0, r1)
            l.ViewOnClickListenerC19121.m44130(r6, r0)
            return
        L5e:
            int r0 = l.ViewOnClickListenerC19121.m44124(r6)
            r2 = 1
            if (r0 == r2) goto Le5
            r3 = 2
            if (r0 == r3) goto L92
            r1 = 3
            if (r0 != r1) goto L8c
            l.ᩳۜܳ r0 = r5.m26406()
            boolean r0 = r0.mo36969()
            if (r0 == 0) goto L8b
            l.ᩳۜܳ r0 = r5.m26406()
            l.ᩳۜܳ r1 = r5.m26406()
            boolean r1 = r1.isChecked()
            r1 = r1 ^ r2
            r0.setChecked(r1)
            l.ViewOnClickListenerC19121.m44096(r6, r5)
            l.ViewOnClickListenerC19121.m44139(r6)
        L8b:
            return
        L8c:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>()
            throw r6
        L92:
            l.ᩳۜܳ r0 = r5.m26406()
            java.lang.String r0 = r0.getName()
            android.widget.EditText r2 = l.ViewOnClickListenerC19121.m44110(r6)
            java.lang.String r3 = "filenameEditText"
            if (r2 == 0) goto Le1
            r2.setText(r0)
            l.C11233.m27799(r0)
            int r2 = l.C3016.m9241(r0)
            r4 = -1
            if (r2 != r4) goto Lb3
            int r2 = r0.length()
        Lb3:
            android.widget.EditText r0 = l.ViewOnClickListenerC19121.m44110(r6)
            if (r0 == 0) goto Ldd
            r4 = 0
            r0.setSelection(r4, r2)
            android.widget.EditText r0 = l.ViewOnClickListenerC19121.m44110(r6)
            if (r0 == 0) goto Ld9
            l.C4925.m14334(r0)
            int r0 = r5.getBindingAdapterPosition()
            l.ViewOnClickListenerC19121.m44115(r6, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r2
            long r0 = r0 + r2
            l.ViewOnClickListenerC19121.m44090(r6, r0)
            return
        Ld9:
            l.C11233.m27804(r3)
            throw r1
        Ldd:
            l.C11233.m27804(r3)
            throw r1
        Le1:
            l.C11233.m27804(r3)
            throw r1
        Le5:
            l.ᩳۜܳ r0 = r5.m26406()
            java.lang.String r0 = r0.getPath()
            java.lang.String r2 = "getPath(...)"
            l.C11233.m27803(r0, r2)
            l.C9068.m23402(r0, r1)
            l.ᩳۜܳ r0 = r5.m26406()
            java.lang.String r0 = r0.getPath()
            l.C11233.m27803(r0, r2)
            l.ViewOnClickListenerC19121.m44092(r6, r0)
            return
        L104:
            java.lang.String r6 = "swipeRefreshLayout"
            l.C11233.m27804(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC10507.onClick(android.view.View):void");
    }
}
