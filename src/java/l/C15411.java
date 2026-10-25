package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.nio.charset.CharacterCodingException;

/* compiled from: N6WI */
/* renamed from: l.ܶᩴۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15411 implements InterfaceC9294 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f47196;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4745[] f47197;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17095 f47198;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f47199;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f47200;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8629 f47201;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f47202;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f47203;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f47204;

    public C15411(String str, String str2, String[] strArr, C8629 c8629, boolean z, int[] iArr, long j, C4745[] c4745Arr, C17095 c17095) {
        this.f47196 = str2;
        this.f47204 = strArr;
        this.f47201 = c8629;
        this.f47199 = z;
        this.f47202 = iArr;
        this.f47200 = j;
        this.f47197 = c4745Arr;
        this.f47198 = c17095;
        this.f47203 = str;
    }

    @Override // l.InterfaceC9294
    /* renamed from: ֫ */
    public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) {
        C3059 m50415;
        C3059 m50414;
        C4745[] c4745Arr = this.f47197;
        String mo23554 = c14937.f45531.mo23554();
        this.f47203 = mo23554;
        C22468.m50412(mo23554);
        byte[] m52592 = C23879.m52592(c14937, 524288);
        C22468.m50412(this.f47203);
        try {
            C20268 m32047 = C13211.m32047(this.f47196, m52592);
            String str = m32047.f65503;
            String str2 = m32047.f65502;
            String[] strArr = this.f47204;
            strArr[0] = str2;
            try {
                C9335 m22390 = this.f47201.m22390(str, this.f47199);
                int m24027 = m22390.m24027();
                int[] iArr = this.f47202;
                iArr[0] = m24027;
                long j = this.f47200;
                if (j != -1 && j != m24027) {
                    throw C3059.m9365("FILE_TEXT_REPLACEMENT_COUNT_MISMATCH", "The selected replacement count differs from expectedReplacements. No changes were published.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, this.f47203).add("expectedReplacements", j).add("actualReplacements", iArr[0]));
                }
                if (m22390.m24028().equals(str)) {
                    bufferedOutputStream.write(m52592);
                } else {
                    try {
                        C4745 m32046 = C13211.m32046(10485760, m22390.m24028(), strArr[0]);
                        c4745Arr[0] = m32046;
                        if (!this.f47198.m40112(m32046.f15051)) {
                            throw C22468.m50410("FILE_TEXT_ENCODING_MISMATCH", "The replacement would change the physical BOM. Adjust the pattern or replacement text to preserve it.", this.f47203);
                        }
                        bufferedOutputStream.write(c4745Arr[0].f15051);
                    } catch (CharacterCodingException unused) {
                        throw C22468.m50410("FILE_TEXT_ENCODE_FAILED", "The replacement cannot be represented in the selected encoding.", this.f47203);
                    } catch (C3334 e) {
                        m50414 = C22468.m50414(this.f47203, JSON.value(e.f10537));
                        throw m50414;
                    }
                }
                C22468.m50412(this.f47203);
            } catch (C23445 e2) {
                m50415 = C22468.m50415(e2, this.f47203);
                throw m50415;
            }
        } catch (CharacterCodingException unused2) {
            throw C22468.m50410("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected encoding.", this.f47203);
        } catch (C22384 unused3) {
            throw C22468.m50410("FILE_TEXT_ENCODING_MISMATCH", "Copy the current file's encoding including its physical BOM.", this.f47203);
        }
    }

    @Override // l.InterfaceC9294
    /* renamed from: ֫ */
    public final void mo7074() {
        C22468.m50412(this.f47203);
    }
}
