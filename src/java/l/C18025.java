package l;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: J8KC */
/* renamed from: l.ᩳۨ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18025 implements InterfaceC7276 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C19373 f56199 = new C19373(6);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaDrm f56200;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56201;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID f56202;

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final synchronized void mo19519() {
        int i = this.f56201 - 1;
        this.f56201 = i;
        if (i == 0) {
            this.f56200.release();
        }
    }

    @Override // l.InterfaceC7276
    /* renamed from: ᩳ */
    public final int mo19529() {
        return 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC7276 m42073(UUID uuid) {
        try {
            try {
                return new C18025(uuid);
            } catch (C20848 unused) {
                C19956.m46033("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new C12215();
            }
        } catch (UnsupportedSchemeException e) {
            throw new C20848(e);
        } catch (Exception e2) {
            throw new C20848(e2);
        }
    }

    public C18025(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C23875.f77201;
        C22632.m50630("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f56202 = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C23875.f77200)) ? uuid : uuid2);
        this.f56200 = mediaDrm;
        this.f56201 = 1;
        if (C23875.f77203.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final void mo19520(final InterfaceC11510 interfaceC11510) {
        this.f56200.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l.ۧۨ֫
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C18025 c18025 = C18025.this;
                InterfaceC11510 interfaceC115102 = interfaceC11510;
                c18025.getClass();
                HandlerC17154 handlerC17154 = ((C17860) interfaceC115102).f54545.f7505;
                handlerC17154.getClass();
                handlerC17154.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // l.InterfaceC7276
    /* renamed from: ܽ */
    public final byte[] mo19528() {
        return this.f56200.openSession();
    }

    @Override // l.InterfaceC7276
    /* renamed from: ᩳ */
    public final void mo19530(byte[] bArr) {
        this.f56200.closeSession(bArr);
    }

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final void mo19521(byte[] bArr, C13830 c13830) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C16613.m39136(this.f56200, bArr, c13830);
            } catch (UnsupportedOperationException unused) {
                C19956.m46037("setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0245, code lost:
    
        if (l.C11003.equals(r2, "aidl-1") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        if ("AFTT".equals(r7) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5865 mo19518(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18025.mo19518(byte[], java.util.List, int, java.util.HashMap):l.ۛۛ֫");
    }

    @Override // l.InterfaceC7276
    /* renamed from: ۧ */
    public final byte[] mo19526(byte[] bArr, byte[] bArr2) {
        if (C23875.f77200.equals(this.f56202) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(C3603.m11021(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                C19956.m46034("Failed to adjust response data: ".concat(C3603.m11021(bArr2)), e);
            }
        }
        return this.f56200.provideKeyResponse(bArr, bArr2);
    }

    @Override // l.InterfaceC7276
    /* renamed from: ۧ */
    public final C13625 mo19524() {
        MediaDrm.ProvisionRequest provisionRequest = this.f56200.getProvisionRequest();
        return new C13625(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // l.InterfaceC7276
    /* renamed from: ۧ */
    public final void mo19525(byte[] bArr) {
        this.f56200.provideProvisionResponse(bArr);
    }

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final Map mo19517(byte[] bArr) {
        return this.f56200.queryKeyStatus(bArr);
    }

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final boolean mo19523(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f56202;
        if (i >= 31) {
            boolean equals2 = uuid.equals(C23875.f77203);
            MediaDrm mediaDrm = this.f56200;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(C23875.f77200);
            }
            if (equals) {
                return C16613.m39137(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !C11003.equals(uuid, C23875.f77200)) ? uuid : C23875.f77201, bArr);
            } catch (MediaCryptoException unused) {
            }
        } catch (Throwable th) {
            th = th;
            mediaCrypto = mediaCrypto2;
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(C23875.f77200);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (mediaCrypto != null) {
                mediaCrypto.release();
            }
            throw th;
        }
    }

    @Override // l.InterfaceC7276
    /* renamed from: ֫ */
    public final void mo19522(byte[] bArr, byte[] bArr2) {
        this.f56200.restoreKeys(bArr, bArr2);
    }

    @Override // l.InterfaceC7276
    /* renamed from: ܽ */
    public final InterfaceC19021 mo19527(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f56202;
        if (i < 27 && C11003.equals(uuid, C23875.f77200)) {
            uuid = C23875.f77201;
        }
        return new C1797(uuid, bArr);
    }
}
