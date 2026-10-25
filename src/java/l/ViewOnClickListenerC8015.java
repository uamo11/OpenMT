package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 05XT */
/* renamed from: l.۠ۜᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC8015 implements View.OnClickListener, TextWatcher {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f24745;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EditText f24746;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23537 f24747;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f24748;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f24749;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EditText f24750;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f24751;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f24752;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f24753;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC8015(ActivityC6604 activityC6604) {
        this.f24752 = activityC6604;
        this.f24747 = activityC6604.f20336;
        View m10216 = activityC6604.m10216(R.layout.MT_Protector_res_0x7f0d0082);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f24746 = editText;
        this.f24745 = (EditText) m10216.findViewById(R.id.editText2);
        EditText editText2 = (EditText) m10216.findViewById(R.id.editText3);
        this.f24750 = editText2;
        this.f24748 = (TextView) m10216.findViewById(R.id.textView3);
        this.f24749 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d3);
        editText2.addTextChangedListener(this);
        editText.addTextChangedListener(new C0959(this));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f24753 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21334() {
        C20317 c20317 = this.f24747.f75574;
        this.f24751 = c20317.getTypeName().equals("style");
        this.f24746.setText(String.format("%04X", Integer.valueOf(c20317.mo2878())));
        EditText editText = this.f24745;
        editText.requestFocus();
        boolean z = this.f24751;
        View view = this.f24749;
        if (z) {
            view.setVisibility(0);
            this.f24750.setText("00000000");
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f24753;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        ViewOnClickListenerC14813.m35215(this.f24748);
        C4925.m14329(editText);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (r0.equals("interpolator") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01dc, code lost:
    
        r0 = "res/xxxx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (r0.equals("style") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        if (r0.equals("menu") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        if (r0.equals("bool") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
    
        r2.m43639(0, 18, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        if (r0.equals("anim") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        if (r0.equals(org.simpleframework.xml.stream.DocumentReader.RESERVED) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        if (r0.equals("raw") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        if (r0.equals("id") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
    
        if (r0.equals("animator") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a5, code lost:
    
        if (r0.equals("drawable") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        if (r0.equals("mipmap") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
    
        if (r0.equals("layout") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r0.equals("transition") != false) goto L104;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8015.onClick(android.view.View):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String obj = editable.toString();
        if (C9896.m24990(obj)) {
            str = this.f24747.f75569.m30774(C9896.m24993(obj));
        } else {
            str = null;
        }
        TextView textView = this.f24748;
        if (str != null) {
            textView.setText(str);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }
}
