//Three friends working together earned Rs. 375. This amount is divided among them in such
//a way that if Rs. 4, Rs. 5, Rs. 6 is subtracted from their respective shares; the remainders will be in
//the ratio 3: 4: 5. Design an algorithm to calculate their individual shares. 

public class share {

	
	public static void main(String[] args) {
		
		double share,tot=375,tota=4,totb=5,totc=6,ratio=12;
        share=tot-(tota+totb+totc);
        share=share/ratio;
        System.out.println("the individual share of a: rs " +(share*3+4));
        System.out.println("the individual share of b: rs " +(share*4+5));
        System.out.println("the individual share of c: rs " +(share*5+6));
        
        
	}

}
