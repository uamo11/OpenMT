package l;

import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.PluginTextView;
import bin.mt.plugin.api.util.Consumer;
import java.io.IOException;

/* compiled from: Y20N */
/* renamed from: l.᩶᩶᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C20407 implements InterfaceC7961, InterfaceC4644, Consumer, InterfaceC3969 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65844;

    public /* synthetic */ C20407(Object obj) {
        this.f65844 = obj;
    }

    public /* synthetic */ C20407(C0425 c0425, C10957 c10957, C6723 c6723, IOException iOException, boolean z) {
        this.f65844 = c6723;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* renamed from: accept */
    public void mo12762accept(Object obj) {
        ((PluginTextView) this.f65844).setText((CharSequence) obj);
    }

    @Override // l.InterfaceC3969
    /* renamed from: ۧ */
    public String mo12011() {
        String m17421;
        m17421 = r0.m17421(r0.f19514, ((C6306) this.f65844).f19502);
        return m17421;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).mo3867((C6723) this.f65844);
    }

    @Override // l.InterfaceC4644
    /* renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40782((InterfaceC11098) this.f65844);
    }
}
