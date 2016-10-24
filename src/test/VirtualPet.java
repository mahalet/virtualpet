package test;
 
public class VirtualPet {
	int hunger;
	int thirst;
	int sickness;
	public VirtualPet() {
		hunger = 10;
	}
		public boolean isHungry(int hungriness){
		int hungerthread = 20;
		boolean iAmHunger = hungriness > hungerthread;
		boolean iAmHungery = false;
		return iAmHungery;
		}
		public boolean isBoredom(int boredominess){
	    int boredomthread = 15;
	    int boredominess1 = 0;
		boolean iAmBoredom = boredominess1 > boredomthread;
		boolean iAmBoredom1 = false;
		return iAmBoredom1;
		}
	public void tellMeIfYouAreHunger() {
		if (hunger > 10) {
			System.out.println("1.feed me ");
		} else {
			System.out.println(" 2.im full");
			thirst = 20;
		}
	}

	public void tellMeIfYouAreThirst() {
		if (thirst > 20) {
			System.out.println("3. water me");
		} else {
			System.out.println("4. im not thirst");
	     sickness = 30;
	}
	}  
	public void tellMeIfYouAreSickness() {
		if (sickness > 30) {
			System.out.println("5. take me to the docter ");
		} else {
			System.out.println("6. do not take me no where");
		}
	}
		public void sethunger(int newhunger){
			this.hunger = newhunger;
		}
		public void setthirst(int newthirst){
			this.thirst = newthirst;
		}
		public void setsickness(int newsickness){
			this.sickness = newsickness;
		}
		public int gethunger(){
			return hunger;
		}
		public int getthirst(){
			return thirst;
		}
	    public int getsickness(){
	    	return sickness;
	    }
	public void tick() {
		int hungriess = 0;
		int hungriness = hungriess + 10;
		 
	}
	public void feededme() {
		 int hungriess = 0;
		int hungriness = hungriess - 15;
	}

}


	

 	
	

		
		
	
