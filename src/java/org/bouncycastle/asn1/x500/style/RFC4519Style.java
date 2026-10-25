package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import java.util.Hashtable;
import l.C22870;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: classes.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    public static final Hashtable DefaultLookUp;
    public static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f77969l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    public final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    public final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier m50969 = C22870.m50969("2.5.4.15");
        businessCategory = m50969;
        ASN1ObjectIdentifier m509692 = C22870.m50969("2.5.4.6");
        c = m509692;
        ASN1ObjectIdentifier m509693 = C22870.m50969("2.5.4.3");
        cn = m509693;
        ASN1ObjectIdentifier m509694 = C22870.m50969("0.9.2342.19200300.100.1.25");
        dc = m509694;
        ASN1ObjectIdentifier m509695 = C22870.m50969("2.5.4.13");
        description = m509695;
        ASN1ObjectIdentifier m509696 = C22870.m50969("2.5.4.27");
        destinationIndicator = m509696;
        ASN1ObjectIdentifier m509697 = C22870.m50969("2.5.4.49");
        distinguishedName = m509697;
        ASN1ObjectIdentifier m509698 = C22870.m50969("2.5.4.46");
        dnQualifier = m509698;
        ASN1ObjectIdentifier m509699 = C22870.m50969("2.5.4.47");
        enhancedSearchGuide = m509699;
        ASN1ObjectIdentifier m5096910 = C22870.m50969("2.5.4.23");
        facsimileTelephoneNumber = m5096910;
        ASN1ObjectIdentifier m5096911 = C22870.m50969("2.5.4.44");
        generationQualifier = m5096911;
        ASN1ObjectIdentifier m5096912 = C22870.m50969("2.5.4.42");
        givenName = m5096912;
        ASN1ObjectIdentifier m5096913 = C22870.m50969("2.5.4.51");
        houseIdentifier = m5096913;
        ASN1ObjectIdentifier m5096914 = C22870.m50969("2.5.4.43");
        initials = m5096914;
        ASN1ObjectIdentifier m5096915 = C22870.m50969("2.5.4.25");
        internationalISDNNumber = m5096915;
        ASN1ObjectIdentifier m5096916 = C22870.m50969("2.5.4.7");
        f77969l = m5096916;
        ASN1ObjectIdentifier m5096917 = C22870.m50969("2.5.4.31");
        member = m5096917;
        ASN1ObjectIdentifier m5096918 = C22870.m50969("2.5.4.41");
        name = m5096918;
        ASN1ObjectIdentifier m5096919 = C22870.m50969("2.5.4.10");
        o = m5096919;
        ASN1ObjectIdentifier m5096920 = C22870.m50969("2.5.4.11");
        ou = m5096920;
        ASN1ObjectIdentifier m5096921 = C22870.m50969("2.5.4.32");
        owner = m5096921;
        ASN1ObjectIdentifier m5096922 = C22870.m50969("2.5.4.19");
        physicalDeliveryOfficeName = m5096922;
        ASN1ObjectIdentifier m5096923 = C22870.m50969("2.5.4.16");
        postalAddress = m5096923;
        ASN1ObjectIdentifier m5096924 = C22870.m50969("2.5.4.17");
        postalCode = m5096924;
        ASN1ObjectIdentifier m5096925 = C22870.m50969("2.5.4.18");
        postOfficeBox = m5096925;
        ASN1ObjectIdentifier m5096926 = C22870.m50969("2.5.4.28");
        preferredDeliveryMethod = m5096926;
        ASN1ObjectIdentifier m5096927 = C22870.m50969("2.5.4.26");
        registeredAddress = m5096927;
        ASN1ObjectIdentifier m5096928 = C22870.m50969("2.5.4.33");
        roleOccupant = m5096928;
        ASN1ObjectIdentifier m5096929 = C22870.m50969("2.5.4.14");
        searchGuide = m5096929;
        ASN1ObjectIdentifier m5096930 = C22870.m50969("2.5.4.34");
        seeAlso = m5096930;
        ASN1ObjectIdentifier m5096931 = C22870.m50969("2.5.4.5");
        serialNumber = m5096931;
        ASN1ObjectIdentifier m5096932 = C22870.m50969("2.5.4.4");
        sn = m5096932;
        ASN1ObjectIdentifier m5096933 = C22870.m50969("2.5.4.8");
        st = m5096933;
        ASN1ObjectIdentifier m5096934 = C22870.m50969("2.5.4.9");
        street = m5096934;
        ASN1ObjectIdentifier m5096935 = C22870.m50969("2.5.4.20");
        telephoneNumber = m5096935;
        ASN1ObjectIdentifier m5096936 = C22870.m50969("2.5.4.22");
        teletexTerminalIdentifier = m5096936;
        ASN1ObjectIdentifier m5096937 = C22870.m50969("2.5.4.21");
        telexNumber = m5096937;
        ASN1ObjectIdentifier m5096938 = C22870.m50969("2.5.4.12");
        title = m5096938;
        ASN1ObjectIdentifier m5096939 = C22870.m50969("0.9.2342.19200300.100.1.1");
        uid = m5096939;
        ASN1ObjectIdentifier m5096940 = C22870.m50969("2.5.4.50");
        uniqueMember = m5096940;
        ASN1ObjectIdentifier m5096941 = C22870.m50969("2.5.4.35");
        userPassword = m5096941;
        ASN1ObjectIdentifier m5096942 = C22870.m50969("2.5.4.24");
        x121Address = m5096942;
        ASN1ObjectIdentifier m5096943 = C22870.m50969("2.5.4.45");
        x500UniqueIdentifier = m5096943;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(m50969, "businessCategory");
        hashtable.put(m509692, am.aF);
        hashtable.put(m509693, "cn");
        hashtable.put(m509694, "dc");
        hashtable.put(m509695, "description");
        hashtable.put(m509696, "destinationIndicator");
        hashtable.put(m509697, "distinguishedName");
        hashtable.put(m509698, "dnQualifier");
        hashtable.put(m509699, "enhancedSearchGuide");
        hashtable.put(m5096910, "facsimileTelephoneNumber");
        hashtable.put(m5096911, "generationQualifier");
        hashtable.put(m5096912, "givenName");
        hashtable.put(m5096913, "houseIdentifier");
        hashtable.put(m5096914, "initials");
        hashtable.put(m5096915, "internationalISDNNumber");
        hashtable.put(m5096916, "l");
        hashtable.put(m5096917, "member");
        hashtable.put(m5096918, "name");
        hashtable.put(m5096919, "o");
        hashtable.put(m5096920, "ou");
        hashtable.put(m5096921, "owner");
        hashtable.put(m5096922, "physicalDeliveryOfficeName");
        hashtable.put(m5096923, "postalAddress");
        hashtable.put(m5096924, "postalCode");
        hashtable.put(m5096925, "postOfficeBox");
        hashtable.put(m5096926, "preferredDeliveryMethod");
        hashtable.put(m5096927, "registeredAddress");
        hashtable.put(m5096928, "roleOccupant");
        hashtable.put(m5096929, "searchGuide");
        hashtable.put(m5096930, "seeAlso");
        hashtable.put(m5096931, "serialNumber");
        hashtable.put(m5096932, "sn");
        hashtable.put(m5096933, "st");
        hashtable.put(m5096934, "street");
        hashtable.put(m5096935, "telephoneNumber");
        hashtable.put(m5096936, "teletexTerminalIdentifier");
        hashtable.put(m5096937, "telexNumber");
        hashtable.put(m5096938, "title");
        hashtable.put(m5096939, DhizukuVariables.PARAM_CLIENT_UID);
        hashtable.put(m5096940, "uniqueMember");
        hashtable.put(m5096941, "userPassword");
        hashtable.put(m5096942, "x121Address");
        hashtable.put(m5096943, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", m50969);
        hashtable2.put(am.aF, m509692);
        hashtable2.put("cn", m509693);
        hashtable2.put("dc", m509694);
        hashtable2.put("description", m509695);
        hashtable2.put("destinationindicator", m509696);
        hashtable2.put("distinguishedname", m509697);
        hashtable2.put("dnqualifier", m509698);
        hashtable2.put("enhancedsearchguide", m509699);
        hashtable2.put("facsimiletelephonenumber", m5096910);
        hashtable2.put("generationqualifier", m5096911);
        hashtable2.put("givenname", m5096912);
        hashtable2.put("houseidentifier", m5096913);
        hashtable2.put("initials", m5096914);
        hashtable2.put("internationalisdnnumber", m5096915);
        hashtable2.put("l", m5096916);
        hashtable2.put("member", m5096917);
        hashtable2.put("name", m5096918);
        hashtable2.put("o", m5096919);
        hashtable2.put("ou", m5096920);
        hashtable2.put("owner", m5096921);
        hashtable2.put("physicaldeliveryofficename", m5096922);
        hashtable2.put("postaladdress", m5096923);
        hashtable2.put("postalcode", m5096924);
        hashtable2.put("postofficebox", m5096925);
        hashtable2.put("preferreddeliverymethod", m5096926);
        hashtable2.put("registeredaddress", m5096927);
        hashtable2.put("roleoccupant", m5096928);
        hashtable2.put("searchguide", m5096929);
        hashtable2.put("seealso", m5096930);
        hashtable2.put("serialnumber", m5096931);
        hashtable2.put("sn", m5096932);
        hashtable2.put("st", m5096933);
        hashtable2.put("street", m5096934);
        hashtable2.put("telephonenumber", m5096935);
        hashtable2.put("teletexterminalidentifier", m5096936);
        hashtable2.put("telexnumber", m5096937);
        hashtable2.put("title", m5096938);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, m5096939);
        hashtable2.put("uniquemember", m5096940);
        hashtable2.put("userpassword", m5096941);
        hashtable2.put("x121address", m5096942);
        hashtable2.put("x500uniqueidentifier", m5096943);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rDNsFromString.length];
        for (int i = 0; i != rDNsFromString.length; i++) {
            rdnArr[(r0 - i) - 1] = rDNsFromString[i];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuilder sb = new StringBuilder();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            IETFUtils.appendRDN(sb, rDNs[length], this.defaultSymbols);
        }
        return sb.toString();
    }
}
