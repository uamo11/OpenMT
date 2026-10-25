/* Decompiled from: libmt2.so */
/* Target Architecture: ARM64 */

#include <stdint.h>
#include <stdbool.h>

// Address: 0x39D0 | Function: sub_39D0
__int64 sub_39D0()
{
  return __cxa_finalize(&off_110F0);
}


// Address: 0x39E0 | Function: sub_39E0
void sub_39E0()
{
  ;
}


// Address: 0x39E8 | Function: sub_39E8
__int64 sub_39E8()
{
  return sub_CB48();
}


// Address: 0x39F0 | Function: sub_39F0
__int64 (*__fastcall sub_39F0(__int64 (*result)(void)))(void)
{
  if ( result != nullptr )
    return (__int64 (*)(void))result();
  return result;
}


// Address: 0x3A04 | Function: sub_3A04
__int64 __fastcall sub_3A04(void *obj)
{
  return __cxa_atexit((void (*)(void *))sub_39F0, obj, &off_110F0);
}


// Address: 0x3A20 | Function: sub_3A20
__int64 __fastcall sub_3A20(char a1)
{
  int v2; // w20
  int *v3; // x0
  int v4; // w8
  __int64 result; // x0
  int v6; // w8
  int *v7; // x20
  int v8; // w9
  int *v9; // x8
  int v10; // w0
  __int16 v11; // w9
  unsigned __int64 v12; // x9
  unsigned __int64 v13; // x9
  _QWORD *v14; // x10
  int v15; // w8
  int v16; // w0
  int v17; // w0
  int v18; // w0
  int v19; // w0
  int v20; // w0
  int v21; // w0
  int v22; // w0
  int v23; // w0
  int v24; // w0
  int v25; // w0
  int v26; // w0
  int v27; // w0
  int v28; // w0
  int v29; // w0
  int v30; // w0
  int v31; // w0
  int v32; // w0
  int v33; // w0
  int v34; // w0
  int v35; // w0
  int v36; // w0
  int v37; // w0
  int v38; // w0
  int v39; // w0
  int v40; // w0
  int v41; // w0
  int v42; // w0
  unsigned __int64 v43; // [xsp+0h] [xbp-420h] BYREF
  __int16 v44; // [xsp+8h] [xbp-418h] BYREF
  _QWORD *v45; // [xsp+10h] [xbp-410h]
  _QWORD v46[129]; // [xsp+18h] [xbp-408h] BYREF

  v46[128] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v2 = prctl(38, 1, 0, 0, 0);
  v3 = (int *)__errno();
  if ( v2 != 0 )
  {
    v4 = *v3;
LABEL_3:
    result = 0xFFFFFFFFLL;
    if ( v4 != 22 && v4 != 38 )
    {
      v6 = v4 & ~(v4 >> 31);
      return (unsigned int)(-1000 - v6);
    }
    return result;
  }
  v7 = v3;
  *v3 = 0;
  if ( syscall(277, 1, 0, 0) == -1 )
  {
    v4 = *v7;
    if ( *v7 != 14 )
      goto LABEL_3;
    *v7 = 0;
    if ( syscall(277, 1, 1, 0) == -1 )
    {
      v8 = *v7;
      if ( *v7 == 14 )
      {
        v9 = v7;
        v46[0] = 0x400000020LL;
        v46[1] = 0xC00000B700010015LL;
        v43 = 4;
        v46[2] = 0x8000000000000006LL;
        v46[3] = 32;
        if ( (a1 & 1) != 0 )
        {
          v46[4] = 0xDD01000015LL;
          v46[5] = 0x5000100000006LL;
          v46[8] = 0x1B301000015LL;
          v46[9] = 0x5000100000006LL;
          v46[6] = 0x11901000015LL;
          v46[7] = 0x5000100000006LL;
          v43 = 10;
          v10 = sub_404C(v46, &v43);
          v9 = v7;
          if ( v10 == 0 )
            goto LABEL_35;
        }
        if ( (a1 & 2) != 0 )
        {
          v12 = v43;
          if ( v43 > 0x7F )
            goto LABEL_34;
          v46[v43] = 0x3D01000015LL;
          if ( v12 == 127 )
            goto LABEL_34;
          v43 = v12 + 2;
          v46[v12 + 1] = 0x5000100000006LL;
          if ( (a1 & 4) == 0 )
            goto LABEL_21;
        }
        else if ( (a1 & 4) == 0 )
        {
          goto LABEL_21;
        }
        v13 = v43;
        if ( v43 > 0x7F )
          goto LABEL_34;
        v46[v43] = 0xC601000015LL;
        if ( v13 == 127 )
          goto LABEL_34;
        v46[v13 + 1] = 0x5000100000006LL;
        if ( v13 > 0x7D )
          goto LABEL_34;
        v14 = &v46[v13];
        v14[2] = 0xCB01000015LL;
        if ( v13 == 125 )
          goto LABEL_34;
        v43 = v13 + 4;
        *((_DWORD *)v14 + 6) = 6;
        *((_DWORD *)v14 + 7) = 327681;
        v39 = sub_3FC0(v46, &v43, 200);
        v9 = v7;
        if ( v39 == 0 )
          goto LABEL_35;
        v40 = sub_3FC0(v46, &v43, 201);
        v9 = v7;
        if ( v40 == 0 )
          goto LABEL_35;
        v41 = sub_3FC0(v46, &v43, 202);
        v9 = v7;
        if ( v41 == 0 )
          goto LABEL_35;
        v42 = sub_3FC0(v46, &v43, 242);
        v9 = v7;
        if ( v42 == 0 )
          goto LABEL_35;
LABEL_21:
        if ( (a1 & 8) != 0 )
        {
          v16 = sub_3FC0(v46, &v43, 35);
          v9 = v7;
          if ( v16 == 0 )
            goto LABEL_35;
          v17 = sub_3FC0(v46, &v43, 38);
          v9 = v7;
          if ( v17 == 0 )
            goto LABEL_35;
          v18 = sub_3FC0(v46, &v43, 276);
          v9 = v7;
          if ( v18 == 0 )
            goto LABEL_35;
          v19 = sub_3FC0(v46, &v43, 45);
          v9 = v7;
          if ( v19 == 0 )
            goto LABEL_35;
          v20 = sub_3FC0(v46, &v43, 46);
          v9 = v7;
          if ( v20 == 0 )
            goto LABEL_35;
          v21 = sub_431C(v46, &v43);
          v9 = v7;
          if ( v21 == 0 )
            goto LABEL_35;
          v22 = sub_3FC0(v46, &v43, 437);
          v9 = v7;
          if ( v22 == 0 )
            goto LABEL_35;
          v23 = sub_3FC0(v46, &v43, 34);
          v9 = v7;
          if ( v23 == 0 )
            goto LABEL_35;
          v24 = sub_3FC0(v46, &v43, 33);
          v9 = v7;
          if ( v24 == 0 )
            goto LABEL_35;
          v25 = sub_3FC0(v46, &v43, 36);
          v9 = v7;
          if ( v25 == 0 )
            goto LABEL_35;
          v26 = sub_3FC0(v46, &v43, 37);
          v9 = v7;
          if ( v26 == 0 )
            goto LABEL_35;
          v27 = sub_3FC0(v46, &v43, 52);
          v9 = v7;
          if ( v27 == 0 )
            goto LABEL_35;
          v28 = sub_3FC0(v46, &v43, 53);
          v9 = v7;
          if ( v28 == 0 )
            goto LABEL_35;
          v29 = sub_3FC0(v46, &v43, 452);
          v9 = v7;
          if ( v29 == 0 )
            goto LABEL_35;
          v30 = sub_3FC0(v46, &v43, 55);
          v9 = v7;
          if ( v30 == 0 )
            goto LABEL_35;
          v31 = sub_3FC0(v46, &v43, 54);
          v9 = v7;
          if ( v31 == 0 )
            goto LABEL_35;
          v32 = sub_3FC0(v46, &v43, 88);
          v9 = v7;
          if ( v32 == 0 )
            goto LABEL_35;
          v33 = sub_3FC0(v46, &v43, 5);
          v9 = v7;
          if ( v33 == 0 )
            goto LABEL_35;
          v34 = sub_3FC0(v46, &v43, 6);
          v9 = v7;
          if ( v34 == 0 )
            goto LABEL_35;
          v35 = sub_3FC0(v46, &v43, 7);
          v9 = v7;
          if ( v35 == 0 )
            goto LABEL_35;
          v36 = sub_3FC0(v46, &v43, 14);
          v9 = v7;
          if ( v36 == 0 )
            goto LABEL_35;
          v37 = sub_3FC0(v46, &v43, 15);
          v9 = v7;
          if ( v37 == 0 )
            goto LABEL_35;
          v38 = sub_3FC0(v46, &v43, 16);
          v9 = v7;
          if ( v38 == 0 )
            goto LABEL_35;
        }
        v11 = v43;
        if ( v43 < 0x80 )
        {
          v46[v43] = 0x7FFF000000000006LL;
          v44 = v11 + 1;
          v45 = v46;
          *v9 = 0;
          result = syscall(277, 1, 1, &v44);
          if ( result == 0 )
            return result;
          if ( result >= 1 )
            return (unsigned int)(-200000 - result);
          v15 = *v7;
          goto LABEL_36;
        }
LABEL_34:
        *v9 = 7;
LABEL_35:
        v15 = *v9;
LABEL_36:
        if ( v15 != 0 )
          return -1000 - (v15 & (unsigned int)~(v15 >> 31));
        else
          return 4294966274LL;
      }
      if ( v8 == 38 )
        return 0xFFFFFFFFLL;
      if ( v8 != 22 )
      {
        v6 = v8 & ~(v8 >> 31);
        return (unsigned int)(-1000 - v6);
      }
      return 4294967294LL;
    }
  }
  return 4294966274LL;
}


// Address: 0x3FB8 | Function: Java_bin_mt_plus_Features2_installSeccomp
__int64 __fastcall Java_bin_mt_plus_Features2_installSeccomp(__int64 a1, __int64 a2, char a3)
{
  return sub_3A20(a3);
}


// Address: 0x3FC0 | Function: sub_3FC0
__int64 __fastcall sub_3FC0(__int64 a1, unsigned __int64 *a2, int a3)
{
  unsigned __int64 v3; // x8
  __int64 v4; // x10
  unsigned __int64 v5; // x8
  _DWORD *v6; // x8
  unsigned __int64 v8; // x9
  _DWORD *v9; // x8

  v3 = *a2;
  if ( *a2 < 0x80
    && (v4 = a1 + 8 * v3,
        *a2 = v3 + 1,
        *(_WORD *)(v4 + 2) = 256,
        v5 = *a2,
        *(_WORD *)v4 = 21,
        *(_DWORD *)(v4 + 4) = a3,
        v5 < 0x80) )
  {
    v8 = v5 + 1;
    v9 = (_DWORD *)(a1 + 8 * v5);
    *a2 = v8;
    *v9 = 6;
    v9[1] = 327681;
    return 1;
  }
  else
  {
    v6 = (_DWORD *)__errno();
    *v6 = 7;
    return 0;
  }
}


// Address: 0x404C | Function: sub_404C
__int64 __fastcall sub_404C(__int64 a1, unsigned __int64 *a2)
{
  unsigned __int64 v2; // x8
  __int64 v3; // x10
  unsigned __int64 v4; // x8
  __int64 v5; // x10
  unsigned __int64 v6; // x8
  __int64 v7; // x10
  unsigned __int64 v8; // x8
  __int64 v9; // x10
  unsigned __int64 v10; // x9
  __int64 v11; // x11
  unsigned __int64 v12; // x9
  __int64 v13; // x11
  unsigned __int64 v14; // x9
  __int64 v15; // x11
  unsigned __int64 v16; // x9
  __int64 v17; // x11
  unsigned __int64 v18; // x9
  __int64 v19; // x11
  unsigned __int64 v20; // x9
  __int64 v21; // x11
  unsigned __int64 v22; // x9
  __int64 v23; // x11
  unsigned __int64 v24; // x9
  __int64 v25; // x11
  unsigned __int64 v26; // x9
  __int64 v27; // x11
  unsigned __int64 v28; // x9
  __int64 v29; // x11
  unsigned __int64 v30; // x10
  _DWORD *v31; // x8
  unsigned __int64 v33; // x8
  _DWORD *v34; // x10

  v2 = *a2;
  if ( *a2 >= 0x80 )
    goto LABEL_16;
  v3 = a1 + 8 * v2;
  *a2 = v2 + 1;
  *(_WORD *)(v3 + 2) = 3584;
  v4 = *a2;
  *(_WORD *)v3 = 21;
  *(_DWORD *)(v3 + 4) = 220;
  if ( v4 >= 0x80 )
    goto LABEL_16;
  v5 = a1 + 8 * v4;
  *a2 = v4 + 1;
  *(_WORD *)(v5 + 2) = 0;
  v6 = *a2;
  *(_WORD *)v5 = 32;
  *(_DWORD *)(v5 + 4) = 16;
  if ( v6 >= 0x80 )
    goto LABEL_16;
  v7 = a1 + 8 * v6;
  *a2 = v6 + 1;
  *(_WORD *)(v7 + 2) = 1;
  v8 = *a2;
  *(_WORD *)v7 = 69;
  *(_DWORD *)(v7 + 4) = 0x10000;
  if ( v8 >= 0x80 )
    goto LABEL_16;
  v9 = a1 + 8 * v8;
  *a2 = v8 + 1;
  *(_WORD *)(v9 + 2) = 0;
  v10 = *a2;
  *(_WORD *)v9 = 6;
  *(_DWORD *)(v9 + 4) = 327681;
  if ( v10 >= 0x80 )
    goto LABEL_16;
  v11 = a1 + 8 * v10;
  *a2 = v10 + 1;
  *(_WORD *)(v11 + 2) = 1;
  v12 = *a2;
  *(_WORD *)v11 = 69;
  *(_DWORD *)(v11 + 4) = 256;
  if ( v12 >= 0x80 )
    goto LABEL_16;
  v13 = a1 + 8 * v12;
  *a2 = v12 + 1;
  *(_WORD *)(v13 + 2) = 0;
  v14 = *a2;
  *(_WORD *)v13 = 6;
  *(_DWORD *)(v13 + 4) = 327681;
  if ( v14 >= 0x80 )
    goto LABEL_16;
  v15 = a1 + 8 * v14;
  *a2 = v14 + 1;
  *(_WORD *)(v15 + 2) = 1;
  v16 = *a2;
  *(_WORD *)v15 = 69;
  *(_DWORD *)(v15 + 4) = 512;
  if ( v16 >= 0x80 )
    goto LABEL_16;
  v17 = a1 + 8 * v16;
  *a2 = v16 + 1;
  *(_WORD *)(v17 + 2) = 0;
  v18 = *a2;
  *(_WORD *)v17 = 6;
  *(_DWORD *)(v17 + 4) = 327681;
  if ( v18 >= 0x80 )
    goto LABEL_16;
  v19 = a1 + 8 * v18;
  *a2 = v18 + 1;
  *(_WORD *)(v19 + 2) = 1;
  v20 = *a2;
  *(_WORD *)v19 = 69;
  *(_DWORD *)(v19 + 4) = 1024;
  if ( v20 >= 0x80 )
    goto LABEL_16;
  v21 = a1 + 8 * v20;
  *a2 = v20 + 1;
  *(_WORD *)(v21 + 2) = 0;
  v22 = *a2;
  *(_WORD *)v21 = 6;
  *(_DWORD *)(v21 + 4) = 327681;
  if ( v22 >= 0x80 )
    goto LABEL_16;
  v23 = a1 + 8 * v22;
  *a2 = v22 + 1;
  *(_WORD *)(v23 + 2) = 1;
  v24 = *a2;
  *(_WORD *)v23 = 69;
  *(_DWORD *)(v23 + 4) = 2048;
  if ( v24 >= 0x80 )
    goto LABEL_16;
  v25 = a1 + 8 * v24;
  *a2 = v24 + 1;
  *(_WORD *)(v25 + 2) = 0;
  v26 = *a2;
  *(_WORD *)v25 = 6;
  *(_DWORD *)(v25 + 4) = 327681;
  if ( v26 >= 0x80 )
    goto LABEL_16;
  v27 = a1 + 8 * v26;
  *a2 = v26 + 1;
  *(_WORD *)(v27 + 2) = 256;
  v28 = *a2;
  *(_WORD *)v27 = 69;
  *(_DWORD *)(v27 + 4) = 2114076672;
  if ( v28 >= 0x80 )
    goto LABEL_16;
  v29 = a1 + 8 * v28;
  *a2 = v28 + 1;
  *(_WORD *)(v29 + 2) = 0;
  v30 = *a2;
  *(_WORD *)v29 = 6;
  *(_DWORD *)(v29 + 4) = 327681;
  if ( v30 < 0x80 )
  {
    v33 = v30 + 1;
    v34 = (_DWORD *)(a1 + 8 * v30);
    *a2 = v33;
    *v34 = 6;
    v34[1] = 2147418112;
    return 1;
  }
  else
  {
LABEL_16:
    v31 = (_DWORD *)__errno();
    *v31 = 7;
    return 0;
  }
}


// Address: 0x431C | Function: sub_431C
__int64 __fastcall sub_431C(__int64 a1, unsigned __int64 *a2)
{
  int v4; // w22
  unsigned __int64 v5; // x8
  __int64 v6; // x10
  unsigned __int64 v7; // x8
  __int64 v8; // x10
  unsigned __int64 v9; // x8
  __int64 v10; // x10
  unsigned __int64 v11; // x8
  __int64 v12; // x10
  unsigned __int64 v13; // x9
  _DWORD *v14; // x8
  __int64 result; // x0
  unsigned __int64 v16; // x10
  __int64 v17; // x9
  _QWORD v18[12]; // [xsp+0h] [xbp-70h] BYREF
  __int64 v19; // [xsp+68h] [xbp-8h]

  v19 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = 4212291;
  memset(v18, 0, 92);
  if ( (int)__system_property_get("ro.build.version.sdk", v18) > 0 )
  {
    if ( (unsigned int)(atoi((const char *)v18) - 1) >= 0x19 )
      v4 = 4212291;
    else
      v4 = 4212289;
  }
  v5 = *a2;
  if ( *a2 >= 0x80 )
    goto LABEL_10;
  v6 = a1 + 8 * v5;
  *a2 = v5 + 1;
  *(_WORD *)(v6 + 2) = 1024;
  v7 = *a2;
  *(_WORD *)v6 = 21;
  *(_DWORD *)(v6 + 4) = 56;
  if ( v7 >= 0x80 )
    goto LABEL_10;
  v8 = a1 + 8 * v7;
  *a2 = v7 + 1;
  *(_WORD *)(v8 + 2) = 0;
  v9 = *a2;
  *(_WORD *)v8 = 32;
  *(_DWORD *)(v8 + 4) = 32;
  if ( v9 >= 0x80 )
    goto LABEL_10;
  v10 = a1 + 8 * v9;
  *a2 = v9 + 1;
  *(_WORD *)(v10 + 2) = 256;
  v11 = *a2;
  *(_WORD *)v10 = 69;
  *(_DWORD *)(v10 + 4) = v4;
  if ( v11 >= 0x80 )
    goto LABEL_10;
  v12 = a1 + 8 * v11;
  *a2 = v11 + 1;
  *(_WORD *)(v12 + 2) = 0;
  v13 = *a2;
  *(_WORD *)v12 = 6;
  *(_DWORD *)(v12 + 4) = 327681;
  if ( v13 < 0x80 )
  {
    v16 = v13 + 1;
    v17 = a1 + 8 * v13;
    *a2 = v16;
    *(_WORD *)v17 = 6;
    *(_WORD *)(v17 + 2) = 0;
    *(_DWORD *)(v17 + 4) = 2147418112;
    return 1;
  }
  else
  {
LABEL_10:
    v14 = (_DWORD *)__errno();
    result = 0;
    *v14 = 7;
  }
  return result;
}


// Address: 0x44B0 | Function: Java_bin_mt_plus_Features2_init
__int64 __fastcall Java_bin_mt_plus_Features2_init(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6)
{
  const char *v11; // x0
  const char *v12; // x24
  const char *v13; // x0
  const char *v14; // x23
  const char *v15; // x0
  const char *v16; // x22
  const char *v17; // x0
  const char *v18; // x21
  _DWORD *v19; // x0
  __int64 result; // x0
  int v21; // w0
  int v22; // w8
  char v23; // [xsp+0h] [xbp-4010h] BYREF
  __int64 v24; // [xsp+1000h] [xbp-3010h] BYREF
  char v25[4096]; // [xsp+1008h] [xbp-3008h] BYREF
  char v26[4096]; // [xsp+2008h] [xbp-2008h] BYREF
  char v27[4096]; // [xsp+3008h] [xbp-1008h] BYREF
  __int64 v28; // [xsp+4008h] [xbp-8h]

  v28 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  byte_15520 = 0;
  v24 = 0x246F732E5C2A2ELL;
  if ( qword_15528 != 0 )
  {
    free((void *)qword_15528);
    qword_15528 = 0;
  }
  v11 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  if ( v11 != nullptr )
  {
    v12 = v11;
    qword_15528 = (__int64)strdup(v11);
    (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v12);
    if ( qword_15528 != 0 )
    {
      if ( qword_15530 != 0 )
      {
        free((void *)qword_15530);
        qword_15530 = 0;
      }
      v13 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a4, 0);
      if ( v13 != nullptr )
      {
        v14 = v13;
        qword_15530 = (__int64)strdup(v13);
        (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a4, v14);
        if ( qword_15530 != 0 )
        {
          if ( qword_15538 != 0 )
          {
            free((void *)qword_15538);
            qword_15538 = 0;
          }
          v15 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a5, 0);
          if ( v15 != nullptr )
          {
            v16 = v15;
            qword_15538 = (__int64)strdup(v15);
            (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a5, v16);
            if ( qword_15538 != 0 )
            {
              if ( qword_15540 != 0 )
              {
                free((void *)qword_15540);
                qword_15540 = 0;
              }
              v17 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(
                                    a1,
                                    a6,
                                    0);
              if ( v17 != nullptr )
              {
                v18 = v17;
                qword_15540 = (__int64)strdup(v17);
                (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a6, v18);
                if ( qword_15540 != 0 )
                {
                  sub_4FE4(&v23, 4096);
                  if ( chdir(&v23) != 0 )
                  {
                    v19 = (_DWORD *)__errno();
                    if ( *v19 != 0 )
                      return (unsigned int)(-1000 - *v19);
                    else
                      return 4294966291LL;
                  }
                  v21 = 22;
                  if ( qword_15538 == 0 )
                    return (unsigned int)(-3000 - v21);
                  if ( qword_15528 == 0 )
                    return (unsigned int)(-3000 - v21);
                  sub_4FE4(v27, 4096);
                  sub_4FE4(v26, 4096);
                  strlen((const char *)qword_15528);
                  v21 = sub_8688(v27);
                  if ( v21 != 0 )
                    return (unsigned int)(-3000 - v21);
                  if ( (int)sub_4FE4(v25, 4096) >= 4096 )
                  {
                    v21 = 36;
                    return (unsigned int)(-3000 - v21);
                  }
                  __strlen_chk(v25, 0x1000u);
                  v21 = sub_8688(v26);
                  if ( v21 != 0 )
                    return (unsigned int)(-3000 - v21);
                  xhook_clear();
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  xhook_register((char *)&v24);
                  result = xhook_refresh(0);
                  if ( (_DWORD)result != 0 )
                  {
                    if ( (int)result >= 0 )
                      v22 = result;
                    else
                      v22 = -(int)result;
                    return (unsigned int)(-2000 - v22);
                  }
                  else
                  {
                    byte_15520 = 1;
                  }
                  return result;
                }
              }
            }
          }
        }
      }
    }
  }
  return 0xFFFFFFFFLL;
}


// Address: 0x4FE4 | Function: sub_4FE4
__int64 sub_4FE4(__int64 a1, __int64 a2, __int64 a3, __int64 a4, ...)
{
  gcc_va_list va1; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(va1, va);
  return __vsnprintf_chk(a1, 4096, 0, a2, a4, va1);
}


// Address: 0x5088 | Function: sub_5088
__int64 __fastcall sub_5088(_BYTE *a1, unsigned int a2)
{
  int v4; // w0
  int v5; // w19
  _BYTE *v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, (a2 & 2) != 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = v8;
    else
      v7 = a1;
    return off_15548(v7, a2);
  }
}


// Address: 0x5144 | Function: sub_5144
__int64 __fastcall sub_5144(unsigned int a1, _BYTE *a2, unsigned int a3, unsigned int a4)
{
  int v8; // w0
  int v9; // w19
  _BYTE *v11; // x1
  __int64 v12; // x0
  _BYTE v13[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v14; // [xsp+1008h] [xbp-8h]

  v14 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v8 = sub_8768(a2, a1, 1, (a3 & 2) != 0, v13);
  if ( (v8 & 0xFFFFFFFE) == 2 )
  {
    if ( v8 == 3 )
      v9 = 1;
    else
      v9 = 13;
    *(_DWORD *)__errno() = v9;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v8 == 1 )
    {
      v11 = v13;
      v12 = 4294967196LL;
    }
    else
    {
      v12 = a1;
      v11 = a2;
    }
    return off_15550(v12, v11, a3, a4);
  }
}


