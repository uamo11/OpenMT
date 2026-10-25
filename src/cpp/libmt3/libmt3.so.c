/* Decompiled from: libmt3.so */
/* Target Architecture: ARM64 */

#include <stdint.h>
#include <stdbool.h>

// Address: 0x2E44 | Function: sub_2E44
__int64 sub_2E44()
{
  return __cxa_finalize(&off_CC20);
}


// Address: 0x2E54 | Function: sub_2E54
void sub_2E54()
{
  ;
}


// Address: 0x2E5C | Function: sub_2E5C
void sub_2E5C()
{
  sub_2E54();
}


// Address: 0x2E64 | Function: sub_2E64
__int64 (*__fastcall sub_2E64(__int64 (*result)(void)))(void)
{
  if ( result != nullptr )
    return (__int64 (*)(void))result();
  return result;
}


// Address: 0x2E78 | Function: sub_2E78
__int64 __fastcall sub_2E78(void *obj)
{
  return __cxa_atexit((void (*)(void *))sub_2E64, obj, &off_CC20);
}


// Address: 0x2E94 | Function: Java_bin_mt_plus_Features3_read
__int64 __fastcall Java_bin_mt_plus_Features3_read(
        __int64 a1,
        __int64 a2,
        unsigned int a3,
        __int64 a4,
        unsigned int a5,
        int a6)
{
  __int64 v6; // x24
  void *v11; // x23
  int chk; // w19
  int *v13; // x0
  char *v14; // x21
  __int64 v15; // x22

  v6 = a6;
  v11 = malloc(a6);
  chk = __read_chk(a3, v11, v6, -1);
  if ( chk < 1 )
  {
    free(v11);
    if ( chk == -1 )
    {
      v13 = (int *)__errno();
      v14 = strerror(*v13);
      v15 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
      (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v15, v14);
      (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v15);
    }
  }
  else
  {
    (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, void *))(*(_QWORD *)a1 + 1664LL))(
      a1,
      a4,
      a5,
      (unsigned int)chk,
      v11);
    free(v11);
  }
  return (unsigned int)chk;
}


// Address: 0x2F94 | Function: Java_bin_mt_plus_Features3_write
__int64 __fastcall Java_bin_mt_plus_Features3_write(__int64 a1, __int64 a2, int a3, __int64 a4, int a5, int a6)
{
  __int64 v11; // x21
  int *v12; // x0
  ssize_t v13; // x0
  __int64 v15; // x20
  int *v16; // x22
  char *v17; // x20
  __int64 v18; // x21

  v11 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, a4, 0);
  if ( a6 < 1 )
    return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v11, 2);
  do
  {
    while ( 1 )
    {
      v13 = write(a3, (const void *)(v11 + a5), (unsigned int)a6);
      if ( v13 == -1 )
        break;
      if ( v13 == 0 )
      {
        (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v11, 2);
        v15 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
        (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 112LL))(a1, v15, "write returned 0");
        return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v15);
      }
      a6 -= v13;
      a5 += v13;
      if ( a6 <= 0 )
        return (*(__int64 (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v11, 2);
    }
    v12 = (int *)__errno();
  }
  while ( *v12 == 4 );
  v16 = v12;
  (*(void (__fastcall **)(__int64, __int64, __int64, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v11, 2);
  v17 = strerror(*v16);
  v18 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
  (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v18, v17);
  return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v18);
}


// Address: 0x313C | Function: Java_bin_mt_plus_Features3_sync
__int64 __fastcall Java_bin_mt_plus_Features3_sync(__int64 a1, int a2, int fd)
{
  __int64 result; // x0
  int *v5; // x0
  char *v6; // x20
  __int64 v7; // x21

  result = fsync(fd);
  if ( (_DWORD)result != 0 )
  {
    v5 = (int *)__errno();
    v6 = strerror(*v5);
    v7 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v7, v6);
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v7);
  }
  return result;
}


// Address: 0x31D0 | Function: Java_bin_mt_plus_Features3_seek
__off64_t __fastcall Java_bin_mt_plus_Features3_seek(__int64 a1, int a2, int fd, __off64_t offset)
{
  __off64_t result; // x0
  int *v6; // x0
  char *v7; // x20
  __int64 v8; // x21

  result = lseek64(fd, offset, 0);
  if ( result == -1 )
  {
    v6 = (int *)__errno();
    v7 = strerror(*v6);
    v8 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v8, v7);
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v8);
  }
  return result;
}


// Address: 0x3270 | Function: Java_bin_mt_plus_Features3_tell
__off64_t __fastcall Java_bin_mt_plus_Features3_tell(__int64 a1, int a2, int fd)
{
  __off64_t result; // x0
  int *v5; // x0
  char *v6; // x20
  __int64 v7; // x21

  result = lseek64(fd, 0, 1);
  if ( result == -1 )
  {
    v5 = (int *)__errno();
    v6 = strerror(*v5);
    v7 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v7, v6);
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v7);
    return -1;
  }
  return result;
}


// Address: 0x330C | Function: Java_bin_mt_plus_Features3_length
__int64 __fastcall Java_bin_mt_plus_Features3_length(__int64 a1, int a2, int fd)
{
  int *v5; // x0
  char *v6; // x20
  __int64 v7; // x21
  _BYTE v8[48]; // [xsp+8h] [xbp-88h] BYREF
  __int64 v9; // [xsp+38h] [xbp-58h]
  __int64 v10; // [xsp+88h] [xbp-8h]

  v10 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( fstat(fd, (struct stat *)v8) != -1 )
    return v9;
  v5 = (int *)__errno();
  v6 = strerror(*v5);
  v7 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
  (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v7, v6);
  (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v7);
  return -1;
}


// Address: 0x33D0 | Function: Java_bin_mt_plus_Features3_truncate
__int64 __fastcall Java_bin_mt_plus_Features3_truncate(__int64 a1, int a2, int fd, __off64_t length)
{
  __int64 result; // x0
  int *v6; // x0
  char *v7; // x20
  __int64 v8; // x21

  result = ftruncate64(fd, length);
  if ( (_DWORD)result != 0 )
  {
    v6 = (int *)__errno();
    v7 = strerror(*v6);
    v8 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v8, v7);
    return (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v8);
  }
  return result;
}


// Address: 0x3468 | Function: Java_bin_mt_plus_Features3_receiveFdResponse
__int64 __fastcall Java_bin_mt_plus_Features3_receiveFdResponse(__int64 a1, int a2, int fd)
{
  ssize_t v5; // x0
  __int64 v6; // x1
  __int64 v7; // x2
  __int64 v8; // x3
  int *v9; // x0
  char *v10; // x20
  __int64 v11; // x21
  __int64 cmsg_len_low; // x19
  struct cmsghdr *msg_control; // x1
  struct msghdr v15; // [xsp+0h] [xbp-70h] BYREF
  _QWORD v16[2]; // [xsp+38h] [xbp-38h] BYREF
  unsigned __int8 v17; // [xsp+4Ch] [xbp-24h] BYREF
  _QWORD v18[4]; // [xsp+50h] [xbp-20h] BYREF

  v18[3] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v16[0] = &v17;
  v16[1] = 1;
  v15.msg_controllen = 0;
  v15.msg_iov = (struct iovec *)v16;
  v15.msg_iovlen = 1;
  v17 = 0;
  memset(v18, 0, 24);
  *(_OWORD *)&v15.msg_name = 0u;
  *(_QWORD *)&v15.msg_flags = 0;
  v15.msg_control = v18;
  while ( 1 )
  {
    v15.msg_controllen = 24;
    v15.msg_flags = 0;
    v5 = recvmsg(fd, &v15, 0);
    if ( (_DWORD)v5 != -1 )
      break;
    v9 = (int *)__errno(v5, v6, v7, v8);
    if ( *v9 != 4 )
      goto LABEL_7;
  }
  if ( (_DWORD)v5 == 0 )
  {
    v9 = (int *)__errno(v5, v6, v7, v8);
    *v9 = 104;
LABEL_7:
    v10 = strerror(*v9);
    v11 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 112LL))(a1, v11, v10);
    (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v11);
    return -1;
  }
  if ( (v15.msg_flags & 8) != 0 )
  {
    cmsg_len_low = 0xFFFFFFFFLL;
  }
  else
  {
    cmsg_len_low = 0xFFFFFFFFLL;
    if ( v15.msg_controllen >= 0x10 )
    {
      msg_control = (struct cmsghdr *)v15.msg_control;
      if ( v15.msg_control != nullptr )
      {
        cmsg_len_low = 0xFFFFFFFFLL;
        while ( msg_control->cmsg_level != 1 || msg_control->cmsg_type != 1 || msg_control->cmsg_len < 0x14 )
        {
          msg_control = __cmsg_nxthdr(&v15, msg_control);
          if ( msg_control == nullptr )
            return cmsg_len_low | ((unsigned __int64)v17 << 32);
        }
        cmsg_len_low = LODWORD(msg_control[1].cmsg_len);
      }
    }
  }
  return cmsg_len_low | ((unsigned __int64)v17 << 32);
}


// Address: 0x3604 | Function: Java_bin_mt_plus_Features3_readlink0
void *__fastcall Java_bin_mt_plus_Features3_readlink0(__int64 a1, __int64 a2, __int64 a3)
{
  size_t v5; // x21
  void *result; // x0
  void *v7; // x20
  unsigned __int64 v8; // x21
  void *v9; // x20
  char buf[4096]; // [xsp+8h] [xbp-1008h] BYREF
  __int64 v11; // [xsp+1008h] [xbp-8h]

  v11 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v5 = (*(int (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1368LL))(a1, a3);
  result = malloc(v5 + 1);
  if ( result != nullptr )
  {
    v7 = result;
    (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, void *))(*(_QWORD *)a1 + 1600LL))(
      a1,
      a3,
      0,
      (unsigned int)v5,
      result);
    if ( (*(unsigned __int8 (__fastcall **)(__int64))(*(_QWORD *)a1 + 1824LL))(a1) != 0 || memchr(v7, 0, v5) != nullptr )
    {
      free(v7);
      return nullptr;
    }
    *((_BYTE *)v7 + v5) = 0;
    v8 = readlink((const char *)v7, buf, 0x1000u);
    free(v7);
    if ( v8 > 0xFFF )
      return nullptr;
    result = (void *)(*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, (unsigned int)v8);
    if ( result != nullptr )
    {
      v9 = result;
      (*(void (__fastcall **)(__int64, void *, _QWORD, _QWORD, char *))(*(_QWORD *)a1 + 1664LL))(
        a1,
        result,
        0,
        (unsigned int)v8,
        buf);
      return v9;
    }
  }
  return result;
}


// Address: 0x374C | Function: Java_bin_mt_plus_Features3_lastModified0
__int64 __fastcall Java_bin_mt_plus_Features3_lastModified0(__int64 *a1, __int64 a2, __int64 a3)
{
  size_t v5; // x21
  void *v6; // x0
  void *v7; // x20
  int v8; // w0
  char *v9; // x20
  __int64 v10; // x21
  __int64 v11; // x8
  __int64 *v12; // x0
  __int64 v13; // x1
  __int64 v14; // x20
  __int64 v16; // x0
  int v17; // w22
  __int64 v18; // x1
  __int64 v19; // x2
  __int64 v20; // x3
  int v21; // w21
  _BYTE v22[88]; // [xsp+8h] [xbp-88h] BYREF
  __int64 v23; // [xsp+60h] [xbp-30h]
  __int64 v24; // [xsp+68h] [xbp-28h]
  __int64 v25; // [xsp+88h] [xbp-8h]

  v25 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v5 = (*(int (__fastcall **)(__int64 *, __int64))(*a1 + 1368))(a1, a3);
  v6 = malloc(v5 + 1);
  if ( v6 == nullptr )
  {
    v8 = 12;
    goto LABEL_5;
  }
  v7 = v6;
  (*(void (__fastcall **)(__int64 *, __int64, _QWORD, _QWORD, void *))(*a1 + 1600))(a1, a3, 0, (unsigned int)v5, v6);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) == 0 )
  {
    if ( memchr(v7, 0, v5) != nullptr )
    {
      free(v7);
      v14 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/io/IOException");
      (*(void (__fastcall **)(__int64 *, __int64, const char *))(*a1 + 112))(a1, v14, "Invalid file path");
      v11 = *a1;
      v12 = a1;
      v13 = v14;
      goto LABEL_8;
    }
    *((_BYTE *)v7 + v5) = 0;
    v16 = stat((const char *)v7, (struct stat *)v22);
    v17 = v16;
    v21 = *(_DWORD *)__errno(v16, v18, v19, v20);
    free(v7);
    if ( v17 != -1 )
      return v24 / 1000000 + 1000 * v23;
    v8 = v21;
LABEL_5:
    v9 = strerror(v8);
    v10 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/io/IOException");
    (*(void (__fastcall **)(__int64 *, __int64, char *))(*a1 + 112))(a1, v10, v9);
    v11 = *a1;
    v12 = a1;
    v13 = v10;
LABEL_8:
    (*(void (__fastcall **)(__int64 *, __int64))(v11 + 184))(v12, v13);
    return 0;
  }
  free(v7);
  return 0;
}


// Address: 0x392C | Function: Java_bin_mt_plus_Features3_stat0
__int64 __fastcall Java_bin_mt_plus_Features3_stat0(__int64 *a1, __int64 a2, __int64 a3, __int64 a4)
{
  size_t v7; // x22
  void *v8; // x0
  void *v9; // x21
  __int64 v11; // x0
  int v12; // w22
  __int64 v13; // x1
  __int64 v14; // x2
  __int64 v15; // x3
  unsigned int v16; // w23
  __int64 v17; // x11
  void (__fastcall *v18)(__int64 *, __int64, _QWORD, __int64, _QWORD *); // x9
  _QWORD v19[16]; // [xsp+0h] [xbp-A0h] BYREF
  _QWORD v20[4]; // [xsp+80h] [xbp-20h] BYREF

  v20[3] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v7 = (*(int (__fastcall **)(__int64 *, __int64))(*a1 + 1368))(a1, a3);
  v8 = malloc(v7 + 1);
  if ( v8 == nullptr )
    return 12;
  v9 = v8;
  (*(void (__fastcall **)(__int64 *, __int64, _QWORD, _QWORD, void *))(*a1 + 1600))(a1, a3, 0, (unsigned int)v7, v8);
  if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(*a1 + 1824))(a1) != 0 )
  {
    free(v9);
    return 0;
  }
  if ( memchr(v9, 0, v7) != nullptr )
  {
    free(v9);
    return 22;
  }
  else
  {
    *((_BYTE *)v9 + v7) = 0;
    v11 = stat((const char *)v9, (struct stat *)v19);
    v12 = v11;
    v16 = *(_DWORD *)__errno(v11, v13, v14, v15);
    free(v9);
    if ( v12 != -1 )
    {
      v17 = *a1;
      v20[0] = LODWORD(v19[2]);
      v20[1] = v19[6];
      v18 = *(void (__fastcall **)(__int64 *, __int64, _QWORD, __int64, _QWORD *))(v17 + 1696);
      v20[2] = v19[12] / 1000000LL + 1000LL * v19[11];
      v18(a1, a4, 0, 3, v20);
      return 0;
    }
    return v16;
  }
}


