package l;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.umeng.analytics.pro.am;

/* compiled from: U6BF */
/* renamed from: l.᩶֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19850 extends MediaSession.Callback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4327 f64119;

    public C19850(AbstractC4327 abstractC4327) {
        this.f64119 = abstractC4327;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                C14472 c14472 = m45655.f36152;
                InterfaceC2210 m34569 = c14472.m34569();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", m34569 == null ? null : m34569.asBinder());
                InterfaceC6369 m34572 = c14472.m34572();
                if (m34572 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable(am.av, new C3547(m34572));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            } else {
                str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
            }
        } catch (BadParcelableException unused) {
        }
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return false;
        }
        m45656(m45655);
        boolean mo8510 = this.f64119.mo8510(intent);
        m45655.mo8908((C21326) null);
        return mo8510 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        this.f64119.mo8511();
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        this.f64119.mo8508();
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        this.f64119.mo8512();
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        this.f64119.mo8513();
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        this.f64119.mo8509(j);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        C17026.m39988(rating);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                C23645.m52135(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    C23645.m52135(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    C23645.m52135(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    C23645.m52135(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    C23645.m52135(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                }
            }
        } catch (BadParcelableException unused) {
        }
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        C23645.m52135(bundle);
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C12088 m45655 = m45655();
        if (m45655 == null) {
            return;
        }
        m45656(m45655);
        m45655.mo8908((C21326) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45656(C12088 c12088) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c12088.f36146;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c12088.mo8908(new C21326(str, -1, -1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12088 m45655() {
        C12088 c12088;
        synchronized (this.f64119.f13922) {
            c12088 = (C12088) this.f64119.f13923.get();
        }
        if (c12088 == null || this.f64119 != c12088.mo8907()) {
            return null;
        }
        return c12088;
    }
}
