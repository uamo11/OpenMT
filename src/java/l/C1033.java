package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.IDEAEngine;

/* compiled from: D6W2 */
/* renamed from: l.֨ۢۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1033 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f3778;

    public C1033(File file) {
        this.f3778 = file;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m3572() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f3778);
            try {
                byte[] bArr = new byte[IDEAEngine.BASE];
                int i = 0;
                while (i < 65537) {
                    int read = fileInputStream.read(bArr, i, IDEAEngine.BASE - i);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                }
                if (i > 65536) {
                    throw new IOException("MCP credential store is too large");
                }
                CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                JSONObject asObject = JSON.parse(newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)).toString()).asObject();
                m3571(asObject, "version", "credentials");
                String jSONValue = asObject.get("version").toString();
                if (!"1".equals(jSONValue) && !"2".equals(jSONValue)) {
                    throw new IOException("Unsupported MCP credential store version");
                }
                JSONArray asArray = asObject.get("credentials").asArray();
                if (asArray.size() > 32) {
                    throw new IOException("Too many MCP credentials");
                }
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                Iterator it = asArray.iterator();
                while (it.hasNext()) {
                    JSONObject asObject2 = ((JSONValue) it.next()).asObject();
                    if ("1".equals(jSONValue)) {
                        m3571(asObject2, "credentialId", "clientName", "digest", "createdAt", "lastUsedAt", "lastIp");
                    } else {
                        m3571(asObject2, "credentialId", "clientName", "digest", "token", "createdAt", "lastUsedAt", "lastIp");
                    }
                    String asString = asObject2.get("credentialId").asString();
                    String asString2 = asObject2.get("clientName").asString();
                    String asString3 = asObject2.get("digest").asString();
                    String asString4 = asObject2.get("lastIp").asString();
                    long asLong = asObject2.get("createdAt").asLong();
                    long asLong2 = asObject2.get("lastUsedAt").asLong();
                    C5267.m15183(asString2);
                    if (!C5267.m15180(16, asString) || !hashSet.add(asString) || asString3.length() != 64 || asLong < 0 || asLong2 < 0 || asString4.length() > 128) {
                        throw new IOException("Invalid MCP credential metadata");
                    }
                    for (int i2 = 0; i2 < asString3.length(); i2++) {
                        char charAt = asString3.charAt(i2);
                        if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                            throw new IOException("Invalid MCP credential digest");
                        }
                    }
                    String asString5 = "1".equals(jSONValue) ? "" : asObject2.get("token").asString();
                    if (!asString5.isEmpty() && !C5267.m15181(asString5, asString, asString3)) {
                        throw new IOException("Invalid MCP credential token");
                    }
                    arrayList.add(new C18673(asString, asString2, asString3, asString5, asLong, asLong2, asString4));
                }
                fileInputStream.close();
                return arrayList;
            } finally {
            }
        } catch (RuntimeException unused) {
            throw new IOException("Invalid MCP credential store");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3573(ArrayList arrayList) {
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            array.add(((C18673) it.next()).m43292());
        }
        byte[] bytes = JSON.object().add("version", 2).add("credentials", array).toString().getBytes(StandardCharsets.UTF_8);
        File file = this.f3778;
        File parentFile = file.getParentFile();
        if (bytes.length > 65536 || parentFile == null || (!parentFile.isDirectory() && !parentFile.mkdirs())) {
            throw new IOException("Cannot prepare MCP credential store");
        }
        File file2 = new File(parentFile, file.getName() + ".tmp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Cannot publish MCP credential store");
                }
            } finally {
            }
        } finally {
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3571(JSONObject jSONObject, String... strArr) {
        if (jSONObject.size() == strArr.length) {
            HashSet hashSet = new HashSet(jSONObject.names());
            HashSet hashSet2 = new HashSet(strArr.length);
            for (String str : strArr) {
                C11003.requireNonNull(str);
                if (!hashSet2.add(str)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str));
                }
            }
            if (hashSet.equals(C20195.unmodifiableSet(hashSet2))) {
                return;
            }
        }
        throw new IOException("Invalid MCP credential store fields");
    }
}
