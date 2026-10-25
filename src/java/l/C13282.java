package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* compiled from: J7R3 */
/* renamed from: l.۬ᩳܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13282 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f39764;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39765;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FrameLayout f39766;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12577 f39767;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39768;

    public C13282(C12577 c12577, FrameLayout frameLayout, String str, String str2, JSONObject jSONObject) {
        this.f39767 = c12577;
        this.f39766 = frameLayout;
        this.f39765 = str;
        this.f39768 = str2;
        this.f39764 = jSONObject;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        FrameLayout frameLayout = this.f39766;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector_res_0x7f0a0442, null);
        C12577 c12577 = this.f39767;
        C6227 c6227 = (C6227) c12577.f37922.get(i);
        C10220 m17151 = c6227.m17151();
        PluginContext m39304 = ((C16709) m17151.f30697).m39304();
        ActivityC0477 activityC0477 = c12577.f37923;
        try {
            PluginView buildOptionsView = ((TextEditorFunction) m17151.f30698).buildOptionsView(new C17979(m39304, activityC0477), c6227.m17150(this.f39765, this.f39768) ? this.f39764 : null);
            if (buildOptionsView != null) {
                frameLayout.setTag(R.id.MT_Protector_res_0x7f0a0442, buildOptionsView);
                frameLayout.addView(((C7312) buildOptionsView).m19595());
            }
        } catch (Throwable th) {
            ((C16709) m17151.f30697).m39290(th);
            activityC0477.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        FrameLayout frameLayout = this.f39766;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector_res_0x7f0a0442, null);
    }
}
