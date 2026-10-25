import struct
import sys

def patch_axml_string_pool(data, replacements):
    # XML header: type (4 bytes), file_size (4 bytes)
    # StringPool header: chunk_type (4), chunk_size (4), string_count (4), style_count (4), flags (4), strings_start (4), styles_start (4)
    chunk_type, chunk_size, string_count, style_count, flags, strings_start, styles_start = struct.unpack_from('<IIIIIII', data, 8)
    assert chunk_type == 0x001C0001
    is_utf8 = bool(flags & 0x100)
    assert not is_utf8  # UTF-16LE
    
    offsets = list(struct.unpack_from(f'<{string_count}I', data, 8 + 28))
    pool_data_start = 8 + strings_start
    
    strings = []
    for off in offsets:
        p = pool_data_start + off
        u16len = struct.unpack_from('<H', data, p)[0]
        if u16len & 0x8000:
            u16len = ((u16len & 0x7FFF) << 16) | struct.unpack_from('<H', data, p+2)[0]
            p += 4
        else:
            p += 2
        s = data[p:p + u16len*2].decode('utf-16le', errors='ignore')
        strings.append(s)
        
    # Apply replacements
    new_strings = [replacements.get(s, s) for s in strings]
    
    # Rebuild strings block and offsets
    new_offsets = []
    str_bytes = bytearray()
    for s in new_strings:
        new_offsets.append(len(str_bytes))
        encoded = s.encode('utf-16le')
        u16len = len(s)
        if u16len > 0x7FFF:
            str_bytes.extend(struct.pack('<HH', (u16len >> 16) | 0x8000, u16len & 0xFFFF))
        else:
            str_bytes.extend(struct.pack('<H', u16len))
        str_bytes.extend(encoded)
        str_bytes.extend(b'\x00\x00')  # null terminator
        
    styles_data = b''
    # Pad str_bytes to 4-byte boundary
    pad_len = (4 - (len(str_bytes) % 4)) % 4
    str_bytes.extend(b'\x00' * pad_len)
    
    new_header_size = 28 + (string_count * 4) + (style_count * 4)
    new_strings_start = new_header_size
    new_styles_start = 0 if style_count == 0 else (new_strings_start + len(str_bytes))
    
    new_chunk_size = new_header_size + len(str_bytes) + len(styles_data)
    
    new_pool = bytearray()
    new_pool.extend(struct.pack('<IIIIIII', chunk_type, new_chunk_size, string_count, style_count, flags, new_strings_start, new_styles_start))
    for off in new_offsets:
        new_pool.extend(struct.pack('<I', off))
    new_pool.extend(str_bytes)
    new_pool.extend(styles_data)
    
    # Remaining chunks after original string pool
    rest_data = data[8 + chunk_size:]
    
    new_file_size = 8 + len(new_pool) + len(rest_data)
    new_xml_header = struct.pack('<II', 0x00080003, new_file_size)
    
    return bytes(new_xml_header + new_pool + rest_data)

if __name__ == "__main__":
    src_file = sys.argv[1] if len(sys.argv) > 1 else "apk_project/AndroidManifest.xml"
    dst_file = sys.argv[2] if len(sys.argv) > 2 else "apk_project/AndroidManifest_binary.xml"
    
    with open(src_file, 'rb') as f:
        orig = f.read()

    repls = {
        'bin.mt.plus': 'y.open.mt',
        'bin.mt.plus.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION': 'y.open.mt.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION',
        'bin.mt.plus.html-preview': 'y.open.mt.html-preview',
        'bin.mt.plus.fp': 'y.open.mt.fp',
        'bin.mt.plus.shizuku': 'y.open.mt.shizuku',
        'bin.mt.plus.androidx-startup': 'y.open.mt.androidx-startup',
        'UMENG_CHANNEL': ''
    }
    patched = patch_axml_string_pool(orig, repls)
    with open(dst_file, 'wb') as f:
        f.write(patched)
    print(f"Patched successfully into {dst_file}, size: {len(patched)}")
