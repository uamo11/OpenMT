package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: 268P */
/* renamed from: l.ۤ᩹, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10572 extends AbstractC2042 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f31725;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31726;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f31727;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f31728;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final PowerManager.WakeLock f31729;

    public C10572(ContextWrapper contextWrapper, ComponentName componentName) {
        super(componentName);
        this.f31728 = contextWrapper.getApplicationContext();
        PowerManager powerManager = (PowerManager) contextWrapper.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f31727 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f31729 = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // l.AbstractC2042
    /* renamed from: ֫ */
    public final void mo6712(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f6837);
        if (this.f31728.startService(intent2) != null) {
            synchronized (this) {
                if (!this.f31726) {
                    this.f31726 = true;
                    if (!this.f31725) {
                        this.f31727.acquire(60000L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC2042
    /* renamed from: ܽ */
    public final void mo6714() {
        synchronized (this) {
            this.f31726 = false;
        }
    }

    @Override // l.AbstractC2042
    /* renamed from: ۧ */
    public final void mo6713() {
        synchronized (this) {
            if (!this.f31725) {
                this.f31725 = true;
                this.f31729.acquire(600000L);
                this.f31727.release();
            }
        }
    }

    @Override // l.AbstractC2042
    /* renamed from: ֫ */
    public final void mo6710() {
        synchronized (this) {
            if (this.f31725) {
                if (this.f31726) {
                    this.f31727.acquire(60000L);
                }
                this.f31725 = false;
                this.f31729.release();
            }
        }
    }
}
