package l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* compiled from: 51RR */
/* renamed from: l.ۚ۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5223 extends C2816 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f16365;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8045 f16366;

    public C5223(C8045 c8045, InterfaceC4227 interfaceC4227) {
        this.f16366 = c8045;
        this.f16365 = new WeakReference(interfaceC4227);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028e  */
    @Override // l.InterfaceC4227
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3455(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5223.mo3455(org.json.JSONObject):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m15016(Activity activity, String str) {
        InputStream open;
        Bitmap bitmap;
        Drawable drawable = null;
        try {
            open = activity.getApplicationContext().getAssets().open(str);
        } catch (IOException e) {
            C9145.m23514("openSDK_LOG.AuthAgent", "getDrawable exception", e);
        }
        if (open != null) {
            if (str.endsWith(".9.png")) {
                try {
                    bitmap = BitmapFactory.decodeStream(open);
                } catch (OutOfMemoryError unused) {
                    C9145.m23516("openSDK_LOG.AuthAgent", "getDrawable oom");
                    bitmap = null;
                }
                if (bitmap != null) {
                    byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                    NinePatch.isNinePatchChunk(ninePatchChunk);
                    return new NinePatchDrawable(bitmap, ninePatchChunk, new Rect(), null);
                }
            } else {
                drawable = Drawable.createFromStream(open, str);
                open.close();
                return drawable;
            }
        }
        return null;
    }

    @Override // l.InterfaceC4227
    /* renamed from: ֫ */
    public final void mo3454(C19750 c19750) {
        WeakReference weakReference = this.f16365;
        if (weakReference.get() != null) {
            ((InterfaceC4227) weakReference.get()).mo3454(c19750);
        }
    }

    @Override // l.InterfaceC4227
    /* renamed from: ֫ */
    public final void mo3453() {
        WeakReference weakReference = this.f16365;
        if (weakReference.get() != null) {
            ((InterfaceC4227) weakReference.get()).mo3453();
        }
    }
}