// Address: 0x3AB4 | Function: Java_bin_mt_plus_Features3_startMTIO
__int64 __fastcall Java_bin_mt_plus_Features3_startMTIO(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  char *v7; // x22
  __int64 v8; // x23
  unsigned int v9; // w24

  v7 = (char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  v8 = (*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a4, 0);
  v9 = sub_431C(v7);
  (*(void (__fastcall **)(__int64, __int64, char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v7);
  (*(void (__fastcall **)(__int64, __int64, __int64))(*(_QWORD *)a1 + 1360LL))(a1, a4, v8);
  return v9;
}


// Address: 0x3B64 | Function: Java_bin_mt_plus_Features3_listGarbledFileNames
__int64 __fastcall Java_bin_mt_plus_Features3_listGarbledFileNames(__int64 a1, __int64 a2, __int64 a3)
{
  const char *v5; // x21
  DIR *v6; // x0
  DIR *v7; // x22
  struct dirent *v8; // x0
  int v9; // w23
  __int64 v10; // x0
  __int64 v11; // x24
  struct dirent *v12; // x0
  int v13; // w25
  int v14; // w8
  struct dirent *v15; // x24
  size_t v16; // x0
  int v17; // w8
  struct dirent *v18; // x27
  size_t v19; // x26
  struct dirent *v20; // x28
  __int64 v21; // x27

  v5 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  v6 = opendir(v5);
  if ( v6 == nullptr )
  {
    v11 = 0;
    goto LABEL_27;
  }
  v7 = v6;
  v8 = readdir(v6);
  v9 = 0;
  if ( v8 != nullptr )
  {
    while ( 1 )
    {
      v14 = (unsigned __int8)v8->d_name[0] - 46;
      if ( v8->d_name[0] != 46 )
        goto LABEL_6;
      if ( v8->d_name[1] != 0 )
        break;
LABEL_7:
      v8 = readdir(v7);
      if ( v8 == nullptr )
        goto LABEL_3;
    }
    v14 = (unsigned __int8)v8->d_name[1] - 46;
    if ( v8->d_name[1] == 46 )
      v14 = (unsigned __int8)v8->d_name[2];
LABEL_6:
    if ( v14 != 0 )
    {
      v15 = v8;
      v16 = strlen(v8->d_name);
      if ( (unsigned int)sub_3D98(v15->d_name, v16) == 0 )
        ++v9;
    }
    goto LABEL_7;
  }
LABEL_3:
  v10 = (*(__int64 (__fastcall **)(__int64, const char *))(*(_QWORD *)a1 + 48LL))(a1, "[B");
  v11 = (*(__int64 (__fastcall **)(__int64, _QWORD, __int64, _QWORD))(*(_QWORD *)a1 + 1376LL))(
          a1,
          (unsigned int)v9,
          v10,
          0);
  if ( v9 >= 1 )
  {
    rewinddir(v7);
    v12 = readdir(v7);
    if ( v12 != nullptr )
    {
      v13 = 0;
      while ( 1 )
      {
        v17 = (unsigned __int8)v12->d_name[0] - 46;
        if ( v12->d_name[0] == 46 )
        {
          if ( v12->d_name[1] == 0 )
            goto LABEL_16;
          v17 = (unsigned __int8)v12->d_name[1] - 46;
          if ( v12->d_name[1] == 46 )
            v17 = (unsigned __int8)v12->d_name[2];
        }
        if ( v17 != 0 )
        {
          v18 = v12;
          v19 = strlen(v12->d_name);
          v20 = v18;
          if ( (unsigned int)sub_3D98(v18->d_name, v19) == 0 )
          {
            v21 = (*(__int64 (__fastcall **)(__int64, _QWORD))(*(_QWORD *)a1 + 1408LL))(a1, (unsigned int)v19);
            (*(void (__fastcall **)(__int64, __int64, _QWORD, _QWORD, char *))(*(_QWORD *)a1 + 1664LL))(
              a1,
              v21,
              0,
              (unsigned int)v19,
              v20->d_name);
            (*(void (__fastcall **)(__int64, __int64, _QWORD, __int64))(*(_QWORD *)a1 + 1392LL))(
              a1,
              v11,
              (unsigned int)v13,
              v21);
            (*(void (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 184LL))(a1, v21);
            ++v13;
          }
          v12 = readdir(v7);
          if ( v12 == nullptr || v13 >= v9 )
            break;
        }
        else
        {
LABEL_16:
          v12 = readdir(v7);
          if ( v12 == nullptr )
            break;
        }
      }
    }
  }
  closedir(v7);
LABEL_27:
  (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v5);
  return v11;
}


// Address: 0x3D98 | Function: sub_3D98
__int64 __fastcall sub_3D98(__int64 a1, unsigned __int64 a2)
{
  unsigned __int64 v2; // x9
  _BYTE *v3; // x10
  int v4; // w8
  unsigned int v5; // w11
  int v6; // w12
  int v7; // w13
  int v8; // w8
  __int64 v9; // x14
  unsigned int v10; // w11
  unsigned int v11; // w8

  if ( a2 != 0 )
  {
    v2 = 0;
    do
    {
      v3 = (_BYTE *)(a1 + v2);
      v4 = *(char *)(a1 + v2);
      if ( (v4 & 0x80000000) == 0 )
      {
        if ( v2 >= a2 )
          return 0;
        ++v2;
        continue;
      }
      v5 = *(unsigned __int8 *)(a1 + v2);
      v6 = v4 & 0xE0;
      if ( v6 == 192 )
      {
        if ( v5 < 0xC2 )
          return 0;
        v7 = 0;
        v8 = 0;
        v9 = 2;
      }
      else if ( (v4 & 0xF0) == 0xE0 )
      {
        v8 = 0;
        v7 = 1;
        v9 = 3;
      }
      else
      {
        if ( v5 > 0xF4 || (v4 & 0xF8) != 0xF0 )
          return 0;
        v7 = 0;
        v8 = 1;
        v9 = 4;
      }
      v2 += v9;
      if ( v2 > a2 )
        return 0;
      if ( (v5 & 0x80) != 0 )
      {
        if ( (v3[1] & 0xC0) != 0x80 )
          return 0;
        if ( v6 != 192 )
        {
          if ( (v3[2] & 0xC0) != 0x80 )
            return 0;
          if ( (v7 & 1) != 0 )
          {
LABEL_23:
            v10 = (v5 & 0xF) << 12;
            v11 = v10 & 0x1F03F | ((v3[1] & 0x3F) << 6);
            if ( v11 < 0x800 || v10 >> 13 <= 6 && v11 >> 11 >= 0x1B )
              return 0;
            continue;
          }
          if ( (v3[3] & 0xC0) != 0x80 )
            return 0;
        }
      }
      if ( v7 != 0 )
        goto LABEL_23;
      if ( v8 != 0 && ((((v3[1] & 0x30) << 12) & 0x3FFFF | ((v5 & 7) << 18)) - 0x10000) >> 20 != 0 )
        return 0;
    }
    while ( v2 < a2 );
  }
  return 1;
}


// Address: 0x3EE4 | Function: Java_bin_mt_plus_Features3_delete
__int64 __fastcall Java_bin_mt_plus_Features3_delete(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  const char *v7; // x22
  int v8; // w24
  const void *v9; // x23
  size_t v10; // x0
  size_t v11; // x26
  _BOOL4 v12; // w28
  size_t v13; // x25
  char *v14; // x24
  char *v15; // x26
  __int64 v16; // x0
  __int64 v17; // x1
  __int64 v18; // x2
  __int64 v19; // x3
  bool v20; // zf
  int v21; // w0
  unsigned int v22; // w25
  char v24[16]; // [xsp+8h] [xbp-88h] BYREF
  int v25; // [xsp+18h] [xbp-78h]
  __int64 v26; // [xsp+88h] [xbp-8h]

  v26 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v7 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  v8 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1368LL))(a1, a4);
  v9 = (const void *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, a4, 0);
  v10 = strlen(v7);
  v11 = v10;
  v12 = v10 == 0 || v7[v10 - 1] != 47;
  v13 = v8;
  v14 = (char *)malloc(v8 + v10 + v12 + 1);
  memcpy(v14, v7, v11);
  v15 = &v14[v11];
  if ( v12 )
    *v15++ = 47;
  memcpy(v15, v9, v13);
  v15[v13] = 0;
  v16 = lstat(v14, (struct stat *)v24);
  if ( (_DWORD)v16 != 0 )
  {
    v20 = *(_DWORD *)__errno(v16, v17, v18, v19) == 2;
  }
  else
  {
    if ( (v25 & 0xF000) == 0x4000 )
      v21 = rmdir(v14);
    else
      v21 = unlink(v14);
    v20 = v21 == 0;
  }
  v22 = v20;
  free(v14);
  (*(void (__fastcall **)(__int64, __int64, const void *, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v9, 2);
  (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v7);
  return v22;
}


// Address: 0x4094 | Function: Java_bin_mt_plus_Features3_rename
bool __fastcall Java_bin_mt_plus_Features3_rename(__int64 a1, __int64 a2, __int64 a3, __int64 a4, __int64 a5)
{
  const char *v8; // x22
  const char *v9; // x24
  int v10; // w26
  const void *v11; // x25
  size_t v12; // x0
  size_t v13; // x28
  _BOOL4 v14; // w20
  size_t v15; // x27
  char *v16; // x26
  char *v17; // x28
  _BOOL4 v18; // w27

  v8 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a3, 0);
  v9 = (const char *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1352LL))(a1, a5, 0);
  v10 = (*(__int64 (__fastcall **)(__int64, __int64))(*(_QWORD *)a1 + 1368LL))(a1, a4);
  v11 = (const void *)(*(__int64 (__fastcall **)(__int64, __int64, _QWORD))(*(_QWORD *)a1 + 1472LL))(a1, a4, 0);
  v12 = strlen(v8);
  v13 = v12;
  v14 = v12 == 0 || v8[v12 - 1] != 47;
  v15 = v10;
  v16 = (char *)malloc(v10 + v12 + v14 + 1);
  memcpy(v16, v8, v13);
  v17 = &v16[v13];
  if ( v14 )
    *v17++ = 47;
  memcpy(v17, v11, v15);
  v17[v15] = 0;
  v18 = rename(v16, v9) == 0;
  free(v16);
  (*(void (__fastcall **)(__int64, __int64, const void *, __int64))(*(_QWORD *)a1 + 1536LL))(a1, a4, v11, 2);
  (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a5, v9);
  (*(void (__fastcall **)(__int64, __int64, const char *))(*(_QWORD *)a1 + 1360LL))(a1, a3, v8);
  return v18;
}


// Address: 0x4228 | Function: Java_bin_mt_plus_Features3_newStringUTF
__int64 __fastcall Java_bin_mt_plus_Features3_newStringUTF(__int64 *a1, __int64 a2, __int64 a3)
{
  int v5; // w22
  __int64 v6; // x0
  const void *v7; // x21
  _BYTE *v8; // x0
  _BYTE *v9; // x23
  __int64 v10; // x8
  __int64 v11; // x19

  if ( a3 != 0 )
  {
    v5 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1368))(a1, a3);
    v6 = (*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1472))(a1, a3, 0);
    if ( v6 != 0 )
    {
      v7 = (const void *)v6;
      v8 = malloc(v5 + 1);
      if ( v8 != nullptr )
      {
        v9 = v8;
        memcpy(v8, v7, v5);
        v10 = *a1;
        v9[v5] = 0;
        (*(void (__fastcall **)(__int64 *, __int64, const void *, __int64))(v10 + 1536))(a1, a3, v7, 2);
        v11 = (*(__int64 (__fastcall **)(__int64 *, _BYTE *))(*a1 + 1336))(a1, v9);
        free(v9);
        return v11;
      }
      (*(void (__fastcall **)(__int64 *, __int64, const void *, __int64))(*a1 + 1536))(a1, a3, v7, 2);
    }
  }
  return 0;
}


// Address: 0x431C | Function: sub_431C
__int64 __fastcall sub_431C(char *s2, const char *a2, signed int a3)
{
  __int64 v6; // x0
  __int64 v7; // x1
  __int64 v8; // x2
  __int64 v9; // x3
  int v10; // w20
  __int64 result; // x0
  unsigned int v12; // w19
  size_t v13; // x0
  __int64 v14; // x1
  __int64 v15; // x2
  __int64 v16; // x3
  int v17; // w19
  int v18; // w22
  _DWORD *v19; // x0
  _DWORD *v20; // x20
  _DWORD *v21; // x21
  __int64 i; // x19
  int v23; // w0
  fd_set v24; // [xsp+0h] [xbp-180h] BYREF
  fd_set v25; // [xsp+80h] [xbp-100h] BYREF
  struct sockaddr optval[7]; // [xsp+108h] [xbp-78h] BYREF
  __int64 v27; // [xsp+178h] [xbp-8h]

  v27 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v6 = strcmp("daemon", s2);
  v10 = v6;
  if ( (_DWORD)v6 != 0 )
  {
    v6 = strcmp("standard", s2);
    if ( (_DWORD)v6 != 0 )
    {
      fwrite("Argument error.\n", 0x10u, 1u, (FILE *)((char *)&_sF + 304));
      return 0xFFFFFFFFLL;
    }
  }
  if ( a3 < 1 )
  {
    result = socket(1, 1, 0);
    if ( (_DWORD)result == -1 )
      return result;
    v12 = result;
    optval[0].sa_family = 1;
    memset(optval[5].sa_data, 0, 28);
    memset(optval[0].sa_data, 0, 80);
    v13 = strlen(a2);
    if ( v13 != 0 )
    {
      if ( v13 < 0x6C )
      {
        v18 = v13;
        __memcpy_chk(optval[0].sa_data, a2, v13 + 1, 108);
        optval[0].sa_data[0] = 0;
        if ( connect(v12, optval, v18 + 2) != 0 )
          return 0xFFFFFFFFLL;
        goto LABEL_17;
      }
      v17 = 36;
    }
    else
    {
      v17 = 22;
    }
    *(_DWORD *)__errno(v13, v14, v15, v16) = v17;
    return 0xFFFFFFFFLL;
  }
  if ( (unsigned int)a3 >= 0x10000 )
  {
    *(_DWORD *)__errno(v6, v7, v8, v9) = 22;
    return 0xFFFFFFFFLL;
  }
  v12 = socket(2, 1, 0);
  *(_DWORD *)&optval[0].sa_family = 1;
  setsockopt(v12, 6, 1, optval, 4u);
  if ( v12 == -1 )
    return 0xFFFFFFFFLL;
  *(_QWORD *)&optval[0].sa_family = 2;
  *(_QWORD *)&optval[0].sa_data[6] = 0;
  inet_pton(2, a2, &optval[0].sa_data[2]);
  *(_WORD *)optval[0].sa_data = bswap32(a3) >> 16;
  if ( connect(v12, optval, 0x10u) != 0 )
    return 0xFFFFFFFFLL;
LABEL_17:
  if ( v10 == 0 && daemon(1, 0) < 0 )
    return 0xFFFFFFFFLL;
  v19 = malloc(0x83008u);
  if ( v19 == nullptr )
    return 0xFFFFFFFFLL;
  v20 = v19;
  optval[0].sa_family = 0;
  sub_6A28(v12, (int)optval, "MTIO", 4u);
  sub_6FF0(v12);
  geteuid();
  sub_6FF0(v12);
  fsync(v12);
  v21 = v20 + 133121;
  memset(v20 + 133121, 255, 0x1000u);
  v20[134145] = 0;
  memset(&v25, 0, sizeof(v25));
  __FD_SET_chk(v12, &v25, 128);
  do
  {
    v24 = v25;
    if ( select(v12 + 1, &v24, nullptr, nullptr, nullptr) == -1 )
      break;
    ioctl(v12, 0x541Bu, optval);
    __umask_chk(0);
    if ( *(_DWORD *)&optval[0].sa_family == 0 )
      break;
  }
  while ( (unsigned int)sub_469C(v12, v20) == 0 );
  close(v12);
  for ( i = 0; i != 1024; ++i )
  {
    v23 = v21[i];
    if ( v23 != -1 )
    {
      close(v23);
      v21[i] = -1;
      --v20[134145];
    }
  }
  free(v20);
  return 0;
}


