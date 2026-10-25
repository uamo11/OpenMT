package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class AccessControlList implements Serializable, S3RequesterChargedResult {
    public static final long serialVersionUID = 8095040648034788376L;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Owner f533 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedList f534;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashSet f535;

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* renamed from: ֫ */
    public final void mo465(boolean z) {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Owner m522() {
        return this.f533;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m521(Owner owner) {
        this.f533 = owner;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m520() {
        HashSet hashSet = this.f535;
        if (hashSet != null && this.f534 != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
        if (this.f534 == null) {
            if (hashSet == null) {
                this.f534 = new LinkedList();
            } else {
                this.f534 = new LinkedList(this.f535);
                this.f535 = null;
            }
        }
        return this.f534;
    }

    public final int hashCode() {
        Owner owner = this.f533;
        int hashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        HashSet hashSet = this.f535;
        int hashCode2 = (hashCode + (hashSet == null ? 0 : hashSet.hashCode())) * 31;
        LinkedList linkedList = this.f534;
        return hashCode2 + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f533;
        if (owner == null) {
            if (accessControlList.f533 != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f533)) {
            return false;
        }
        HashSet hashSet = this.f535;
        if (hashSet == null) {
            if (accessControlList.f535 != null) {
                return false;
            }
        } else if (!hashSet.equals(accessControlList.f535)) {
            return false;
        }
        LinkedList linkedList = this.f534;
        return linkedList == null ? accessControlList.f534 == null : linkedList.equals(accessControlList.f534);
    }

    public final String toString() {
        return "AccessControlList [owner=" + this.f533 + ", grants=" + m520() + "]";
    }
}
