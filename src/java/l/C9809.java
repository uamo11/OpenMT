package l;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alipay.sdk.m.n.b;

/* compiled from: S8XW */
/* renamed from: l.ۢ᩶ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9809 implements InterfaceC21098 {
    @Override // l.InterfaceC21098
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo24842(View view, String str) {
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = parse.buildUpon().scheme(b.a).build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
