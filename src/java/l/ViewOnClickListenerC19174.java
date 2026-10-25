package l;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: W5L3 */
/* renamed from: l.᩵ۖۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC19174 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60421;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60422;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5062 f60423;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f60424;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f60425;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f60426;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f60427;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7569 f60428;

    public ViewOnClickListenerC19174(C5062 c5062, View view) {
        this.f60423 = c5062;
        this.f60424 = (TextView) view.findViewById(R.id.textView1);
        View findViewById = view.findViewById(R.id.MT_Protector_res_0x7f0a067e);
        this.f60427 = findViewById;
        this.f60426 = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a0286);
        findViewById.setOnClickListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44255(int i, String str) {
        this.f60422 = 0;
        this.f60421 = i;
        this.f60425 = str;
        ImageView imageView = this.f60426;
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0802a9);
        View view = this.f60427;
        view.setVisibility(0);
        view.setClickable(true);
        if (str.length() > 200) {
            str = str.substring(0, 200);
        }
        TextView textView = this.f60424;
        textView.setText(str);
        textView.setTextColor(C21943.f70275);
        imageView.setColorFilter(C21943.f70284);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44254(int i) {
        this.f60422 = i;
        TextView textView = this.f60424;
        ImageView imageView = this.f60426;
        if (i == 3) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0802ab);
            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector_res_0x7f1202dd));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setTextColor(C21943.f70275);
            imageView.setColorFilter(C21943.f70284);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0802ac);
            textView.setText(R.string.MT_Protector_res_0x7f1206ad);
            textView.setTextColor(C21943.f70257);
            imageView.setColorFilter(C21943.f70257);
        } else if (i == 5) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f0802aa);
            textView.setText(R.string.MT_Protector_res_0x7f1205b2);
            textView.setTextColor(C21943.f70263);
            imageView.setColorFilter(C21943.f70263);
        } else {
            throw new IllegalArgumentException();
        }
        View view = this.f60427;
        view.setVisibility(0);
        view.setClickable(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0828 c0828;
        C0828 c08282;
        if (this.f60422 == 0) {
            C5062 c5062 = this.f60423;
            c0828 = c5062.f15919;
            c0828.m3090(this.f60421);
            c08282 = c5062.f15919;
            c08282.m3094();
            C5062.m14596(c5062);
            c5062.m14613();
        }
    }
}
