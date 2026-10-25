package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* compiled from: 81J9 */
/* renamed from: l.ܿܿۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17490 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53434;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53435;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53436;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53437;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53438;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53439;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f53440;

    public C17490(C2978 c2978, C2978 c29782, C2978 c29783, C2978 c29784, C2978 c29785, C2978 c29786) {
        this.f53436 = c2978;
        this.f53438 = c29782;
        this.f53434 = c29783;
        this.f53437 = c29784;
        this.f53435 = c29785;
        this.f53440 = c29786;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f53439) {
            return;
        }
        this.f53439 = true;
        int id = compoundButton.getId();
        C2978 c2978 = this.f53435;
        C2978 c29782 = this.f53437;
        C2978 c29783 = this.f53434;
        C2978 c29784 = this.f53438;
        C2978 c29785 = this.f53436;
        if (id == R.id.MT_Protector_res_0x7f0a0410) {
            c29785.setChecked(z);
            c29784.setChecked(z);
            c29783.setChecked(z);
            c29782.setChecked(z);
            c2978.setChecked(z);
        } else {
            boolean z2 = c29785.isChecked() && c29784.isChecked() && c29783.isChecked() && c29782.isChecked() && c2978.isChecked();
            C2978 c29786 = this.f53440;
            if (c29786.isChecked() != z2) {
                c29786.setChecked(z2);
            }
        }
        this.f53439 = false;
    }
}
