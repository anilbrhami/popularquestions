package testJune.withmaven;

public class TestStrings {

	public static void main(String[] args) {
		String s = "Justastring";
		StringBuilder sb = new StringBuilder();
		StringBuffer sbu = new StringBuffer();
		
		sb.append("Trouble");
		sbu.append("stingbuffer");
		
		System.out.println(s+" "+sb.reverse()+" "+sbu);
		
		System.out.println(s.getBytes());

	}

}
