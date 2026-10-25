package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import l.C3261;
import l.C5368;

/* loaded from: classes.dex */
public class QueryStringSigner extends AbstractAWSSigner implements Signer {
    public Date overriddenDate;

    @Override // com.amazonaws.auth.Signer
    public void sign(Request request, AWSCredentials aWSCredentials) {
        sign(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, aWSCredentials);
    }

    public void sign(Request request, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, AWSCredentials aWSCredentials) {
        String calculateStringToSignV2;
        AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.m189("AWSAccessKeyId", sanitizeCredentials.mo206());
        defaultRequest.m189("SignatureVersion", signatureVersion.toString());
        defaultRequest.m189("Timestamp", getFormattedTimestamp(getTimeOffset(defaultRequest)));
        if (sanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(defaultRequest, (AWSSessionCredentials) sanitizeCredentials);
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            calculateStringToSignV2 = calculateStringToSignV1(defaultRequest.m190());
        } else if (signatureVersion.equals(SignatureVersion.V2)) {
            defaultRequest.m189("SignatureMethod", signingAlgorithm.toString());
            calculateStringToSignV2 = calculateStringToSignV2(defaultRequest);
        } else {
            throw new AmazonClientException("Invalid Signature Version specified");
        }
        defaultRequest.m189("Signature", signAndBase64Encode(calculateStringToSignV2, sanitizeCredentials.mo207(), signingAlgorithm));
    }

    private String calculateStringToSignV1(Map map) {
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    private String calculateStringToSignV2(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return "POST\n" + getCanonicalizedEndpoint(defaultRequest.m188()) + "\n" + getCanonicalizedResourcePath(defaultRequest) + "\n" + getCanonicalizedQueryString(defaultRequest.m190());
    }

    private String getCanonicalizedResourcePath(Request request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String str = "";
        if (defaultRequest.m188().getPath() != null) {
            str = "" + defaultRequest.m188().getPath();
        }
        if (defaultRequest.m195() != null) {
            if (str.length() > 0 && !str.endsWith("/") && !defaultRequest.m195().startsWith("/")) {
                str = str.concat("/");
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(defaultRequest.m195());
            str = m15339.toString();
        } else if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return str.startsWith("//") ? str.substring(1) : str;
    }

    private String getFormattedTimestamp(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        Date date = this.overriddenDate;
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return simpleDateFormat.format(getSignatureDate(j));
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    @Override // com.amazonaws.auth.AbstractAWSSigner
    public void addSessionCredentials(Request request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).m189("SecurityToken", aWSSessionCredentials.mo209());
    }
}
