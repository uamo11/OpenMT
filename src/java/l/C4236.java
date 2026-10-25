package l;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.util.Consumer;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: P676 */
/* renamed from: l.ۘ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4236 implements InterfaceC2343, InterfaceC19764, InterfaceC0979, InterfaceC8491, InterfaceC16610, Consumer, InterfaceC7997, InterfaceC14930, InterfaceC6403 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13745;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13746;

    public /* synthetic */ C4236(int i, Object obj) {
        this.f13745 = i;
        this.f13746 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* renamed from: accept, reason: collision with other method in class */
    public void mo12762accept(Object obj) {
        ((PluginProgressBar) this.f13746).setSecondaryProgress(((Integer) obj).intValue());
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        ActivityC10582.m26594((ActivityC10582) this.f13746, menuItem);
        return true;
    }

    @Override // l.InterfaceC8491
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public View mo12760() {
        return ((View) this.f13746).findViewById(R.id.MT_Protector_res_0x7f0a04cf);
    }

    @Override // l.InterfaceC2343
    /* renamed from: ֫ */
    public void mo6264(int i) {
        AbstractC3817 abstractC3817;
        switch (this.f13745) {
            case 1:
                abstractC3817 = (C13697) this.f13746;
                break;
            default:
                abstractC3817 = (C13468) this.f13746;
                break;
        }
        abstractC3817.mo11538(i);
    }

    @Override // l.InterfaceC0979
    /* renamed from: ֫ */
    public void mo3444(int i, int i2, int i3, int i4) {
        C7473.m20025((C7473) this.f13746, i2, i3, i4);
    }

    @Override // l.InterfaceC19764
    /* renamed from: ֫ */
    public void mo4668(Intent intent, int i) {
        switch (this.f13745) {
            case 0:
                ActivityC21107.m48052((ActivityC21107) this.f13746, i, intent);
                break;
            default:
                AbstractActivityC3346.m10212((AbstractActivityC3346) this.f13746, i);
                break;
        }
    }

    @Override // l.InterfaceC6403
    /* renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        C19914.m45825((C19914) this.f13746, abstractC5698);
    }

    @Override // l.InterfaceC8491
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ InterfaceC2494 mo12761() {
        return null;
    }

    @Override // l.InterfaceC6403
    /* renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC16610
    public C21610 onApplyWindowInsets(View view, C21610 c21610) {
        ViewGroup viewGroup = (ViewGroup) this.f13746;
        int i = ViewOnClickListenerC0380.f1796;
        C11007 m48815 = c21610.m48815(1);
        C11007 m488152 = c21610.m48815(2);
        C11007 m488153 = c21610.m48815(8);
        viewGroup.setPadding(0, m48815.f33111, 0, 0);
        view.setPadding(0, 0, 0, Math.max(m488152.f33108, m488153.f33108));
        return c21610;
    }

    @Override // l.InterfaceC7997
    public List accept(Object obj) {
        C15051 c15051 = (C15051) this.f13746;
        try {
            String mo4946 = ((InterfaceC1438) obj).mo4946();
            if (mo4946 == null) {
                return null;
            }
            C12164 c12164 = c15051.get();
            c12164.m29615reset((CharSequence) mo4946);
            if (!C5898.m16539(c12164)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            do {
                C19287 c19287 = new C19287(0);
                c19287.f60684 = c12164.start();
                int end = c12164.end();
                c19287.f60685 = end;
                c19287.m44468(c19287.f60684, end, (CharSequence) mo4946);
                arrayList.add(c19287);
                if (!C5898.m16539(c12164)) {
                    break;
                }
            } while (arrayList.size() < 2000);
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
