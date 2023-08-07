
package com.mycompany.practica3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaA {

	public static void main(String... args) throws IOException {
		InputStreamReader StrReader = new InputStreamReader(System.in);
		BufferedReader Entrada = new BufferedReader(StrReader);
		while (true) {
			String[] vals = Entrada.readLine().split(" ");
			int S = Integer.parseInt(vals[0]);
			int B = Integer.parseInt(vals[1]);
			if (S + B == 0) {
				break;
			}
			Soldier[] soldiers = new Soldier[S + 2]; 
			soldiers[0] = new Soldier(0, 1);
			soldiers[S + 1] = new Soldier(S, S + 1);
			for (int i = 1; i <= S; i++) {
				soldiers[i] = new Soldier(i - 1, i + 1);
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < B; i++) {
				vals = Entrada.readLine().split(" ");
                                int R = Integer.parseInt(vals[1]);
				int L = Integer.parseInt(vals[0]);
				
				String right = soldiers[R].right > S ? "*" : soldiers[R].right + "";
                                String left = soldiers[L].left < 1 ? "*" : soldiers[L].left + "";
				sb.append(left).append(" ").append(right).append("\n");
				
				soldiers[soldiers[R].right].left = soldiers[L].left;
                                soldiers[soldiers[L].left].right = soldiers[R].right;
			}
			sb.append("-");
			System.out.println(sb);
		}
	}

	static class Soldier {
		int left, right;

		public Soldier(int left, int right) {
			this.right = right;
                        this.left = left;
		}
	}
}

