package l;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;

/* compiled from: OANW */
/* renamed from: l.۬ۧܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13075 implements InterfaceC7163 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39150;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC13512 f39151;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SidecarInterface f39152;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39153;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8137 f39154;

    @Override // l.InterfaceC7163
    /* renamed from: ۧ */
    public final void mo19186(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        C11233.m27805(activity, "activity");
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f39152;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f39150;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f39153;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f39152) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SidecarInterface m31688() {
        return this.f39152;
    }

    public C13075(Context context) {
        SidecarInterface m35923 = C15191.m35923(context);
        C8137 c8137 = new C8137(0);
        this.f39152 = m35923;
        this.f39154 = c8137;
        this.f39153 = new LinkedHashMap();
        this.f39150 = new LinkedHashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31690(C12370 c12370) {
        this.f39151 = new C21543(c12370);
        SidecarInterface sidecarInterface = this.f39152;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new C22248(this.f39154, new C4609(this)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31689(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f39153;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f39152;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f39152) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC13512 interfaceC13512 = this.f39151;
        if (interfaceC13512 != null) {
            ((C21543) interfaceC13512).m48702(activity, m31692(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f39150;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacksC3198 componentCallbacksC3198 = new ComponentCallbacksC3198(this, activity);
            linkedHashMap2.put(activity, componentCallbacksC3198);
            activity.registerComponentCallbacks(componentCallbacksC3198);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a5 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0080 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x018b, TryCatch #2 {all -> 0x018b, blocks: (B:3:0x0001, B:9:0x0024, B:11:0x002c, B:14:0x0034, B:17:0x003c, B:20:0x0043, B:22:0x004b, B:25:0x005d, B:27:0x0065, B:33:0x0084, B:35:0x008a, B:41:0x00a9, B:43:0x00af, B:46:0x00b5, B:47:0x00e7, B:49:0x0103, B:54:0x0106, B:56:0x0131, B:58:0x013b, B:59:0x0142, B:60:0x0143, B:61:0x014a, B:63:0x00b8, B:65:0x00df, B:67:0x014b, B:68:0x0152, B:69:0x0153, B:70:0x015a, B:71:0x015b, B:72:0x0166, B:73:0x00a5, B:74:0x008f, B:76:0x0097, B:77:0x0167, B:78:0x0172, B:79:0x0080, B:80:0x006a, B:82:0x0072, B:83:0x0173, B:84:0x017e, B:85:0x0059, B:87:0x0039, B:88:0x0031, B:89:0x017f, B:90:0x018a, B:91:0x0020, B:92:0x0008, B:94:0x0010), top: B:2:0x0001, inners: #0, #1 }] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m31691() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13075.m31691():boolean");
    }

    @Override // l.InterfaceC7163
    /* renamed from: ֫ */
    public final void mo19185(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            m31689(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC20132(this, activity));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17473 m31692(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new C17473(C8969.f27244);
        }
        SidecarInterface sidecarInterface = this.f39152;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.f39152;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f39154.m21608(windowLayoutInfo, deviceState);
    }
}
