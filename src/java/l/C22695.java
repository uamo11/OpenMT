package l;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* compiled from: X6AW */
/* renamed from: l.᩺ۖ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22695 implements InterfaceC5762 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Messenger f73329;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73330 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MediaBrowserService f73331;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC14974 f73332;

    public C22695(AbstractServiceC14974 abstractServiceC14974) {
        this.f73332 = abstractServiceC14974;
    }

    @Override // l.InterfaceC5762
    public void onCreate() {
        C11407 c11407 = new C11407(this, this.f73332);
        this.f73331 = c11407;
        c11407.onCreate();
    }
}
