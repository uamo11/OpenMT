package l;

import bin.mt.plus.R;

/* compiled from: I1KV */
/* renamed from: l.ۘܰ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3989 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12651;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f12652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3989(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str) {
        super(abstractActivityC3346, -1);
        this.f12652 = viewOnClickListenerC21628;
        this.f12651 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C19452 c19452;
        C19452 c194522;
        C19452 c194523;
        C3764 c3764;
        C19452 c194524;
        String lowerCase = m31260().toLowerCase();
        if (lowerCase.isEmpty()) {
            m31262();
            return;
        }
        if (!lowerCase.matches("[a-z0-9^\\-]+")) {
            m31263(R.string.MT_Protector_res_0x7f1203ae);
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.f12651;
        sb.append(str);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/type-info");
        String sb2 = sb.toString();
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f12652;
        c19452 = viewOnClickListenerC21628.f69432;
        if (c19452.m44838(sb2)) {
            m31263(R.string.MT_Protector_res_0x7f1206b1);
            return;
        }
        c194522 = viewOnClickListenerC21628.f69432;
        C18683 m44842 = c194522.m44842(str);
        int size = m44842.size() + 1;
        while (m44842.contains(size)) {
            size++;
        }
        c194523 = viewOnClickListenerC21628.f69432;
        int m44817 = c194523.m44817(127, str);
        try {
            c194524 = viewOnClickListenerC21628.f69432;
            c194524.m44819(sb2, "<?xml version='1.0' encoding='utf-8' ?>\n" + String.format("<type id=\"0x%02x\">\n", Integer.valueOf(size)) + String.format("    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n", Integer.valueOf(m44817), Integer.valueOf(size)) + "</type>\n");
            viewOnClickListenerC21628.m48890();
            viewOnClickListenerC21628.m48891(sb2);
            m31262();
        } catch (Exception e) {
            c3764 = viewOnClickListenerC21628.f69427;
            c3764.m11384((Throwable) e);
        }
    }
}
