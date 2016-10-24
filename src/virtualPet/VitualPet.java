package virtualPet;
import test.VirtualPet;
public class VitualPet {
	public static void main(String[] args) {
		 
		VirtualPet mypet = new VirtualPet();
		mypet.tellMeIfYouAreHunger();
		mypet.tellMeIfYouAreThirst();
		mypet.tellMeIfYouAreSickness();
		mypet.tick();
		mypet.feededme();
	}
}
