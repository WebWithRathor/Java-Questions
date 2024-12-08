package StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intro {
    public static void main(String[] args) throws IOException {

//        string builder , string buffer , buffer reader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char a = br.readLine().charAt(0);

//        String a = br.readLine();
//        int as = Integer.parseInt(br.readLine());
//        int as1 = Integer.parseInt(br.readLine());
//        System.out.println(a);
//        System.out.println(as);
//        System.out.println(as1);
//        System.out.println(as1 + as);


        boolean as2 = Boolean.parseBoolean(br.readLine());
        System.out.println(as2);



//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        sb.append("abcdefcd");
//        sb.delete(2,4);
//        System.out.println(sb);
//        System.out.println(sb.indexOf("cd"));
//        System.out.println(sb.indexOf("cd" , 4));
//        System.out.println(sb.replace(2,3,"astha"));
//        System.out.println(sb.insert(1,"devraj"));


    }
}
