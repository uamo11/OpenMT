package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* compiled from: J5UB */
/* renamed from: l.ܺ᩶, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16152 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m38068(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m38069(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m38070(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m38072(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action m38071(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38075(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m38073(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m38074(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m38077(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m38076(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
