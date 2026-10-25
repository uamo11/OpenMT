package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: E1KB */
/* renamed from: l.᩸᩻ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C21912 extends ComponentCallbacksC9205 implements InterfaceC15287, InterfaceC8233 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3764 f70157;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13132 f70158;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f70159;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5684 f70160;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12366 f70161;

    public C21912() {
        super(R.layout.MT_Protector_res_0x7f0d01e2);
        this.f70159 = Collections.EMPTY_LIST;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70157 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        C5684 c5684 = new C5684(this);
        this.f70160 = c5684;
        c5684.m33259((InterfaceC15287) this);
        this.f70160.m33258((InterfaceC8233) this);
        this.f70157.m11419().m1668(this, new C14281(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۘ᩻ۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49317(final C21912 c21912, C12366 c12366) {
        c21912.f70161 = c12366;
        c12366.m30040(c21912, new C1700(c21912, 2));
        c12366.m30041(c21912, (C4273) new InterfaceC1008() { // from class: l.ۘ᩻ۢ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C21912.m49316(C21912.this, (Set) obj);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49315(C21912 c21912, List list) {
        c21912.f70159 = list;
        c21912.f70160.notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49316(C21912 c21912, Set set) {
        HashSet m33273 = c21912.f70160.m33273();
        c21912.f70160.m33252(1, set);
        c21912.f70160.m33255(m33273);
        c21912.f70160.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f70158 = c13132;
        c13132.setTag("RecyclerView1");
        this.f70158.setAdapter(this.f70160);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70158.setAdapter(null);
        this.f70158 = null;
    }

    @Override // l.InterfaceC15287
    /* renamed from: ۧ */
    public final void mo16606(C16971 c16971) {
        String m39805 = c16971.m39805();
        C4925.m14316(new RunnableC23495(2, this, m39805), 500L);
        ((ActivityC17169) requireActivity()).m40343(m39805, (C19287) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49314(C21912 c21912, String str) {
        C12366 c12366 = c21912.f70161;
        if (c12366 != null) {
            c12366.m30026(str);
        }
    }

    @Override // l.InterfaceC8233
    /* renamed from: ֫ */
    public final boolean mo16605(final C16971 c16971) {
        if (!c16971.m39807()) {
            return false;
        }
        C21282 c21282 = new C21282(requireContext(), c16971.m39802(), 0);
        final C23155 c23155 = new C23155(c21282, c16971.m39805(), true);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120530, 0, R.string.MT_Protector_res_0x7f120530);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1201be, 0, R.string.MT_Protector_res_0x7f1201be);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۖ᩻ۢ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C21912.m49318(C21912.this, c23155, c16971, menuItem);
                return true;
            }
        });
        this.f70158.suppressLayout(true);
        c21282.m48301(new C2949(6, this));
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49318(C21912 c21912, C23155 c23155, C16971 c16971, MenuItem menuItem) {
        if (c23155.m51333(menuItem)) {
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f120530) {
            c21912.f70157.m11383(c16971.m39805());
            return;
        }
        ActivityC17169 activityC17169 = (ActivityC17169) c21912.requireActivity();
        try {
            String m30054 = c21912.f70161.m30054(c16971.m39805());
            String m40362 = activityC17169.m40362(c16971.m39805());
            C2079 m6839 = C2079.m6839();
            m6839.m6842(R.string.MT_Protector_res_0x7f1202ad, m30054);
            m6839.m6846(R.string.MT_Protector_res_0x7f1202aa, m40362);
            m6839.m6849(".smali");
            m6839.m6840();
            m6839.m6847(c16971.m39805());
            m6839.m6841(R.string.MT_Protector_res_0x7f1201be);
            m6839.m6848(c16971.m39801());
            m6839.m6843(C9523.m24404(c16971.m39805()) + ".smali");
            m6839.m6845(activityC17169);
        } catch (IOException e) {
            activityC17169.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
