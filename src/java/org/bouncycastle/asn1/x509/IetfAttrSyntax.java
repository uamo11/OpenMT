package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes.dex */
public class IetfAttrSyntax extends ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    public GeneralNames policyAuthority;
    public int valueChoice;
    public Vector values = new Vector();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IetfAttrSyntax(org.bouncycastle.asn1.ASN1Sequence r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.policyAuthority = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r3.values = r0
            r0 = -1
            r3.valueChoice = r0
            r0 = 0
            org.bouncycastle.asn1.ASN1Encodable r1 = r4.getObjectAt(r0)
            boolean r1 = r1 instanceof org.bouncycastle.asn1.ASN1TaggedObject
            r2 = 2
            if (r1 == 0) goto L25
            org.bouncycastle.asn1.ASN1Encodable r1 = r4.getObjectAt(r0)
            org.bouncycastle.asn1.ASN1TaggedObject r1 = (org.bouncycastle.asn1.ASN1TaggedObject) r1
            org.bouncycastle.asn1.x509.GeneralNames r0 = org.bouncycastle.asn1.x509.GeneralNames.getInstance(r1, r0)
            goto L33
        L25:
            int r1 = r4.size()
            if (r1 != r2) goto L36
            org.bouncycastle.asn1.ASN1Encodable r0 = r4.getObjectAt(r0)
            org.bouncycastle.asn1.x509.GeneralNames r0 = org.bouncycastle.asn1.x509.GeneralNames.getInstance(r0)
        L33:
            r3.policyAuthority = r0
            r0 = 1
        L36:
            org.bouncycastle.asn1.ASN1Encodable r1 = r4.getObjectAt(r0)
            boolean r1 = r1 instanceof org.bouncycastle.asn1.ASN1Sequence
            if (r1 == 0) goto L86
            org.bouncycastle.asn1.ASN1Encodable r4 = r4.getObjectAt(r0)
            org.bouncycastle.asn1.ASN1Sequence r4 = (org.bouncycastle.asn1.ASN1Sequence) r4
            java.util.Enumeration r4 = r4.getObjects()
        L48:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.nextElement()
            org.bouncycastle.asn1.ASN1Primitive r0 = (org.bouncycastle.asn1.ASN1Primitive) r0
            boolean r1 = r0 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier
            if (r1 == 0) goto L5a
            r1 = 2
            goto L65
        L5a:
            boolean r1 = r0 instanceof org.bouncycastle.asn1.ASN1UTF8String
            if (r1 == 0) goto L60
            r1 = 3
            goto L65
        L60:
            boolean r1 = r0 instanceof org.bouncycastle.asn1.DEROctetString
            if (r1 == 0) goto L7d
            r1 = 1
        L65:
            int r2 = r3.valueChoice
            if (r2 >= 0) goto L6b
            r3.valueChoice = r1
        L6b:
            int r2 = r3.valueChoice
            if (r1 != r2) goto L75
            java.util.Vector r1 = r3.values
            r1.addElement(r0)
            goto L48
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Mix of value types in IetfAttrSyntax"
            r4.<init>(r0)
            throw r4
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad value type encoding IetfAttrSyntax"
            r4.<init>(r0)
            throw r4
        L85:
            return
        L86:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-IetfAttrSyntax encoding"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.IetfAttrSyntax.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }

    public static IetfAttrSyntax getInstance(Object obj) {
        if (obj instanceof IetfAttrSyntax) {
            return (IetfAttrSyntax) obj;
        }
        if (obj != null) {
            return new IetfAttrSyntax(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getPolicyAuthority() {
        return this.policyAuthority;
    }

    public int getValueType() {
        return this.valueChoice;
    }

    public Object[] getValues() {
        int i = 0;
        if (getValueType() == 1) {
            int size = this.values.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i != size) {
                aSN1OctetStringArr[i] = (ASN1OctetString) this.values.elementAt(i);
                i++;
            }
            return aSN1OctetStringArr;
        }
        if (getValueType() == 2) {
            int size2 = this.values.size();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size2];
            while (i != size2) {
                aSN1ObjectIdentifierArr[i] = (ASN1ObjectIdentifier) this.values.elementAt(i);
                i++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = this.values.size();
        ASN1UTF8String[] aSN1UTF8StringArr = new ASN1UTF8String[size3];
        while (i != size3) {
            aSN1UTF8StringArr[i] = (ASN1UTF8String) this.values.elementAt(i);
            i++;
        }
        return aSN1UTF8StringArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralNames generalNames = this.policyAuthority;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, generalNames));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(this.values.size());
        Enumeration elements = this.values.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector2.add((ASN1Encodable) elements.nextElement());
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
