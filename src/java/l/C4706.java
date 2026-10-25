package l;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: I1KV */
/* renamed from: l.ۙܳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4706 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public CheckBox f14936;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CheckBox f14937;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public CheckBox f14938;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f14939;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16971 f14940;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f14941;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4706(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, final AbstractActivityC3346 abstractActivityC33462, C16971 c16971) {
        super(abstractActivityC3346, -1);
        C12366 c12366;
        this.f14939 = viewOnClickListenerC7528;
        this.f14941 = abstractActivityC33462;
        this.f14940 = c16971;
        FrameLayout m31286 = m31286();
        m31286.setVisibility(0);
        LayoutInflater.from(abstractActivityC33462).inflate(R.layout.MT_Protector_res_0x7f0d0133, m31286);
        CheckBox checkBox = (CheckBox) m31286.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        this.f14936 = checkBox;
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("dex_plus_rename_not_exists", true));
        CheckBox checkBox2 = (CheckBox) m31286.findViewById(R.id.checkBox2);
        this.f14937 = checkBox2;
        checkBox2.setChecked(!c16971.m39805().matches("[a-zA-Z]{1,5}"));
        CheckBox checkBox3 = (CheckBox) m31286.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f14938 = checkBox3;
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("dprs", true));
        m31286.findViewById(R.id.MT_Protector_res_0x7f0a0257).setOnClickListener(new ViewOnClickListenerC21640(0, abstractActivityC33462));
        m31286.findViewById(R.id.MT_Protector_res_0x7f0a0259).setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܳۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractActivityC3346.this.m10217(R.string.MT_Protector_res_0x7f12042f, R.string.MT_Protector_res_0x7f120630, false);
            }
        });
        if (c16971.m39807()) {
            checkBox.setVisibility(8);
            m31286.findViewById(R.id.MT_Protector_res_0x7f0a0257).setVisibility(8);
            String str = c16971.m39805() + "$";
            c12366 = viewOnClickListenerC7528.f23168;
            Iterator it = c12366.m30063().iterator();
            while (it.hasNext()) {
                if (((C18011) it.next()).f56169.startsWith(str)) {
                    return;
                }
            }
            this.f14938.setVisibility(8);
            return;
        }
        checkBox3.setVisibility(8);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        C12366 c123664;
        String m31260 = m31260();
        if (!C9679.m24615((CharSequence) m31260)) {
            m31260 = C9679.m24610(C9679.m24618(m31260));
        }
        if (m31260.isEmpty()) {
            m31262();
            return;
        }
        C16971 c16971 = this.f14940;
        boolean m39807 = c16971.m39807();
        CheckBox checkBox = this.f14937;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f14939;
        if (m39807) {
            c123663 = viewOnClickListenerC7528.f23168;
            if (c123663.m30058(m31260)) {
                m31251(viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f12016e, m31260));
                return;
            }
            String m39805 = c16971.m39805();
            HashMap hashMap = new HashMap();
            hashMap.put(m39805, m31260);
            CheckBox checkBox2 = this.f14938;
            if (checkBox2.getVisibility() == 0) {
                if (checkBox2.isChecked()) {
                    String m37867 = C16014.m37867(m39805, "$");
                    c123664 = viewOnClickListenerC7528.f23168;
                    Iterator it = c123664.m30063().iterator();
                    while (it.hasNext()) {
                        String str = ((C18011) it.next()).f56169;
                        if (str.startsWith(m37867)) {
                            StringBuilder m19190 = C7166.m19190(m31260, "$");
                            m19190.append(str.substring(m37867.length()));
                            hashMap.put(str, m19190.toString());
                        }
                    }
                }
                ApplicationC20075.f65008.edit().putBoolean("dprs", checkBox2.isChecked()).apply();
            }
            Set singleton = Collections.singleton(m31260);
            boolean isChecked = checkBox.isChecked();
            m31262();
            new C20229(this, hashMap, null, isChecked, singleton).m20274();
            return;
        }
        String str2 = c16971.m39805() + "/";
        String concat = m31260.concat("/");
        HashMap hashMap2 = new HashMap();
        c12366 = viewOnClickListenerC7528.f23168;
        Iterator it2 = c12366.m30063().iterator();
        while (it2.hasNext()) {
            String str3 = ((C18011) it2.next()).f56169;
            if (str3.startsWith(str2)) {
                StringBuilder m15339 = C5368.m15339(concat);
                m15339.append(str3.substring(str2.length()));
                String sb = m15339.toString();
                c123662 = viewOnClickListenerC7528.f23168;
                if (c123662.m30058(sb)) {
                    m31251(viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f12016e, sb));
                    return;
                }
                hashMap2.put(str3, sb);
            }
        }
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        CheckBox checkBox3 = this.f14936;
        edit.putBoolean("dex_plus_rename_not_exists", checkBox3.isChecked()).apply();
        if (!checkBox3.isChecked()) {
            Set singleton2 = Collections.singleton(concat);
            boolean isChecked2 = checkBox.isChecked();
            m31262();
            new C20229(this, hashMap2, null, isChecked2, singleton2).m20274();
            return;
        }
        Set singleton3 = Collections.singleton(concat);
        C10220 c10220 = new C10220(str2, concat);
        boolean isChecked3 = checkBox.isChecked();
        m31262();
        new C20229(this, hashMap2, c10220, isChecked3, singleton3).m20274();
    }
}