// Address: 0x469C | Function: sub_469C
__int64 __fastcall sub_469C(__int64 a1, _BYTE *a2)
{
  unsigned int v3; // w19
  int v4; // w21
  __int64 result; // x0
  int v6; // w0
  unsigned int v7; // w1
  char v8; // w22
  int v9; // w0
  __int64 v10; // x0
  __int64 v11; // x1
  __int64 v12; // x2
  __int64 v13; // x3
  int *v14; // x0
  char *v15; // x3
  const char *v16; // x1
  int v17; // w0
  int v18; // w0
  int v19; // w0
  char v20; // w0
  __int64 v21; // x0
  __int64 v22; // x1
  __int64 v23; // x2
  __int64 v24; // x3
  int *v25; // x0
  char *v26; // x21
  int v27; // w0
  char v28; // w0
  char v29; // w22
  DIR *v30; // x0
  DIR *v31; // x21
  __int64 v32; // x0
  __int64 v33; // x1
  __int64 v34; // x2
  __int64 v35; // x3
  unsigned int v36; // w23
  struct dirent *v37; // x0
  int v38; // w8
  int v39; // w9
  bool v40; // zf
  _BOOL4 v41; // w8
  int v42; // w0
  int v43; // w0
  int v44; // w21
  int v45; // w22
  int v46; // w0
  char v47; // w0
  char v48; // w22
  __int64 v49; // x0
  __int64 v50; // x1
  __int64 v51; // x2
  __int64 v52; // x3
  unsigned int v53; // w23
  DIR *v54; // x0
  __int64 v55; // x1
  __int64 v56; // x2
  __int64 v57; // x3
  DIR *v58; // x21
  __int64 v59; // x0
  __int64 v60; // x1
  __int64 v61; // x2
  __int64 v62; // x3
  unsigned __int16 v63; // w0
  __int64 v64; // x9
  int v65; // w0
  __int64 v66; // x0
  __int64 v67; // x1
  __int64 v68; // x2
  __int64 v69; // x3
  int *v70; // x0
  char *v71; // x2
  int v72; // w0
  __int64 v73; // x0
  __int64 v74; // x1
  __int64 v75; // x2
  __int64 v76; // x3
  int *v77; // x0
  unsigned __int16 v78; // w21
  __int64 v79; // x0
  __off_t v80; // x1
  int v81; // w0
  int v82; // w0
  int v83; // w0
  int v84; // w0
  __int64 v85; // x0
  __int64 v86; // x1
  __int64 v87; // x2
  __int64 v88; // x3
  __int64 v89; // x0
  __int64 v90; // x0
  __int64 v91; // x1
  __int64 v92; // x2
  __int64 v93; // x3
  int *v94; // x0
  char *v95; // x4
  unsigned __int16 v96; // w22
  __int64 v97; // x0
  __off_t v98; // x21
  _BYTE *v99; // x23
  int v100; // w0
  __off_t v101; // x0
  __off_t v102; // x20
  __int64 v103; // x0
  __int64 v104; // x1
  __int64 v105; // x2
  __int64 v106; // x3
  int *v107; // x0
  char *v108; // x2
  int v109; // w0
  unsigned __int16 v110; // w21
  char v111; // w22
  char v112; // w0
  __int64 v113; // x0
  __int64 v114; // x1
  __int64 v115; // x2
  __int64 v116; // x3
  int *v117; // x0
  int v118; // w0
  DIR *v119; // x0
  int v120; // w0
  __int64 v121; // x0
  __int64 v122; // x1
  __int64 v123; // x2
  __int64 v124; // x3
  int *v125; // x0
  int v126; // w0
  unsigned int v127; // w1
  int v128; // w8
  char v129; // w21
  unsigned __int16 v130; // w0
  int v131; // w0
  unsigned __int16 v132; // w21
  unsigned int v133; // w0
  __int64 v134; // x2
  __int64 v135; // x0
  __int64 chk; // x0
  size_t v137; // x21
  int v138; // w0
  __int64 v139; // x0
  __int64 v140; // x10
  __int64 v141; // x0
  __int64 v142; // x1
  __int64 v143; // x2
  __int64 v144; // x3
  int *v145; // x0
  int v146; // w0
  char v147; // w0
  char v148; // w21
  DIR *v149; // x0
  DIR *v150; // x22
  struct dirent *v151; // x0
  int v152; // w8
  char *d_name; // x20
  int v154; // w9
  bool v155; // zf
  _BOOL4 v156; // w8
  size_t v157; // x0
  int v158; // w0
  unsigned __int16 v159; // w23
  int v160; // w0
  int v161; // w21
  int v162; // w8
  bool v163; // zf
  _BOOL4 v164; // w8
  unsigned __int16 v165; // w0
  int v166; // w0
  __int64 v167; // x0
  __int64 v168; // x1
  __int64 v169; // x2
  __int64 v170; // x3
  int *v171; // x0
  char *v172; // x2
  int v173; // w0
  unsigned __int16 v174; // w0
  int v175; // w0
  int v176; // w0
  int v177; // w0
  int v178; // w0
  int v179; // w0
  unsigned int v180; // w21
  unsigned int v181; // w22
  char v182; // w23
  char v183; // w0
  __int64 v184; // x0
  __int64 v185; // x1
  __int64 v186; // x2
  __int64 v187; // x3
  int *v188; // x0
  int v189; // w0
  int v190; // w0
  int v191; // w0
  struct dirent *v192; // x0
  char *v193; // x20
  int v194; // w8
  size_t v195; // x0
  size_t v196; // x22
  size_t v197; // x8
  char *v198; // x9
  unsigned int v199; // w10
  int v200; // w13
  int v201; // w12
  __int64 v202; // x14
  unsigned int v203; // w10
  unsigned int v204; // w9
  int v205; // w24
  unsigned __int16 v206; // w0
  unsigned __int16 v207; // w23
  void *v208; // x0
  __int64 v209; // x26
  char v210; // w21
  __int64 v211; // x0
  __int64 v212; // x1
  __int64 v213; // x2
  __int64 v214; // x3
  size_t v215; // x0
  char v216; // w22
  int v217; // w0
  int v218; // w21
  int v219; // w0
  int v220; // w21
  int v221; // w22
  const char *v222; // x21
  DIR *v223; // x0
  __int64 v224; // x0
  __int64 v225; // x1
  __int64 v226; // x2
  __int64 v227; // x3
  int *v228; // x0
  __int64 v229; // x0
  __int64 v230; // x1
  __int64 v231; // x2
  __int64 v232; // x3
  int *v233; // x0
  char *v234; // x2
  __int64 v235; // x0
  __int64 v236; // x1
  __int64 v237; // x2
  __int64 v238; // x3
  int *v239; // x0
  int v240; // w25
  int v241; // w22
  __int64 v242; // x28
  int *v243; // x0
  bool v244; // vf
  __int64 v245; // x23
  __int64 v246; // x0
  __int64 v247; // x1
  __int64 v248; // x2
  __int64 v249; // x3
  int v250; // w22
  int v251; // w24
  ssize_t v252; // x0
  __int64 v253; // x1
  __int64 v254; // x2
  __int64 v255; // x3
  __int64 v256; // x0
  __int64 v257; // x1
  __int64 v258; // x2
  __int64 v259; // x3
  int *v260; // x0
  __int64 v261; // x0
  __int64 v262; // x1
  __int64 v263; // x2
  __int64 v264; // x3
  int *v265; // x0
  __int64 v266; // x0
  __int64 v267; // x1
  __int64 v268; // x2
  __int64 v269; // x3
  int *v270; // x0
  char *v271; // x4
  char v272; // w0
  char v273; // w22
  __int64 v274; // x0
  __int64 v275; // x1
  __int64 v276; // x2
  __int64 v277; // x3
  int v278; // w21
  int v279; // w0
  bool v280; // w24
  int *v281; // x0
  char *v282; // x0
  char *v283; // x20
  __int64 v284; // x0
  __int64 v285; // x1
  __int64 v286; // x2
  __int64 v287; // x3
  int *v288; // x0
  void *v289; // x0
  int *v290; // x21
  int v291; // w22
  __int64 v292; // x0
  __int64 v293; // x1
  __int64 v294; // x2
  __int64 v295; // x3
  int *v296; // x0
  char *v297; // x2
  __int64 v298; // x0
  __int64 v299; // x1
  __int64 v300; // x2
  __int64 v301; // x3
  char v302; // w8
  __int64 v303; // x0
  __int64 v304; // x1
  __int64 v305; // x2
  __int64 v306; // x3
  char v307; // w8
  __int64 v308; // x21
  _BYTE *v309; // x8
  __int64 v310; // x0
  __int64 v311; // x1
  __int64 v312; // x2
  __int64 v313; // x3
  int *v314; // x0
  int v315; // w23
  int *v316; // x22
  int v317; // w23
  int v318; // w0
  int *v319; // x21
  int v320; // w22
  __int64 v321; // x0
  __int64 v322; // x1
  __int64 v323; // x2
  __int64 v324; // x3
  int *v325; // x0
  char *v326; // x0
  __int64 v327; // x0
  __int64 v328; // x1
  __int64 v329; // x2
  __int64 v330; // x3
  int *v331; // x0
  char *v332; // x2
  int *v333; // x21
  char *v334; // x3
  int *v335; // x24
  struct dirent *v336; // x0
  int v337; // w8
  char *v338; // x25
  int v339; // w9
  bool v341; // w8
  void *v342; // x21
  int *v343; // x20
  char *v344; // x0
  int *v345; // x23
  __int64 v346; // x0
  __int64 v347; // x1
  __int64 v348; // x2
  __int64 v349; // x3
  int *v350; // x0
  char *v351; // x0
  int v352; // w0
  int v353; // w23
  ssize_t v354; // x0
  __int64 v355; // x1
  __int64 v356; // x2
  __int64 v357; // x3
  signed __int64 v358; // x26
  unsigned __int64 v359; // x24
  int v360; // w25
  int v361; // w25
  int *v362; // x0
  int v363; // w26
  __int64 v364; // x0
  __int64 v365; // x1
  __int64 v366; // x2
  __int64 v367; // x3
  int *v368; // x0
  char *v369; // x0
  int v370; // w0
  int v371; // w1
  int v372; // w2
  int v373; // w6
  int v374; // w7
  char v375; // w8
  int v376; // w0
  int v377; // w1
  int v378; // w2
  int v379; // w7
  char v380; // [xsp+0h] [xbp-1190h]
  char *v381; // [xsp+0h] [xbp-1190h]
  int v382; // [xsp+Ch] [xbp-1184h]
  bool v383; // [xsp+Ch] [xbp-1184h]
  bool v384; // [xsp+Ch] [xbp-1184h]
  void *v385; // [xsp+10h] [xbp-1180h]
  char *v386; // [xsp+10h] [xbp-1180h]
  const char *v387; // [xsp+10h] [xbp-1180h]
  _WORD v388[2]; // [xsp+1Ch] [xbp-1174h] BYREF
  char v389[40]; // [xsp+20h] [xbp-1170h] BYREF
  char s[16]; // [xsp+48h] [xbp-1148h] BYREF
  __int128 v391; // [xsp+58h] [xbp-1138h]
  _QWORD v392[540]; // [xsp+90h] [xbp-1100h]
  __int64 v393; // [xsp+1178h] [xbp-18h]

  v3 = a1;
  v393 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v388[0] = 0;
  v4 = (unsigned __int8)sub_7590(a1, v388);
  result = 1;
  switch ( v4 )
  {
    case 10:
      v6 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v6 == 2 )
        goto LABEL_355;
      if ( v6 == 1 )
        goto LABEL_195;
      v7 = (unsigned __int8)sub_7590(v3, v388);
      if ( v7 <= 1 )
      {
        if ( v7 != 0 )
        {
          v8 = 0;
          v7 = 577;
        }
        else
        {
          v8 = 1;
        }
      }
      else
      {
        switch ( v7 )
        {
          case 2u:
            v8 = 0;
            v7 = 1089;
            break;
          case 3u:
            v8 = 0;
            v7 = 66;
            break;
          case 4u:
            v8 = 0;
            v7 = 578;
            break;
          default:
            if ( (v388[0] & 1) != 0 )
              goto LABEL_355;
            goto LABEL_338;
        }
      }
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v298 = open(a2 + 0x80000, v7, 511);
      v302 = v8 ^ 1;
      v278 = v298;
      if ( (_DWORD)v298 != -1 )
        v302 = 1;
      if ( (v302 & 1) == 0 )
      {
        if ( *(_DWORD *)__errno(v298, v299, v300, v301) != 6 )
          goto LABEL_336;
        v278 = __open_2("/dev/null", 0);
      }
      if ( v278 == -1 )
        goto LABEL_336;
      if ( (sub_67F8(v3) & 1) == 0 || (sub_694C(v3) & 1) == 0 )
        goto LABEL_408;
      goto LABEL_409;
    case 11:
      v126 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v126 == 2 )
        goto LABEL_355;
      if ( v126 == 1 )
        goto LABEL_195;
      v127 = (unsigned __int8)sub_7590(v3, v388);
      if ( v127 <= 1 )
      {
        v128 = 0;
        if ( v127 != 0 )
        {
          v129 = 0;
          v127 = 577;
        }
        else
        {
          v129 = 1;
        }
      }
      else
      {
        switch ( v127 )
        {
          case 2u:
            v128 = 0;
            v129 = 0;
            v127 = 1089;
            break;
          case 3u:
            v128 = 0;
            v129 = 0;
            v127 = 66;
            break;
          case 4u:
            v128 = 0;
            v129 = 0;
            v127 = 578;
            break;
          default:
            v129 = 0;
            v127 = -1;
            v128 = 1;
            break;
        }
      }
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( *((int *)a2 + 134145) >= 1024 )
      {
        sub_6E80(v3);
        dprintf(v3, "Opened file count out of limit");
        goto LABEL_352;
      }
      if ( v128 != 0 )
      {
LABEL_338:
        sub_6E80(v3);
        dprintf(v3, "Invalid mode");
        goto LABEL_352;
      }
      v303 = open(a2 + 0x80000, v127, 511);
      v307 = v129 ^ 1;
      if ( (_DWORD)v303 != -1 )
        v307 = 1;
      if ( (v307 & 1) == 0 )
      {
        if ( *(_DWORD *)__errno(v303, v304, v305, v306) != 6 )
          goto LABEL_336;
        LODWORD(v303) = __open_2("/dev/null", 0);
      }
      if ( (_DWORD)v303 == -1 )
      {
LABEL_336:
        v310 = sub_6E80(v3);
        v314 = (int *)__errno(v310, v311, v312, v313);
        v15 = strerror(*v314);
        v16 = "Unable to open file '%s': %s";
        goto LABEL_347;
      }
      v308 = 0;
      v309 = a2 + 532484;
      while ( *(_DWORD *)&v309[4 * v308] != -1 )
      {
        if ( ++v308 == 1024 )
        {
          sub_6E80(v3);
          dprintf(v3, "Unknown error");
          goto LABEL_352;
        }
      }
      *(_DWORD *)&v309[4 * v308] = v303;
      ++*((_DWORD *)a2 + 134145);
      sub_6E80(v3);
      sub_6F34(v3);
      goto LABEL_354;
    case 12:
      v132 = sub_6D54(v3, v388);
      v133 = sub_7654(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( (v133 & 0x80000000) != 0 )
      {
        sub_6E80(v3);
        dprintf(v3, "Invalid length");
        goto LABEL_352;
      }
      if ( v133 >= 0x80000 )
        v134 = 0x80000;
      else
        v134 = v133;
      if ( v132 > 0x3FFu )
        goto LABEL_293;
      v135 = *(unsigned int *)&a2[4 * v132 + 532484];
      if ( (_DWORD)v135 == -1 )
        goto LABEL_293;
      chk = __read_chk(v135, a2, v134, -1);
      if ( chk != -1 )
      {
        v137 = chk;
        sub_6E80(v3);
        sub_6FF0(v3);
        sub_6A28(v3, (int)v388, a2, v137);
        goto LABEL_354;
      }
      v327 = sub_6E80(v3);
      v331 = (int *)__errno(v327, v328, v329, v330);
      v332 = strerror(*v331);
      dprintf(v3, "Read failed: %s", v332);
      goto LABEL_352;
    case 13:
      v159 = sub_6D54(v3, v388);
      v160 = sub_7654(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v161 = v160;
      if ( v160 < 0 )
      {
        sub_6E80(v3);
        dprintf(v3, "Invalid length");
        goto LABEL_196;
      }
      if ( v159 > 0x3FFu )
      {
        if ( v160 == 0 )
          goto LABEL_293;
        v164 = false;
      }
      else
      {
        v162 = *(_DWORD *)&a2[4 * v159 + 532484];
        v163 = v162 == -1;
        v164 = v162 != -1;
        if ( v160 == 0 )
        {
          if ( !v163 )
            goto LABEL_352;
          goto LABEL_293;
        }
      }
      v383 = v164;
      v240 = !v164;
      v241 = 0;
      v242 = v159;
      v386 = nullptr;
      while ( 1 )
      {
        v245 = (unsigned int)v161 >= 0x80000 ? 0x80000LL : (unsigned int)v161;
        v246 = sub_6ABC(v3, v388, a2, v245);
        if ( (v246 & 1) == 0 )
          break;
        if ( ((v240 | v241) & 1) == 0 )
        {
          v250 = 0;
          v251 = v245;
          do
          {
            v252 = write(*(_DWORD *)&a2[4 * v242 + 532484], &a2[v250], (unsigned int)v251);
            if ( (_DWORD)v252 == -1 )
            {
              v243 = (int *)__errno(v252, v253, v254, v255);
              v386 = strerror(*v243);
              v241 = 1;
              goto LABEL_262;
            }
            v244 = __OFSUB__(v251, (_DWORD)v252);
            v251 -= v252;
            v250 += v252;
          }
          while ( !((v251 < 0) ^ v244 | (v251 == 0)) );
          v241 = 0;
        }
LABEL_262:
        v244 = __OFSUB__(v161, (_DWORD)v245);
        v161 -= v245;
        if ( (v161 < 0) ^ v244 | (v161 == 0) )
        {
          v283 = v386;
          if ( v383 )
          {
            if ( (v241 & 1) == 0 )
              goto LABEL_352;
            goto LABEL_292;
          }
          goto LABEL_293;
        }
      }
      v281 = (int *)__errno(v246, v247, v248, v249);
      v282 = strerror(*v281);
      if ( v383 )
      {
        v283 = v282;
LABEL_292:
        sub_6E80(v3);
        dprintf(v3, "Write failed: %s", v283);
        goto LABEL_352;
      }
LABEL_293:
      sub_6E80(v3);
      dprintf(v3, "Bad fd");
      goto LABEL_352;
    case 14:
      v165 = sub_6D54(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v165 > 0x3FFu )
        goto LABEL_293;
      v166 = *(_DWORD *)&a2[4 * v165 + 532484];
      if ( v166 == -1 )
        goto LABEL_293;
      if ( fsync(v166) != 0 )
      {
        v167 = sub_6E80(v3);
        v171 = (int *)__errno(v167, v168, v169, v170);
        v172 = strerror(*v171);
        dprintf(v3, "Call fsync failed: %s", v172);
      }
      goto LABEL_352;
    case 15:
      v63 = sub_6D54(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v63 >= 0x400u )
        goto LABEL_293;
      v64 = v63;
      v65 = *(_DWORD *)&a2[4 * v63 + 532484];
      if ( v65 != -1 )
      {
        *(_DWORD *)&a2[4 * v64 + 532484] = -1;
        --*((_DWORD *)a2 + 134145);
        if ( close(v65) != 0 )
        {
          v66 = sub_6E80(v3);
          v70 = (int *)__errno(v66, v67, v68, v69);
          v71 = strerror(*v70);
          dprintf(v3, "Call close failed: %s", v71);
        }
      }
      goto LABEL_352;
    case 16:
      v174 = sub_6D54(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v174 > 0x3FFu )
        goto LABEL_293;
      v175 = *(_DWORD *)&a2[4 * v174 + 532484];
      if ( v175 == -1 )
        goto LABEL_293;
      if ( lseek(v175, 0, 1) != -1 )
        goto LABEL_174;
      goto LABEL_256;
    case 17:
      v78 = sub_6D54(v3, v388);
      v79 = sub_771C(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v78 > 0x3FFu )
        goto LABEL_293;
      v80 = v79;
      v81 = *(_DWORD *)&a2[4 * v78 + 532484];
      if ( v81 == -1 )
        goto LABEL_293;
      if ( lseek(v81, v80, 0) == -1 )
        goto LABEL_256;
      goto LABEL_352;
    case 18:
      v130 = sub_6D54(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v130 > 0x3FFu )
        goto LABEL_293;
      v131 = *(_DWORD *)&a2[4 * v130 + 532484];
      if ( v131 == -1 )
        goto LABEL_293;
      if ( fstat(v131, (struct stat *)s) != -1 )
        goto LABEL_174;
      v292 = sub_6E80(v3);
      v296 = (int *)__errno(v292, v293, v294, v295);
      v297 = strerror(*v296);
      dprintf(v3, "Call fstat failed: %s", v297);
      goto LABEL_352;
    case 19:
      v96 = sub_6D54(v3, v388);
      v97 = sub_771C(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( v96 > 0x3FFu )
        goto LABEL_293;
      v98 = v97;
      v99 = a2 + 532484;
      v100 = *(_DWORD *)&a2[4 * v96 + 532484];
      if ( v100 == -1 )
        goto LABEL_293;
      v101 = lseek(v100, 0, 1);
      if ( v101 == -1 )
      {
LABEL_256:
        v229 = sub_6E80(v3);
        v233 = (int *)__errno(v229, v230, v231, v232);
        v234 = strerror(*v233);
        dprintf(v3, "Call lseek failed: %s", v234);
      }
      else
      {
        v102 = v101;
        if ( ftruncate(*(_DWORD *)&v99[4 * v96], v98) != 0 )
        {
          v103 = sub_6E80(v3);
          v107 = (int *)__errno(v103, v104, v105, v106);
          v108 = strerror(*v107);
          dprintf(v3, "Call ftruncate failed: %s", v108);
        }
        else if ( v102 > v98 )
        {
          lseek(*(_DWORD *)&v99[4 * v96], 0, 2);
        }
      }
      goto LABEL_352;
    case 20:
      v27 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v27 == 2 )
        goto LABEL_355;
      if ( v27 == 1 )
        goto LABEL_195;
      v28 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v29 = v28;
      v30 = opendir(a2 + 0x80000);
      if ( v30 == nullptr )
        goto LABEL_253;
      v31 = v30;
      v32 = dirfd(v30);
      if ( (v32 & 0x80000000) != 0 )
      {
        v316 = (int *)__errno(v32, v33, v34, v35);
        v317 = *v316;
        closedir(v31);
        *v316 = v317;
        sub_6E80(v3);
        v318 = *v316;
        goto LABEL_346;
      }
      v36 = v32;
      sub_6E80(v3);
      v37 = readdir(v31);
      if ( v37 == nullptr )
        goto LABEL_252;
      while ( 2 )
      {
        v38 = (unsigned __int8)v37->d_name[0];
        v39 = v38 - 46;
        if ( v38 != 46 )
          goto LABEL_30;
        if ( v37->d_name[1] != 0 )
        {
          v39 = (unsigned __int8)v37->d_name[1] - 46;
          if ( v37->d_name[1] == 46 )
            v39 = (unsigned __int8)v37->d_name[2];
LABEL_30:
          v40 = v29 == 0 && v38 == 46;
          v41 = v40;
          if ( v39 != 0 && !v41 && (sub_77E4(v36, v37->d_name, s) & 1) != 0 )
          {
            sub_6E80(v3);
            sub_7160(v3, (int)v388, s);
            if ( HIBYTE(v388[0]) == 1 )
              goto LABEL_252;
          }
        }
        v37 = readdir(v31);
        if ( v37 == nullptr )
          goto LABEL_252;
        continue;
      }
    case 21:
      v146 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v146 == 2 )
        goto LABEL_355;
      if ( v146 == 1 )
        goto LABEL_195;
      v147 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v148 = v147;
      v149 = opendir(a2 + 0x80000);
      if ( v149 == nullptr )
      {
LABEL_253:
        v224 = sub_6E80(v3);
        v228 = (int *)__errno(v224, v225, v226, v227);
        v15 = strerror(*v228);
        v16 = "Unable to open directory '%s': %s";
        goto LABEL_347;
      }
      v150 = v149;
      sub_6E80(v3);
      v151 = readdir(v150);
      if ( v151 == nullptr )
        goto LABEL_286;
      while ( 2 )
      {
        d_name = v151->d_name;
        v152 = (unsigned __int8)v151->d_name[0];
        v154 = v152 - 46;
        if ( v152 != 46 )
          goto LABEL_137;
        if ( v151->d_name[1] != 0 )
        {
          v154 = (unsigned __int8)v151->d_name[1] - 46;
          if ( v151->d_name[1] == 46 )
            v154 = (unsigned __int8)v151->d_name[2];
LABEL_137:
          v155 = v148 == 0 && v152 == 46;
          v156 = v155;
          if ( v154 != 0 && !v156 )
          {
            sub_6E80(v3);
            v157 = strlen(d_name);
            sub_6A28(v3, (int)v388, d_name, v157 + 1);
            if ( HIBYTE(v388[0]) == 1 )
            {
LABEL_286:
              v223 = v150;
              goto LABEL_287;
            }
          }
        }
        v151 = readdir(v150);
        if ( v151 == nullptr )
          goto LABEL_286;
        continue;
      }
    case 22:
      v158 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v158 == 2 )
        goto LABEL_355;
      if ( v158 == 1 )
        goto LABEL_177;
      if ( (sub_79A8(0, a2 + 0x80000) & 1) != 0 )
      {
        sub_6E80(v3);
        sub_7160(v3, (int)v388, s);
        goto LABEL_354;
      }
      v235 = sub_6E80(v3);
      v239 = (int *)__errno(v235, v236, v237, v238);
      v15 = strerror(*v239);
      v16 = "Unable to read file info '%s': %s";
      goto LABEL_347;
    case 23:
      v177 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v177 == 2 )
        goto LABEL_355;
      if ( v177 == 1 )
        goto LABEL_195;
      v178 = sub_6B54(v3, v388, a2 + 528385, 4097, a2, 0x80000);
      if ( v178 == 2 )
        goto LABEL_355;
      if ( v178 == 1 )
        goto LABEL_182;
      if ( symlink(a2 + 0x80000, a2 + 528385) < 0 )
      {
        v266 = sub_6E80(v3);
        v270 = (int *)__errno(v266, v267, v268, v269);
        v271 = strerror(*v270);
        dprintf(v3, "Unable to create link '%s' to '%s': %s", a2 + 0x80000, a2 + 528385, v271);
      }
      goto LABEL_352;
    case 24:
      v176 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v176 == 2 )
        goto LABEL_355;
      if ( v176 == 1 )
        goto LABEL_177;
      if ( realpath(a2 + 0x80000, a2 + 528385) != nullptr )
      {
        sub_6E80(v3);
        v215 = strlen(a2 + 528385);
        sub_6A28(v3, (int)v388, a2 + 528385, v215 + 1);
        goto LABEL_354;
      }
      v261 = sub_6E80(v3);
      v265 = (int *)__errno(v261, v262, v263, v264);
      v15 = strerror(*v265);
      v16 = "Unable to read link '%s': %s";
      goto LABEL_347;
    case 25:
      v17 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v17 == 2 )
        goto LABEL_355;
      if ( v17 == 1 )
        goto LABEL_177;
      sub_6E80(v3);
      lstat(a2 + 0x80000, (struct stat *)s);
      v18 = v3;
      goto LABEL_353;
    case 26:
      v109 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v109 == 2 )
        goto LABEL_355;
      if ( v109 == 1 )
        goto LABEL_195;
      v110 = sub_6D54(v3, v388);
      v111 = sub_7590(v3, v388);
      v112 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( (sub_7F1C(a2 + 0x80000, v110, v111 != 0, v112 != 0) & 1) != 0 )
        goto LABEL_352;
      v113 = sub_6E80(v3);
      v117 = (int *)__errno(v113, v114, v115, v116);
      v15 = strerror(*v117);
      v16 = "Unable to chmod '%s': %s";
      goto LABEL_347;
    case 27:
      v179 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v179 == 2 )
        goto LABEL_355;
      if ( v179 == 1 )
        goto LABEL_195;
      v180 = sub_7654(v3, v388);
      v181 = sub_7654(v3, v388);
      v182 = sub_7590(v3, v388);
      v183 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      if ( (sub_8228(a2 + 0x80000, v180, v181, v182 != 0, v183 != 0) & 1) != 0 )
        goto LABEL_352;
      v184 = sub_6E80(v3);
      v188 = (int *)__errno(v184, v185, v186, v187);
      v15 = strerror(*v188);
      v16 = "Unable to chown '%s': %s";
      goto LABEL_347;
    case 28:
      v19 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v19 == 2 )
        goto LABEL_355;
      if ( v19 == 1 )
        goto LABEL_195;
      v20 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v21 = sub_8248(a2 + 0x80000, v20 != 0);
      if ( (v21 & 1) == 0 )
      {
        v25 = (int *)__errno(v21, v22, v23, v24);
        v26 = strerror(*v25);
        sub_6E80(v3);
        dprintf(v3, "Can't create directory '%s': %s", a2 + 0x80000, v26);
      }
      goto LABEL_352;
    case 29:
      v83 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v83 == 2 )
        goto LABEL_355;
      if ( v83 == 1 )
        goto LABEL_195;
      v84 = sub_6B54(v3, v388, a2 + 528385, 4097, a2, 0x80000);
      if ( v84 == 2 )
        goto LABEL_355;
      if ( v84 == 1 )
      {
LABEL_182:
        sub_6E80(v3);
        dprintf(v3, "Invalid target pathname");
      }
      else
      {
        v85 = stat(a2 + 528385, (struct stat *)s);
        if ( (_DWORD)v85 != 0 && *(_DWORD *)(v89 = __errno(v85, v86, v87, v88)) != 2 )
        {
          v333 = (int *)v89;
          sub_6E80(v3);
          v334 = strerror(*v333);
          dprintf(v3, "Failed on '%s': %s", a2 + 528385, v334);
        }
        else if ( rename(a2 + 0x80000, a2 + 528385) != 0 )
        {
          v90 = sub_6E80(v3);
          v94 = (int *)__errno(v90, v91, v92, v93);
          v95 = strerror(*v94);
          dprintf(v3, "Unable to move '%s' to '%s': %s", a2 + 0x80000, a2 + 528385, v95);
        }
      }
      goto LABEL_352;
    case 30:
      v72 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v72 == 2 )
        goto LABEL_355;
      if ( v72 == 1 )
        goto LABEL_177;
      if ( (sub_8674(a2 + 0x80000) & 1) != 0 )
        goto LABEL_352;
      v73 = sub_6E80(v3);
      v77 = (int *)__errno(v73, v74, v75, v76);
      v15 = strerror(*v77);
      v16 = "Unable to remove '%s': %s";
      goto LABEL_347;
    case 31:
      v138 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v138 == 2 )
        goto LABEL_355;
      if ( v138 == 1 )
        goto LABEL_195;
      v139 = sub_771C(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v140 = v139 % 1000 + 1000;
      if ( v139 % 1000 >= 0 )
        v140 = v139 % 1000;
      *(_QWORD *)s = v139 / 1000 + ((v139 % 1000) >> 63);
      *(_QWORD *)&s[8] = 1000000 * v140;
      v391 = *(_OWORD *)s;
      if ( utimensat(-100, a2 + 0x80000, (const struct timespec *)s, 0) == 0 )
        goto LABEL_352;
      v141 = sub_6E80(v3);
      v145 = (int *)__errno(v141, v142, v143, v144);
      v15 = strerror(*v145);
      v16 = "Unable to set time '%s': %s";
      goto LABEL_347;
    case 32:
      v42 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v42 == 2 )
        goto LABEL_355;
      if ( v42 == 1 )
        goto LABEL_177;
      v43 = __open_2(a2 + 0x80000, 2048);
      if ( v43 == -1 )
        goto LABEL_336;
      v44 = v43;
      v45 = ioctl(v43, 0x80086601, s);
      close(v44);
      if ( v45 != -1 )
      {
        sub_6E80(v3);
        sub_6FF0(v3);
        goto LABEL_354;
      }
      v284 = sub_6E80(v3);
      v288 = (int *)__errno(v284, v285, v286, v287);
      v15 = strerror(*v288);
      v16 = "Unable to get flags '%s': %s";
      goto LABEL_347;
    case 33:
      v191 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v191 == 2 )
        goto LABEL_355;
      if ( v191 == 1 )
        goto LABEL_195;
      v216 = sub_7590(v3, v388);
      v217 = sub_7654(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v218 = v217;
      v219 = __open_2(a2 + 0x80000, 2048);
      if ( v219 == -1 )
      {
        v222 = "Unable to open file '%s': %s";
        goto LABEL_384;
      }
      if ( v216 == 2 )
        goto LABEL_250;
      v315 = v219;
      if ( ioctl(v219, 0x80086601, s) == -1 )
      {
        close(v315);
        v222 = "Unable to get flags '%s': %s";
      }
      else
      {
        if ( v216 == 1 )
        {
          v219 = v315;
          v218 = *(_DWORD *)s & ~v218;
        }
        else
        {
          v219 = v315;
          if ( v216 == 0 )
            v218 |= *(_DWORD *)s;
        }
LABEL_250:
        *(_DWORD *)s = v218;
        v220 = v219;
        v221 = ioctl(v219, 0x40086602u, s);
        close(v220);
        if ( v221 != -1 )
          goto LABEL_352;
        v222 = "Unable to set flags '%s': %s";
      }
LABEL_384:
      v346 = sub_6E80(v3);
      v350 = (int *)__errno(v346, v347, v348, v349);
      v351 = strerror(*v350);
      dprintf(v3, v222, a2 + 0x80000, v351);
      goto LABEL_352;
    case 34:
      v189 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v189 == 2 )
        goto LABEL_355;
      if ( v189 == 1 )
        goto LABEL_195;
      v190 = sub_6B54(v3, v388, a2 + 528385, 4097, a2, 0x80000);
      if ( v190 == 2 )
        goto LABEL_355;
      if ( v190 == 1 )
      {
        sub_6E80(v3);
        dprintf(v3, "Invalid target pathname");
        goto LABEL_196;
      }
      v272 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v273 = v272;
      v274 = __open_2(a2 + 0x80000, 0);
      if ( (_DWORD)v274 == -1 )
      {
        v345 = (int *)__errno(v274, v275, v276, v277);
        if ( *v345 != 6 || (LODWORD(v274) = __open_2("/dev/null", 0), (_DWORD)v274 == -1) )
        {
          sub_6E80(v3);
          v15 = strerror(*v345);
          v16 = "Unable to open source file '%s': %s";
          goto LABEL_347;
        }
      }
      v278 = v274;
      if ( v273 != 0 )
      {
        v279 = fstat(v274, (struct stat *)s);
        v280 = v279 == 0;
        if ( v279 == 0 )
          qmemcpy(v389, v392, 32);
      }
      else
      {
        v280 = false;
      }
      v352 = open(a2 + 528385, 577, 511);
      if ( v352 == -1 )
      {
        v364 = sub_6E80(v3);
        v368 = (int *)__errno(v364, v365, v366, v367);
        v369 = strerror(*v368);
        dprintf(v3, "Unable to open target file '%s': %s", a2 + 528385, v369);
LABEL_408:
        sub_6E80(v3);
        fsync(v3);
LABEL_409:
        close(v278);
        goto LABEL_355;
      }
      v353 = v352;
      v354 = read(v278, a2, 0x80000u);
      v358 = v354;
      v384 = v280;
      if ( v354 < 1 )
      {
        v361 = 0;
        v359 = 0;
        if ( v354 != -1 )
          goto LABEL_415;
LABEL_404:
        v387 = "Read";
LABEL_406:
        v362 = (int *)__errno(v354, v355, v356, v357);
        v363 = 1;
        v381 = strerror(*v362);
        goto LABEL_416;
      }
      v359 = 0;
      v387 = "Write";
      do
      {
        v360 = 0;
        v359 += v358;
        do
        {
          v354 = write(v353, &a2[v360], v358);
          if ( (_DWORD)v354 == -1 )
          {
            v361 = 0;
            goto LABEL_406;
          }
          v358 -= (int)v354;
          v360 += v354;
        }
        while ( v358 > 0 );
        if ( v359 > 0x80000 )
        {
          sub_6E80(v3);
          sub_6FF0(v3);
          fsync(v3);
          if ( ioctl(v3, 0x541Bu, s) == 0 && *(int *)s >= 1 )
          {
            v354 = read(v3, a2, 1u);
            if ( v354 == 1 && *a2 == 118 )
            {
              v359 = 0;
              v361 = 1;
              if ( v358 != -1 )
                goto LABEL_415;
              goto LABEL_404;
            }
          }
          v359 = 0;
        }
        v354 = read(v278, a2, 0x80000u);
        v358 = v354;
      }
      while ( v354 > 0 );
      v361 = 0;
      if ( v354 == -1 )
        goto LABEL_404;
