package tehinternets.homepage.service;

import org.springframework.stereotype.Service;
import tehinternets.homepage.domain.Advertesment;

import java.util.ArrayList;

@Service
public class AdvertesmentService {
    public Advertesment getAd() {
        Advertesment ad = new Advertesment(1L, "pardod valsti", "par 10000000000$", "Janka");
        return ad;
    }
    public ArrayList getAdList() {
        ArrayList<Advertesment> ads = new ArrayList<>();
        Advertesment ad = new Advertesment(1L, "pardod valsti", "par 10000000000$", "Janka");
        ads.add(ad);
        return ads;
    }
}
