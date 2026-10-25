package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: I53K */
/* renamed from: l.᩷ۙ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20638 implements Iterable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f66404 = new ArrayList();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC1252 f66405;

    public C20638(ActivityC1252 activityC1252) {
        this.f66405 = activityC1252;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20638 m47223(ActivityC1252 activityC1252) {
        return new C20638(activityC1252);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47224(ActivityC1252 activityC1252) {
        Intent mo4112 = activityC1252.mo4112();
        if (mo4112 == null) {
            mo4112 = C18270.m42600(activityC1252);
        }
        if (mo4112 != null) {
            ComponentName component = mo4112.getComponent();
            ActivityC1252 activityC12522 = this.f66405;
            if (component == null) {
                component = mo4112.resolveActivity(activityC12522.getPackageManager());
            }
            ArrayList arrayList = this.f66404;
            int size = arrayList.size();
            try {
                for (Intent m42601 = C18270.m42601(activityC12522, component); m42601 != null; m42601 = C18270.m42601(activityC12522, m42601.getComponent())) {
                    arrayList.add(size, m42601);
                }
                arrayList.add(mo4112);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f66404.iterator();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47225() {
        ArrayList arrayList = this.f66404;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f66405.startActivities(intentArr, null);
    }
}
