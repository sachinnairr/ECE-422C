package assignment2;

public class Response {
    int black;
    int white;

    public Response(int black, int white) {
        this.black = black;
        this.white = white;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Response))
            return false;
        Response response = (Response)o;
        return response.white == white && response.black == black;
    }
}
