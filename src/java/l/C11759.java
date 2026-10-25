package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.json.JSON;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;

/* compiled from: D77Z */
/* renamed from: l.ۨܳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11759 implements InterfaceC18862, InterfaceC4270, InterfaceC16348 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35098;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35099;

    public /* synthetic */ C11759(Object obj, Object obj2) {
        this.f35098 = obj;
        this.f35099 = obj2;
    }

    @Override // l.InterfaceC4270
    /* renamed from: ֫ */
    public C12936 mo12044(int i) {
        return C23047.m51218((C23047) this.f35098, (C9418) this.f35099, i);
    }

    @Override // l.InterfaceC16348
    /* renamed from: ֫ */
    public C3059 mo22666(String str, String str2, String str3) {
        return C3059.m9369(str, str2, "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, (String) this.f35098, "policyRevision", (String) this.f35099).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC18862
    /* renamed from: ۧ */
    public void mo6267(final AbstractC15440 abstractC15440) {
        boolean z;
        C16560 c16560 = (C16560) this.f35098;
        final InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f35099;
        final Main m39056 = c16560.m39056();
        int i = ActivityC10582.f31759;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC15440.mo27926());
            try {
                z = ((long) dataInputStream.readInt()) == 2135247942;
                try {
                    dataInputStream.close();
                } catch (Exception unused) {
                }
            } finally {
            }
        } catch (Exception unused2) {
            z = false;
        }
        String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1208f0);
        SpannableString spannableString = new SpannableString(((Object) m14327) + "\n" + C4925.m14327(R.string.MT_Protector_res_0x7f120b7d));
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70293), m14327.length() + 1, spannableString.length(), 17);
        spannableString.setSpan(new AbsoluteSizeSpan(C11266.m27880(12.0f)), m14327.length() + 1, spannableString.length(), 17);
        C19258 buildDialog = m39056.buildDialog();
        buildDialog.m44436(abstractC15440.getName());
        buildDialog.m44424(ApplicationC20075.f65008.getBoolean("ewrp", false) ? spannableString : m14327);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120311, new DialogInterface.OnClickListener() { // from class: l.᩹᩹ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC10582.f31759;
                int i4 = C19568.f63245;
                AbstractActivityC3346 abstractActivityC3346 = AbstractActivityC3346.this;
                Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC10582.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC15440.m36522());
                abstractActivityC3346.startActivity(intent);
                C9340.m24035(interfaceC17889, 2000);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f1202dd, new DialogInterface.OnClickListener() { // from class: l.֡᩹ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC10582.f31759;
                int i4 = C19568.f63245;
                AbstractActivityC3346 abstractActivityC3346 = AbstractActivityC3346.this;
                Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC16315.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(abstractC15440.m36522());
                abstractActivityC3346.startActivity(intent);
                C9340.m24035(interfaceC17889, 2000);
            }
        });
        buildDialog.m44440(R.string.MT_Protector_res_0x7f120949, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        if (z) {
            m44438.m1446().setEnabled(false);
        }
        C8960.m23095(m44438);
        m44438.m1448().setOnClickListener(new ViewOnClickListenerC22294(m44438, spannableString, m14327, 2));
    }
}
