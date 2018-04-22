package tehinternets.homepage.domain;

public class Response {

    private String messange;

    public Response() {

    }

    public Response(String msg) {
        this.messange = msg;
    }

    public String getMessange() {
        return messange;
    }

    public void setMessange(String messange) {
        this.messange = messange;
    }
}

