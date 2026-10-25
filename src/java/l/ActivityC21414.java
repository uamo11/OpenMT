package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: J8WQ */
/* renamed from: l.᩸ۜۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC21414 extends AbstractActivityC3346 {

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68968 = 0;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "TutorialMarkdownActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d0058);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC18759(3, this));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        byte[] byteArrayExtra = intent.getByteArrayExtra("markdown");
        if (stringExtra == null || byteArrayExtra == null) {
            finish();
            return;
        }
        try {
            String m11701 = C3878.m11701(byteArrayExtra);
            setTitle(stringExtra);
            C20500.m46962((Context) this, false).mo38090((TextView) m10241(R.id.textView), m11701);
        } catch (RuntimeException unused) {
            finish();
        }
    }
}
