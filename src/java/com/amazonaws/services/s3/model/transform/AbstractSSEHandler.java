package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.SSEResultBase;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public abstract ServerSideEncryptionResult mo701();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m702() {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 == null) {
            return null;
        }
        return ((SSEResultBase) mo701).m480();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ᩳ */
    public final void mo485(String str) {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 != null) {
            ((SSEResultBase) mo701).mo485(str);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String m704() {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 == null) {
            return null;
        }
        return ((SSEResultBase) mo701).m481();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ۧ */
    public final void mo482(String str) {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 != null) {
            ((SSEResultBase) mo701).mo482(str);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m703() {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 == null) {
            return null;
        }
        return ((SSEResultBase) mo701).m483();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* renamed from: ܿ */
    public final void mo484(String str) {
        ServerSideEncryptionResult mo701 = mo701();
        if (mo701 != null) {
            ((SSEResultBase) mo701).mo484(str);
        }
    }
}
