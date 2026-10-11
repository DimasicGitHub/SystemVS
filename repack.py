import zipfile, os, shutil, sys

SRC   = "/home/user/work/jar/mod.jar"
DIR   = "/home/user/work/jar/extracted"
OUT   = "/home/user/systemdlc_fixed.jar"

PATCHED = ["af.class", "gu.class", "cj.class", "kI.class",
           "com/github/cnqgnlxable.class", "recovered/fabric/identity/ProfileIdentity.class"]
NEW     = ["zzViewModelExt.class", "zzViewModelExt$ResetAction.class", "zzSwingPatch.class"]

os.makedirs(os.path.dirname(OUT), exist_ok=True)

zin = zipfile.ZipFile(SRC, "r")
names = zin.namelist()
changed, kept = 0, 0

with zipfile.ZipFile(OUT, "w", zipfile.ZIP_DEFLATED) as zout:
    for info in zin.infolist():
        path = os.path.join(DIR, info.filename)
        if info.filename in PATCHED and os.path.exists(path):
            data = open(path, "rb").read()
            changed += 1
        else:
            data = zin.read(info.filename)
            kept += 1
        zi = zipfile.ZipInfo(info.filename, date_time=info.date_time)
        zi.compress_type = info.compress_type
        zi.external_attr = info.external_attr
        zi.internal_attr = info.internal_attr
        zi.create_system = info.create_system
        zout.writestr(zi, data)
    for n in NEW:
        p = os.path.join(DIR, n)
        if not os.path.exists(p):
            sys.exit("missing new class: " + n)
        zi = zipfile.ZipInfo(n, date_time=(2025, 8, 25, 17, 40, 0))
        zi.compress_type = zipfile.ZIP_DEFLATED
        zi.external_attr = 0o600 << 16
        zout.writestr(zi, open(p, "rb").read())

print("entries copied unchanged : %d" % kept)
print("entries replaced         : %d  (%s)" % (changed, ", ".join(PATCHED)))
print("entries added            : %d  (%s)" % (len(NEW), ", ".join(NEW)))
print("output                   : %s (%d bytes)" % (OUT, os.path.getsize(OUT)))
