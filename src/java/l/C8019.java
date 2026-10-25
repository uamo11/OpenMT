package l;

import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: TAHS */
/* renamed from: l.۠ۜ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8019 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f24756;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f24757;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f24758;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16560 f24759;

    public C8019(C16560 c16560, List list) {
        this.f24759 = c16560;
        this.f24757 = list;
        boolean z = false;
        this.f24758 = list.size() > 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                break;
            }
        }
        this.f24756 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21340(RunnableC21134 runnableC21134) {
        List list = this.f24757;
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        C16560 c16560 = this.f24759;
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d01cd);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0074);
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0075);
        String m40576 = C17283.m40576(this.f24758 ? System.currentTimeMillis() : ((InterfaceC17889) list.get(0)).getTime());
        final C19309 c19309 = new C19309(this, c16560.m39056(), m10216, checkBox, checkBox2, runnableC21134);
        c19309.m31258(R.string.MT_Protector_res_0x7f1205eb);
        c19309.m31250((CharSequence) m40576);
        c19309.m31265(C17283.m40571());
        c19309.m31244();
        c19309.m31276(4);
        c19309.m31279(6);
        c19309.m31249(new C1524(true));
        c19309.m31266(true);
        c19309.m31282().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۜ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractDialogInterfaceOnClickListenerC12849.this.m31250((CharSequence) C17283.m40576(System.currentTimeMillis()));
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21335(C8019 c8019, RunnableC21134 runnableC21134, long j, boolean z, boolean z2) {
        new C0963(c8019, (AbstractC3163) c8019.f24759.m39044().mo6020(), z, z2, j, runnableC21134).m20274();
    }
}