LABEL_415:
      v363 = 0;
      v381 = nullptr;
      v387 = "Write";
LABEL_416:
      close(v278);
      close(v353);
      if ( v361 != 0 )
      {
        unlink(a2 + 528385);
        v18 = v3;
        goto LABEL_353;
      }
      if ( v363 != 0 )
      {
        unlink(a2 + 528385);
        sub_6E80(v3);
        dprintf(v3, "%s failed: %s", v387, v381);
      }
      else
      {
        v375 = !v384;
        if ( v273 == 0 )
          v375 = 1;
        if ( (v375 & 1) == 0 )
          utimensat(-100, a2 + 528385, (const struct timespec *)v389, 0);
        if ( v359 != 0 )
        {
          sub_6E80(v3);
          sub_6FF0(v3);
        }
      }
LABEL_352:
      v18 = v3;
LABEL_353:
      sub_6E80(v18);
LABEL_354:
      fsync(v3);
LABEL_355:
      if ( (v388[0] & 1) != 0 )
        return 1;
      else
        return HIBYTE(v388[0]);
    case 35:
      return result;
    case 36:
      v82 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v82 == 2 )
        goto LABEL_355;
      if ( v82 == 1 )
      {
        sub_6E80(v3);
        dprintf(v3, "Invalid base path");
        goto LABEL_196;
      }
      v205 = strlen(a2 + 0x80000);
      v206 = sub_6D54(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v207 = v206;
      if ( v206 == 0 )
      {
        if ( (v388[0] & 1) != 0 || (v388[0] & 0x100) != 0 )
        {
          v289 = nullptr;
          goto LABEL_429;
        }
        sub_6E80(v3);
        v342 = nullptr;
        goto LABEL_428;
      }
      v208 = malloc(v206);
      if ( v208 == nullptr )
      {
        v321 = sub_6E80(v3);
        v325 = (int *)__errno(v321, v322, v323, v324);
        v326 = strerror(*v325);
        dprintf(v3, "Check batch exists failed: %s", v326);
        goto LABEL_196;
      }
      v209 = 0;
      v210 = 0;
      v385 = v208;
      v382 = 0;
      while ( 1 )
      {
        v211 = sub_6B54(v3, v388, a2 + 528385, 4097, a2, 0x80000);
        if ( (_DWORD)v211 == 1 )
          goto LABEL_237;
        if ( (_DWORD)v211 == 2 )
        {
LABEL_295:
          if ( (v388[0] & 1) != 0 )
          {
            v289 = v385;
            goto LABEL_429;
          }
          if ( (v210 & 1) == 0 || (v388[0] & 0x100) != 0 )
          {
            v289 = v385;
            if ( (v388[0] & 0x100) != 0 )
              goto LABEL_429;
            v342 = v385;
            sub_6E80(v3);
            if ( v207 != 0 )
              sub_6A28(v3, (int)v388, v385, v207);
          }
          else
          {
            v342 = v385;
            if ( v382 != 0 )
            {
              v343 = (int *)__errno(v211, v212, v213, v214);
              *v343 = v382;
              sub_6E80(v3);
              v344 = strerror(*v343);
              dprintf(v3, "Check batch exists failed: %s", v344);
            }
            else
            {
              sub_6E80(v3);
              dprintf(v3, "Invalid name");
            }
            sub_6E80(v3);
          }
LABEL_428:
          fsync(v3);
          v289 = v342;
LABEL_429:
          free(v289);
          goto LABEL_355;
        }
        if ( (v210 & 1) != 0 )
        {
LABEL_237:
          v210 = 1;
        }
        else
        {
          v211 = sub_6E20((int)a2 + 0x80000, 4097, v205, a2 + 528385);
          if ( (v211 & 1) != 0 )
          {
            v211 = lstat(a2 + 0x80000, (struct stat *)s);
            v210 = 0;
            a2[v205 + 0x80000] = 0;
            *((_BYTE *)v385 + v209) = (_DWORD)v211 == 0;
          }
          else
          {
            v210 = 1;
            v382 = 36;
          }
        }
        if ( v207 == ++v209 )
          goto LABEL_295;
      }
    case 37:
      v118 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v118 == 2 )
        goto LABEL_355;
      if ( v118 == 1 )
        goto LABEL_177;
      v119 = opendir(a2 + 0x80000);
      if ( v119 == nullptr )
        goto LABEL_253;
      v31 = v119;
      sub_6E80(v3);
      while ( 1 )
      {
LABEL_199:
        v192 = readdir(v31);
        if ( v192 == nullptr )
          goto LABEL_252;
        v193 = v192->d_name;
        v194 = (unsigned __int8)v192->d_name[0] - 46;
        if ( v192->d_name[0] != 46 )
          goto LABEL_201;
        if ( v192->d_name[1] != 0 )
        {
          v194 = (unsigned __int8)v192->d_name[1] - 46;
          if ( v192->d_name[1] == 46 )
            v194 = (unsigned __int8)v192->d_name[2];
LABEL_201:
          if ( v194 != 0 )
          {
            v195 = strlen(v192->d_name);
            if ( v195 != 0 )
            {
              v196 = v195;
              v197 = 0;
              while ( 1 )
              {
                v198 = &v193[v197];
                if ( (v193[v197] & 0x80000000) == 0 )
                {
                  if ( v197 >= v195 )
                    goto LABEL_198;
                  ++v197;
                  goto LABEL_206;
                }
                v199 = (unsigned __int8)v193[v197];
                if ( (v199 & 0xE0) == 0xC0 )
                {
                  if ( v199 < 0xC2 )
                    goto LABEL_198;
                  v200 = 0;
                  v201 = 0;
                  v202 = 2;
                }
                else if ( (v199 & 0xF0) == 0xE0 )
                {
                  v201 = 0;
                  v200 = 1;
                  v202 = 3;
                }
                else
                {
                  if ( v199 > 0xF4 || (v199 & 0xF8) != 0xF0 )
                  {
LABEL_198:
                    sub_6E80(v3);
                    sub_6A28(v3, (int)v388, v193, v196 + 1);
                    if ( HIBYTE(v388[0]) != 1 )
                      goto LABEL_199;
LABEL_252:
                    v223 = v31;
LABEL_287:
                    closedir(v223);
                    v18 = v3;
                    goto LABEL_353;
                  }
                  v200 = 0;
                  v201 = 1;
                  v202 = 4;
                }
                v197 += v202;
                if ( v197 > v195 || (v198[1] & 0xC0) != 0x80 )
                  goto LABEL_198;
                if ( (v199 & 0xE0) != 0xC0 )
                {
                  if ( (v198[2] & 0xC0) != 0x80 )
                    goto LABEL_198;
                  if ( (v200 & 1) != 0 )
                  {
LABEL_223:
                    v203 = (v199 & 0xF) << 12;
                    v204 = v203 & 0x1F03F | ((v198[1] & 0x3F) << 6);
                    if ( v204 < 0x800 || v203 >> 13 <= 6 && v204 >> 11 >= 0x1B )
                      goto LABEL_198;
                    goto LABEL_206;
                  }
                  if ( (v198[3] & 0xC0) != 0x80 )
                    goto LABEL_198;
                }
                if ( v200 != 0 )
                  goto LABEL_223;
                if ( v201 != 0 && ((((v198[1] & 0x30) << 12) & 0x3FFFF | ((v199 & 7) << 18)) - 0x10000) >> 20 != 0 )
                  goto LABEL_198;
LABEL_206:
                if ( v197 >= v195 )
                  goto LABEL_199;
              }
            }
          }
        }
      }
    case 38:
      v173 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v173 == 2 )
        goto LABEL_355;
      if ( v173 == 1 )
        goto LABEL_177;
      if ( (lstat(a2 + 0x80000, (struct stat *)s) & 0x80000000) == 0 )
      {
LABEL_174:
        sub_6E80(v3);
        sub_70A8(v3);
        goto LABEL_354;
      }
      v256 = sub_6E80(v3);
      v260 = (int *)__errno(v256, v257, v258, v259);
      v15 = strerror(*v260);
      v16 = "Unable to get file actual size '%s': %s";
      goto LABEL_347;
    case 39:
      goto LABEL_352;
    case 40:
      v120 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v120 == 2 )
        goto LABEL_355;
      if ( v120 == 1 )
        goto LABEL_177;
      if ( (sub_867C(a2 + 0x80000) & 1) != 0 )
        goto LABEL_352;
      v121 = sub_6E80(v3);
      v125 = (int *)__errno(v121, v122, v123, v124);
      v15 = strerror(*v125);
      v16 = "Unable to unlink file or link '%s': %s";
      goto LABEL_347;
    case 41:
      v9 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v9 == 2 )
        goto LABEL_355;
      if ( v9 == 1 )
      {
LABEL_177:
        sub_6E80(v3);
        dprintf(v3, "Invalid pathname");
        goto LABEL_352;
      }
      if ( (sub_8718(a2 + 0x80000) & 1) != 0 )
        goto LABEL_352;
      v10 = sub_6E80(v3);
      v14 = (int *)__errno(v10, v11, v12, v13);
      v15 = strerror(*v14);
      v16 = "Unable to remove empty directory '%s': %s";
      goto LABEL_347;
    case 42:
      v46 = sub_6B54(v3, v388, a2 + 0x80000, 4097, a2, 0x80000);
      if ( v46 == 2 )
        goto LABEL_355;
      if ( v46 == 1 )
      {
LABEL_195:
        sub_6E80(v3);
        dprintf(v3, "Invalid pathname");
LABEL_196:
        sub_6E80(v3);
        fsync(v3);
        return 1;
      }
      v47 = sub_7590(v3, v388);
      if ( (v388[0] & 1) != 0 )
        goto LABEL_355;
      v48 = v47;
      v49 = __open_2(a2 + 0x80000, 573440);
      if ( (v49 & 0x80000000) != 0 )
      {
        v290 = (int *)__errno(v49, v50, v51, v52);
        v291 = *v290;
        if ( lstat(a2 + 0x80000, (struct stat *)s) == 0 && (v391 & 0xF000) == 0xA000 )
        {
          sub_6E80(v3);
          dprintf(v3, "Refusing to enumerate symbolic-link directory '%s'", a2 + 0x80000);
          goto LABEL_352;
        }
        *v290 = v291;
        sub_6E80(v3);
        v15 = strerror(*v290);
        v16 = "Unable to securely open directory '%s': %s";
      }
      else
      {
        v53 = v49;
        v54 = fdopendir(v49);
        if ( v54 != nullptr )
        {
          v58 = v54;
          v59 = sub_6E80(v3);
          if ( (v388[0] & 0x100) != 0 )
          {
LABEL_55:
            closedir(v58);
            if ( (v388[0] & 0x100) != 0 )
              goto LABEL_355;
            sub_6E80(v3);
            dprintf(v3, "Unable to complete checked directory enumeration");
            goto LABEL_352;
          }
          v335 = (int *)__errno(v59, v60, v61, v62);
          while ( 1 )
          {
            *v335 = 0;
            v336 = readdir(v58);
            if ( v336 == nullptr )
            {
              if ( *v335 != 0 )
              {
                v370 = (unsigned int)strerror(*v335);
                sub_68B4(
                  (int)a2,
                  v371,
                  v372,
                  "Unable to enumerate directory '%s': %s",
                  (_DWORD)a2 + 0x80000,
                  v370,
                  v373,
                  v374,
                  v380);
                goto LABEL_431;
              }
LABEL_432:
              sub_6E80(v3);
              fsync(v3);
              closedir(v58);
              goto LABEL_355;
            }
            v338 = v336->d_name;
            v337 = (unsigned __int8)v336->d_name[0];
            v339 = v337 - 46;
            if ( v337 == 46 )
            {
              if ( v336->d_name[1] == 0 )
                goto LABEL_360;
              v339 = (unsigned __int8)v336->d_name[1] - 46;
              if ( v336->d_name[1] == 46 )
                v339 = (unsigned __int8)v336->d_name[2];
            }
            v341 = v48 == 0 && v337 == 46;
            if ( v339 != 0 && !v341 )
            {
              if ( (sub_77E4(v53, v338, s) & 1) == 0 )
              {
                v376 = (unsigned int)strerror(*v335);
                sub_68B4(
                  (int)a2,
                  v377,
                  v378,
                  "Unable to inspect directory entry '%s/%s': %s",
                  (_DWORD)a2 + 0x80000,
                  (int)v338,
                  v376,
                  v379,
                  v380);
LABEL_431:
                sub_6E80(v3);
                dprintf(v3, "%s", a2);
                goto LABEL_432;
              }
              sub_6E80(v3);
              sub_7160(v3, (int)v388, s);
            }
LABEL_360:
            if ( HIBYTE(v388[0]) == 1 )
              goto LABEL_55;
          }
        }
        v319 = (int *)__errno(0, v55, v56, v57);
        v320 = *v319;
        close(v53);
        *v319 = v320;
        sub_6E80(v3);
        v318 = *v319;
LABEL_346:
        v15 = strerror(v318);
        v16 = "Unable to inspect directory '%s': %s";
      }
