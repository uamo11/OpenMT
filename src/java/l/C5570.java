package l;

import android.app.Notification;
import android.content.LocusId;

/* compiled from: J5UB */
/* renamed from: l.ۚ᩶, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5570 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Action.Builder m15810(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15812(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15811(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Notification.Builder m15813(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }
}
