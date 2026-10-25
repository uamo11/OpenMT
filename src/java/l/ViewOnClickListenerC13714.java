package l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 31PG */
/* renamed from: l.ܰۡۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC13714 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16742 f40919;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f40920;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f40921;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f40922;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f40923;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f40924;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView f40925;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC13714(ActivityC7365 activityC7365, ViewGroup viewGroup) {
        super(LayoutInflater.from(activityC7365).inflate(R.layout.MT_Protector_res_0x7f0d013d, viewGroup, false));
        this.f40922 = activityC7365;
        this.f40925 = (ImageView) this.itemView.findViewById(R.id.icon);
        this.f40924 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0072);
        this.f40923 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a041e);
        this.f40920 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a056b);
        this.f40921 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a062e);
        this.itemView.setOnClickListener(this);
        this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩸ۡۢ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final ViewOnClickListenerC13714 viewOnClickListenerC13714 = ViewOnClickListenerC13714.this;
                C19258 buildDialog = viewOnClickListenerC13714.f40922.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f1200b4);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f1205ca, new DialogInterface.OnClickListener() { // from class: l.᩹ۡۢ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        new C22887(ViewOnClickListenerC13714.this).m20274();
                    }
                });
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog.m44438();
                return true;
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16742 c16742 = this.f40919;
        int i = c16742.f51392;
        ActivityC7365 activityC7365 = this.f40922;
        if (i == -4) {
            C19258 buildDialog = activityC7365.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f1200b3);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֡ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    new C22887(ViewOnClickListenerC13714.this).m20274();
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
            return;
        }
        if (i == -3) {
            C19258 buildDialog2 = activityC7365.buildDialog();
            buildDialog2.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog2.m44416(R.string.MT_Protector_res_0x7f1200b8);
            buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۠ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = ViewOnClickListenerC13714.this;
                    ServiceC8982.m23216(viewOnClickListenerC13714.f40919);
                    C16742 c167422 = viewOnClickListenerC13714.f40919;
                    c167422.f51392 = -2;
                    ActivityC7365.m19799(viewOnClickListenerC13714.f40922, c167422, viewOnClickListenerC13714.f40920);
                }
            });
            buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog2.m44438();
            return;
        }
        if (i == 2) {
            m32968(c16742.f51393);
            return;
        }
        if (i != 3) {
            return;
        }
        C19258 buildDialog3 = activityC7365.buildDialog();
        buildDialog3.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog3.m44416(R.string.MT_Protector_res_0x7f1200b7);
        buildDialog3.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܶۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                new C11599(ViewOnClickListenerC13714.this).m20274();
            }
        });
        buildDialog3.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog3.m44438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32968(final String str) {
        final AbstractC15440 m40796 = C17448.m40796(this.f40919);
        boolean mo23120 = m40796.mo23120();
        ActivityC7365 activityC7365 = this.f40922;
        if (mo23120) {
            C19258 buildDialog = activityC7365.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44424(activityC7365.getString(R.string.MT_Protector_res_0x7f12009c, m40796.mo23554()));
            buildDialog.m44442(R.string.MT_Protector_res_0x7f1204b2, new DialogInterface.OnClickListener() { // from class: l.᩶ۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = ViewOnClickListenerC13714.this;
                    C20549.m47080(viewOnClickListenerC13714.f40922, m40796, viewOnClickListenerC13714.f40919.f51393);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f120530, new DialogInterface.OnClickListener() { // from class: l.ۙۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC7365 activityC73652 = ViewOnClickListenerC13714.this.f40922;
                    String mo23554 = m40796.mo23554();
                    int i2 = ActivityC7365.f22615;
                    activityC73652.getClass();
                    Main.m63(activityC73652, mo23554);
                }
            });
            buildDialog.m44440(R.string.MT_Protector_res_0x7f1200b6, new DialogInterface.OnClickListener() { // from class: l.ۗۡۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC13714.m32970(ViewOnClickListenerC13714.this, m40796, str);
                }
            });
            buildDialog.m44438();
            return;
        }
        View m10216 = activityC7365.m10216(R.layout.MT_Protector_res_0x7f0d00e2);
        final InterfaceC6746 m22886 = C8863.m22886(activityC7365, m10216, str);
        C19258 buildDialog2 = activityC7365.buildDialog();
        buildDialog2.m44421(m10216);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.۬ۡۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC6746.this.mo18363();
            }
        });
        buildDialog2.m44419(new DialogInterface.OnCancelListener() { // from class: l.۫ۡۢ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                InterfaceC6746.this.mo18363();
            }
        });
        final DialogInterfaceC0206 m44438 = buildDialog2.m44438();
        C8960.m23097(m44438);
        final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0524);
        m22886.mo28354(new Runnable() { // from class: l.ۚۡۢ
            @Override // java.lang.Runnable
            public final void run() {
                C8863.m22892(textView, m22886.mo28356());
                m44438.m1447().setEnabled(!r0.mo28357());
            }
        });
        final C14506 c14506 = new C14506(m10216);
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۡۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0206 dialogInterfaceC0206 = m44438;
                if (dialogInterfaceC0206.m1442()) {
                    InterfaceC6746 interfaceC6746 = m22886;
                    if (interfaceC6746.mo28355()) {
                        return;
                    }
                    C16955 mo28353 = interfaceC6746.mo28353();
                    C11667 m22888 = C8863.m22888(mo28353);
                    boolean mo32195 = m22888.m28557().mo32195();
                    ViewOnClickListenerC13714 viewOnClickListenerC13714 = ViewOnClickListenerC13714.this;
                    String str2 = str;
                    if (mo32195) {
                        boolean z = m22888.m28557() instanceof C22435;
                        C14506 c145062 = c14506;
                        if (!z || c145062.m34619(dialogInterfaceC0206)) {
                            C8863.m22894(new C10188(viewOnClickListenerC13714, z, c145062, dialogInterfaceC0206, interfaceC6746, mo28353, str2, m22888, textView), m22888.m28557(), viewOnClickListenerC13714.f40922);
                            return;
                        }
                        return;
                    }
                    interfaceC6746.mo18361(mo28353);
                    dialogInterfaceC0206.dismiss();
                    new C5954(viewOnClickListenerC13714, m22888, str2).m20274();
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32970(ViewOnClickListenerC13714 viewOnClickListenerC13714, AbstractC15440 abstractC15440, String str) {
        abstractC15440.mo23552();
        viewOnClickListenerC13714.m32968(str);
    }
}
