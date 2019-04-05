package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CCC_01_J1 {

    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = sc.nextInt();

        for(int i = 1; i <= N; i += 2) {
            for(int j = 0; j < i; j++)
                out.print("*");

            for(int j = 0; j < N * 2 - i * 2; j++)
                out.print(" ");

            for(int j = 0; j < i; j++)
                out.print("*");

            out.println();
        }

        for(int i = N - 2; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++)
                out.print("*");

            for (int j = 0; j < N * 2 - i * 2; j++)
                out.print(" ");

            for (int j = 0; j < i; j++)
                out.print("*");

            out.println();
        }

        out.close();
    }

    public static class FastScanner {
        static BufferedReader br;
        static StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        static String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        static char nextChar() throws IOException {
            return next().charAt(0);
        }

        static String nextLine() throws IOException {
            return br.readLine();
        }
    }
}