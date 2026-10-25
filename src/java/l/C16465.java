package l;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* compiled from: P54R */
/* renamed from: l.ܽۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16465 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38768(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActionMode m38767(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
