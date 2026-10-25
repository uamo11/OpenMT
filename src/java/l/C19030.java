package l;

import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;

/* compiled from: 94PF */
/* renamed from: l.ᩴ᩸ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19030 extends AbstractViewOnClickListenerC1201 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f59948;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59949;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f59950;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0684 f59951;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11813 f59952;

    @Override // l.AbstractC11580
    /* renamed from: ۧ */
    public final int mo6259() {
        return 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19030(C0684 c0684, Main main, AbstractC15440 abstractC15440) {
        super(main);
        this.f59951 = c0684;
        this.f59952 = C19883.f64179.f64248;
        this.f59950 = abstractC15440.getName();
        String mo23554 = abstractC15440.mo23554();
        this.f59949 = mo23554;
        int indexOf = mo23554.indexOf("Android/data/");
        if (indexOf == -1) {
            this.f59948 = mo23554;
        } else {
            this.f59948 = mo23554.substring(indexOf);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0684 c0684 = this.f59951;
        if (c0684.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        AbstractC15440 m39866 = C16999.m39866(this.f59949, new String[0]);
        if (m39866.mo23120()) {
            String mo23554 = m39866.mo23554();
            int i = ActivityC17169.f52595;
            Main main = this.f34527;
            Intent intent = new Intent(main, (Class<?>) ActivityC17169.class);
            intent.putExtra("projectPath", mo23554);
            main.startActivity(intent);
            return;
        }
        c0684.m2775();
    }
}
