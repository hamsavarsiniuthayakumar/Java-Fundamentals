
public class CharacterVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num='h';
		if(num>=65 && num<=96 || num>=97 && num<=122 ) {
			System.out.println("Alphabet");
		}
		else if(num>='0' && num<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
