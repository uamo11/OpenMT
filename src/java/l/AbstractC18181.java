package l;

import com.umeng.analytics.pro.cb;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.jar.Attributes;

/* compiled from: I1VO */
/* renamed from: l.ᩳܽᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC18181 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f56560 = {cb.k, 10};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42409(ByteArrayOutputStream byteArrayOutputStream, String str, Attributes attributes) {
        m42411(byteArrayOutputStream, "Name", str);
        if (!attributes.isEmpty()) {
            m42412(byteArrayOutputStream, m42407(attributes));
        }
        byteArrayOutputStream.write(f56560);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42408(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(f56560);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42410(ByteArrayOutputStream byteArrayOutputStream, Attributes.Name name, String str) {
        m42411(byteArrayOutputStream, name.toString(), str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42411(OutputStream outputStream, String str, String str2) {
        int min;
        byte[] bytes = C22870.m50967(str, ": ", str2).getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = f56560;
            if (length <= 0) {
                outputStream.write(bArr);
                return;
            }
            if (z) {
                min = Math.min(length, 70);
            } else {
                outputStream.write(bArr);
                outputStream.write(32);
                min = Math.min(length, 69);
            }
            outputStream.write(bytes, i, min);
            i += min;
            length -= min;
            z = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TreeMap m42407(Attributes attributes) {
        Set<Map.Entry<Object, Object>> entrySet = attributes.entrySet();
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Object, Object> entry : entrySet) {
            treeMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return treeMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42412(OutputStream outputStream, TreeMap treeMap) {
        for (Map.Entry entry : treeMap.entrySet()) {
            m42411(outputStream, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
