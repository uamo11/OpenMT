package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import l.C14788;
import l.C17611;

/* compiled from: 51RR */
/* loaded from: classes.dex */
public abstract class c extends Dialog {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17611 f905;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    @SuppressLint({"NewApi"})
    public final WebChromeClient f906;

    /* renamed from: ֫ */
    public abstract void mo924(String str);

    public c(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f906 = new C14788(this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f905 = new C17611();
    }
}
