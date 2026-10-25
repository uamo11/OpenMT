package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: D5IX */
/* renamed from: l.ۘۢ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC3851 extends Thread implements TextureView.SurfaceTextureListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[] f12285;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final WeakReference f12286;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23231 f12287;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public GifInfoHandle f12288;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC3851(C18668 c18668) {
        super("GifRenderThread");
        this.f12287 = new C23231();
        this.f12288 = new GifInfoHandle();
        this.f12286 = new WeakReference(c18668);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AbstractC4556 abstractC4556;
        C1028 c1028;
        float f;
        C1028 c10282;
        try {
            C18668 c18668 = (C18668) this.f12286.get();
            if (c18668 == null) {
                return;
            }
            abstractC4556 = c18668.f58989;
            GifInfoHandle mo13407 = abstractC4556.mo13407();
            this.f12288 = mo13407;
            mo13407.m52908(c18668.isOpaque(), (char) 1);
            c1028 = c18668.f58987;
            if (c1028.f3758 >= 0) {
                GifInfoHandle gifInfoHandle = this.f12288;
                c10282 = c18668.f58987;
                gifInfoHandle.m52905(c10282.f3758);
            }
            C18668 c186682 = (C18668) this.f12286.get();
            if (c186682 == null) {
                this.f12288.m52899();
                return;
            }
            C18668.m43271(c186682, this);
            boolean isAvailable = c186682.isAvailable();
            C23231 c23231 = this.f12287;
            synchronized (c23231) {
                if (isAvailable) {
                    c23231.m51534();
                } else {
                    c23231.m51533();
                }
            }
            if (isAvailable) {
                c186682.post(new RunnableC2440(this, c186682));
            }
            GifInfoHandle gifInfoHandle2 = this.f12288;
            f = c186682.f58986;
            gifInfoHandle2.m52904(f);
            while (!isInterrupted()) {
                try {
                    this.f12287.m51532();
                    C18668 c186683 = (C18668) this.f12286.get();
                    if (c186683 == null) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = c186683.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        Surface surface = new Surface(surfaceTexture);
                        try {
                            this.f12288.m52907(surface, this.f12285);
                        } finally {
                            surface.release();
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f12288.m52899();
            this.f12288 = new GifInfoHandle();
        } catch (IOException unused2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C18668 c18668 = (C18668) this.f12286.get();
        if (c18668 != null) {
            c18668.m43273(this.f12288);
        }
        this.f12287.m51534();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f12287.m51533();
        this.f12288.m52923();
        interrupt();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11599(C18668 c18668) {
        this.f12287.m51533();
        C18668.m43271(c18668, (TextureView.SurfaceTextureListener) null);
        this.f12288.m52923();
        interrupt();
    }
}
