/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class lk {
    private static final Map<Integer, Supplier<aT>> a = new LinkedHashMap<Integer, Supplier<aT>>();
    private static int b;

    static {
        lk.a(1);
        lk.a(dd::new);
        lk.a(ky::new);
        lk.a(jL::new);
        lk.a(kT::new);
        lk.a(gZ::new);
        lk.a(bQ::new);
        lk.a(bp::new);
        lk.a(hv::new);
        lk.a(ag::new);
        lk.a(gd::new);
        lk.a(100);
        lk.a(f::new);
        lk.a(S::new);
        lk.a(bZ::new);
        lk.a(ck::new);
        lk.a(cV::new);
        lk.a(ax::new);
        lk.a(ff::new);
        lk.a(cm::new);
        lk.a(br::new);
        lk.a(dR::new);
        lk.a(hC::new);
        lk.a(dy::new);
        lk.a(jp::new);
        lk.a(bR::new);
        lk.a(jx::new);
        lk.a(200);
        lk.a(iu::new);
        lk.a(bc::new);
        lk.a(dU::new);
        lk.a(gk::new);
        lk.a(hu::new);
        lk.a(hx::new);
        lk.a(cg::new);
        lk.a(lj::new);
        lk.a(dZ::new);
        lk.a(hw::new);
        lk.a(jq::new);
        lk.a(v::new);
        lk.a(iW::new);
        lk.a(hc::new);
        lk.a(300);
        lk.a(aH::new);
        lk.a(dK::new);
        lk.a(kK::new);
        lk.a(gb::new);
        lk.a(by::new);
        lk.a(W::new);
        lk.a(eM::new);
        lk.a(n::new);
        lk.a(he::new);
        lk.a();
        lk.a(iR::new);
        lk.a(fQ::new);
        lk.a(kf::new);
        lk.a(lB::new);
        lk.a(lv::new);
        lk.a(bb::new);
        lk.a(jo::new);
        lk.a(fP::new);
        lk.a(dl::new);
        lk.a(fj::new);
        lk.a(is::new);
        lk.a(hK::new);
        lk.a(gC::new);
        lk.a(kj::new);
        lk.a(eC::new);
        lk.a(gP::new);
        lk.a(cL::new);
        lk.a(gJ::new);
        lk.a(jw::new);
        lk.a(400);
        lk.a(hl::new);
        lk.a(kH::new);
        lk.a(hN::new);
        lk.a(gm::new);
        lk.a(fy::new);
        lk.a(ly::new);
        lk.a(dS::new);
        lk.a(iv::new);
        lk.a(gI::new);
        lk.a(gu::new);
        lk.a(kI::new);
        lk.a(cq::new);
        lk.a(fG::new);
        lk.a(hi::new);
        lk.a(jC::new);
        lk.a(kQ::new);
        lk.a(fq::new);
        lk.a(eW::new);
        lk.a(gM::new);
        lk.a(kx::new);
        lk.a(hh::new);
        lk.a(P::new);
        lk.a(U::new);
        lk.a(jU::new);
        lk.a(500);
        lk.a(db::new);
        lk.a(lt::new);
        lk.a(dv::new);
        lk.a(eR::new);
        lk.a(jT::new);
        lk.a(cC::new);
        lk.a(ll::new);
        lk.a(bs::new);
        lk.a(lg::new);
        lk.a(p::new);
        lk.a(iz::new);
        lk.a(iV::new);
        lk.a(ay::new);
        lk.a(h::new);
        lk.a(gS::new);
        lk.a(dc::new);
        lk.a(aO::new);
        lk.a(fp::new);
        lk.a(dY::new);
    }

    public static List a() {
        ArrayList<aT> arrayList = new ArrayList<aT>();
        for (Supplier<aT> supplier : a.values()) {
            try {
                arrayList.add(supplier.get());
            }
            catch (Exception exception) {}
        }
        return arrayList;
    }

    public static Set a(String string) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        if (string == null || string.isEmpty()) {
            return hashSet;
        }
        for (String string2 : string.split(",")) {
            try {
                int n2 = Integer.parseInt(string2.trim());
                if (!a.containsKey(n2)) continue;
                hashSet.add(n2);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return hashSet;
    }

    public static List a(Set set) {
        ArrayList<aT> arrayList = new ArrayList<aT>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int n2 = (Integer)iterator.next();
            aT aT2 = lk.a(n2);
            if (aT2 == null) continue;
            arrayList.add(aT2);
        }
        return arrayList;
    }

    public static aT a(int n2) {
        Supplier<aT> supplier = a.get(n2);
        return supplier != null ? supplier.get() : null;
    }

    private static void a(int n2) {
        b = n2;
    }

    private static void a() {
        ++b;
    }

    private static void a(Supplier supplier) {
        a.put(b++, supplier);
    }
}

