package l;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

/* compiled from: 88LY */
/* renamed from: l.ܿ֫ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC17037 extends Service {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final HashMap f52211 = new HashMap();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17743 f52212;

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C11551 m39996();

    @Override // android.app.Service
    public final void onCreate() {
        C17743 c17743 = (C17743) f52211.get(getClass());
        if (c17743 == null) {
            m39996();
            throw null;
        }
        this.f52212 = c17743;
        c17743.m41558(this);
        throw null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str);
            }
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        switch (str) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    C19956.m46033("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str2 == null) {
                    C19956.m46033("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((C16331) intent.getParcelableExtra("download_request")) == null) {
                    C19956.m46033("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    throw null;
                }
                intent.getIntExtra("stop_reason", 0);
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((C20566) intent.getParcelableExtra("requirements")) == null) {
                    C19956.m46033("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    throw null;
                }
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                throw null;
            default:
                C19956.m46033("Ignored unrecognized action: ".concat(str));
                throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f52212.m41559(this);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
