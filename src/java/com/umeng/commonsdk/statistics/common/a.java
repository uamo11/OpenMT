package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: 051X */
/* loaded from: classes.dex */
public class a {

    /* compiled from: 051X */
    /* renamed from: com.umeng.commonsdk.statistics.common.a$a, reason: collision with other inner class name */
    public final class C0041a {
        public final String a;
        public final boolean b;

        public C0041a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }

        public boolean a() {
            return this.b;
        }
    }

    public static String a(Context context) {
        try {
            C0041a c2 = c(context);
            if (c2 != null && !c2.a()) {
                return c2.b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String b(Context context) {
        try {
            C0041a c2 = c(context);
            if (c2 == null) {
                return null;
            }
            return c2.b();
        } catch (Exception unused) {
            return null;
        }
    }

    public static C0041a c(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() || com.umeng.commonsdk.utils.b.a().a(context, "com.android.vending", 0) == null) {
            return null;
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.a());
                    boolean a = cVar.a(true);
                    return new C0041a(a ? "" : cVar.a(), a);
                } catch (Exception e) {
                    throw e;
                }
            }
            throw new IOException("Google Play connection failed");
        } finally {
            context.unbindService(bVar);
        }
    }

    /* compiled from: 051X */
    public final class b implements ServiceConnection {
        public boolean a;
        public final LinkedBlockingQueue b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public b() {
            this.a = false;
            this.b = new LinkedBlockingQueue(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder a() {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return (IBinder) this.b.take();
        }
    }

    /* compiled from: 051X */
    public final class c implements IInterface {
        public IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
