package tehinternets.homepage.service;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import org.springframework.stereotype.Service;
import tehinternets.homepage.domain.Advertesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AdvertesmentService {

    String name = "Andis";
    public List<Advertesment> initList;
    public List<Advertesment> reverseList;

    public AdvertesmentService() {
        initList = initalization();
        reverseList = initList;
        Collections.reverse(reverseList);
    }

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

    private List<Advertesment> initalization () {
        List<Advertesment> advertesments = new ArrayList<>();
        for (int i = 1; i< name.length(); i++ ){
            Advertesment advertesment = new Advertesment(Long.valueOf(i), "Selling house on Mars, nr. " + i,
                    "par milijons $", getAuthorName(i));
            advertesments.add(advertesment);
        }
        return advertesments;
    }

    private String getAuthorName (int i) {
        if (i % 2 ==0) {
            return "Peters";
        }
        else {
            return "Janka";
        }
    }

    public List<Advertesment> getADs() {
        return reverseList;
    }

    public ArrayList<Advertesment> searchAdList(ArrayList<Advertesment> ads, String searchQuery) {
        ArrayList<Advertesment> matchedAd = new ArrayList<>();
        for (Advertesment ad1 : ads) {
            if (ad1.getAuthor().matches(searchQuery)) {
                matchedAd.add(ad1);
            }
        }
        return matchedAd;
    }

    public ArrayList<Advertesment> searchAdList(String searchQuery) {
        ArrayList<Advertesment> matchedAd = new ArrayList<>();
        for (Advertesment ad1 : initList) {
            if (ad1.getAuthor().matches(searchQuery)) {
                matchedAd.add(ad1);
            }
        }
        return matchedAd;
    }
}
