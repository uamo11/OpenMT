package l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 86A7 */
/* renamed from: l.ۧۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10802 extends View.AccessibilityDelegate {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16445 f32488;

    public C10802(C16445 c16445) {
        this.f32488 = c16445;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f32488.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f32488.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C14369 m34264 = C14369.m34264(accessibilityNodeInfo);
        int i = C17648.f53953;
        Boolean bool = (Boolean) new C1088(R.id.MT_Protector_res_0x7f0a05b1, 0, 28, Boolean.class).m46385(view);
        m34264.m34296(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new C21550(R.id.MT_Protector_res_0x7f0a05ac, 0, 28, Boolean.class).m46385(view);
        m34264.m34333(bool2 != null && bool2.booleanValue());
        m34264.m34323(C17648.m41336(view));
        m34264.m34310((CharSequence) new C15198(R.id.MT_Protector_res_0x7f0a05b2, 64, 30, CharSequence.class).m46385(view));
        this.f32488.onInitializeAccessibilityNodeInfo(view, m34264);
        m34264.m34280(view, accessibilityNodeInfo.getText());
        List m38749 = C16445.m38749(view);
        for (int i2 = 0; i2 < m38749.size(); i2++) {
            m34264.m34283((C13847) m38749.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f32488.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f32488.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f32488.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f32488.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C20721 accessibilityNodeProvider = this.f32488.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.m47327();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f32488.performAccessibilityAction(view, i, bundle);
    }
}
