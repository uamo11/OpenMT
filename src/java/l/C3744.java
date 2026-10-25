package l;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import bin.mt.plus.R;

/* compiled from: E72G */
/* renamed from: l.ۘۚ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3744 extends WebChromeClient {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0921 f11826;

    public C3744(ActivityC0921 activityC0921) {
        this.f11826 = activityC0921;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        boolean m3322;
        C5155 c5155;
        String str2;
        String url = webView.getUrl();
        ActivityC0921 activityC0921 = this.f11826;
        m3322 = activityC0921.m3322(url);
        if (m3322) {
            c5155 = activityC0921.f3541;
            str2 = c5155.f16106;
            activityC0921.setTitle(str2);
        } else {
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            activityC0921.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f11826.m3276(i, i < 100);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC0921 activityC0921 = this.f11826;
        String m3311 = ActivityC0921.m3311(activityC0921, str);
        if (m3311 == null || activityC0921.isFinishing() || activityC0921.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C19258 buildDialog = activityC0921.buildDialog();
        buildDialog.m44436(m3311);
        buildDialog.m44424(str2);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC21964(1, jsResult));
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.᩻ۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C19267 c19267 = ActivityC0921.f3517;
                jsResult.cancel();
            }
        });
        buildDialog.m44438();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC0921 activityC0921 = this.f11826;
        String m3311 = ActivityC0921.m3311(activityC0921, str);
        if (m3311 == null || activityC0921.isFinishing() || activityC0921.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C19258 buildDialog = activityC0921.buildDialog();
        buildDialog.m44436(m3311);
        buildDialog.m44424(str2);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܽۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19267 c19267 = ActivityC0921.f3517;
                jsResult.confirm();
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ᩳۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19267 c19267 = ActivityC0921.f3517;
                jsResult.cancel();
            }
        });
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ܿۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C19267 c19267 = ActivityC0921.f3517;
                jsResult.cancel();
            }
        });
        buildDialog.m44438();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        ActivityC0921 activityC0921 = this.f11826;
        String m3311 = ActivityC0921.m3311(activityC0921, str);
        if (m3311 == null || activityC0921.isFinishing() || activityC0921.isDestroyed()) {
            jsPromptResult.cancel();
            return true;
        }
        final EditText editText = new EditText(activityC0921);
        editText.setSingleLine(true);
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        editText.selectAll();
        C19258 buildDialog = activityC0921.buildDialog();
        buildDialog.m44436(m3311);
        buildDialog.m44424(str2);
        buildDialog.m44421(editText);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۟֡᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19267 c19267 = ActivityC0921.f3517;
                jsPromptResult.confirm(editText.getText().toString());
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.֫ۚ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19267 c19267 = ActivityC0921.f3517;
                jsPromptResult.cancel();
            }
        });
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۧۚ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C19267 c19267 = ActivityC0921.f3517;
                jsPromptResult.cancel();
            }
        });
        buildDialog.m44438();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        valueCallback.onReceiveValue(null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, false, false);
    }
}