// Address: 0x5220 | Function: sub_5220
__int64 __fastcall sub_5220(_BYTE *a1, unsigned int a2, unsigned int a3)
{
  unsigned __int64 StatusReg; // x22
  _BOOL8 v7; // x3
  int v9; // w0
  int v10; // w19
  _BYTE *v12; // x0
  unsigned int v13; // w20
  _BYTE v14[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v15; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v7 = (a2 & 0x640) != 0 || (a2 & 3) - 1 < 2;
  v15 = *(_QWORD *)(StatusReg + 40);
  v9 = sub_8768(a1, 4294967196LL, 0, v7, v14);
  if ( (v9 & 0xFFFFFFFE) == 2 )
  {
    if ( v9 == 3 )
      v10 = 1;
    else
      v10 = 13;
    *(_DWORD *)__errno() = v10;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v9 == 1 )
      v12 = v14;
    else
      v12 = a1;
    v13 = off_15558(v12, a2, a3);
    sub_8C04(v13);
    return v13;
  }
}


// Address: 0x5310 | Function: sub_5310
__int64 __fastcall sub_5310(_BYTE *a1, unsigned int a2, unsigned int a3)
{
  unsigned __int64 StatusReg; // x22
  _BOOL8 v7; // x3
  int v9; // w0
  int v10; // w19
  _BYTE *v12; // x0
  unsigned int v13; // w20
  _BYTE v14[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v15; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v7 = (a2 & 0x640) != 0 || (a2 & 3) - 1 < 2;
  v15 = *(_QWORD *)(StatusReg + 40);
  v9 = sub_8768(a1, 4294967196LL, 0, v7, v14);
  if ( (v9 & 0xFFFFFFFE) == 2 )
  {
    if ( v9 == 3 )
      v10 = 1;
    else
      v10 = 13;
    *(_DWORD *)__errno() = v10;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v9 == 1 )
      v12 = v14;
    else
      v12 = a1;
    v13 = off_15560(v12, a2, a3);
    sub_8C04(v13);
    return v13;
  }
}


// Address: 0x5400 | Function: sub_5400
__int64 __fastcall sub_5400(unsigned int a1, _BYTE *a2, unsigned int a3, unsigned int a4)
{
  unsigned __int64 StatusReg; // x23
  _BOOL8 v10; // x3
  int v11; // w0
  int v12; // w19
  _BYTE *v14; // x1
  __int64 v15; // x0
  unsigned int v16; // w21
  _BYTE v17[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v18; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v10 = (a3 & 0x640) != 0 || (a3 & 3) - 1 < 2;
  v18 = *(_QWORD *)(StatusReg + 40);
  v11 = sub_8768(a2, a1, 1, v10, v17);
  if ( (v11 & 0xFFFFFFFE) == 2 )
  {
    if ( v11 == 3 )
      v12 = 1;
    else
      v12 = 13;
    *(_DWORD *)__errno() = v12;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v11 == 1 )
    {
      v14 = v17;
      v15 = 4294967196LL;
    }
    else
    {
      v15 = a1;
      v14 = a2;
    }
    v16 = off_15568(v15, v14, a3, a4);
    sub_8C04(v16);
    return v16;
  }
}


// Address: 0x5508 | Function: sub_5508
__int64 __fastcall sub_5508(unsigned int a1, _BYTE *a2, unsigned int a3, unsigned int a4)
{
  unsigned __int64 StatusReg; // x23
  _BOOL8 v10; // x3
  int v11; // w0
  int v12; // w19
  _BYTE *v14; // x1
  __int64 v15; // x0
  unsigned int v16; // w21
  _BYTE v17[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v18; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v10 = (a3 & 0x640) != 0 || (a3 & 3) - 1 < 2;
  v18 = *(_QWORD *)(StatusReg + 40);
  v11 = sub_8768(a2, a1, 1, v10, v17);
  if ( (v11 & 0xFFFFFFFE) == 2 )
  {
    if ( v11 == 3 )
      v12 = 1;
    else
      v12 = 13;
    *(_DWORD *)__errno() = v12;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v11 == 1 )
    {
      v14 = v17;
      v15 = 4294967196LL;
    }
    else
    {
      v15 = a1;
      v14 = a2;
    }
    v16 = off_15570(v15, v14, a3, a4);
    sub_8C04(v16);
    return v16;
  }
}


// Address: 0x5610 | Function: sub_5610
__int64 __fastcall sub_5610(_BYTE *a1, unsigned int a2)
{
  unsigned __int64 StatusReg; // x21
  _BOOL8 v5; // x3
  int v7; // w0
  int v8; // w19
  _BYTE *v10; // x0
  unsigned int v11; // w20
  _BYTE v12[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v13; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v5 = (a2 & 0x640) != 0 || (a2 & 3) - 1 < 2;
  v13 = *(_QWORD *)(StatusReg + 40);
  v7 = sub_8768(a1, 4294967196LL, 0, v5, v12);
  if ( (v7 & 0xFFFFFFFE) == 2 )
  {
    if ( v7 == 3 )
      v8 = 1;
    else
      v8 = 13;
    *(_DWORD *)__errno() = v8;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v7 == 1 )
      v10 = v12;
    else
      v10 = a1;
    v11 = off_15578(v10, a2);
    sub_8C04(v11);
    return v11;
  }
}


// Address: 0x56F8 | Function: sub_56F8
__int64 __fastcall sub_56F8(unsigned int a1, _BYTE *a2, unsigned int a3)
{
  unsigned __int64 StatusReg; // x22
  _BOOL8 v8; // x3
  int v9; // w0
  int v10; // w19
  _BYTE *v12; // x1
  __int64 v13; // x0
  unsigned int v14; // w21
  _BYTE v15[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v16; // [xsp+1008h] [xbp-8h]

  StatusReg = _ReadStatusReg(TPIDR_EL0);
  v8 = (a3 & 0x640) != 0 || (a3 & 3) - 1 < 2;
  v16 = *(_QWORD *)(StatusReg + 40);
  v9 = sub_8768(a2, a1, 1, v8, v15);
  if ( (v9 & 0xFFFFFFFE) == 2 )
  {
    if ( v9 == 3 )
      v10 = 1;
    else
      v10 = 13;
    *(_DWORD *)__errno() = v10;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v9 == 1 )
    {
      v12 = v15;
      v13 = 4294967196LL;
    }
    else
    {
      v13 = a1;
      v12 = a2;
    }
    v14 = off_15580(v13, v12, a3);
    sub_8C04(v14);
    return v14;
  }
}


// Address: 0x57F8 | Function: sub_57F8
__int64 __fastcall sub_57F8(_BYTE *a1, __int64 a2)
{
  unsigned int v2; // w20
  _BYTE *v3; // x21
  int v4; // w0
  int v5; // w20
  _BYTE v7[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v8; // [xsp+1018h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15588(a1, a2);
  v2 = a2;
  v3 = a1;
  v4 = sub_9584(a1, 4294967196LL, 0, 1, v7, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v4 & 0xFFFFFFFE) != 2 )
  {
    a2 = v2;
    if ( v4 == 1 )
      a1 = v7;
    else
      a1 = v3;
    return off_15588(a1, a2);
  }
  if ( v4 == 3 )
    v5 = 1;
  else
    v5 = 13;
  *(_DWORD *)__errno() = v5;
  return 0xFFFFFFFFLL;
}


// Address: 0x58EC | Function: sub_58EC
__int64 __fastcall sub_58EC(unsigned int a1)
{
  __int64 result; // x0

  result = off_15590();
  if ( a1 <= 0xFFF && (_DWORD)result == 0 )
  {
    pthread_mutex_lock(&stru_15740);
    free(*((void **)&unk_15768 + a1));
    *((_QWORD *)&unk_15768 + a1) = 0;
    byte_1D768[a1] = 0;
    pthread_mutex_unlock(&stru_15740);
    return 0;
  }
  return result;
}


// Address: 0x5968 | Function: sub_5968
__int64 __fastcall sub_5968(unsigned int a1)
{
  unsigned int v2; // w19

  v2 = off_15598();
  if ( (v2 & 0x80000000) == 0 )
    sub_8E58(a1, v2);
  return v2;
}


// Address: 0x59A8 | Function: sub_59A8
__int64 __fastcall sub_59A8(unsigned int a1, unsigned int a2)
{
  __int64 result; // x0
  __int64 v5; // x1
  unsigned int v6; // w20

  result = off_155A0();
  if ( a1 != a2 && (result & 0x80000000) == 0 )
  {
    v5 = a2;
    v6 = result;
    sub_8E58(a1, v5);
    return v6;
  }
  return result;
}


// Address: 0x59F4 | Function: sub_59F4
__int64 __fastcall sub_59F4(unsigned int a1, unsigned int a2)
{
  __int64 result; // x0
  __int64 v5; // x1
  unsigned int v6; // w20

  result = off_155A8();
  if ( a1 != a2 && (result & 0x80000000) == 0 )
  {
    v5 = a2;
    v6 = result;
    sub_8E58(a1, v5);
    return v6;
  }
  return result;
}


// Address: 0x5A40 | Function: sub_5A40
__int64 __fastcall sub_5A40(_BYTE *a1, _BYTE *a2)
{
  _BYTE *i; // x8
  unsigned int v5; // w9
  __int64 v6; // x3
  int v7; // w0
  int v8; // w19
  _BYTE *v10; // x0
  _BYTE v11[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a2 != nullptr )
  {
    for ( i = a2; ; ++i )
    {
      v5 = (unsigned __int8)*i;
      if ( v5 > 0x60 )
      {
        if ( v5 == 97 || v5 == 119 )
          goto LABEL_10;
      }
      else
      {
        if ( *i == 0 )
          break;
        if ( v5 == 43 )
        {
LABEL_10:
          v6 = 1;
          goto LABEL_12;
        }
      }
    }
  }
  v6 = 0;
LABEL_12:
  v7 = sub_8768(a1, 4294967196LL, 0, v6, v11);
  if ( (v7 & 0xFFFFFFFE) == 2 )
  {
    if ( v7 == 3 )
      v8 = 1;
    else
      v8 = 13;
    *(_DWORD *)__errno() = v8;
    return 0;
  }
  else
  {
    if ( v7 == 1 )
      v10 = v11;
    else
      v10 = a1;
    return off_155B0(v10, a2);
  }
}


// Address: 0x5B44 | Function: sub_5B44
__int64 __fastcall sub_5B44(_BYTE *a1, _BYTE *a2)
{
  _BYTE *i; // x8
  unsigned int v5; // w9
  __int64 v6; // x3
  int v7; // w0
  int v8; // w19
  _BYTE *v10; // x0
  _BYTE v11[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a2 != nullptr )
  {
    for ( i = a2; ; ++i )
    {
      v5 = (unsigned __int8)*i;
      if ( v5 > 0x60 )
      {
        if ( v5 == 97 || v5 == 119 )
          goto LABEL_10;
      }
      else
      {
        if ( *i == 0 )
          break;
        if ( v5 == 43 )
        {
LABEL_10:
          v6 = 1;
          goto LABEL_12;
        }
      }
    }
  }
  v6 = 0;
LABEL_12:
  v7 = sub_8768(a1, 4294967196LL, 0, v6, v11);
  if ( (v7 & 0xFFFFFFFE) == 2 )
  {
    if ( v7 == 3 )
      v8 = 1;
    else
      v8 = 13;
    *(_DWORD *)__errno() = v8;
    return 0;
  }
  else
  {
    if ( v7 == 1 )
      v10 = v11;
    else
      v10 = a1;
    return off_155B8(v10, a2);
  }
}


// Address: 0x5C48 | Function: sub_5C48
__int64 __fastcall sub_5C48(_BYTE *a1, __int64 a2)
{
  int v4; // w0
  int v5; // w19
  _BYTE *v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = v8;
    else
      v7 = a1;
    return off_155C0(v7, a2);
  }
}


// Address: 0x5D04 | Function: sub_5D04
__int64 __fastcall sub_5D04(_BYTE *a1, __int64 a2)
{
  int v4; // w0
  int v5; // w19
  _BYTE *v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = v8;
    else
      v7 = a1;
    return off_155C8(v7, a2);
  }
}


// Address: 0x5DC0 | Function: sub_5DC0
__int64 __fastcall sub_5DC0(_BYTE *a1, __int64 a2)
{
  int v4; // w0
  int v5; // w19
  _BYTE *v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = v8;
    else
      v7 = a1;
    return off_155D0(v7, a2);
  }
}


// Address: 0x5E7C | Function: sub_5E7C
__int64 __fastcall sub_5E7C(_BYTE *a1, __int64 a2)
{
  int v4; // w0
  int v5; // w19
  _BYTE *v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = v8;
    else
      v7 = a1;
    return off_155D8(v7, a2);
  }
}


// Address: 0x5F38 | Function: sub_5F38
__int64 __fastcall sub_5F38(unsigned int a1, _BYTE *a2, __int64 a3, unsigned int a4)
{
  int v8; // w0
  int v9; // w19
  _BYTE *v11; // x1
  __int64 v12; // x0
  _BYTE v13[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v14; // [xsp+1008h] [xbp-8h]

  v14 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v8 = sub_8768(a2, a1, 1, 0, v13);
  if ( (v8 & 0xFFFFFFFE) == 2 )
  {
    if ( v8 == 3 )
      v9 = 1;
    else
      v9 = 13;
    *(_DWORD *)__errno() = v9;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v8 == 1 )
    {
      v11 = v13;
      v12 = 4294967196LL;
    }
    else
    {
      v12 = a1;
      v11 = a2;
    }
    return off_155E0(v12, v11, a3, a4);
  }
}


// Address: 0x6014 | Function: sub_6014
__int64 __fastcall sub_6014(unsigned int a1, _BYTE *a2, __int16 a3)
{
  int v4; // w0
  int v5; // w19
  __int64 v7; // x0
  _BYTE v8[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a2 == nullptr || (a3 & 0x1000) != 0 && *a2 == 0 )
    return off_155E8(a1);
  v4 = sub_8768(a2, a1, 1, 0, v8);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    *(_DWORD *)__errno() = v5;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v4 == 1 )
      v7 = 4294967196LL;
    else
      v7 = a1;
    return off_155E8(v7);
  }
}


// Address: 0x614C | Function: sub_614C
__int64 __fastcall sub_614C(_BYTE *a1, __int64 a2)
{
  unsigned int v2; // w20
  _BYTE *v3; // x21
  int v4; // w0
  int v5; // w20
  _BYTE v7[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v8; // [xsp+1018h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_155F0(a1, a2);
  v2 = a2;
  v3 = a1;
  v4 = sub_9584(a1, 4294967196LL, 0, 1, v7, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v4 & 0xFFFFFFFE) != 2 )
  {
    a2 = v2;
    if ( v4 == 1 )
      a1 = v7;
    else
      a1 = v3;
    return off_155F0(a1, a2);
  }
  if ( v4 == 3 )
    v5 = 1;
  else
    v5 = 13;
  *(_DWORD *)__errno() = v5;
  return 0xFFFFFFFFLL;
}


// Address: 0x6240 | Function: sub_6240
__int64 __fastcall sub_6240(_BYTE *a1)
{
  _BYTE *v1; // x20
  int v2; // w0
  int v3; // w20
  _BYTE v5[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v6; // [xsp+1018h] [xbp-8h]

  v6 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_155F8(a1);
  v1 = a1;
  v2 = sub_9584(a1, 4294967196LL, 0, 2, v5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v2 & 0xFFFFFFFE) != 2 )
  {
    if ( v2 == 1 )
      a1 = v5;
    else
      a1 = v1;
    return off_155F8(a1);
  }
  if ( v2 == 3 )
    v3 = 1;
  else
    v3 = 13;
  *(_DWORD *)__errno() = v3;
  return 0xFFFFFFFFLL;
}


// Address: 0x6324 | Function: sub_6324
__int64 __fastcall sub_6324(_BYTE *a1)
{
  _BYTE *v1; // x20
  int v2; // w0
  int v3; // w20
  _BYTE v5[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v6; // [xsp+1018h] [xbp-8h]

  v6 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15600(a1);
  v1 = a1;
  v2 = sub_9584(a1, 4294967196LL, 0, 2, v5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v2 & 0xFFFFFFFE) != 2 )
  {
    if ( v2 == 1 )
      a1 = v5;
    else
      a1 = v1;
    return off_15600(a1);
  }
  if ( v2 == 3 )
    v3 = 1;
  else
    v3 = 13;
  *(_DWORD *)__errno() = v3;
  return 0xFFFFFFFFLL;
}


