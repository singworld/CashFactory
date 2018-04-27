package com.singworld.demo;

public class CashFatory {
	public static CashSuper createCashAccept(String type){
		CashSuper cs = null;
		switch(type)
		{
		case "�����շ�":
			cs = new CashNormal();
			break;
		case "��300��100":
			CashReturn cr1 = new CashReturn("300.0","100.0");
			cs = cr1;
			break;
		case "�����":
			CashRebate cr2 = new CashRebate("0.8");
			cs = cr2;
			break;
		}
		return cs;
	}

}
