package l;

/* compiled from: E72G */
/* renamed from: l.ܺۚ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15737 extends C18675 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0921 f48563;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15737(ActivityC0921 activityC0921, ActivityC0921 activityC09212) {
        super(activityC09212);
        this.f48563 = activityC0921;
    }

    @Override // l.C18675, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972;
        ViewOnTouchListenerC19972 viewOnTouchListenerC199722;
        super.onScrollChanged(i, i2, i3, i4);
        ActivityC0921 activityC0921 = this.f48563;
        viewOnTouchListenerC19972 = activityC0921.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC199722 = activityC0921.f3526;
            viewOnTouchListenerC199722.m46057();
        }
    }
}