// Address: 0x6408 | Function: sub_6408
__int64 __fastcall sub_6408(unsigned int a1, _BYTE *a2, unsigned int a3)
{
  int v6; // w0
  int v7; // w19
  _BYTE *v9; // x1
  __int64 v10; // x0
  _BYTE v11[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v6 = sub_8768(a2, a1, 1, 2, v11);
  if ( (v6 & 0xFFFFFFFE) == 2 )
  {
    if ( v6 == 3 )
      v7 = 1;
    else
      v7 = 13;
    *(_DWORD *)__errno() = v7;
    return 0xFFFFFFFFLL;
  }
  else
  {
    if ( v6 == 1 )
    {
      v9 = v11;
      v10 = 4294967196LL;
    }
    else
    {
      v10 = a1;
      v9 = a2;
    }
    return off_15608(v10, v9, a3);
  }
}


// Address: 0x64DC | Function: sub_64DC
__int64 __fastcall sub_64DC(_BYTE *a1)
{
  _BYTE *v1; // x20
  int v2; // w0
  int v3; // w20
  _BYTE v5[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v6; // [xsp+1018h] [xbp-8h]

  v6 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15610(a1);
  v1 = a1;
  v2 = sub_9584(a1, 4294967196LL, 0, 2, v5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v2 & 0xFFFFFFFE) != 2 )
  {
    if ( v2 == 1 )
      a1 = v5;
    else
      a1 = v1;
    return off_15610(a1);
  }
  if ( v2 == 3 )
    v3 = 1;
  else
    v3 = 13;
  *(_DWORD *)__errno() = v3;
  return 0xFFFFFFFFLL;
}


// Address: 0x65C0 | Function: sub_65C0
__int64 __fastcall sub_65C0(_QWORD *a1, _BYTE *a2)
{
  _BYTE *v2; // x19
  _QWORD *v3; // x22
  int v4; // w20
  int v5; // w8
  bool v6; // zf
  int v7; // w19
  _BYTE v9[4096]; // [xsp+18h] [xbp-2008h] BYREF
  _QWORD v10[513]; // [xsp+1018h] [xbp-1008h] BYREF

  v10[512] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15618(a1, a2);
  v2 = a2;
  v3 = a1;
  v4 = sub_9584(a1, 4294967196LL, 0, 2, v10, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  v5 = 0;
  if ( byte_15520 == 1 )
    v5 = sub_9584(v2, 4294967196LL, 0, 1, v9, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v4 & 0xFFFFFFFE) != 2 )
  {
    if ( (v5 & 0xFFFFFFFE) == 2 )
    {
      v6 = v5 == 3;
      goto LABEL_8;
    }
    if ( v4 == 1 )
      a1 = v10;
    else
      a1 = v3;
    if ( v5 == 1 )
      a2 = v9;
    else
      a2 = v2;
    return off_15618(a1, a2);
  }
  v6 = v4 == 3;
LABEL_8:
  if ( v6 )
    v7 = 1;
  else
    v7 = 13;
  *(_DWORD *)__errno() = v7;
  return 0xFFFFFFFFLL;
}


// Address: 0x6730 | Function: sub_6730
__int64 __fastcall sub_6730(unsigned int a1, _QWORD *a2, unsigned int a3, _BYTE *a4)
{
  int v8; // w23
  __int64 v9; // x0
  bool v10; // zf
  int v11; // w19
  unsigned int v13; // w8
  _QWORD *v14; // x1
  __int64 v15; // x2
  _BYTE *v16; // x3
  _BYTE v17[4096]; // [xsp+8h] [xbp-2008h] BYREF
  _QWORD v18[513]; // [xsp+1008h] [xbp-1008h] BYREF

  v18[512] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v8 = sub_8768(a2, a1, 1, 2, v18);
  v9 = sub_8768(a4, a3, 1, 1, v17);
  if ( (v8 & 0xFFFFFFFE) == 2 )
  {
    v10 = v8 == 3;
LABEL_5:
    if ( v10 )
      v11 = 1;
    else
      v11 = 13;
    *(_DWORD *)__errno(v9) = v11;
    return 0xFFFFFFFFLL;
  }
  if ( (v9 & 0xFFFFFFFE) == 2 )
  {
    v10 = (_DWORD)v9 == 3;
    goto LABEL_5;
  }
  if ( v8 == 1 )
    v13 = -100;
  else
    v13 = a1;
  if ( v8 == 1 )
    v14 = v18;
  else
    v14 = a2;
  if ( (_DWORD)v9 == 1 )
    v15 = 4294967196LL;
  else
    v15 = a3;
  if ( (_DWORD)v9 == 1 )
    v16 = v17;
  else
    v16 = a4;
  return off_15620(v13, v14, v15, v16);
}


// Address: 0x6850 | Function: sub_6850
__int64 __fastcall sub_6850(unsigned int a1, _QWORD *a2, unsigned int a3, _BYTE *a4, unsigned int a5)
{
  int v10; // w24
  __int64 v11; // x0
  bool v12; // zf
  int v13; // w19
  unsigned int v15; // w8
  _QWORD *v16; // x1
  __int64 v17; // x2
  _BYTE *v18; // x3
  _BYTE v19[4096]; // [xsp+8h] [xbp-2008h] BYREF
  _QWORD v20[513]; // [xsp+1008h] [xbp-1008h] BYREF

  v20[512] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v10 = sub_8768(a2, a1, 1, 2, v20);
  v11 = sub_8768(a4, a3, 1, 1, v19);
  if ( (v10 & 0xFFFFFFFE) == 2 )
  {
    v12 = v10 == 3;
LABEL_5:
    if ( v12 )
      v13 = 1;
    else
      v13 = 13;
    *(_DWORD *)__errno(v11) = v13;
    return 0xFFFFFFFFLL;
  }
  if ( (v11 & 0xFFFFFFFE) == 2 )
  {
    v12 = (_DWORD)v11 == 3;
    goto LABEL_5;
  }
  if ( v10 == 1 )
    v15 = -100;
  else
    v15 = a1;
  if ( v10 == 1 )
    v16 = v20;
  else
    v16 = a2;
  if ( (_DWORD)v11 == 1 )
    v17 = 4294967196LL;
  else
    v17 = a3;
  if ( (_DWORD)v11 == 1 )
    v18 = v19;
  else
    v18 = a4;
  return off_15628(v15, v16, v17, v18, a5);
}


// Address: 0x6978 | Function: sub_6978
__int64 __fastcall sub_6978(_BYTE *a1)
{
  _BYTE *v1; // x20
  __int64 v2; // x0
  int v3; // w20
  _BYTE v5[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v6; // [xsp+1018h] [xbp-8h]

  v6 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15630(a1);
  v1 = a1;
  v2 = sub_9584(a1, 4294967196LL, 0, 3, v5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v2 & 0xFFFFFFFE) != 2 )
  {
    if ( (_DWORD)v2 == 1 )
      a1 = v5;
    else
      a1 = v1;
    return off_15630(a1);
  }
  if ( (_DWORD)v2 == 3 )
    v3 = 1;
  else
    v3 = 13;
  *(_DWORD *)__errno(v2) = v3;
  return 0;
}


// Address: 0x6A5C | Function: sub_6A5C
__int64 __fastcall sub_6A5C(unsigned int a1)
{
  __int64 v2; // x0
  __int64 v3; // x2
  __int64 v4; // x2
  size_t v5; // x20
  size_t v6; // x20
  __int64 v7; // x0
  int v8; // w19
  int v10; // w22
  _BYTE v11[4096]; // [xsp+18h] [xbp-4008h] BYREF
  char v12[4096]; // [xsp+1018h] [xbp-3008h] BYREF
  char v13[4096]; // [xsp+2018h] [xbp-2008h] BYREF
  char v14[4096]; // [xsp+3018h] [xbp-1008h] BYREF
  __int64 v15; // [xsp+4018h] [xbp-8h]

  v15 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (byte_15520 & 1) != 0 )
  {
    if ( a1 > 0xFFF )
      goto LABEL_3;
    pthread_mutex_lock(&stru_15740);
    v10 = (char)byte_1D768[a1];
    free(*((void **)&unk_15768 + a1));
    *((_QWORD *)&unk_15768 + a1) = 0;
    byte_1D768[a1] = 0;
    v2 = pthread_mutex_unlock(&stru_15740);
    if ( v10 < 0 )
      goto LABEL_14;
    if ( v10 == 0 )
    {
LABEL_3:
      v2 = sub_8FA0(a1, v14, 4096);
      if ( (v2 & 1) == 0 )
      {
LABEL_14:
        *(_DWORD *)__errno(v2) = 13;
        return 0;
      }
      sub_4FE4((__int64)v13, 4096, v3, (__int64)"%s/data", (const char *)qword_15538);
      sub_4FE4((__int64)v12, 4096, v4, (__int64)"%s/tmp", (const char *)qword_15538);
      v5 = __strlen_chk(v13, 0x1000u);
      if ( strncmp(v14, v13, v5) == 0 && (v14[v5] == 0 || v14[v5] == 47) )
        return off_15638(a1);
      v6 = __strlen_chk(v12, 0x1000u);
      if ( strncmp(v14, v12, v6) == 0 && (v14[v6] == 47 || v14[v6] == 0) )
        return off_15638(a1);
      v7 = sub_9584(v14, 4294967196LL, 0, 3, v11, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
      if ( (v7 & 0xFFFFFFFE) != 2 )
        return off_15638(a1);
      if ( (_DWORD)v7 == 3 )
        v8 = 1;
      else
        v8 = 13;
      *(_DWORD *)__errno(v7) = v8;
      return 0;
    }
  }
  return off_15638(a1);
}


// Address: 0x6CD0 | Function: sub_6CD0
__int64 __fastcall sub_6CD0(_BYTE *a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v4; // x20
  __int64 v5; // x21
  __int64 v6; // x22
  _BYTE *v7; // x23
  __int64 v8; // x0
  int v9; // w20
  _BYTE v11[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1018h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_15640(a1, a2, a3, a4);
  v4 = a2;
  v5 = a3;
  v6 = a4;
  v7 = a1;
  v8 = sub_9584(a1, 4294967196LL, 0, 3, v11, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v8 & 0xFFFFFFFE) != 2 )
  {
    a4 = v6;
    a3 = v5;
    if ( (_DWORD)v8 == 1 )
      a1 = v11;
    else
      a1 = v7;
    a2 = v4;
    return off_15640(a1, a2, a3, a4);
  }
  if ( (_DWORD)v8 == 3 )
    v9 = 1;
  else
    v9 = 13;
  *(_DWORD *)__errno(v8) = v9;
  return 0xFFFFFFFFLL;
}


// Address: 0x6DDC | Function: sub_6DDC
__int64 __fastcall sub_6DDC(_BYTE *a1, __int64 a2, __int64 a3)
{
  __int64 v6; // x0
  int v7; // w19
  _BYTE *v9; // x0
  _BYTE v10[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v11; // [xsp+1008h] [xbp-8h]

  v11 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v6 = sub_8768(a1, 4294967196LL, 0, 0, v10);
  if ( (v6 & 0xFFFFFFFE) == 2 )
  {
    if ( (_DWORD)v6 == 3 )
      v7 = 1;
    else
      v7 = 13;
    *(_DWORD *)__errno(v6) = v7;
    return -1;
  }
  else
  {
    if ( (_DWORD)v6 == 1 )
      v9 = v10;
    else
      v9 = a1;
    return off_15648(v9, a2, a3);
  }
}


// Address: 0x6EA0 | Function: sub_6EA0
__int64 __fastcall sub_6EA0(unsigned int a1, _BYTE *a2, __int64 a3, __int64 a4)
{
  __int64 v8; // x0
  int v9; // w19
  _BYTE *v11; // x1
  __int64 v12; // x0
  _BYTE v13[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v14; // [xsp+1008h] [xbp-8h]

  v14 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v8 = sub_8768(a2, a1, 1, 0, v13);
  if ( (v8 & 0xFFFFFFFE) == 2 )
  {
    if ( (_DWORD)v8 == 3 )
      v9 = 1;
    else
      v9 = 13;
    *(_DWORD *)__errno(v8) = v9;
    return -1;
  }
  else
  {
    if ( (_DWORD)v8 == 1 )
    {
      v11 = v13;
      v12 = 4294967196LL;
    }
    else
    {
      v12 = a1;
      v11 = a2;
    }
    return off_15650(v12, v11, a3, a4);
  }
}


// Address: 0x6F7C | Function: sub_6F7C
__int64 __fastcall sub_6F7C(_BYTE *a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v8; // x0
  int v9; // w19
  _BYTE *v11; // x0
  _BYTE v12[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v13; // [xsp+1008h] [xbp-8h]

  v13 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v8 = sub_8768(a1, 4294967196LL, 0, 0, v12);
  if ( (v8 & 0xFFFFFFFE) == 2 )
  {
    if ( (_DWORD)v8 == 3 )
      v9 = 1;
    else
      v9 = 13;
    *(_DWORD *)__errno(v8) = v9;
    return -1;
  }
  else
  {
    if ( (_DWORD)v8 == 1 )
      v11 = v12;
    else
      v11 = a1;
    return off_15658(v11, a2, a3, a4);
  }
}


// Address: 0x7050 | Function: sub_7050
__int64 __fastcall sub_7050(unsigned int a1, _BYTE *a2, __int64 a3, __int64 a4, __int64 a5)
{
  __int64 v10; // x0
  int v11; // w19
  _BYTE *v13; // x1
  __int64 v14; // x0
  _BYTE v15[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v16; // [xsp+1008h] [xbp-8h]

  v16 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v10 = sub_8768(a2, a1, 1, 0, v15);
  if ( (v10 & 0xFFFFFFFE) == 2 )
  {
    if ( (_DWORD)v10 == 3 )
      v11 = 1;
    else
      v11 = 13;
    *(_DWORD *)__errno(v10) = v11;
    return -1;
  }
  else
  {
    if ( (_DWORD)v10 == 1 )
    {
      v13 = v15;
      v14 = 4294967196LL;
    }
    else
    {
      v14 = a1;
      v13 = a2;
    }
    return off_15660(v14, v13, a3, a4, a5);
  }
}


// Address: 0x713C | Function: sub_713C
char *__fastcall sub_713C(__int64 a1, void *a2)
{
  __int64 v4; // x0
  int v5; // w20
  __int64 v6; // x0
  _BYTE *address; // x21
  __int64 (__fastcall *v8)(__int64, void *); // x8
  size_t v10; // x0
  char src; // [xsp+8h] [xbp-2008h] BYREF
  _BYTE v12[4096]; // [xsp+1008h] [xbp-1008h] BYREF
  __int64 v13; // [xsp+2008h] [xbp-8h]

  v13 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = sub_8768(a1, 4294967196LL, 0, 0, v12);
  if ( (v4 & 0xFFFFFFFE) == 2 )
  {
    if ( (_DWORD)v4 == 3 )
      v5 = 1;
    else
      v5 = 13;
    a2 = nullptr;
    *(_DWORD *)__errno(v4) = v5;
  }
  else if ( (_DWORD)v4 == 1 )
  {
    v6 = sub_9434(a1, 4294967196LL, 0, qword_15528, &src, 4096);
    if ( (v6 & 1) != 0 && v12[0] == 47 )
    {
      if ( syscall(48, 4294967196LL, v12, 0, 0) != 0 )
      {
        return nullptr;
      }
      else if ( a2 != nullptr )
      {
        v10 = __strlen_chk(&src, 0x1000u);
        if ( v10 <= 0xFFF )
          memcpy(a2, &src, v10 + 1);
      }
      else
      {
        return strdup(&src);
      }
    }
    else
    {
      a2 = nullptr;
      *(_DWORD *)__errno(v6) = 13;
    }
  }
  else
  {
    address = (_BYTE *)__emutls_get_address(&unk_154D8);
    v8 = (__int64 (__fastcall *)(__int64, void *))off_15668;
    *address = 1;
    a2 = (void *)v8(a1, a2);
    *address = 0;
  }
  return (char *)a2;
}


// Address: 0x72C4 | Function: sub_72C4
__int64 __fastcall sub_72C4(__int64 a1)
{
  if ( (byte_15520 & 1) == 0 )
    return off_15670();
  *(_DWORD *)__errno(a1) = 1;
  return 0xFFFFFFFFLL;
}


// Address: 0x7300 | Function: sub_7300
__int64 __fastcall sub_7300(__int64 a1)
{
  if ( (byte_15520 & 1) == 0 )
    return off_15678();
  *(_DWORD *)__errno(a1) = 1;
  return 0xFFFFFFFFLL;
}


// Address: 0x733C | Function: sub_733C
__int64 __fastcall sub_733C(void *a1, size_t a2, __int64 a3)
{
  size_t v5; // x0
  size_t v6; // x20
  int *v7; // x8
  int v8; // w9
  void *v10; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15528 == 0 )
    return off_15680();
  sub_4FE4((__int64)src, 4096, a3, (__int64)"/data/user/0/%s", (const char *)qword_15528);
  v5 = __strlen_chk(src, 0x1000u);
  v6 = v5 + 1;
  if ( a1 == nullptr )
  {
    v10 = malloc(v5 + 1);
    if ( v10 == nullptr )
    {
      v7 = (int *)__errno(0);
      v8 = 12;
      goto LABEL_12;
    }
    a1 = v10;
LABEL_10:
    memcpy(v10, src, v6);
    return (__int64)a1;
  }
  if ( a2 >= v6 )
  {
    v10 = a1;
    goto LABEL_10;
  }
  v7 = (int *)__errno(v5);
  v8 = 34;
LABEL_12:
  *v7 = v8;
  return 0;
}


// Address: 0x7470 | Function: sub_7470
__int64 __fastcall sub_7470(void *a1, size_t a2, __int64 a3)
{
  size_t v6; // x0
  __int64 v7; // x2
  size_t v8; // x8
  size_t v9; // x2
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15528 == 0 )
    return off_15688();
  sub_4FE4((__int64)src, 4096, a3, (__int64)"/data/user/0/%s", (const char *)qword_15528);
  v6 = __strlen_chk(src, 0x1000u);
  if ( a1 == nullptr )
    return sub_733C(nullptr, a2, v7);
  if ( a3 == -1 )
    v8 = a2;
  else
    v8 = a3;
  if ( a2 > v8 || (v9 = v6 + 1, v6 + 1 > a2) || v9 > v8 )
  {
    *(_DWORD *)__errno(v6) = 34;
    return 0;
  }
  else
  {
    memcpy(a1, src, v9);
    return (__int64)a1;
  }
}


// Address: 0x75A4 | Function: sub_75A4
__int64 __fastcall sub_75A4(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 13;
  return 0xFFFFFFFFLL;
}


// Address: 0x75C8 | Function: sub_75C8
__int64 __fastcall sub_75C8(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 13;
  return 0xFFFFFFFFLL;
}


// Address: 0x75EC | Function: sub_75EC
__int64 __fastcall sub_75EC(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 13;
  return 0xFFFFFFFFLL;
}


// Address: 0x7610 | Function: sub_7610
__int64 __fastcall sub_7610(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 13;
  return 0xFFFFFFFFLL;
}


// Address: 0x7634 | Function: sub_7634
__int64 __fastcall sub_7634(char *s, __int64 a2, __int64 a3)
{
  char *v4; // x0
  const char *v6; // x5
  size_t v7; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return off_156B0(s);
  if ( s != nullptr )
    v4 = strrchr(s, 47);
  else
    v4 = nullptr;
  if ( v4 != nullptr )
    v6 = v4 + 1;
  else
    v6 = s;
  if ( v6 == nullptr || *v6 == 0 )
    v6 = "mt-temp-XXXXXX";
  v7 = sub_4FE4((__int64)src, 4096, a3, (__int64)"%s/tmp/%s", (const char *)qword_15538, v6);
  if ( s != nullptr && (v7 = __strlen_chk(src, 0x1000u)) < 0x1000 )
  {
    memcpy(s, src, v7 + 1);
    return off_156B0(s);
  }
  else
  {
    *(_DWORD *)__errno(v7) = 13;
    return 0xFFFFFFFFLL;
  }
}


// Address: 0x7770 | Function: sub_7770
__int64 __fastcall sub_7770(char *s, __int64 a2, __int64 a3)
{
  char *v4; // x0
  const char *v6; // x5
  size_t v7; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return off_156B8(s);
  if ( s != nullptr )
    v4 = strrchr(s, 47);
  else
    v4 = nullptr;
  if ( v4 != nullptr )
    v6 = v4 + 1;
  else
    v6 = s;
  if ( v6 == nullptr || *v6 == 0 )
    v6 = "mt-temp-XXXXXX";
  v7 = sub_4FE4((__int64)src, 4096, a3, (__int64)"%s/tmp/%s", (const char *)qword_15538, v6);
  if ( s != nullptr && (v7 = __strlen_chk(src, 0x1000u)) < 0x1000 )
  {
    memcpy(s, src, v7 + 1);
    return off_156B8(s);
  }
  else
  {
    *(_DWORD *)__errno(v7) = 13;
    return 0xFFFFFFFFLL;
  }
}


// Address: 0x78C0 | Function: sub_78C0
__int64 __fastcall sub_78C0(char *s, __int64 a2, __int64 a3)
{
  char *v4; // x0
  const char *v6; // x5
  size_t v7; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return off_156C0(s);
  if ( s != nullptr )
    v4 = strrchr(s, 47);
  else
    v4 = nullptr;
  if ( v4 != nullptr )
    v6 = v4 + 1;
  else
    v6 = s;
  if ( v6 == nullptr || *v6 == 0 )
    v6 = "mt-temp-XXXXXX";
  v7 = sub_4FE4((__int64)src, 4096, a3, (__int64)"%s/tmp/%s", (const char *)qword_15538, v6);
  if ( s != nullptr && (v7 = __strlen_chk(src, 0x1000u)) < 0x1000 )
  {
    memcpy(s, src, v7 + 1);
    return off_156C0(s);
  }
  else
  {
    *(_DWORD *)__errno(v7) = 13;
    return 0xFFFFFFFFLL;
  }
}


// Address: 0x7A10 | Function: sub_7A10
__int64 __fastcall sub_7A10(char *s, __int64 a2, __int64 a3)
{
  char *v4; // x0
  const char *v6; // x5
  size_t v7; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return off_156C8(s);
  if ( s != nullptr )
    v4 = strrchr(s, 47);
  else
    v4 = nullptr;
  if ( v4 != nullptr )
    v6 = v4 + 1;
  else
    v6 = s;
  if ( v6 == nullptr || *v6 == 0 )
    v6 = "mt-temp-XXXXXX";
  v7 = sub_4FE4((__int64)src, 4096, a3, (__int64)"%s/tmp/%s", (const char *)qword_15538, v6);
  if ( s != nullptr && (v7 = __strlen_chk(src, 0x1000u)) < 0x1000 )
  {
    memcpy(s, src, v7 + 1);
    return off_156C8(s);
  }
  else
  {
    *(_DWORD *)__errno(v7) = 13;
    return 0xFFFFFFFFLL;
  }
}


// Address: 0x7B68 | Function: sub_7B68
__int64 __fastcall sub_7B68(char *s, __int64 a2, __int64 a3)
{
  char *v4; // x0
  const char *v6; // x5
  size_t v7; // x0
  char src[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return off_156D0(s);
  if ( s != nullptr )
    v4 = strrchr(s, 47);
  else
    v4 = nullptr;
  if ( v4 != nullptr )
    v6 = v4 + 1;
  else
    v6 = s;
  if ( v6 == nullptr || *v6 == 0 )
    v6 = "mt-temp-XXXXXX";
  v7 = sub_4FE4((__int64)src, 4096, a3, (__int64)"%s/tmp/%s", (const char *)qword_15538, v6);
  if ( s != nullptr && (v7 = __strlen_chk(src, 0x1000u)) < 0x1000 )
  {
    memcpy(s, src, v7 + 1);
    return off_156D0(s);
  }
  else
  {
    *(_DWORD *)__errno(v7) = 13;
    return 0;
  }
}


// Address: 0x7CA8 | Function: sub_7CA8
FILE *sub_7CA8()
{
  char *v0; // x0
  __int64 v1; // x2
  const char *v2; // x8
  const char *v3; // x5
  int v4; // w0
  int v5; // w19
  _BYTE v7[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v8; // [xsp+1008h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return (FILE *)off_156D8();
  v0 = __strrchr_chk("tmpfile-XXXXXX", 47, 0xFu);
  if ( v0 != nullptr )
    v2 = v0 + 1;
  else
    v2 = "tmpfile-XXXXXX";
  if ( *v2 != 0 )
    v3 = v2;
  else
    v3 = "mt-temp-XXXXXX";
  sub_4FE4((__int64)v7, 4096, v1, (__int64)"%s/tmp/%s", qword_15538, v3);
  v4 = off_156B0(v7);
  if ( v4 < 0 )
    return nullptr;
  if ( off_15600 != nullptr )
  {
    v5 = v4;
    off_15600(v7);
    v4 = v5;
  }
  return fdopen(v4, "w+");
}


// Address: 0x7DD4 | Function: sub_7DD4
FILE *sub_7DD4()
{
  char *v0; // x0
  __int64 v1; // x2
  const char *v2; // x8
  const char *v3; // x5
  int v4; // w0
  int v5; // w19
  _BYTE v7[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v8; // [xsp+1008h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 || qword_15538 == 0 )
    return (FILE *)off_156E0();
  v0 = __strrchr_chk("tmpfile64-XXXXXX", 47, 0x11u);
  if ( v0 != nullptr )
    v2 = v0 + 1;
  else
    v2 = "tmpfile64-XXXXXX";
  if ( *v2 != 0 )
    v3 = v2;
  else
    v3 = "mt-temp-XXXXXX";
  sub_4FE4((__int64)v7, 4096, v1, (__int64)"%s/tmp/%s", qword_15538, v3);
  v4 = off_156B0(v7);
  if ( v4 < 0 )
    return nullptr;
  if ( off_15600 != nullptr )
  {
    v5 = v4;
    off_15600(v7);
    v4 = v5;
  }
  return fdopen(v4, "w+");
}


// Address: 0x7F00 | Function: sub_7F00
__int64 __fastcall sub_7F00(_BYTE *a1, __int64 a2, __int64 a3, __int64 a4)
{
  unsigned int v4; // w20
  __int64 v5; // x21
  __int64 v6; // x22
  _BYTE *v7; // x23
  __int64 v8; // x0
  _BYTE v10[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v11; // [xsp+1018h] [xbp-8h]

  v11 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 == 1 )
  {
    v4 = a2;
    v5 = a3;
    v6 = a4;
    v7 = a1;
    v8 = sub_9584(a1, 4294967196LL, 0, 3, v10, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
    if ( (v8 & 0xFFFFFFFE) == 2 )
    {
      *(_DWORD *)__errno(v8) = 13;
      return 4294967294LL;
    }
    a4 = v6;
    a3 = v5;
    if ( (_DWORD)v8 == 1 )
      a1 = v10;
    else
      a1 = v7;
    a2 = v4;
  }
  return off_156E8(a1, a2, a3, a4);
}


// Address: 0x8000 | Function: sub_8000
__int64 __fastcall sub_8000(_BYTE *a1, __int64 a2, __int64 a3)
{
  __int64 v3; // x20
  unsigned int v4; // w21
  _BYTE *v5; // x22
  __int64 v6; // x0
  int v7; // w20
  _BYTE v9[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v10; // [xsp+1018h] [xbp-8h]

  v10 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_156F0(a1, a2, a3);
  v3 = a2;
  v4 = a3;
  v5 = a1;
  v6 = sub_9584(a1, 4294967196LL, 0, 3, v9, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v6 & 0xFFFFFFFE) != 2 )
  {
    a3 = v4;
    a2 = v3;
    if ( (_DWORD)v6 == 1 )
      a1 = v9;
    else
      a1 = v5;
    return off_156F0(a1, a2, a3);
  }
  if ( (_DWORD)v6 == 3 )
    v7 = 1;
  else
    v7 = 13;
  *(_DWORD *)__errno(v6) = v7;
  return 0xFFFFFFFFLL;
}


// Address: 0x80FC | Function: sub_80FC
__int64 __fastcall sub_80FC(_BYTE *a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 v4; // x20
  unsigned int v5; // w21
  unsigned int v6; // w22
  _BYTE *v7; // x23
  __int64 v8; // x0
  int v9; // w20
  _BYTE v11[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+1018h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return off_156F8(a1, a2, a3, a4);
  v4 = a2;
  v5 = a3;
  v6 = a4;
  v7 = a1;
  v8 = sub_9584(a1, 4294967196LL, 0, 3, v11, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
  if ( (v8 & 0xFFFFFFFE) != 2 )
  {
    a4 = v6;
    a3 = v5;
    if ( (_DWORD)v8 == 1 )
      a1 = v11;
    else
      a1 = v7;
    a2 = v4;
    return off_156F8(a1, a2, a3, a4);
  }
  if ( (_DWORD)v8 == 3 )
    v9 = 1;
  else
    v9 = 13;
  *(_DWORD *)__errno(v8) = v9;
  return 0xFFFFFFFFLL;
}


// Address: 0x8208 | Function: sub_8208
__int64 __fastcall sub_8208(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 1;
  return 0xFFFFFFFFLL;
}


// Address: 0x822C | Function: sub_822C
__int64 __fastcall sub_822C(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 1;
  return 0;
}


// Address: 0x8250 | Function: sub_8250
__int64 __fastcall sub_8250(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 1;
  return 0xFFFFFFFFLL;
}


// Address: 0x8274 | Function: sub_8274
__int64 __fastcall sub_8274(__int64 a1)
{
  _DWORD *v1; // x8

  v1 = (_DWORD *)__errno(a1);
  *v1 = 1;
  return 0xFFFFFFFFLL;
}


// Address: 0x8298 | Function: sub_8298
__int64 sub_8298()
{
  return 1;
}


// Address: 0x82A0 | Function: sub_82A0
__int64 sub_82A0()
{
  return 1;
}


// Address: 0x82A8 | Function: sub_82A8
__int64 __fastcall sub_82A8(_BYTE *a1)
{
  _BYTE *v1; // x19
  __int64 result; // x0
  int v3; // w19
  __int64 v4; // x20
  _BOOL4 v5; // w22
  int *v6; // x19
  int v7; // w8
  int *v8; // x8
  __int64 v9; // x22
  int v10; // w20
  int *address; // x19
  int v12; // w8
  _BYTE v13[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v14; // [xsp+1018h] [xbp-8h]

  v1 = a1;
  v14 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 != nullptr && byte_15520 != 0 && *a1 == 47 )
  {
    result = sub_9584(a1, 4294967196LL, 0, 5, v13, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
    if ( (result & 0xFFFFFFFE) == 2 )
    {
      if ( (_DWORD)result == 3 )
        v3 = 1;
      else
        v3 = 13;
      goto LABEL_19;
    }
    if ( (_DWORD)result == 1 )
      v1 = v13;
    result = off_15730(v1);
    if ( result != 0 && byte_15520 != 0 )
    {
      v9 = result;
      v10 = (unsigned __int8)*v1;
      address = (int *)__emutls_get_address(&unk_154B8);
      ++*address;
      v12 = xhook_refresh(0);
      if ( *address >= 1 )
        --*address;
      result = v9;
      if ( v12 != 0 )
      {
        if ( v10 == 0 )
          goto LABEL_18;
        goto LABEL_17;
      }
    }
  }
  else
  {
    result = off_15730(a1);
    if ( result != 0 && byte_15520 != 0 )
    {
      v4 = result;
      v5 = v1 != nullptr && *v1 != 0;
      v6 = (int *)__emutls_get_address(&unk_154B8);
      ++*v6;
      v7 = xhook_refresh(0);
      if ( *v6 >= 1 )
        --*v6;
      result = v4;
      if ( v7 != 0 )
      {
        if ( !v5 )
        {
LABEL_18:
          v3 = 13;
LABEL_19:
          v8 = (int *)__errno(result);
          result = 0;
          *v8 = v3;
          return result;
        }
LABEL_17:
        result = dlclose((void *)result);
        goto LABEL_18;
      }
    }
  }
  return result;
}


// Address: 0x8490 | Function: sub_8490
__int64 __fastcall sub_8490(_BYTE *a1)
{
  _BYTE *v1; // x19
  __int64 result; // x0
  int v3; // w19
  __int64 v4; // x20
  _BOOL4 v5; // w21
  int *v6; // x19
  int v7; // w8
  int *v8; // x8
  __int64 v9; // x21
  int v10; // w20
  int *address; // x19
  int v12; // w8
  _BYTE v13[4096]; // [xsp+18h] [xbp-1008h] BYREF
  __int64 v14; // [xsp+1018h] [xbp-8h]

  v1 = a1;
  v14 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 != nullptr && byte_15520 != 0 && *a1 == 47 )
  {
    result = sub_9584(a1, 4294967196LL, 0, 5, v13, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
    if ( (result & 0xFFFFFFFE) == 2 )
    {
      if ( (_DWORD)result == 3 )
        v3 = 1;
      else
        v3 = 13;
      goto LABEL_19;
    }
    if ( (_DWORD)result == 1 )
      v1 = v13;
    result = off_15738(v1);
    if ( result != 0 && byte_15520 != 0 )
    {
      v9 = result;
      v10 = (unsigned __int8)*v1;
      address = (int *)__emutls_get_address(&unk_154B8);
      ++*address;
      v12 = xhook_refresh(0);
      if ( *address >= 1 )
        --*address;
      result = v9;
      if ( v12 != 0 )
      {
        if ( v10 == 0 )
          goto LABEL_18;
        goto LABEL_17;
      }
    }
  }
  else
  {
    result = off_15738(a1);
    if ( result != 0 && byte_15520 != 0 )
    {
      v4 = result;
      v5 = v1 != nullptr && *v1 != 0;
      v6 = (int *)__emutls_get_address(&unk_154B8);
      ++*v6;
      v7 = xhook_refresh(0);
      if ( *v6 >= 1 )
        --*v6;
      result = v4;
      if ( v7 != 0 )
      {
        if ( !v5 )
        {
LABEL_18:
          v3 = 13;
LABEL_19:
          v8 = (int *)__errno(result);
          result = 0;
          *v8 = v3;
          return result;
        }
LABEL_17:
        result = dlclose((void *)result);
        goto LABEL_18;
      }
    }
  }
  return result;
}


// Address: 0x8688 | Function: sub_8688
__int64 __fastcall sub_8688(char *file, __int64 a2, unsigned __int64 a3)
{
  __int64 result; // x0
  int v7; // w19
  unsigned __int64 v8; // x22
  int v9; // w8
  ssize_t v10; // x0
  int v11; // w8
  unsigned int v12; // w9

  result = 22;
  if ( file != nullptr && a2 != 0 )
  {
    result = open(file, 524865, 384);
    if ( (result & 0x80000000) != 0 )
      goto LABEL_17;
    v7 = result;
    if ( a3 != 0 )
    {
      v8 = 0;
      while ( 1 )
      {
        while ( 1 )
        {
          v10 = write(v7, (const void *)(a2 + v8), a3 - v8);
          if ( v10 < 0 )
            break;
          if ( v10 == 0 )
          {
            LODWORD(a3) = 5;
            goto LABEL_15;
          }
          v8 += v10;
          if ( v8 >= a3 )
          {
LABEL_11:
            LODWORD(a3) = 0;
            goto LABEL_15;
          }
        }
        v9 = *(_DWORD *)__errno(v10);
        if ( v9 != 4 )
          break;
        if ( v8 >= a3 )
          goto LABEL_11;
      }
      if ( v9 != 0 )
        LODWORD(a3) = v9;
      else
        LODWORD(a3) = 5;
    }
LABEL_15:
    v11 = close(v7);
    result = (unsigned int)a3;
    if ( (_DWORD)a3 == 0 && v11 != 0 )
    {
LABEL_17:
      v12 = *(_DWORD *)__errno(result);
      if ( v12 != 0 )
        return v12;
      else
        return 5;
    }
  }
  return result;
}


// Address: 0x8768 | Function: sub_8768
__int64 __fastcall sub_8768(const char *a1, unsigned int a2, char a3, unsigned int a4, __int64 a5)
{
  int *address; // x0
  __int64 result; // x0
  _BYTE *v12; // x0
  __int64 v13; // x2
  __int64 v14; // x2
  size_t v15; // x24
  size_t v16; // x24
  __int64 v17; // x24
  size_t v18; // x0
  __int64 v19; // x24
  size_t v20; // x0
  __int64 v21; // x2
  char s2[4096]; // [xsp+18h] [xbp-4008h] BYREF
  char v23[4096]; // [xsp+1018h] [xbp-3008h] BYREF
  char v24[4096]; // [xsp+2018h] [xbp-2008h] BYREF
  _QWORD v25[513]; // [xsp+3018h] [xbp-1008h] BYREF

  v25[512] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( byte_15520 != 1 )
    return 0;
  address = (int *)__emutls_get_address(&unk_154B8);
  if ( a1 == nullptr || a4 != 0 || *address < 1 || (_DWORD)(result = strcmp(a1, "/proc/self/maps")) != 0 )
  {
    v12 = (_BYTE *)__emutls_get_address(&unk_154D8);
    if ( a1 == nullptr || a4 != 0 || (*v12 & 1) == 0 )
    {
      if ( a1 == nullptr )
        return sub_9584(a1, a2, a3 & 1, a4, a5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
      goto LABEL_18;
    }
    if ( *a1 != 47
      || qword_15538 == 0
      || ((sub_4FE4((__int64)v23, 4096, v13, (__int64)"%s/data", (const char *)qword_15538),
           sub_4FE4((__int64)s2, 4096, v14, (__int64)"%s/tmp", (const char *)qword_15538),
           v15 = __strlen_chk(v23, 0x1000u),
           (_DWORD)(result = strncmp(a1, v23, v15)) != 0)
       || a1[v15] != 0 && a1[v15] != 47)
      && ((v16 = __strlen_chk(s2, 0x1000u), (_DWORD)(result = strncmp(a1, s2, v16)) != 0)
       || a1[v16] != 0 && a1[v16] != 47) )
    {
LABEL_18:
      if ( (a3 & 1) == 0 || a2 == -100 || *a1 == 47 )
        return sub_9584(a1, a2, a3 & 1, a4, a5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
      if ( a2 > 0xFFF )
      {
LABEL_27:
        if ( (sub_8FA0(a2, v24, 4096) & 1) != 0 && (sub_8AA4(v24) & 1) != 0 )
          return sub_9584(a1, a2, a3 & 1, a4, a5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
        return 2;
      }
      pthread_mutex_lock(&stru_15740);
      v17 = *((_QWORD *)&unk_15768 + a2);
      if ( v17 != 0 )
      {
        v18 = strlen(*((const char **)&unk_15768 + a2));
        if ( v18 <= 0xFFF )
        {
          __memcpy_chk(v24, v17, v18 + 1, 4096);
          pthread_mutex_unlock(&stru_15740);
          if ( (int)sub_4FE4((__int64)v25, 4096, v21, (__int64)"%s/%s", v24, a1) <= 4095 )
            return sub_8768(v25, 4294967196LL, 0, a4, a5);
          return 2;
        }
      }
      pthread_mutex_unlock(&stru_15740);
      pthread_mutex_lock(&stru_15740);
      v19 = *((_QWORD *)&unk_15768 + a2);
      if ( v19 == 0 || (v20 = strlen(*((const char **)&unk_15768 + a2))) >= 0x1000 )
      {
        pthread_mutex_unlock(&stru_15740);
        goto LABEL_27;
      }
      __memcpy_chk(v24, v19, v20 + 1, 4096);
      pthread_mutex_unlock(&stru_15740);
      return sub_9584(a1, a2, a3 & 1, a4, a5, 4096, qword_15528, qword_15530, qword_15538, qword_15540);
    }
  }
  return result;
}


// Address: 0x8AA4 | Function: sub_8AA4
bool __fastcall sub_8AA4(_BOOL8 s1)
{
  __int64 v1; // x19
  const char *v2; // x20
  size_t v3; // x21

  if ( s1 != 0 )
  {
    v1 = s1;
    v2 = (const char *)qword_15538;
    if ( qword_15538 == 0
      || (v3 = strlen((const char *)qword_15538), strncmp((const char *)v1, v2, v3) != 0)
      || (s1 = 1, *(_BYTE *)(v1 + v3) != 0) && *(_BYTE *)(v1 + v3) != 47 )
    {
      if ( strncmp((const char *)v1, "/system", 7u) != 0
        || (s1 = 1, *(_BYTE *)(v1 + 7) != 0) && *(_BYTE *)(v1 + 7) != 47 )
      {
        if ( strncmp((const char *)v1, "/apex", 5u) != 0
          || (s1 = 1, *(_BYTE *)(v1 + 5) != 0) && *(_BYTE *)(v1 + 5) != 47 )
        {
          if ( strncmp((const char *)v1, "/vendor", 7u) != 0
            || (s1 = 1, *(_BYTE *)(v1 + 7) != 0) && *(_BYTE *)(v1 + 7) != 47 )
          {
            if ( strncmp((const char *)v1, "/product", 8u) != 0 )
              return strncmp((const char *)v1, "/odm", 4u) == 0 && (*(_BYTE *)(v1 + 4) == 0 || *(_BYTE *)(v1 + 4) == 47);
            s1 = 1;
            if ( *(_BYTE *)(v1 + 8) != 0 && *(_BYTE *)(v1 + 8) != 47 )
              return strncmp((const char *)v1, "/odm", 4u) == 0 && (*(_BYTE *)(v1 + 4) == 0 || *(_BYTE *)(v1 + 4) == 47);
          }
        }
      }
    }
  }
  return s1;
}


// Address: 0x8C04 | Function: sub_8C04
__int64 __fastcall sub_8C04(__int64 fd, const char *a2, unsigned int a3, char a4)
{
  unsigned int v4; // w19
  __int64 v8; // x3
  const char *v9; // x0
  __int64 v10; // x1
  __int64 v11; // x2
  __int64 v12; // x23
  size_t v13; // x0
  char v14; // w22
  __int64 v15; // x20
  __int64 v16; // x2
  _BYTE v17[16]; // [xsp+18h] [xbp-3088h] BYREF
  int v18; // [xsp+28h] [xbp-3078h]
  char s[4096]; // [xsp+98h] [xbp-3008h] BYREF
  _BYTE v20[4096]; // [xsp+1098h] [xbp-2008h] BYREF
  char v21[4096]; // [xsp+2098h] [xbp-1008h] BYREF
  __int64 v22; // [xsp+3098h] [xbp-8h]

  v22 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a2 == nullptr )
    return fd;
  v4 = fd;
  if ( (unsigned int)fd > 0xFFF )
    return fd;
  if ( byte_15520 == 0 )
    return fd;
  fd = fstat(fd, (struct stat *)v17);
  if ( (_DWORD)fd != 0 )
    return fd;
  if ( (v18 & 0xF000) != 0x4000 )
    return fd;
  v8 = qword_15528;
  if ( qword_15528 == 0 )
    return fd;
  if ( *a2 == 47 )
  {
    v9 = a2;
LABEL_9:
    v10 = 4294967196LL;
    v11 = 0;
    goto LABEL_16;
  }
  if ( (a4 & 1) != 0 && a3 <= 0xFFF )
  {
    pthread_mutex_lock(&stru_15740);
    v12 = *((_QWORD *)&unk_15768 + a3);
    if ( v12 != 0 )
    {
      v13 = strlen(*((const char **)&unk_15768 + a3));
      if ( v13 < 0x1000 )
      {
        __memcpy_chk(v21, v12, v13 + 1, 4096);
        pthread_mutex_unlock(&stru_15740);
        fd = sub_4FE4((__int64)v20, 4096, v16, (__int64)"%s/%s", v21, a2);
        if ( (int)fd > 4095 )
          return fd;
        v8 = qword_15528;
        v9 = v20;
        goto LABEL_9;
      }
    }
    pthread_mutex_unlock(&stru_15740);
    v8 = qword_15528;
  }
  v11 = a4 & 1;
  v9 = a2;
  v10 = a3;
LABEL_16:
  fd = sub_9434(v9, v10, v11, v8, s, 4096);
  if ( (fd & 1) != 0 )
  {
    if ( byte_15520 == 1 )
    {
      if ( (sub_9584(s, 4294967196LL, 0, 3, v21, 4096, qword_15528, qword_15530, qword_15538, qword_15540) & 0xFFFFFFFE) == 2 )
        v14 = -1;
      else
        v14 = 1;
    }
    else
    {
      v14 = 1;
    }
    fd = (__int64)strdup(s);
    if ( fd != 0 )
    {
      v15 = fd;
      pthread_mutex_lock(&stru_15740);
      free(*((void **)&unk_15768 + v4));
      *((_QWORD *)&unk_15768 + v4) = v15;
      byte_1D768[v4] = v14;
      return pthread_mutex_unlock(&stru_15740);
    }
  }
  return fd;
}


// Address: 0x8E58 | Function: sub_8E58
__int64 __fastcall sub_8E58(__int64 result, unsigned int a2)
{
  unsigned int v3; // w20
  __int64 v4; // x21
  char v5; // w25
  size_t v6; // x0
  char *v7; // x20
  char s[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v9; // [xsp+1008h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (_DWORD)result != a2 && a2 <= 0xFFF )
  {
    v3 = result;
    pthread_mutex_lock(&stru_15740);
    if ( v3 < 0x1000 )
    {
      v4 = *((_QWORD *)&unk_15768 + v3);
      v5 = byte_1D768[v3];
      if ( v4 != 0 && (v6 = strlen(*((const char **)&unk_15768 + v3))) < 0x1000 )
      {
        __memcpy_chk(s, v4, v6 + 1, 4096);
        pthread_mutex_unlock(&stru_15740);
        v7 = strdup(s);
      }
      else
      {
        pthread_mutex_unlock(&stru_15740);
        v7 = nullptr;
      }
      pthread_mutex_lock(&stru_15740);
      free(*((void **)&unk_15768 + a2));
      *((_QWORD *)&unk_15768 + a2) = v7;
      byte_1D768[a2] = v5;
    }
    else
    {
      free(*((void **)&unk_15768 + a2));
      *((_QWORD *)&unk_15768 + a2) = 0;
      byte_1D768[a2] = 0;
    }
    return pthread_mutex_unlock(&stru_15740);
  }
  return result;
}


// Address: 0x8FA0 | Function: sub_8FA0
__int64 __fastcall sub_8FA0(int a1, _BYTE *a2, size_t a3)
{
  __int64 result; // x0
  unsigned __int64 v7; // x8
  char *v10; // x0
  const char *v11; // x4
  char *v12; // x0
  size_t v13; // x0
  _QWORD haystack[512]; // [xsp+8h] [xbp-1048h] BYREF
  _BYTE v15[64]; // [xsp+1008h] [xbp-48h] BYREF
  __int64 v16; // [xsp+1048h] [xbp-8h]

  result = 0;
  v16 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a2 != nullptr && a3 != 0 )
  {
    sub_919C(v15, 64, 64, "/proc/self/fd/%d", a1);
    v7 = syscall(78, 4294967196LL, v15, a2, a3 - 1);
    result = 0;
    if ( (v7 & 0x8000000000000000LL) == 0 && v7 < a3 )
    {
      a2[v7] = 0;
      if ( (sub_9240(a2) & 1) != 0 )
      {
        if ( (haystack[0] != 0x73752F617461642FLL || *(_QWORD *)((char *)haystack + 5) != 0x2F302F726573752FLL)
          && (haystack[0] != 0x73752F617461642FLL || haystack[1] != 0x2F302F65645F7265LL) )
        {
          v10 = strstr((const char *)haystack, "/data_mirror/data_ce/null/0/");
          if ( v10 != nullptr )
          {
            v11 = "/data/user/0/";
LABEL_18:
            sub_919C(a2, -1, a3, "%s%s", v11, v10 + 28);
            return 1;
          }
          v10 = strstr((const char *)haystack, "/data_mirror/data_de/null/0/");
          if ( v10 != nullptr )
          {
            v11 = "/data/user_de/0/";
            goto LABEL_18;
          }
          v12 = strstr((const char *)haystack, "/user_de/0/");
          if ( v12 != nullptr )
          {
            sub_919C(a2, -1, a3, "%s%s", "/data/user_de/0/", v12 + 11);
            return 1;
          }
          if ( (sub_A53C((char *)haystack) & 1) != 0 )
            return 1;
        }
        v13 = __strlen_chk((const char *)haystack, 0x1000u);
        if ( v13 < a3 )
        {
          memcpy(a2, haystack, v13 + 1);
          return 1;
        }
      }
      return 0;
    }
  }
  return result;
}


// Address: 0x919C | Function: sub_919C
__int64 sub_919C(__int64 a1, __int64 a2, __int64 a3, const char *a4, ...)
{
  gcc_va_list va1; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(va1, va);
  return __vsnprintf_chk(a1, a3, 0, a2, a4, va1);
}


// Address: 0x9240 | Function: sub_9240
__int64 __fastcall sub_9240(_BYTE *src, _WORD *a2, unsigned __int64 a3)
{
  int v3; // w9
  _WORD *v4; // x22
  unsigned __int64 v5; // x8
  int v6; // t1
  size_t v7; // x19
  int i; // w10
  char *v9; // x10
  __int64 v10; // x23
  _BYTE *v12; // x20
  _WORD *v13; // x24
  unsigned __int64 v14; // x25

  if ( src == nullptr || a3 < 2 || a2 == nullptr || *src != 47 )
    return 0;
  *a2 = 47;
  v3 = (unsigned __int8)*src;
  if ( *src != 0 )
  {
    v4 = a2 - 1;
    v5 = 1;
    while ( 1 )
    {
      while ( v3 == 47 )
      {
        v6 = (unsigned __int8)*++src;
        v3 = v6;
      }
      if ( v3 == 0 )
      {
LABEL_34:
        if ( v5 == 0 )
          *a2 = 47;
        return 1;
      }
      v7 = 0;
      for ( i = v3; i != 0; i = (unsigned __int8)v9[1] )
      {
        if ( i == 47 )
          break;
        v9 = &src[v7++];
      }
      if ( v7 != 2 )
        break;
      if ( v3 != 46 || src[1] != 46 )
        goto LABEL_24;
      if ( v5 >= 2 )
      {
        while ( 1 )
        {
          v10 = v5 - 1;
          if ( v5 - 1 < 2 )
            break;
          if ( *((_BYTE *)v4 + v5--) == 47 )
            goto LABEL_29;
        }
        v10 = 1;
        goto LABEL_29;
      }
LABEL_30:
      src += v7;
      v3 = (unsigned __int8)*src;
      if ( *src == 0 )
        goto LABEL_34;
    }
    if ( v7 == 1 && v3 == 46 )
      goto LABEL_30;
LABEL_24:
    if ( v5 >= 2 )
    {
      if ( v5 + 1 >= a3 )
        return 0;
      *((_BYTE *)a2 + v5++) = 47;
    }
    v10 = v5 + v7;
    if ( v5 + v7 >= a3 )
      return 0;
    v12 = src;
    v13 = a2;
    v14 = a3;
    memcpy((char *)a2 + v5, src, v7);
    src = v12;
    a3 = v14;
    a2 = v13;
LABEL_29:
    v5 = v10;
    *((_BYTE *)a2 + v10) = 0;
    goto LABEL_30;
  }
  return 1;
}


// Address: 0x93D0 | Function: sub_93D0
void *__fastcall sub_93D0(void *result, unsigned __int64 a2, char *s)
{
  void *v5; // x20

  if ( result != nullptr && a2 != 0 && s != nullptr )
  {
    v5 = result;
    result = (void *)strlen(s);
    if ( (unsigned __int64)result < a2 )
      return memcpy(v5, s, (size_t)result + 1);
  }
  return result;
}


// Address: 0x9434 | Function: sub_9434
// attributes: thunk
__int64 __fastcall sub_9434(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5, __int64 a6)
{
  return sub_9438(a1, a2, a3, a4, a5, a6);
}


// Address: 0x9438 | Function: sub_9438
__int64 __fastcall sub_9438(char *a1, int a2, char a3, const char *a4, _WORD *a5, unsigned __int64 a6)
{
  const char *v8; // x19
  int v12; // w0
  const char *v13; // x20
  _BYTE v14[4096]; // [xsp+8h] [xbp-2008h] BYREF
  _BYTE v15[4096]; // [xsp+1008h] [xbp-1008h] BYREF
  __int64 v16; // [xsp+2008h] [xbp-8h]

  v16 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 != nullptr )
  {
    if ( *a1 != 0 )
    {
      if ( *a1 == 47 )
        return sub_9240(a1, a5, a6);
      v8 = a1;
      sub_919C((__int64)v14, 4096, 4096, "/data/user/0/%s", a4);
      if ( (a3 & 1) == 0 || a2 == -100 || (v12 = a2, v13 = v15, (sub_8FA0(v12, v15, 0x1000u) & 1) == 0) )
        v13 = v14;
      sub_919C((__int64)a5, -1, a6, "%s/%s", v13, v8);
      LOBYTE(a1) = sub_9240(a5, a5, a6);
    }
    else
    {
      LOBYTE(a1) = 0;
    }
  }
  return (unsigned __int8)a1 & 1;
}


// Address: 0x9584 | Function: sub_9584
__int64 __fastcall sub_9584(
        char *a1,
        int a2,
        char a3,
        unsigned int a4,
        void *a5,
        unsigned __int64 a6,
        const char *a7,
        __int64 a8,
        char *a9,
        const char *a10)
{
  __int64 result; // x0
  size_t v17; // x25
  size_t v18; // x25
  size_t v19; // x25
  size_t v20; // x8
  size_t v21; // x0
  size_t v22; // x8
  char *v23; // x1
  size_t v24; // x0
  size_t v25; // x24
  size_t v26; // x0
  size_t v27; // x0
  size_t v28; // x8
  char *v29; // x1
  size_t v30; // x0
  const char *v31; // x0
  size_t v32; // x8
  size_t v33; // x0
  char v34; // w8
  char v35; // [xsp+0h] [xbp-7010h] BYREF
  _WORD v36[2048]; // [xsp+1000h] [xbp-6010h] BYREF
  char v37[4096]; // [xsp+2000h] [xbp-5010h] BYREF
  char v38[4096]; // [xsp+3000h] [xbp-4010h] BYREF
  char v39[4096]; // [xsp+4000h] [xbp-3010h] BYREF
  char v40[4096]; // [xsp+5000h] [xbp-2010h] BYREF
  char v41[4096]; // [xsp+6000h] [xbp-1010h] BYREF
  __int64 v42; // [xsp+7000h] [xbp-10h]

  result = 0;
  v42 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 == nullptr || a5 == nullptr || a6 == 0 || a7 == nullptr || a8 == 0 || a9 == nullptr || a10 == nullptr )
    return result;
  if ( (a4 & 0xFFFFFFFD) == 4 )
    return 3;
  if ( a4 == 7 || (sub_9438(a1, a2, a3 & 1, a7, v36, 0x1000u) & 1) == 0 )
    return 2;
  sub_919C((__int64)v41, 4096, 4096, "/data/data/%s", a7);
  sub_919C((__int64)v40, 4096, 4096, "/data/user/0/%s", a7);
  sub_919C((__int64)v39, 4096, 4096, "/data/user_de/0/%s", a7);
  sub_919C((__int64)v38, 4096, 4096, "%s/data", a9);
  sub_919C((__int64)v37, 4096, 4096, "%s/data/device_protected", a9);
  if ( strcmp((const char *)v36, v41) == 0 || strcmp((const char *)v36, v40) == 0 )
  {
    v21 = __strlen_chk(v38, 0x1000u);
    if ( v21 > 0xFFF )
      goto LABEL_26;
    v22 = v21;
    v23 = v38;
    goto LABEL_23;
  }
  if ( strcmp((const char *)v36, v39) == 0 )
  {
    v24 = __strlen_chk(v37, 0x1000u);
    if ( v24 > 0xFFF )
      goto LABEL_26;
    v22 = v24;
    v23 = v37;
LABEL_23:
    __memcpy_chk(&v35, v23, v22 + 1, 4096);
    goto LABEL_56;
  }
  v17 = __strlen_chk(v41, 0x1000u);
  if ( strncmp((const char *)v36, v41, v17) == 0 && (*((_BYTE *)v36 + v17) == 47 || *((_BYTE *)v36 + v17) == 0) )
  {
    v31 = v41;
LABEL_55:
    v32 = __strlen_chk(v31, 0x1000u);
    sub_919C((__int64)&v35, 4096, 4096, "%s%s", v38, (char *)v36 + v32);
LABEL_56:
    v33 = __strlen_chk(&v35, 0x1000u);
    if ( v33 < a6 )
      memcpy(a5, &v35, v33 + 1);
    return 1;
  }
  v18 = __strlen_chk(v40, 0x1000u);
  if ( strncmp((const char *)v36, v40, v18) == 0 && (*((_BYTE *)v36 + v18) == 47 || *((_BYTE *)v36 + v18) == 0) )
  {
    v31 = v40;
    goto LABEL_55;
  }
  v19 = __strlen_chk(v39, 0x1000u);
  if ( strncmp((const char *)v36, v39, v19) == 0 && (*((_BYTE *)v36 + v19) == 47 || *((_BYTE *)v36 + v19) == 0) )
  {
    v20 = __strlen_chk(v39, 0x1000u);
    sub_919C((__int64)&v35, 4096, 4096, "%s%s", v37, (char *)v36 + v20);
    goto LABEL_56;
  }
LABEL_26:
  sub_919C((__int64)v41, 4096, 4096, "/data/app/%s-1/base.apk", a7);
  sub_919C((__int64)v40, 4096, 4096, "/data/app/%s-1/lib/%s", a7, a10);
  sub_919C((__int64)v39, 4096, 4096, "%s/base.apk", a9);
  sub_919C((__int64)v38, 4096, 4096, "%s/lib", a9);
  if ( strcmp((const char *)v36, v41) == 0 )
  {
    v27 = __strlen_chk(v39, 0x1000u);
    if ( v27 <= 0xFFF )
    {
      v28 = v27;
      v29 = v39;
LABEL_36:
      __memcpy_chk(&v35, v29, v28 + 1, 4096);
LABEL_37:
      if ( a4 - 1 >= 2 )
      {
LABEL_42:
        sub_93D0(a5, a6, &v35);
        return 1;
      }
      return 2;
    }
  }
  else
  {
    if ( strcmp((const char *)v36, v40) != 0 )
    {
      v25 = __strlen_chk(v40, 0x1000u);
      if ( strncmp((const char *)v36, v40, v25) == 0 && (*((_BYTE *)v36 + v25) == 47 || *((_BYTE *)v36 + v25) == 0) )
      {
        v26 = __strlen_chk(v40, 0x1000u);
        sub_919C((__int64)&v35, 4096, 4096, "%s%s", v38, (const char *)v36 + v26);
        goto LABEL_37;
      }
      goto LABEL_39;
    }
    v30 = __strlen_chk(v38, 0x1000u);
    if ( v30 <= 0xFFF )
    {
      v28 = v30;
      v29 = v38;
      goto LABEL_36;
    }
  }
LABEL_39:
  if ( (sub_9B20((int)v36, "/proc") & 1) != 0 )
  {
    if ( a4 == 0 && (sub_9B90(v36, &v35, a9) & 1) != 0 )
      goto LABEL_42;
    return 2;
  }
  if ( (sub_9B20((int)v36, "/dev") & 1) != 0 )
  {
    if ( (sub_9D64(v36) & 1) != 0 )
      return 0;
    else
      return 2;
  }
  if ( (sub_9B20((int)v36, a9) & 1) != 0 )
    return sub_9E58(v36, a4, a9);
  if ( (sub_A0FC(v36) & 1) != 0 )
  {
    if ( a4 - 1 >= 2 )
      return 2 * (unsigned int)(a4 == 3);
    return 2;
  }
  if ( (sub_A20C(v36, a8) & 1) != 0 || (sub_A38C(v36) & 1) != 0 )
    return 2;
  v34 = sub_A40C(v36);
  result = 2;
  if ( (v34 & 1) == 0 )
  {
    if ( (sub_9B20((int)v36, "/data/local/tmp") & 1) != 0 )
      return 2;
    else
      return 0;
  }
  return result;
}


// Address: 0x9B20 | Function: sub_9B20
bool __fastcall sub_9B20(const char *a1, char *s)
{
  _BOOL8 result; // x0
  size_t v5; // x20

  result = false;
  if ( a1 != nullptr && s != nullptr )
  {
    v5 = strlen(s);
    return strncmp(a1, s, v5) == 0 && (a1[v5] == 0 || a1[v5] == 47);
  }
  return result;
}


// Address: 0x9B90 | Function: sub_9B90
__int64 __fastcall sub_9B90(const char *a1, void *a2, const char *a3)
{
  __int64 result; // x0
  __pid_t v7; // w22
  char *v8; // x20
  size_t v9; // x0
  char v10[4096]; // [xsp+8h] [xbp-6008h] BYREF
  char v11[4096]; // [xsp+1008h] [xbp-5008h] BYREF
  char v12[4096]; // [xsp+2008h] [xbp-4008h] BYREF
  char v13[4096]; // [xsp+3008h] [xbp-3008h] BYREF
  char v14[4096]; // [xsp+4008h] [xbp-2008h] BYREF
  char v15[4096]; // [xsp+5008h] [xbp-1008h] BYREF
  __int64 v16; // [xsp+6008h] [xbp-8h]

  result = 0;
  v16 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 != nullptr && a2 != nullptr && a3 != nullptr )
  {
    v7 = getpid();
    sub_919C((__int64)v15, 4096, 4096, "/proc/self/cmdline");
    sub_919C((__int64)v14, 4096, 4096, "/proc/self/comm");
    sub_919C((__int64)v13, 4096, 4096, "/proc/%d/cmdline", v7);
    sub_919C((__int64)v12, 4096, 4096, "/proc/%d/comm", v7);
    sub_919C((__int64)v11, 4096, 4096, "%s/tmp/virtual_proc_self_cmdline", a3);
    sub_919C((__int64)v10, 4096, 4096, "%s/tmp/virtual_proc_self_comm", a3);
    if ( strcmp(a1, v15) == 0 || strcmp(a1, v13) == 0 )
    {
      v8 = v11;
      v9 = __strlen_chk(v11, 0x1000u);
      if ( v9 >= 0x1000 )
        return 0;
    }
    else
    {
      if ( strcmp(a1, v14) != 0 && strcmp(a1, v12) != 0 )
        return 0;
      v8 = v10;
      v9 = __strlen_chk(v10, 0x1000u);
      if ( v9 > 0xFFF )
        return 0;
    }
    memcpy(a2, v8, v9 + 1);
    return 1;
  }
  return result;
}


// Address: 0x9D64 | Function: sub_9D64
bool __fastcall sub_9D64(const char *a1)
{
  _QWORD v3[12]; // [xsp+0h] [xbp-70h] BYREF
  __int64 v4; // [xsp+68h] [xbp-8h]

  v4 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( strcmp(a1, "/dev/null") == 0
    || strcmp(a1, "/dev/zero") == 0
    || strcmp(a1, "/dev/random") == 0
    || strcmp(a1, "/dev/urandom") == 0 )
  {
    return true;
  }
  if ( strcmp(a1, "/dev/ashmem") == 0 )
  {
    memset(v3, 0, 92);
    if ( (int)__system_property_get("ro.build.version.sdk", v3) >= 1 )
      return (unsigned int)(atoi((const char *)v3) - 1) < 0x19;
  }
  return false;
}


// Address: 0x9E58 | Function: sub_9E58
__int64 __fastcall sub_9E58(const char *a1, int a2, const char *a3)
{
  size_t v6; // x22
  size_t v7; // x22
  __int64 result; // x0
  size_t v9; // x22
  size_t v10; // x22
  char s2[4096]; // [xsp+8h] [xbp-7008h] BYREF
  char v13[4096]; // [xsp+1008h] [xbp-6008h] BYREF
  char v14[4096]; // [xsp+2008h] [xbp-5008h] BYREF
  char v15[4096]; // [xsp+3008h] [xbp-4008h] BYREF
  char v16[4096]; // [xsp+4008h] [xbp-3008h] BYREF
  char v17[4096]; // [xsp+5008h] [xbp-2008h] BYREF
  char v18[4096]; // [xsp+6008h] [xbp-1008h] BYREF
  __int64 v19; // [xsp+7008h] [xbp-8h]

  v19 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  sub_919C((__int64)v16, 4096, 4096, "%s/base.apk", a3);
  sub_919C((__int64)v15, 4096, 4096, "%s/lib", a3);
  sub_919C((__int64)v14, 4096, 4096, "%s/opt", a3);
  sub_919C((__int64)v13, 4096, 4096, "%s/data", a3);
  sub_919C((__int64)s2, 4096, 4096, "%s/tmp", a3);
  if ( strcmp(a1, v16) == 0 )
  {
LABEL_10:
    result = 2;
    if ( a2 != 1 )
    {
      if ( a2 == 7 || a2 == 2 )
        return 2;
      else
        return 0;
    }
    return result;
  }
  if ( a1 != nullptr )
  {
    v6 = __strlen_chk(v15, 0x1000u);
    if ( strncmp(a1, v15, v6) == 0 && (a1[v6] == 47 || a1[v6] == 0) )
      goto LABEL_10;
    v7 = __strlen_chk(v14, 0x1000u);
    result = strncmp(a1, v14, v7);
    if ( (_DWORD)result == 0 && (a1[v7] == 0 || a1[v7] == 47) )
      return result;
    if ( (v9 = __strlen_chk(v13, 0x1000u), strncmp(a1, v13, v9) == 0) && (a1[v9] == 0 || a1[v9] == 47)
      || (v10 = __strlen_chk(s2, 0x1000u), strncmp(a1, s2, v10) == 0) && (a1[v10] == 47 || a1[v10] == 0) )
    {
      if ( a2 != 0 )
        return 2;
      if ( a3 == nullptr )
        return 2;
      sub_919C((__int64)v18, 4096, 4096, "%s/tmp/virtual_proc_self_cmdline", a3);
      sub_919C((__int64)v17, 4096, 4096, "%s/tmp/virtual_proc_self_comm", a3);
      result = strcmp(a1, v18);
      if ( (_DWORD)result != 0 )
      {
        result = strcmp(a1, v17);
        if ( (_DWORD)result != 0 )
          return 2;
      }
      return result;
    }
  }
  return 0;
}


// Address: 0xA0FC | Function: sub_A0FC
const char *__fastcall sub_A0FC(const char *result)
{
  const char *v1; // x19

  if ( result != nullptr )
  {
    v1 = result;
    if ( strncmp(result, "/system", 7u) != 0 || (result = (_BYTE *)(&dword_0 + 1), v1[7] != 0) && v1[7] != 47 )
    {
      if ( strncmp(v1, "/apex", 5u) != 0 || (result = (_BYTE *)(&dword_0 + 1), v1[5] != 0) && v1[5] != 47 )
      {
        if ( strncmp(v1, "/vendor", 7u) != 0 || (result = (_BYTE *)(&dword_0 + 1), v1[7] != 0) && v1[7] != 47 )
        {
          if ( strncmp(v1, "/product", 8u) != 0 )
            return (const char *)(strncmp(v1, "/odm", 4u) == 0 && (v1[4] == 0 || v1[4] == 47));
          result = (_BYTE *)(&dword_0 + 1);
          if ( v1[8] != 0 && v1[8] != 47 )
            return (const char *)(strncmp(v1, "/odm", 4u) == 0 && (v1[4] == 0 || v1[4] == 47));
        }
      }
    }
  }
  return result;
}


// Address: 0xA20C | Function: sub_A20C
bool __fastcall sub_A20C(const char *a1, const char *a2)
{
  size_t v4; // x20
  size_t v5; // x20
  size_t v6; // x20
  _BOOL8 result; // x0
  char s2[4096]; // [xsp+8h] [xbp-3008h] BYREF
  char v10[4096]; // [xsp+1008h] [xbp-2008h] BYREF
  char v11[4096]; // [xsp+2008h] [xbp-1008h] BYREF
  __int64 v12; // [xsp+3008h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  sub_919C((__int64)v11, 4096, 4096, "/data/data/%s", a2);
  sub_919C((__int64)v10, 4096, 4096, "/data/user/0/%s", a2);
  sub_919C((__int64)s2, 4096, 4096, "/data/user_de/0/%s", a2);
  if ( a1 == nullptr )
    return false;
  v4 = __strlen_chk(v11, 0x1000u);
  if ( strncmp(a1, v11, v4) != 0 || (result = true, a1[v4] != 0) && a1[v4] != 47 )
  {
    v5 = __strlen_chk(v10, 0x1000u);
    if ( strncmp(a1, v10, v5) != 0 || (result = true, a1[v5] != 0) && a1[v5] != 47 )
    {
      v6 = __strlen_chk(s2, 0x1000u);
      if ( strncmp(a1, s2, v6) != 0 )
        return false;
      return a1[v6] == 0 || a1[v6] == 47;
    }
  }
  return result;
}


// Address: 0xA38C | Function: sub_A38C
const char *__fastcall sub_A38C(const char *result)
{
  const char *v1; // x19

  if ( result != nullptr )
  {
    v1 = result;
    if ( strncmp(result, "/sdcard", 7u) != 0 )
      return (const char *)(strncmp(v1, "/storage", 8u) == 0 && (v1[8] == 0 || v1[8] == 47));
    result = (_BYTE *)(&dword_0 + 1);
    if ( v1[7] != 0 && v1[7] != 47 )
      return (const char *)(strncmp(v1, "/storage", 8u) == 0 && (v1[8] == 0 || v1[8] == 47));
  }
  return result;
}


// Address: 0xA40C | Function: sub_A40C
const char *__fastcall sub_A40C(const char *result)
{
  const char *v1; // x19

  if ( result != nullptr )
  {
    v1 = result;
    if ( strncmp(result, "/data", 5u) == 0 && (v1[5] == 47 || v1[5] == 0) )
    {
      result = (const char *)strncmp(v1, "/data/app", 9u);
      if ( (_DWORD)result != 0 || v1[9] != 0 && v1[9] != 47 )
      {
        result = (const char *)strncmp(v1, "/data/data", 0xAu);
        if ( (_DWORD)result != 0 || v1[10] != 0 && v1[10] != 47 )
        {
          result = (const char *)strncmp(v1, "/data/user", 0xAu);
          if ( (_DWORD)result != 0 || v1[10] != 0 && v1[10] != 47 )
          {
            result = (const char *)strncmp(v1, "/data/user_de", 0xDu);
            if ( (_DWORD)result != 0 || v1[13] != 0 && v1[13] != 47 )
              return (const char *)(strncmp(v1, "/data/local/tmp", 0xFu) != 0 || v1[15] != 0 && v1[15] != 47);
          }
        }
      }
    }
    else
    {
      return nullptr;
    }
  }
  return result;
}


// Address: 0xA53C | Function: sub_A53C
char *__fastcall sub_A53C(char *haystack, const char *a2, const char *a3, __int64 a4, __int64 a5)
{
  char *result; // x0
  char *v11; // x23
  size_t v12; // x0

  result = nullptr;
  if ( a2 != nullptr && a3 != nullptr )
  {
    result = strstr(haystack, a2);
    if ( result != nullptr )
    {
      v11 = result;
      v12 = strlen(a2);
      sub_919C(a4, -1, a5, "%s%s", a3, &v11[v12]);
      return (_BYTE *)(&dword_0 + 1);
    }
  }
  return result;
}


// Address: 0xA5C0 | Function: xhook_register
// attributes: thunk
__int64 __fastcall xhook_register(char *pattern)
{
  return xhook_register_0(pattern);
}


// Address: 0xA5C4 | Function: xhook_ignore
// attributes: thunk
__int64 __fastcall xhook_ignore(char *pattern)
{
  return xhook_ignore_0(pattern);
}


// Address: 0xA5C8 | Function: xhook_refresh
// attributes: thunk
__int64 xhook_refresh()
{
  return xhook_refresh_0();
}


// Address: 0xA5CC | Function: xhook_clear
// attributes: thunk
__int64 xhook_clear()
{
  return xhook_clear_0();
}


// Address: 0xA5D0 | Function: xhook_enable_debug
// attributes: thunk
__int64 xhook_enable_debug()
{
  return nullsub_1();
}


// Address: 0xA5D4 | Function: xhook_enable_sigsegv_protection
// attributes: thunk
__int64 xhook_enable_sigsegv_protection()
{
  return xhook_enable_sigsegv_protection_0();
}


// Address: 0xA5D8 | Function: xhook_register_0
__int64 __fastcall xhook_register_0(char *pattern, const char *a2, __int64 a3, __int64 a4)
{
  __int64 result; // x0
  _QWORD *v9; // x0
  _QWORD *v10; // x19
  char *v11; // x0
  __int128 v12; // q0
  __int128 v13; // q1
  __int64 *v14; // x10
  regex_t preg; // [xsp+8h] [xbp-28h] BYREF

  result = 1002;
  preg.fastmap = *(char **)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( pattern != nullptr && a2 != nullptr && a3 != 0 && dword_1E768 == 0 )
  {
    if ( regcomp(&preg, pattern, 4) != 0 )
    {
      return 1002;
    }
    else
    {
      v9 = malloc(0x48u);
      if ( v9 != nullptr )
      {
        v10 = v9;
        v11 = strdup(a2);
        v10[4] = v11;
        if ( v11 != nullptr )
        {
          v12 = *(_OWORD *)&preg.buffer;
          v13 = *(_OWORD *)&preg.used;
          v10[5] = a3;
          v10[6] = a4;
          *(_OWORD *)v10 = v12;
          *((_OWORD *)v10 + 1) = v13;
          pthread_mutex_lock(&stru_1E76C);
          v14 = off_15500;
          v10[7] = 0;
          v10[8] = v14;
          *v14 = (__int64)v10;
          off_15500 = v10 + 7;
          pthread_mutex_unlock(&stru_1E76C);
          return 0;
        }
        else
        {
          free(v10);
          return 1003;
        }
      }
      else
      {
        return 1003;
      }
    }
  }
  return result;
}


// Address: 0xA6EC | Function: xhook_ignore_0
__int64 __fastcall xhook_ignore_0(char *pattern, const char *a2)
{
  _OWORD *v4; // x0
  _OWORD *v5; // x19
  char *v6; // x0
  __int128 v7; // q1
  __int64 *v8; // x10
  regex_t preg; // [xsp+8h] [xbp-28h] BYREF

  preg.fastmap = *(char **)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( pattern != nullptr && dword_1E768 == 0 && regcomp(&preg, pattern, 4) == 0 )
  {
    v4 = malloc(0x38u);
    if ( v4 != nullptr )
    {
      v5 = v4;
      if ( a2 != nullptr )
      {
        v6 = strdup(a2);
        *((_QWORD *)v5 + 4) = v6;
        if ( v6 == nullptr )
        {
          free(v5);
          return 1003;
        }
      }
      else
      {
        *((_QWORD *)v4 + 4) = 0;
      }
      v7 = *(_OWORD *)&preg.used;
      *v5 = *(_OWORD *)&preg.buffer;
      v5[1] = v7;
      pthread_mutex_lock(&stru_1E76C);
      v8 = off_15510;
      *((_QWORD *)v5 + 5) = 0;
      *((_QWORD *)v5 + 6) = v8;
      *v8 = (__int64)v5;
      off_15510 = (__int64 *)v5 + 5;
      pthread_mutex_unlock(&stru_1E76C);
      return 0;
    }
    return 1003;
  }
  return 1002;
}


// Address: 0xA7E0 | Function: xhook_refresh_0
__int64 __fastcall xhook_refresh_0(int a1)
{
  pthread_mutex_t *v2; // x19
  __int64 v3; // x0
  _QWORD v5[2]; // [xsp+8h] [xbp-28h] BYREF
  _QWORD _18[11]; // [xsp+18h] [xbp-18h] BYREF

  _18[2] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( dword_1E768 != 0 )
  {
    if ( dword_1E794 == 0 )
      return 1001;
  }
  else
  {
    pthread_mutex_lock(&stru_1E76C);
    if ( dword_1E768 == 0 )
    {
      dword_1E768 = 1;
      if ( dword_15518 == 0
        || sigemptyset((sigset_t *)_18) == 0
        && (v5[1] = &sub_AFBC, sigaction(11, (const struct sigaction *)v5, (struct sigaction *)&unk_1E818) == 0) )
      {
        dword_1E794 = 1;
      }
    }
    pthread_mutex_unlock(&stru_1E76C);
    if ( dword_1E794 == 0 )
      return 1001;
  }
  if ( a1 == 0 )
  {
    v2 = &stru_1E7D0;
    v3 = pthread_mutex_lock(&stru_1E7D0);
    sub_B0C4(v3);
    goto LABEL_15;
  }
  if ( dword_1E808 == 0 )
  {
    pthread_mutex_lock(&stru_1E76C);
    if ( dword_1E808 == 0 )
    {
      dword_1E808 = 1;
      dword_1E7F8 = 1;
      if ( pthread_create((pthread_t *)&qword_1E800, nullptr, (void *(*)(void *))sub_AFF4, nullptr) != 0 )
        dword_1E7F8 = 0;
      else
        dword_1E798 = 1;
    }
    pthread_mutex_unlock(&stru_1E76C);
    if ( dword_1E798 == 0 )
      return 1001;
  }
  else if ( dword_1E798 == 0 )
  {
    return 1001;
  }
  v2 = &stru_1E76C;
  pthread_mutex_lock(&stru_1E76C);
  dword_1E79C = 1;
  pthread_cond_signal(&stru_1E7A0);
LABEL_15:
  pthread_mutex_unlock(v2);
  return 0;
}


// Address: 0xA998 | Function: xhook_clear_0
__int64 xhook_clear_0()
{
  __int64 v0; // x8
  __int64 *v1; // x9
  __int64 v2; // x19
  __int64 v3; // x19
  __int64 *v4; // x8
  __int64 v5; // x21
  __int64 **v6; // x9
  regex_t *v7; // x19
  __int64 *re_nsub; // x8
  unsigned __int8 *translate; // x21
  __int64 **v10; // x9
  __int64 v12; // x8
  __int64 v13; // x20
  __int64 v14; // x8
  bool v15; // zf

  if ( dword_1E798 != 0 )
  {
    pthread_mutex_lock(&stru_1E76C);
    dword_1E7F8 = 0;
    pthread_cond_signal(&stru_1E7A0);
    pthread_mutex_unlock(&stru_1E76C);
    pthread_join(qword_1E800, nullptr);
    dword_1E798 = 0;
  }
  dword_1E808 = 0;
  if ( dword_1E794 != 0 )
  {
    if ( dword_15518 != 0 )
      sigaction(11, (const struct sigaction *)&unk_1E818, nullptr);
    dword_1E794 = 0;
  }
  dword_1E768 = 0;
  pthread_mutex_lock(&stru_1E76C);
  pthread_mutex_lock(&stru_1E7D0);
  v0 = 0;
  v1 = &qword_1E810;
  do
  {
    v2 = v0;
    v0 = *v1;
    v1 = (__int64 *)(*v1 + 192);
  }
  while ( v0 != 0 );
  if ( v2 != 0 )
  {
    do
    {
      v12 = *(_QWORD *)(v2 + 200);
      if ( v12 != 0 )
      {
        do
        {
          v13 = v12;
          v12 = *(_QWORD *)(v12 + 192);
        }
        while ( v12 != 0 );
      }
      else
      {
        v13 = *(_QWORD *)(v2 + 208);
        if ( v13 == 0 || v2 != *(_QWORD *)(v13 + 192) )
        {
          v14 = v2;
          do
          {
            v13 = *(_QWORD *)(v14 + 208);
            if ( v13 == 0 )
              break;
            v15 = v14 == *(_QWORD *)(v13 + 200);
            v14 = *(_QWORD *)(v14 + 208);
          }
          while ( v15 );
        }
      }
      sub_AB98(v2);
      if ( *(_QWORD *)v2 != 0 )
        free(*(void **)v2);
      free((void *)v2);
      v2 = v13;
    }
    while ( v13 != 0 );
  }
  v3 = qword_154F8;
  if ( qword_154F8 != 0 )
  {
    do
    {
      v5 = *(_QWORD *)(v3 + 56);
      v4 = *(__int64 **)(v3 + 64);
      v6 = (__int64 **)(v5 + 64);
      if ( v5 == 0 )
        v6 = &off_15500;
      *v6 = v4;
      *v4 = v5;
      regfree((regex_t *)v3);
      free(*(void **)(v3 + 32));
      free((void *)v3);
      v3 = v5;
    }
    while ( v5 != 0 );
  }
  v7 = (regex_t *)qword_15508;
  if ( qword_15508 != 0 )
  {
    do
    {
      translate = v7->translate;
      re_nsub = (__int64 *)v7->re_nsub;
      v10 = (__int64 **)(translate + 48);
      if ( translate == nullptr )
        v10 = &off_15510;
      *v10 = re_nsub;
      *re_nsub = (__int64)translate;
      regfree(v7);
      free(v7->fastmap);
      free(v7);
      v7 = (regex_t *)translate;
    }
    while ( translate != nullptr );
  }
  pthread_mutex_unlock(&stru_1E7D0);
  return pthread_mutex_unlock(&stru_1E76C);
}


// Address: 0xAB98 | Function: sub_AB98
__int64 __fastcall sub_AB98(__int64 result)
{
  __int64 v1; // x8
  __int64 v2; // x10
  __int64 v3; // x12
  int v4; // w9
  __int64 *v5; // x13
  __int64 v6; // x13
  __int64 *v7; // x10
  __int128 v8; // q1
  __int64 v9; // x13
  __int64 v10; // x11
  __int64 *v11; // x11
  __int64 v12; // t1
  __int64 v13; // x11
  __int64 v14; // x9
  __int64 v15; // x14
  __int64 v16; // x10
  __int64 v17; // x13
  __int64 v18; // x14
  __int64 v19; // x13
  __int64 v20; // x14
  __int64 v21; // x14
  __int64 v22; // x13
  __int64 v23; // x13
  __int64 v24; // x14
  __int64 v25; // x11
  __int64 v26; // x11
  __int64 *v27; // x11
  __int64 v28; // t1
  __int64 v29; // x11
  __int64 v30; // x11
  __int64 *v31; // x11
  __int64 v32; // t1
  int v33; // w11
  __int64 v34; // x11
  __int64 v35; // x11
  __int64 *v36; // x11
  __int64 v37; // t1
  int v38; // w11
  __int64 v39; // x11
  __int64 v40; // x11
  __int64 *v41; // x11
  __int64 v42; // t1

  v1 = *(_QWORD *)(result + 200);
  if ( *(_QWORD *)(result + 192) != 0 )
  {
    if ( v1 != 0 )
    {
      do
      {
        v2 = v1;
        v1 = *(_QWORD *)(v1 + 192);
      }
      while ( v1 != 0 );
      v1 = *(_QWORD *)(v2 + 200);
      v3 = *(_QWORD *)(v2 + 208);
      v4 = *(_DWORD *)(v2 + 216);
      if ( v1 != 0 )
        *(_QWORD *)(v1 + 208) = v3;
      if ( v3 != 0 )
      {
        v5 = (__int64 *)(v3 + 192);
        if ( *(_QWORD *)(v3 + 192) != v2 )
          v5 = (__int64 *)(v3 + 200);
      }
      else
      {
        v5 = &qword_1E810;
      }
      *v5 = v1;
      v8 = *(_OWORD *)(result + 208);
      v9 = *(_QWORD *)(v2 + 208);
      *(_OWORD *)(v2 + 192) = *(_OWORD *)(result + 192);
      *(_OWORD *)(v2 + 208) = v8;
      if ( v9 == result )
        v6 = v2;
      else
        v6 = v3;
      v10 = *(_QWORD *)(result + 208);
      if ( v10 != 0 )
      {
        v12 = *(_QWORD *)(v10 + 192);
        v11 = (__int64 *)(v10 + 192);
        if ( v12 != result )
          ++v11;
      }
      else
      {
        v11 = &qword_1E810;
      }
      *v11 = v2;
      v13 = *(_QWORD *)(result + 200);
      *(_QWORD *)(*(_QWORD *)(result + 192) + 208LL) = v2;
      if ( v13 != 0 )
        *(_QWORD *)(v13 + 208) = v2;
      goto LABEL_30;
    }
    v6 = *(_QWORD *)(result + 208);
    v4 = *(_DWORD *)(result + 216);
    v1 = *(_QWORD *)(result + 192);
LABEL_16:
    *(_QWORD *)(v1 + 208) = v6;
    if ( v6 == 0 )
      goto LABEL_17;
LABEL_12:
    v7 = (__int64 *)(v6 + 192);
    if ( *(_QWORD *)(v6 + 192) != result )
      v7 = (__int64 *)(v6 + 200);
    goto LABEL_18;
  }
  v6 = *(_QWORD *)(result + 208);
  v4 = *(_DWORD *)(result + 216);
  if ( v1 != 0 )
    goto LABEL_16;
  if ( v6 != 0 )
    goto LABEL_12;
LABEL_17:
  v7 = &qword_1E810;
LABEL_18:
  *v7 = v1;
LABEL_30:
  if ( v4 != 0 )
    return result;
  v14 = qword_1E810;
  while ( 1 )
  {
    v15 = v1;
    v1 = v6;
    if ( v15 != 0 )
    {
      if ( *(_DWORD *)(v15 + 216) != 0 || v15 == v14 )
        goto LABEL_109;
    }
    else if ( v14 == 0 )
    {
      return result;
    }
    v16 = *(_QWORD *)(v6 + 192);
    if ( v16 == v15 )
      break;
    if ( *(_DWORD *)(v16 + 216) == 1 )
    {
      v17 = *(_QWORD *)(v16 + 200);
      *(_DWORD *)(v16 + 216) = 0;
      *(_DWORD *)(v1 + 216) = 1;
      *(_QWORD *)(v1 + 192) = v17;
      if ( v17 != 0 )
        *(_QWORD *)(v17 + 208) = v1;
      v18 = *(_QWORD *)(v1 + 208);
      *(_QWORD *)(v16 + 208) = v18;
      if ( v18 != 0 )
      {
        if ( v1 == *(_QWORD *)(v18 + 192) )
        {
          *(_QWORD *)(v18 + 192) = v16;
          v17 = *(_QWORD *)(v1 + 192);
        }
        else
        {
          *(_QWORD *)(v18 + 200) = v16;
        }
      }
      else
      {
        v14 = v16;
        qword_1E810 = v16;
      }
      *(_QWORD *)(v16 + 200) = v1;
      *(_QWORD *)(v1 + 208) = v16;
      v16 = v17;
    }
    v21 = *(_QWORD *)(v16 + 192);
    if ( v21 != 0 && *(_DWORD *)(v21 + 216) != 0 )
      goto LABEL_70;
    v22 = *(_QWORD *)(v16 + 200);
    if ( v22 != 0 && *(_DWORD *)(v22 + 216) != 0 )
    {
      if ( v21 != 0 && *(_DWORD *)(v21 + 216) != 0 )
      {
LABEL_70:
        *(_DWORD *)(v16 + 216) = *(_DWORD *)(v1 + 216);
        *(_DWORD *)(v1 + 216) = 0;
        goto LABEL_88;
      }
      v25 = *(_QWORD *)(v22 + 192);
      *(_DWORD *)(v22 + 216) = 0;
      *(_DWORD *)(v16 + 216) = 1;
      *(_QWORD *)(v16 + 200) = v25;
      if ( v25 != 0 )
        *(_QWORD *)(v25 + 208) = v16;
      v26 = *(_QWORD *)(v16 + 208);
      *(_QWORD *)(v22 + 208) = v26;
      if ( v26 != 0 )
      {
        v28 = *(_QWORD *)(v26 + 192);
        v27 = (__int64 *)(v26 + 192);
        if ( v16 != v28 )
          ++v27;
      }
      else
      {
        v27 = &qword_1E810;
        v14 = v22;
      }
      *v27 = v22;
      v33 = *(_DWORD *)(v1 + 216);
      *(_QWORD *)(v22 + 192) = v16;
      *(_QWORD *)(v16 + 208) = v22;
      v16 = *(_QWORD *)(v1 + 192);
      v21 = *(_QWORD *)(v16 + 192);
      *(_DWORD *)(v16 + 216) = v33;
      *(_DWORD *)(v1 + 216) = 0;
      if ( v21 != 0 )
LABEL_88:
        *(_DWORD *)(v21 + 216) = 0;
      v34 = *(_QWORD *)(v16 + 200);
      *(_QWORD *)(v1 + 192) = v34;
      if ( v34 != 0 )
        *(_QWORD *)(v34 + 208) = v1;
      v35 = *(_QWORD *)(v1 + 208);
      *(_QWORD *)(v16 + 208) = v35;
      if ( v35 != 0 )
      {
        v37 = *(_QWORD *)(v35 + 192);
        v36 = (__int64 *)(v35 + 192);
        if ( v1 != v37 )
          ++v36;
      }
      else
      {
        v36 = &qword_1E810;
        v14 = v16;
      }
      *v36 = v16;
      *(_QWORD *)(v16 + 200) = v1;
      goto LABEL_108;
    }
LABEL_33:
    v6 = *(_QWORD *)(v1 + 208);
    *(_DWORD *)(v16 + 216) = 1;
  }
  v16 = *(_QWORD *)(v6 + 200);
  if ( *(_DWORD *)(v16 + 216) == 1 )
  {
    v19 = *(_QWORD *)(v16 + 192);
    *(_DWORD *)(v16 + 216) = 0;
    *(_DWORD *)(v1 + 216) = 1;
    *(_QWORD *)(v1 + 200) = v19;
    if ( v19 != 0 )
      *(_QWORD *)(v19 + 208) = v1;
    v20 = *(_QWORD *)(v1 + 208);
    *(_QWORD *)(v16 + 208) = v20;
    if ( v20 != 0 )
    {
      if ( v1 == *(_QWORD *)(v20 + 192) )
      {
        *(_QWORD *)(v20 + 192) = v16;
      }
      else
      {
        *(_QWORD *)(v20 + 200) = v16;
        v19 = *(_QWORD *)(v1 + 200);
      }
    }
    else
    {
      v14 = v16;
      qword_1E810 = v16;
    }
    *(_QWORD *)(v16 + 192) = v1;
    *(_QWORD *)(v1 + 208) = v16;
    v16 = v19;
  }
  v23 = *(_QWORD *)(v16 + 192);
  if ( v23 == 0 || *(_DWORD *)(v23 + 216) == 0 )
  {
    v24 = *(_QWORD *)(v16 + 200);
    if ( v24 != 0 && *(_DWORD *)(v24 + 216) != 0 )
      goto LABEL_73;
    goto LABEL_33;
  }
  v24 = *(_QWORD *)(v16 + 200);
  if ( v24 != 0 && *(_DWORD *)(v24 + 216) != 0 )
  {
LABEL_73:
    *(_DWORD *)(v16 + 216) = *(_DWORD *)(v1 + 216);
    *(_DWORD *)(v1 + 216) = 0;
    goto LABEL_99;
  }
  v29 = *(_QWORD *)(v23 + 200);
  *(_DWORD *)(v23 + 216) = 0;
  *(_DWORD *)(v16 + 216) = 1;
  *(_QWORD *)(v16 + 192) = v29;
  if ( v29 != 0 )
    *(_QWORD *)(v29 + 208) = v16;
  v30 = *(_QWORD *)(v16 + 208);
  *(_QWORD *)(v23 + 208) = v30;
  if ( v30 != 0 )
  {
    v32 = *(_QWORD *)(v30 + 192);
    v31 = (__int64 *)(v30 + 192);
    if ( v16 != v32 )
      ++v31;
  }
  else
  {
    v31 = &qword_1E810;
    v14 = v23;
  }
  *v31 = v23;
  v38 = *(_DWORD *)(v1 + 216);
  *(_QWORD *)(v23 + 200) = v16;
  *(_QWORD *)(v16 + 208) = v23;
  v16 = *(_QWORD *)(v1 + 200);
  v24 = *(_QWORD *)(v16 + 200);
  *(_DWORD *)(v16 + 216) = v38;
  *(_DWORD *)(v1 + 216) = 0;
  if ( v24 != 0 )
LABEL_99:
    *(_DWORD *)(v24 + 216) = 0;
  v39 = *(_QWORD *)(v16 + 192);
  *(_QWORD *)(v1 + 200) = v39;
  if ( v39 != 0 )
    *(_QWORD *)(v39 + 208) = v1;
  v40 = *(_QWORD *)(v1 + 208);
  *(_QWORD *)(v16 + 208) = v40;
  if ( v40 != 0 )
  {
    v42 = *(_QWORD *)(v40 + 192);
    v41 = (__int64 *)(v40 + 192);
    if ( v1 != v42 )
      ++v41;
  }
  else
  {
    v41 = &qword_1E810;
    v14 = v16;
  }
  *v41 = v16;
  *(_QWORD *)(v16 + 192) = v1;
LABEL_108:
  v15 = v14;
  *(_QWORD *)(v1 + 208) = v16;
  if ( v14 == 0 )
    return result;
LABEL_109:
  *(_DWORD *)(v15 + 216) = 0;
  return result;
}


// Address: 0xAFA4 | Function: nullsub_1
void nullsub_1()
{
  ;
}


// Address: 0xAFA8 | Function: xhook_enable_sigsegv_protection_0
__int64 __fastcall xhook_enable_sigsegv_protection_0(__int64 result)
{
  dword_15518 = result != 0;
  return result;
}


// Address: 0xAFBC | Function: sub_AFBC
__int64 sub_AFBC()
{
  if ( dword_1E838 != 0 )
    siglongjmp(&stru_1E840, 1);
  return sigaction(11, (const struct sigaction *)&unk_1E818, nullptr);
}


// Address: 0xAFF4 | Function: sub_AFF4
__int64 sub_AFF4()
{
  pthread_t v0; // x0
  __int64 v1; // x0

  v0 = pthread_self();
  pthread_setname_np(v0, "xh_refresh_loop");
  if ( dword_1E7F8 != 0 )
  {
    while ( 1 )
    {
      pthread_mutex_lock(&stru_1E76C);
      while ( dword_1E79C == 0 )
      {
        if ( dword_1E7F8 == 0 )
          break;
        pthread_cond_wait(&stru_1E7A0, &stru_1E76C);
      }
      if ( dword_1E7F8 == 0 )
        break;
      dword_1E79C = 0;
      pthread_mutex_unlock(&stru_1E76C);
      v1 = pthread_mutex_lock(&stru_1E7D0);
      sub_B0C4(v1);
      pthread_mutex_unlock(&stru_1E7D0);
      if ( dword_1E7F8 == 0 )
        return 0;
    }
    pthread_mutex_unlock(&stru_1E76C);
  }
  return 0;
}


// Address: 0xB0C4 | Function: sub_B0C4
void sub_B0C4()
{
  FILE *v0; // x0
  FILE *v1; // x19
  void *v2; // x23
  __int64 v3; // x26
  int v4; // w28
  int v5; // w9
  __int64 v6; // x8
  int v7; // w10
  _BOOL4 v9; // w10
  int v10; // w9
  bool v12; // w9
  bool v13; // cc
  char *v14; // x21
  size_t v15; // x0
  __int64 v16; // x22
  __int64 v17; // x22
  const regex_t *v18; // x23
  __int64 v19; // x0
  void **v20; // x22
  const char *fastmap; // x0
  void **v22; // x0
  char *v23; // x0
  __int64 v24; // x8
  __int64 *v25; // x9
  __int64 v26; // x19
  __int64 v27; // x8
  __int64 v28; // x20
  __int64 v29; // x8
  bool v30; // zf
  void *v31; // [xsp+0h] [xbp-530h]
  __int64 v32; // [xsp+8h] [xbp-528h] BYREF
  char *v33; // [xsp+10h] [xbp-520h] BYREF
  int v34; // [xsp+F4h] [xbp-43Ch] BYREF
  __int64 v35; // [xsp+F8h] [xbp-438h] BYREF
  void *v36; // [xsp+100h] [xbp-430h] BYREF
  unsigned __int8 v37; // [xsp+108h] [xbp-428h] BYREF
  char v38; // [xsp+109h] [xbp-427h]
  char v39; // [xsp+10Ah] [xbp-426h]
  char v40; // [xsp+10Bh] [xbp-425h]
  char s1[520]; // [xsp+110h] [xbp-420h] BYREF
  char s[512]; // [xsp+318h] [xbp-218h] BYREF
  __int64 v43; // [xsp+518h] [xbp-18h]

  v43 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  memset(s1, 0, 512);
  v32 = 0;
  v0 = fopen("/proc/self/maps", "r");
  if ( v0 != nullptr )
  {
    v1 = v0;
    if ( fgets(s, 512, v0) != nullptr )
    {
      v2 = nullptr;
      v3 = 0;
      v4 = 45;
      do
      {
        if ( sscanf(s, "%lx-%*lx %4s %lx %*x:%*x %*d%n", &v36, &v37, &v35, &v34) != 3
          || v40 != 112
          || v37 == 45 && v38 == 45 && v39 == 45 )
        {
          goto LABEL_32;
        }
        v5 = v34;
        v6 = v34;
        v7 = (unsigned __int8)s[v34];
        v9 = v7 == 32 || (unsigned int)(v7 - 9) < 5;
        if ( v34 <= 510 && v9 )
        {
          do
          {
            v10 = (unsigned __int8)s[v6 + 1];
            v12 = v10 == 32 || (unsigned int)(v10 - 9) < 5;
            v13 = v6++ <= 509;
          }
          while ( v13 && v12 );
          v5 = v6;
          v34 = v6;
        }
        if ( v5 > 510 )
          goto LABEL_32;
        v14 = &s[v6];
        v15 = strlen(&s[v6]);
        if ( v15 == 0 )
          goto LABEL_32;
        if ( v14[v15 - 1] == 10 )
        {
          v14[v15 - 1] = 0;
          if ( v15 == 1 )
            goto LABEL_32;
        }
        if ( *v14 == 91 )
          goto LABEL_32;
        v16 = v35;
        if ( v39 != 120 )
        {
          v2 = v36;
          v4 = v37;
          __strcpy_chk(s1, v14, 512);
          goto LABEL_33;
        }
        if ( v35 != 0 )
        {
          if ( strcmp(s1, v14) != 0 || v3 != 0 || v4 != 114 )
            goto LABEL_32;
          v36 = v2;
        }
        v17 = qword_154F8;
        if ( qword_154F8 != 0 )
        {
          while ( regexec((const regex_t *)v17, v14, 0, nullptr, 0) != 0 )
          {
            v17 = *(_QWORD *)(v17 + 56);
            if ( v17 == 0 )
              goto LABEL_32;
          }
          v31 = v2;
          v18 = (const regex_t *)qword_15508;
          if ( qword_15508 != 0 )
          {
            while ( 1 )
            {
              if ( regexec(v18, v14, 0, nullptr, 0) == 0 )
              {
                fastmap = v18->fastmap;
                if ( fastmap == nullptr || strcmp(fastmap, *(const char **)(v17 + 32)) == 0 )
                  break;
              }
              v18 = (const regex_t *)v18->translate;
              if ( v18 == nullptr )
                goto LABEL_47;
            }
            v2 = v31;
            goto LABEL_32;
          }
LABEL_47:
          v2 = v31;
          if ( (unsigned int)sub_B4E8(v36) == 0 )
          {
            v33 = v14;
            v19 = sub_B548(&v33);
            if ( v19 == 0 )
            {
              v22 = (void **)malloc(0xE0u);
              if ( v22 == nullptr )
                goto LABEL_32;
              v20 = v22;
              v23 = strdup(v14);
              *v20 = v23;
              if ( v23 != nullptr )
              {
                v20[1] = v36;
                if ( sub_B5A4(&v32, v20) == 0 )
                  goto LABEL_63;
LABEL_50:
                free(*v20);
              }
              free(v20);
              goto LABEL_32;
            }
            v20 = (void **)v19;
            sub_AB98(v19);
            if ( sub_B5A4(&v32, v20) != 0 )
              goto LABEL_50;
            if ( v20[1] != v36 )
            {
              v20[1] = v36;
LABEL_63:
              sub_B820(v20);
            }
          }
        }
LABEL_32:
        v16 = v3;
LABEL_33:
        v3 = v16;
      }
      while ( fgets(s, 512, v1) != nullptr );
    }
    fclose(v1);
    v24 = 0;
    v25 = &qword_1E810;
    do
    {
      v26 = v24;
      v24 = *v25;
      v25 = (__int64 *)(*v25 + 192);
    }
    while ( v24 != 0 );
    if ( v26 != 0 )
    {
      do
      {
        v27 = *(_QWORD *)(v26 + 200);
        if ( v27 != 0 )
        {
          do
          {
            v28 = v27;
            v27 = *(_QWORD *)(v27 + 192);
          }
          while ( v27 != 0 );
        }
        else
        {
          v28 = *(_QWORD *)(v26 + 208);
          if ( v28 == 0 || v26 != *(_QWORD *)(v28 + 192) )
          {
            v29 = v26;
            do
            {
              v28 = *(_QWORD *)(v29 + 208);
              if ( v28 == 0 )
                break;
              v30 = v29 == *(_QWORD *)(v28 + 200);
              v29 = *(_QWORD *)(v29 + 208);
            }
            while ( v30 );
          }
        }
        sub_AB98(v26);
        if ( *(_QWORD *)v26 != 0 )
          free(*(void **)v26);
        free((void *)v26);
        v26 = v28;
      }
      while ( v28 != 0 );
    }
    qword_1E810 = v32;
  }
}


// Address: 0xB4E8 | Function: sub_B4E8
__int64 __fastcall sub_B4E8(__int64 a1)
{
  __int64 result; // x0

  if ( dword_15518 == 0 )
    return ((__int64 (*)(void))sub_B938)();
  dword_1E838 = 1;
  if ( (unsigned int)sigsetjmp(&stru_1E840) != 0 )
    result = 1009;
  else
    result = sub_B938(a1);
  dword_1E838 = 0;
  return result;
}


// Address: 0xB548 | Function: sub_B548
__int64 __fastcall sub_B548(const char **a1)
{
  __int64 v1; // x19
  const char *v2; // x20
  int v3; // w0

  v1 = qword_1E810;
  if ( qword_1E810 != 0 )
  {
    v2 = *a1;
    do
    {
      while ( 1 )
      {
        v3 = strcmp(v2, *(const char **)v1);
        if ( (v3 & 0x80000000) == 0 )
          break;
        v1 = *(_QWORD *)(v1 + 192);
        if ( v1 == 0 )
          return v1;
      }
      if ( v3 == 0 )
        break;
      v1 = *(_QWORD *)(v1 + 200);
    }
    while ( v1 != 0 );
  }
  return v1;
}


// Address: 0xB5A4 | Function: sub_B5A4
const char **__fastcall sub_B5A4(const char ***a1, __int64 a2)
{
  const char **v2; // x8
  const char **v4; // x21
  const char *v5; // x22
  const char **v6; // x20
  int v7; // w0
  __int64 v8; // x9
  char *v9; // x9
  __int64 v10; // x10
  char *v11; // x10
  const char **v12; // x11
  __int64 v13; // x11
  char *v14; // x11
  const char **v15; // x12
  __int64 v16; // x11
  const char ***v17; // x12
  const char *v18; // x11
  __int64 v19; // x10
  const char ***v20; // x12
  const char *v21; // x10
  const char ***v22; // x11
  const char **v23; // t1
  __int64 v24; // x11
  __int64 v25; // x11
  const char ***v26; // x12
  const char ***v27; // x11
  char *v28; // t1
  const char ***v29; // x10
  const char **v30; // t1
  __int64 v31; // x11
  __int64 v32; // x11
  const char ***v33; // x12
  const char ***v34; // x11
  char *v35; // t1

  v2 = *a1;
  v4 = (const char **)a2;
  if ( *a1 != nullptr )
  {
    v5 = *(const char **)a2;
    do
    {
      while ( 1 )
      {
        v6 = v2;
        v7 = strcmp(v5, *v2);
        if ( (v7 & 0x80000000) == 0 )
          break;
        v2 = (const char **)v6[24];
        if ( v2 == nullptr )
          goto LABEL_7;
      }
      if ( v7 == 0 )
        return v6;
      v2 = (const char **)v6[25];
    }
    while ( v2 != nullptr );
LABEL_7:
    v8 = 25;
    if ( v7 < 0 )
      v8 = 24;
    v4[25] = nullptr;
    v4[26] = (const char *)v6;
    v4[24] = nullptr;
    *((_DWORD *)v4 + 54) = 1;
    v6[v8] = (const char *)v4;
    while ( 1 )
    {
      if ( *((_DWORD *)v6 + 54) != 1 )
      {
LABEL_55:
        v4 = *a1;
        goto LABEL_57;
      }
      v9 = (char *)v6[26];
      v10 = *((_QWORD *)v9 + 24);
      if ( v6 == (const char **)v10 )
      {
        v13 = *((_QWORD *)v9 + 25);
        if ( v13 != 0 && *(_DWORD *)(v13 + 216) == 1 )
        {
          *(_DWORD *)(v13 + 216) = 0;
          goto LABEL_23;
        }
        v14 = (char *)v6[25];
        if ( v14 != (char *)v4 )
        {
          v15 = v6;
          v6 = v4;
LABEL_48:
          v31 = *(_QWORD *)(v10 + 200);
          *((_DWORD *)v15 + 54) = 0;
          *((_DWORD *)v9 + 54) = 1;
          *((_QWORD *)v9 + 24) = v31;
          if ( v31 != 0 )
            *(_QWORD *)(v31 + 208) = v9;
          v32 = *((_QWORD *)v9 + 26);
          v33 = a1;
          *(_QWORD *)(v10 + 208) = v32;
          if ( v32 != 0 )
          {
            v35 = *(char **)(v32 + 192);
            v34 = (const char ***)(v32 + 192);
            if ( v9 == v35 )
              v33 = v34;
            else
              v33 = v34 + 1;
          }
          *v33 = (const char **)v10;
          *(_QWORD *)(v10 + 200) = v9;
          goto LABEL_11;
        }
        v19 = *((_QWORD *)v14 + 24);
        v6[25] = (const char *)v19;
        if ( v19 != 0 )
        {
          *(_QWORD *)(v19 + 208) = v6;
          v20 = a1;
          v21 = v6[26];
          *((_QWORD *)v14 + 26) = v21;
          if ( v21 == nullptr )
          {
LABEL_47:
            *v20 = (const char **)v14;
            v15 = v4;
            *((_QWORD *)v14 + 24) = v6;
            v10 = *((_QWORD *)v9 + 24);
            v6[26] = v14;
            goto LABEL_48;
          }
        }
        else
        {
          *((_QWORD *)v14 + 26) = v9;
          v21 = v6[26];
        }
        v30 = *((const char ***)v21 + 24);
        v29 = (const char ***)(v21 + 192);
        if ( v6 == v30 )
          v20 = v29;
        else
          v20 = v29 + 1;
        goto LABEL_47;
      }
      if ( v10 != 0 && *(_DWORD *)(v10 + 216) == 1 )
      {
        *(_DWORD *)(v10 + 216) = 0;
LABEL_23:
        *((_DWORD *)v6 + 54) = 0;
        v6 = (const char **)v9;
        *((_DWORD *)v9 + 54) = 1;
        goto LABEL_12;
      }
      v11 = (char *)v6[24];
      if ( v11 == (char *)v4 )
        break;
      v12 = v6;
      v6 = v4;
LABEL_37:
      v10 = *((_QWORD *)v9 + 25);
      *((_DWORD *)v12 + 54) = 0;
      *((_DWORD *)v9 + 54) = 1;
      v24 = *(_QWORD *)(v10 + 192);
      *((_QWORD *)v9 + 25) = v24;
      if ( v24 != 0 )
        *(_QWORD *)(v24 + 208) = v9;
      v25 = *((_QWORD *)v9 + 26);
      v26 = a1;
      *(_QWORD *)(v10 + 208) = v25;
      if ( v25 != 0 )
      {
        v28 = *(char **)(v25 + 192);
        v27 = (const char ***)(v25 + 192);
        if ( v9 == v28 )
          v26 = v27;
        else
          v26 = v27 + 1;
      }
      *v26 = (const char **)v10;
      *(_QWORD *)(v10 + 192) = v9;
LABEL_11:
      *((_QWORD *)v9 + 26) = v10;
LABEL_12:
      v4 = v6;
      v6 = (const char **)v6[26];
      if ( v6 == nullptr )
        goto LABEL_55;
    }
    v16 = *((_QWORD *)v11 + 25);
    v6[24] = (const char *)v16;
    if ( v16 != 0 )
    {
      *(_QWORD *)(v16 + 208) = v6;
      v17 = a1;
      v18 = v6[26];
      *((_QWORD *)v11 + 26) = v18;
      if ( v18 == nullptr )
      {
LABEL_36:
        v12 = v4;
        *v17 = (const char **)v11;
        *((_QWORD *)v11 + 25) = v6;
        v6[26] = v11;
        goto LABEL_37;
      }
    }
    else
    {
      *((_QWORD *)v11 + 26) = v9;
      v18 = v6[26];
    }
    v23 = *((const char ***)v18 + 24);
    v22 = (const char ***)(v18 + 192);
    if ( v6 == v23 )
      v17 = v22;
    else
      v17 = v22 + 1;
    goto LABEL_36;
  }
  *(_QWORD *)(a2 + 192) = 0;
  *(_QWORD *)(a2 + 200) = 0;
  *(_QWORD *)(a2 + 208) = 0;
  *(_DWORD *)(a2 + 216) = 1;
  *a1 = (const char **)a2;
LABEL_57:
  v6 = nullptr;
  *((_DWORD *)v4 + 54) = 0;
  return v6;
}


// Address: 0xB820 | Function: sub_B820
__int64 __fastcall sub_B820(__int64 a1)
{
  __int64 result; // x0

  if ( dword_15518 == 0 )
    return ((__int64 (*)(void))sub_B878)();
  dword_1E838 = 1;
  result = sigsetjmp(&stru_1E840);
  if ( (_DWORD)result == 0 )
    result = sub_B878(a1);
  dword_1E838 = 0;
  return result;
}


// Address: 0xB878 | Function: sub_B878
__int64 __fastcall sub_B878(const char **a1)
{
  __int64 result; // x0
  __int64 i; // x20
  const regex_t *v4; // x21

  result = sub_B9AC(a1 + 2, a1[1], *a1);
  if ( (_DWORD)result == 0 )
  {
    for ( i = qword_154F8; i != 0; i = *(_QWORD *)(i + 56) )
    {
      result = regexec((const regex_t *)i, *a1, 0, nullptr, 0);
      if ( (_DWORD)result == 0 )
      {
        v4 = (const regex_t *)qword_15508;
        if ( qword_15508 != 0 )
        {
          while ( 1 )
          {
            if ( regexec(v4, *a1, 0, nullptr, 0) == 0 )
            {
              result = (__int64)v4->fastmap;
              if ( result == 0 )
                return result;
              result = strcmp((const char *)result, *(const char **)(i + 32));
              if ( (_DWORD)result == 0 )
                break;
            }
            v4 = (const regex_t *)v4->translate;
            if ( v4 == nullptr )
              goto LABEL_4;
          }
        }
        else
        {
LABEL_4:
          result = sub_BD4C((int)a1 + 16, *(char **)(i + 32));
        }
      }
    }
  }
  return result;
}


// Address: 0xB938 | Function: sub_B938
__int64 __fastcall sub_B938(__int64 a1)
{
  int v1; // w9
  __int64 result; // x0

  if ( *(_DWORD *)a1 != 1179403647
    || *(_BYTE *)(a1 + 4) != 2
    || *(_BYTE *)(a1 + 5) != 1
    || *(_BYTE *)(a1 + 6) != 1
    || (*(_WORD *)(a1 + 16) & 0xFFFE) != 2 )
  {
    return 1007;
  }
  v1 = *(unsigned __int16 *)(a1 + 18);
  result = 1007;
  if ( v1 == 183 )
  {
    if ( *(_DWORD *)(a1 + 20) == 1 )
      return 0;
    else
      return 1007;
  }
  return result;
}


// Address: 0xB9AC | Function: sub_B9AC
__int64 __fastcall sub_B9AC(__int64 a1, unsigned __int64 a2, __int64 a3)
{
  unsigned int v3; // w8
  __int64 v4; // x9
  __int64 v5; // x8
  unsigned __int64 v6; // x9
  unsigned __int64 v7; // x12
  unsigned __int64 v8; // x8
  unsigned __int64 v9; // x10
  __int64 v10; // x11
  unsigned __int64 v12; // x13
  __int64 v13; // x12
  __int64 *v14; // x2
  unsigned __int64 v15; // x8
  __int64 *v16; // x4
  __int64 v17; // x3
  unsigned __int64 v18; // x3
  bool v19; // cf
  unsigned __int64 v20; // x3
  unsigned __int64 v21; // x3
  unsigned int *v22; // x3
  __int64 v23; // x4
  __int64 v24; // x5
  __int64 v25; // x5
  unsigned int v26; // w3
  unsigned __int64 v27; // x3
  unsigned int *v28; // x3
  __int64 v29; // x4
  __int64 v30; // x4
  unsigned int v31; // w3
  unsigned __int64 v32; // x3
  _BYTE *v33; // x8
  unsigned int v34; // w11
  unsigned int v35; // w11

  v3 = 1002;
  if ( a2 == 0 || a3 == 0 )
    return v3;
  *(_OWORD *)a1 = 0u;
  *(_OWORD *)(a1 + 16) = 0u;
  *(_OWORD *)(a1 + 48) = 0u;
  *(_OWORD *)(a1 + 64) = 0u;
  *(_OWORD *)(a1 + 80) = 0u;
  *(_OWORD *)(a1 + 96) = 0u;
  *(_OWORD *)(a1 + 112) = 0u;
  *(_OWORD *)(a1 + 128) = 0u;
  *(_OWORD *)(a1 + 144) = 0u;
  *(_OWORD *)(a1 + 160) = 0u;
  *(_OWORD *)(a1 + 32) = 0u;
  v4 = *(_QWORD *)(a2 + 32);
  v5 = *(unsigned __int16 *)(a2 + 56);
  *(_QWORD *)a1 = a3;
  *(_QWORD *)(a1 + 8) = a2;
  v6 = v4 + a2;
  *(_QWORD *)(a1 + 24) = a2;
  *(_QWORD *)(a1 + 32) = v6;
  if ( v5 == 0 )
    return 1007;
  v7 = v6 + 56LL * (unsigned int)v5;
  v8 = v6;
  while ( *(_DWORD *)v8 != 1 || *(_QWORD *)(v8 + 8) != 0 )
  {
    v8 += 56LL;
    if ( v8 >= v7 )
      return 1007;
  }
  v9 = *(_QWORD *)(v8 + 16);
  v10 = a2 - v9;
  if ( a2 < v9 )
    return 1007;
  v12 = v6;
  *(_QWORD *)(a1 + 16) = v10;
  while ( *(_DWORD *)v12 != 2 )
  {
    v12 += 56LL;
    v3 = 1007;
    if ( v12 >= v7 )
      return v3;
  }
  v13 = *(_QWORD *)(v12 + 40);
  v14 = (__int64 *)(*(_QWORD *)(v12 + 16) + v10);
  *(_DWORD *)(a1 + 48) = v13;
  *(_QWORD *)(a1 + 40) = v14;
  if ( (unsigned int)v13 >> 4 != 0 )
  {
    v15 = (unsigned __int64)&v14[2 * ((unsigned int)v13 >> 4)];
    do
    {
      v17 = *v14;
      if ( *v14 > 17 )
      {
        if ( v17 > 1610612751 )
        {
          if ( v17 > 1610612753 )
          {
            if ( v17 == 1610612754 )
            {
LABEL_16:
              *(_DWORD *)(a1 + 112) = v14[1];
            }
            else if ( v17 == 1879047925 )
            {
              v22 = (unsigned int *)(v14[1] + v10);
              if ( (unsigned __int64)v22 < a2 )
                return 1007;
              v23 = *v22;
              *(_QWORD *)(a1 + 152) = v22 + 4;
              *(_DWORD *)(a1 + 128) = v23;
              *(_DWORD *)(a1 + 148) = v22[1];
              v24 = v22[2];
              *(_DWORD *)(a1 + 160) = v24;
              v25 = (__int64)&v22[2 * v24 + 4];
              v26 = v22[3];
              *(_DWORD *)(a1 + 172) = 1;
              *(_QWORD *)(a1 + 120) = v25;
              *(_DWORD *)(a1 + 164) = v26;
              *(_QWORD *)(a1 + 136) = v25 + 4 * v23;
            }
            goto LABEL_17;
          }
          if ( v17 == 1610612752 )
            goto LABEL_16;
          goto LABEL_40;
        }
        if ( v17 <= 22 )
        {
          if ( v17 == 18 )
          {
LABEL_48:
            *(_DWORD *)(a1 + 96) = v14[1];
          }
          else if ( v17 == 20 )
          {
            *(_DWORD *)(a1 + 168) = v14[1] == 7;
          }
LABEL_17:
          v16 = v14;
          goto LABEL_18;
        }
        if ( v17 != 23 )
        {
          if ( v17 != 1610612751 )
            goto LABEL_17;
LABEL_40:
          v20 = v14[1] + v10;
          v19 = v20 >= a2;
          *(_QWORD *)(a1 + 104) = v20;
          goto LABEL_54;
        }
        v32 = v14[1] + v10;
        v19 = v32 >= a2;
        *(_QWORD *)(a1 + 72) = v32;
      }
      else if ( v17 > 5 )
      {
        if ( v17 > 7 )
        {
          if ( v17 == 8 )
            goto LABEL_48;
          if ( v17 != 17 )
            goto LABEL_17;
LABEL_43:
          v21 = v14[1] + v10;
          v19 = v21 >= a2;
          *(_QWORD *)(a1 + 88) = v21;
          goto LABEL_54;
        }
        if ( v17 != 6 )
          goto LABEL_43;
        v27 = v14[1] + v10;
        v19 = v27 >= a2;
        *(_QWORD *)(a1 + 64) = v27;
      }
      else
      {
        if ( v17 <= 3 )
        {
          v16 = (__int64 *)v15;
          if ( v17 == 0 )
            goto LABEL_18;
          if ( v17 == 2 )
            *(_DWORD *)(a1 + 80) = v14[1];
          goto LABEL_17;
        }
        if ( v17 == 4 )
        {
          if ( *(_DWORD *)(a1 + 172) != 1 )
          {
            v28 = (unsigned int *)(v14[1] + v10);
            if ( (unsigned __int64)v28 < a2 )
              return 1007;
            v29 = *v28;
            *(_QWORD *)(a1 + 120) = v28 + 2;
            *(_DWORD *)(a1 + 128) = v29;
            v30 = (__int64)&v28[v29 + 2];
            v31 = v28[1];
            *(_QWORD *)(a1 + 136) = v30;
            *(_DWORD *)(a1 + 144) = v31;
          }
          goto LABEL_17;
        }
        v18 = v14[1] + v10;
        v19 = v18 >= a2;
        *(_QWORD *)(a1 + 56) = v18;
      }
LABEL_54:
      v16 = v14;
      if ( !v19 )
        return 1007;
LABEL_18:
      v14 = v16 + 2;
    }
    while ( (unsigned __int64)(v16 + 2) < v15 );
  }
  v33 = *(_BYTE **)(a1 + 104);
  if ( v33 != nullptr )
  {
    v34 = *(_DWORD *)(a1 + 112);
    v19 = v34 >= 4;
    v35 = v34 - 4;
    if ( !v19 || *v33 != 65 || v33[1] != 80 || v33[2] != 83 || v33[3] != 50 )
      return 1007;
    *(_DWORD *)(a1 + 112) = v35;
    *(_QWORD *)(a1 + 104) = v33 + 4;
  }
  if ( a2 == v9
    || v6 == 0
    || *(_QWORD *)(a1 + 56) == 0
    || *(_QWORD *)(a1 + 64) == 0
    || *(_QWORD *)(a1 + 120) == 0
    || *(_QWORD *)(a1 + 136) == 0
    || *(_DWORD *)(a1 + 172) == 1 && *(_QWORD *)(a1 + 152) == 0 )
  {
    return 1007;
  }
  return 0;
}


// Address: 0xBD4C | Function: sub_BD4C
__int64 __fastcall sub_BD4C(__int64 a1, char *s2, __int64 a3, __int64 a4)
{
  __int64 result; // x0
  int v8; // w8
  char *v9; // x9
  unsigned int v10; // w25
  int v11; // t1
  unsigned int v12; // w10
  char *v13; // x9
  unsigned int v14; // w10
  int v15; // t1
  __int64 v16; // x22
  __int64 v17; // x19
  __int64 v18; // x24
  unsigned int v19; // w26
  __int64 v20; // x27
  int v21; // w24
  unsigned __int64 v22; // x23
  unsigned __int64 v23; // x25
  __int64 v24; // x26
  unsigned __int64 v25; // x5
  unsigned __int64 v26; // x19
  __int64 v27; // x23
  unsigned __int64 v28; // x24
  __int64 v29; // x19
  unsigned int *v30; // x25
  unsigned int v31; // t1
  unsigned __int8 *v32; // x8
  __int64 v33; // x9
  int v34; // w1
  _QWORD *v35; // x17
  __int64 *v36; // x16
  unsigned __int64 v37; // x25
  __int64 v38; // x13
  __int64 v39; // x12
  unsigned __int8 *v40; // x26
  unsigned int v41; // w14
  unsigned int v42; // t1
  __int64 v43; // x14
  unsigned __int64 v44; // x15
  __int64 v45; // x2
  __int64 v46; // x27
  __int64 v47; // x30
  __int64 v48; // x28
  __int64 v49; // x23
  unsigned __int64 v50; // x4
  __int128 *v51; // x5
  char *v52; // x6
  unsigned __int8 *v53; // x7
  __int64 v54; // x10
  __int64 v55; // x9
  unsigned __int8 *v56; // x8
  signed __int64 v57; // x11
  unsigned int v58; // w13
  __int64 v59; // x3
  unsigned __int8 *i; // x8
  __int64 v61; // x10
  __int64 v62; // x9
  __int64 v63; // x11
  unsigned int v64; // w12
  unsigned __int64 v65; // x10
  bool v66; // cc
  __int64 v67; // x11
  unsigned __int64 v68; // x12
  __int64 v69; // x10
  unsigned __int8 *v70; // x10
  unsigned int v71; // w9
  unsigned __int64 v72; // x13
  __int64 v73; // x8
  unsigned __int8 *v75; // x9
  unsigned __int64 v76; // x10
  bool v77; // cc
  __int64 v78; // x10
  __int64 v79; // x9
  __int64 v80; // x8
  unsigned __int64 v81; // x11
  unsigned int v82; // w12
  unsigned __int64 v83; // x13
  __int64 v84; // x10
  __int64 v86; // x10
  unsigned __int64 v87; // x11
  unsigned int v88; // w12
  unsigned __int64 v89; // x13
  __int64 v90; // x9
  __int64 v92; // x9
  unsigned __int64 v93; // x10
  unsigned __int8 *v94; // x11
  unsigned int v95; // w12
  unsigned __int64 v96; // x13
  __int64 v97; // x8
  __int64 v99; // x14
  __int64 v100; // x10
  __int64 v101; // x9
  __int64 v102; // x11
  unsigned int v103; // w12
  unsigned __int64 v104; // x10
  bool v105; // cc
  __int64 v106; // x10
  __int64 v107; // x10
  __int64 v108; // x9
  __int64 v109; // x8
  unsigned int v110; // w11
  __int64 v111; // x9
  __int128 *v112; // x19
  __int64 v113; // x28
  __int64 *v114; // x8
  char *v115; // x24
  __int64 v116; // x27
  unsigned __int64 v117; // x8
  __int64 v118; // x10
  bool v119; // cc
  __int64 v120; // x8
  unsigned __int64 v121; // x13
  __int64 v122; // x10
  bool v123; // cc
  unsigned __int64 v124; // x11
  __int64 v125; // x13
  unsigned __int8 *v126; // x12
  unsigned int v127; // w13
  unsigned __int64 v128; // x14
  bool v129; // cc
  __int64 v130; // x11
  __int64 v131; // [xsp+8h] [xbp-108h]
  __int64 v132; // [xsp+10h] [xbp-100h]
  __int64 v133; // [xsp+18h] [xbp-F8h]
  unsigned __int8 *v134; // [xsp+20h] [xbp-F0h]
  __int64 *v135; // [xsp+28h] [xbp-E8h]
  unsigned __int64 v136; // [xsp+30h] [xbp-E0h]
  _QWORD *v137; // [xsp+38h] [xbp-D8h]
  unsigned __int64 v138; // [xsp+40h] [xbp-D0h]
  int v139; // [xsp+4Ch] [xbp-C4h]
  __int64 v140; // [xsp+50h] [xbp-C0h]
  int v142; // [xsp+6Ch] [xbp-A4h] BYREF
  unsigned __int8 *v143; // [xsp+70h] [xbp-A0h]
  unsigned __int8 *v144; // [xsp+78h] [xbp-98h]
  __int128 v145; // [xsp+80h] [xbp-90h]
  __int128 v146; // [xsp+90h] [xbp-80h]
  __int128 v147; // [xsp+A0h] [xbp-70h]
  __int128 v148; // [xsp+B0h] [xbp-60h] BYREF
  __int128 v149; // [xsp+C0h] [xbp-50h] BYREF
  _QWORD v150[4]; // [xsp+D0h] [xbp-40h] BYREF
  int v151; // [xsp+F0h] [xbp-20h]
  int v152; // [xsp+F4h] [xbp-1Ch]
  __int64 v153; // [xsp+F8h] [xbp-18h]

  v153 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( *(_QWORD *)a1 == 0 )
    return 1008;
  result = 1002;
  if ( s2 != nullptr && a3 != 0 )
  {
    v8 = (unsigned __int8)*s2;
    if ( *(_DWORD *)(a1 + 172) != 0 )
    {
      if ( *s2 != 0 )
      {
        v9 = s2 + 1;
        v10 = 5381;
        do
        {
          v10 = 33 * v10 + v8;
          v11 = (unsigned __int8)*v9++;
          v8 = v11;
        }
        while ( v11 != 0 );
      }
      else
      {
        v10 = 5381;
      }
      if ( (((1LL << (v10 >> *(_DWORD *)(a1 + 164))) | (1LL << v10))
          & ~*(_QWORD *)(*(_QWORD *)(a1 + 152) + 8LL * ((v10 >> 6) % *(_DWORD *)(a1 + 160)))) != 0 )
      {
        v19 = *(_DWORD *)(a1 + 148);
LABEL_40:
        if ( v19 == 0 )
          return 0;
      }
      else
      {
        v19 = *(_DWORD *)(a1 + 148);
        LODWORD(v16) = *(_DWORD *)(*(_QWORD *)(a1 + 120) + 4LL * (v10 % *(_DWORD *)(a1 + 128)));
        if ( (unsigned int)v16 >= v19 )
        {
          v20 = *(_QWORD *)(a1 + 136);
          while ( 1 )
          {
            v21 = *(_DWORD *)(v20 + 4LL * ((unsigned int)v16 - v19));
            if ( (v21 ^ v10) <= 1
              && strcmp(
                   s2,
                   (const char *)(*(_QWORD *)(a1 + 56)
                                + *(unsigned int *)(*(_QWORD *)(a1 + 64) + 24LL * (unsigned int)v16))) == 0 )
            {
              goto LABEL_25;
            }
            LODWORD(v16) = v16 + 1;
            if ( (v21 & 1) != 0 )
              goto LABEL_40;
          }
        }
      }
      v29 = *(_QWORD *)(a1 + 56);
      v30 = *(unsigned int **)(a1 + 64);
      v16 = 0;
      while ( 1 )
      {
        v31 = *v30;
        v30 += 6;
        if ( strcmp((const char *)(v29 + v31), s2) == 0 )
          break;
        if ( v19 == ++v16 )
          return 0;
      }
    }
    else
    {
      v12 = 0;
      if ( *s2 != 0 )
      {
        v13 = s2 + 1;
        do
        {
          v14 = v8 + 16 * v12;
          v15 = (unsigned __int8)*v13++;
          v8 = v15;
          v12 = v14 & 0xFFFFFFF ^ (16 * (v14 >> 28));
        }
        while ( v15 != 0 );
      }
      LODWORD(v16) = *(_DWORD *)(*(_QWORD *)(a1 + 120) + 4LL * (v12 % *(_DWORD *)(a1 + 128)));
      if ( (_DWORD)v16 == 0 )
        return 0;
      v17 = *(_QWORD *)(a1 + 56);
      v18 = *(_QWORD *)(a1 + 64);
      while ( strcmp(s2, (const char *)(v17 + *(unsigned int *)(v18 + 24LL * (unsigned int)v16))) != 0 )
      {
        LODWORD(v16) = *(_DWORD *)(*(_QWORD *)(a1 + 136) + 4LL * (unsigned int)v16);
        if ( (_DWORD)v16 == 0 )
          return 0;
      }
    }
LABEL_25:
    v22 = *(_QWORD *)(a1 + 72);
    if ( v22 != 0 )
    {
      v23 = v22 + *(unsigned int *)(a1 + 80);
      if ( *(_DWORD *)(a1 + 168) != 0 )
        v24 = 24;
      else
        v24 = 16;
      do
      {
        if ( v22 >= v23 )
          break;
        result = sub_C5A4(a1, 1, a3, a4, (unsigned int)v16, v22, &v142);
        if ( (_DWORD)result != 0 )
          return result;
        v22 += v24;
      }
      while ( v142 == 0 );
    }
    v25 = *(_QWORD *)(a1 + 88);
    if ( v25 != 0 )
    {
      v26 = v25 + *(unsigned int *)(a1 + 96);
      if ( *(_DWORD *)(a1 + 168) != 0 )
        v27 = 24;
      else
        v27 = 16;
      while ( v25 < v26 )
      {
        v28 = v25 + v27;
        result = sub_C5A4(a1, 0, a3, a4, (unsigned int)v16, v25, 0);
        v25 = v28;
        if ( (_DWORD)result != 0 )
          return result;
      }
    }
    v32 = *(unsigned __int8 **)(a1 + 104);
    if ( v32 != nullptr )
    {
      v33 = *(unsigned int *)(a1 + 112);
      v34 = *(_DWORD *)(a1 + 168);
      v35 = v150;
      v36 = (__int64 *)&v149;
      v37 = (unsigned __int64)&v32[v33];
      v152 = 0;
      v151 = v34;
      v143 = nullptr;
      v145 = 0u;
      v146 = 0u;
      v147 = 0u;
      v148 = 0u;
      v149 = 0u;
      memset(v150, 0, sizeof(v150));
      v144 = &v32[v33];
      if ( (_DWORD)v33 != 0 )
      {
        v38 = 0;
        v39 = 0;
        v40 = v32;
        while ( 1 )
        {
          v42 = *v40++;
          v41 = v42;
          v39 |= (unsigned __int64)(v42 & 0x7F) << v38;
          if ( (v42 & 0x80) == 0 )
            break;
          v38 += 7;
          if ( (unsigned __int64)v40 >= v37 )
            goto LABEL_52;
        }
        v121 = v38 + 7;
        v122 = 0;
        v123 = v41 < 0x40 || v121 > 0x3F;
        v124 = 0;
        v143 = v40;
        if ( v123 )
          v125 = 0;
        else
          v125 = -1LL << v121;
        v44 = v39 | v125;
        *(_QWORD *)&v145 = v39 | v125;
        do
        {
          if ( (unsigned __int64)v40 >= v37 )
          {
            v43 = 0;
            goto LABEL_53;
          }
          v126 = v40 + 1;
          v143 = v40 + 1;
          v127 = *v40++;
          v128 = (unsigned __int64)(v127 & 0x7F) << v124;
          v124 += 7LL;
          v122 |= v128;
        }
        while ( (v127 & 0x80) != 0 );
        v129 = v127 < 0x40 || v124 > 0x3F;
        v40 = v126;
        if ( v129 )
          v130 = 0;
        else
          v130 = -1LL << v124;
        v43 = v122 | v130;
        v150[1] = v122 | v130;
      }
      else
      {
        v40 = v32;
LABEL_52:
        v43 = 0;
        v44 = 0;
        v143 = v40;
      }
LABEL_53:
      v45 = 0;
      v46 = 0;
      v47 = 0;
      v48 = 0;
      v49 = 0;
      v50 = 0;
      v51 = &v148;
      v52 = (char *)&v149 + 8;
      v53 = &v32[v33];
      v140 = 0;
      while ( v50 < v44 )
      {
        if ( v49 == v48 )
        {
          if ( (unsigned __int64)v40 < v37 )
          {
            v54 = 0;
            v55 = 0;
            v56 = v40 + 1;
            v57 = v53 - v40;
            while ( 1 )
            {
              v58 = *(v56 - 1);
              v55 |= (unsigned __int64)(v58 & 0x7F) << v54;
              if ( (v58 & 0x80) == 0 )
                break;
              result = 0;
              --v57;
              ++v56;
              v54 += 7;
              if ( v57 == 0 )
                return result;
            }
            v65 = v54 + 7;
            v59 = a4;
            v66 = v58 < 0x40 || v65 > 0x3F;
            v67 = 0;
            v68 = 0;
            if ( v66 )
              v69 = 0;
            else
              v69 = -1LL << v65;
            v48 = v55 | v69;
            *((_QWORD *)&v145 + 1) = v55 | v69;
            while ( (unsigned __int64)v56 < v37 )
            {
              v70 = v56 + 1;
              v143 = v56 + 1;
              v71 = *v56++;
              v72 = (unsigned __int64)(v71 & 0x7F) << v68;
              v68 += 7LL;
              v67 |= v72;
              if ( (v71 & 0x80) == 0 )
              {
                v73 = -1LL << v68;
                if ( v71 < 0x40 || v68 > 0x3F )
                  v73 = 0;
                v47 = v67 | v73;
                *(_QWORD *)&v146 = v67 | v73;
                if ( (((unsigned int)v67 | (unsigned int)v73) & 2) != 0 )
                {
                  v80 = 0;
                  v81 = 0;
                  while ( (unsigned __int64)v70 < v37 )
                  {
                    v75 = v70 + 1;
                    v143 = v70 + 1;
                    v82 = *v70++;
                    v83 = (unsigned __int64)(v82 & 0x7F) << v81;
                    v81 += 7LL;
                    v80 |= v83;
                    if ( (v82 & 0x80) == 0 )
                    {
                      v84 = -1LL << v81;
                      if ( v82 < 0x40 || v81 > 0x3F )
                        v84 = 0;
                      v46 = v80 | v84;
                      *((_QWORD *)&v146 + 1) = v80 | v84;
                      goto LABEL_99;
                    }
                  }
                  return 0;
                }
                v75 = v70;
LABEL_99:
                if ( (v47 & 1) != 0 )
                {
                  v86 = 0;
                  v87 = 0;
                  while ( (unsigned __int64)v75 < v37 )
                  {
                    i = v75 + 1;
                    v143 = v75 + 1;
                    v88 = *v75++;
                    v89 = (unsigned __int64)(v88 & 0x7F) << v87;
                    v87 += 7LL;
                    v86 |= v89;
                    if ( (v88 & 0x80) == 0 )
                    {
                      v90 = -1LL << v87;
                      if ( v88 < 0x40 || v87 > 0x3F )
                        v90 = 0;
                      v140 = v86 | v90;
                      v150[2] = v86 | v90;
                      goto LABEL_110;
                    }
                  }
                  return 0;
                }
                i = v75;
LABEL_110:
                if ( (~(_BYTE)v47 & 0xC) == 0 )
                {
                  if ( v34 != 0 )
                  {
                    v92 = 0;
                    v93 = 0;
                    while ( (unsigned __int64)i < v37 )
                    {
                      v94 = i + 1;
                      v143 = i + 1;
                      v95 = *i++;
                      v96 = (unsigned __int64)(v95 & 0x7F) << v93;
                      v93 += 7LL;
                      v92 |= v96;
                      if ( (v95 & 0x80) == 0 )
                      {
                        v97 = -1LL << v93;
                        if ( v95 < 0x40 || v93 > 0x3F )
                          v97 = 0;
                        v45 += v92 | v97;
                        i = v94;
                        goto LABEL_123;
                      }
                    }
                  }
                  return 0;
                }
                if ( (v47 & 8) == 0 )
                {
                  v45 = 0;
LABEL_123:
                  v150[3] = v45;
                }
                v40 = i;
                v49 = 1;
                *((_QWORD *)&v147 + 1) = 0;
                if ( (v47 & 2) == 0 )
                  goto LABEL_62;
                goto LABEL_125;
              }
            }
          }
          return 0;
        }
        v59 = a4;
        ++v49;
        i = v40;
        if ( (v47 & 2) != 0 )
        {
LABEL_125:
          v79 = v46;
        }
        else
        {
LABEL_62:
          if ( (unsigned __int64)v40 >= v37 )
            return 0;
          ++v40;
          v61 = 0;
          v62 = 0;
          v63 = v53 - i;
          for ( i = v40; ; ++i )
          {
            v64 = *(v40 - 1);
            v62 |= (unsigned __int64)(v64 & 0x7F) << v61;
            if ( (v64 & 0x80) == 0 )
              break;
            result = 0;
            --v63;
            ++v40;
            v61 += 7;
            if ( v63 == 0 )
              return result;
          }
          v76 = v61 + 7;
          v59 = a4;
          v77 = v64 < 0x40 || v76 > 0x3F;
          v143 = v40;
          if ( v77 )
            v78 = 0;
          else
            v78 = -1LL << v76;
          v79 = v62 | v78;
        }
        v99 = v43 + v79;
        v150[1] = v99;
        if ( (v47 & 1) == 0 )
        {
          if ( (unsigned __int64)v40 >= v37 )
            return 0;
          ++v40;
          v100 = 0;
          v101 = 0;
          v102 = v53 - i;
          i = v40;
          while ( 1 )
          {
            v103 = *(v40 - 1);
            v101 |= (unsigned __int64)(v103 & 0x7F) << v100;
            if ( (v103 & 0x80) == 0 )
              break;
            result = 0;
            --v102;
            ++i;
            ++v40;
            v100 += 7;
            if ( v102 == 0 )
              return result;
          }
          v104 = v100 + 7;
          v59 = a4;
          v105 = v103 < 0x40 || v104 > 0x3F;
          v143 = v40;
          if ( v105 )
            v106 = 0;
          else
            v106 = -1LL << v104;
          v140 = v101 | v106;
          v150[2] = v101 | v106;
        }
        if ( v34 != 0 )
        {
          if ( (v47 & 0xC) == 8 )
          {
            if ( (unsigned __int64)v40 >= v37 )
              return 0;
            v107 = 0;
            v108 = 0;
            ++v40;
            v109 = v53 - i;
            while ( 1 )
            {
              v110 = *(v40 - 1);
              v108 |= (unsigned __int64)(v110 & 0x7F) << v107;
              if ( (v110 & 0x80) == 0 )
                break;
              result = 0;
              --v109;
              ++v40;
              v107 += 7;
              if ( v109 == 0 )
                return result;
            }
            v117 = v107 + 7;
            v59 = a4;
            v118 = -1LL << ((unsigned __int8)v107 + 7);
            v119 = v110 < 0x40 || v117 > 0x3F;
            v132 = v48;
            v133 = v46;
            v137 = v35;
            v138 = v44;
            if ( v119 )
              v120 = 0;
            else
              v120 = v118;
            v139 = v34;
            v143 = v40;
            v45 += v108 | v120;
            v150[3] = v45;
          }
          else
          {
            v132 = v48;
            v133 = v46;
            v137 = v35;
            v138 = v44;
            v139 = v34;
          }
          v115 = v52;
          v114 = v36;
          v116 = v99;
          v113 = v45;
          v111 = v45;
          v112 = v51;
          v131 = v47;
          v134 = v53;
          v135 = v36;
          v136 = v50 + 1;
          *(_QWORD *)&v147 = v50 + 1;
          *((_QWORD *)&v147 + 1) = v49;
          *(_QWORD *)&v148 = v99;
          *((_QWORD *)&v148 + 1) = v140;
        }
        else
        {
          v111 = v140;
          v131 = v47;
          v132 = v48;
          v133 = v46;
          v134 = v53;
          v112 = v51;
          v113 = v45;
          v137 = v35;
          v138 = v44;
          v114 = v35;
          v115 = v52;
          v139 = 0;
          v51 = (__int128 *)v52;
          v116 = v99;
          v135 = v36;
          v136 = v50 + 1;
          *(_QWORD *)&v147 = v50 + 1;
          *((_QWORD *)&v147 + 1) = v49;
          *((_QWORD *)&v149 + 1) = v99;
        }
        *v114 = v111;
        result = sub_C5A4(a1, 0, a3, v59, (unsigned int)v16, v51, 0);
        v36 = v135;
        v50 = v136;
        v43 = v116;
        v35 = v137;
        v44 = v138;
        v45 = v113;
        v46 = v133;
        v53 = v134;
        v51 = v112;
        v47 = v131;
        v48 = v132;
        v52 = v115;
        v34 = v139;
        if ( (_DWORD)result != 0 )
          return result;
      }
    }
    return 0;
  }
  return result;
}


// Address: 0xC5A4 | Function: sub_C5A4
__int64 __fastcall sub_C5A4(_QWORD *a1, int a2, __int64 a3, __int64 *a4, int a5, __int64 *a6, _DWORD *a7)
{
  unsigned __int64 v7; // x9
  __int64 v8; // x8
  __int64 result; // x0
  __int64 *v10; // x19
  __int64 v11; // x8
  __int64 v14; // x1
  unsigned int v15; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v16; // [xsp+8h] [xbp-8h]

  v16 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a7 != nullptr )
    *a7 = 0;
  v7 = a6[1];
  if ( a5 != HIDWORD(v7) )
    return 0;
  v8 = *a6;
  if ( a2 != 0 && (unsigned int)v7 != 1026 )
    return 0;
  if ( a2 == 0 && (_DWORD)v7 != 1025 && (_DWORD)v7 != 257 )
    return 0;
  if ( a7 != nullptr )
    *a7 = 1;
  v10 = (__int64 *)(a1[2] + v8);
  if ( (unsigned __int64)v10 < a1[1] )
    return 1007;
  v11 = *v10;
  v15 = 0;
  if ( v11 == a3 )
    return 0;
  result = sub_C8B0(v10, *a1, &v15);
  if ( (_DWORD)result == 0 && (v15 == 3 || (_DWORD)(result = sub_C8C0(v10, 3)) == 0) )
  {
    if ( a4 != nullptr )
      *a4 = *v10;
    v14 = v15;
    *v10 = a3;
    if ( (_DWORD)v14 != 3 )
      sub_C8C0(v10, v14);
    sub_C920(v10);
    return 0;
  }
  return result;
}


// Address: 0xC6D0 | Function: sub_C6D0
__int64 __fastcall sub_C6D0(unsigned __int64 a1, __int64 a2, const char *a3, unsigned int *a4)
{
  FILE *v8; // x0
  FILE *v9; // x19
  unsigned __int64 v10; // x26
  int v11; // w27
  unsigned int v12; // w24
  unsigned __int64 v13; // x8
  unsigned int v14; // w9
  unsigned __int64 v16; // [xsp+0h] [xbp-220h] BYREF
  unsigned __int64 v17; // [xsp+8h] [xbp-218h] BYREF
  char v18; // [xsp+10h] [xbp-210h] BYREF
  char v19; // [xsp+11h] [xbp-20Fh]
  char v20; // [xsp+12h] [xbp-20Eh]
  char v21; // [xsp+13h] [xbp-20Dh]
  char s[512]; // [xsp+18h] [xbp-208h] BYREF
  __int64 v23; // [xsp+218h] [xbp-8h]

  v23 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  *a4 = 0;
  v8 = fopen("/proc/self/maps", "r");
  if ( v8 != nullptr )
  {
    v9 = v8;
    if ( fgets(s, 512, v8) != nullptr )
    {
      v10 = a2 + a1;
      v11 = 1;
      while ( 1 )
      {
        if ( (a3 == nullptr || strstr(s, a3) != nullptr)
          && sscanf(s, "%lx-%lx %4s ", &v17, &v16, &v18) == 3
          && v21 == 112
          && a1 >= v17 )
        {
          v13 = v16;
          if ( a1 < v16 )
            break;
        }
LABEL_7:
        if ( fgets(s, 512, v9) == nullptr )
          goto LABEL_27;
      }
      if ( v11 != 0 )
      {
        if ( v18 == 114 )
          *a4 |= 1u;
        if ( v19 == 119 )
          *a4 |= 2u;
        if ( v20 == 120 )
        {
          v14 = *a4 | 4;
LABEL_5:
          *a4 = v14;
        }
      }
      else
      {
        if ( v18 != 114 )
          *a4 &= ~1u;
        if ( v19 != 119 )
          *a4 &= ~2u;
        if ( v20 != 120 )
        {
          v14 = *a4 & 0xFFFFFFFB;
          goto LABEL_5;
        }
      }
      v11 = 0;
      v12 = 0;
      a1 = v13;
      if ( v10 <= v13 )
        goto LABEL_28;
      goto LABEL_7;
    }
LABEL_27:
    v12 = 1009;
LABEL_28:
    fclose(v9);
  }
  else
  {
    return 1006;
  }
  return v12;
}


// Address: 0xC8B0 | Function: sub_C8B0
__int64 __fastcall sub_C8B0(unsigned __int64 a1, const char *a2, unsigned int *a3)
{
  return sub_C6D0(a1, 8, a2, a3);
}


// Address: 0xC8C0 | Function: sub_C8C0
__int64 __fastcall sub_C8C0(__int64 a1, int a2)
{
  int v4; // w0
  __int64 result; // x0
  unsigned int v6; // w9

  v4 = getpagesize();
  result = mprotect((void *)(a1 & -v4), ((a1 + 7) & -v4) + v4 - (a1 & -v4), a2);
  if ( (_DWORD)result != 0 )
  {
    v6 = *(_DWORD *)__errno(result);
    if ( v6 != 0 )
      return v6;
    else
      return 1001;
  }
  return result;
}


// Address: 0xC920 | Function: sub_C920
__int64 __fastcall sub_C920(__int64 a1)
{
  int v2; // w0

  v2 = getpagesize();
  return sub_CC48(a1 & -v2, ((a1 + 7) & -v2) + v2);
}


// Address: 0xC95C | Function: __emutls_get_address
__int64 __fastcall _emutls_get_address(size_t *a1)
{
  unsigned __int64 v2; // x22
  _QWORD *v3; // x0
  unsigned __int64 v4; // x21
  _QWORD *v5; // x20
  unsigned __int64 v6; // x24
  _QWORD *v7; // x0
  _QWORD *v8; // x0
  pthread_key_t v9; // w0
  unsigned __int64 v10; // x21
  _QWORD *v11; // x22
  __int64 result; // x0
  __int64 v13; // x23
  size_t v14; // x20
  __int64 v15; // x24
  void *v16; // x0
  const void *v17; // x1
  __int64 v18; // x19

  v2 = atomic_load(a1 + 2);
  if ( v2 == 0 )
  {
    pthread_once(dword_1E950, (void (*)(void))sub_CB84);
    pthread_mutex_lock(&stru_1E960);
    v2 = a1[2];
    if ( v2 == 0 )
    {
      v2 = ++qword_1E958;
      atomic_store(qword_1E958, a1 + 2);
    }
    pthread_mutex_unlock(&stru_1E960);
    v3 = pthread_getspecific(dword_1E94C);
    if ( v3 != nullptr )
      goto LABEL_3;
LABEL_9:
    v6 = ((v2 + 17) & 0xFFFFFFFFFFFFFFF0LL) - 2;
    v8 = malloc(8 * v6 + 16);
    if ( v8 == nullptr )
      abort();
    v5 = v8;
    memset(v8 + 2, 0, 8 * v6);
    *v5 = 1;
    goto LABEL_11;
  }
  v3 = pthread_getspecific(dword_1E94C);
  if ( v3 == nullptr )
    goto LABEL_9;
LABEL_3:
  v4 = v3[1];
  v5 = v3;
  if ( v2 > v4 )
  {
    v6 = ((v2 + 17) & 0xFFFFFFFFFFFFFFF0LL) - 2;
    v7 = realloc(v3, 8 * v6 + 16);
    if ( v7 == nullptr )
      abort();
    v5 = v7;
    memset(&v7[v4 + 2], 0, 8 * (v6 - v4));
LABEL_11:
    v9 = dword_1E94C;
    v5[1] = v6;
    pthread_setspecific(v9, v5);
  }
  v10 = v2 - 1;
  v11 = v5 + 2;
  result = v5[v10 + 2];
  if ( result == 0 )
  {
    if ( a1[1] <= 8 )
      v13 = 8;
    else
      v13 = a1[1];
    if ( (v13 & (v13 - 1)) != 0 )
      abort();
    v14 = *a1;
    v16 = malloc(v13 + 7 + *a1);
    if ( v16 == nullptr )
      abort();
    v15 = v13 + 7;
    *(_QWORD *)((((unsigned __int64)v16 + v13 + 7) & -v13) - 8) = v16;
    v17 = (const void *)a1[3];
    v18 = ((unsigned __int64)v16 + v13 + 7) & -v13;
    if ( v17 != nullptr )
      memcpy((void *)(((unsigned __int64)v16 + v15) & -v13), v17, v14);
    else
      memset((void *)(((unsigned __int64)v16 + v15) & -v13), 0, v14);
    v11[v10] = v18;
    return v18;
  }
  return result;
}


// Address: 0xCB48 | Function: sub_CB48
__int64 sub_CB48()
{
  __int64 result; // x0

  if ( byte_1E948 == 1 )
  {
    result = pthread_key_delete(dword_1E94C);
    byte_1E948 = 0;
  }
  return result;
}


// Address: 0xCB84 | Function: sub_CB84
__int64 sub_CB84()
{
  __int64 result; // x0

  result = pthread_key_create((pthread_key_t *)&dword_1E94C, (void (*)(void *))sub_CBC0);
  if ( (_DWORD)result != 0 )
    abort();
  byte_1E948 = 1;
  return result;
}


// Address: 0xCBC0 | Function: sub_CBC0
void __fastcall sub_CBC0(_QWORD *pointer)
{
  unsigned __int64 v2; // x8
  unsigned __int64 i; // x20
  __int64 v4; // x9

  if ( *pointer != 0 )
  {
    --*pointer;
    pthread_setspecific(dword_1E94C, pointer);
  }
  else
  {
    v2 = pointer[1];
    if ( v2 != 0 )
    {
      for ( i = 0; i < v2; ++i )
      {
        v4 = pointer[i + 2];
        if ( v4 != 0 )
        {
          free(*(void **)(v4 - 8));
          v2 = pointer[1];
        }
      }
    }
    free(pointer);
  }
}


// Address: 0xCC48 | Function: sub_CC48
__int64 __fastcall sub_CC48(__int64 result, unsigned __int64 a2)
{
  unsigned __int64 StatusReg; // x9
  __int64 v3; // x9
  unsigned __int64 i; // x10
  __int64 v9; // x8
  unsigned __int64 j; // x9

  BYTE2(StatusReg) = BYTE2(qword_1E988);
  if ( qword_1E988 != 0 )
  {
    if ( (qword_1E988 & 0x10000000) != 0 )
      goto LABEL_7;
  }
  else
  {
    StatusReg = _ReadStatusReg(CTR_EL0);
    qword_1E988 = StatusReg;
    if ( (StatusReg & 0x10000000) != 0 )
      goto LABEL_7;
  }
  v3 = (unsigned int)(4 << (BYTE2(StatusReg) & 0xF));
  for ( i = -v3 & result; i < a2; i += v3 )
    __asm { DC              CVAU, X10 }
LABEL_7:
  __dsb(0xBu);
  if ( (qword_1E988 & 0x20000000) == 0 )
  {
    v9 = (unsigned int)(4 << (qword_1E988 & 0xF));
    for ( j = -v9 & result; j < a2; j += v9 )
      __asm { IC              IVAU, X9 }
    __dsb(0xBu);
  }
  __isb(0xFu);
  return result;
}


// Address: 0xCCE0 | Function: sub_CCE0
void sub_CCE0()
{
  JUMPOUT(0);
}


// Address: 0xCD00 | Function: .__cxa_finalize
// attributes: thunk
int __cxa_finalize(void *a1)
{
  return _cxa_finalize(a1);
}


// Address: 0xCD10 | Function: .__cxa_atexit
// attributes: thunk
int __cxa_atexit(void (*lpfunc)(void *), void *obj, void *lpdso_handle)
{
  return _cxa_atexit(lpfunc, obj, lpdso_handle);
}


// Address: 0xCD20 | Function: .prctl
// attributes: thunk
int prctl(int option, ...)
{
  return prctl(option);
}


// Address: 0xCD30 | Function: .__errno
// attributes: thunk
__int64 __fastcall __errno()
{
  return _errno();
}


// Address: 0xCD40 | Function: .syscall
// attributes: thunk
__int64 syscall(__int64 sysno, ...)
{
  return syscall(sysno);
}


// Address: 0xCD50 | Function: .__stack_chk_fail
// attributes: thunk
void __noreturn __stack_chk_fail()
{
  _stack_chk_fail();
}


// Address: 0xCD60 | Function: .__system_property_get
// attributes: thunk
__int64 __fastcall __system_property_get()
{
  return _system_property_get();
}


// Address: 0xCD70 | Function: .atoi
// attributes: thunk
int atoi(const char *nptr)
{
  return atoi(nptr);
}


// Address: 0xCD80 | Function: .free
// attributes: thunk
void free(void *ptr)
{
  free(ptr);
}


// Address: 0xCD90 | Function: .strdup
// attributes: thunk
char *strdup(const char *s)
{
  return strdup(s);
}


// Address: 0xCDA0 | Function: .chdir
// attributes: thunk
int chdir(const char *path)
{
  return chdir(path);
}


// Address: 0xCDB0 | Function: .strlen
// attributes: thunk
size_t strlen(const char *s)
{
  return strlen(s);
}


// Address: 0xCDC0 | Function: .__strlen_chk
// attributes: thunk
size_t __strlen_chk(const char *a1, size_t a2)
{
  return _strlen_chk(a1, a2);
}


// Address: 0xCDD0 | Function: .xhook_clear
// attributes: thunk
__int64 xhook_clear(void)
{
  return xhook_clear();
}


// Address: 0xCDE0 | Function: .xhook_register
// attributes: thunk
__int64 __fastcall xhook_register(char *pattern)
{
  return xhook_register(pattern);
}


// Address: 0xCDF0 | Function: .xhook_refresh
// attributes: thunk
__int64 __fastcall xhook_refresh()
{
  return xhook_refresh();
}


// Address: 0xCE00 | Function: .__vsnprintf_chk
// attributes: thunk
__int64 __fastcall __vsnprintf_chk()
{
  return _vsnprintf_chk();
}


// Address: 0xCE10 | Function: .pthread_mutex_lock
// attributes: thunk
int pthread_mutex_lock(pthread_mutex_t *mutex)
{
  return pthread_mutex_lock(mutex);
}


// Address: 0xCE20 | Function: .pthread_mutex_unlock
// attributes: thunk
int pthread_mutex_unlock(pthread_mutex_t *mutex)
{
  return pthread_mutex_unlock(mutex);
}


// Address: 0xCE30 | Function: .strncmp
// attributes: thunk
int strncmp(const char *s1, const char *s2, size_t n)
{
  return strncmp(s1, s2, n);
}


// Address: 0xCE40 | Function: .__emutls_get_address
// attributes: thunk
__int64 __fastcall __emutls_get_address(size_t *a1)
{
  return _emutls_get_address(a1);
}


// Address: 0xCE50 | Function: .memcpy
// attributes: thunk
void *memcpy(void *dest, const void *src, size_t n)
{
  return memcpy(dest, src, n);
}


// Address: 0xCE60 | Function: .malloc
// attributes: thunk
void *malloc(size_t size)
{
  return malloc(size);
}


// Address: 0xCE70 | Function: .strrchr
// attributes: thunk
char *strrchr(const char *s, int c)
{
  return strrchr(s, c);
}


// Address: 0xCE80 | Function: .__strrchr_chk
// attributes: thunk
char *__strrchr_chk(const char *a1, int a2, size_t a3)
{
  return _strrchr_chk(a1, a2, a3);
}


// Address: 0xCE90 | Function: .fdopen
// attributes: thunk
FILE *fdopen(int fd, const char *modes)
{
  return fdopen(fd, modes);
}


// Address: 0xCEA0 | Function: .dlclose
// attributes: thunk
int dlclose(void *handle)
{
  return dlclose(handle);
}


// Address: 0xCEB0 | Function: .open
// attributes: thunk
int open(const char *file, int oflag, ...)
{
  return open(file, oflag);
}


// Address: 0xCEC0 | Function: .write
// attributes: thunk
ssize_t write(int fd, const void *buf, size_t n)
{
  return write(fd, buf, n);
}


// Address: 0xCED0 | Function: .close
// attributes: thunk
int close(int fd)
{
  return close(fd);
}


// Address: 0xCEE0 | Function: .strcmp
// attributes: thunk
int strcmp(const char *s1, const char *s2)
{
  return strcmp(s1, s2);
}


// Address: 0xCEF0 | Function: .__memcpy_chk
// attributes: thunk
__int64 __fastcall __memcpy_chk()
{
  return _memcpy_chk();
}


// Address: 0xCF00 | Function: .fstat
// attributes: thunk
int fstat(int fd, struct stat *buf)
{
  return fstat(fd, buf);
}


// Address: 0xCF10 | Function: .strstr
// attributes: thunk
char *strstr(const char *haystack, const char *needle)
{
  return strstr(haystack, needle);
}


// Address: 0xCF20 | Function: .getpid
// attributes: thunk
__pid_t getpid(void)
{
  return getpid();
}


// Address: 0xCF30 | Function: .regcomp
// attributes: thunk
int regcomp(regex_t *preg, const char *pattern, int cflags)
{
  return regcomp(preg, pattern, cflags);
}


// Address: 0xCF40 | Function: .sigemptyset
// attributes: thunk
int sigemptyset(sigset_t *set)
{
  return sigemptyset(set);
}


// Address: 0xCF50 | Function: .sigaction
// attributes: thunk
int sigaction(int sig, const struct sigaction *act, struct sigaction *oact)
{
  return sigaction(sig, act, oact);
}


// Address: 0xCF60 | Function: .pthread_cond_signal
// attributes: thunk
int pthread_cond_signal(pthread_cond_t *cond)
{
  return pthread_cond_signal(cond);
}


// Address: 0xCF70 | Function: .pthread_create
// attributes: thunk
int pthread_create(pthread_t *newthread, const pthread_attr_t *attr, void *(*start_routine)(void *), void *arg)
{
  return pthread_create(newthread, attr, start_routine, arg);
}


// Address: 0xCF80 | Function: .pthread_join
// attributes: thunk
int pthread_join(pthread_t th, void **thread_return)
{
  return pthread_join(th, thread_return);
}


// Address: 0xCF90 | Function: .regfree
// attributes: thunk
void regfree(regex_t *preg)
{
  regfree(preg);
}


// Address: 0xCFA0 | Function: .siglongjmp
// attributes: thunk
void __noreturn siglongjmp(sigjmp_buf env, int val)
{
  siglongjmp(env, val);
}


// Address: 0xCFB0 | Function: .pthread_self
// attributes: thunk
pthread_t pthread_self(void)
{
  return pthread_self();
}


// Address: 0xCFC0 | Function: .pthread_setname_np
// attributes: thunk
int pthread_setname_np(pthread_t target_thread, const char *name)
{
  return pthread_setname_np(target_thread, name);
}


// Address: 0xCFD0 | Function: .pthread_cond_wait
// attributes: thunk
int pthread_cond_wait(pthread_cond_t *cond, pthread_mutex_t *mutex)
{
  return pthread_cond_wait(cond, mutex);
}


// Address: 0xCFE0 | Function: .fopen
// attributes: thunk
FILE *fopen(const char *filename, const char *modes)
{
  return fopen(filename, modes);
}


// Address: 0xCFF0 | Function: .fgets
// attributes: thunk
char *fgets(char *s, int n, FILE *stream)
{
  return fgets(s, n, stream);
}


// Address: 0xD000 | Function: .sscanf
// attributes: thunk
int sscanf(const char *s, const char *format, ...)
{
  return sscanf(s, format);
}


// Address: 0xD010 | Function: .regexec
// attributes: thunk
int regexec(const regex_t *preg, const char *string, size_t nmatch, regmatch_t pmatch[], int eflags)
{
  return regexec(preg, string, nmatch, pmatch, eflags);
}


// Address: 0xD020 | Function: .__strcpy_chk
// attributes: thunk
__int64 __fastcall __strcpy_chk()
{
  return _strcpy_chk();
}


// Address: 0xD030 | Function: .fclose
// attributes: thunk
int fclose(FILE *stream)
{
  return fclose(stream);
}


// Address: 0xD040 | Function: .sigsetjmp
// attributes: thunk
__int64 __fastcall sigsetjmp()
{
  return sigsetjmp();
}


// Address: 0xD050 | Function: .getpagesize
// attributes: thunk
int getpagesize(void)
{
  return getpagesize();
}


// Address: 0xD060 | Function: .mprotect
// attributes: thunk
int mprotect(void *addr, size_t len, int prot)
{
  return mprotect(addr, len, prot);
}


// Address: 0xD070 | Function: .pthread_getspecific
// attributes: thunk
void *pthread_getspecific(pthread_key_t key)
{
  return pthread_getspecific(key);
}


// Address: 0xD080 | Function: .realloc
// attributes: thunk
void *realloc(void *ptr, size_t size)
{
  return realloc(ptr, size);
}


// Address: 0xD090 | Function: .memset
// attributes: thunk
void *memset(void *s, int c, size_t n)
{
  return memset(s, c, n);
}


// Address: 0xD0A0 | Function: .pthread_once
// attributes: thunk
int pthread_once(pthread_once_t *once_control, void (*init_routine)(void))
{
  return pthread_once(once_control, init_routine);
}


// Address: 0xD0B0 | Function: .pthread_setspecific
// attributes: thunk
int pthread_setspecific(pthread_key_t key, const void *pointer)
{
  return pthread_setspecific(key, pointer);
}


// Address: 0xD0C0 | Function: .abort
// attributes: thunk
void __noreturn abort(void)
{
  abort();
}


// Address: 0xD0D0 | Function: .pthread_key_delete
// attributes: thunk
int pthread_key_delete(pthread_key_t key)
{
  return pthread_key_delete(key);
}


// Address: 0xD0E0 | Function: .pthread_key_create
// attributes: thunk
int pthread_key_create(pthread_key_t *key, void (*destr_function)(void *))
{
  return pthread_key_create(key, destr_function);
}


