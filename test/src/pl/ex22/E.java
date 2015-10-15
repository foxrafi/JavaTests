package pl.ex22;

import java.util.StringTokenizer;

public class E {

	public static void main(String[] args) {
		String s = 	"C++:Java:Pascal:Groovy:Perl:Python\n" +
					"Assembler:Machine code:Lisp:C#\n" +
					"Class:private:public:static:protected";
		
		StringTokenizer st = new StringTokenizer(s,":\n");
		while(st.hasMoreTokens()){
			System.out.printf("- %s\n", st.nextToken());
		}
	}

}
