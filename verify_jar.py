import zipfile, hashlib

SRC = "/home/user/work/jar/mod.jar"
OUT = "/home/user/systemdlc_fixed.jar"
PATCHED = {"af.class", "gu.class", "cj.class", "kI.class",
           "com/github/cnqgnlxable.class", "recovered/fabric/identity/ProfileIdentity.class"}
NEW = {"zzViewModelExt.class", "zzViewModelExt$ResetAction.class", "zzSwingPatch.class"}

a = zipfile.ZipFile(SRC); b = zipfile.ZipFile(OUT)
na, nb = a.namelist(), b.namelist()

print("entries: original %d -> patched %d" % (len(na), len(nb)))
assert set(nb) - set(na) == NEW, "unexpected added entries: %s" % (set(nb) - set(na))
assert set(na) - set(nb) == set(), "missing entries: %s" % (set(na) - set(nb))
print("added   : %s" % sorted(set(nb) - set(na)))
print("removed : none")

diff, same = [], 0
for n in na:
    ha = hashlib.sha256(a.read(n)).hexdigest()
    hb = hashlib.sha256(b.read(n)).hexdigest()
    if ha != hb: diff.append(n)
    else: same += 1
print("byte-identical entries : %d / %d" % (same, len(na)))
print("changed entries        : %s" % sorted(diff))
assert set(diff) == PATCHED, "unexpected change set!"

print("MANIFEST preserved     : %s" % (a.read("META-INF/MANIFEST.MF") == b.read("META-INF/MANIFEST.MF")))
bad = b.testzip()
print("zip integrity          : %s" % ("OK" if bad is None else "CORRUPT at " + str(bad)))
print("fabric.mod.json intact : %s" % (a.read("fabric.mod.json") == b.read("fabric.mod.json")))
print("\nRESULT: PASS - only the 6 intended classes changed, 3 added, nothing else touched")
