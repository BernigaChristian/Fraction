//BERNIGA CHRISTIAN 4D 8/10/21
public class Frazione {
	private int num;
	private int den;
	//constructors
	public Frazione(int num,int den) {
		setNum(num);
		setDen(den);
		//special cases
		if(den==0)
			setDen(1);
		if(num<0&&den<0) {
			setNum(num*=-1);
			setDen(den*=-1);
		}
	}
	public Frazione(int num) {
		setNum(num);
		setDen(1);
	}
	public Frazione() {
		setNum(0);
		setDen(1);
	}
	public Frazione(Frazione f) {
		setNum(f.num);
		setDen(f.den);
	}
	//getters
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	//setters
	public void setNum(int num) {
		this.num=num;
	}
	public void setDen(int den) {
		this.den=den;
	}
	//methods
	public boolean equals() {
		return num==den;
	}
	public boolean equals(Frazione f) {
		return num==f.num&&den==f.den;
	}
	public int mcd(Frazione f) {
		int max,tDen=den;
		while(f.den!=0) {
			max=f.den;
			f.den=tDen%f.den;
			tDen=max;
		}
		return tDen;
	}
	public int mcd() {
		int t,tNum=num,tDen=den;
		while(tDen!=0) {
			t=tDen;
			tDen=tNum%tDen;
			tNum=t;
		}
		return tNum;
	}
	public int mcd(int num,int den) {
		int t,tNum=num,tDen=den;
		while(tDen!=0) {
			t=tDen;
			tDen=tNum%tDen;
			tNum=t;
		}
		return tNum;
	}
	public String simplify() {
		int mcd=mcd();
		num/=mcd;
		den/=mcd;
		return toString();
	}
	public String simplify(int num,int den) {
		int mcd=mcd(num,den);
		num/=mcd;
		den/=mcd;
		return toString(num,den);
	}
	public String sum(Frazione f) {
		int mcm=den*f.den,tNum;
		tNum=((mcm/den)*num)+((mcm/f.den)*f.num);
		//return tNum+"/"+mcm;
		return simplify(tNum,mcm);
		
	}
	public String toString() {
		if(this.equals()||den==1)
			return " "+num;
		else
			return num+"/"+den;
	}
	public String toString(int num,int den) {
		if(this.equals()||den==1)
			return " "+num;
		else
			return num+"/"+den;
	}
}
