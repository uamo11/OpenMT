package l;

import android.content.Context;
import com.umeng.analytics.pro.d;
import java.util.List;

/* compiled from: 0B0W */
/* renamed from: l.ܶۡ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15118 implements InterfaceC20814 {
    @Override // l.InterfaceC20814
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo35812(Context context) {
        C3125 c3125;
        C3125 c31252;
        C11233.m27805(context, d.R);
        C23635 m52130 = C23635.m52130(context);
        C11233.m27803(m52130, "getInstance(context)");
        if (!m52130.m52133()) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C17942.m41941(context);
        c3125 = C3125.f9760;
        c3125.m9510(context);
        c31252 = C3125.f9760;
        return c31252;
    }

    @Override // l.InterfaceC20814
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo35813() {
        return C8969.f27244;
    }
}
