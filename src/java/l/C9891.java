package l;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: 37NB */
/* renamed from: l.ۢ᩺֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9891 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f29937;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9248 f29938;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f29939;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f29940;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f29941;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17714 f29942 = new C17714();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f29943 = new byte[1024];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f29944;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f29936 = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29935 = Pattern.compile("MPEGTS:(-?\\d+)");

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    public C9891(String str, C9248 c9248, InterfaceC6950 interfaceC6950, boolean z) {
        this.f29937 = str;
        this.f29938 = c9248;
        this.f29944 = interfaceC6950;
        this.f29941 = z;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22068(false, 0, 6, this.f29943);
        byte[] bArr = this.f29943;
        C17714 c17714 = this.f29942;
        c17714.m41462(6, bArr);
        if (C7676.m20560(c17714)) {
            return true;
        }
        c16184.mo22068(false, 6, 3, this.f29943);
        c17714.m41462(9, this.f29943);
        return C7676.m20560(c17714);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if (this.f29941) {
            interfaceC21830 = new C9067(interfaceC21830, this.f29944);
        }
        this.f29939 = interfaceC21830;
        interfaceC21830.mo3430(new C20794(-9223372036854775807L));
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        this.f29939.getClass();
        int length = (int) interfaceC8424.getLength();
        int i = this.f29940;
        byte[] bArr = this.f29943;
        if (i == bArr.length) {
            this.f29943 = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f29943;
        int i2 = this.f29940;
        int read = interfaceC8424.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            int i3 = this.f29940 + read;
            this.f29940 = i3;
            if (length == -1 || i3 != length) {
                return 0;
            }
        }
        C17714 c17714 = new C17714(this.f29943);
        C7676.m20561(c17714);
        long j = 0;
        long j2 = 0;
        for (String m41474 = c17714.m41474(StandardCharsets.UTF_8); !TextUtils.isEmpty(m41474); m41474 = c17714.m41474(StandardCharsets.UTF_8)) {
            if (m41474.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f29936.matcher(m41474);
                if (!matcher.find()) {
                    throw C9080.m23440("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(m41474), (Throwable) null);
                }
                Matcher matcher2 = f29935.matcher(m41474);
                if (!matcher2.find()) {
                    throw C9080.m23440("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(m41474), (Throwable) null);
                }
                String group = matcher.group(1);
                group.getClass();
                j2 = C7676.m20559(group);
                String group2 = matcher2.group(1);
                group2.getClass();
                long parseLong = Long.parseLong(group2);
                String str = C3603.f11424;
                j = C3603.m11017(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
        }
        Matcher m20558 = C7676.m20558(c17714);
        if (m20558 == null) {
            m24988(0L);
            return -1;
        }
        String group3 = m20558.group(1);
        group3.getClass();
        long m20559 = C7676.m20559(group3);
        String str2 = C3603.f11424;
        long m23734 = this.f29938.m23734(C3603.m11017((j + m20559) - j2, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
        InterfaceC19383 m24988 = m24988(m23734 - m20559);
        byte[] bArr3 = this.f29943;
        int i4 = this.f29940;
        C17714 c177142 = this.f29942;
        c177142.m41462(i4, bArr3);
        m24988.mo8453(this.f29940, c177142);
        m24988.mo8455(m23734, 1, this.f29940, 0, null);
        return -1;
    }

    @RequiresNonNull({"output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC19383 m24988(long j) {
        InterfaceC19383 mo3429 = this.f29939.mo3429(0, 3);
        C1297 c1297 = new C1297();
        c1297.m4465("text/vtt");
        c1297.m4471(this.f29937);
        c1297.m4443(j);
        mo3429.mo8456(c1297.m4440());
        this.f29939.mo3431();
        return mo3429;
    }
}
