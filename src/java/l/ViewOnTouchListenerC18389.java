package l;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 89CO */
/* renamed from: l.ᩳ᩻ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC18389 extends AbstractC21212 implements View.OnTouchListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f57103;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f57104;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f57105;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f57106;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC18389(ActivityC9923 activityC9923, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC9923).inflate(R.layout.MT_Protector_res_0x7f0d0157, viewGroup, false));
        this.f57104 = activityC9923;
        this.f57105 = (ImageView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0216);
        this.f57103 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0217);
        this.f57106 = (ImageView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a050b);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.drag);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
    }

    @Override // l.AbstractC21212
    /* renamed from: ֫ */
    public final void mo19102(AbstractC13882 abstractC13882) {
        abstractC13882.getClass();
        if (abstractC13882 instanceof C7533) {
            C7533 mo20218 = abstractC13882.mo20218();
            Drawable drawable = mo20218.f23178;
            AbstractC2867 abstractC2867 = mo20218.f23177;
            this.f57105.setImageDrawable(drawable);
            this.f57103.setText(mo20218.f23179);
            String mo8778 = abstractC2867.mo8778();
            mo8778.getClass();
            boolean equals = mo8778.equals("builtin:systemTranslate");
            View.OnLongClickListener onLongClickListener = null;
            ImageView imageView = this.f57106;
            if (equals) {
                imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08023d);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.֫᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayList = (ArrayList) C14714.m35009();
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        String string = ApplicationC20075.f65008.getString("stid", null);
                        int[] iArr = {0};
                        if (!TextUtils.isEmpty(string)) {
                            int i = 0;
                            while (true) {
                                if (i >= arrayList.size()) {
                                    break;
                                }
                                if (((InterfaceC16831) arrayList.get(i)).mo39604().equals(string)) {
                                    iArr[0] = i;
                                    break;
                                }
                                i++;
                            }
                        }
                        PackageManager m14320 = C4925.m14320();
                        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            charSequenceArr[i2] = ((InterfaceC16831) arrayList.get(i2)).mo39605(m14320);
                        }
                        C19258 buildDialog = ViewOnTouchListenerC18389.this.f57104.buildDialog();
                        buildDialog.m44433(R.string.MT_Protector_res_0x7f120a19);
                        buildDialog.m44429(charSequenceArr, iArr[0], new DialogInterfaceOnClickListenerC8534(1, iArr));
                        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC16474(1, arrayList, iArr));
                        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                        buildDialog.m44438();
                    }
                });
            } else if (mo8778.equals("builtin:function")) {
                imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080204);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۧ᩻ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C19258 buildDialog = ViewOnTouchListenerC18389.this.f57104.buildDialog();
                        buildDialog.m44433(R.string.MT_Protector_res_0x7f120414);
                        buildDialog.m44416(R.string.MT_Protector_res_0x7f1203f1);
                        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                        buildDialog.m44438();
                    }
                });
            } else if (abstractC2867 instanceof C4278) {
                final C4278 c4278 = (C4278) abstractC2867;
                imageView.setImageResource(R.drawable.MT_Protector_res_0x7f080226);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickListenerC0174(1, c4278));
                onLongClickListener = new View.OnLongClickListener() { // from class: l.ܽ᩻ܿ
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        String m14327;
                        C4278 c42782 = c4278;
                        C16709 m32219 = C13265.m32219(c42782.m12862());
                        if (m32219 != null) {
                            m14327 = m32219.m39302();
                        } else {
                            m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f120758);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c42782.m12862()).append((CharSequence) "\n");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) c42782.m12863());
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 18);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 18);
                        C19258 buildDialog = ViewOnTouchListenerC18389.this.f57104.buildDialog();
                        buildDialog.m44436(m14327);
                        buildDialog.m44424(spannableStringBuilder);
                        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
                        C8960.m23095(buildDialog.m44438());
                        return true;
                    }
                };
            } else {
                imageView.setVisibility(8);
                imageView.setOnClickListener(null);
            }
            this.itemView.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1556 c1556;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        c1556 = this.f57104.f29998;
        c1556.m5326(this);
        return false;
    }
}
