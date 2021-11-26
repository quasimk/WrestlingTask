
public class Wrestler {

	String name;
	int age;
	String weightDivision;
	float weight;
	int skillLevel;

	public Wrestler(String Name, int Age, String WeightDivision, float Weight, int SkillLevel) {

		name = Name;
		age = Age;
		weightDivision = WeightDivision;
		weight = Weight;
		skillLevel = SkillLevel;

	}

	void training() {
		skillLevel += 5;
	}

}

class Lightweight extends Wrestler {// LIGHTWEIGHTS

	int agility;
	int flexibility;
	int jumping;
	int athleticism;

	public Lightweight(String Name, int Age, String WeightDivision, float Weight, int Agility, int Flexibility,
			int Jumping, int Athleticism, int SkillLevel) {
		super(Name, Age, WeightDivision, Weight, SkillLevel);

		agility = Agility;
		flexibility = Flexibility;
		jumping = Jumping;
		athleticism = Athleticism;
	}

	void jump() {
		jumping += 10;
		athleticism += 5;
		System.out.println("just jumped");
	}

	void bodySlammed() {
		athleticism = 10;
		agility -= 5;
	}

}

class Heavyweight extends Wrestler {// HEAVYWEIGHTS

	int punchStrength;
	int power;
	int defense;
	int courage;

	public Heavyweight(String Name, int Age, String WeightDivision, float Weight, int PunchStrength, int Power,
			int Defense, int Courage, int SkillLevel) {
		super(Name, Age, WeightDivision, Weight, SkillLevel);
		punchStrength = PunchStrength;
		power = Power;
		defense = Defense;
		courage = Courage;
	}

	void fights() {
		courage += 5;
		defense -= 4;
		punchStrength += 5;
		System.out.println("After fighting his courage increases to " + courage+ "/100");
		
	}

	void attacked(String HeavyWeightOne, int HeavyWeightCourageLevel) {
		power -= 10;
		HeavyWeightCourageLevel-=5;
		defense += 5; 
		System.out.println("After being attacked "+ HeavyWeightOne +" courage levels decreases to " + HeavyWeightCourageLevel + "/100");

	}
	void wrestlingMatch (int LightweightSkillLevel, int HeavyWeightSkillLevel, String LightweightOne, String HeavyWeightOne) {
		HeavyWeightSkillLevel +=5;
		LightweightSkillLevel-=10;
		System.out.println("After fighting "+ LightweightOne +"," +" the skill level of "+ HeavyWeightOne + "increases to "+ HeavyWeightSkillLevel);
		System.out.println("However, the skill level of " + LightweightOne + " reduces to " + LightweightSkillLevel);
	}

}