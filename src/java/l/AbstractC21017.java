package l;

import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* compiled from: F43P */
/* renamed from: l.᩷ܿ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC21017 implements InterfaceC11223 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Set f67841 = EnumC0121.m1154();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f67842;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22364 f67846;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f67847;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11781 f67849;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f67850;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Charset f67852;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f67853;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f67845 = System.currentTimeMillis();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f67848 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f67843 = new HashMap();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23838 f67851 = new C23838();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22343 f67844 = new C22343();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47835() {
        if (this.f67848 > 0) {
            this.f67845 = System.currentTimeMillis();
        }
    }

    public AbstractC21017(Charset charset) {
        this.f67852 = charset;
    }

    /* renamed from: ֫ */
    public void mo28935(C2903 c2903) {
        this.f67846 = C22364.m50099(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        this.f67849 = m28823;
        this.f67850 = m28823.m28824("procloader");
        C11781 c11781 = this.f67849;
        c11781.getClass();
        EnumC0121 enumC0121 = EnumC0121.f1177;
        boolean z = c11781.m28829(enumC0121, MotionUtils.EASING_TYPE_PATH) || ((c11781.m28832(EnumC0121.f1188) || c11781.m28829(enumC0121, ProviderConfigurationPermission.ALL_STR)) && c11781.m28833(enumC0121, "-path"));
        C22364 c22364 = this.f67846;
        C2672 c2672 = (C2672) c2903.m8837(C2672.class);
        if (c2672 == null) {
            c2672 = new C2672();
        }
        this.f67844.m50089(c22364, z, c2672);
        if (this.f67849.m28824("fileManager.deferClose") != null) {
            try {
                this.f67848 = (int) (Float.parseFloat(r4) * 1000.0f);
            } catch (NumberFormatException unused) {
                this.f67848 = 60000L;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47836() {
        C22343 c22343 = this.f67844;
        c22343.getClass();
        return ((C7610) c22343.m50085(EnumC21101.PLATFORM_CLASS_PATH)).m20403();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m47837() {
        this.f67844.getClass();
        return !((C21638) r0.m50085(EnumC21101.SYSTEM_MODULES)).f41660;
    }

    @Override // l.InterfaceC11223
    /* renamed from: ֫ */
    public final boolean mo1709(Iterator it, String str) {
        C17488 c17488 = new C17488(this, this.f67846);
        EnumC0121 m1159 = EnumC0121.m1159(str, f67841);
        if (m1159 == null) {
            return false;
        }
        try {
            m1159.m1180(c17488, str, it);
            return true;
        } catch (C2239 e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // l.InterfaceC17572
    /* renamed from: ֫ */
    public final int mo1701(String str) {
        EnumC0121 m1159 = EnumC0121.m1159(str, f67841);
        if (m1159 == null) {
            return -1;
        }
        return m1159.mo1187() ? 1 : 0;
    }

    /* renamed from: ֫ */
    public boolean mo28937(EnumC0121 enumC0121, String str) {
        int i = C14665.f44817[enumC0121.ordinal()];
        if (i == 1) {
            this.f67847 = str;
            return true;
        }
        C22343 c22343 = this.f67844;
        if (i == 2) {
            this.f67853 = str;
            c22343.m50088(str);
            return true;
        }
        AbstractC11055 abstractC11055 = (AbstractC11055) c22343.f72406.get(enumC0121);
        if (abstractC11055 == null) {
            return false;
        }
        return abstractC11055.mo20401(enumC0121, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47831() {
        String str = this.f67847;
        if (str != null) {
            return str;
        }
        if (this.f67842 == null) {
            this.f67842 = Charset.defaultCharset().name();
        }
        return this.f67842;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharBuffer m47833(ByteBuffer byteBuffer, boolean z) {
        Charset forName;
        CodingErrorAction codingErrorAction;
        String m47831 = m47831();
        Charset charset = this.f67852;
        if (charset == null) {
            try {
                forName = Charset.forName(m47831);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
                C22364 c22364 = this.f67846;
                C12281 c12281 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "unsupported.encoding", m47831));
                return (CharBuffer) CharBuffer.allocate(1).flip();
            }
        } else {
            forName = charset;
        }
        CharsetDecoder newDecoder = forName.newDecoder();
        if (z) {
            codingErrorAction = CodingErrorAction.REPLACE;
        } else {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(((int) (byteBuffer.remaining() * ((onUnmappableCharacter.maxCharsPerByte() * 0.2f) + (onUnmappableCharacter.averageCharsPerByte() * 0.8f)))) + 10);
        while (true) {
            CoderResult decode = onUnmappableCharacter.decode(byteBuffer, allocate, true);
            allocate.flip();
            if (decode.isUnderflow()) {
                if (allocate.limit() != allocate.capacity()) {
                    return allocate;
                }
                CharBuffer put = CharBuffer.allocate(allocate.capacity() + 1).put(allocate);
                put.flip();
                return put;
            }
            if (decode.isOverflow()) {
                allocate = CharBuffer.allocate(allocate.capacity() + 10 + ((int) (onUnmappableCharacter.maxCharsPerByte() * byteBuffer.remaining()))).put(allocate);
            } else if (decode.isMalformed() || decode.isUnmappable()) {
                StringBuilder sb = new StringBuilder();
                int length = decode.length();
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X", Byte.valueOf(byteBuffer.get())));
                }
                String name = charset == null ? m47831 : charset.name();
                C22364 c223642 = this.f67846;
                int limit = allocate.limit();
                String sb2 = sb.toString();
                C12281 c122812 = C6241.f19132;
                c223642.m7269(limit, new C12281("compiler", "illegal.char.for.encoding", sb2, name));
                allocate.position(allocate.limit());
                allocate.limit(allocate.capacity());
                allocate.put((char) 65533);
            } else {
                throw new AssertionError(decode);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m47832(InputStream inputStream) {
        int available = inputStream.available();
        if (available < 1024) {
            available = 1024;
        }
        ByteBuffer m52535 = this.f67851.m52535(available);
        int i = 0;
        while (inputStream.available() != 0) {
            if (i >= available) {
                available <<= 1;
                m52535 = ByteBuffer.allocate(available).put((ByteBuffer) m52535.flip());
            }
            int read = inputStream.read(m52535.array(), i, available - i);
            if (read < 0) {
                break;
            }
            i += read;
            m52535.position(i);
        }
        return (ByteBuffer) m52535.flip();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47834(ByteBuffer byteBuffer) {
        this.f67851.m52536(byteBuffer);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC16866 m47830(String str) {
        EnumC16866 enumC16866 = EnumC16866.CLASS;
        if (str.endsWith(enumC16866.f51754)) {
            return enumC16866;
        }
        EnumC16866 enumC168662 = EnumC16866.SOURCE;
        if (str.endsWith(enumC168662.f51754)) {
            return enumC168662;
        }
        EnumC16866 enumC168663 = EnumC16866.HTML;
        return str.endsWith(enumC168663.f51754) ? enumC168663 : EnumC16866.OTHER;
    }
}
