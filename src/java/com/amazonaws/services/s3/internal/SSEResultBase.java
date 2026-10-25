package com.amazonaws.services.s3.internal;

/* loaded from: classes.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f509;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f510;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f511;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m480() {
        return this.f510;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo485(String str) {
        this.f510 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m481() {
        return this.f511;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo482(String str) {
        this.f511 = str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m483() {
        return this.f509;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo484(String str) {
        this.f509 = str;
    }
}
