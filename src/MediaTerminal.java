public class MediaTerminal {
    public static void main(String[] args) throws Exception {

        int soma = 0, media;
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            int num = Integer.parseInt(s);

            soma += num;
        }

        media = soma / args.length;

        System.out.println(media);
    }
}
