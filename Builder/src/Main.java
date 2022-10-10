public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// String biolder was introduced to java by java1.5
    StringBuilder builder = new StringBuilder();

		builder.append("This is an example ");

		builder.append("of the builder pattern. ");

		builder.append("It has methods to append ");

		builder.append("almost anything we want to a String. ");

		builder.append(42);

		System.out.println(builder.toString());

}

}