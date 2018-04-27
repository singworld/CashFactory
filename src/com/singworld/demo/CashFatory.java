package com.singworld.demo;

public class CashFatory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		switch(type)
		{
		case "正常收费":
			cs = new CashNormal();
			break;
		case "满300返100":
			CashReturn cr1 = new CashReturn("300.0","100.0");
			cs = cr1;
			break;
		case "打八折":
			CashRebate cr2 = new CashRebate("0.8");
			cs = cr2;
			break;
		}
		return cs;
	}

}
