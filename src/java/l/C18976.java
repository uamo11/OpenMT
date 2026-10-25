package l;

import android.app.Notification;
import android.widget.RemoteViews;

/* compiled from: J5UB */
/* renamed from: l.ᩴ᩶, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18976 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m43803(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m43805(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m43806(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m43804(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m43807(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }
}