LABEL_347:
      dprintf(v3, v16, a2 + 0x80000, v15);
      goto LABEL_352;
    case 118:
      goto LABEL_355;
    default:
      sub_6E80(v3);
      dprintf(v3, "Unknown cmd: %d", v4);
      goto LABEL_196;
  }
}


// Address: 0x67F8 | Function: sub_67F8
bool __fastcall sub_67F8(int a1)
{
  int sa_family; // w8
  socklen_t len; // [xsp+Ch] [xbp-94h] BYREF
  socklen_t optlen; // [xsp+10h] [xbp-90h] BYREF
  int optval; // [xsp+14h] [xbp-8Ch] BYREF
  struct sockaddr addr; // [xsp+18h] [xbp-88h] BYREF
  __int64 v8; // [xsp+98h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  optlen = 4;
  optval = 0;
  if ( getsockopt(a1, 1, 39, &optval, &optlen) != 0 )
  {
    len = 128;
    if ( getsockname(a1, &addr, &len) != 0 )
    {
      len = 128;
      if ( getpeername(a1, &addr, &len) != 0 )
        return false;
    }
    sa_family = addr.sa_family;
  }
  else
  {
    sa_family = optval;
  }
  return sa_family == 1;
}


// Address: 0x68B4 | Function: sub_68B4
__int64 sub_68B4(char *a1, __int64 a2, __int64 a3, char *format, ...)
{
  gcc_va_list arg; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, format);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(arg, va);
  return vsnprintf(a1, 0x80000u, format, arg);
}


// Address: 0x694C | Function: sub_694C
bool __fastcall sub_694C(int fd, __int64 a2, char a3, int a4)
{
  _BOOL4 v4; // w20
  ssize_t v6; // x0
  __int64 v7; // x1
  __int64 v8; // x2
  __int64 v9; // x3
  struct msghdr v11; // [xsp+0h] [xbp-70h] BYREF
  _QWORD v12[2]; // [xsp+38h] [xbp-38h] BYREF
  char v13; // [xsp+4Ch] [xbp-24h] BYREF
  _QWORD v14[2]; // [xsp+50h] [xbp-20h] BYREF
  int v15; // [xsp+60h] [xbp-10h]
  int v16; // [xsp+64h] [xbp-Ch]
  __int64 v17; // [xsp+68h] [xbp-8h]

  v17 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*(_BYTE *)(a2 + 1) & 1) != 0 )
  {
    return false;
  }
  else
  {
    *(_QWORD *)&v11.msg_flags = 0;
    v12[0] = &v13;
    v12[1] = 1;
    v13 = a3;
    *(_OWORD *)&v11.msg_name = 0u;
    v11.msg_iov = (struct iovec *)v12;
    v11.msg_iovlen = 1;
    v11.msg_control = v14;
    v11.msg_controllen = 24;
    v14[0] = 20;
    v14[1] = 0x100000001LL;
    v15 = a4;
    v16 = 0;
    do
    {
      v6 = sendmsg(fd, &v11, 0);
      v4 = v6 != 0xFFFFFFFFLL;
    }
    while ( (unsigned int)v6 == 0xFFFFFFFFLL && *(_DWORD *)__errno(v6, v7, v8, v9) == 4 );
  }
  return v4;
}


// Address: 0x6A28 | Function: sub_6A28
__int64 __fastcall sub_6A28(int fd, __int64 a2, char *buf, size_t n)
{
  size_t v5; // x19
  ssize_t v9; // x0
  __int64 v10; // x1
  __int64 v11; // x2
  __int64 v12; // x3

  if ( (*(_BYTE *)(a2 + 1) & 1) != 0 )
    return 0;
  v5 = n;
  if ( n == 0 )
    return 1;
  while ( 1 )
  {
    while ( 1 )
    {
      v9 = write(fd, buf, v5);
      if ( (v9 & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(v9, v10, v11, v12) != 4 )
        goto LABEL_11;
      if ( v5 == 0 )
        return 1;
    }
    if ( v9 == 0 )
      break;
    v5 -= v9;
    buf += v9;
    if ( v5 == 0 )
      return 1;
  }
LABEL_11:
  *(_BYTE *)(a2 + 1) = 1;
  return 0;
}


// Address: 0x6ABC | Function: sub_6ABC
__int64 __fastcall sub_6ABC(unsigned int a1, _BYTE *a2, __int64 a3, __int64 a4)
{
  __int64 v5; // x19
  __int64 chk; // x0
  __int64 v10; // x1
  __int64 v11; // x2
  __int64 v12; // x3

  if ( (*a2 & 1) != 0 )
    return 0;
  v5 = a4;
  if ( a4 == 0 )
    return 1;
  while ( 1 )
  {
    while ( 1 )
    {
      chk = __read_chk(a1, a3, v5, -1);
      if ( (chk & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(chk, v10, v11, v12) != 4 )
        goto LABEL_11;
      if ( v5 == 0 )
        return 1;
    }
    if ( chk == 0 )
      break;
    v5 -= chk;
    a3 += chk;
    if ( v5 == 0 )
      return 1;
  }
LABEL_11:
  *a2 = 1;
  return 0;
}


// Address: 0x6B54 | Function: sub_6B54
__int64 __fastcall sub_6B54(
        unsigned int a1,
        _BYTE *a2,
        _BYTE *a3,
        unsigned __int64 a4,
        __int64 a5,
        unsigned __int64 a6)
{
  __int64 result; // x0
  unsigned __int16 *v13; // x21
  __int64 v14; // x22
  __int64 chk; // x0
  __int64 v16; // x1
  __int64 v17; // x2
  __int64 v18; // x3
  unsigned __int64 v19; // x26
  unsigned __int64 v20; // x8
  __int64 v21; // x22
  __int64 v22; // x27
  __int64 v23; // x21
  __int64 v24; // x0
  __int64 v25; // x1
  __int64 v26; // x2
  __int64 v27; // x3
  unsigned __int64 v28; // x21
  _BYTE *v29; // x22
  __int64 v30; // x0
  __int64 v31; // x1
  __int64 v32; // x2
  __int64 v33; // x3
  unsigned __int16 v34; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v35; // [xsp+8h] [xbp-8h]

  v35 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*a2 & 1) == 0 )
  {
    v13 = &v34;
    v14 = 2;
    do
    {
      while ( 1 )
      {
        chk = __read_chk(a1, v13, v14, -1);
        if ( (chk & 0x8000000000000000LL) == 0 )
          break;
        if ( *(_DWORD *)__errno(chk, v16, v17, v18) != 4 )
          goto LABEL_36;
      }
      if ( chk == 0 )
        goto LABEL_36;
      v14 -= chk;
      v13 = (unsigned __int16 *)((char *)v13 + chk);
    }
    while ( v14 != 0 );
    if ( (*a2 & 1) != 0 )
      return 2;
    v19 = __rev16(v34);
    if ( (_DWORD)v19 == 0 )
      return 1;
    if ( a4 >= v19 )
    {
      v28 = v19;
      v29 = a3;
      while ( 1 )
      {
        while ( 1 )
        {
          v30 = __read_chk(a1, v29, v28, -1);
          if ( (v30 & 0x8000000000000000LL) == 0 )
            break;
          if ( *(_DWORD *)__errno(v30, v31, v32, v33) != 4 )
            goto LABEL_36;
        }
        if ( v30 == 0 )
          break;
        v28 -= v30;
        v29 += v30;
        if ( v28 == 0 )
          return a3[v19 - 1] != 0 || (_DWORD)v19 != 1 && memchr(a3, 0, v19 - 1) != nullptr;
      }
    }
    else if ( a5 != 0 )
    {
      v20 = a6;
      if ( a6 != 0 )
      {
        v21 = a5;
        while ( 1 )
        {
          v22 = v19 >= v20 ? v20 : v19;
          if ( (*a2 & 1) != 0 )
            return 2;
          v23 = v22;
          do
          {
            while ( 1 )
            {
              v24 = __read_chk(a1, v21, v23, -1);
              if ( (v24 & 0x8000000000000000LL) == 0 )
                break;
              if ( *(_DWORD *)__errno(v24, v25, v26, v27) != 4 )
                goto LABEL_36;
              if ( v23 == 0 )
                goto LABEL_27;
            }
            if ( v24 == 0 )
              goto LABEL_36;
            v23 -= v24;
            v21 += v24;
          }
          while ( v23 != 0 );
LABEL_27:
          v19 -= v22;
          result = 1;
          v20 = a6;
          v21 = a5;
          if ( v19 == 0 )
            return result;
        }
      }
    }
LABEL_36:
    *a2 = 1;
    return 2;
  }
  if ( *a2 != 0 )
    return 2;
  else
    return 1;
}


