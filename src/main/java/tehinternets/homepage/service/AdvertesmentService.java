package tehinternets.homepage.service;

import org.springframework.stereotype.Service;
import tehinternets.homepage.domain.Advertesment;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Collections;

@Service
public class AdvertesmentService {
    public Advertesment getAd() {
        return new Advertesment(1L, "pardod valsti", "par 10000000000$", "Janka");

    }
    public ArrayList getAdList() {
        ArrayList<Advertesment> ads = new ArrayList<>();
        Advertesment ad = new Advertesment(1L, "pardod valsti", "par 10000000000$", "Janka");
        ads.add(ad);
        ads.add(new Advertesment(2L, "pardodu burku", "par 12345125", "Peters"));
        return ads;
    }

    public ArrayList<Advertesment> searchAdList(ArrayList<Advertesment> ads, String searchQuery) {
        ArrayList<Advertesment> ad = new ArrayList<>();
        for (Advertesment ad1 : ads) {
            if (ad1.getAuthor().matches(searchQuery)) {
                    ad.add(ad1);
            }
        }
        return ad;
    }

    public ArrayList reversAds(ArrayList<Advertesment> ads) {
        Collections.reverse(ads);
        return ads;
    }
}
