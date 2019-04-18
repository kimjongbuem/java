package CH14_15_16Inherit_2;

public class CH14_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridWaterCar hwc1 = new HybridWaterCar();
		HybridWaterCar hwc2 = new HybridWaterCar(20);
		HybridWaterCar hwc3 = new HybridWaterCar(20,30);
		HybridWaterCar hwc4 = new HybridWaterCar(20,30,40);
		
		hwc1.showCurrentGauge();
		hwc2.showCurrentGauge();
		hwc3.showCurrentGauge();
		hwc4.showCurrentGauge();
	}

}
class car{
	int gasolineGauge = 0;
	car(){
	}
	car(int gauge){
		gasolineGauge  = gauge;
	}
}
class HybridCar extends car{
	int electicGauge = 0;
	HybridCar(){
		super();
	}
	HybridCar(int gasolineGauge){
		super(gasolineGauge);	
	}
	HybridCar(int gasolineGauge, int electicGauge){
		super(gasolineGauge);	
		this.electicGauge = electicGauge;
	}
}
class HybridWaterCar extends HybridCar{
	int waterGauge = 0;
	HybridWaterCar(){
		super();
	}
	HybridWaterCar(int gasolineGauge){
		super(gasolineGauge);
	}
	HybridWaterCar(int gasolineGauge, int electicGauge){
		super(gasolineGauge,electicGauge);	
	}
	HybridWaterCar(int gasolineGauge, int electicGauge, int waterGauge){
		super(gasolineGauge,electicGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("¿‹ø© ∞°º÷∏∞ : "+gasolineGauge);
		System.out.println("¿‹ø© ¿¸±‚∑Æ : "+electicGauge);
		System.out.println("¿‹ø© øˆ≈Õ∑Æ : "+waterGauge);
	}
}