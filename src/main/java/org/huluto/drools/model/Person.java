package org.huluto.drools.model;

public class Person {

	private String name;
	private int age;
	
	public boolean trigger1 = true;
	private TrueOrFalse isMemoryDecrease = TrueOrFalse.Null;
	private TrueOrFalse isSomeElseIndicateMD = TrueOrFalse.Null;
	
	public boolean trigger2 = true;
	private TrueOrFalse isAcuteOccur = TrueOrFalse.Null;
	
	public boolean trigger3 = true;
	private double SDS;
	
	public boolean trigger4 = true;
	private TrueOrFalse isSymptomsIncreased = TrueOrFalse.Null;
	private int monthsOfDisease;
	
	private TrueOrFalse isEpilepsy = TrueOrFalse.Null;
	private TrueOrFalse isHemiplegia = TrueOrFalse.Null;
	
	
	private int Hachinski;
	
	private TrueOrFalse isNormalBloodRoutine = TrueOrFalse.Null;
	private TrueOrFalse isNormalUrineRoutine = TrueOrFalse.Null;
	
	private int MMSE;
	
	private TrueOrFalse isQualifiedByWorkStudy = TrueOrFalse.Null;
	private TrueOrFalse isQualifiedByFluentTest = TrueOrFalse.Null;
	
	private TrueOrFalse isShrinked = TrueOrFalse.Null;
	private int gap;
	
	private int CDR;
	
	private ADLevel ADResult;
	
	public enum ADLevel {
		Exclusion,
		CannotBeDiagnosed,
		ADLevel1,
		ADLevel2,
		ADLevel3	
	}
	
	public enum TrueOrFalse {
		True,
		False,
		Null
	}
	
	
	public Person(String name, int age, TrueOrFalse isMemoryDecrease, TrueOrFalse isSomeElseIndicateMD) {
		this.name = name;
		this.age = age;
		setMemoryDecrease(isMemoryDecrease);
		setSomeElseIndicateMD(isSomeElseIndicateMD);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public TrueOrFalse isMemoryDecrease() {
		return isMemoryDecrease;
	}

	public void setMemoryDecrease(TrueOrFalse isMemoryDecrease) {
		this.isMemoryDecrease = isMemoryDecrease;
	}

	public TrueOrFalse isSomeElseIndicateMD() {
		return isSomeElseIndicateMD;
	}

	public void setSomeElseIndicateMD(TrueOrFalse isSomeElseIndicateMD) {
		this.isSomeElseIndicateMD = isSomeElseIndicateMD;
	}

	public TrueOrFalse isAcuteOccur() {
		return isAcuteOccur;
	}

	public void setAcuteOccur(TrueOrFalse isAcuteOccur) {
		this.isAcuteOccur = isAcuteOccur;
	}

	public double getSDS() {
		return SDS;
	}

	public void setSDS(double sDS) {
		SDS = sDS;
	}

	public TrueOrFalse isSymptomsIncreased() {
		return isSymptomsIncreased;
	}

	public void setSymptomsIncreased(TrueOrFalse isSymptomsIncreased) {
		this.isSymptomsIncreased = isSymptomsIncreased;
	}

	public int getMonthsOfDisease() {
		return monthsOfDisease;
	}

	public void setMonthsOfDisease(int monthsOfDisease) {
		this.monthsOfDisease = monthsOfDisease;
	}

	public TrueOrFalse isEpilepsy() {
		return isEpilepsy;
	}

	public void setEpilepsy(TrueOrFalse isEpilepsy) {
		this.isEpilepsy = isEpilepsy;
	}

	public TrueOrFalse isHemiplegia() {
		return isHemiplegia;
	}

	public void setHemiplegia(TrueOrFalse isHemiplegia) {
		this.isHemiplegia = isHemiplegia;
	}

	public int getHachinski() {
		return Hachinski;
	}

	public void setHachinski(int hachinski) {
		Hachinski = hachinski;
	}

	public TrueOrFalse isNormalBloodRoutine() {
		return isNormalBloodRoutine;
	}

	public void setNormalBloodRoutine(TrueOrFalse isNormalBloodRoutine) {
		this.isNormalBloodRoutine = isNormalBloodRoutine;
	}

	public TrueOrFalse isNormalUrineRoutine() {
		return isNormalUrineRoutine;
	}

	public void setNormalUrineRoutine(TrueOrFalse isNormalUrineRoutine) {
		this.isNormalUrineRoutine = isNormalUrineRoutine;
	}

	public int getMMSE() {
		return MMSE;
	}

	public void setMMSE(int mMSE) {
		MMSE = mMSE;
	}

	public TrueOrFalse isQualifiedByWorkStudy() {
		return isQualifiedByWorkStudy;
	}

	public void setQualifiedByWorkStudy(TrueOrFalse isQualifiedByWorkStudy) {
		this.isQualifiedByWorkStudy = isQualifiedByWorkStudy;
	}

	public TrueOrFalse isQualifiedByFluentTest() {
		return isQualifiedByFluentTest;
	}

	public void setQualifiedByFluentTest(TrueOrFalse isQualifiedByFluentTest) {
		this.isQualifiedByFluentTest = isQualifiedByFluentTest;
	}

	public TrueOrFalse isShrinked() {
		return isShrinked;
	}

	public void setShrinked(TrueOrFalse isShrinked) {
		this.isShrinked = isShrinked;
	}

	public int getGap() {
		return gap;
	}

	public void setGap(int gap) {
		this.gap = gap;
	}

	public int getCDR() {
		return CDR;
	}

	public void setCDR(int cDR) {
		CDR = cDR;
	}

	public ADLevel getADResult() {
		return ADResult;
	}

	public void setADResult(ADLevel aDResult) {
		ADResult = aDResult;
	}
	
	
	
}
