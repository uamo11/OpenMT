package l;

import java.io.DataInputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: D7CN */
/* renamed from: l.ܳ۬ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14539 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44540 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44541 = 1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f44542;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f44543;

    public AbstractC14539(DataInputStream dataInputStream) {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.read(bArr);
        this.f44543 = new String(bArr, StandardCharsets.UTF_8);
        dataInputStream.close();
    }
}
