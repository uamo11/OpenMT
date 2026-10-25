package l;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: K1X4 */
/* renamed from: l.ۜܺᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class BinderC6871 extends AbstractBinderC4049 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC16042 f21236;

    public BinderC6871(ServiceC16042 serviceC16042) {
        this.f21236 = serviceC16042;
        attachInterface(this, "bin.mt.dstr.ipc.IDecryptorAidlInterface");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|(1:14)(2:35|(9:37|16|17|18|(1:20)|22|(1:24)|25|(3:(1:28)(1:31)|29|30)(2:32|33)))|15|16|17|18|(0)|22|(0)|25|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #0 {all -> 0x00ce, blocks: (B:18:0x00c4, B:20:0x00ca), top: B:17:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:8:0x0022, B:10:0x0040, B:12:0x004d, B:16:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:29:0x012d, B:31:0x012a, B:32:0x013b, B:33:0x014c, B:35:0x0077, B:38:0x014d, B:39:0x0154, B:40:0x0155, B:41:0x0160), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b A[Catch: Exception -> 0x0161, TryCatch #1 {Exception -> 0x0161, blocks: (B:8:0x0022, B:10:0x0040, B:12:0x004d, B:16:0x008c, B:22:0x00ce, B:24:0x00ef, B:25:0x00f2, B:28:0x0119, B:29:0x012d, B:31:0x012a, B:32:0x013b, B:33:0x014c, B:35:0x0077, B:38:0x014d, B:39:0x0154, B:40:0x0155, B:41:0x0160), top: B:7:0x0022 }] */
    @Override // l.InterfaceC18866
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo8299(java.lang.String r18, final boolean r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.BinderC6871.mo8299(java.lang.String, boolean, boolean, boolean):boolean");
    }

    @Override // l.InterfaceC18866
    public final void exit() {
        this.f21236.stopSelf();
        System.exit(0);
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۚ */
    public final String[] mo8302() {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        ServiceC16042 serviceC16042 = this.f21236;
        th = serviceC16042.f49480;
        if (th == null) {
            return null;
        }
        th2 = serviceC16042.f49480;
        String message = th2.getMessage();
        if (message == null || message.isEmpty()) {
            th3 = serviceC16042.f49480;
            message = th3.toString();
        }
        th4 = serviceC16042.f49480;
        String stackTraceString = Log.getStackTraceString(th4);
        serviceC16042.f49480 = null;
        return new String[]{message, stackTraceString};
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֨ */
    public final int mo8298() {
        int i;
        i = this.f21236.f49478;
        return i;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Object m18603(byte[] bArr) {
        Set set;
        Map map;
        ExecutorService executorService;
        Set set2;
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        C12951 c12951 = new C12951(bArr);
        final String m31504 = c12951.m31504();
        final String m315042 = c12951.m31504();
        int readByte = c12951.readByte() & 255;
        final Class[] clsArr = new Class[readByte];
        final Object[] objArr = new Object[readByte];
        for (int i = 0; i < readByte; i++) {
            switch (c12951.readByte()) {
                case 0:
                    clsArr[i] = Byte.TYPE;
                    objArr[i] = Byte.valueOf(c12951.readByte());
                    break;
                case 1:
                    clsArr[i] = Short.TYPE;
                    objArr[i] = Short.valueOf(c12951.readShort());
                    break;
                case 2:
                    clsArr[i] = Character.TYPE;
                    objArr[i] = Character.valueOf(c12951.m31507());
                    break;
                case 3:
                    clsArr[i] = Integer.TYPE;
                    objArr[i] = Integer.valueOf(c12951.readInt());
                    break;
                case 4:
                    clsArr[i] = Long.TYPE;
                    objArr[i] = Long.valueOf(c12951.readLong());
                    break;
                case 5:
                    clsArr[i] = Float.TYPE;
                    objArr[i] = Float.valueOf(c12951.m31495());
                    break;
                case 6:
                    clsArr[i] = Double.TYPE;
                    objArr[i] = Double.valueOf(Double.longBitsToDouble(c12951.readLong()));
                    break;
                case 7:
                    clsArr[i] = Boolean.TYPE;
                    objArr[i] = Boolean.valueOf(c12951.m31498());
                    break;
                case 8:
                    clsArr[i] = String.class;
                    objArr[i] = c12951.m31504();
                    break;
                case 9:
                    clsArr[i] = Object.class;
                    objArr[i] = c12951.m31504();
                    break;
                case 10:
                    clsArr[i] = byte[].class;
                    objArr[i] = c12951.m31496();
                    break;
                case 11:
                    clsArr[i] = Object.class;
                    objArr[i] = c12951.m31496();
                    break;
                case 12:
                    clsArr[i] = short[].class;
                    int readInt = c12951.readInt();
                    short[] sArr = new short[readInt];
                    for (int i2 = 0; i2 < readInt; i2++) {
                        sArr[i2] = c12951.readShort();
                    }
                    objArr[i] = sArr;
                    break;
                case 13:
                    clsArr[i] = char[].class;
                    objArr[i] = Character.valueOf(c12951.m31507());
                    break;
                case 14:
                    clsArr[i] = int[].class;
                    objArr[i] = c12951.m31491();
                    break;
                default:
                    serviceC16042.f49480 = new Exception("Unsupported parameter type");
                    return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m31504);
        sb.append(':');
        sb.append(m315042);
        for (int i3 = 0; i3 < readByte; i3++) {
            Class cls = clsArr[i3];
            sb.append(':');
            sb.append(cls.getSimpleName());
        }
        final String sb2 = sb.toString();
        set = serviceC16042.f49476;
        if (set.contains(sb2)) {
            serviceC16042.f49480 = new Exception(C20094.m46315("Disabled method: ", sb2));
            return null;
        }
        try {
            map = serviceC16042.f49479;
            final Method method = (Method) ((ConcurrentMapC10942) map).get(sb2);
            if (method == null) {
                method = (Method) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܽܺᩳ
                    @Override // l.InterfaceC9694
                    public final Object call() {
                        final BinderC6871 binderC6871 = BinderC6871.this;
                        ServiceC16042 serviceC160422 = binderC6871.f21236;
                        final String str = sb2;
                        final String str2 = m31504;
                        final String str3 = m315042;
                        final Class[] clsArr2 = clsArr;
                        return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.ۨۡᩳ
                            @Override // l.InterfaceC9694
                            public final Object call() {
                                Map map2;
                                C11626 c11626;
                                Map map3;
                                String str4 = str2;
                                String str5 = str3;
                                Class<?>[] clsArr3 = clsArr2;
                                ServiceC16042 serviceC160423 = BinderC6871.this.f21236;
                                map2 = serviceC160423.f49479;
                                String str6 = str;
                                Method method2 = (Method) ((ConcurrentMapC10942) map2).get(str6);
                                if (method2 != null) {
                                    return method2;
                                }
                                try {
                                    c11626 = serviceC160423.f49483;
                                    Method declaredMethod = Class.forName(str4, true, c11626).getDeclaredMethod(str5, clsArr3);
                                    if (!declaredMethod.isAccessible()) {
                                        declaredMethod.setAccessible(true);
                                    }
                                    map3 = serviceC160423.f49479;
                                    ((ConcurrentMapC10942) map3).put(str6, declaredMethod);
                                    return declaredMethod;
                                } catch (Exception e) {
                                    serviceC160423.f49480 = e;
                                    return null;
                                }
                            }
                        });
                    }
                });
            }
            executorService = ServiceC16042.f49472;
            Future submit = executorService.submit(new Callable() { // from class: l.ᩳܺᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ServiceC16042 serviceC160422 = BinderC6871.this.f21236;
                    final Method method2 = method;
                    final Object[] objArr2 = objArr;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.ܳܺᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            return method2.invoke(null, objArr2);
                        }
                    });
                }
            });
            try {
                return submit.get(2L, TimeUnit.SECONDS);
            } catch (ExecutionException e) {
                serviceC16042.f49480 = e.getCause();
                return null;
            } catch (TimeoutException e2) {
                serviceC16042.f49480 = e2;
                submit.cancel(true);
                set2 = serviceC16042.f49476;
                set2.add(sb2);
                return null;
            }
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ᩳ */
    public final String mo8311(byte[] bArr) {
        Object m18603 = m18603(bArr);
        if (m18603 == null) {
            return null;
        }
        return m18603.toString();
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܳ */
    public final String mo8306(byte[] bArr) {
        Integer num = (Integer) m18603(bArr);
        if (num == null) {
            return null;
        }
        return String.valueOf(num);
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۧ */
    public final byte[] mo8304(byte[] bArr) {
        return (byte[]) m18603(bArr);
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܿ */
    public final int[] mo8310(byte[] bArr) {
        short[] sArr = (short[]) m18603(bArr);
        if (sArr == null) {
            return null;
        }
        int[] iArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = sArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܽ */
    public final int[] mo8308(byte[] bArr) {
        char[] cArr = (char[]) m18603(bArr);
        if (cArr == null) {
            return null;
        }
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            iArr[i] = cArr[i];
        }
        return iArr;
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֫ */
    public final int[] mo8301(byte[] bArr) {
        return (int[]) m18603(bArr);
    }

    @Override // l.InterfaceC18866
    /* renamed from: ۧ */
    public final int mo8303(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return ((Integer) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.۬ۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = BinderC6871.this;
                    ServiceC16042 serviceC160422 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.ۤۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            C11626 c11626;
                            c11626 = BinderC6871.this.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            })).intValue();
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return -1;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܳ */
    public final String mo8305(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (String) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ܰۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = BinderC6871.this;
                    ServiceC16042 serviceC160422 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.۫ۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            C11626 c11626;
                            c11626 = BinderC6871.this.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == String.class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ֫ */
    public final int[] mo8300(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.۟ۡᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = BinderC6871.this;
                    ServiceC16042 serviceC160422 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.ۛۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            C11626 c11626;
                            c11626 = BinderC6871.this.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == short[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    short[] sArr = (short[]) field.get(null);
                                    if (sArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[sArr.length];
                                    for (int i2 = 0; i2 < sArr.length; i2++) {
                                        iArr[i2] = sArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ᩳ */
    public final int[] mo8312(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.֫ܺᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = BinderC6871.this;
                    ServiceC16042 serviceC160422 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.᩺ۡᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            C11626 c11626;
                            c11626 = BinderC6871.this.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == char[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    char[] cArr = (char[]) field.get(null);
                                    if (cArr == null) {
                                        return null;
                                    }
                                    int[] iArr = new int[cArr.length];
                                    for (int i2 = 0; i2 < cArr.length; i2++) {
                                        iArr[i2] = cArr[i2];
                                    }
                                    return iArr;
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܽ */
    public final int[] mo8307(final String str, final String str2) {
        ServiceC16042 serviceC16042 = this.f21236;
        serviceC16042.f49480 = null;
        try {
            return (int[]) ServiceC16042.m37926(new InterfaceC9694() { // from class: l.ۧܺᩳ
                @Override // l.InterfaceC9694
                public final Object call() {
                    final BinderC6871 binderC6871 = BinderC6871.this;
                    ServiceC16042 serviceC160422 = binderC6871.f21236;
                    final String str3 = str;
                    final String str4 = str2;
                    return ServiceC16042.m37927(serviceC160422, new InterfaceC9694() { // from class: l.᩻ܺᩳ
                        @Override // l.InterfaceC9694
                        public final Object call() {
                            C11626 c11626;
                            c11626 = BinderC6871.this.f21236.f49483;
                            String str5 = str3;
                            Field[] declaredFields = Class.forName(str5, true, c11626).getDeclaredFields();
                            int length = declaredFields.length;
                            int i = 0;
                            while (true) {
                                String str6 = str4;
                                if (i >= length) {
                                    throw new Exception(C20087.m46306("Field ", str5, ".", str6, " not found"));
                                }
                                Field field = declaredFields[i];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType() == int[].class && field.getName().equals(str6)) {
                                    field.setAccessible(true);
                                    return field.get(null);
                                }
                                i++;
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            serviceC16042.f49480 = th;
            return null;
        }
    }

    @Override // l.InterfaceC18866
    /* renamed from: ܿ */
    public final void mo8309(String str, String str2) {
        C15336.m36366(str, str2);
    }
}
