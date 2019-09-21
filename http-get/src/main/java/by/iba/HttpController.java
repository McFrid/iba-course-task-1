package by.iba;


class HttpController {

    static class HttpResponse {
        int statusCode = 200;
        String message = " [{ body: 'f', title: 'b', userId: 'b', id: 'd' }]";
    }

    HttpResponse get(String url) {
        return new HttpResponse();
    }
}
