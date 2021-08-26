package book;

public class PojoLambda2 {
    public PojoResponse handlerPojo(PojoInput input) {
        return new PojoResponse("The input was " + input.c);
    }

    public static class PojoInput {
        public String c;
    }

    public static class PojoResponse {
        public final String d;

        PojoResponse(String d) {
            this.d = d;
        }
    }
}