// Address: 0x6D54 | Function: sub_6D54
__int64 __fastcall sub_6D54(unsigned int a1, _BYTE *a2)
{
  unsigned __int16 *v5; // x21
  __int64 v6; // x22
  __int64 chk; // x0
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  unsigned __int16 v11; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*a2 & 1) != 0 )
    return 0;
  v5 = &v11;
  v6 = 2;
  while ( 1 )
  {
    while ( 1 )
    {
      chk = __read_chk(a1, v5, v6, -1);
      if ( (chk & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(chk, v8, v9, v10) != 4 )
        goto LABEL_9;
    }
    if ( chk == 0 )
      break;
    v6 -= chk;
    v5 = (unsigned __int16 *)((char *)v5 + chk);
    if ( v6 == 0 )
      return bswap32(v11) >> 16;
  }
LABEL_9:
  *a2 = 1;
  return 0;
}


// Address: 0x6E20 | Function: sub_6E20
__int64 __fastcall sub_6E20(__int64 a1, unsigned __int64 a2, unsigned __int64 a3, char *s)
{
  size_t v4; // x22
  size_t v8; // x2

  v4 = a2 - a3;
  if ( a2 <= a3 )
    return 0;
  v8 = strlen(s) + 1;
  if ( v8 > v4 )
    return 0;
  memcpy((void *)(a1 + a3), s, v8);
  return 1;
}


// Address: 0x6E80 | Function: sub_6E80
ssize_t __fastcall sub_6E80(ssize_t fd, __int64 a2, char a3)
{
  char v3; // w8
  int v5; // w20
  char *p_buf; // x21
  size_t v7; // x22
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  char buf; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v3 = *(_BYTE *)(a2 + 1);
  buf = a3;
  if ( (v3 & 1) == 0 )
  {
    v5 = fd;
    p_buf = &buf;
    v7 = 1;
    while ( 1 )
    {
      while ( 1 )
      {
        fd = write(v5, p_buf, v7);
        if ( (fd & 0x8000000000000000LL) == 0 )
          break;
        fd = __errno(fd, v8, v9, v10);
        if ( *(_DWORD *)fd != 4 )
          goto LABEL_8;
      }
      if ( fd == 0 )
        break;
      v7 -= fd;
      p_buf += fd;
      if ( v7 == 0 )
        return fd;
    }
LABEL_8:
    *(_BYTE *)(a2 + 1) = 1;
  }
  return fd;
}


// Address: 0x6F34 | Function: sub_6F34
ssize_t __fastcall sub_6F34(ssize_t fd, __int64 a2, unsigned int a3)
{
  char v3; // w9
  int v5; // w20
  __int16 *p_buf; // x21
  size_t v7; // x22
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  __int16 buf; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v3 = *(_BYTE *)(a2 + 1);
  buf = bswap32(a3) >> 16;
  if ( (v3 & 1) == 0 )
  {
    v5 = fd;
    p_buf = &buf;
    v7 = 2;
    while ( 1 )
    {
      while ( 1 )
      {
        fd = write(v5, p_buf, v7);
        if ( (fd & 0x8000000000000000LL) == 0 )
          break;
        fd = __errno(fd, v8, v9, v10);
        if ( *(_DWORD *)fd != 4 )
          goto LABEL_8;
      }
      if ( fd == 0 )
        break;
      v7 -= fd;
      p_buf = (__int16 *)((char *)p_buf + fd);
      if ( v7 == 0 )
        return fd;
    }
LABEL_8:
    *(_BYTE *)(a2 + 1) = 1;
  }
  return fd;
}


// Address: 0x6FF0 | Function: sub_6FF0
ssize_t __fastcall sub_6FF0(ssize_t fd, __int64 a2, unsigned int a3)
{
  char v3; // w8
  int v5; // w20
  unsigned int *p_buf; // x21
  size_t v7; // x22
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  unsigned int buf; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v3 = *(_BYTE *)(a2 + 1);
  buf = bswap32(a3);
  if ( (v3 & 1) == 0 )
  {
    v5 = fd;
    p_buf = &buf;
    v7 = 4;
    while ( 1 )
    {
      while ( 1 )
      {
        fd = write(v5, p_buf, v7);
        if ( (fd & 0x8000000000000000LL) == 0 )
          break;
        fd = __errno(fd, v8, v9, v10);
        if ( *(_DWORD *)fd != 4 )
          goto LABEL_8;
      }
      if ( fd == 0 )
        break;
      v7 -= fd;
      p_buf = (unsigned int *)((char *)p_buf + fd);
      if ( v7 == 0 )
        return fd;
    }
LABEL_8:
    *(_BYTE *)(a2 + 1) = 1;
  }
  return fd;
}


// Address: 0x70A8 | Function: sub_70A8
ssize_t __fastcall sub_70A8(ssize_t fd, __int64 a2, unsigned __int64 a3)
{
  char v3; // w8
  int v5; // w20
  _QWORD *v6; // x21
  size_t v7; // x22
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  _QWORD v11[2]; // [xsp+0h] [xbp-10h] BYREF

  v11[1] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v3 = *(_BYTE *)(a2 + 1);
  v11[0] = bswap64(a3);
  if ( (v3 & 1) == 0 )
  {
    v5 = fd;
    v6 = v11;
    v7 = 8;
    while ( 1 )
    {
      while ( 1 )
      {
        fd = write(v5, v6, v7);
        if ( (fd & 0x8000000000000000LL) == 0 )
          break;
        fd = __errno(fd, v8, v9, v10);
        if ( *(_DWORD *)fd != 4 )
          goto LABEL_8;
      }
      if ( fd == 0 )
        break;
      v7 -= fd;
      v6 = (_QWORD *)((char *)v6 + fd);
      if ( v7 == 0 )
        return fd;
    }
LABEL_8:
    *(_BYTE *)(a2 + 1) = 1;
  }
  return fd;
}


// Address: 0x7160 | Function: sub_7160
__int64 __fastcall sub_7160(int a1, __int64 a2, char *s)
{
  __int64 result; // x0
  char v7; // w8
  size_t v8; // x22
  char *v9; // x23
  __int64 v10; // x1
  __int64 v11; // x2
  __int64 v12; // x3
  char v13; // w9
  _QWORD *v14; // x22
  size_t v15; // x23
  __int64 v16; // x1
  __int64 v17; // x2
  __int64 v18; // x3
  char v19; // w8
  char v20; // w8
  _QWORD *v21; // x22
  size_t v22; // x23
  __int64 v23; // x1
  __int64 v24; // x2
  __int64 v25; // x3
  char v26; // w8
  _QWORD *v27; // x22
  size_t v28; // x23
  __int64 v29; // x1
  __int64 v30; // x2
  __int64 v31; // x3
  char v32; // w8
  _QWORD *v33; // x22
  size_t v34; // x23
  __int64 v35; // x1
  __int64 v36; // x2
  __int64 v37; // x3
  char v38; // w8
  _QWORD *v39; // x22
  size_t v40; // x23
  __int64 v41; // x1
  __int64 v42; // x2
  __int64 v43; // x3
  _QWORD *v44; // x22
  size_t v45; // x23
  __int64 v46; // x1
  __int64 v47; // x2
  __int64 v48; // x3
  char *v49; // x22
  char v50; // w8
  size_t v51; // x23
  __int64 v52; // x1
  __int64 v53; // x2
  __int64 v54; // x3
  char v55; // w9
  _QWORD *v56; // x21
  size_t v57; // x22
  __int64 v58; // x1
  __int64 v59; // x2
  __int64 v60; // x3
  _QWORD v61[2]; // [xsp+0h] [xbp-10h] BYREF

  v61[1] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  result = strlen(s);
  v7 = *(_BYTE *)(a2 + 1);
  v8 = result + 1;
  if ( (v7 & 1) == 0 && result != -1 )
  {
    v9 = s;
    do
    {
      while ( 1 )
      {
        result = write(a1, v9, v8);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v10, v11, v12);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_18;
        if ( v8 == 0 )
          goto LABEL_9;
      }
      if ( result == 0 )
        goto LABEL_18;
      v8 -= result;
      v9 += result;
    }
    while ( v8 != 0 );
LABEL_9:
    v13 = *(_BYTE *)(a2 + 1);
    LOWORD(v61[0]) = bswap32(*((unsigned __int16 *)s + 128)) >> 16;
    if ( (v13 & 1) == 0 )
      goto LABEL_10;
LABEL_17:
    v19 = 1;
    goto LABEL_19;
  }
  LOWORD(v61[0]) = bswap32(*((unsigned __int16 *)s + 128)) >> 16;
  if ( (v7 & 1) != 0 )
    goto LABEL_17;
LABEL_10:
  v14 = v61;
  v15 = 2;
  while ( 1 )
  {
    while ( 1 )
    {
      result = write(a1, v14, v15);
      if ( (result & 0x8000000000000000LL) == 0 )
        break;
      result = __errno(result, v16, v17, v18);
      if ( *(_DWORD *)result != 4 )
        goto LABEL_18;
    }
    if ( result == 0 )
      break;
    v15 -= result;
    v14 = (_QWORD *)((char *)v14 + result);
    if ( v15 == 0 )
    {
      v19 = *(_BYTE *)(a2 + 1);
      goto LABEL_19;
    }
  }
LABEL_18:
  v19 = 1;
  *(_BYTE *)(a2 + 1) = 1;
LABEL_19:
  LODWORD(v61[0]) = bswap32(*((_DWORD *)s + 65));
  if ( (v19 & 1) != 0 )
  {
    v20 = 1;
  }
  else
  {
    v21 = v61;
    v22 = 4;
    while ( 1 )
    {
      while ( 1 )
      {
        result = write(a1, v21, v22);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v23, v24, v25);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_27;
      }
      if ( result == 0 )
        break;
      v22 -= result;
      v21 = (_QWORD *)((char *)v21 + result);
      if ( v22 == 0 )
      {
        v20 = *(_BYTE *)(a2 + 1);
        goto LABEL_28;
      }
    }
LABEL_27:
    v20 = 1;
    *(_BYTE *)(a2 + 1) = 1;
  }
LABEL_28:
  LODWORD(v61[0]) = bswap32(*((_DWORD *)s + 66));
  if ( (v20 & 1) != 0 )
  {
    v26 = 1;
  }
  else
  {
    v27 = v61;
    v28 = 4;
    while ( 1 )
    {
      while ( 1 )
      {
        result = write(a1, v27, v28);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v29, v30, v31);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_36;
      }
      if ( result == 0 )
        break;
      v28 -= result;
      v27 = (_QWORD *)((char *)v27 + result);
      if ( v28 == 0 )
      {
        v26 = *(_BYTE *)(a2 + 1);
        goto LABEL_37;
      }
    }
LABEL_36:
    v26 = 1;
    *(_BYTE *)(a2 + 1) = 1;
  }
LABEL_37:
  v61[0] = bswap64(*((_QWORD *)s + 34));
  if ( (v26 & 1) != 0 )
  {
    v32 = 1;
  }
  else
  {
    v33 = v61;
    v34 = 8;
    while ( 1 )
    {
      while ( 1 )
      {
        result = write(a1, v33, v34);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v35, v36, v37);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_45;
      }
      if ( result == 0 )
        break;
      v34 -= result;
      v33 = (_QWORD *)((char *)v33 + result);
      if ( v34 == 0 )
      {
        v32 = *(_BYTE *)(a2 + 1);
        goto LABEL_46;
      }
    }
LABEL_45:
    v32 = 1;
    *(_BYTE *)(a2 + 1) = 1;
  }
LABEL_46:
  v61[0] = bswap64(*((_QWORD *)s + 35));
  if ( (v32 & 1) != 0 )
  {
    v38 = 1;
  }
  else
  {
    v39 = v61;
    v40 = 8;
    while ( 1 )
    {
      while ( 1 )
      {
        result = write(a1, v39, v40);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v41, v42, v43);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_54;
      }
      if ( result == 0 )
        break;
      v40 -= result;
      v39 = (_QWORD *)((char *)v39 + result);
      if ( v40 == 0 )
      {
        v38 = *(_BYTE *)(a2 + 1);
        goto LABEL_55;
      }
    }
LABEL_54:
    v38 = 1;
    *(_BYTE *)(a2 + 1) = 1;
  }
LABEL_55:
  v61[0] = bswap64(*((_QWORD *)s + 36));
  if ( (v38 & 1) == 0 )
  {
    v44 = v61;
    v45 = 8;
    while ( 1 )
    {
      while ( 1 )
      {
        result = write(a1, v44, v45);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v46, v47, v48);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_62;
      }
      if ( result == 0 )
        break;
      v45 -= result;
      v44 = (_QWORD *)((char *)v44 + result);
      if ( v45 == 0 )
        goto LABEL_63;
    }
LABEL_62:
    *(_BYTE *)(a2 + 1) = 1;
  }
LABEL_63:
  if ( s[296] != 0 )
  {
    v49 = s + 296;
    result = strlen(s + 296);
    v50 = *(_BYTE *)(a2 + 1);
    v51 = result + 1;
    if ( (v50 & 1) != 0 || result == -1 )
    {
      LOWORD(v61[0]) = bswap32(*((unsigned __int16 *)s + 2197)) >> 16;
      if ( (v50 & 1) != 0 )
        return result;
      goto LABEL_74;
    }
    do
    {
      while ( 1 )
      {
        result = write(a1, v49, v51);
        if ( (result & 0x8000000000000000LL) == 0 )
          break;
        result = __errno(result, v52, v53, v54);
        if ( *(_DWORD *)result != 4 )
          goto LABEL_80;
        if ( v51 == 0 )
          goto LABEL_73;
      }
      if ( result == 0 )
        goto LABEL_80;
      v51 -= result;
      v49 += result;
    }
    while ( v51 != 0 );
LABEL_73:
    v55 = *(_BYTE *)(a2 + 1);
    LOWORD(v61[0]) = bswap32(*((unsigned __int16 *)s + 2197)) >> 16;
    if ( (v55 & 1) == 0 )
    {
LABEL_74:
      v56 = v61;
      v57 = 2;
      while ( 1 )
      {
        while ( 1 )
        {
          result = write(a1, v56, v57);
          if ( (result & 0x8000000000000000LL) == 0 )
            break;
          result = __errno(result, v58, v59, v60);
          if ( *(_DWORD *)result != 4 )
            goto LABEL_80;
        }
        if ( result == 0 )
          break;
        v57 -= result;
        v56 = (_QWORD *)((char *)v56 + result);
        if ( v57 == 0 )
          return result;
      }
LABEL_80:
      *(_BYTE *)(a2 + 1) = 1;
    }
  }
  return result;
}


// Address: 0x7590 | Function: sub_7590
__int64 __fastcall sub_7590(unsigned int a1, _BYTE *a2)
{
  unsigned __int8 *v5; // x21
  __int64 v6; // x22
  __int64 chk; // x0
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  unsigned __int8 v11; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*a2 & 1) != 0 )
    return 0;
  v5 = &v11;
  v6 = 1;
  while ( 1 )
  {
    while ( 1 )
    {
      chk = __read_chk(a1, v5, v6, -1);
      if ( (chk & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(chk, v8, v9, v10) != 4 )
        goto LABEL_9;
    }
    if ( chk == 0 )
      break;
    v6 -= chk;
    v5 += chk;
    if ( v6 == 0 )
      return v11;
  }
LABEL_9:
  *a2 = 1;
  return 0;
}


// Address: 0x7654 | Function: sub_7654
__int64 __fastcall sub_7654(unsigned int a1, _BYTE *a2)
{
  unsigned int *v5; // x21
  __int64 v6; // x22
  __int64 chk; // x0
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  unsigned int v11; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v12; // [xsp+8h] [xbp-8h]

  v12 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*a2 & 1) != 0 )
    return 0;
  v5 = &v11;
  v6 = 4;
  while ( 1 )
  {
    while ( 1 )
    {
      chk = __read_chk(a1, v5, v6, -1);
      if ( (chk & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(chk, v8, v9, v10) != 4 )
        goto LABEL_9;
    }
    if ( chk == 0 )
      break;
    v6 -= chk;
    v5 = (unsigned int *)((char *)v5 + chk);
    if ( v6 == 0 )
      return bswap32(v11);
  }
LABEL_9:
  *a2 = 1;
  return 0;
}


// Address: 0x771C | Function: sub_771C
unsigned __int64 __fastcall sub_771C(unsigned int a1, _BYTE *a2)
{
  unsigned __int64 *v5; // x21
  __int64 v6; // x22
  __int64 chk; // x0
  __int64 v8; // x1
  __int64 v9; // x2
  __int64 v10; // x3
  unsigned __int64 v11[2]; // [xsp+0h] [xbp-10h] BYREF

  v11[1] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (*a2 & 1) != 0 )
    return 0;
  v5 = v11;
  v6 = 8;
  while ( 1 )
  {
    while ( 1 )
    {
      chk = __read_chk(a1, v5, v6, -1);
      if ( (chk & 0x8000000000000000LL) == 0 )
        break;
      if ( *(_DWORD *)__errno(chk, v8, v9, v10) != 4 )
        goto LABEL_9;
    }
    if ( chk == 0 )
      break;
    v6 -= chk;
    v5 = (unsigned __int64 *)((char *)v5 + chk);
    if ( v6 == 0 )
      return bswap64(v11[0]);
  }
