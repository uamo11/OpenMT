package l;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* compiled from: 98W2 */
/* renamed from: l.۟᩻ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7799 extends AbstractC15768 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f24097;

    public C7799(C12951 c12951) {
        super(6);
        this.f24097 = c12951.readInt();
    }

    @Override // l.AbstractC15768
    /* renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120757);
            new ViewOnClickListenerC0059(abstractActivityC3346);
            return;
        }
        PopupWindow popupWindow = new PopupWindow(abstractActivityC3346);
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d016e);
        ViewOnClickListenerC12033 viewOnClickListenerC12033 = new ViewOnClickListenerC12033(this, abstractActivityC3346, popupWindow, 0);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0399).setOnClickListener(viewOnClickListenerC12033);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a039c).setOnClickListener(viewOnClickListenerC12033);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a039b).setVisibility(8);
        final Window window = abstractActivityC3346.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.7f;
        window.addFlags(2);
        window.setAttributes(attributes);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setContentView(m10216);
        popupWindow.setAnimationStyle(R.style.MT_Protector_res_0x7f130188);
        popupWindow.showAtLocation(window.getDecorView(), 81, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩺᩻ۡ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Window window2 = window;
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.alpha = 1.0f;
                window2.clearFlags(2);
                window2.setAttributes(attributes2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20825(C7799 c7799, AbstractActivityC3346 abstractActivityC3346, PopupWindow popupWindow, View view) {
        int id = view.getId();
        int i = c7799.f24097;
        C5242 c5242 = C7094.f21798;
        C11233.m27805(abstractActivityC3346, "activity");
        C22470.f72773 = null;
        if (id == R.id.MT_Protector_res_0x7f0a0399) {
            popupWindow.dismiss();
            C5242 c52422 = C7094.f21798;
            c52422.mo1669((Object) null);
            c52422.m1667((InterfaceC23586) abstractActivityC3346);
            c52422.m1668(abstractActivityC3346, new C14148());
            C8058 c8058 = C8058.f24861;
            new C14854(abstractActivityC3346, i).m20274();
            return;
        }
        if (id != R.id.MT_Protector_res_0x7f0a039c) {
            throw new RuntimeException();
        }
        Application m14335 = C4925.m14335();
        C5242 c52423 = C22470.f72770;
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(m14335, C22470.m50420(), true);
        if (!createWXAPI.isWXAppInstalled() || createWXAPI.getWXAppSupportAPI() < 570425345) {
            C21374.m48459((CharSequence) "请安装最新版本的微信客户端");
            return;
        }
        popupWindow.dismiss();
        C5242 c52424 = C7094.f21798;
        c52424.mo1669((Object) null);
        c52424.m1667((InterfaceC23586) abstractActivityC3346);
        c52424.m1668(abstractActivityC3346, new C14148());
        C8058 c80582 = C8058.f24861;
        createWXAPI.registerApp(C22470.m50420());
        new C24027(abstractActivityC3346, i, createWXAPI).m20274();
    }
}
