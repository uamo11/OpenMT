package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.u0.b;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* compiled from: N673 */
/* renamed from: l.ۧۤᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ConcurrentMapC10942 extends AbstractMap implements ConcurrentMap, Serializable, InterfaceC17291 {
    public static final int g = Runtime.getRuntime().availableProcessors();
    public static final C18350 h;
    public static final long i;
    public static final long j;
    public static final long k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f77961l;
    public static final long m;
    public static final int n;
    public static final int o;
    public static final ObjectStreamField[] serialPersistentFields;
    public static final long serialVersionUID = 7249069246763182397L;
    public volatile transient C0357[] a;
    public volatile transient C0357[] b;
    public volatile transient long baseCount;
    public volatile transient C20820[] c;
    public volatile transient int cellsBusy;
    public transient C1769 d;
    public transient C20114 e;
    public transient C8825 f;
    public volatile transient int sizeCtl;
    public volatile transient int transferIndex;

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C1063[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C18350 c18350 = C18350.b;
        h = c18350;
        i = c18350.h(ConcurrentMapC10942.class, "sizeCtl");
        j = c18350.h(ConcurrentMapC10942.class, "transferIndex");
        k = c18350.h(ConcurrentMapC10942.class, "baseCount");
        f77961l = c18350.h(ConcurrentMapC10942.class, "cellsBusy");
        m = c18350.h(C20820.class, b.d);
        n = c18350.a(C0357[].class);
        int b = c18350.b(C0357[].class);
        if (((b - 1) & b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(b);
    }

    public static final int l(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return numberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final C0357 k(C0357[] c0357Arr, int i2) {
        return (C0357) h.f(c0357Arr, (i2 << o) + n);
    }

    public static final boolean b(C0357[] c0357Arr, int i2, C0357 c0357) {
        return AbstractC22791.E(h.a, c0357Arr, (i2 << o) + n, c0357);
    }

    public static final void h(C0357[] c0357Arr, int i2, C0357 c0357) {
        h.j(c0357Arr, (i2 << o) + n, c0357);
    }

    public ConcurrentMapC10942() {
    }

    public ConcurrentMapC10942(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentMapC10942(int i2, float f) {
        this(i2, f, 1);
    }

    public ConcurrentMapC10942(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            int r0 = i(r0)
            l.֡ۤᩴ[] r1 = r3.a
            if (r1 == 0) goto L4d
            int r2 = r1.length
            if (r2 <= 0) goto L4d
            int r2 = r2 + (-1)
            r2 = r2 & r0
            l.֡ۤᩴ r1 = k(r1, r2)
            if (r1 == 0) goto L4d
            int r2 = r1.a
            if (r2 != r0) goto L2b
            java.lang.Object r2 = r1.b
            if (r2 == r4) goto L28
            if (r2 == 0) goto L36
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L36
        L28:
            java.lang.Object r4 = r1.c
            return r4
        L2b:
            if (r2 >= 0) goto L36
            l.֡ۤᩴ r4 = r1.a(r0, r4)
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r4.c
            return r4
        L36:
            l.֡ۤᩴ r1 = r1.d
            if (r1 == 0) goto L4d
            int r2 = r1.a
            if (r2 != r0) goto L36
            java.lang.Object r2 = r1.b
            if (r2 == r4) goto L4a
            if (r2 == 0) goto L36
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L36
        L4a:
            java.lang.Object r4 = r1.c
            return r4
        L4d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 a = c15173.a();
                if (a == null) {
                    break;
                }
                Object obj2 = a.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return f(obj, obj2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a4, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r10, java.lang.Object r11, boolean r12) {
        /*
            r9 = this;
            r1 = 0
            if (r10 == 0) goto Lc2
            if (r11 == 0) goto Lc2
            int r0 = r10.hashCode()
            int r2 = i(r0)
            l.֡ۤᩴ[] r0 = r9.a
            r3 = 0
            r3 = r0
            r4 = 0
        L12:
            if (r3 == 0) goto Lbc
            int r0 = r3.length
            if (r0 != 0) goto L19
            goto Lbc
        L19:
            int r0 = r0 + (-1)
            r5 = r0 & r2
            l.֡ۤᩴ r6 = k(r3, r5)
            if (r6 != 0) goto L30
            l.֡ۤᩴ r0 = new l.֡ۤᩴ
            r0.<init>(r2, r10, r11)
            boolean r0 = b(r3, r5, r0)
            if (r0 == 0) goto L12
            goto Lb3
        L30:
            int r7 = r6.a
            r0 = -1
            if (r7 != r0) goto L3a
            l.֡ۤᩴ[] r3 = r9.d(r3, r6)
            goto L12
        L3a:
            if (r12 == 0) goto L4f
            if (r7 != r2) goto L4f
            java.lang.Object r0 = r6.b
            if (r0 == r10) goto L4a
            if (r0 == 0) goto L4f
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L4f
        L4a:
            java.lang.Object r0 = r6.c
            if (r0 == 0) goto L4f
            return r0
        L4f:
            r0 = r6
            monitor-enter(r0)
            l.֡ۤᩴ r8 = k(r3, r5)     // Catch: java.lang.Throwable -> Lb9
            if (r8 != r6) goto La5
            if (r7 < 0) goto L81
            r4 = 1
        L5a:
            int r7 = r6.a     // Catch: java.lang.Throwable -> Lb9
            if (r7 != r2) goto L71
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> Lb9
            if (r7 == r10) goto L6a
            if (r7 == 0) goto L71
            boolean r7 = r10.equals(r7)     // Catch: java.lang.Throwable -> Lb9
            if (r7 == 0) goto L71
        L6a:
            java.lang.Object r7 = r6.c     // Catch: java.lang.Throwable -> Lb9
            if (r12 != 0) goto La6
            r6.c = r11     // Catch: java.lang.Throwable -> Lb9
            goto La6
        L71:
            l.֡ۤᩴ r7 = r6.d     // Catch: java.lang.Throwable -> Lb9
            if (r7 != 0) goto L7d
            l.֡ۤᩴ r7 = new l.֡ۤᩴ     // Catch: java.lang.Throwable -> Lb9
            r7.<init>(r2, r10, r11)     // Catch: java.lang.Throwable -> Lb9
            r6.d = r7     // Catch: java.lang.Throwable -> Lb9
            goto La5
        L7d:
            int r4 = r4 + 1
            r6 = r7
            goto L5a
        L81:
            boolean r7 = r6 instanceof l.C21525     // Catch: java.lang.Throwable -> Lb9
            if (r7 == 0) goto L98
            l.᩸ۤᩴ r6 = (l.C21525) r6     // Catch: java.lang.Throwable -> Lb9
            l.᩹ۤᩴ r4 = r6.e(r2, r10, r11)     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto L95
            java.lang.Object r6 = r4.c     // Catch: java.lang.Throwable -> Lb9
            if (r12 != 0) goto L93
            r4.c = r11     // Catch: java.lang.Throwable -> Lb9
        L93:
            r7 = r6
            goto L96
        L95:
            r7 = r1
        L96:
            r4 = 2
            goto La6
        L98:
            boolean r6 = r6 instanceof l.C5297     // Catch: java.lang.Throwable -> Lb9
            if (r6 != 0) goto L9d
            goto La5
        L9d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r11 = "Recursive update"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lb9
            throw r10     // Catch: java.lang.Throwable -> Lb9
        La5:
            r7 = r1
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r4 == 0) goto L12
            r10 = 8
            if (r4 < r10) goto Lb0
            r9.n(r3, r5)
        Lb0:
            if (r7 == 0) goto Lb3
            return r7
        Lb3:
            r10 = 1
            r9.a(r10, r4)
            return r1
        Lb9:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb9
            throw r10
        Lbc:
            l.֡ۤᩴ[] r3 = r9.e()
            goto L12
        Lc2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return g(obj, null, null);
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i2;
        C0357 k2;
        boolean z;
        Object obj4;
        C22230 b;
        Object obj5;
        int i3 = i(obj.hashCode());
        C0357[] c0357Arr = this.a;
        while (true) {
            if (c0357Arr == null || (length = c0357Arr.length) == 0 || (k2 = k(c0357Arr, (i2 = (length - 1) & i3))) == null) {
                break;
            }
            int i4 = k2.a;
            if (i4 == -1) {
                c0357Arr = d(c0357Arr, k2);
            } else {
                synchronized (k2) {
                    if (k(c0357Arr, i2) == k2) {
                        z = true;
                        if (i4 >= 0) {
                            C0357 c0357 = null;
                            while (true) {
                                if (k2.a != i3 || ((obj5 = k2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    C0357 c03572 = k2.d;
                                    if (c03572 == null) {
                                        break;
                                    }
                                    c0357 = k2;
                                    k2 = c03572;
                                }
                            }
                            obj4 = k2.c;
                            if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                if (obj2 != null) {
                                    k2.c = obj2;
                                } else if (c0357 != null) {
                                    c0357.d = k2.d;
                                } else {
                                    h(c0357Arr, i2, k2.d);
                                }
                            }
                            obj4 = null;
                        } else if (k2 instanceof C21525) {
                            C21525 c21525 = (C21525) k2;
                            C22230 c22230 = c21525.e;
                            if (c22230 != null && (b = c22230.b(i3, obj, null)) != null) {
                                obj4 = b.c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        b.c = obj2;
                                    } else if (c21525.f(b)) {
                                        h(c0357Arr, i2, p(c21525.f));
                                    }
                                }
                            }
                            obj4 = null;
                        } else if (k2 instanceof C5297) {
                            throw new IllegalStateException("Recursive update");
                        }
                    }
                    z = false;
                    obj4 = null;
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        long j2;
        C0357 k2;
        C0357[] c0357Arr = this.a;
        long j3 = 0;
        loop0: while (true) {
            j2 = j3;
            int i2 = 0;
            while (c0357Arr != null && i2 < c0357Arr.length) {
                k2 = k(c0357Arr, i2);
                if (k2 == null) {
                    i2++;
                } else {
                    int i3 = k2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        if (k(c0357Arr, i2) == k2) {
                            if (i3 < 0) {
                                k2 = k2 instanceof C21525 ? ((C21525) k2).f : null;
                            }
                            while (k2 != null) {
                                j2--;
                                k2 = k2.d;
                            }
                            h(c0357Arr, i2, null);
                            i2++;
                        }
                    }
                }
            }
            c0357Arr = d(c0357Arr, k2);
            j3 = j2;
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C1769 c1769 = this.d;
        if (c1769 != null) {
            return c1769;
        }
        C1769 c17692 = new C1769(this, null);
        this.d = c17692;
        return c17692;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        C20114 c20114 = this.e;
        if (c20114 != null) {
            return c20114;
        }
        C20114 c201142 = new C20114(this);
        this.e = c201142;
        return c201142;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        C8825 c8825 = this.f;
        if (c8825 != null) {
            return c8825;
        }
        C8825 c88252 = new C8825(this);
        this.f = c88252;
        return c88252;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C0357[] c0357Arr = this.a;
        int i2 = 0;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 a = c15173.a();
                if (a == null) {
                    break;
                }
                i2 += a.c.hashCode() ^ a.b.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        C0357[] c0357Arr = this.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        C15173 c15173 = new C15173(c0357Arr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C0357 a = c15173.a();
        if (a != null) {
            while (true) {
                Object obj = a.b;
                Object obj2 = a.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append(a.h);
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a = c15173.a();
                if (a == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C0357[] c0357Arr = this.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        C15173 c15173 = new C15173(c0357Arr, length, 0, length);
        while (true) {
            C0357 a = c15173.a();
            if (a != null) {
                Object obj3 = a.c;
                Object obj4 = map.get(a.b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    break;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        C1063[] c1063Arr = new C1063[16];
        for (int i6 = 0; i6 < 16; i6++) {
            c1063Arr[i6] = new C1063();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", c1063Arr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        C0357[] c0357Arr = this.a;
        if (c0357Arr != null) {
            C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
            while (true) {
                C0357 a = c15173.a();
                if (a == null) {
                    break;
                }
                objectOutputStream.writeObject(a.b);
                objectOutputStream.writeObject(a.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        C0357 c0357 = null;
        long j4 = 0;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j4++;
            c0357 = new C0357(i(readObject.hashCode()), readObject, readObject2, c0357);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) ((j4 / 0.75f) + 1.0d);
        int l2 = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        C0357[] c0357Arr = new C0357[l2];
        int i2 = l2 - 1;
        while (c0357 != null) {
            C0357 c03572 = c0357.d;
            int i3 = c0357.a;
            int i4 = i3 & i2;
            C0357 k2 = k(c0357Arr, i4);
            if (k2 == null) {
                z = true;
            } else {
                Object obj2 = c0357.b;
                if (k2.a >= 0) {
                    int i5 = 0;
                    for (C0357 c03573 = k2; c03573 != null; c03573 = c03573.d) {
                        if (c03573.a == i3 && ((obj = c03573.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (z && i5 >= 8) {
                        long j6 = j3 + 1;
                        c0357.d = k2;
                        C22230 c22230 = null;
                        C22230 c222302 = null;
                        C0357 c03574 = c0357;
                        while (c03574 != null) {
                            long j7 = j6;
                            C22230 c222303 = new C22230(c03574.a, c03574.b, c03574.c, null, null);
                            c222303.h = c222302;
                            if (c222302 == null) {
                                c22230 = c222303;
                            } else {
                                c222302.d = c222303;
                            }
                            c03574 = c03574.d;
                            c222302 = c222303;
                            j6 = j7;
                        }
                        h(c0357Arr, i4, new C21525(c22230));
                        j3 = j6;
                    }
                } else if (((C21525) k2).e(i3, obj2, c0357.c) == null) {
                    j3 += j2;
                }
                z = false;
            }
            j2 = 1;
            if (z) {
                j3++;
                c0357.d = k2;
                h(c0357Arr, i4, c0357);
            }
            c0357 = c03572;
        }
        this.a = c0357Arr;
        this.sizeCtl = l2 - (l2 >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public Object putIfAbsent(Object obj, Object obj2) {
        return f(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 a = c15173.a();
            if (a == null) {
                return;
            } else {
                biConsumer.accept(a.b, a.c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C0357[] c0357Arr = this.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 a = c15173.a();
            if (a == null) {
                return;
            }
            Object obj = a.c;
            Object obj2 = a.b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
    
        if (r5 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r13, java.util.function.BiFunction r14) {
        /*
            r12 = this;
            r1 = 0
            if (r13 == 0) goto Lbd
            if (r14 == 0) goto Lbd
            int r0 = r13.hashCode()
            int r2 = i(r0)
            l.֡ۤᩴ[] r0 = r12.a
            r3 = 0
            r4 = 0
            r3 = r0
            r6 = r1
            r4 = 0
            r5 = 0
        L15:
            if (r3 == 0) goto Lb7
            int r0 = r3.length
            if (r0 != 0) goto L1c
            goto Lb7
        L1c:
            int r0 = r0 + (-1)
            r7 = r0 & r2
            l.֡ۤᩴ r8 = k(r3, r7)
            if (r8 != 0) goto L28
            goto Lad
        L28:
            int r9 = r8.a
            r0 = -1
            if (r9 != r0) goto L32
            l.֡ۤᩴ[] r3 = r12.d(r3, r8)
            goto L15
        L32:
            r0 = r8
            monitor-enter(r0)
            l.֡ۤᩴ r10 = k(r3, r7)     // Catch: java.lang.Throwable -> Lb4
            if (r10 != r8) goto Laa
            if (r9 < 0) goto L70
            r5 = 1
            r9 = r1
        L3e:
            int r10 = r8.a     // Catch: java.lang.Throwable -> Lb4
            if (r10 != r2) goto L65
            java.lang.Object r10 = r8.b     // Catch: java.lang.Throwable -> Lb4
            if (r10 == r13) goto L4e
            if (r10 == 0) goto L65
            boolean r10 = r13.equals(r10)     // Catch: java.lang.Throwable -> Lb4
            if (r10 == 0) goto L65
        L4e:
            java.lang.Object r6 = r8.c     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r6 = r14.apply(r13, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto L59
            r8.c = r6     // Catch: java.lang.Throwable -> Lb4
            goto Laa
        L59:
            l.֡ۤᩴ r4 = r8.d     // Catch: java.lang.Throwable -> Lb4
            if (r9 == 0) goto L60
            r9.d = r4     // Catch: java.lang.Throwable -> Lb4
            goto L63
        L60:
            h(r3, r7, r4)     // Catch: java.lang.Throwable -> Lb4
        L63:
            r4 = -1
            goto Laa
        L65:
            l.֡ۤᩴ r9 = r8.d     // Catch: java.lang.Throwable -> Lb4
            if (r9 != 0) goto L6a
            goto Laa
        L6a:
            int r5 = r5 + 1
            r11 = r9
            r9 = r8
            r8 = r11
            goto L3e
        L70:
            boolean r9 = r8 instanceof l.C21525     // Catch: java.lang.Throwable -> Lb4
            if (r9 == 0) goto L9d
            l.᩸ۤᩴ r8 = (l.C21525) r8     // Catch: java.lang.Throwable -> Lb4
            l.᩹ۤᩴ r5 = r8.e     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L9b
            l.᩹ۤᩴ r5 = r5.b(r2, r13, r1)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L9b
            java.lang.Object r6 = r5.c     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r6 = r14.apply(r13, r6)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto L8b
            r5.c = r6     // Catch: java.lang.Throwable -> Lb4
            goto L9b
        L8b:
            boolean r4 = r8.f(r5)     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L9a
            l.᩹ۤᩴ r4 = r8.f     // Catch: java.lang.Throwable -> Lb4
            l.֡ۤᩴ r4 = p(r4)     // Catch: java.lang.Throwable -> Lb4
            h(r3, r7, r4)     // Catch: java.lang.Throwable -> Lb4
        L9a:
            r4 = -1
        L9b:
            r5 = 2
            goto Laa
        L9d:
            boolean r7 = r8 instanceof l.C5297     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto La2
            goto Laa
        La2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lb4
            throw r13     // Catch: java.lang.Throwable -> Lb4
        Laa:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r5 == 0) goto L15
        Lad:
            if (r4 == 0) goto Lb3
            long r13 = (long) r4
            r12.a(r13, r5)
        Lb3:
            return r6
        Lb4:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r13
        Lb7:
            l.֡ۤᩴ[] r3 = r12.e()
            goto L15
        Lbd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010c, code lost:
    
        if (r5 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010e, code lost:
    
        a(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0112, code lost:
    
        return r6;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r13, java.util.function.BiFunction r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cf, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC17291, l.InterfaceC1830
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r13, java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    public static C1769 newKeySet() {
        return new C1769(new ConcurrentMapC10942(), Boolean.TRUE);
    }

    public final C0357[] e() {
        while (true) {
            C0357[] c0357Arr = this.a;
            if (c0357Arr != null && c0357Arr.length != 0) {
                return c0357Arr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    C0357[] c0357Arr2 = this.a;
                    if (c0357Arr2 == null || c0357Arr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        C0357[] c0357Arr3 = new C0357[i3];
                        this.a = c0357Arr3;
                        i2 = i3 - (i3 >>> 2);
                        c0357Arr2 = c0357Arr3;
                    }
                    return c0357Arr2;
                } finally {
                    this.sizeCtl = i2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x014d, code lost:
    
        if (r1.c != r5) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x014f, code lost:
    
        r1.c = (l.C20820[]) java.util.Arrays.copyOf(r5, r6 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1.d(r23, r3, r5, r14) == false) goto L6;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r24, int r26) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ConcurrentMapC10942.a(long, int):void");
    }

    public final C0357[] d(C0357[] c0357Arr, C0357 c0357) {
        int i2;
        if (c0357 instanceof C2475) {
            C0357[] c0357Arr2 = ((C2475) c0357).e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(c0357Arr.length) | 32768;
            while (true) {
                if (c0357Arr2 != this.b || this.a != c0357Arr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != numberOfLeadingZeros || i2 == numberOfLeadingZeros + 1 || i2 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                }
                if (h.c(this, i, i2, i2 + 1)) {
                    m(c0357Arr, c0357Arr2);
                    break;
                }
            }
            return c0357Arr2;
        }
        return this.a;
    }

    public final void o(int i2) {
        int length;
        int l2 = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            C0357[] c0357Arr = this.a;
            if (c0357Arr == null || (length = c0357Arr.length) == 0) {
                int i4 = i3 > l2 ? i3 : l2;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == c0357Arr) {
                            this.a = new C0357[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (l2 <= i3 || length >= 1073741824) {
                    return;
                }
                if (c0357Arr == this.a) {
                    if (h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(c0357Arr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r4v11, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r4v12, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r5v12, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r5v9, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r9v12, types: [l.֡ۤᩴ] */
    /* JADX WARN: Type inference failed for: r9v14, types: [l.֡ۤᩴ] */
    public final void m(C0357[] c0357Arr, C0357[] c0357Arr2) {
        C0357[] c0357Arr3;
        int i2;
        int i3;
        int i4;
        int i5;
        C0357 c21525;
        C0357 c215252;
        C22230 c22230;
        int i6;
        boolean z;
        ConcurrentMapC10942 concurrentMapC10942 = this;
        C0357[] c0357Arr4 = c0357Arr;
        int length = c0357Arr4.length;
        int i7 = g;
        int i8 = i7 > 1 ? (length >>> 3) / i7 : length;
        int i9 = i8 < 16 ? 16 : i8;
        if (c0357Arr2 == null) {
            try {
                C0357[] c0357Arr5 = new C0357[length << 1];
                concurrentMapC10942.b = c0357Arr5;
                concurrentMapC10942.transferIndex = length;
                c0357Arr3 = c0357Arr5;
            } catch (Throwable unused) {
                concurrentMapC10942.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c0357Arr3 = c0357Arr2;
        }
        int length2 = c0357Arr3.length;
        C2475 c2475 = new C2475(c0357Arr3);
        int i10 = 0;
        int i11 = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            if (z2) {
                i10--;
                if (i10 < i11 && !z3) {
                    int i12 = concurrentMapC10942.transferIndex;
                    if (i12 <= 0) {
                        i10 = -1;
                    } else {
                        C18350 c18350 = h;
                        long j2 = j;
                        int i13 = i12 > i9 ? i12 - i9 : 0;
                        if (c18350.c(this, j2, i12, i13)) {
                            i10 = i12 - 1;
                            i11 = i13;
                        }
                    }
                }
                z2 = false;
            } else {
                C22230 c222302 = null;
                if (i10 < 0 || i10 >= length || (i5 = i10 + length) >= length2) {
                    i2 = i9;
                    i3 = length2;
                    i4 = i11;
                    if (z3) {
                        this.b = null;
                        this.a = c0357Arr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentMapC10942 = this;
                    C18350 c183502 = h;
                    long j3 = i;
                    int i14 = concurrentMapC10942.sizeCtl;
                    if (c183502.c(this, j3, i14, i14 - 1)) {
                        if (i14 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i10 = length;
                        z2 = true;
                        z3 = true;
                    }
                } else {
                    ?? k2 = k(c0357Arr4, i10);
                    if (k2 == 0) {
                        z = b(c0357Arr4, i10, c2475);
                    } else {
                        int i15 = k2.a;
                        if (i15 == -1) {
                            z = true;
                        } else {
                            synchronized (k2) {
                                if (k(c0357Arr4, i10) == k2) {
                                    if (i15 >= 0) {
                                        int i16 = i15 & length;
                                        C22230 c222303 = k2;
                                        for (C22230 c222304 = k2.d; c222304 != null; c222304 = c222304.d) {
                                            int i17 = c222304.a & length;
                                            if (i17 != i16) {
                                                c222303 = c222304;
                                                i16 = i17;
                                            }
                                        }
                                        if (i16 == 0) {
                                            c22230 = null;
                                            c222302 = c222303;
                                        } else {
                                            c22230 = c222303;
                                        }
                                        while (k2 != c222303) {
                                            int i18 = k2.a;
                                            Object obj = k2.b;
                                            C22230 c222305 = c222303;
                                            Object obj2 = k2.c;
                                            if ((i18 & length) == 0) {
                                                i6 = i9;
                                                c222302 = new C0357(i18, obj, obj2, c222302);
                                            } else {
                                                i6 = i9;
                                                c22230 = new C0357(i18, obj, obj2, c22230);
                                            }
                                            k2 = k2.d;
                                            c222303 = c222305;
                                            i9 = i6;
                                        }
                                        i2 = i9;
                                        h(c0357Arr3, i10, c222302);
                                        h(c0357Arr3, i5, c22230);
                                        h(c0357Arr4, i10, c2475);
                                        i3 = length2;
                                        i4 = i11;
                                    } else {
                                        i2 = i9;
                                        if (k2 instanceof C21525) {
                                            C21525 c215253 = (C21525) k2;
                                            C0357 c0357 = c215253.f;
                                            C22230 c222306 = null;
                                            C22230 c222307 = null;
                                            C22230 c222308 = null;
                                            int i19 = 0;
                                            int i20 = 0;
                                            while (c0357 != null) {
                                                int i21 = length2;
                                                int i22 = c0357.a;
                                                int i23 = i11;
                                                C22230 c222309 = new C22230(i22, c0357.b, c0357.c, null, null);
                                                if ((i22 & length) == 0) {
                                                    c222309.h = c222308;
                                                    if (c222308 == null) {
                                                        c222302 = c222309;
                                                    } else {
                                                        c222308.d = c222309;
                                                    }
                                                    i20++;
                                                    c222308 = c222309;
                                                } else {
                                                    c222309.h = c222307;
                                                    if (c222307 == null) {
                                                        c222306 = c222309;
                                                    } else {
                                                        c222307.d = c222309;
                                                    }
                                                    i19++;
                                                    c222307 = c222309;
                                                }
                                                c0357 = c0357.d;
                                                length2 = i21;
                                                i11 = i23;
                                            }
                                            i3 = length2;
                                            i4 = i11;
                                            if (i20 <= 6) {
                                                c21525 = p(c222302);
                                            } else {
                                                c21525 = i19 != 0 ? new C21525(c222302) : c215253;
                                            }
                                            if (i19 <= 6) {
                                                c215252 = p(c222306);
                                            } else {
                                                c215252 = i20 != 0 ? new C21525(c222306) : c215253;
                                            }
                                            h(c0357Arr3, i10, c21525);
                                            h(c0357Arr3, i5, c215252);
                                            c0357Arr4 = c0357Arr;
                                            h(c0357Arr4, i10, c2475);
                                        }
                                    }
                                    z2 = true;
                                } else {
                                    i2 = i9;
                                }
                                i3 = length2;
                                i4 = i11;
                            }
                            concurrentMapC10942 = this;
                        }
                    }
                    z2 = z;
                    i2 = i9;
                    i3 = length2;
                    i4 = i11;
                }
                length2 = i3;
                i9 = i2;
                i11 = i4;
            }
        }
    }

    public final long j() {
        C20820[] c20820Arr = this.c;
        long j2 = this.baseCount;
        if (c20820Arr != null) {
            for (C20820 c20820 : c20820Arr) {
                if (c20820 != null) {
                    j2 += c20820.value;
                }
            }
        }
        return j2;
    }

    public final void n(C0357[] c0357Arr, int i2) {
        int length = c0357Arr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        C0357 k2 = k(c0357Arr, i2);
        if (k2 == null || k2.a < 0) {
            return;
        }
        synchronized (k2) {
            if (k(c0357Arr, i2) == k2) {
                C22230 c22230 = null;
                C22230 c222302 = null;
                while (k2 != null) {
                    C22230 c222303 = new C22230(k2.a, k2.b, k2.c, null, null);
                    c222303.h = c222302;
                    if (c222302 == null) {
                        c22230 = c222303;
                    } else {
                        c222302.d = c222303;
                    }
                    k2 = k2.d;
                    c222302 = c222303;
                }
                h(c0357Arr, i2, new C21525(c22230));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [l.֡ۤᩴ] */
    public static C0357 p(C22230 c22230) {
        C0357 c0357 = null;
        C0357 c03572 = null;
        for (C22230 c222302 = c22230; c222302 != null; c222302 = c222302.d) {
            C0357 c03573 = new C0357(c222302.a, c222302.b, c222302.c);
            if (c03572 == null) {
                c0357 = c03573;
            } else {
                c03572.d = c03573;
            }
            c03572 = c03573;
        }
        return c0357;
    }
}