LABEL_9:
  *a2 = 1;
  return 0;
}


// Address: 0x77E4 | Function: sub_77E4
__int64 __fastcall sub_77E4(__int64 a1, const char *a2, __int64 a3, __int64 a4)
{
  int v6; // w21
  ssize_t v7; // x0
  __int16 v8; // w23
  char *v9; // x21
  int *v10; // x8
  int v11; // w9
  __int64 result; // x0
  __int64 v13; // x0
  __int64 v14; // x1
  __int64 v15; // x2
  __int64 v16; // x3
  __int64 v17; // x8
  __int16 v18; // w9
  __int64 v19; // x10
  __int64 v20; // x9
  _QWORD v21[16]; // [xsp+0h] [xbp-1110h] BYREF
  _BYTE v22[16]; // [xsp+80h] [xbp-1090h] BYREF
  int v23; // [xsp+90h] [xbp-1080h]
  __int64 v24; // [xsp+98h] [xbp-1078h]
  __int64 v25; // [xsp+A0h] [xbp-1070h]
  __int64 v26; // [xsp+B0h] [xbp-1060h]
  __int64 v27; // [xsp+D8h] [xbp-1038h]
  __int64 v28; // [xsp+E0h] [xbp-1030h]
  char buf[4097]; // [xsp+107h] [xbp-1009h] BYREF
  __int64 v30; // [xsp+1108h] [xbp-8h]

  v30 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( (a1 & 0x80000000) != 0 )
  {
    v10 = (int *)__errno(a1, a2, a3, a4);
    v11 = 9;
    goto LABEL_16;
  }
  v6 = a1;
  if ( fstatat(a1, a2, (struct stat *)v22, 256) < 0 )
    return 0;
  if ( (v23 & 0xF000) == 0xA000 )
  {
    v7 = readlinkat(v6, a2, buf, 0x1000u);
    if ( (v7 & 0x8000000000000000LL) == 0 )
    {
      buf[v7] = 0;
      v8 = 0;
      if ( fstatat(v6, a2, (struct stat *)v21, 0) == 0 )
      {
        v8 = v21[2];
        v26 = v21[6];
      }
      v9 = buf;
      goto LABEL_11;
    }
    return 0;
  }
  v9 = nullptr;
  v8 = 0;
LABEL_11:
  v13 = sub_7B98(a3, -1, 256, "%s", a2);
  if ( (unsigned int)v13 < 0x100 )
  {
    v17 = v28 / 1000000 + 1000 * v27;
    v18 = v23;
    *(_QWORD *)(a3 + 260) = v24;
    v19 = v25;
    *(_WORD *)(a3 + 256) = v18;
    v20 = v26;
    *(_QWORD *)(a3 + 288) = v19;
    *(_QWORD *)(a3 + 272) = v17;
    *(_QWORD *)(a3 + 280) = v20;
    if ( v9 == nullptr )
    {
      *(_BYTE *)(a3 + 296) = 0;
      *(_WORD *)(a3 + 4394) = 0;
      return 1;
    }
    v13 = sub_7B98(a3 + 296, -1, 4097, "%s", v9);
    if ( (unsigned int)v13 <= 0x1000 )
    {
      *(_WORD *)(a3 + 4394) = v8;
      return 1;
    }
  }
  v10 = (int *)__errno(v13, v14, v15, v16);
  v11 = 36;
LABEL_16:
  result = 0;
  *v10 = v11;
  return result;
}


// Address: 0x79A8 | Function: sub_79A8
__int64 __fastcall sub_79A8(const char *a1, char *file, __int64 a3)
{
  const char *v4; // x20
  __int64 v5; // x0
  __int64 v6; // x1
  __int64 v7; // x2
  __int64 v8; // x3
  char *v9; // x0
  const char *v10; // x21
  int v11; // w0
  __int16 v12; // w23
  char *v13; // x20
  __int64 result; // x0
  __int64 v15; // x8
  __int16 v16; // w9
  __int64 v17; // x10
  __int64 v18; // x9
  _DWORD *v19; // x8
  _QWORD v20[16]; // [xsp+0h] [xbp-2110h] BYREF
  _BYTE v21[16]; // [xsp+80h] [xbp-2090h] BYREF
  int v22; // [xsp+90h] [xbp-2080h]
  __int64 v23; // [xsp+98h] [xbp-2078h]
  __int64 v24; // [xsp+A0h] [xbp-2070h]
  __int64 v25; // [xsp+B0h] [xbp-2060h]
  __int64 v26; // [xsp+D8h] [xbp-2038h]
  __int64 v27; // [xsp+E0h] [xbp-2030h]
  char buf[4097]; // [xsp+106h] [xbp-200Ah] BYREF
  _BYTE v29[4105]; // [xsp+1107h] [xbp-1009h] BYREF

  v4 = file;
  *(_QWORD *)&v29[4097] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a1 != nullptr )
  {
    v5 = sub_7B98(v29, 4097, 4097, "%s/%s", a1, file);
    v4 = v29;
    if ( (unsigned int)v5 > 0x1000 )
      goto LABEL_18;
  }
  if ( (lstat(v4, (struct stat *)v21) & 0x80000000) == 0 )
  {
    v9 = strrchr(v4, 47);
    if ( v9 != nullptr )
      v10 = v9 + 1;
    else
      v10 = v4;
    if ( (v22 & 0xF000) != 0xA000 )
    {
      v13 = nullptr;
      v12 = 0;
      goto LABEL_14;
    }
    v11 = readlink(v4, buf, 0x1000u);
    if ( (v11 & 0x80000000) == 0 )
    {
      buf[v11 & 0x7FFFFFFF] = 0;
      v12 = 0;
      if ( stat(v4, (struct stat *)v20) == 0 )
      {
        v12 = v20[2];
        v25 = v20[6];
      }
      v13 = buf;
LABEL_14:
      v5 = sub_7B98(a3, -1, 256, "%s", v10);
      if ( (unsigned int)v5 < 0x100 )
      {
        v15 = v27 / 1000000 + 1000 * v26;
        v16 = v22;
        *(_QWORD *)(a3 + 260) = v23;
        v17 = v24;
        *(_WORD *)(a3 + 256) = v16;
        v18 = v25;
        *(_QWORD *)(a3 + 288) = v17;
        *(_QWORD *)(a3 + 272) = v15;
        *(_QWORD *)(a3 + 280) = v18;
        if ( v13 == nullptr )
        {
          *(_BYTE *)(a3 + 296) = 0;
          *(_WORD *)(a3 + 4394) = 0;
          return 1;
        }
        v5 = sub_7B98(a3 + 296, -1, 4097, "%s", v13);
        if ( (unsigned int)v5 <= 0x1000 )
        {
          *(_WORD *)(a3 + 4394) = v12;
          return 1;
        }
      }
LABEL_18:
      v19 = (_DWORD *)__errno(v5, v6, v7, v8);
      result = 0;
      *v19 = 36;
      return result;
    }
  }
  return 0;
}


// Address: 0x7B98 | Function: sub_7B98
__int64 sub_7B98(__int64 a1, __int64 a2, __int64 a3, const char *a4, ...)
{
  gcc_va_list va1; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(va1, va);
  return __vsnprintf_chk(a1, a3, 0, a2, a4, va1);
}


// Address: 0x7C3C | Function: sub_7C3C
__int64 __fastcall sub_7C3C(char a1, char *a2, const char *a3, __mode_t a4, int a5, int a6)
{
  __int64 result; // x0
  int v13; // w25
  __int64 v14; // x0
  __int64 v15; // x1
  __int64 v16; // x2
  __int64 v17; // x3
  DIR *v18; // x0
  __int64 v19; // x1
  __int64 v20; // x2
  __int64 v21; // x3
  DIR *v22; // x24
  int *v23; // x25
  struct dirent *v24; // x0
  int v25; // w8
  int v26; // w9
  int v27; // w21
  _BYTE v28[16]; // [xsp+0h] [xbp-1090h] BYREF
  int v29; // [xsp+10h] [xbp-1080h]
  char file[4097]; // [xsp+87h] [xbp-1009h] BYREF
  __int64 v31; // [xsp+1088h] [xbp-8h]

  v31 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( lstat(a3, (struct stat *)v28) != 0 )
    goto LABEL_2;
  v13 = v29 & 0xF000;
  if ( (a1 & 1) != 0 && v13 == 40960 )
  {
    if ( fchmodat(-100, a3, a4, 256) != 0 )
      goto LABEL_2;
    goto LABEL_21;
  }
  if ( (a5 & 1) == (a6 & 1) || (a1 & 1) != 0 )
  {
    if ( v13 == 40960 )
      return 1;
  }
  else if ( v13 == 0x4000 )
  {
    if ( (a5 & 1) == 0 )
    {
      if ( (a6 & 1) != 0 )
      {
LABEL_25:
        v18 = opendir(a3);
        if ( v18 == nullptr )
          goto LABEL_2;
        v22 = v18;
        v23 = (int *)__errno(v18, v19, v20, v21);
        *v23 = 0;
        while ( 1 )
        {
          while ( 1 )
          {
            v24 = readdir(v22);
            if ( v24 == nullptr )
            {
              v27 = *v23;
              if ( *v23 == 0 )
              {
                closedir(v22);
                return 1;
              }
LABEL_42:
              closedir(v22);
              *v23 = v27;
LABEL_2:
              if ( a2 != a3 )
                strcpy(a2, a3);
              return 0;
            }
            v25 = (unsigned __int8)v24->d_name[0] - 46;
            if ( v24->d_name[0] == 46 )
              break;
LABEL_29:
            if ( v25 != 0 )
            {
              if ( (unsigned int)sub_7E80(file) > 0x1000 )
              {
                v27 = 36;
                *v23 = 36;
                goto LABEL_42;
              }
              if ( (sub_7C3C(0, a2, file, a4, a5 & 1, a6 & 1) & 1) == 0 )
              {
                v27 = *v23;
                goto LABEL_42;
              }
              *v23 = 0;
            }
          }
          v26 = (unsigned __int8)v24->d_name[1] - 46;
          if ( v24->d_name[1] == 46 )
            v26 = (unsigned __int8)v24->d_name[2];
          if ( v26 != 0 )
          {
            v25 = (unsigned __int8)v24->d_name[1];
            goto LABEL_29;
          }
        }
      }
      return 1;
    }
  }
  else
  {
    result = 1;
    if ( v13 == 40960 || (a6 & 1) == 0 )
      return result;
  }
  if ( chmod(a3, a4) != 0 )
    goto LABEL_2;
LABEL_21:
  v14 = lstat(a3, (struct stat *)v28);
  if ( (_DWORD)v14 != 0 )
    goto LABEL_2;
  if ( (v29 & 0xFFF) != a4 )
  {
    *(_DWORD *)__errno(v14, v15, v16, v17) = 1;
    goto LABEL_2;
  }
  result = 1;
  if ( ((a5 | a6) & 1) != 0 && v13 == 0x4000 )
    goto LABEL_25;
  return result;
}


// Address: 0x7E80 | Function: sub_7E80
__int64 sub_7E80(char *a1, __int64 a2, __int64 a3, __int64 a4, ...)
{
  gcc_va_list arg; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(arg, va);
  return vsnprintf(a1, 0x1001u, "%s/%s", arg);
}


// Address: 0x7F1C | Function: sub_7F1C
__int64 __fastcall sub_7F1C(char *a1, __mode_t a2, int a3, int a4)
{
  return sub_7C3C(1, a1, a1, a2, a3, a4);
}


// Address: 0x7F38 | Function: sub_7F38
__int64 __fastcall sub_7F38(char a1, char *a2, const char *a3, __uid_t a4, __gid_t a5, int a6, int a7)
{
  __int64 result; // x0
  int v15; // w26
  __int64 v16; // x0
  __int64 v17; // x1
  __int64 v18; // x2
  __int64 v19; // x3
  DIR *v20; // x0
  __int64 v21; // x1
  __int64 v22; // x2
  __int64 v23; // x3
  DIR *v24; // x25
  int *v25; // x26
  struct dirent *v26; // x0
  int v27; // w8
  int v28; // w9
  int v29; // w21
  _DWORD v30[33]; // [xsp+0h] [xbp-1090h] BYREF
  char file[4097]; // [xsp+87h] [xbp-1009h] BYREF
  __int64 v32; // [xsp+1088h] [xbp-8h]

  v32 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( lstat(a3, (struct stat *)v30) != 0 )
    goto LABEL_2;
  v15 = v30[4] & 0xF000;
  if ( (a1 & 1) != 0 && v15 == 40960 )
  {
    if ( lchown(a3, a4, a5) != 0 )
      goto LABEL_2;
    goto LABEL_21;
  }
  if ( (a6 & 1) == (a7 & 1) || (a1 & 1) != 0 )
  {
    if ( v15 == 40960 )
      return 1;
  }
  else if ( v15 == 0x4000 )
  {
    if ( (a6 & 1) == 0 )
    {
      if ( (a7 & 1) != 0 )
      {
LABEL_26:
        v20 = opendir(a3);
        if ( v20 == nullptr )
          goto LABEL_2;
        v24 = v20;
        v25 = (int *)__errno(v20, v21, v22, v23);
        *v25 = 0;
        while ( 1 )
        {
          while ( 1 )
          {
            v26 = readdir(v24);
            if ( v26 == nullptr )
            {
              v29 = *v25;
              if ( *v25 == 0 )
              {
                closedir(v24);
                return 1;
              }
LABEL_43:
              closedir(v24);
              *v25 = v29;
LABEL_2:
              if ( a2 != a3 )
                strcpy(a2, a3);
              return 0;
            }
            v27 = (unsigned __int8)v26->d_name[0] - 46;
            if ( v26->d_name[0] == 46 )
              break;
LABEL_30:
            if ( v27 != 0 )
            {
              if ( (unsigned int)sub_818C(file) > 0x1000 )
              {
                v29 = 36;
                *v25 = 36;
                goto LABEL_43;
              }
              if ( (sub_7F38(0, a2, file, a4, a5, a6 & 1, a7 & 1) & 1) == 0 )
              {
                v29 = *v25;
                goto LABEL_43;
              }
              *v25 = 0;
            }
          }
          v28 = (unsigned __int8)v26->d_name[1] - 46;
          if ( v26->d_name[1] == 46 )
            v28 = (unsigned __int8)v26->d_name[2];
          if ( v28 != 0 )
          {
            v27 = (unsigned __int8)v26->d_name[1];
            goto LABEL_30;
          }
        }
      }
      return 1;
    }
  }
  else
  {
    result = 1;
    if ( v15 == 40960 || (a7 & 1) == 0 )
      return result;
  }
  if ( chown(a3, a4, a5) != 0 )
    goto LABEL_2;
LABEL_21:
  v16 = lstat(a3, (struct stat *)v30);
  if ( (_DWORD)v16 != 0 )
    goto LABEL_2;
  if ( v30[6] != a4 || v30[7] != a5 )
  {
    *(_DWORD *)__errno(v16, v17, v18, v19) = 1;
    goto LABEL_2;
  }
  result = 1;
  if ( ((a6 | a7) & 1) != 0 && v15 == 0x4000 )
    goto LABEL_26;
  return result;
}


// Address: 0x818C | Function: sub_818C
__int64 sub_818C(char *a1, __int64 a2, __int64 a3, __int64 a4, ...)
{
  gcc_va_list arg; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(arg, va);
  return vsnprintf(a1, 0x1001u, "%s/%s", arg);
}


// Address: 0x8228 | Function: sub_8228
__int64 __fastcall sub_8228(char *a1, __uid_t a2, __gid_t a3, int a4, int a5)
{
  return sub_7F38(1, a1, a1, a2, a3, a4, a5);
}


// Address: 0x8248 | Function: sub_8248
__int64 __fastcall sub_8248(__int64 a1, char a2)
{
  size_t v4; // x0
  __int64 v5; // x8
  __int64 v6; // x0
  __int64 v7; // x1
  __int64 v8; // x2
  __int64 v9; // x3
  __int64 v10; // x0
  __int64 v11; // x1
  __int64 v12; // x2
  __int64 v13; // x3
  _DWORD *v14; // x21
  char v15; // w0
  char *v16; // x20
  char v17; // w0
  _DWORD *v18; // x8
  _BYTE v20[16]; // [xsp+8h] [xbp-108h] BYREF
  int v21; // [xsp+18h] [xbp-F8h]
  _BYTE v22[16]; // [xsp+88h] [xbp-88h] BYREF
  int v23; // [xsp+98h] [xbp-78h]
  __int64 v24; // [xsp+108h] [xbp-8h]

  v24 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v4 = strlen((const char *)a1);
  if ( v4 >= 2 )
  {
    v5 = a1 - 1;
    do
    {
      if ( *(_BYTE *)(v5 + v4) != 47 )
        break;
      *(_BYTE *)(v5 + v4--) = 0;
    }
    while ( v4 > 1 );
  }
  if ( *(_BYTE *)a1 == 47 && *(_BYTE *)(a1 + 1) == 0 )
    goto LABEL_14;
  v6 = stat((const char *)a1, (struct stat *)v20);
  if ( (_DWORD)v6 == 0 )
  {
    if ( (v21 & 0xF000) != 0x4000 )
    {
      v18 = (_DWORD *)__errno(v6, v7, v8, v9);
      v15 = 0;
      *v18 = 17;
      return v15 & 1;
    }
    goto LABEL_14;
  }
  v10 = mkdir((const char *)a1, 0x1FFu);
  if ( (_DWORD)v10 == 0 )
  {
LABEL_14:
    v15 = 1;
    return v15 & 1;
  }
  v14 = (_DWORD *)__errno(v10, v11, v12, v13);
  if ( *v14 == 17 )
  {
    if ( stat((const char *)a1, (struct stat *)v22) == 0 )
    {
      if ( (v23 & 0xF000) != 0x4000 )
      {
        v15 = 0;
        *v14 = 17;
        return v15 & 1;
      }
      goto LABEL_14;
    }
LABEL_22:
    v15 = 0;
    return v15 & 1;
  }
  if ( (a2 & 1) == 0 )
    goto LABEL_22;
  v16 = strrchr((const char *)a1, 47);
  v15 = 0;
  if ( v16 != (char *)a1 && v16 != nullptr )
  {
    *v16 = 0;
    v17 = sub_8248(a1, 1);
    *v16 = 47;
    if ( (v17 & 1) != 0 )
    {
      if ( mkdir((const char *)a1, 0x1FFu) == 0 )
        goto LABEL_14;
      if ( *v14 == 17 )
      {
        v15 = sub_83E8(a1);
        return v15 & 1;
      }
    }
    goto LABEL_22;
  }
  return v15 & 1;
}


