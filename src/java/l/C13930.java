package l;

import android.content.res.Resources;

/* compiled from: 38CF */
/* renamed from: l.ܰܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13930 extends AbstractC16876 implements InterfaceC16233 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C13930 f41605 = new C13930(1);

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        C11233.m27805(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
