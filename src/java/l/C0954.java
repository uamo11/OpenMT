package l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* compiled from: J8I9 */
/* renamed from: l.֨ۜۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0954 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final float[] f3585 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final float[] f3586 = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final float[] f3587 = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5188 f3588;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f3589;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f3590;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f3591;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f3592;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f3593;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15721 f3594;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f3595;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3379(C19300 c19300) {
        C3777 c3777 = c19300.f60708;
        C3777 c37772 = c19300.f60709;
        return c3777.m11433() == 1 && c3777.m11432().f57674 == 0 && c37772.m11433() == 1 && c37772.m11432().f57674 == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3382(C19300 c19300) {
        if (m3379(c19300)) {
            this.f3593 = c19300.f60711;
            this.f3588 = new C5188(c19300.f60708.m11432());
            if (c19300.f60710) {
                return;
            }
            new C5188(c19300.f60709.m11432());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3380() {
        try {
            C15721 c15721 = new C15721("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f3594 = c15721;
            this.f3590 = c15721.m37096("uMvpMatrix");
            this.f3589 = this.f3594.m37096("uTexMatrix");
            this.f3592 = this.f3594.m37095("aPosition");
            this.f3591 = this.f3594.m37095("aTexCoords");
            this.f3595 = this.f3594.m37096("uTexture");
        } catch (C2317 unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3381(int i, float[] fArr) {
        float[] fArr2;
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        int i2;
        int i3;
        C5188 c5188 = this.f3588;
        if (c5188 == null) {
            return;
        }
        int i4 = this.f3593;
        if (i4 == 1) {
            fArr2 = f3586;
        } else if (i4 == 2) {
            fArr2 = f3587;
        } else {
            fArr2 = f3585;
        }
        GLES20.glUniformMatrix3fv(this.f3589, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f3590, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f3595, 0);
        try {
            C3728.m11335();
        } catch (C2317 unused) {
        }
        int i5 = this.f3592;
        floatBuffer = c5188.f16265;
        GLES20.glVertexAttribPointer(i5, 3, 5126, false, 12, (Buffer) floatBuffer);
        try {
            C3728.m11335();
        } catch (C2317 unused2) {
        }
        int i6 = this.f3591;
        floatBuffer2 = c5188.f16264;
        GLES20.glVertexAttribPointer(i6, 2, 5126, false, 8, (Buffer) floatBuffer2);
        try {
            C3728.m11335();
        } catch (C2317 unused3) {
        }
        i2 = c5188.f16263;
        i3 = c5188.f16266;
        GLES20.glDrawArrays(i2, 0, i3);
        try {
            C3728.m11335();
        } catch (C2317 unused4) {
        }
    }
}