// Address: 0x83E8 | Function: sub_83E8
__int64 __fastcall sub_83E8(const char *a1)
{
  __int64 v1; // x0
  __int64 v2; // x1
  __int64 v3; // x2
  __int64 v4; // x3
  _BYTE v6[16]; // [xsp+8h] [xbp-88h] BYREF
  int v7; // [xsp+18h] [xbp-78h]
  __int64 v8; // [xsp+88h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v1 = stat(a1, (struct stat *)v6);
  if ( (_DWORD)v1 != 0 )
    return 0;
  if ( (v7 & 0xF000) == 0x4000 )
    return 1;
  *(_DWORD *)__errno(v1, v2, v3, v4) = 17;
  return 0;
}


// Address: 0x8468 | Function: sub_8468
__int64 __fastcall sub_8468(const char *a1, char *a2)
{
  DIR *v5; // x0
  DIR *v6; // x21
  struct dirent *v7; // x0
  int v8; // w8
  __int64 v9; // x0
  __int64 v10; // x1
  __int64 v11; // x2
  __int64 v12; // x3
  int v13; // w9
  __int64 v14; // x0
  __int64 v15; // x1
  __int64 v16; // x2
  __int64 v17; // x3
  int *v18; // x19
  int v19; // w20
  _WORD v20[67]; // [xsp+0h] [xbp-1090h] BYREF
  _BYTE v21[4097]; // [xsp+87h] [xbp-1009h] BYREF
  __int64 v22; // [xsp+1088h] [xbp-8h]

  v22 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( lstat(a1, (struct stat *)v20) == 0 )
  {
    if ( (v20[8] & 0xF000) != 0x4000 )
    {
      if ( unlink(a1) == 0 )
        return 1;
      goto LABEL_2;
    }
    v5 = opendir(a1);
    if ( v5 != nullptr )
    {
      v6 = v5;
      while ( 1 )
      {
        while ( 1 )
        {
          v7 = readdir(v6);
          if ( v7 == nullptr )
          {
            if ( (closedir(v6) & 0x80000000) == 0 && rmdir(a1) == 0 )
              return 1;
            goto LABEL_2;
          }
          v8 = (unsigned __int8)v7->d_name[0] - 46;
          if ( v7->d_name[0] == 46 )
            break;
LABEL_10:
          if ( v8 != 0 )
          {
            if ( (unsigned int)sub_85D8(v21) > 0x1000 )
            {
              v14 = closedir(v6);
              *(_DWORD *)__errno(v14, v15, v16, v17) = 36;
              goto LABEL_2;
            }
            v9 = sub_8468(v21, a2);
            if ( (v9 & 1) == 0 )
            {
              v18 = (int *)__errno(v9, v10, v11, v12);
              v19 = *v18;
              closedir(v6);
              *v18 = v19;
              return 0;
            }
          }
        }
        v13 = (unsigned __int8)v7->d_name[1] - 46;
        if ( v7->d_name[1] == 46 )
          v13 = (unsigned __int8)v7->d_name[2];
        if ( v13 != 0 )
        {
          v8 = (unsigned __int8)v7->d_name[1];
          goto LABEL_10;
        }
      }
    }
  }
LABEL_2:
  if ( a2 != a1 )
    strcpy(a2, a1);
  return 0;
}


// Address: 0x85D8 | Function: sub_85D8
__int64 sub_85D8(char *a1, __int64 a2, __int64 a3, __int64 a4, ...)
{
  gcc_va_list arg; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(arg, va);
  return vsnprintf(a1, 0x1001u, "%s/%s", arg);
}


// Address: 0x8674 | Function: sub_8674
__int64 __fastcall sub_8674(char *a1)
{
  return sub_8468(a1, a1);
}


// Address: 0x867C | Function: sub_867C
bool __fastcall sub_867C(const char *a1)
{
  __int64 v2; // x0
  __int64 v3; // x1
  __int64 v4; // x2
  __int64 v5; // x3
  int v7; // w8
  int v8; // w19
  _BYTE v9[16]; // [xsp+8h] [xbp-88h] BYREF
  int v10; // [xsp+18h] [xbp-78h]
  __int64 v11; // [xsp+88h] [xbp-8h]

  v11 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v2 = lstat(a1, (struct stat *)v9);
  if ( (_DWORD)v2 != 0 )
    return false;
  v7 = v10 & 0xF000;
  if ( (v7 | 0x2000) == 0xA000 )
    return unlink(a1) == 0;
  if ( v7 == 0x4000 )
    v8 = 21;
  else
    v8 = 22;
  *(_DWORD *)__errno(v2, v3, v4, v5) = v8;
  return false;
}


// Address: 0x8718 | Function: sub_8718
bool __fastcall sub_8718(const char *a1)
{
  __int64 v2; // x0
  __int64 v3; // x1
  __int64 v4; // x2
  __int64 v5; // x3
  _BYTE v7[16]; // [xsp+8h] [xbp-88h] BYREF
  int v8; // [xsp+18h] [xbp-78h]
  __int64 v9; // [xsp+88h] [xbp-8h]

  v9 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v2 = lstat(a1, (struct stat *)v7);
  if ( (_DWORD)v2 != 0 )
    return false;
  if ( (v8 & 0xF000) == 0x4000 )
    return rmdir(a1) == 0;
  *(_DWORD *)__errno(v2, v3, v4, v5) = 20;
  return false;
}


// Address: 0x87B0 | Function: sub_87B0
void sub_87B0()
{
  JUMPOUT(0);
}


// Address: 0x87D0 | Function: .__cxa_finalize
// attributes: thunk
int __cxa_finalize(void *a1)
{
  return _cxa_finalize(a1);
}


// Address: 0x87E0 | Function: .__cxa_atexit
// attributes: thunk
int __cxa_atexit(void (*lpfunc)(void *), void *obj, void *lpdso_handle)
{
  return _cxa_atexit(lpfunc, obj, lpdso_handle);
}


// Address: 0x87F0 | Function: .malloc
// attributes: thunk
void *malloc(size_t size)
{
  return malloc(size);
}


// Address: 0x8800 | Function: .__read_chk
// attributes: thunk
__int64 __fastcall __read_chk()
{
  return _read_chk();
}


// Address: 0x8810 | Function: .free
// attributes: thunk
void free(void *ptr)
{
  free(ptr);
}


// Address: 0x8820 | Function: .__errno
// attributes: thunk
__int64 __fastcall __errno()
{
  return _errno();
}


// Address: 0x8830 | Function: .strerror
// attributes: thunk
char *strerror(int errnum)
{
  return strerror(errnum);
}


// Address: 0x8840 | Function: .write
// attributes: thunk
ssize_t write(int fd, const void *buf, size_t n)
{
  return write(fd, buf, n);
}


// Address: 0x8850 | Function: .fsync
// attributes: thunk
int fsync(int fd)
{
  return fsync(fd);
}


// Address: 0x8860 | Function: .lseek64
// attributes: thunk
__off64_t lseek64(int fd, __off64_t offset, int whence)
{
  return lseek64(fd, offset, whence);
}


// Address: 0x8870 | Function: .fstat
// attributes: thunk
int fstat(int fd, struct stat *buf)
{
  return fstat(fd, buf);
}


// Address: 0x8880 | Function: .__stack_chk_fail
// attributes: thunk
void __noreturn __stack_chk_fail()
{
  _stack_chk_fail();
}


// Address: 0x8890 | Function: .ftruncate64
// attributes: thunk
int ftruncate64(int fd, __off64_t length)
{
  return ftruncate64(fd, length);
}


// Address: 0x88A0 | Function: .recvmsg
// attributes: thunk
ssize_t recvmsg(int fd, struct msghdr *message, int flags)
{
  return recvmsg(fd, message, flags);
}


// Address: 0x88B0 | Function: .__cmsg_nxthdr
// attributes: thunk
struct cmsghdr *__cmsg_nxthdr(struct msghdr *mhdr, struct cmsghdr *cmsg)
{
  return _cmsg_nxthdr(mhdr, cmsg);
}


// Address: 0x88C0 | Function: .memchr
// attributes: thunk
void *memchr(const void *s, int c, size_t n)
{
  return memchr(s, c, n);
}


// Address: 0x88D0 | Function: .readlink
// attributes: thunk
ssize_t readlink(const char *path, char *buf, size_t len)
{
  return readlink(path, buf, len);
}


// Address: 0x88E0 | Function: .stat
// attributes: thunk
int stat(const char *file, struct stat *buf)
{
  return stat(file, buf);
}


// Address: 0x88F0 | Function: .opendir
// attributes: thunk
DIR *opendir(const char *name)
{
  return opendir(name);
}


// Address: 0x8900 | Function: .readdir
// attributes: thunk
struct dirent *readdir(DIR *dirp)
{
  return readdir(dirp);
}


// Address: 0x8910 | Function: .rewinddir
// attributes: thunk
void rewinddir(DIR *dirp)
{
  rewinddir(dirp);
}


// Address: 0x8920 | Function: .strlen
// attributes: thunk
size_t strlen(const char *s)
{
  return strlen(s);
}


// Address: 0x8930 | Function: .closedir
// attributes: thunk
int closedir(DIR *dirp)
{
  return closedir(dirp);
}


// Address: 0x8940 | Function: .memcpy
// attributes: thunk
void *memcpy(void *dest, const void *src, size_t n)
{
  return memcpy(dest, src, n);
}


// Address: 0x8950 | Function: .lstat
// attributes: thunk
int lstat(const char *file, struct stat *buf)
{
  return lstat(file, buf);
}


// Address: 0x8960 | Function: .rmdir
// attributes: thunk
int rmdir(const char *path)
{
  return rmdir(path);
}


// Address: 0x8970 | Function: .unlink
// attributes: thunk
int unlink(const char *name)
{
  return unlink(name);
}


// Address: 0x8980 | Function: .rename
// attributes: thunk
int rename(const char *old, const char *a2)
{
  return rename(old, a2);
}


// Address: 0x8990 | Function: .strcmp
// attributes: thunk
int strcmp(const char *s1, const char *s2)
{
  return strcmp(s1, s2);
}


// Address: 0x89A0 | Function: .fwrite
// attributes: thunk
size_t fwrite(const void *ptr, size_t size, size_t n, FILE *s)
{
  return fwrite(ptr, size, n, s);
}


// Address: 0x89B0 | Function: .socket
// attributes: thunk
int socket(int domain, int type, int protocol)
{
  return socket(domain, type, protocol);
}


// Address: 0x89C0 | Function: .setsockopt
// attributes: thunk
int setsockopt(int fd, int level, int optname, const void *optval, socklen_t optlen)
{
  return setsockopt(fd, level, optname, optval, optlen);
}


// Address: 0x89D0 | Function: .inet_pton
// attributes: thunk
int inet_pton(int af, const char *cp, void *buf)
{
  return inet_pton(af, cp, buf);
}


// Address: 0x89E0 | Function: .connect
// attributes: thunk
int connect(int fd, const struct sockaddr *addr, socklen_t len)
{
  return connect(fd, addr, len);
}


// Address: 0x89F0 | Function: .__memcpy_chk
// attributes: thunk
__int64 __fastcall __memcpy_chk()
{
  return _memcpy_chk();
}


// Address: 0x8A00 | Function: .daemon
// attributes: thunk
int daemon(int nochdir, int noclose)
{
  return daemon(nochdir, noclose);
}


// Address: 0x8A10 | Function: .geteuid
// attributes: thunk
__uid_t geteuid(void)
{
  return geteuid();
}


// Address: 0x8A20 | Function: .memset
// attributes: thunk
void *memset(void *s, int c, size_t n)
{
  return memset(s, c, n);
}


// Address: 0x8A30 | Function: .__FD_SET_chk
// attributes: thunk
__int64 __fastcall __FD_SET_chk()
{
  return _FD_SET_chk();
}


// Address: 0x8A40 | Function: .select
// attributes: thunk
int select(int nfds, fd_set *readfds, fd_set *writefds, fd_set *exceptfds, struct timeval *timeout)
{
  return select(nfds, readfds, writefds, exceptfds, timeout);
}


// Address: 0x8A50 | Function: .ioctl
// attributes: thunk
int ioctl(int fd, unsigned __int64 request, ...)
{
  return ioctl(fd, request);
}


// Address: 0x8A60 | Function: .__umask_chk
// attributes: thunk
__int64 __fastcall __umask_chk()
{
  return _umask_chk();
}


// Address: 0x8A70 | Function: .close
// attributes: thunk
int close(int fd)
{
  return close(fd);
}


// Address: 0x8A80 | Function: .dprintf
// attributes: thunk
int dprintf(int fd, const char *fmt, ...)
{
  return dprintf(fd, fmt);
}


// Address: 0x8A90 | Function: .dirfd
// attributes: thunk
int dirfd(DIR *dirp)
{
  return dirfd(dirp);
}


// Address: 0x8AA0 | Function: .__open_2
// attributes: thunk
__int64 __fastcall __open_2()
{
  return _open_2();
}


// Address: 0x8AB0 | Function: .fdopendir
// attributes: thunk
DIR *fdopendir(int fd)
{
  return fdopendir(fd);
}


// Address: 0x8AC0 | Function: .lseek
// attributes: thunk
__off_t lseek(int fd, __off_t offset, int whence)
{
  return lseek(fd, offset, whence);
}


// Address: 0x8AD0 | Function: .ftruncate
// attributes: thunk
int ftruncate(int fd, __off_t length)
{
  return ftruncate(fd, length);
}


// Address: 0x8AE0 | Function: .utimensat
// attributes: thunk
int utimensat(int fd, const char *path, const struct timespec times[2], int flags)
{
  return utimensat(fd, path, times, flags);
}


// Address: 0x8AF0 | Function: .realpath
// attributes: thunk
char *realpath(const char *name, char *resolved)
{
  return realpath(name, resolved);
}


// Address: 0x8B00 | Function: .symlink
// attributes: thunk
int symlink(const char *from, const char *to)
{
  return symlink(from, to);
}


// Address: 0x8B10 | Function: .open
// attributes: thunk
int open(const char *file, int oflag, ...)
{
  return open(file, oflag);
}


// Address: 0x8B20 | Function: .read
// attributes: thunk
ssize_t read(int fd, void *buf, size_t nbytes)
{
  return read(fd, buf, nbytes);
}


// Address: 0x8B30 | Function: .getsockopt
// attributes: thunk
int getsockopt(int fd, int level, int optname, void *optval, socklen_t *optlen)
{
  return getsockopt(fd, level, optname, optval, optlen);
}


// Address: 0x8B40 | Function: .getsockname
// attributes: thunk
int getsockname(int fd, struct sockaddr *addr, socklen_t *len)
{
  return getsockname(fd, addr, len);
}


// Address: 0x8B50 | Function: .getpeername
// attributes: thunk
int getpeername(int fd, struct sockaddr *addr, socklen_t *len)
{
  return getpeername(fd, addr, len);
}


// Address: 0x8B60 | Function: .vsnprintf
// attributes: thunk
int vsnprintf(char *s, size_t maxlen, const char *format, __gnuc_va_list arg)
{
  return vsnprintf(s, maxlen, format, arg);
}


// Address: 0x8B70 | Function: .sendmsg
// attributes: thunk
ssize_t sendmsg(int fd, const struct msghdr *message, int flags)
{
  return sendmsg(fd, message, flags);
}


// Address: 0x8B80 | Function: .fstatat
// attributes: thunk
int fstatat(int fd, const char *file, struct stat *buf, int flag)
{
  return fstatat(fd, file, buf, flag);
}


// Address: 0x8B90 | Function: .readlinkat
// attributes: thunk
ssize_t readlinkat(int fd, const char *path, char *buf, size_t len)
{
  return readlinkat(fd, path, buf, len);
}


// Address: 0x8BA0 | Function: .strrchr
// attributes: thunk
char *strrchr(const char *s, int c)
{
  return strrchr(s, c);
}


// Address: 0x8BB0 | Function: .__vsnprintf_chk
// attributes: thunk
__int64 __fastcall __vsnprintf_chk()
{
  return _vsnprintf_chk();
}


// Address: 0x8BC0 | Function: .strcpy
// attributes: thunk
char *strcpy(char *dest, const char *src)
{
  return strcpy(dest, src);
}


// Address: 0x8BD0 | Function: .fchmodat
// attributes: thunk
int fchmodat(int fd, const char *file, __mode_t mode, int flag)
{
  return fchmodat(fd, file, mode, flag);
}


// Address: 0x8BE0 | Function: .chmod
// attributes: thunk
int chmod(const char *file, __mode_t mode)
{
  return chmod(file, mode);
}


// Address: 0x8BF0 | Function: .lchown
// attributes: thunk
int lchown(const char *file, __uid_t owner, __gid_t group)
{
  return lchown(file, owner, group);
}


// Address: 0x8C00 | Function: .chown
// attributes: thunk
int chown(const char *file, __uid_t owner, __gid_t group)
{
  return chown(file, owner, group);
}


// Address: 0x8C10 | Function: .mkdir
// attributes: thunk
int mkdir(const char *path, __mode_t mode)
{
  return mkdir(path, mode);
}


