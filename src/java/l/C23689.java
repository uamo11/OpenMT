package l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: O8SZ */
/* renamed from: l.᩻۫֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23689 extends ContentObserver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentResolver f76720;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f76721;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20868 f76722;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23689(C20868 c20868, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f76722 = c20868;
        this.f76720 = contentResolver;
        this.f76721 = uri;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52227() {
        this.f76720.registerContentObserver(this.f76721, false, this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52228() {
        this.f76720.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        C18231 c18231;
        C9579 c9579;
        C20868 c20868 = this.f76722;
        context = c20868.f67536;
        c18231 = c20868.f67529;
        c9579 = c20868.f67531;
        c20868.m47686(C18045.m42101(context, c18231, c9579));
    }
}
