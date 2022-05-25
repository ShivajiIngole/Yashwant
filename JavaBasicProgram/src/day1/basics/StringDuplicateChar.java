package day1.basics;

public class StringDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Better Butter";
String s2 =s1.toLowerCase();
String s3= s2.replaceAll("\\s","");

char []string = s3.toCharArray();

for (int i=0;i<string.length;i++) {
	int count=1;
	for (int j=i+1;j<string.length;j++) {
		if (string[i]==string[j] ) {
			count++;
			string[j]='0';
		}
	}
	if (count>1&&string[i]!='0') {
		System.out.println (string[i]+"="+count);
	}
	
}




	}

}
